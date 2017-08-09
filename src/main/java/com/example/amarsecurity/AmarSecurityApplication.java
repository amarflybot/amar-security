package com.example.amarsecurity;

import com.example.amarsecurity.model.Address;
import com.example.amarsecurity.model.Person;
import com.example.amarsecurity.repository.AddressRepository;
import com.example.amarsecurity.repository.PersonRepository;
import org.fluttercode.datafactory.impl.DataFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AmarSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmarSecurityApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(final PersonRepository personRepository,
                                        final AddressRepository addressRepository,
                                        final DataFactory dataFactory){
		return new CommandLineRunner() {
			@Override
			public void run(String... strings) throws Exception {
                Address address = new Address(dataFactory.getAddressLine2(),
                        dataFactory.getAddress(), dataFactory.getCity(), "India");
                addressRepository.save(address);
				Person person = new Person(dataFactory.getFirstName(), dataFactory.getLastName(), address);
				person.setUsername("user");
				person.setPassword("pass");
				personRepository.save(person);

                personRepository.findAll().forEach(person1 -> {
					System.out.println(person1);
				});
			}
		};
	}

	@Bean
    DataFactory dataFactory() {
	    return new DataFactory();
    }
}
