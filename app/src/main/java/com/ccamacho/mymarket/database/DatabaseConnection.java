package com.ccamacho.mymarket.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.ccamacho.mymarket.model.Product;

@Database(entities = {Product.class}, version = 1)
public abstract class DatabaseConnection extends RoomDatabase {

    private static DatabaseConnection instance;

    public abstract ProductDao productDao();

    static DatabaseConnection getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context, DatabaseConnection.class, "my_market_database")
                    .build();
        }
        return instance;
    }

}
