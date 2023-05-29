/*Em Java, o polimorfismo é um princípio da programação orientada a objetos que permite que 
um objeto seja tratado de diferentes formas, dependendo do contexto em que é utilizado. 
O polimorfismo é alcançado através da hierarquia de classes e interfaces, onde uma classe 
pode ser tratada como um tipo mais genérico, mas ainda executar o comportamento específico 
da sua própria implementação. Isso permite escrever código mais flexível, reutilizável e extensível. 
O polimorfismo é frequentemente utilizado em conjunto com a herança e a implementação de interfaces.*/

package ucb.br.poo;

interface Forma {
    void desenhar();
}

class Circulo implements Forma {
    public void desenhar() {
        System.out.println("Desenhando um círculo.");
    }
}

class Quadrado implements Forma {
    public void desenhar() {
        System.out.println("Desenhando um quadrado.");
    }
}

class Triangulo implements Forma {
    public void desenhar() {
        System.out.println("Desenhando um triângulo.");
    }
}

public class Polimorfismo {
    public static void main(String[] args) {
        Forma forma1 = new Circulo();
        forma1.desenhar();

        Forma forma2 = new Quadrado();
        forma2.desenhar();

        Forma forma3 = new Triangulo();
        forma3.desenhar();
    }
}

/*Temos uma interface chamada "Forma" com um método "desenhar()". As classes "Circulo",
"Quadrado" e "Triangulo" implementam a interface "Forma" e fornecem suas próprias implementações 
para o método "desenhar()". Na classe "Main", criamos objetos das classes concretas e os referenciamos 
através da interface "Forma". Ao chamar o método "desenhar()", o comportamento específico de cada forma 
é invocado, dependendo do tipo de objeto em tempo de execução. Isso exemplifica o polimorfismo, onde a 
mesma chamada de método produz resultados diferentes, adaptando-se ao tipo de objeto referenciado. */