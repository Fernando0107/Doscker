package primitivos;

public class primitivosObjetos {

public static void main(String[]args) {
		
		int a=3;
		int b=a;
		b=100;
		
		int [] c= {1,2,3,4,5};
		int [] d=c;
		d[1]=99;
		d=new int [5];
		int e[]= {6,7,8,9};
		int f[]= {6,7,8,9};
		f[2]= 99;
		
		String g="hello";
		String h=g;
		h="goodbye";
		
		class forma {
			int lados;
			String nombre;
			String color;
		}
		
		forma forma1= new forma();
		forma1.lados=3;
		forma1.nombre="triangulo";
		forma1.color="rojo";
		
		forma forma2=new forma();
		forma2=forma1;
		
		forma2.color="verde";
	}

}
