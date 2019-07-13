package com.demo.pojo;

public class Account {
	private Long id;
	private String account_num;
	private String name;
	private String phone;
	private String email;
	private String qq;
	private String password;
	private Integer status; // 1代表账号可用，0代表账号停用，-1代表账号未通过验证
	private String head_photo;
//	private Teacher teacher;
//
//	@OneToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.EAGER)
//	public Teacher getTeacher() {
//		return teacher;
//	}

//	@Column(unique = true)
	public String getAccount_num() {
		return account_num;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public Integer getStatus() {
		return status;
	}

//	public void setTeacher(Teacher teacher) {
//		this.teacher = teacher;
//	}

	public void setAccount_num(String account_num) {
		this.account_num = account_num;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHead_photo() {
		return head_photo;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", account_num=" + account_num + ", name=" + name + ", phone=" + phone + ", email="
				+ email + ", qq=" + qq + ", password=" + password + ", status=" + status + ", head_photo=" + head_photo
				+ "]";
	}

	public void setHead_photo(String head_photo) {
		this.head_photo = head_photo;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
