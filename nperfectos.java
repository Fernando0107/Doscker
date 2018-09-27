import java.util.Scanner;
public class nperfectos {

    public static void main(String[] args) {
        
        //Verificar si el numero ingresado es perfecto
        
        Scanner input=new Scanner(System.in);
        System.out.println("Ingresa un numero");
        
        int a=Integer.parseInt(input.next());
        int cont=0;
        
        for(int i=1; i<a; i++){
            if(a%i==0){
                cont+=i;
            }
        }
        
        if(cont==a){
            System.out.println("Es perfecto");
        }else{
            System.out.println("No es perfecto");
        }
    }
}
