import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       String opcao;
       Scanner entrada = new Scanner(System.in);
       do{
            
            int casaDaTabuada;
            System.out.println("Bem vindo à tabuada do Adrian");
    
            try {
                System.out.println("Digite o valor da casa da tabuada desejada: ");
                casaDaTabuada = entrada.nextInt();
                System.out.println("Digite o operador da operação desejada: ");
                opcao = entrada.next();
                
                
                switch(opcao){
                    case "+":
                        Adicao a = new Adicao();
                        a.somar(casaDaTabuada);
                        break;
                    
                    case "-":
                        Subtracao s = new Subtracao();
                        s.subtrair(casaDaTabuada);
                        break;

                    case "*":
                        Multiplicacao m = new Multiplicacao();
                        m.multipicar(casaDaTabuada);
                    break;

                    case "/":
                        Divisao d = new Divisao();
                        d.dividir(casaDaTabuada);
                    break;

                    default:
                        System.out.println("Operação invalida.");

                }
                
            } catch (InputMismatchException exception) {
                System.err.println("digite um numero valido.");
            }
        
            System.out.println("digite c para continuar ou qualquer tecla para sair:  ");
            opcao = entrada.next();
            

        }while(opcao.equals("c") || opcao.equals("C") );
            System.out.println("Vôce saiu do gerador de tabuada.");
        
        entrada.close(); 
    }   
          
}
        

   

    

