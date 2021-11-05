package genericRecapDemo.concretes;

import genericRecapDemo.abstracts.Database;

public class ProductDao implements Database<Product> {

	@Override
	public void add(Product data) {
		System.out.println("nesne eklendi= "+data.getProductName());
		
	}

	@Override
	public void update(Product data) {
		System.out.println("nesne güncellendi= "+data.getProductName());
		
	}

	@Override
	public void delete(Product data) {
		System.out.println("nesne silindi= "+data.getProductId());
	}

}
