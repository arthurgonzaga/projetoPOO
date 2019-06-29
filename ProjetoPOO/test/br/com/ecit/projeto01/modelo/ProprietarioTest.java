/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ecit.projeto01.modelo;

import projeto.Proprietario;
import java.time.LocalDate;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author weslley
 */
public class ProprietarioTest {
    
    public ProprietarioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Proprietario.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Proprietario.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class Proprietario.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Proprietario instance = null;
        String expResult = "";
        String result = instance.getNome_proprietario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Proprietario.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Proprietario instance = null;
    setNome_proprietariotance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataNascimento method, of class Proprietario.
     */
    @Test
    public void testGetDataNascimento() {
        System.out.println("getDataNascimento");
        Proprietario instance = null;
        LocalDate expResult = null;
        LocalDate result = instance.getDataNascimento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataNascimento method, of class Proprietario.
     */
    @Test
    public void testSetDataNascimento() {
        System.out.println("setDataNascimento");
        LocalDate dataNascimento = null;
        Proprietario instance = null;
        instance.setDataNascimento(dataNascimento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSexo method, of class Proprietario.
     */
    @Test
    public void testGetSexo() {
        System.out.println("getSexo");
        Proprietario instance = null;
        String expResult = "";
        String result = instance.getSexo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSexo method, of class Proprietario.
     */
    @Test
    public void testSetSexo() {
        System.out.println("setSexo");
        String sexo = "";
        Proprietario instance = null;
        instance.setSexo(sexo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
