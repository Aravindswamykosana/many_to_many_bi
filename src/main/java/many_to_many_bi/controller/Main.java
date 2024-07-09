package many_to_many_bi.controller;

import javax.persistence.Persistence;

public class Main {
	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("arvind");
	}
}
