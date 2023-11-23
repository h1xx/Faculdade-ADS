package br.com.tutorialjdbc;

public class InsertTest {

	public static void main(String[] args) {
		ContactRepository repository = new ContactRepository();
		Contact contact = repository.insert("Ana", "Ana@gmail.com", "3322-4455");
		System.out.println(contact);

	}

}