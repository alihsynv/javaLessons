package oopWithNLayeredApp.business;

import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	private ProductDao productDao;

	public ProductManager(ProductDao productDao) {
		this.productDao = productDao;
	}

	public void add(Product product) throws Exception {
		// business rules
		if (product.getUnitPrice() < 10) {
			throw new Exception("The product price cannot be less than 10");
		}

//		ProductDao productDao = new HibernateProductDao();
		productDao.add(product);

	}
}
