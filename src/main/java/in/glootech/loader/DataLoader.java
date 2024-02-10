package in.glootech.loader;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import in.glootech.entity.Party;
import in.glootech.entity.Person;
import in.glootech.entity.Product;
import in.glootech.repository.PartyRepo;
import in.glootech.repository.PersonRepo;
import in.glootech.repository.ProductRepo;

@Component
public class DataLoader implements ApplicationRunner{

	@Autowired
    private PartyRepo partyRepository;
	@Autowired
    private ProductRepo productRepository;
	@Autowired
    private PersonRepo personRepository;
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		partyRepository.deleteAll();
		productRepository.deleteAll();
		personRepository.deleteAll();
		
		// Load sample party data
        Party party1 = new Party();
        party1.setPartyId("P1001");
        party1.setPartyEnumTypeId("PERSON");
        partyRepository.save(party1);

        Party party2 = new Party();
        party2.setPartyId("P1002");
        party2.setPartyEnumTypeId("PERSON");
        partyRepository.save(party2);

        // Load sample person data associated with parties
        Person person1 = new Person();
        person1.setPartyId("P1001");
        person1.setFirstName("Alice");
        person1.setMiddleName("Marie");
        person1.setLastName("Smith");
        person1.setGender('F');
        person1.setBirthDate(LocalDate.parse("1995-08-20"));
        person1.setMaritalStatusEnumId("SINGLE");
        person1.setEmploymentStatusEnumId("EMPLOYED");
        person1.setOccupation("Data Scientist");
        personRepository.save(person1);

        Person person2 = new Person();
        person2.setPartyId("P1002");
        person2.setFirstName("Joe");
        person2.setMiddleName("D");
        person2.setLastName("Jackson");
        person2.setGender('M');
        person2.setBirthDate(LocalDate.parse("1998-08-23"));
        person2.setMaritalStatusEnumId("SINGLE");
        person2.setEmploymentStatusEnumId("EMPLOYED");
        person2.setOccupation("Data Scientist");
        personRepository.save(person2);

        // Load sample product data
        Product product1 = new Product();
        product1.setProductId("PD1001");
        product1.setPartyId("P1001");
        product1.setProductName("Smartphone X");
        product1.setDescription("High-end smartphone with advanced features");
        product1.setChargeShipping('Y');
        product1.setReturnable('Y');
        productRepository.save(product1);

        Product product2 = new Product();
        product2.setProductId("PD1002");
        product2.setPartyId("P1002");
        product2.setProductName("Laptop Pro");
        product2.setDescription("Powerful laptop for professional use");
        product2.setChargeShipping('Y');
        product2.setReturnable('Y');
        productRepository.save(product2);

        Product product3 = new Product();
        product3.setProductId("PD1003");
        product3.setPartyId("P1003"); // Assuming party ID for the third product
        product3.setProductName("Mac Book");
        product3.setDescription("High-end device with advanced features");
        product3.setChargeShipping('Y');
        product3.setReturnable('N');
        productRepository.save(product3);
		
	}

}
