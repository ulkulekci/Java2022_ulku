package oopWithNLayeredApp.business;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	private ProductDao productDao;
	private Logger[] loggers;
	
	public ProductManager(ProductDao productDao, Logger[] loggers) {
		
		this.productDao = productDao;
		this.loggers = loggers;
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
		for (Logger logger : loggers) { // [db,mail]
			logger.log(product.getName());
		}
	}
}
