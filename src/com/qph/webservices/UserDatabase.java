package com.qph.webservices;

import java.util.ArrayList;
import java.util.List;

import com.qph.webservices.entity.User;

public class UserDatabase {
	public static List<User> users = new ArrayList<User>();
	public static void initUsers() {
		User u1 = new User("Quoc PHAN", "Handsome, Single, funny");
		User u2 = new User("Quang DUONG", "beautiful");
		users.add(u1);
		users.add(u2);
	}
}
