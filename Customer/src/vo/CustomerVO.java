package vo;

public class CustomerVO {
	private int id;
	private String name;
	private String email;
	private int age;
	private String date;
	
	public CustomerVO() {
		
	}

	public CustomerVO(int id, String name, String email, int age, String date) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.age = age;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public int getAge() {
		return age;
	}

	public String getDate() {
		return date;
	}

	@Override
	public String toString() {
		return "CustomerVO [id=" + id + ", name=" + name + ", email=" + email + ", age=" + age + ", date=" + date
				+ "]";
	}
	
	
}
