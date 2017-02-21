package com.sqlite.android.sqlitevoorbeeld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.sqlite.android.sqlitevoorbeeld.dao.DatabaseHandler;
import com.sqlite.android.sqlitevoorbeeld.dto.Contact;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseHandler db = new DatabaseHandler(this);

        // CRUD Operations
        // Inserting Contacts
        Log.d("Insert", "Inserting ...");
        db.insertContact(new Contact("Ravi", "4353432432"));
        db.insertContact(new Contact("Guilermo", "6574367846"));
        db.insertContact(new Contact("Akshay", "9807645345"));
        db.insertContact(new Contact("Roger", "4353434435"));
        db.insertContact(new Contact("Maarten", "4678567543"));
        db.insertContact(new Contact("Jozua", "4789656332"));

        // Reading All Contacts
        Log.d("Reading:", "Reading All Contacts");
        List<Contact> contacts = db.getAllContacts();

        for(Contact cn : contacts){
            String log =  "Id: " + cn.getId() +
                          " Name: " + cn.getName() +
                          " Phone: " + cn.getPhoneNumber();
            Log.d("Name: ", log);
        }
    }
}
