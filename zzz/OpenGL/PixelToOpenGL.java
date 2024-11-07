package zzz.OpenGL;

import java.util.Scanner;

public class PixelToOpenGL {
    public static void main(String[] args) {
        // Image resolution
        final int width = 1280;
        final int height = 720;

        Scanner scanner = new Scanner(System.in);

        // Get the length of the line in pixels
        System.out.print("Enter the length X : ");
        int lengthInPixelsX = scanner.nextInt();

        System.out.print("Enter the length Y : ");
        int lengthInPixelsY = scanner.nextInt();

        // Convert length from pixels to OpenGL units
        double lengthInOpenGLX = (double) lengthInPixelsX / (width / 2);
        double lengthInOpenGLY = (double) lengthInPixelsY / (height / 2);

        // Output the lengths in OpenGL coordinates
        System.out.println("Length in OpenGL units:");
        System.out.println("x direction: " + lengthInOpenGLX);
        System.out.println("y direction: " + lengthInOpenGLY);

        scanner.close();
    }
}
