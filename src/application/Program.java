/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Date;
import model.entities.Department;
import model.entities.Seller;

/**
 *
 * @author gleyw
 */
public class Program {
    public static void main(String[] args) {
        Department d = new Department(1, "Books");
        Seller s = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0, d);
        
        System.out.println(s);
    }
}
