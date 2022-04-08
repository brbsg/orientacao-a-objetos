package testes;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import controller.Validator;
import model.Telefone;

public class Testes {


    @Test
    void testValidaCpf() {
        assertTrue(Validator.validaCpf("22365478954"));  
        assertFalse(Validator.validaCpf("99999999999")); 
        assertFalse(Validator.validaCpf("2365478954"));  

    }

    @Test
    void testValidaCep() {
        assertTrue(Validator.validaCep(26567587));   
        assertFalse(Validator.validaCep(265675875));
        assertFalse(Validator.validaCep(22222222));  

    }


    @Test
    void testValidaTelefone() {
        assertTrue(Validator.validaTelefone(new Telefone(61, 555555555)));   
        assertFalse(Validator.validaTelefone(new Telefone(555, 123456789))); 
        assertFalse(Validator.validaTelefone(new Telefone(61, 12345678)));   
        assertFalse(Validator.validaTelefone(new Telefone(561, 55555555)));  

    }
}
