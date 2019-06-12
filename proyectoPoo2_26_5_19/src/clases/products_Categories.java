/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;

/**
 *K
 * @author User
 */
public class products_Categories {
   String  products_CategoriesCode, description,  nameCategory;
       ArrayList<product> list_productsCategories = new ArrayList<product>();

    public products_Categories() {
    }

    public products_Categories(String products_CategoriesCode, String description, String nameCategory) {
        this.products_CategoriesCode = products_CategoriesCode;
        this.description = description;
        this.nameCategory = nameCategory;
        
    }


    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public String getProducts_CategoriesCode() {
        return products_CategoriesCode;
    }

    public void setProducts_CategoriesCode(String products_CategoriesCode) {
        this.products_CategoriesCode = products_CategoriesCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public ArrayList<product> getList_productsCategories() {
        return list_productsCategories;
    }

    public void setList_productsCategories(   product  list_productsCategories) {
        this.list_productsCategories.add(list_productsCategories);
    }

}
