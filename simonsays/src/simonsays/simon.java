package simonsays;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
 
public class simon extends Application {
	private int num = 0;
	
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        Button btn1 = new Button();
        btn1.setText("Click me!");
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                setNum(getNum() + 1);
            }
        });
        
        Button btn2 = new Button();
        btn2.setText("Click me!");
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                setNum(getNum() + 1);
            }
        });
        
        Button btn3 = new Button();
        btn3.setText("Click me!");
        btn3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                setNum(getNum() + 1);
            }
        });
        
        Button btn4 = new Button();
        btn4.setText("Click me!");
        btn4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                setNum(getNum() + 1);
            }
        });
        
        long timeStep = System.nanoTime() + 10000000000L;
        new AnimationTimer() {
        	public void handle(long now) {
        		if(now < timeStep) {
        	        btn1.setText("Click me!");
        		}
        		if(now > timeStep) {
        			btn1.setText(Integer.toString(num));
        		}
        	}
        }.start();
        
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(btn1);
        borderPane.setRight(btn2);
        borderPane.setBottom(btn3);
        borderPane.setLeft(btn4);
    }

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
}