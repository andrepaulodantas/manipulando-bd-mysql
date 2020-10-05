package Objetos;

public class Pessoas {
  
    
    //     String name;
     //    int age;
   
     //   Pessoas(String n, int i ){
        
   //           name = n;
   //           age = i;
       //     name = "André";
       //     age = 34;
        
   //    }
  //  void mostrarnome(String nome){
  //      System.out.println("Nome é: "+nome);
        
     //   void dumir(){
     //       System.out.println("ZzZzZzZzZ");
     //   }
    
    String nome = "Engenheiro André";
    
    String apresentar(){
     
        return "Prazer meu nome é "+nome; 
     
       }
    
    void mostrarNome(String name){
        System.out.println("Nome é: "+name);
    }
       
     int calcularIdade(int nascimento, int atual){
         return atual-nascimento;
     }
    
        Pessoas(){
            String nome = "Joazinho";
            System.out.println(this.nome); //This refência tudo que pertence a classe
        }
     
    }
        
  //  int calcularIdade(int nasc, int atual){
  //          return atual-nasc;
    // String nome = "André Paulo";

   //  String apresentar(){
   //      return "Prazer, meu nome é " +nome;
   // }
   










