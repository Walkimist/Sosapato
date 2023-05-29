/*Em Java, pacotes são mecanismos utilizados para organizar e agrupar classes relacionadas em uma estrutura hierárquica. 
Eles são usados para evitar conflitos de nomes e fornecer uma melhor organização do código. Um pacote é uma pasta que 
contém um conjunto de classes e outros pacotes relacionados. Para utilizar um pacote em Java, é necessário declarar o 
pacote no início do arquivo de código-fonte e importar as classes específicas que serão utilizadas. O uso de pacotes 
facilita a reutilização de código, a modularização e a colaboração entre desenvolvedores.*/

package ucb.br.poo;

import ucb.br.poo.Calculo;

public class Pacotes {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int soma = Calculo.somar(a, b);
        System.out.println("A soma de " + a + " e " + b + " é: " + soma);
    }
}

/*Temos um pacote chamado "ucb.br.poo" que contém duas classes: "Pacotes" e "Calculo". 
A classe "Pacotes" importa a classe "Calculo" utilizando a declaração import ucb.br.poo.Calculo;.
Isso permite que a classe "Pacotes" utilize o método "somar" da classe "Calculo" para realizar uma soma simples. */