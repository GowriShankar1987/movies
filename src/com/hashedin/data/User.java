package com.hashedin.data;

public class User {
// user id | age | gender | occupation | code//
	private int userId;
	private double age;
	private String gender;
	private String occupation;
	private String zipCode;
	
	@Override
	public String toString() {
		return "User [user_id=" + userId + ", age=" + age + ", gender="
				+ gender + ", occupation =" + occupation + ", zip_code="
				+ zipCode + "]";
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int user_id) {
		this.userId = user_id;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
}