package br.calebe.ticketmachine.core;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Menu");
        TicketMachine ticketMachine = new TicketMachine(2);

        ticketMachine.inserir(5);
        ticketMachine.inserir(10);


        System.out.println(ticketMachine.getSaldo());

        System.out.println(ticketMachine.getTroco());


    }
}
