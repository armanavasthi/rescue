package com.rescue.locationservice.pojo;

import lombok.Data;

@Data
public class Location {
    double latitude;
    double longitude;

    String city;
    String locality;
    String landmark;
    int pincode;

    LocationType locationType;
}
