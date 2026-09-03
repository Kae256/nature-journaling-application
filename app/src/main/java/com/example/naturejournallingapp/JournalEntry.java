package com.example.naturejournallingapp;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity(tableName= "journal_entries")
//model class for journal entries
public class JournalEntry {
    @PrimaryKey(autoGenerate = true)
    private long id;

    private String title;
    private String desc;
    private String imagePath;
    private String location;
    private long date;

    private boolean syncedToCloud;
    private String firestoreId;  // null until first backed up

    public JournalEntry(String title, String description, String imagePath,
                        double latitude, double longitude, String locationName,
                        long dateCreated) {
        this.title = title;
        this.desc = description;
        this.imagePath = imagePath;
        this.location = location;
        this.date = date;
        this.syncedToCloud = false;
    }
}
