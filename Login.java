package com.example.simple;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.paint.Color;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.IOException;
public class Login extends Application {

    Button button;
    Scene scene,scene2;

    public static void main(String[]args){
        launch(args);
    }

    public void start(Stage stage) throws Exception{
        stage.setTitle("Login Page");
        stage.setResizable(true);


        Label label1=new Label("Username:");
        label1.setFont(Font.font("Times New Roman",20));
        TextField input1=new TextField();
        input1.setFont(Font.font("Times New Roman",17));

        Label label2=new Label("Password:");
        label2.setFont(new Font("Times New Roman",20));
        TextField input2=new TextField();
        input2.setFont(new Font("Times New Roman",17));

        Label label3=new Label("Login Status:");
        label3.setFont(Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC,18));

        Label label4=new Label("Welcome to the Login Page");
        label4.setFont(Font.font("Times New Roman",FontWeight.BOLD,22));

        Label label5=new Label("Thank you for logging in!");
        label5.setFont(Font.font("Times New Roman",25));
        label5.setStyle("-fx-text-fill:green");

        Label label6=new Label("1) Select gender:");
        label6.setFont(Font.font("Times New Roman",FontWeight.BOLD,19));

        Label label7=new Label("2) Select your DOB:");
        label7.setFont(Font.font("Times New Roman",FontWeight.BOLD,19));

        DatePicker dob=new DatePicker();


        Button button=new Button("Login");
        button.setFont(new Font("Times New Roman",20));
        button.setStyle("-fx-text-fill:white; -fx-background-color:green");
        button.setOnAction(e->{
            System.out.println("Login button is pressed");

            String username=input1.getText();
            String password=input2.getText();

            String s1="Login Successful";
            String s2="Incorrect username and password";

            if(username.equals("Admin") && password.equals("123")){
                label3.setText("Login Status: " +s1);
                stage.setScene(scene2);
            }
            else{
                label3.setText("Login Status: " +s2);
            }


        });

        Button button2=new Button("Back");
        button2.setFont(Font.font("Times New Roman",18));
        button2.setStyle("-fx-text-fill:white; -fx-background-color:black");
        button2.setOnAction(e->{
            stage.setScene(scene);
            System.out.println("Exit button is pressed");
            //System.exit(0);
        });

        RadioButton male=new RadioButton("Male");
        male.setFont(Font.font("Times New Roman",19));
        RadioButton female=new RadioButton("Female");
        female.setFont(Font.font("Times New Roman",19));

        ToggleGroup group=new ToggleGroup();
        male.setToggleGroup(group);
        female.setToggleGroup(group);

        Image image=new Image("file:C:\\Users\\Adnan\\Desktop\\login.jpeg");
        ImageView imageView=new ImageView(image);
        imageView.setFitWidth(80);
        imageView.setFitHeight(50);
        imageView.setPreserveRatio(true);

        GridPane layout=new GridPane();
        layout.add(label1,1,3);
        layout.add(input1,2,3);
        layout.add(label2,1,4);
        layout.add(input2,2,4);
        layout.add(label4,1,1);
        layout.add(label7,1,7);
        layout.add(dob,1,8);
        layout.add(label6,1,9);
        layout.add(male,1,10);
        layout.add(female,1,11);
        layout.add(button,5,11);
        layout.add(imageView,0,0);
        layout.setPadding(new Insets(50,30,30,10)); // Can pass 1 or 4 parameters
        layout.setAlignment(Pos.BASELINE_LEFT); // Can be RIGHT
        layout.setHgap(15);
        layout.setVgap(20);
       layout.setStyle("-fx-background-color:lightblue");

        GridPane layout2=new GridPane();
        layout2.add(label3,1,0);
        layout2.add(label5,1,1);
        layout2.add(button2,5,3);
        layout2.setHgap(10);
        layout2.setVgap(10);
        layout2.setPadding(new Insets(50,30,30,10));
        layout2.setStyle("-fx-background-color:lightblue");


        scene=new Scene(layout,1000,600);
        scene2=new Scene(layout2,500,300);
        stage.setScene(scene);
        stage.show();

    }




}

