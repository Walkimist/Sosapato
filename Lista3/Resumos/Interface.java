/*Em Java, uma interface é um tipo de referência que define um contrato ou um conjunto de métodos 
abstratos que uma classe concreta deve implementar. Uma interface define o comportamento que uma 
classe deve ter, mas não fornece nenhuma implementação. As interfaces permitem a criação de contratos 
entre as classes, permitindo a interoperabilidade entre diferentes classes através da implementação de 
uma mesma interface. Uma classe pode implementar múltiplas interfaces, fornecendo assim a implementação 
dos métodos definidos em cada uma delas. O uso de interfaces em Java promove a abstração, o polimorfismo e o reuso de código.*/

package ucb.br.poo;

interface Voador {
    void voar();
}

class Pato implements Voador {
    public void voar() {
        System.out.println("O pato está voando!");
    }
}

class Aviao implements Voador {
    public void voar() {
        System.out.println("O avião está voando!");
    }
}

public class Interface {
    public static void main(String[] args) {
        Voador pato = new Pato();
        pato.voar();

        Voador aviao = new Aviao();
        aviao.voar();
    }
}

/*Temos uma interface chamada "Voador" que define o método abstrato "voar()". 
As classes "Pato" e "Aviao" implementam a interface "Voador" e fornecem a implementação do método "voar()". 
Na classe "Main", criamos objetos das classes "Pato" e "Aviao" utilizando a referência da interface "Voador". 
Isso permite que chamemos o método "voar()" de forma polimórfica, ou seja, o comportamento do método será 
determinado pela classe concreta em tempo de execução. A interface "Voador" define um contrato comum para as 
classes "Pato" e "Aviao" e possibilita que elas sejam tratadas de forma uniforme quando utilizadas como objetos da interface. */
