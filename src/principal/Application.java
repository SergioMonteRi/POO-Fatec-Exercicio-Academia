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

        System.out.println("Cadastre um funcionário: ");

        System.out.print("Insira o nome do funcionário: ");
        String nome = sc.next();

        System.out.print("A idade do funcionário: ");
        Integer idade = sc.nextInt();

        // ID gerado automaticamente
        Integer id = 1;

        System.out.print("Insira o salÃ¡rio do funcionário: ");
        Double salario = sc.nextDouble();

        Funcionario funcionario = new Funcionario(nome, idade, id, salario);

        System.out.print("\n - Informações do funcionário cadastrado: " + funcionario.toString());

        // Cadastrando Aluno

        System.out.println("\n\nCadastre um aluno: ");

        System.out.print("Insira o nome do aluno: ");
        nome = sc.next();

        System.out.print("A idade do aluno: ");
        idade = sc.nextInt();

        // ID gerado automaticamente
        id = 1;

        Date dataInscricaoPlano = new Date();
        System.out.println("Dia do início do plano anual: " + sdf.format(dataInscricaoPlano) );

        Calendar dataTerminoPlano = Calendar.getInstance();
        dataTerminoPlano.setTime(dataInscricaoPlano);
        dataTerminoPlano.add(Calendar.YEAR, 1);

        Aluno aluno = new Aluno(nome, idade, id, dataInscricaoPlano, dataTerminoPlano.getTime());

        System.out.print("\n - Informações do aluno cadastrado: " + aluno.toString());

        sc.close();
    }
}