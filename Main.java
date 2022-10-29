import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  Scanner sc1 = new Scanner (System.in);

    double valorCompra = 687.00, valorRevenda = 789.00, valorLucro;

  System.out.println("Você realizou sua compra no valor de R$687,00. Tem interesse de revender? [1] Não [2] Sim");
   int revendaInt = sc1.nextInt();
    String interesse = "";

  if (revendaInt == 1) {
        interesse = "Não";
         System.out.println("Certo, quando tiver interesse é só voltar aqui.");
    } else if (revendaInt == 2) {
         interesse = "Sim";
    System.out.println("Ok, vamos lá! Deseja revender por R$789,00? [1] Não [2] Sim ");
    valorRevenda = sc1.nextDouble();
         if (valorRevenda == 1) {
        interesse = "Não";
         System.out.println("Certo, quando tiver interesse é só voltar aqui.");
    } else if (revendaInt == 2) {
         interesse = "Sim";
           valorLucro = 789 - 687;
    System.out.println("Ok, vamos anunciar sua venda! Você irá obter um lucro de: " + valorLucro + " reais");

    }
  }
}
}