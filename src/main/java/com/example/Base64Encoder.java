package com.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

public class Base64Encoder {

    public static void main(String[] args) throws IOException {
                // Get the current working directory
        String currentDirectory = System.getProperty("user.dir");

                // Construct the full path to the file
        String filePath = currentDirectory + "\\src\\main\\java\\com\\example\\" + "test123.jpg";
        System.out.println(filePath);
         File file = new File(filePath);
        FileInputStream inputStream = new FileInputStream(file);
        byte[] fileContent = new byte[(int) file.length()];
        inputStream.read(fileContent);
        inputStream.close();

        String encodedString = Base64.getEncoder().encodeToString(fileContent);
        System.out.println(encodedString);
        


        byte[] decodedBytes = Base64.getDecoder().decode(encodedString);

        // Specify the file path for the new image
        String outputPath = currentDirectory + "\\src\\main\\java\\com\\example\\image\\"+"NewDecodedImage.jpg";

        // Create a File object for the new image
        File newImage = new File(outputPath);

        // Write the decoded bytes to the new image file
        try (FileOutputStream fos = new FileOutputStream(newImage)) {
            fos.write(decodedBytes);
            System.out.println("Image successfully decoded and saved as " + outputPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}