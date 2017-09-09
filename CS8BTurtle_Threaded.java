/*
 * Name:  Daniel Huang Student  
 * Login: cs8Bwacy 
 * Date:  3/7/2016
 * File:  CS8BTurtle_Threaded.java
 * Sources of Help: PIAZZA & youtube from TA
 * *
 * This program would draw my own login and some other texts with the turtle
 * class, using multiple turtles simultaneously.
 *
 * */

import turtleClasses.*;
import java.awt.Color;
import java.lang.Math;
/*
 * Name:       CS8BTurtle_Threaded class
 * Purpose:    This class inherits methods from Turtle class and is able to
 *             draw some words with multiple threads
 */

public class CS8BTurtle_Threaded extends Turtle implements Runnable {
   private final static int CHAR_WIDTH = 40;
   private final static int CHAR_HEIGHT = 80;
   private final static int PADDING_BETWEEN_CHARS = 40;
   private final static int PADDING_BETWEEN_LINES = 40;
   private final static int CHAR_SPACING = CHAR_WIDTH + PADDING_BETWEEN_CHARS;
   private final static int LINE_SPACING = CHAR_HEIGHT + PADDING_BETWEEN_LINES;

   private final static int START_X_1 = 100; // starting x offset for line 1
   private final static int START_X_2 = 180; // starting x offset for line 2
   private final static int START_X_3 = 260; // starting x offset for line 3
   private final static int START_Y = 90;   // starting y offset

   private final static int PEN_WIDTH = 10;
   private final static Color PEN_COLOR = Color.BLUE;

   private final static int WORLD_WIDTH = 800;
   private final static int WORLD_HEIGHT = 500;
   private final static int angle135=135;  //to avoid hard-coding

   /*
    * Delay between turtle actions (turns, moves) in milliseconds.
    * 1000 = 1 sec.  so  200 = 0.2 sec.
    */
   private final static int DELAY = 300;


   //some  non-static instance variables for the threaded constructor    
   private char ch;
   private int  x;
   private int  y;
   /* 
    * Name:       CS8BTurtle_Threaded   
    * Purpose:    It creates a turtle and a new thread. And then start 
    *             the thread(also calls run() automatically)
    * Parameters: World w, char ch, int x, int y, int delay
    */
   public  CS8BTurtle_Threaded(World w, char ch, int x, int y, int delay){
      super(w, delay);  // Invoke superclass's ctor to create this turtle
      // on World w with delay of each turtle's action.
      this.ch=ch;                 
      this.x=x;
      this.y=y;


      this.setPenWidth(PEN_WIDTH);
      this.setPenColor(PEN_COLOR);     




      new Thread(this).start();//the start() automatically calls the run() 
      //for this thread

   }    

   /*
    * Name:       run
    * Purpose:    it calls the corresponding draw method depending on what 
    *             character it detects
    * Parameters: none
    * Return:     void
    * */

   public void run() {
      //use switch to detect the input character
      switch(ch) {
         case 'C': this.drawC(x,y); break; //call the draw method
         case 'S': this.drawS(x,y); break;
         case '8': this.draw8(x,y); break;
         case 'B': this.drawB(x,y); break;
         case 'W': this.drawW(x,y); break;
         case 'A': this.drawA(x,y); break;
         case 'Y': this.drawY(x,y); break;
         case 'I': this.drawI(x,y); break;
         case 'N': this.drawN(x,y); break;
         case 'T': this.drawT(x,y); break;
         case 'E': this.drawE(x,y); break;
         case 'R': this.drawR(x,y); break;
         case '2': this.draw2(x,y); break;
         case '0': this.draw0(x,y); break;
         case '1': this.draw1(x,y); break;
         case '6': this.draw6(x,y); break;

      }
   }

   /*
    * Name:       main
    * Purpose:    the main thread that creates multiple turtle threads 
    *             and executes the draw methods at once
    * Parameters: String [] args
    * Return:     void
    * */

