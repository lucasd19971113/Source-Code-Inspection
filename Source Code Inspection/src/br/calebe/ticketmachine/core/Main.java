package br.calebe.ticketmachine.core;


import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;

public class Main {
    public static void main(String[] args) throws PapelMoedaInvalidaException {
        System.out.println("Menu");
        TicketMachine ticketMachine = new TicketMachine(0);

        ticketMachine.inserir(2);



    }
}
