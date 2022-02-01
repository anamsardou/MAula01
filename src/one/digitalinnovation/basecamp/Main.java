package one.digitalinnovation.basecamp;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

/**
 * Classe principal do exercício da Aula 01 de Métodos
 */

public class Main {

    public static void main(String[] args) {

        // Calculadora
        System.out.println("\nExercício calculadora:\n ");
        Calculadora.soma(6,3);
        Calculadora.subtracao(9,1.8);
        Calculadora.multiplicacao(7,8);
        Calculadora.divisao(5,2.5);

        //Mensagem
        System.out.println("\nExercício mensagem:\n ");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(01);

        //Empréstimo
        System.out.println("\nExercício empréstimo:\n ");
        Emprestimo.Calcular(1000,2);
        Emprestimo.Calcular(1000,3);
        Emprestimo.Calcular(1000,8);

    }





}
