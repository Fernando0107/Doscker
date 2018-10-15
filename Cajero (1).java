import java.lang.Math; 
import java.util.Scanner;

public class Cajero
{
    public int total(int x, int y) {
        return (x + y);
    }
    public int total(int x, int y, int z) {
        return (x + y + z);
    }
    public int total(int x, int y, int z, int w) {
        return (x + y + z + w);
    }

    public static void main(String[] args)
    {
        int a;
        int b;
        int c;
        int d;
        Scanner user = new Scanner(System.in);
        Cajero t = new Cajero();
        System.out.println("Ingrese el precio de los productos (max 4) (ingresar 0 si termino)");
        a = user.nextInt();
        b = user.nextInt();
        if (b == 0) {
            System.out.println("Su total es: Q." + a);
            System.exit(0);
        }
        c = user.nextInt();
        if (c == 0) {
            System.out.println("Su total es: Q." + t.total(a, b));
            System.exit(0);
        }
        d = user.nextInt();
        if (d == 0) {
            System.out.println("Su total es: Q." + t.total(a, b, c));
            System.exit(0);
        } else {
            System.out.println("Su total es: Q." + t.total(a, b ,c, d));
        }
    }
}