   public static void main(String [] args) {
      int startX1 = START_X_1,  // starting x offset for line 1
          startX2 = START_X_2,  // starting x offset for line 2
          startX3 = START_X_3;  // starting x offset for line 3
      int startY  = START_Y;    // starting y offset



      int x=startX1;
      int y=startY;
      World w = new World(WORLD_WIDTH, WORLD_HEIGHT);


      new CS8BTurtle_Threaded(w, 'C', x, y, DELAY); 
      // This turtle draws a C char

      x +=CHAR_SPACING;    //update the starting x for the next character
      new CS8BTurtle_Threaded(w, 'S', x, y, DELAY); 
      // This turtle draws a S char
      x +=CHAR_SPACING;
      new CS8BTurtle_Threaded(w, '8', x, y, DELAY); 
      // This turtle draws a 8 char
      x +=CHAR_SPACING;
      new CS8BTurtle_Threaded(w, 'B', x, y, DELAY); 
      // This turtle draws a B char
      x +=CHAR_SPACING;
      new CS8BTurtle_Threaded(w, 'W', x, y, DELAY); 
      // This turtle draws a W char
      x +=CHAR_SPACING;
      new CS8BTurtle_Threaded(w, 'A', x, y, DELAY); 
      // This turtle draws a A char
      x +=CHAR_SPACING;
      new CS8BTurtle_Threaded(w, 'C', x, y, DELAY); 
      // This turtle draws a C char
      x +=CHAR_SPACING;
      new CS8BTurtle_Threaded(w, 'Y', x, y, DELAY); 
      // This turtle draws a Y char

      y +=LINE_SPACING; //change to the next line by updating the variable y
      x=startX2;
      new CS8BTurtle_Threaded(w, 'W', x, y, DELAY); 
      // This turtle draws a W char
      x +=CHAR_SPACING;
      new CS8BTurtle_Threaded(w, 'I', x, y, DELAY); 
      // This turtle draws a I char
      x +=CHAR_SPACING;
      new CS8BTurtle_Threaded(w, 'N', x, y, DELAY); 
      // This turtle draws a N char
      x +=CHAR_SPACING;
      new CS8BTurtle_Threaded(w, 'T', x, y, DELAY); 
      // This turtle draws a T char
      x +=CHAR_SPACING;
      new CS8BTurtle_Threaded(w, 'E', x, y, DELAY); 
      // This turtle draws a E char
      x +=CHAR_SPACING;
      new CS8BTurtle_Threaded(w, 'R', x, y, DELAY); 
      // This turtle draws a R char

      y +=LINE_SPACING; //change to the third(last line)
      x=startX3;
      new CS8BTurtle_Threaded(w, '2', x, y, DELAY); 
      // This turtle draws a 2 char
      x +=CHAR_SPACING;
      new CS8BTurtle_Threaded(w, '0', x, y, DELAY); 
      // This turtle draws a 0 char
      x +=CHAR_SPACING;
      new CS8BTurtle_Threaded(w, '1', x, y, DELAY); 
      // This turtle draws a 1 char
      x +=CHAR_SPACING;
      new CS8BTurtle_Threaded(w, '6', x, y, DELAY); 
      // This turtle draws a 6 char




   }


   /*
    * Name:       drawC
    * Purpose:    This method draws the letter C with the turtle 
    * Parameters: int x; int y,they represents the top left corner of the
    *             letter 
    * Return:     void
    * */

   private void drawC(int x, int y) {
      penUp();
      moveTo(x, y);  // always start in upper left corner of this char block
      turnToFace(getXPos()+1 , getYPos()); // face right
      penDown();
      forward(CHAR_WIDTH);
      backward(CHAR_WIDTH);
      turnRight();
      forward(CHAR_HEIGHT);
      turnLeft();
      forward(CHAR_WIDTH);
   }

   /*
    * Name:       drawS
    * Purpose:    This method draws the letter S with the turtle 
    * Parameters: int x; int y,they represents the top left corner of the
    *             letter 
    * Return:     void
    * */

