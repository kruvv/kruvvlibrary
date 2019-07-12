package ru.kruvv.objects;

import java.util.Date;

public class Author {

	private String fio;
	private Date birthday;

	public Author() {
	}

	public Author(String fio, Date birthday) {
		this.fio = fio;
		this.birthday = birthday;
	}

	public String getFio() {
		return fio;
	}

	public void setFio(String fio) {
		this.fio = fio;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

}
