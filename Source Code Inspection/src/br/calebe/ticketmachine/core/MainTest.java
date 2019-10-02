package br.calebe.ticketmachine.core;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void testMain() throws Exception {
        TicketMachine ticketMachine = new TicketMachine(2);

        ticketMachine.inserir(5);
        ticketMachine.inserir(10);

        
        assertEquals(ticketMachine.getSaldo(), 5);

        assertNull(ticketMachine.getTroco());
        
        
	}

}
