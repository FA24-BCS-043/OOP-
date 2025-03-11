public class Address{
	String street,city;

	public Address(String street, String city){
		this.street = street;
		this.city = city;
	}

	public Address(Address other){
		this.street = other.street;
		this.city = other.city;
	}

	void showAddress(){
		System.out.println(street + ", " + city);
	}


	@Override
	public boolean equals(Object obj){
		Address other = (Address) obj;
		return this.street == other.street && this.city == other.city;
	}
	
	public String getStreet(){
		return street;	
	}

	public void setStreet(String street){
		this.street = street;
	}

	public String getCity(){
		return city;	
	}

	public void setCity(String city){
		this.city = city;
	}
}