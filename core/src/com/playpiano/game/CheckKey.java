package com.playpiano.game;

public class CheckKey {
	private MiniPiano miniPiano;
	private Audio audio;
	public PracticumBoard board;
	boolean [] switchs = new boolean [13];
	boolean [] isplaying = new boolean [13];
	
	public CheckKey(MiniPiano miniPiano, PracticumBoard board){
		this.miniPiano = miniPiano;
		audio = new Audio();
		this.board = board;
		for(int i = 0; i < 13; i++) {
			isplaying[i] = true;
		}
	}
	
	public boolean [] getSwitch(){
		return switchs;
	}
	
	public void test(){
		switchs = board.getSwitch();
		for (int i = 0; i < 13; i++){
			if (switchs[i] && isplaying[i]){
				if(audio.sound[i].isPlaying())
				{
					audio.sound[i].setPosition(0);
//					audio.sound[i].setVolume(1000000000);
				}
				audio.sound[i].play();
				audio.sound[i].setVolume(1000000000);
				isplaying[i] = false;
			}
			else if (!switchs[i]) {
				//audio.sound[i].pause();
				isplaying[i] = true;
			}
		}
	}
	
	public void update(float delta){
		test();
	}
}
