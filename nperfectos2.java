import java.util.Scanner;
public class nperfectos2 {

    public static void main(String[] args) {
        
        //Sacar numeros perfectos menores al numero ingresado
        
        Scanner input=new Scanner(System.in);
        System.out.println("Ingresa un numero");
        
        long b=Long.parseLong(input.next());
        long cont=0;
        boolean p=false;
        
        for(long i=1; i<b; i++){
            for(long j=1; j<i; j++){
                if(i%j==0){
                    cont+=j;
                }
            }
            if(cont==i){
                System.out.println(i+" es perfecto");
                p=true;
            }
            cont=0;
        }
        if(p==false){
            System.out.println("No hay perfectos");
        }
    }
}
