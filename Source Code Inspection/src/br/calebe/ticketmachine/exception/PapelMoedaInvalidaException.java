package br.calebe.ticketmachine.exception;

import java.io.PrintStream;
import java.io.PrintWriter;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class PapelMoedaInvalidaException extends Exception {

        public PapelMoedaInvalidaException() throws Exception {
            throw new Exception("try again please Papel Moeda");
        }
}
