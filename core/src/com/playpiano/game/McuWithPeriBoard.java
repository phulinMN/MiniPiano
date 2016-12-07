package com.playpiano.game;

import org.usb4java.Device;

public class McuWithPeriBoard extends McuBoard
{
    private static final byte RQ_GET_SWITCH1    = 1;
    private static final byte RQ_GET_SWITCH2    = 2;
    private static final byte RQ_GET_SWITCH3    = 3;
    private static final byte RQ_GET_SWITCH4    = 4;
    private static final byte RQ_GET_SWITCH5    = 5;
    private static final byte RQ_GET_SWITCH6    = 6;
    private static final byte RQ_GET_SWITCH7    = 7;
    private static final byte RQ_GET_SWITCH8    = 8;
    private static final byte RQ_GET_SWITCH9    = 9;
    private static final byte RQ_GET_SWITCH10    = 10;
    private static final byte RQ_GET_SWITCH11    = 11;
    private static final byte RQ_GET_SWITCH12    = 12;
    private static final byte RQ_GET_SWITCH13    = 13;

    public McuWithPeriBoard(Device device) {
		super(device);
	}

  
    public boolean getSwitch1()
    {
        byte[] ret = this.read(RQ_GET_SWITCH1, (short) 0, (short) 0);
        return ret[0] == 1;
    }
    
    public boolean getSwitch2()
    {
        byte[] ret = this.read(RQ_GET_SWITCH2, (short) 0, (short) 0);
        return ret[0] == 1;
    }
    
    public boolean getSwitch3()
    {
        byte[] ret = this.read(RQ_GET_SWITCH3, (short) 0, (short) 0);
        return ret[0] == 1;
    }
    
    public boolean getSwitch4()
    {
        byte[] ret = this.read(RQ_GET_SWITCH4, (short) 0, (short) 0);
        return ret[0] == 1;
    }

    public boolean getSwitch5()
    {
        byte[] ret = this.read(RQ_GET_SWITCH5, (short) 0, (short) 0);
        return ret[0] == 1;
    }
    
    public boolean getSwitch6()
    {
        byte[] ret = this.read(RQ_GET_SWITCH6, (short) 0, (short) 0);
        return ret[0] == 1;
    }
    
    public boolean getSwitch7()
    {
        byte[] ret = this.read(RQ_GET_SWITCH7, (short) 0, (short) 0);
        return ret[0] == 1;
    }
    
    public boolean getSwitch8()
    {
        byte[] ret = this.read(RQ_GET_SWITCH8, (short) 0, (short) 0);
        return ret[0] == 1;
    }
    
    public boolean getSwitch9()
    {
        byte[] ret = this.read(RQ_GET_SWITCH9, (short) 0, (short) 0);
        return ret[0] == 1;
    }
    
    public boolean getSwitch10()
    {
        byte[] ret = this.read(RQ_GET_SWITCH10, (short) 0, (short) 0);
        return ret[0] == 1;
    }
    
    public boolean getSwitch11()
    {
        byte[] ret = this.read(RQ_GET_SWITCH11, (short) 0, (short) 0);
        return ret[0] == 1;
    }
    
    public boolean getSwitch12()
    {
        byte[] ret = this.read(RQ_GET_SWITCH12, (short) 0, (short) 0);
        return ret[0] == 1;
    }
    
    public boolean getSwitch13()
    {
        byte[] ret = this.read(RQ_GET_SWITCH13, (short) 0, (short) 0);
        return ret[0] == 1;
    }
    /**
     * Read and return the light intensity
     * 
     * @return a value between 0-1023; the greater the intensity, the higher the value
     */

}
