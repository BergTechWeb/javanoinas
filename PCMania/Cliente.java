


public class Cliente {
    
    String nome;
    long cpf;
    int contador = 0;

    Computador[] vetPC = new Computador[100];

    //construtor(es)
    public Cliente(long cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
        for(int i = 0; i<100; i++){
            vetPC[i] = new Computador(0); 
        }
    }

    
    //metodos
    public float calculaTotalCompra(){

        float total = 0;

        for (int i = 0; i < vetPC.length; i++) {
            total += vetPC[i].preco;
        }
               
        return total;
    } 
}
