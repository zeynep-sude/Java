package youtubeEgitim;

public class CustomerManager {
	
	private Customer customer;
	private CredittManager credittManager;
	
	
	public CustomerManager(Customer customer,CredittManager credittManager) {
		
		this.customer = customer;
		this.credittManager = credittManager;
	}


	public void Save() {
		System.out.println("Müteri Kaydedildi:" + customer.getFirstName());
	}
	
	public void Delete() {
		System.out.println("Müteri silindi:" + customer.getFirstName());
	}

}
