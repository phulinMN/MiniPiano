package com.playpiano.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;

public class Audio {
	public Music [] sound = new Music [13];
		
	public Audio(){
		sound[0] = Gdx.audio.newMusic(Gdx.files.internal("C.mp3"));
		sound[1] = Gdx.audio.newMusic(Gdx.files.internal("CSh.mp3"));
		sound[2] = Gdx.audio.newMusic(Gdx.files.internal("D.mp3"));
		sound[3] = Gdx.audio.newMusic(Gdx.files.internal("DSh.mp3"));
		sound[4] = Gdx.audio.newMusic(Gdx.files.internal("E.mp3"));
		sound[5] = Gdx.audio.newMusic(Gdx.files.internal("F.mp3"));
		sound[6] = Gdx.audio.newMusic(Gdx.files.internal("FSh.mp3"));
		sound[7] = Gdx.audio.newMusic(Gdx.files.internal("G.mp3"));
		sound[8] = Gdx.audio.newMusic(Gdx.files.internal("GSh.mp3"));
		sound[9] = Gdx.audio.newMusic(Gdx.files.internal("A.mp3"));
		sound[10] = Gdx.audio.newMusic(Gdx.files.internal("ASh.mp3"));
		sound[11] = Gdx.audio.newMusic(Gdx.files.internal("B.mp3"));
		sound[12] = Gdx.audio.newMusic(Gdx.files.internal("CH.mp3"));
		
	}
}