   private void drawS(int x, int y) {
      penUp();
      moveTo(x, y); // always start in upper left corner of this char block
      turnToFace(getXPos() + 1, getYPos()); // face right
      penDown();
      forward(CHAR_WIDTH);
      backward(CHAR_WIDTH);
      turnRight();
      forward(CHAR_HEIGHT/2);
      turnLeft();
      forward(CHAR_WIDTH);
      turnRight();
      forward(CHAR_WIDTH);
      turnRight();
      forward(CHAR_WIDTH); 



   }

   /*
    * Name:       drawE
    * Purpose:    This method draws the letter E with the turtle 
    * Parameters: int x; int y,they represents the top left corner of the
    *             letter 
    * Return:     void
    * */

   private void drawE(int x, int y) {
      penUp();
      moveTo(x, y); // always start in upper left corner of this char block
      turnToFace(getXPos() + 1, getYPos()); // face right
      penDown();
      forward(CHAR_WIDTH);
      backward(CHAR_WIDTH);
      turnRight();
      forward(CHAR_HEIGHT/2);
      turnLeft();
      forward(CHAR_WIDTH);
      backward(CHAR_WIDTH);
      turnRight();
      forward(CHAR_WIDTH);
      turnLeft();
      forward(CHAR_WIDTH);


   }
   /*
    * Name:       draw8
    * Purpose:    This method draws the number 8 with the turtle 
    * Parameters: int x; int y,they represents the top left corner of the
    *             character 
    * Return:     void
    * */
   private void draw8(int x, int y) {
      penUp();
      moveTo(x, y); // always start in upper left corner of this char block
      turnToFace(getXPos() + 1, getYPos()); // face right
      penDown();
      forward(CHAR_WIDTH);
      backward(CHAR_WIDTH);
      turnRight();
      forward(CHAR_HEIGHT/2);
      turnLeft();
      forward(CHAR_WIDTH);
      backward(CHAR_WIDTH);
      turnRight();
      forward(CHAR_WIDTH);
      turnLeft();
      forward(CHAR_WIDTH);
      turnLeft();
      forward(CHAR_HEIGHT);


   }


   /*
    * Name:       drawB
    * Purpose:    This method draws the letter B with the turtle 
    * Parameters: int x; int y,they represents the top left corner of the
    *             letter 
    * Return:     void
    * */

   private void drawB(int x, int y) {
      penUp();
      moveTo(x, y); // always start in upper left corner of this char block
      turnToFace(getXPos() + 1, getYPos()); // face right
      penDown();
      forward(CHAR_WIDTH);

      turn(angle135);
      double root=Math.sqrt(2);
      int intRoot=(int)(root*CHAR_WIDTH); //cast the double back to int
      forward(intRoot);
      turn(angle135); //use the instance variable instead of hard-coding 
      // the number 135
      forward(CHAR_WIDTH);
      backward(CHAR_WIDTH);
      turn(angle135);
      forward(intRoot);
      turnToFace(getXPos()-1,getYPos()); //face left
      forward(CHAR_WIDTH);
      turnRight();
      forward(CHAR_WIDTH);



   }
   /*
    * Name:       drawW
    * Purpose:    This method draws the letter W with the turtle 
    * Parameters: int x; int y,they represents the top left corner of the
    *             letter 
    * Return:     void
    * */

