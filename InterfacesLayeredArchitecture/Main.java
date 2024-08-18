package InterfacesLayeredArchitecture;

import java.io.*;
public class Main {
    public static void main(String[] args) {
        try {
            Circle circle = new Circle(5.0);
            circle.setId(1);
            System.out.println("Circle ID: " + circle.getId());
            System.out.println("Circle Diameter: " + circle.getDiameter());
            System.out.println("Circle Area: " + circle.getArea());
            System.out.println("Circle Circumference: " + circle.getCircumference());

            Circle copiedCircle = new Circle(circle);
            System.out.println("\nCopied Circle ID: " + copiedCircle.getId());
            System.out.println("Copied Circle Diameter: " + copiedCircle.getDiameter());
            System.out.println("Copied Circle Area: " + copiedCircle.getArea());
            System.out.println("Copied Circle Circumference: " + copiedCircle.getCircumference());

            Rectangle rectangle = new Rectangle(4.0, 7.0);
            rectangle.setId(2);
            System.out.println("\nRectangle ID: " + rectangle.getId());
            System.out.println("Rectangle Area: " + rectangle.getArea());
            System.out.println("Rectangle Circumference: " + rectangle.getCircumference());

            Line line = new Line(10.0);
            line.setId(3);
            System.out.println("\nLine ID: " + line.getId());
            System.out.println("Line Length: " + line.getLength());

            // Serialization
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("shapes.ser"));
            out.writeObject(circle);
            out.writeObject(rectangle);
            out.writeObject(line);
            out.close();

            // Deserialization
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("shapes.ser"));
            Circle deserializedCircle = (Circle) in.readObject();
            Rectangle deserializedRectangle = (Rectangle) in.readObject();
            Line deserializedLine = (Line) in.readObject();
            in.close();

            System.out.println("\nDeserialized Circle ID: " + deserializedCircle.getId());
            System.out.println("Deserialized Rectangle ID: " + deserializedRectangle.getId());
            System.out.println("Deserialized Line ID: " + deserializedLine.getId());

        } catch(IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}