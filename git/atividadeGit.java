import java.util.Scanner;

public class atividadeGit {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int num = 0;
        int mes = 0;
        double salario = 0.0;
        while (num != 5) {
            System.out.println("1. Novo salário\n" +
                    "2. Férias\n" +
                    "3. Décimo terceiro\n" +
                    "4. Sair  \n"+">");
            num = sc.nextInt();
            if(num<=0 || num > 4){
                System.exit(0);
            }
            switch (num) {
                case 1:
                    System.out.println("Qual o seu salário?");
                    salario = sc.nextDouble();
                    if (salario <= 350) {
                        salario *= 1.15;
                    } else if (salario > 350 & salario < 600) {
                        salario *= 1.10;
                    } else if (salario > 600) {
                        salario *= 1.05;
                    }
                    System.out.println("Seu novo salário será: $" + salario);
                    break;

                case 2:
                    System.out.println("Qual o seu salário?");
                    salario = sc.nextDouble();
                    salario += (salario) / 3;
                    System.out.println("Seu salários será:$ "+salario);
                    break;
                case 3:
                    System.out.println("Qual o seu salário?");
                    salario = sc.nextDouble();
                    System.out.println("Quantos meses foram trabalhados: ");
                    mes = sc.nextInt();
                    salario = (salario* mes)/12;
                    System.out.println("Seu salário será: $"+ salario);
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}
