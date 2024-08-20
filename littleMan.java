import org.code.neighborhood.*;
public class littleMan extends Painter {

  //Takes all paint from a paint bucket
  public void takeAllPaint() {
    while (isOnBucket()) {
      takePaint();
    }
    
  }

  // Moves forward while a Painter object can move
  public void moveFast() {
    while (canMove()) {
      move();
    }
  }
  public void turnRight() {
    turnLeft();
    turnLeft();
    turnLeft();
  }
  // will remove whaever paint is left if its needed
  public void paintToEmpty(String color) {
    while (hasPaint()) {
      paint(color);
      move();
    }
  }

  // builds the blade of the sword (this is my custom loop)
  public void moveMultiple() {
    while (hasPaint()) {
      move();
      paint("blue");
      move();
      paint("blue");
        move();
      paint("blue");
      move();
      paint("blue");
      move();
    }
  }
   public void turnAround() {
    turnLeft();
    turnLeft();
  }
  public void paintARow() {
     setPaint(7);
    paintToEmpty("orange");
      }
    }
