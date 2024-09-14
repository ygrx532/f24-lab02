package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Rectangle;
import edu.cmu.cs.cs214.lab02.shapes.Shape;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2, 3);//Use shape interface to encapusulate

        Renderer renderer = new Renderer(rectangle);

        renderer.draw();
    }
}
