package oopWithNLayeredApp.business;

import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	private ProductDao productDao;
	
	public ProductManager(ProductDao productDao) {
		
		this.productDao = productDao;
	}
	
	public void add(Product product) throws Exception {
		// İŞ KURALLARI
		if (product.getUnitPrice() < 10) {
			throw new Exception("Ürün fiyatı 10 dan küçük olamaz");
		}
		// ProductDao productDao = new HibernateProductDao();
		// ProductDao productDao = new JdbcProductDao();
		// HibernateProductDao hibernateProductDao = new HibernateProductDao();
		// JdbcProductDao ProductDao = new JdbcProductDao();
		productDao.add(product);
	}
}
