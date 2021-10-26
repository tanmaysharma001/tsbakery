package com.tsbakery.major.global;

import com.tsbakery.major.model.Product;

import java.util.ArrayList;
import java.util.List;

public class GlobalData {
    public static List<Product> cart;
    static{
        cart= new ArrayList<Product>();
    }
}
