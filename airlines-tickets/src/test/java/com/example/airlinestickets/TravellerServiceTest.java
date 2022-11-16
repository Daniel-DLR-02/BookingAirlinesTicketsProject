package com.example.airlinestickets;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.airlinestickets.model.Traveller;

@SpringBootTest
public class TravellerServiceTest {
    static Traveller traveller;
    // static TravellerDataValidator dataValidator;

    @BeforeAll
    static void init() {        
        traveller = Traveller.builder()
        .nameAndSurname("Pepe perez")
        .nationality("English")
        .identification("1234567D")
        .age(20)
        .build();
    }
    
	/*@Test
	void validationTravellerName() {
        assertNotNull(dataValidator.name(traveller.getNameAndSurname()), "El nombre tiene que tener más de un caracter");
	}
    
	@Test
	void validationTravellerNationality() {
        assertNotNull(dataValidator.nationality(traveller.getNationality()), "El viajero tiene que tener una nacionalidad");
	}
    
	@Test
	void validationTravellerIdentification() {
        assertNotNull(dataValidator.identification(traveller.getIdentification()), "El viajero tiene que tener una identificacion");
	}
    
	@Test
	void validationTravellerAge() {
        assertNotNull(dataValidator.age(traveller.getAge()), "El viajero tiene que tener una edad valida");*/
	}
    
}
