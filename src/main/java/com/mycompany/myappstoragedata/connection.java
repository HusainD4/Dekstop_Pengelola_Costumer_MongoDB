package com.mycompany.myappstoragedata;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class connection {

    static String URL = "mongodb://localhost:27017";  // URL MongoDB
    static String dbName = "HsnDB";  // Nama database
    static String collectionName = "Costumers";  // Nama koleksi

    private static MongoClient mongoClient;
    private static MongoDatabase database;

    public static MongoDatabase getDatabase() {
        return database;
    }

    public static boolean connect() {
        try {
            mongoClient = MongoClients.create(URL); // Gunakan URL yang telah diberikan
            database = mongoClient.getDatabase(dbName);  // Akses database
            System.out.println("Koneksi ke MongoDB berhasil!");
            return true;  // Koneksi berhasil
        } catch (Exception e) {
            System.out.println("Gagal koneksi ke MongoDB: " + e.getMessage());
            return false;  // Koneksi gagal
        }
    }
}
