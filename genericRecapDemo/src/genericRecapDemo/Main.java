package genericRecapDemo;

import genericRecapDemo.abstracts.Service;
import genericRecapDemo.concretes.Product;
import genericRecapDemo.concretes.ProductDao;
import genericRecapDemo.concretes.ProductManager;
import genericRecapDemo.concretes.User;
import genericRecapDemo.concretes.UserDao;
import genericRecapDemo.concretes.UserManager;

public class Main {

	public static void main(String[] args) {
Product product =new Product(1,"");
User user=new User(1,"Ömer","1234567");
Service service=new ProductManager(new ProductDao());
service.add(product);
Service service2=new UserManager(new UserDao());
service2.add(user);
	}

}
