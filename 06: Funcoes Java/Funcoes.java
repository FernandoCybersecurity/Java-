public class Funcoes {


    private void HelloWorld(){

        System.out.println("Ola, mundo!");

    }

    private long soma(long a, long b) {
        return a+b;
    }

    public static void main(String[] args) {
        //Chamando função
        Funcoes abc = new Funcoes();
        abc.HelloWorld();
        
        //Printando resposta
       System.out.println(abc.soma(1, 2));
    }
}

// Codigo que deu errado: tem que arrumar