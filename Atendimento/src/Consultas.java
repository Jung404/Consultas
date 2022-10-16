import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Consultas {
   
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<Pacientes> arrayListPacientes = new ArrayList<>();
        ArrayList<Medicos> arrayListMedicos = new ArrayList<>();
        Queue<Atendimentos> queueAtendimentos = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();

      
        int opcao = 0;

        while (opcao <= 5) {
            System.out.println("");
            System.out.println("DIGITE UMA OPÇÃO");
            System.out.println("1 - Cadastrar Paciente");
            System.out.println("2 - Cadastrar Médico");
            System.out.println("3 - Registrar atendimento");
            System.out.println("4 - Retirar uma Pasta");
            System.out.println("5 - Finalizar");

            opcao = ler.nextInt();

            switch (opcao) {

                case 1:
                    Pacientes pacientes = new Pacientes();

                    System.out.println("");
                    String NULL = ler.nextLine();

                    System.out.println("Digite o nome do Paciente");
                    String nomePaciente = ler.nextLine();

                    System.out.println("Digite o cpf do Paciente");
                    String cpfPaciente = ler.nextLine();

                    System.out.println("Digite a data de nascimento do Paciente");
                    String dataNascPaciente = ler.nextLine();

                    System.out.println("Digite o número do Paciente");
                    int numeroPaciente = ler.nextInt();

                    pacientes.setNome(nomePaciente);
                    pacientes.setCpf(cpfPaciente);
                    pacientes.setDataNasc(dataNascPaciente);
                    pacientes.setNumPaciente(numeroPaciente);

                    arrayListPacientes.add(pacientes);

                    System.out.println("Lista Pacientes: " + arrayListPacientes);

                    break;

                case 2:

                    Medicos medicos = new Medicos();

                    System.out.println("");
                    String NULL2 = ler.nextLine();

                    System.out.println("Digite o nome do Médico");
                    String nomeMedico = ler.nextLine();

                    System.out.println("Digite a especialização do Médico");
                    String especializacaoMedico = ler.nextLine();

                    System.out.println("Digite o cpf do Médico");
                    String cpfMedico = ler.nextLine();

                    System.out.println("Digite o número de registro do Médico");
                    int numeroRegistroMedico = ler.nextInt();

                    medicos.setNome(nomeMedico);
                    medicos.setEspecializacao(especializacaoMedico);
                    medicos.setCpfMedico(cpfMedico);
                    medicos.setNumeroDoRegistroDoMedico(numeroRegistroMedico);

                    arrayListMedicos.add(medicos);

                    System.out.println("Lista Pacientes: " + arrayListMedicos);

                    break;
                case 3:

                    System.out.println("Digite o número do Atendimento");
                    int numeroAtendimento = ler.nextInt();

                    System.out.println("Digite o número da Pasta");
                    int numeroPasta = ler.nextInt();

                    String NULL3 = ler.nextLine();

                    System.out.println("Digite o tipo de Atendimento");
                    String tipoAtendimento = ler.nextLine();

                    System.out.println("Digite a data do Atendimento");
                    String dataAtendimento = ler.nextLine();

                    Atendimentos atendimentos = new Atendimentos(numeroAtendimento, numeroPasta, tipoAtendimento, dataAtendimento);
                    queueAtendimentos.add(atendimentos);

                    System.out.println("Atendimentos: " + queueAtendimentos);

                    stack.push(numeroPasta);
                    
                  
                    break;
                case 4:

                    System.out.println("Número da pasta retirada: " + stack.pop());
                    break;

                case 5:

                    System.exit(0);
                    break;

                default:
                    break;
            }
        }
    }
}
