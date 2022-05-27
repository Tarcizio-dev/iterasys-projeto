// 1 - pacote
package intro;

// 2 - referencia as bibliotecas

//3 - Classe
public class Medidas {
    // 3.1 - Atributos - Caracteristicas


    //3.2 - Métodos e Funções
    public static void main(String[] args){

        calcularAreaModoCurto();
        calcularAreaModoExtenso();


    }

    public static void calcularAreaModoCurto(){
        System.out.println("Bom dia");
        System.out.println("Calculo de Area Modo Curto");

        // Calculo de area - reduzido
        int largura = 6;
        int comprimento = 5;

        System.out.println("Para a largura de " + largura + " e o comprimento de " + comprimento + " a area é de " + largura * comprimento+ " m2");

    }
    public static void calcularAreaModoExtenso(){

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


}


