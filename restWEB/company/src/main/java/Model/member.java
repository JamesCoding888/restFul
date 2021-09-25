package Model;

public class member {// Mapping database table
	private Integer id;// int --->0 ,Integer--->null
	private String name;
	private String username;
	private String password;
	private String address;
	private String phone;

	public member() {
		super();
		// TODO Auto-generated constructor stub
	}

	public member(String name, String password, String address, String phone) {
		super();
		this.name = name;
		this.password = password;
		this.address = address;
		this.phone = phone;
	}
	
	public member(String name, String username, String password, String address, String phone) {
		super();
		this.name = name;
		this.username = username;
		this.password = password;
		this.address = address;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Integer getId() {
		return id;
	}

}