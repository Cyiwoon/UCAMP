package myspring.customer.vo;

import java.sql.Date;

public class CustomerVO {
	
	private Long id;
	private String name;
	private String email;
	private Long age;
	private Date entryDate;
	
	public CustomerVO() {
		// TODO Auto-generated constructor stub
	}
	public CustomerVO(String name, String email, Long age, Date enrtyDate) {
		this.name = name;
		this.email = email;
		this.age = age;
		this.entryDate = entryDate;
	}
	
	public CustomerVO(Long id, String name, String email, Long age, Date entryDate) {
		this(name, email, age, entryDate);
		this.id = id;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getAge() {
		return age;
	}
	public void setAge(Long age) {
		this.age = age;
	}
	public Date getEntryDate() {
		return entryDate;
	}
	public void setEntry_date(Date entryDate) {
		this.entryDate = entryDate;
	}
	
	@Override
	public String toString() {
		return "CustomerVO [id=" + id + ", name=" + name + ", email=" + email + ", age=" + age + ", entry_date=" + entryDate
				+ "]";
	}

	
	
}
