package genericRecapDemo.concretes;

import genericRecapDemo.abstracts.Database;

public class UserDao implements Database<User> {

	@Override
	public void add(User data) {
		System.out.println("kiþi eklendi= "+data.getUserName());	
	}

	@Override
	public void update(User data) {
		System.out.println("kiþi güncellendi= "+data.getPassword());
		
	}

	@Override
	public void delete(User data) {
		System.out.println("kiþi silindi= "+data.getUserId());
		
	}

}
