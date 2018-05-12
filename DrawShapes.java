/*
 * Ethan Pulido
 * CS/IS 139
 * JavaFx

*/
import javafx.application.Application;
import javafx.scene.transform.Scale;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Shape;
import javafx.scene.text.*;
import javafx.scene.effect.Reflection; 
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.geometry.Pos;

public class DrawShapes extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Create a circle and set its properties
    Pane pane = new Pane();
    Circle circle = new Circle(); //head
    Scale scale = new Scale();
    
    circle.setCenterX(100);
    circle.setCenterY(100);
    circle.setRadius(75);
    circle.setStroke(Color.BLACK);
    circle.setStrokeWidth(4.0);
    circle.setFill(Color.WHITE);
    circle.getTransforms().addAll(scale);
    
    Circle circ1 = new Circle(); // left eye
    
    circ1.setCenterX(70);
    circ1.setCenterY(70);
    circ1.setRadius(5);
    circ1.setStroke(Color.BROWN);
    circ1.setStrokeWidth(2.0);
    circ1.setFill(Color.BROWN);
    circ1.getTransforms().addAll(scale);
    
    Circle circ2 = new Circle(); //right eye
    
    circ2.setCenterX(130);
    circ2.setCenterY(70);
    circ2.setRadius(5);
    circ2.setStroke(Color.BROWN);
    circ2.setStrokeWidth(2.0);
    circ2.setFill(Color.BROWN);
    circ2.getTransforms().addAll(scale);
    
    Rectangle r = new Rectangle(); //hair top
    r.setX(43);
    r.setY(22);
    r.setWidth(110);
    r.setHeight(20);
    r.setArcWidth(5);
    r.setArcHeight(5);
    r.setFill(Color.BLACK);
    r.getTransforms().addAll(scale);
    
    Rectangle r1 = new Rectangle(); //glasses left eye
    r1.setX(117);
    r1.setY(58);
    r1.setWidth(25);
    r1.setHeight(25);
    r1.setArcWidth(5);
    r1.setArcHeight(5);
    r1.setStroke(Color.BLACK);
    r1.setStrokeWidth(4.0);
    r1.setFill(Color.WHITE);
    r1.getTransforms().addAll(scale);
    
    Rectangle r3 = new Rectangle(); //glasses left ear
    r3.setX(30);
    r3.setY(58);
    r3.setWidth(26);
    r3.setHeight(11);
    r3.setArcWidth(5);
    r3.setArcHeight(5);
    r3.setStroke(Color.BLACK);
    r3.setStrokeWidth(2);
    r3.setFill(Color.BLACK);
    r3.getTransforms().addAll(scale);
    
    Rectangle r2 = new Rectangle(); //glasses right eye
    r2.setX(57);
    r2.setY(58);
    r2.setWidth(25);
    r2.setHeight(25);
    r2.setArcWidth(5);
    r2.setArcHeight(5);
    r2.setStroke(Color.BLACK);
    r2.setStrokeWidth(4.0);
    r2.setFill(Color.WHITE);
    r2.getTransforms().addAll(scale);
    
    Rectangle r5 = new Rectangle(); //glasses right ear
    r5.setX(85);
    r5.setY(58);
    r5.setWidth(30);
    r5.setHeight(8);
    r5.setArcWidth(2);
    r5.setArcHeight(2);
    r5.setStroke(Color.BLACK);
    r5.setStrokeWidth(2);
    r5.setFill(Color.BLACK);
    r5.getTransforms().addAll(scale);
   
    Rectangle r4 = new Rectangle(); //glasses right ear
    r4.setX(144);
    r4.setY(58);
    r4.setWidth(26);
    r4.setHeight(11);
    r4.setArcWidth(5);
    r4.setArcHeight(5);
    r4.setStroke(Color.BLACK);
    r4.setStrokeWidth(2);
    r4.setFill(Color.BLACK);
    r4.getTransforms().addAll(scale);
    
    Ellipse ellipse = new Ellipse(); //mouth
    ellipse.setCenterX(102);
    ellipse.setCenterY(130);
    ellipse.setRadiusX(10);
    ellipse.setRadiusY(5);
    ellipse.setStroke(Color.BLACK);
    ellipse.setStrokeWidth(2);
    ellipse.setFill(Color.BLACK);
    
    Ellipse ellipse1 = new Ellipse(); //speech bubble
    ellipse1.setCenterX(260);
    ellipse1.setCenterY(50);
    ellipse1.setRadiusX(90);
    ellipse1.setRadiusY(40);
    ellipse1.setStroke(Color.BLACK);
    ellipse1.setStrokeWidth(2);
    ellipse1.setFill(Color.WHITE);
    
    Text t1 = new Text(205, 150, "-Zareh Gorjian\n5/5/18"); //THE Legend
    t1.setFont(Font.font(null, FontWeight.BOLD, 15));
    t1.setFill(Color.GREEN);
    
  
    Text t = new Text();  //the truth
    
    t.setX(205);
    t.setY(45);
    t.setCache(true);
    t.setText("C++ is better\n than java");
    t.setFill(Color.RED);
    t.setFont(Font.font(null, FontWeight.BOLD, 20));
    
    Rectangle r6 = new Rectangle(); //mustache
    r6.setX(80);
    r6.setY(110);
    r6.setWidth(40);
    r6.setHeight(8);
    r6.setArcWidth(1);
    r6.setArcHeight(5);
    r6.setFill(Color.BLACK);
    r6.getTransforms().addAll(scale);
    
    Rectangle r7 = new Rectangle(); //mustache left
    r7.setX(80);
    r7.setY(110);
    r7.setWidth(8);
    r7.setHeight(40);
    r7.setArcWidth(1);
    r7.setArcHeight(5);
    r7.setFill(Color.BLACK);
    r7.getTransforms().addAll(scale);
    
    Rectangle r8 = new Rectangle(); //mustache right
    r8.setX(115);
    r8.setY(110);
    r8.setWidth(8);
    r8.setHeight(40);
    r8.setArcWidth(1);
    r8.setArcHeight(5);
    r8.setFill(Color.BLACK);
    r8.getTransforms().addAll(scale);
    
    Rectangle r9 = new Rectangle(); //mustache bottom
    r9.setX(80);
    r9.setY(142);
    r9.setWidth(40);
    r9.setHeight(8);
    r9.setArcWidth(1);
    r9.setArcHeight(5);
    r9.setFill(Color.BLACK);
    r9.getTransforms().addAll(scale);
    
    Ellipse ellipse2 = new Ellipse(); //bellow mustache
    ellipse2.setCenterX(102);
    ellipse2.setCenterY(150);
    ellipse2.setRadiusX(22);
    ellipse2.setRadiusY(10);
    ellipse2.setStroke(Color.BLACK);
    ellipse2.setStrokeWidth(2);
    ellipse2.setFill(Color.BLACK);
  
    // Create a pane to hold the circle 

    pane.getChildren().add(circle);
    pane.getChildren().add(r1);//glasses left eye
    pane.getChildren().add(r2); //glasses right eye
    pane.getChildren().add(r3);//left ear
    pane.getChildren().add(r4);//right ear
    pane.getChildren().add(r5);//glasses mid eye
    pane.getChildren().add(r6);//mustache
    pane.getChildren().add(r7);//mustache left
    pane.getChildren().add(r8);//mustache right
    pane.getChildren().add(r9);//mustache bottom
    pane.getChildren().add(circ1);//left eye
    pane.getChildren().add(circ2); //right eye
    pane.getChildren().add(ellipse2);//bellow mustache
    pane.getChildren().add(ellipse);//mouth
    pane.getChildren().add(ellipse1);//speech bubble
    pane.getChildren().add(t);//c++ better
    pane.getChildren().add(t1);
    pane.getChildren().add(r);
    
    
        
    // Create a scene and place it in the stage
    Scene scene = new Scene(pane, 500, 200);
    primaryStage.setTitle("Draw Shapes"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }
  
  void DrawMyStuff(Pane myPane, Shape myShape)
  {
	  myPane.getChildren().add(myShape);
  }
  
  
  
  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
  
  
}