import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);

  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(310, 355, 273);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	// sample code, delete this stuff
    stroke(255);
    background(3,211, 252);
    fill(74, 243, 255);

    fill(0, 0, 0);
    rect(0/6, 280/6, 1000/6, 600/6);
    
    ellipse(310/6, 266/6, 45/6, 45/6);
    fill(0, 0, 0);  

    ellipse(310/6, 266/6, 45/6, 45/6); 
    fill(0, 0, 0);

    ellipse(190/6, 265/6, 45/6, 45/6);
    fill(0, 0,0);  

    ellipse(190/6, 265/6, 45/6, 45/6); 
    fill(235, 228, 228);

    rect(150/6, 145/6, 200/6, 100/6);
    fill(235, 228, 228);
 
    rect(650/6, 0/6, 100/6, 500/6);
    fill(255, 255, 255);

    rect(85/6, 180/6, 65/6, 65/6);
    
    fill(255, 234, 0);
    ellipse(570/6, 0/6, 140/6, 140/6);

    fill(255, 235, 15);
    rect(0/6, 345/6, 700/6, 25/6);
    
    fill(168, 167, 157);
    ellipse(310/6, 266/6, 25/6, 25/6); 
    
    fill(168, 167, 157);
    ellipse(190/6, 265/6, 25/6, 25/6);

    fill(117, 241, 255);
    rect(85/6, 180/6, 35/6, 35/6);

    fill(250, 238, 17);
    rect(85/6, 220/6, 15/6, 25/6);

    fill(237, 2, 2);
    rect(335/6, 215/6, 15/6, 25/6);
  }
  
  // define other methods down here.
}