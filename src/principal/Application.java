package principal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import domain.Aluno;
import domain.Funcionario;

public class Application {

    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        System.out.println("SISTEMA ACADEMIA\n");

        System.out.println("Cadastre um funcion�rio: ");

        System.out.print("Insira o nome do funcion�rio: ");
        String nome = sc.next();

        System.out.print("A idade do funcion�rio: ");
        Integer idade = sc.nextInt();

        // ID gerado automaticamente
        Integer id = 1;

        System.out.print("Insira o salário do funcion�rio: ");
        Double salario = sc.nextDouble();

        Funcionario funcionario = new Funcionario(nome, idade, id, salario);

        System.out.print("\n - Informa��es do funcion�rio cadastrado: " + funcionario.toString());

        // Cadastrando Aluno

        System.out.println("\n\nCadastre um aluno: ");

        System.out.print("Insira o nome do aluno: ");
        nome = sc.next();

        System.out.print("A idade do aluno: ");
        idade = sc.nextInt();

        // ID gerado automaticamente
        id = 1;

        Date dataInscricaoPlano = new Date();
        System.out.println("Dia do in�cio do plano anual: " + sdf.format(dataInscricaoPlano) );

        Calendar dataTerminoPlano = Calendar.getInstance();
        dataTerminoPlano.setTime(dataInscricaoPlano);
        dataTerminoPlano.add(Calendar.YEAR, 1);

        Aluno aluno = new Aluno(nome, idade, id, dataInscricaoPlano, dataTerminoPlano.getTime());

        System.out.print("\n - Informa��es do aluno cadastrado: " + aluno.toString());

        sc.close();
    }
}