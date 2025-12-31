package ie.atu.lab5cicddp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final PersonRepository personRepository;

    public DataLoader(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Address address1 = new Address("H91W400", "Galway");
        Person testData1 = new Person(
                "Paul",
                "Lecturer",
                "1234",
                "paul@atu.ie",
                "Electronics",
                address1
        );

        Address address2 = new Address("F23X123", "Mayo");
        Person testData2 = new Person(
                "Pat",
                "Lecturer",
                "1234",
                "pat@atu.ie",
                "Electronics",
                address2
        );

        Address address3 = new Address("F23X123", "Clare");
        Person testData3 = new Person(
                "Saul",
                "Head Lecturer",
                "1234",
                "saul@atu.ie",
                "Electronics",
                address3
        );

        personRepository.save(testData1);
        personRepository.save(testData2);
        personRepository.save(testData3);
    }
}

