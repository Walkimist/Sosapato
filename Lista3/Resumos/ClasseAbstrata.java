/*Em Java, uma classe abstrata é uma classe que não pode ser instanciada, ou seja, 
não é possível criar objetos diretamente a partir dela. Ela é usada como uma superclasse 
para fornecer uma estrutura comum para suas subclasses, que são as classes concretas que 
podem ser instanciadas. Uma classe abstrata pode conter métodos abstratos, que são métodos 
declarados sem implementação. Esses métodos devem ser implementados nas subclasses concretas. 
O uso de classes abstratas permite a criação de hierarquias de classes, fornecendo uma base 
comum para compartilhar comportamentos e características.*/

package ucb.br.poo;

abstract class Animal {
    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public abstract void emitirSom();

    public void dormir() {
        System.out.println("O animal está dormindo...");
    }
}

class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome);
    }

    public void emitirSom() {
        System.out.println("O cachorro está latindo...");
    }
}

class Gato extends Animal {
    public Gato(String nome) {
        super(nome);
    }

    public void emitirSom() {
        System.out.println("O gato está miando...");
    }
}

public class ClasseAbstrata {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Rex");
        cachorro.emitirSom();
        cachorro.dormir();

        Animal gato = new Gato("Miau");
        gato.emitirSom();
        gato.dormir();
    }
}

/*Temos uma classe abstrata chamada "Animal" que define um método abstrato "emitirSom()" e um método concreto "dormir()". 
As subclasses "Cachorro" e "Gato" estendem a classe abstrata "Animal" e implementam o método abstrato "emitirSom()". 
Na classe "Main", criamos objetos das subclasses "Cachorro" e "Gato" e chamamos os métodos "emitirSom()" e "dormir()". 
A classe abstrata "Animal" fornece a estrutura comum e os comportamentos compartilhados pelas subclasses. */
