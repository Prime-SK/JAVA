package zzz.OpenGL;

import java.util.Scanner;

public class ImageToOpenGL {
    public static void main(String[] args) {
        // Image resolution
        final int width = 1280;
        final int height = 720;

        Scanner scanner = new Scanner(System.in);

        // Get the image coordinates from the user
        System.out.print("Enter the x coordinate : ");
        int x_img = scanner.nextInt();

        System.out.print("Enter the y coordinate : ");
        int y_img = scanner.nextInt();

        // Convert image coordinates to OpenGL coordinates
        double x_gl = (double) x_img / (width / 2) - 1;
        double y_gl = 1 - (double) y_img / (height / 2);

        // Output the OpenGL coordinates
        System.out.println("OpenGL Coordinates:");
        System.out.println("x: " + x_gl);
        System.out.println("y: " + y_gl);

        scanner.close();
    }
}

