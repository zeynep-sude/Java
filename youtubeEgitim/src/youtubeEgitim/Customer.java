package youtubeEgitim;

public class Customer {
	private int id;
	private String FirstName;
	private String LastName;
	private String NationalIdentity;
	
	
	public Customer() {
		super();
	}
	
	public Customer(int id, String firstName, String lastName, String nationalIdentity) {
		super();
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
		NationalIdentity = nationalIdentity;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getNationalIdentity() {
		return NationalIdentity;
	}
	public void setNationalIdentity(String nationalIdentity) {
		NationalIdentity = nationalIdentity;
	}
	
	

}