   private void drawW(int x, int y) {
      penUp();
      moveTo(x, y); // always start in upper left corner of this char block
      turnToFace(getXPos()+CHAR_WIDTH/4,getYPos()+CHAR_HEIGHT);
      penDown();
      moveTo(x+CHAR_WIDTH/4,y+CHAR_HEIGHT);
      int intRoot=(int)(Math.sqrt(3)*CHAR_WIDTH/4);
      turnToFace(getXPos()+CHAR_WIDTH/4,getYPos()-intRoot);
      moveTo(x+CHAR_WIDTH/2,y+CHAR_HEIGHT-intRoot);
      turnToFace(getXPos()+CHAR_WIDTH/4,getYPos()+intRoot);
      moveTo(x+CHAR_WIDTH*3/4,y+CHAR_HEIGHT);
      turnToFace(getXPos()+CHAR_WIDTH/4,getYPos()+CHAR_HEIGHT);
      moveTo(x+CHAR_WIDTH,y);

   }
   /*
    * Name:       drawA
    * Purpose:    This method draws the letter A with the turtle 
    * Parameters: int x; int y,they represents the top left corner of the
    *             letter 
    * Return:     void
    * */
   private void drawA(int x, int y) {
      penUp();
      moveTo(x, y); // always start in upper left corner of this char block
      turnToFace(getXPos()+CHAR_WIDTH/2,getYPos()-CHAR_HEIGHT);

      moveTo(x,y+CHAR_HEIGHT);
      penDown();
      int intRoot=(int)(Math.sqrt(26)*CHAR_WIDTH/2);
      moveTo(x+CHAR_WIDTH/2,y);
      turnToFace(getXPos()+CHAR_WIDTH/2,getYPos()+CHAR_HEIGHT);
      moveTo(x+CHAR_WIDTH,y+CHAR_HEIGHT);
      int estimate1=30; // to avoid hard-coding
      backward(estimate1);
      turnToFace(getXPos()-1,getYPos()); //face left
      int estimate2=22;
      forward(estimate2);
   }
   /*
    * Name:       drawY
    * Purpose:    This method draws the letter Y with the turtle 
    * Parameters: int x; int y,they represents the top left corner of the
    *             letter 
    * Return:     void
    * */

   private void drawY(int x, int y) {
      penUp();
      moveTo(x, y); // always start in upper left corner of this char block
      penDown();
      turnToFace(getXPos()+CHAR_WIDTH/2,getYPos()+CHAR_WIDTH*3/4);
      moveTo(x+CHAR_WIDTH/2,y+CHAR_WIDTH*3/4);
      turnToFace(getXPos()+CHAR_WIDTH/2,getYPos()-CHAR_WIDTH*3/4);
      moveTo(x+CHAR_WIDTH,y);

      turnToFace(getXPos()-CHAR_WIDTH/2,getYPos()+CHAR_WIDTH*3/4);
      moveTo(x+CHAR_WIDTH/2,y+CHAR_WIDTH*3/4);

      turnToFace(getXPos(),getYPos()+1); //face down
      int estimate=50;
      forward(estimate); //to avoid hard-coding



   }
   /*
    * Name:       drawI
    * Purpose:    This method draws the letter I with the turtle 
    * Parameters: int x; int y,they represents the top left corner of the
    *             letter 
    * Return:     void
    * */

   private void drawI(int x, int y) {
      penUp();
      moveTo(x,y);
      penDown();
      turnToFace(getXPos()+1,getYPos()); //face right

      forward(CHAR_WIDTH);
      backward(CHAR_WIDTH/2);
      turnRight();
      forward(CHAR_HEIGHT);
      turnToFace(getXPos()-1,getYPos()); //face left
      forward(CHAR_WIDTH/2);
      backward(CHAR_WIDTH);


   }
   /*
    * Name:       drawN
    * Purpose:    This method draws the letter N with the turtle 
    * Parameters: int x; int y,they represents the top left corner of the
    *             letter 
    * Return:     void
    * */

   private void drawN(int x, int y) {
      penUp();
      moveTo(x,y);
      penDown();
      turnToFace(getXPos(),getYPos()+1); //face down

      forward(CHAR_HEIGHT);
      backward(CHAR_HEIGHT);
      turnToFace(getXPos()+CHAR_WIDTH,getYPos()+CHAR_HEIGHT); 
      moveTo(x+CHAR_WIDTH, y+CHAR_HEIGHT);
      turnToFace(getXPos(),getYPos()-1); //face up
      forward(CHAR_HEIGHT);



   }
   /*
    * Name:       drawT
    * Purpose:    This method draws the letter T with the turtle 
    * Parameters: int x; int y,they represents the top left corner of the
    *             letter 
    * Return:     void
    * */

   private void drawT(int x, int y) {
      penUp();
      moveTo(x,y);
      penDown();
      turnToFace(getXPos()+1,getYPos()); //face right

      forward(CHAR_WIDTH);
      backward(CHAR_WIDTH/2);
      turnRight();
      forward(CHAR_HEIGHT);



   }
   /*
    * Name:       drawR
    * Purpose:    This method draws the letter R with the turtle 
    * Parameters: int x; int y,they represents the top left corner of the
    *             letter 
    * Return:     void
    * */

