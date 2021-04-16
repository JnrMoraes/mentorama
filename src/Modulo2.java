import java.util.Scanner;

public class Modulo2 {
    public static void main(String[] args) {

        System.out.println("-----------------------");
        System.out.println(" MENU DE OPÇÕES: ");
        System.out.println("");
        System.out.println("  1- Opção 1");
        System.out.println("  2- Opção 2");
        System.out.println("  3- Sair ");
        System.out.println("");
        System.out.println("");
        System.out.println("Digite a opção desejada:");
        System.out.println("");
        System.out.println("-----------------------");
        Scanner menu = new Scanner(System.in);
        boolean cont = true;
        int op = menu.nextInt();

        while (cont) {

            if (op == 3) {
                System.out.println("voce saiu do sistema");
                cont = false;

            } else {

                switch (op) {
                    case 1:
                        System.out.println("Opçao 1 selecionada");
                        System.out.println("digite novamente");
                        op = menu.nextInt();

                    case 2:
                        System.out.println("Opçao 2 selecionada");
                        System.out.println("digite novamente");
                        op = menu.nextInt();
                    default:
                        System.out.println("digite novamente");
                        op = menu.nextInt();


                }
            }
        }
    }
}

