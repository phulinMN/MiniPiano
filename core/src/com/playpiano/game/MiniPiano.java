package com.playpiano.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MiniPiano extends Game {
	public SpriteBatch batch;
	public Screen screen;
		
	@Override
	public void create () {
		batch = new SpriteBatch();
		screen = new Screen(this);
		setScreen(screen);
	}

	@Override
	public void render () {
		super.render();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}
	
}
