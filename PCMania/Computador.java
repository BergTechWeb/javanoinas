


public class Computador {
    
    String marca;
    float preco;

    HardwareBasico hb1, hb2, hb3;
    MemoriaUSB mu;
    SistemaOperacional so;

    public Computador(HardwareBasico hb1, HardwareBasico hb2, HardwareBasico hb3, String marca, MemoriaUSB mu, float preco, SistemaOperacional so) {
        this.hb1 = hb1;
        this.hb2 = hb2;
        this.hb3 = hb3;
        this.marca = marca;
        this.mu = mu;
        this.preco = preco;
        this.so = so;
    }

    public Computador(HardwareBasico hb1, HardwareBasico hb2, HardwareBasico hb3, String marca, float preco, SistemaOperacional so) {
        this.hb1 = hb1;
        this.hb2 = hb2;
        this.hb3 = hb3;
        this.marca = marca;
        this.preco = preco;
        this.so = so;
        this.mu = null;
    } 


    public void mostraPCConfigs () {

        System.out.println("As configurcoes do seu pc sao as seguintes:\n");

        System.out.println("Marca: " + marca);
        System.out.println("Preco: " + preco);

        System.out.println(hb1.nome + "(" + hb1.capacidade + ")");
        System.out.println(hb2.capacidade + hb2.nome);
        System.out.println(hb3.capacidade + hb3.nome);

        System.out.println(so.nome + "(" + so.tipo + ")");

        if (mu!=null){
            System.out.println(mu.nome + mu.capacidade);
        }
    }

    public void addMemoriaUSB (MemoriaUSB musb) {

            this.mu = musb;
    }
}
