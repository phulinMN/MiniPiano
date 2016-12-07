package com.playpiano.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Screen extends ScreenAdapter{
	private MiniPiano miniPiano;
	private World world;
		
	public Screen(MiniPiano miniPiano){
		this.miniPiano = miniPiano;
		world = new World(miniPiano);
	}
	
	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
//		SpriteBatch batch = miniPiano.batch;
		world.render(delta);
	}
}
