package com.ccamacho.mymarket.model;

import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.List;

@Entity(tableName = "shopping")
public class Shopping {

    @PrimaryKey(autoGenerate = true)
    private int id;

    private String marketName;

    private String purchaseDate;

    private String totalValue;

    @Embedded
    private List<Product> productList;

    public Shopping(int id, String marketName, String purchaseDate, String totalValue, List<Product> productList) {
        this.id = id;
        this.marketName = marketName;
        this.purchaseDate = purchaseDate;
        this.totalValue = totalValue;
        this.productList = productList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarketName() {
        return marketName;
    }

    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(String totalValue) {
        this.totalValue = totalValue;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
