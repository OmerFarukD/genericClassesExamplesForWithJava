package genericRecapDemo.concretes;

import genericRecapDemo.abstracts.Database;
import genericRecapDemo.abstracts.Service;

public class ProductManager implements Service<Product> {
private Database database;
	public ProductManager(Database database) {
	this.database = database;
}

	@Override
	public boolean checkIt(Product data) {
	if(data.getProductName().isBlank() || data.getProductName().isEmpty()) {
		return false;
	}else {
		return true;
	}
		
	}

	@Override
	public void add(Product data) {
		if(this.checkIt(data)==true) {
			this.database.add(data);
		}
		else {
			System.out.println("nesnenin bilgileri eksik tekrar deneyiniz");
		}
	}

	@Override
	public void update(Product data) {
		
		if(this.checkIt(data)==true) {
			this.database.update(data);
		}else{
			System.out.println("nesnenin bilgileri eksik tekrar deneyiniz");
		}
		
	}

	@Override
	public void delete(Product data) {
		this.database.delete(data);
		
	}

}
