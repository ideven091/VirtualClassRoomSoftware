package com.cleo.blogAPI.users;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


public class UserProfile{



    private String firstName;
    private String lastName;

    private String country;


}
