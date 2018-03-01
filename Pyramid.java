/*
 * File: Pyramid.java
 * ------------------
 * This program is a stub for the Pyramid problem, which draws
 * a brick pyramid.
 */

import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class Pyramid extends GraphicsProgram {

	/*
	 * Setting up all the global variables
	 */
	private static final int BRICK_HEIGHT = 50;
	private static final int BRICK_WIDTH = 50;
	private static final int BRICKS_IN_BASE = 5;
	private int x = (getWidth()/2)-(2*BRICK_WIDTH);
	private int y = 200;
	private int countVariable = 0;


	public void run() {
		// You fill this in 

		for(int i = BRICKS_IN_BASE; i > 0 ; i--) {
			for(int j = i ; j > 0 ; j--) {
				addBlock();
				x = x + BRICK_WIDTH;
				countVariable++;

			}
			x = x - (countVariable * BRICK_WIDTH);
			y = y - BRICK_HEIGHT;
		}
	}

	private void addBlock() {
		GRect brick = new GRect (x , y , BRICK_WIDTH , BRICK_HEIGHT);
		add(brick);
	}

}
