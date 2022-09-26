package oop1;

public class Main {
	
	public static void main(String[] args) {
		
		String mesaj = "vade oranı";
		// set value
		Product product1 = new Product();
		
		// product1.name ="Delonghi Kahve Makinesi";
		// product1.unitPrice=7500;
		// product1.discount=7;
		// product1.unitsInStock=3;
		// product1.imageUrl = "bilmemne1.jpg";
		
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setImageUrl("bilmemne1.jpg");
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		
		Product product2 = new Product();
		// product2.name ="Smeg Kahve Makinesi";
		// product2.unitPrice=6500;
		// product2.discount=8;
		// product2.unitsInStock=2;
		// product2.imageUrl = "bilmemne2.jpg";
		
		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(8);
		product2.setImageUrl("bilmemne2.jpg");
		product2.setUnitPrice(6500);
		product2.setUnitsInStock(2);
		
		Product product3 = new Product();
		// product3.name ="Kitchen Aid Kahve Makinesi";
		// product3.unitPrice=4500;
		// product3.discount=9;
		// product3.unitsInStock=4;
		// product3.imageUrl = "bilmemne3.jpg";
		
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setDiscount(9);
		product3.setImageUrl("bilmemne3.jpg");
		product3.setUnitPrice(4500);
		product3.setUnitsInStock(4);
		
		// get
		// System.out.println(product1.name);
		
		Product[] products = { product1, product2, product3 };
		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>" + product.getName() + "<li>");
		}
		System.out.println("<ul>");
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("767800000");
		individualCustomer.setCustomerNumber("1234");
		individualCustomer.setFirstName("ulku");
		individualCustomer.setLastName("kulekci");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setPhone("053333333333");
		corporateCustomer.setTaxNumber("111111111");
		corporateCustomer.setCustomerNumber("543210");
		
		Customer[] customers = { individualCustomer, corporateCustomer };
		
	}
}
