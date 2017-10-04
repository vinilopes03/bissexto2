/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.bissesto.Bissexto;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vinil
 */
public class BissextoTeste {
    
    public BissextoTeste() {
    }
    
    @Test
    public void anoBissexto(){
        Bissexto ano = new Bissexto();
        assertTrue(ano.validaBissexto(2016));
        assertTrue(ano.validaBissexto(2020));
        assertFalse(ano.validaBissexto(2017));
        assertTrue(ano.validaBissexto(2000));
    }
    
    @Test
    public void NaoAnoBissexto(){
        Bissexto ano = new Bissexto();
        assertFalse(ano.validaBissexto(2025));
        assertFalse(ano.validaBissexto(2027));
        assertFalse(ano.validaBissexto(3000));
    }
    
}