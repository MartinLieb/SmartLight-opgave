package hu.hungarian;

import javafx.scene.paint.Color;

import static javafx.scene.paint.Color.BLACK;
import static javafx.scene.paint.Color.DARKGRAY;
import static javafx.scene.paint.Color.WHITESMOKE;

public class SmartLight {

    short lightPercent;
    Color color;


    public SmartLight() {

        System.out.println("Nyt smartlight objekt er lavet");

        color = WHITESMOKE;
        lightPercent = 0;


    }

    public void turnUp(){

        if(lightPercent+20 >=100){
            this.lightPercent = 100;
        }
        else{
            this.lightPercent += 20;
        }
    }

    public void turnDown(){

        if(lightPercent-20 <=0){
            this.lightPercent = 0;
        }
        else{
            this.lightPercent -= 20;
        }
    }

    public String toString(){
        return this.lightPercent + " " + this.getColor();
    }

    public short getLightPercent() {
        return lightPercent;
    }

    public void setLightPercent(short lightPercent) {

        if(lightPercent >=100){
            this.lightPercent = 100;
        }
        else if(lightPercent <=0){
            this.lightPercent = 0;
        }
        else{
            this.lightPercent = lightPercent;
        }
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {

        if(color == BLACK){
            this.color = DARKGRAY;
        }
        else{this.color = color;}
    }
}
