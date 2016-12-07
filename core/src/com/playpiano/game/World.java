package com.playpiano.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class World {
	private MiniPiano miniPiano;
	private Texture WhKey;
	private Texture BKey;
	private Texture BTran;
	private Texture WhTran;
	public CheckKey check;
	public PracticumBoard board;
	int x = 0;
	boolean [] isPress;
	int [] pin = {0,2,4,5,7,9,11,12,1,3,6,8,10};
	int [] pos = {64, 164, 344, 444, 544};
	
	public World(MiniPiano miniPiano){
		this.miniPiano = miniPiano;
		WhKey = new Texture("whKey.png");
		WhTran = new Texture("WhKeyT.png");
		BTran = new Texture("bKeyT.png");
		BKey = new Texture("bKey.png");
		board = new PracticumBoard();
		check = new CheckKey(miniPiano, board);
		isPress = check.getSwitch();
	}
	
	public void render(float delta) {
		SpriteBatch batch = miniPiano.batch;
        batch.begin();
        for(int i = 0; i < 8; i++) {
        	x = i*94;
        	if (isPress[pin[i]]){
        		batch.draw(WhTran, x, 0);
        	}
        	else{
        		batch.draw(WhKey, x, 0);
        	}
        }
        for(int i = 8; i < 13; i++){
        	if (isPress[pin[i]]){
        		batch.draw(BTran, pos[i-8], 175);
        	}
        	else{
        		batch.draw(BKey, pos[i-8], 175);
        	}
        }
        batch.end();
        update(delta);
	}
	
	public void update (float delta) {
		check.update(delta);
		isPress = check.getSwitch();
	}
}
