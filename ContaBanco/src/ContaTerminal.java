import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor, Digite seu nome completo");
        String nome = scanner.next();
        
        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.next();
  
        System.out.println("Por favor, digite o número !");
        int numero = scanner.nextInt();
        
        System.out.println("Por favor, digite o saldo !");
        float saldo = (float) scanner.nextFloat();

       System.out.println("Olá" + " " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é"+ " " + agencia + " " + ", conta" + " "+ numero + "e seu saldo" +" " + saldo + " já está disponível para saque.");
     
   
       
       

    }

}
