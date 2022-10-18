package youtubeEgitim;

public class Main {

	public static void main(String[] args) {
		
		CustomerManager customerManager = new CustomerManager(new Customer(),new TeacherCredirManager());
		customerManager.Delete();
//		CreditManager creditManager = new CreditManager();
//		creditManager.Calculate();
//		creditManager.Save();
//		
//		Customer customer = new Customer(1,"Zeynep","Kırmacı","12345");
//		
//		CustomerManager customerManager = new CustomerManager(customer);
//		customerManager.Save();
//		customerManager.Delete();
		

	}

}
