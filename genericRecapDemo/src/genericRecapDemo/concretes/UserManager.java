package genericRecapDemo.concretes;

import genericRecapDemo.abstracts.Database;
import genericRecapDemo.abstracts.Service;

public class UserManager implements Service<User> {
private Database database;
	public UserManager(Database database) {
	this.database = database;
}

	@Override
	public boolean checkIt(User data) {
		if(data.getUserName().isBlank() || data.getUserName().isEmpty() || data.getPassword().length()<6)
		return false;
	else 
		return true;
	}

	@Override
	public void add(User data) {
if(this.checkIt(data)==true) {
	this.database.add(data);
}else {
	System.out.println("kullanýcý eklenemedi tekrar deneyiniz.");
}
	}

	@Override
	public void update(User data) {
		if(this.checkIt(data)==true) {
			this.database.update(data);
		}else {
			System.out.println("kullanýcý güncellenemedi tekrar deneyiniz.");
		}
		
	}

	@Override
	public void delete(User data) {
		if(this.checkIt(data)==true) {
			this.database.delete(data);
		}else {
			System.out.println("kullanýcý silinemedi tekrar deneyiniz.");
		}
		
	}

}
