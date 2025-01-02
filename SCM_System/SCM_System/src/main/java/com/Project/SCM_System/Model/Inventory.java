package com.Project.SCM_System.Model;

@Document(collection="Inventory")

public class Inventory {
    @Id
    private String InventoryId;
    private int Quantity;
    private String Location;
    private String ProductId;
    
    public String getInventoryId(){
        return InventoryId;
    }
    public void setInventoryId(String InventoryId){
        this.InventoryId = InventoryId;
    }
    public int getQuantity(){
        return Quantity;

    }
    public void setQuantity(int Quantity){
        this.Quantity = Quantity;

    }
    public String getLocation(){
        return Location;
    }
    public void setLocatino(String Location){
        this.Location =  Location;
    }
    public String getProductId(){
        return ProductId;
    }
    public void setProductId(String ProductId ){
        this.ProductId = ProductId;
    }
}
