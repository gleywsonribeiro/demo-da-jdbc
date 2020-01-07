/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

/**
 *
 * @author gleyw
 */
public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        SellerDao sellerDao = DaoFactory.createSellerDao();
        System.out.println("=== TEST 1: Seller findById =====");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\n=== TEST 2: Seller findByDepartment =====");

        List<Seller> sellers = sellerDao.findByDepartment(new Department(2, null));
        sellers.forEach((obj) -> System.out.println(obj));

        System.out.println("\n=== TEST 3: Seller findAll =====");

        sellers = sellerDao.findAll();
        sellers.forEach((obj) -> System.out.println(obj));

        System.out.println("\n=== TEST 4: Seller insert =====");

        Seller s = new Seller(null, "Gleg", "geg@gmial.com", new Date(), 4000.00, new Department(2, null));

        sellerDao.insert(s);
        System.out.println("Inserido! Novo id = " + s.getId());
        
        System.out.println("\n=== TEST 5: Seller update =====");
        
        seller = sellerDao.findById(1);
        seller.setName("Gleywson Ribeiro");
        sellerDao.update(seller);
        System.out.println("Update complete");
        
        System.out.println("\n=== TEST 6: Seller delete =====");
        System.out.print("Entre com o id a ser deletado: ");
        int id = sc.nextInt();
        sellerDao.deleteById(id);
        System.out.println("Delete completed");
        
        sc.close();
        
    }
}
