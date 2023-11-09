package com.mphasis.main;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.mphasis.dao.ProductDAO_Impl;
import com.mphasis.pojo.Product;

public class DbMain {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Scanner sc=new Scanner(System.in);
		ProductDAO_Impl dao=null;
		while(true) {
			System.out.println("Menu \n 1. add Product \n 2.delete product \n 3. update product \n 4. retrive product \n 5.exit");
			System.out.println("enter the choice ");
			int ch=sc.nextInt();
			switch(ch) {
			case 1: Product product=new Product();
			System.out.println("enter product id ");
			product.setPid(sc.nextInt());
			System.out.println("enter product name");
			product.setPname(sc.next());
			System.out.println("enter product cost");
			product.setCost(sc.nextInt());
			dao=new ProductDAO_Impl();
			if(dao.addProduct(product)>0) {
				System.out.println("product got inserted with details "+product);
			}
			break;
			case 2:
				System.out.println("enter product id to delete");
				int id=sc.nextInt();
				dao=new ProductDAO_Impl();
				dao.deleteProduct(id);
			case 3:
				System.out.println("enter product name u want to update:");
				dao=new ProductDAO_Impl();
				System.out.println("enter product id:");
				int pid=sc.nextInt();
				System.out.println("enter product name:");
				String pname=sc.next();
				dao.updateProductName(pid,pname);
				break;
			case 4:  
				dao=new ProductDAO_Impl();
				List<Product> productlist=dao.selectProducts();
			for(Product products:productlist) {
				System.out.println(products);
			}

			case 5:System.exit(0);
			break;
			}
		}
	}
}


