package com.ccamacho.mymarket.database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.ccamacho.mymarket.model.Product;

import java.util.List;

@Dao
public interface ProductDao {

    @Insert
    void insert(Product product);

    @Query("SELECT * FROM product")
    List<Product> getAll();

    @Delete
    void delete(Product product);
}
