package br.com.tutorialjdbc;

public class UpdateTest {

	public static void main(String[] args) {
		Contact contact = new Contact(10,
							  "Sara da Silva",
				              "sara@test.com",
				              "34562312");
		ContactRepository repository = new ContactRepository();
		repository.update(contact);
		
		Contact updated = repository.findAll().stream().filter((co) -> co.getId().equals(10)).findFirst().orElse(null);
		System.out.println(updated);
	}
}
