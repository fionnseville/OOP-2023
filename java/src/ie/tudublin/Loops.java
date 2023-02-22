package ie.tudublin;

import processing.core.PApplet;

public class Loops extends PApplet {

	int mode = 0;
	int color = 0;

	public void settings() {
		size(1000, 1000);
		//fullScreen(SPAN);
	}

	public void setup() {
		colorMode(HSB);
	}

	public void keyPressed() {

		mode = key - '0';
		println(mode);
	}

	float off = 0;

	public void draw() {
		background(0);
		fill(255);
		noStroke();
		//rect(250, 250, 200, 100);

		switch (mode) {
			case 0:
				int numCircles = (int) max(1, mouseX / 50.0f);
				float d = width / numCircles;
				for (int j = 0; j < numCircles; j++) {
					for (int i = 0; i < numCircles; i++) {
						float x = (d * 0.5f) + (d * i);
						float y = (d * 0.5f) + (d * j);
						float c = ((i + j) / ((numCircles - 1) * 2.0f)) * 255.0f;
						fill((c + off) % 256, 255, 255);
						circle(x, y, d);
					}
				}
				off += (mouseY / 50.0f);
				break;
			case 1:
				if (mouseX>width/4 &&mouseX <width/2) {
					fill(255, 102, 200);
					rect(width/4,0,width/4,height);
					
				}
				else if(mouseX>width/2 &&mouseX<width*(0.75)){
					rect(width/2,0,width/4,height);
				}
				/*else if(mouseX>width*(0.75) &&mouseX<width){
					rect(width/4 *(3),0,width/4,height);
				}*/
				break;
			case 2:
				if (mouseX>width/4 &&mouseX <width/2 && mouseY<height/2) {
					fill(255, 102, 200);
					rect(width/4,0,width/4,height/2);
					
				}
				else if (mouseX>width/4 &&mouseX <width/2 && mouseY>height/2) {
					fill(255, 102, 200);
					rect(width/4,height/2,width/4,height/2);
				}
				else if(mouseX>width/2 &&mouseX<width*(0.75) && mouseY <height/2){
					fill(234,123,321);
					rect(width/2,0,width/4,height/2);
				}
				else if(mouseX>width/2 &&mouseX<width*(0.75) && mouseY >height/2){
					fill(234,123,321);
					rect(width/2,height/2,width/4,height/2);
				}
				break;

			case 3:
				if( mouseX>300 && mouseX<650 &&mouseY >350 &&mouseY<600){
					//fill(255,0,0);
					rect(300,350,350,250);
				}
				else{
					fill(0,255,255);
					rect(300,350,350,250);
					
				}
				break;
			case 4:
				for(int i = 0; i < 20; i++)
				{
					fill(color + (i*35),100,200);
					rect(i*(width/10), i*(height/10), width/10, height/10);
				}
				break;
			case 5:
				noStroke();
				background(0);
				//fill(255);
				for(int i = 0; i < 10; i++)
				{
					fill(color + (i*25),200,300);
					rect(i*(width/10), 0, width/10, height);
				}
				break;
			default:
				break;
		}

	}
}
