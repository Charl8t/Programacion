 //package Actividades;
//import java.time.LocalDateTime;
//import java.util.Scanner;
//import utilidades.matematicas;



 public class Actividades {
   public static void main(String[] args) {
   
    
// //Realiza un programa que genera 2 numeros y nos diga el cociente, la media, la potencia, y la raiz cuadrada.


// //Sacar dos numeros
// // int min=1, max=10;

// // int aleatorio1=(int)(Math.random()*(max-min+1)+min);
// // double aleatorio2=(int)(Math.random()*(max-min+1)+min);

// // double division=aleatorio1/aleatorio2;
// // double media=(aleatorio1+aleatorio2)/2.0;


// // //Realizar ops
// // System.out.println("Los numeros generados son: " +aleatorio1+ "y" +aleatorio2);
// // System.out.println("La division es " +media);
// // System.out.println("La potencia vale " +Math.pow(aleatorio1,aleatorio2));


// //¿Como sabemos si un numero es divisible por 2 y por 3?

// int numero=6;

// // if(numero%2==0 && numero%3==0){
// //    System.out.println("Divisible por 2 y 3");
// // }
// // else{
// //    System.out.println("No es divisible por 2 y 3");

// // }


// // int max=15;
// // int min=1;
// // double aleatorio=(int)(Math.random()*(max-min+1)+min);

// // System.out.println(aleatorio);



// // switch(numero) {
// //  case 0:;
// //     System.out.println("Divisible por 2 y 3");


// //  }

//
// int a, b, c;

// Scanner sc = new Scanner(System.in);

// a=Integer.parseInt(sc.nextLine());
// b=Integer.parseInt(sc.nextLine());
// c=Integer.parseInt(sc.nextLine());

// int variable=b*b-4*a*c;


// if(variable<0){
//    System.out.println("No soluciones" );
// }

// else if(variable=0){
//    x1=b/(2.0*a);
//    System.out.println("La solucion es "+x1);
// }
// else{
//    x1=(-b+math.sqrt(variable)/(2.0*a));
//    x=(-b-math.sqrt(variable)/(2.0*a));
//    System.out.println("La primera solucion es "+x1);
//    System.out.println("La segunda solucion es "+x2);

// } 

//-----------------------------------------------------------------------------------------

// Scanner sc=new Scanner(System.in);

// int nota = scanner.nextInt();

// if(nota<0){
//    System.out.println("Nota incorrecta");
// }
// else if(nota<5){
//    System.out.println("Suspenso");
// }
// else if(nota<7){
//    System.out.println("bien");
// }
// else if(nota<9){
//    System.out.println("notable");
// }
// else if(nota>9){
//    System.out.println("sobresaliente");

//  }

//-----------------------------------------------------------------------------------------

// Scanner sc=new Scanner(System.in);

// int dia, mes, year;
// dia=sc.nextInt();
// mes=sc.nextInt();
// year=sc.nextInt(); sc.nextLine();

// //year%4==0&&year%100!=0


// if (year!=0) {
//    System.out.println("El año es: " +year);
// }
// // else (
// //    System.out.println("El no es valido");
// // )

// // if (mes<=12) {

// // // else if (mes==2) {
// // //    if (day<=29) {
// // //        System.out.println("El mes es" +mes);
// // //    }
// // // }
// // System.out.println("El mes es: " +mes);
// }

// // else (
// //    System.out.println("El mes no es valido");
// // )

// if (dia<=31&&dia>0) && (mes>0 && mes<=12){
//    if (dia==29 && mes==2){
//    if(year%4==0&&year%100!=0)
//    }
//    System.out.println("La dia es corecta");
// }
// // else(
// // System.out.println("La dia no es valido");
// // )



//-----------------------------------------------------------------------------------------




//  for (int i=50;i<200;i++) {
//     if (i%2==0 && i%3==0) {
//    System.out.println(i);
//     }
//  }


// Scanner sc = new Scanner(System.in);
// System.out.println("introduce numero");
// int numero=sc.nextInt();
// int producto=1;

//   for(int i=numero;i>=1;i--) {
//     producto=producto*1;
//     }
//     System.out.println("El factorial de " +numero+" es "+producto);


// while (numero>0) {
//   producto=producto*numero;
//   numero--;
// }
// System.out.println("El factorial de " +numero+" es "+producto);

//
// Scanner sc = new Scanner(System.in);
// int minimo=0;
// int maximo=0;
// int numero;
// int contador=0;

// int suma=0;
// int contAdultos=0;
// int total=0;

// //repetir hasta -1
// do{
//   System.out.println("Escribe la edad: ");
//   numero=sc.nextInt(); sc.nextLine();

// if (contador==0) {
//   minimo=numero;
//   maximo=numero;
//   contador++;
//  }
//  if (numero>maximo) {
//   maximo=numero;
//  }
// if ((numero<minimo)&&(numero!=-1)){
//   minimo=numero;
// }
// if (numero!=-1) {
// suma=suma+numero;
// total++;
// }
// if (numero>=18) {
//   contAdultos++;
// }

// }while (numero!=-1);
//   System.out.println("El maximo es: " +maximo);
//   System.out.println("El minimo es: " +minimo);
// System.out.println("El total es: " +total);
// System.out.println("La suma es: " +suma);
// System.out.println("El promedio es: " +(suma/(double)total));


//-----------------------------------------------------------------------------------------

//  int max=100;
//  int min=1;
//  double aleatorio=(int)(Math.random()*(max-min+1)+min);
// int contador=0;
// boolean encontrado=false;


//  Scanner sc=new Scanner(System.in);
//   int numero;
//   do{System.out.println("Adivinar el numero");
//   numero=sc.nextInt(); sc.nextLine();

 


//  if (numero<aleatorio) {
//   System.out.println("El numer es mayor al introducido");
//  }

//  else if (numero>aleatorio) {
//   System.out.println("El numero es menor al introducido");
//  }
// else if (numero==aleatorio) {
//   System.out.println("El numero es " +aleatorio);
// }
// contador++;
//  }while(numero!=aleatorio);
// System.out.println("Has intentado " +contador+ " veces ");

//

//-----------------------------------------------UnfinishedVVV
//menu: press a to add, press b to sub...
//-1 = exit

// int a;
// int b;
// int c;
// int d;
// //int -1;
// int operacion;

// Scanner sc=new Scanner(System.in);
// int numero1;
// System.out.println("Introduce el numero");
// numero1=sc.nextInt(); sc.nextLine();



// System.out.println("Sumar=a, Restar=b, Multiplicar=c, Dividir=d");
// operacion=sc.nextInt(); sc.nextLine();

//-----------------------------------------------------------------------------------------

// int a=0;
// int b=0; 
// int mcd=0;

// Scanner sc=new Scanner(System.in);
// System.out.println("introduce el valor a");
// a=sc.nextInt(); sc.nextLine();


// System.out.println("introduce el valor b");
// b=sc.nextInt(); sc.nextLine();

// do{

// }while (condition) {
  
// }

// System.out.println("El MCD es: " +mcd);


//----------------------------------------------------------------------------------------
//Tablas de multiplicacion

// for(int i=1;i<=10;i++){

// for(int j=1;j<=10;j++){
//   System.out.println(+i+ "X" +j+ "=" +i*j);
// }
// }

//-----------------------------------------------------
//FUNCIONES
// imprimir("Imprime ", 5);
// imprimir("Suma ", +suma(3, 5));

// Clean up main by putting it all in functions using Ctr+K U

//
// double radio=3;
// double altura=5;
// AreaCilindro(radio, altura);

//--------------------------------------------------------------------------------------

// int a=0;
// int b=0;

// b=Math.abs(b);
// int mayor;
// int maximo;
// if(a>=b){
//   maximo=a;
// }
// else{
//   maximo=b;
// }
// int mcm=mayor;
// while (mcm%a!=0) {
//   mcm=mcm+mayor;
// }
// System.out.println(mcm);

//------------------------------------------------------------------------------

//func espar = true/false (boolean)
//func esdivisible diito
//procedimiento num 1 to 20
// int inicio=50;
// int fin=100;
// imprimirNumeros(inicio,fin);


//---------------------------------------------------------------------------------

} //main
//  public static void imprimir(String cadena,int variable){
//    System.out.println(cadena+variable);
//  }
// public static int suma(int a, int b){
//   return a+b;
// }

//---------------------------------------------------------------------
// final static double PI=3.14159;


// public static void AreaCilindro(double radio, double altura){
//   double area=2*PI*(altura+radio);
//   System.out.println(+area);
//}
//---------------------------------------------------------------------
// public static boolean esPar(int numero) {
//   if (numero%2==0) return true;
//     else{return false;}
// }
// public static boolean esDivisible2y3(int numero){
//   if (numero%2==0;numero%3==0) {
//     return true;
//   }
// else{return false;}
// }

// public static void imprimirNumeros(int inicio, int fin){
//   for(int i=1;i<=20;i++)
//     if(esPar(1) && esDivisible2y3(1))
//       System.out.println(i+" ,");
// }

}
