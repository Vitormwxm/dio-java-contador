import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o primeiro parâmetro: ");
        int primeiroParametro = scanner.nextInt();
        System.out.println("digite o segundo parâmetro: ");
        int segundoParametro = scanner.nextInt();

        try {
            contar(primeiroParametro, segundoParametro);
        } catch (ParametroInvalidException e) {
            e.printStackTrace();
        }


        }
        static void contar (int primeiroParametro, int segundoParametro) throws ParametroInvalidException{
            if (primeiroParametro > segundoParametro) {
                throw new ParametroInvalidException();
            }

            int contagem = segundoParametro - primeiroParametro;

            for ( int i=0; i <= contagem; i++ ){
                System.out.println(i);
            };
        }
    }
