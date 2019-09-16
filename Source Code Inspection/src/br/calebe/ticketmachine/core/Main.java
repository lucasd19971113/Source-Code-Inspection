package br.calebe.ticketmachine.core;


import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
import br.calebe.ticketmachine.exception.SaldoInsuficienteException;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Menu");
        TicketMachine ticketMachine = new TicketMachine(0);

        ticketMachine.inserir(-12);
        ticketMachine.inserir(-50);


        System.out.println(ticketMachine.getSaldo());

        System.out.println(ticketMachine.getTroco());


    }
}