   private void drawR(int x, int y) {
      penUp();
      moveTo(x,y);
      penDown();
      turnToFace(getXPos()+1,getYPos()); //face right

      forward(CHAR_WIDTH);
      turnRight();
      forward(CHAR_WIDTH);
      turnRight();
      forward(CHAR_WIDTH);
      turnRight();
      forward(CHAR_WIDTH);
      turnToFace(getXPos(),getYPos()+1); //face down
      forward(CHAR_HEIGHT);
      backward(CHAR_HEIGHT/2);
      turnToFace(getXPos()+CHAR_WIDTH,getYPos()+CHAR_WIDTH);
      moveTo(x+CHAR_WIDTH,y+CHAR_HEIGHT);
   }
   /*
    * Name:       draw2
    * Purpose:    This method draws the number 2 with the turtle 
    * Parameters: int x; int y,they represents the top left corner of the
    *             number
    * Return:     void
    * */
   private void draw2(int x, int y) {
      penUp();
      moveTo(x,y);
      penDown();
      turnToFace(getXPos()+1,getYPos()); //face right

      forward(CHAR_WIDTH);
      turnRight();
      forward(CHAR_WIDTH);
      turnRight();
      forward(CHAR_WIDTH);
      turnLeft();
      forward(CHAR_WIDTH);
      turnLeft();
      forward(CHAR_WIDTH);

   }
   /*
    * Name:       draw0
    * Purpose:    This method draws the number 0 with the turtle 
    * Parameters: int x; int y,they represents the top left corner of the
    *             number
    * Return:     void
    * */
   private void draw0(int x, int y) {
      penUp();
      moveTo(x,y);
      penDown();
      turnToFace(getXPos()+1,getYPos()); //face right

      forward(CHAR_WIDTH);
      turnRight();
      forward(CHAR_HEIGHT);
      turnRight();
      forward(CHAR_WIDTH);
      turnRight();
      forward(CHAR_HEIGHT);
      turnToFace(getXPos()+CHAR_WIDTH,getYPos()+CHAR_HEIGHT);
      moveTo(x+CHAR_WIDTH,y+CHAR_HEIGHT);
   }
   /*
    * Name:       draw1
    * Purpose:    This method draws the number 1 with the turtle 
    * Parameters: int x; int y,they represents the top left corner of the
    *             number
    * Return:     void
    * */

   private void draw1(int x, int y) {
      penUp();
      moveTo(x,y);
      moveTo(x+CHAR_WIDTH/2,y);
      penDown();
      turnToFace(getXPos()-CHAR_WIDTH/4,getYPos()+CHAR_WIDTH/2);
      int estimate1=25; //the estimate variable is,as its name suggests
      //the estimated value after some experimenting
      //to make the character "look" like a 1
      forward(estimate1);
      turnToFace(getXPos(),getYPos()+1); //face down
      moveTo(x+CHAR_WIDTH/2,y);
      forward(CHAR_HEIGHT);
      turnRight();
      forward(CHAR_WIDTH/2);
      backward(CHAR_WIDTH);

   }

   /*
    * Name:       draw6
    * Purpose:    This method draws the number 6 with the turtle 
    * Parameters: int x; int y,they represents the top left corner of the
    *             number
    * Return:     void
    * */


   private void draw6(int x, int y) {
      penUp();
      moveTo(x,y);
      penDown();
      turnToFace(getXPos()+1,getYPos()); //face right

      forward(CHAR_WIDTH);
      backward(CHAR_WIDTH);

      turnRight();
      forward(CHAR_HEIGHT);
      turnLeft();
      forward(CHAR_WIDTH);
      turnLeft();
      forward(CHAR_HEIGHT/2);
      turnLeft();

      forward(CHAR_WIDTH);


   }







}  // End of public class CS8BTurtle_Threaded extends Turtle



