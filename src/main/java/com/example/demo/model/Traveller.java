package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Traveller extends Person {
   // private String ID;
    //private String creditCardInfo;
    private  int checkedInBags;
    private  int carryonInBags;
}
