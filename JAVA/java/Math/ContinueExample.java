package Math;

    //Java Program to demonstrate the use of continue statement  
    //inside the for loop.  
    public class ContinueExample {  
    public static void main(String[] args) {  
        //for loop  
        for(int i=1;i<=10;i++){  
            if(i==5){  
                //using continue statement  
                continue;//it will skip the rest statement  
            }  
            int [] arr1 = new int [] {i};  
            System.out.print(arr1[i] + " ");     
            System.out.println(i);  
        }  
    }  
    }  