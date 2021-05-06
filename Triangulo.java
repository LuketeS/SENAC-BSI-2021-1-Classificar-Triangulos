/*
Escreva um algoritmo em Java que solicite ao usuário a entrada de 3 números. Considere que estes números são os lados de um triângulo.

Seu algoritmo deverá:

Indicar se "realmente" são lados de um triângulo
Se os lados compõem um triângulo, identifique qual sua classificação:
Equilátero
Isósceles
Escaleno
Sua resposta deverá ser enviada através de um PULL REQUEST a este repositório.
 */
package aulaheredia;

import java.util.Scanner;
public class Triangulo {
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);
        System.out.println("Qual o valor do primeiro lado do triângulo? ");
        float a = leitura.nextFloat();
        System.out.println("Segundo lado ");
        float b = leitura.nextFloat();
        System.out.println("Terceiro lado ");
        float c = leitura.nextFloat();
        float temp;
        if (a < b){
        temp = a; 
        a = b; 
        b = temp; 
    }
        if (b < c){
        temp = b; 
        b = c; 
        c = temp; 
    }
        if (a < b){
        temp = a;
        a = b;
        b = temp;
    }
System.out.println("Lado A: "+a+"\nLado B: "+b+"\nLado C: "+c);

if(a>=(b+c)){
System.out.println("Isso não forma um triângulo");
}
else{
 
if(a==b && b==c){
System.out.println("Triângulo Equilátero");
}

else if(a==b ||a==c|b==c){
System.out.println("Triângulo Isósceles");
}

else if(a!=b ||a!=c|b!=c){
System.out.println("Triângulo Escaleno");
}

}
   }
}
