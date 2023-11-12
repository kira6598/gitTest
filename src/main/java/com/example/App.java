package com.example;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import org.bson.types.Binary;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;

public class App {
    public static void main(String[] args) {
        // MongoDB connection string
        String connectionString = "mongodb://localhost:27017";

        // Database and collection names
        String databaseName = "mydb";
        String collectionName = "Picture";
        try {
            System.out.println("hello");
        Path imagePath = Paths.get("./image/test123.jpg");
        byte[] pictureBinary = Files.readAllBytes(imagePath);
        String base64Encoded = Base64.getEncoder().encodeToString(pictureBinary);
        System.out.println(base64Encoded);
         System.out.println("goodbye");
        } catch (Exception e) {
            // TODO: handle exception
        }



       // try (MongoClient mongoClient = MongoClients.create(connectionString)) {
            // Connect to the database
            // MongoDatabase database = mongoClient.getDatabase(databaseName);
            // MongoCollection<Document> collection = database.getCollection(collectionName);

            // Read the binary data of the picture from a file
            // Path imagePath = Paths.get("./image/test123.jpg");
            // byte[] pictureBinary = Files.readAllBytes(imagePath);
          
            // Create a new document for the picture
            // Document newPicture = new Document()
            //         .append("UserFields", new Document())
            //         .append("PictureBinary", new Binary(pictureBinary))
            //         .append("Reference", 0)
            //         .append("ObjectId", "")
            //         .append("MimeType", "image/png") // Set the appropriate MIME type
            //         .append("SeoFilename", "NewPicture") // Set a unique SEO-friendly filename
            //         .append("AltAttribute", null)
            //         .append("TitleAttribute", null)
            //         .append("Style", null)
            //         .append("ExtraField", null)
            //         .append("IsNew", false)
            //         .append("Locales", new Document());

            // // Insert the new picture into the MongoDB collection
            // collection.insertOne(newPicture);

            // System.out.println("Picture added with _id: " + newPicture.getObjectId("_id"));
    //     } catch (Exception e) {
    //         e.printStackTrace();
    //     }
    // }
    }
}
