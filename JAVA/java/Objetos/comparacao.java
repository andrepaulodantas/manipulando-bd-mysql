public class comparacao{

public static void main(String[] args) {
    boolean result = 10==1;
    System.out.println(result);

    int idade = 33;
    int nm = 3;
    int nn = 8;
    int num = 1;
    int i = 1;
    //num++;
    System.out.println(--num);

    
    if(idade>=18){
  //      System.out.println("Você ja é de maior");
    }else{
  //      System.out.println("Você é de menor");
    }
    
    
    while(nm<10){
    //    System.out.println(nm);
        nm++;
    }
    
    do{
        System.out.println(nn);
        nn++;
    }while(nn<10);

    for(i=1;i<20;++i){
    //System.out.println(i);
    }

    //String[] nomes = new String [4];
    //nomes[0] = "Andre";
    //nomes[1] = "Paulo";
    //nomes[2] = "Dantas";
    //nomes[3] = "Araujo";

    String[] nomes = {"Juliana", "Paulo", "Dantas", "Araujo"};

    int[] numero = {1,5,300};
    int soma=0;
    for(int n:numero){
        soma +=n;
       
    }

    for(String nomess : nomes){

    //    System.out.println(nome);
    }

    //System.out.println(nomess[0]);
    //System.out.println(soma);



    boolean temCarteira = true;
    if(idade>=18 && temCarteira==true){
        System.out.println("Pode dirigir!");
    }else{
        System.out.println( "NÃO Pode dirigir!");
    }
    
    //matriz
   //String [][] matriz = new String [5][3];
   // matriz[0][2] = "Juliana";
   // System.out.println(matriz[0][2]);

    String [][] matriz = {{"Carlos", "Ana", "Marcelo"}, {"Andre", "Juliana", "Larissa"}};

    System.out.println(matriz[1][2]);

    
    }
}

