import processing.core.PApplet;

public class Sketch extends PApplet {

    public void settings() {
        size(400, 400);
    }

    public void setup() {

    }

    public void draw() {
        background(200, 0, 0);

        fill(255, 200, 50);
        noStroke();
        ellipse(mouseX, mouseY, 50, 50);
    }
}