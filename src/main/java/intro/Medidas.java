// 1 - pacote
package intro;

// 2 - referencia as bibliotecas

import java.util.Scanner;

//3 - Classe
public class Medidas {
    // 3.1 - Atributos - Caracteristicas


    //3.2 - Métodos e Funções
    public static void main(String[] args) {
        // Condicional = Verificar uma condição - Fazer uma pergunta para uma pessoa, um hardware ou software

        // utilizar a classe Scanner do java para ler a nossa escolha do usuário no console
        Scanner scanner = new Scanner(System.in);
        System.out.println("M E N U  D E  O P Ç O E S");
        System.out.println("c - Calcular area modo Curto");
        System.out.println("d - Contar até Dez");
        System.out.println("e - Calcular area modo Extenso");
        System.out.println("i - If Simples");
        System.out.println("r - Contgem regressiva de 10 a 0");
        System.out.println("Digite a opcao desejada:");
        String opcao = scanner.next();

        // switch = selecionar o comportamento do programa comforme a escolha da pessoa ou software

        //String opcao = "curto";

        switch (opcao) {
            case "c":
            case "C":
                System.out.println("Você escolheu executar o metodo calcularAreaModoCurto");
                calcularAreaModoCurto();
                break;
            case "d":
            case "D":
                System.out.println("Você escolheu o metodo contar ate Dez");
                contarAteDez();
                break;
            case "i":
            case "I":
                System.out.println("Você escolheu executar o metodo ifSimples");
                ifSimples();
                break;
            case "r":
            case "R":
                System.out.println("Você escolheu o metodo contagem regressiva");
                contagemRegressiva();
                break;
            case "e":
            case "E":
                System.out.println("Você escolheu executar o metodo calcularAreaModoExtenso");
                calcularAreaModoExtenso();
                break;
            default:
                System.out.println("Você escolheu outro valor que nao tem valor associado");
                //break;
        }

    }

    public static void ifSimples() {
        // Condicional = Verificar uma condição - Fazer uma pergunta para uma pessoa, um hardware ou software

        // if  = se
        // else = senão

        String modo = "curto";

        if (modo == "curto") {
            calcularAreaModoCurto();
        } else {
            calcularAreaModoExtenso();
        }

    }


    public static void calcularAreaModoCurto() {
        System.out.println("Bom dia");
        System.out.println("Calculo de Area Modo Curto");

        // Calculo de area - reduzido
        int largura = 6;
        int comprimento = 5;

        System.out.println("Para a largura de " + largura + " e o comprimento de " + comprimento + " a area é de " + largura * comprimento + " m2");

    }

    public static void calcularAreaModoExtenso() {

        System.out.println("Calculo de Area Modo Extenso");
        // calculo de area - exemplo: o tamanho do tapete ou do piso
        int largura;
        int comprimento;
        int resultado;

        largura = 4;
        comprimento = 3;

        resultado = largura * comprimento;
        System.out.println("Para a largura de " + largura + " e o comprimento de " + comprimento + " a area é de " + resultado + " m2");
    }

    public static void contarAteDez() {
        //for = loops ou repetições
        // for = repetição incondicional
        System.out.println("Contagem Crescente");

        for (int numero = 1; numero <= 10; numero++) {
            System.out.println(numero);

        }

    }
    public static void contagemRegressiva(){
        System.out.println("Contagem Regressiva");

        for (int numero = 10; numero > -1; numero--){
            System.out.println(numero);

        }


    }
}



