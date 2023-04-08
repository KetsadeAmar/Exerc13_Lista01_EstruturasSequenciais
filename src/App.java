import java.util.Scanner;

 public class App {

     // Início do Programa
    public static void main(String[] args) throws Exception {

        // Declaração de Variaveis
        double altura;
        double peso_ideal_para_homens;
        double peso_ideal_para_mulheres;
        String sexo;

        // Solicitação de Dados
        Scanner teclado = new Scanner (System.in);
        System.out.println ("Informe sua altura: " );
        altura = teclado.nextDouble();
        System.out.println ("Informe seu sexo: " );
        sexo = teclado.next();
        teclado.close();

        // Calcular o peso ideal para homens e mulheres
        peso_ideal_para_homens = (72.7 * altura) - 58;
        peso_ideal_para_mulheres = (62.1 * altura) - 44.7;

        if (sexo.equals ("feminino")) {
            System.out.println ("Seu peso ideal é: " + peso_ideal_para_mulheres);

        }

        else if (sexo.equals ("masculino")){
                System.out.println ("Seu peso ideal é: " + peso_ideal_para_homens);

        }

    }



       
}

