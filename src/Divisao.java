public class Divisao {
    void dividir(int num1){
       for( int j=1; j<=num1*10;j++){
            if(j % num1 == 0) {   
                System.out.format("%d / %d = %d\n",j,num1,(j/num1)); 
            }
    }
}
}