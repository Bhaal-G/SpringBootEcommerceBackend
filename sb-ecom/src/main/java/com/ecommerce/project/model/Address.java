package com.ecommerce.project.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "addresses")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addressId;

    @NotBlank
    @Size(min = 5,message = "Street Name must be at least 5 characters long")
    private String street;

    @NotBlank
    @Size(min = 5,message = "Building Name must be at least 5 characters long")
    private String buildingName;

    @NotBlank
    @Size(min = 4,message = "City Name must be at least 4 characters long")
    private String city;

    @NotBlank
    @Size(min = 4,message = "State Name must be at least 4 characters long")
    private String state;

    @NotBlank
    @Size(min = 4,message = "Country Name must be at least 4 characters long")
    private String country;

    @NotBlank
    @Size(min = 5,message = "pin Code must be at least 5 characters long")
    private String pinCode;

    @ToString.Exclude
    @ManyToMany(mappedBy = "addresses")
    private List<User> users= new ArrayList<>();


    public Address(String street, String buildingName, String city, String state, String country, String pinCode) {
        this.street = street;
        this.buildingName = buildingName;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pinCode = pinCode;
    }
}
