package com.FirstAPI.Api_05.DTO;
import javax.validation.constraints.NotBlank;

public class CarDTO {
    @NotBlank(message = "mandatory")
    final String id;
    @NotBlank(message = "mandatory")
    final String modelName;
    final double price;

    public CarDTO(String id, String modelName, double price){
        this.id = id;
        this.modelName = modelName;
        this.price = price;
    }

    public String toString(){
        return "id: " + id + " modelName: " + modelName + " price: " + price;
    }

    public String getId() {
        return id;
    }

    public String getModelName() {
        return modelName;
    }

    public double getPrice() {
        return price;
    }
}
