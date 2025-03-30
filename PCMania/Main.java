import java.util.Scanner;

public class Main{

    //João Gabriel Assis Gomes Matrícula: 9830

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        int opcao;

        //instanciando as variaveis
        Cliente joao = new Cliente(940229540, "Joao");
        HardwareBasico processadorpc1 = new HardwareBasico(2200, "Pentium Core i3");
        HardwareBasico processadorpc2 = new HardwareBasico(3370, "Pentium Core i5");
        HardwareBasico processadorpc3 = new HardwareBasico(4500, "Pentium Core i7");

        HardwareBasico ram1 = new HardwareBasico(8, "Gb de Memoria RAM");
        HardwareBasico ram2 = new HardwareBasico(16, "Gb de Memoria RAM");
        HardwareBasico ram3 = new HardwareBasico(32, "Gb de Memoria RAM");
       
        HardwareBasico hd1 = new HardwareBasico(500, "Gb de HD");
        HardwareBasico hd2 = new HardwareBasico(1, "Tb de HD");
        HardwareBasico hd3 = new HardwareBasico(2, "Tb de HD");
        SistemaOperacional so1 = new SistemaOperacional("Linux Ubuntu", 32);
        SistemaOperacional so2 = new SistemaOperacional("Windows 8", 64);
        SistemaOperacional so3 = new SistemaOperacional("Windows 10", 64);

        MemoriaUSB m1 = new MemoriaUSB(16, "Pen-drive");
        MemoriaUSB m2 = new MemoriaUSB(32, "Pen-drive");
        MemoriaUSB m3 = new MemoriaUSB(1000, "HD Externo");


        Computador promocao1 = new Computador(processadorpc1, ram1, hd1,"Apple",m1,9830,so1);
        Computador promocao2 = new Computador(processadorpc2, ram2, hd2,"Samsung",m2,9830+1234,so2);
        Computador promocao3 = new Computador(processadorpc3, ram3, hd3,"Dell",m3,9830+5678,so3);


        System.out.println("==========================================================================");
        System.out.println("                   Seja bem-vindo à Loja PCMania                          ");
        System.out.println("Cliente: " + joao.nome + " CPF: " + joao.cpf);
        
        System.out.println("  Estamos com tres promocoes imperdiveis de otimos computadores na loja!");
        System.out.println("==========================================================================");

        //criaçao do menu de navegacao da loja
        do{
    
        System.out.println("Promocao 1: " );
        promocao1.mostraPCConfigs();
        System.out.println("==========================================================================");

        System.out.println("Promocao 2: " );
        promocao2.mostraPCConfigs();
        System.out.println("==========================================================================");

        System.out.println("Promocao 3: " );
        promocao3.mostraPCConfigs();
        System.out.println("==========================================================================");

        System.out.println("             Qual das 3 gostaria de levar para casa? ");
      

        opcao=ler.nextInt();
        //Seleçao do PC comprado para agreegar ao total da compra
        switch(opcao){

            case 1:
                joao.vetPC[joao.contador] = promocao1;
                joao.contador++;
                System.out.println("Otima escolha! O produto foi adicionado ao seu carrinho!");
                break;
            case 2:
                joao.vetPC[joao.contador] = promocao2;
                joao.contador++;
                System.out.println("Otima escolha! O produto foi adicionado ao seu carrinho!");
                break;
            case 3:
                joao.vetPC[joao.contador] = promocao3;
                joao.contador++;
                System.out.println("Otima escolha! O produto foi adicionado ao seu carrinho!");
                break;

        }
        
    }while(opcao!=0);

    //interface final
    System.out.println("Muito Obrigado por comprar conosco, Senhor " + joao.nome);
    System.out.println("Suas compras foram: ");

        for (int i = 0; i < joao.contador; i++) {
            joao.vetPC[i].mostraPCConfigs();
            System.out.println();
        }
    System.out.println("Seu subtotal deu " + joao.calculaTotalCompra());
    System.out.println("==========================================================================");
    ler.close();
}
}