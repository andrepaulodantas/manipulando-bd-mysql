package Objetos;

public class Main {
    
   //   int somarPessoas(int ... numeros){
   //       int soma = 0;
   //       for(int n : numeros){
  //            soma +=n;
  //        }
  //        return soma;
  //     }
    
    public static void main(String[] args) {
   //     Pessoas eu = new Pessoas();
       // System.out.println(eu.nome);
  //     eu.mostrarnome("André");
  //     int idade = eu.calcularIdade(1986, 2020);
  //     System.out.println("Idade: "+idade+ " anos!");
     
   //   Principal teste = new Principal();
  //    int soma = teste.somarPessoas(12,34,67,89);
  //    System.out.println(soma);
        
  //      Pessoas eu = new Pessoas();
  //      eu.dumir();
        Pessoas eu = new Pessoas();
           // System.out.println(eu.apresentar());
           eu.nome = "Juliana";
           String apresentacao = eu.apresentar();
           System.out.println(apresentacao);
           eu.mostrarNome("André Engenheiro");
           int idade = eu.calcularIdade(1986, 2020);
           System.out.println("Minha idade é "+idade);
           
   
    }
}









