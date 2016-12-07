package com.playpiano.game;
import org.usb4java.Device;
import com.badlogic.gdx.utils.TimeUtils;


public class PracticumBoard
{
	int count = 0;
	long refreshRate = 500;
	McuWithPeriBoard peri;
	boolean [] sw = new boolean [13];
	
	public PracticumBoard(){
		System.out.println("Test");
		McuBoard.initUsb();
		try
        {
        	Device[] devices = McuBoard.findBoards();
        	
        	if (devices.length == 0) {
                System.out.format("** Practicum board not found **\n");
                return;
        	}
        	else {
                System.out.format("** Found %d practicum board(s) **\n", devices.length);
        	}
            peri = new McuWithPeriBoard(devices[0]);

            System.out.format("** Practicum board found **\n");
            System.out.format("** Manufacturer: %s\n", peri.getManufacturer());
            System.out.format("** Product: %s\n", peri.getProduct());          
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
	}
	
	public boolean [] getSwitch() {
		sw[0] = peri.getSwitch1();
        sw[1] = peri.getSwitch2();
        sw[2] = peri.getSwitch3();
        sw[3] = peri.getSwitch4();
        sw[4] = peri.getSwitch5();
        sw[5] = peri.getSwitch6();
        sw[6] = peri.getSwitch7();
        sw[7] = peri.getSwitch8();
        sw[8] = peri.getSwitch9();
        sw[9] = peri.getSwitch10();
        sw[10] = peri.getSwitch11();
        sw[11] = peri.getSwitch12();
        sw[12] = peri.getSwitch13();
		return sw;
	}
}
