package br.calebe.ticketmachine.core;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

class PapelMoedaTest extends TestCase{

	@Test
	void testPapelMoeda() {
		PapelMoeda pm = new PapelMoeda(10, 20);
		
		assertEquals(pm.getValor(), 10);
		assertEquals(pm.getQuantidade(), 10);
		
		assertNotNull(pm.getQuantidade());
		assertNotNull(pm.getValor());
		 
				 
	}
	
	

}
