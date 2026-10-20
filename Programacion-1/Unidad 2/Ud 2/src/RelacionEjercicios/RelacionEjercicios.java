package RelacionEjercicios;
import java.time.LocalDateTime;
import java.util.Scanner;

public class RelacionEjercicios {
public static void main(String[] args) {
    

//Ejercicio 1

    

LocalDateTime hour = LocalDateTime.now();
//int hour=hora;

// System.out.println(hour.getHour());

if (hour.getHour()>=6 && hour.getHour()<=12){
    System.out.println("Buenas Dias");
}
else{
    if (hour.getHour()>=13 && hour.getHour()<=20) {
        System.out.println("Buenas Tardes");
    }
else{
    if(hour.getHour()>=21 && hour.getHour()<=5){
        System.out.println("Buenas Noches");
    }
}
}
//--------------------------------------------------------------------------------------------
//Ejercicio 2

// int HorasTrabajado;
// int Pago;
// Scanner sc=new Scanner(System.in);
// System.out.println("Introduce el numero de horas trabajado: ");
// HorasTrabajado=sc.nextInt(); sc.nextLine();

// if (HorasTrabajado<41) {
//     Pago=HorasTrabajado*12;
// System.out.println("El suedo semanal correspnde a " +Pago+ " euros");
// }
// else{
//     Pago=HorasTrabajado*16;
// System.out.println("El suedo semanal correspnde a " +Pago+ " euros");
// }


//--------------------------------------------------------------------
//Ejercicio 3:

// int mes;
// int dia;
// Scanner sc=new Scanner(System.in);
// System.out.println("Introduce el dia y mes de nacimiento: ");
// dia=sc.nextInt(); mes=sc.nextInt(); sc.nextLine();


// switch (mes) {
//     case 1:
//         if(dia>=1 && dia<=19){
//     System.out.println("CAP");
//         }
//         else{
//             System.out.println("AQU");
//         }
//         break;
//     case 2:
//         if(dia>=20 && dia<=29){
//         System.out.println("AQU");
//         }
//         else{
//             System.out.println("CAP");
//         }
//         break;

//     case 3:
//         if(dia>=20 && dia<=31){
//         System.out.println("PSC");
//         }
//         else{
//             System.out.println("AQU");
//         }
//         break;
//     case 4:
//         if(dia>=21 && dia<=31){
//         System.out.println("ARI");
//         }
//         else{
//             System.out.println("PSC");
//         }
//         break;
//     case 5:
//         if(dia>=21 && dia<=31){
//         System.out.println("TAU");
//         }
//         else{
//             System.out.println("ARI");
//         }
//         break;
//     case 6:
//         if(dia>=21 && dia<=31){
//         System.out.println("GEM");
//         }
//         else{
//             System.out.println("TAU");
//         }
//         break;
//     case 7:
//         if(dia>=21 && dia<=31){
//         System.out.println("CAN");
//         }
//         else{
//             System.out.println("GEM");
//         }
//         break;
//     case 8:
//         if(dia>=23 && dia<=31){
//         System.out.println("LEO");
//         }
//         else{
//             System.out.println("CAN");
//         }
//         break;
//     case 9:
//         if (dia>=23 && dia<=31) {
//         System.out.println("VIR");
//         }
//         else{
//             System.out.println("LEO");
//         }
//         break;
//     case 10:
//         if (dia>=23 && dia<=31) {
//         System.out.println("LIB");
//         }
//         else{
//             System.out.println("VIR");
//         }
//         break;
//     case 11:
//         if(dia>=23 && dia<=31){
//         System.out.println("SCO");
//         }
//         else{
//             System.out.println("LIB");
//         }
//         break;
//     case 12:
//         if(dia>=23 && dia<=31){
//         System.out.println("SAG");
//         }
//         else{
//             System.out.println("SCO");
//         }
//         break;
//     case 13:
//         if(dia>=1 && dia<=22){
//         System.out.println("CAP");
//         }
//         else{
//             System.out.println("SAG");
//         }
//         break;

//     default:
//         break;
// }

//Ej 4 ----------------------------------------------------------


// int control1,control2,notarecuperacion;

// System.out.println("Introduce las notas");
//  Scanner sc=new Scanner(System.in);
// control1 = sc.nextInt(); 
// control2 = sc.nextInt(); sc.nextLine();

// if(control1+control2%2>=5){
//     System.out.println("Aprobado: " +control1+control2%2);
// }
// else{
//     System.out.println("Introduce el resultado de la Recuperacion");
//     notarecuperacion=sc.nextInt(); sc.nextLine();
//     if((control1+control2+notarecuperacion)/3>=5){
//         System.out.println("Aprobado:5");
//     }
//     else{
//         System.out.println("Suspenso: " +control1+control2%2);
//     }
// }

//Ejercicio5-------------------------------------------------------------------------

    
// int lunes=1,martes=2,miercoles=3,jueves=4,viernes=5,completo=6,cerrar=7;

// System.out.println("Introduce la dia");
// Scanner sc=new Scanner(System.in);
// int dia = sc.nextInt();

// if(dia==lunes){
//     System.out.println("Ent. de Desarrollo, Lenguajes de Marcas, BBDD, Sist. Inf., Programacion");
// }else{
//     if(dia==martes){
//         System.out.println("Sist Inf, Digitalizacion, IPE, Sostenibilidad, Programacion");
//     }
// }
// {
//     if(dia==miercoles){
//         System.out.println("Programacion, IPE, BBDD, Programacion");
//     }
// }
// {
//     if(dia==jueves){
//         System.out.println("Leng. de Marcas, BBDD, Programacion");
//     }
// }
// {
//     if(dia==viernes){
//         System.out.println("Sist. Inf, BBDD, Ent. de Desarrollo, IPE");
//     }
// }
// {
//     if(dia==completo){
//         System.out.println("Horario completo: "+lunes+", "+martes+", "+miercoles+", "+jueves+", "+viernes);
//     }
// }
// {
//     if(dia==cerrar){
//         System.out.println("Cerrar");
//     }
// }
//Ejercicio 6-------------------------------------------------------------------------
    

// int nomina1=950,nomina2=1200,nomina3=1600;

// System.out.println("Introduce el cargo(1-3)");
// Scanner sc=new Scanner(System.in);
// int cargo = sc.nextInt(); sc.nextLine();
// System.out.println("Introduce las dias de viaje");
// int dias = sc.nextInt(); sc.nextLine();
// System.out.println("Introduzca su estado civil (1: Soltero, 2: Casado)");
// int estadoCivil = sc.nextInt(); sc.nextLine();

// if (cargo==1) {
//     System.out.println("Sueldo base: "+nomina1);
//     if (dias>0) {
//     System.out.println("Dietas (" +dias+ "): " +dias*30+ " euros");
// }

// System.out.println("Sueldo bruto:" +((nomina1)+(dias*30))+ " euros");
// if (estadoCivil==1) {
//     System.out.println("Retencion IRPF (25%) " +(((nomina1)+(dias*30))*0.25)+ " euros");
//     System.out.println("Sueldo neto: " +(((nomina3)+(dias*30))-(((nomina3)+(dias*30))*0.25)) + " euros");
// }else{
//         System.out.println("Retencion IRPF (20%) " +(((nomina1)+(dias*30))*0.20)+ " euros");
//         System.out.println("Sueldo neto: " +(((nomina3)+(dias*30))-(((nomina3)+(dias*30))*0.20)) + " euros");
// }
// }


// if (cargo==2) {
//     System.out.println("Sueldo base: "+nomina2);
// if (dias>0) {
//     System.out.println("Dietas (" +dias+ "): " +dias*30+ " euros");
// }
// System.out.println("Sueldo bruto :" +((nomina2)+(dias*30))+ " euros");
// if (estadoCivil==1) {
//     System.out.println("Retencion IRPF (25%) " +(((nomina2)+(dias*30))*0.25)+ " euros");
//     System.out.println("Sueldo neto: " +(((nomina3)+(dias*30))-(((nomina3)+(dias*30))*0.25)) + " euros");
// }else{
//         System.out.println("Retencion IRPF (20%) " +(((nomina2)+(dias*30))*0.20)+ " euros");
//         System.out.println("Sueldo neto: " +(((nomina3)+(dias*30))-(((nomina3)+(dias*30))*0.20)) + " euros");
// }
// }

// if (cargo==3) {
//     System.out.println("Sueldo base: "+nomina3);
// if (dias>0) {
//     System.out.println("Dietas (" +dias+ "): " +dias*30+ " euros");
// }
// System.out.println("Sueldo bruto: " +((nomina3)+(dias*30))+ " euros");
// if (estadoCivil==1) {
//     System.out.println("Retencion IRPF (25%) " +(((nomina3)+(dias*30))*0.25)+ " euros");
//     System.out.println("Sueldo neto: " +(((nomina3)+(dias*30))-(((nomina3)+(dias*30))*0.25)) + " euros");
// }else{
//         System.out.println("Retencion IRPF (20%) " +(((nomina3)+(dias*30))*0.20)+ " euros");
//         System.out.println("Sueldo neto: " +(((nomina3)+(dias*30))-(((nomina3)+(dias*30))*0.20)) + " euros");
// }
// }

//Ejercicio 7-------------------------------------------------------------------------


//int positivos=0;
//int negativos=0;
//int suma=0;
//int contador=0;
//int siete=0;

 //System.out.println("Introduce el Numero");
 //Scanner sc=new Scanner(System.in);
 //int numero=sc.nextInt(); sc.nextLine();

//while (numero!=0); {
    //if (numero>0) {
        //positivos++;
    //}
    //else{
        //negativos++;
    //}
    
    //if (numero==7 || numero==-7) {
        //siete++;
    //}

    //suma+=numero;
    //contador++;
    //System.out.println("Numero: " +numero);
//}

//if (contador>0) {
//    System.out.println("Media: " +(double)suma/contador);
//    System.out.println("Poitivos: " +positivos);
//    System.out.println("Negativos: " +negativos);
//    System.out.println("Repeticiones de siete: " +siete);
//}
//else{
//    System.out.println("No se han introducido numeros");
//}

//Ejercicio 8-------------------------------------------------------------------------


//System.out.println("Introducir n (n>=1)");
//int n=sc.nextInt(); sc.nextLine();

//int a=0;
//int b=1;
//System.out.print(a);
//for (int i=1; i<=n; i++) {
//    System.out.print(", "+b);
//    int siguiente=a+b;
//    a=b;
//    b=siguiente;
//}
//System.out.println();

//Ampliacion (Ejercicio 8 con funcion recursiva)
//for (int i=0; i<=n; i++) {
//    System.out.print(fibonacci(i));
//    if (i<n) {
//        System.out.print(", ");
//    }
//}
//System.out.println();





//Ejercicio 9----------‐-------------

//System.out.println("Numeros primos entre 1 y 100:");
//for (int i=1; i<=100; i++) {
//    if (esPrimo(i)) {
//        System.out.print(i+" ");
 //   }
//}
//System.out.println();


//Ejercicio 10-------------------------------------------------------------------------


System.out.println("Introduce un numero");
int num=sc.nextInt(); sc.nextLine();

int contarPares(int n){
    n=Math.abs(n);
    if (n==0) {
        return 1; 
    }
    int pares=0;
    while (n>0) {
        int digito=n%10;
        if (digito%2==0) {
            pares++;
        }
        n/=10;
    }
    return pares;
}
    
public static int contarImpares(int n){
    n=Math.abs(n);
    int impares=0;
    while (n>0) {
        int digito=n%10;
        if (digito%2!=0) {
            impares++;
        }
        n/=10;
    }
    return impares;
}
    
System.out.println("El " +num+ " contiene " +contarPares(num)+ " digitos pares y " +contarImpares(num)+ " digitos impares");
}//main

    
    //Funciones-------------------------------------------------------------------------

//Ampliacion Ej 8: Fibonacci recursivo (fibonacci(0)=0, fibonacci(1)=1)
public static int fibonacci(int k){
    if (k<=1) {
        return k;
    }
    return fibonacci(k-1)+fibonacci(k-2);
}

//Ej 9: a partir del pseudocodigo EsPrimo
public static boolean esPrimo(int n){
    boolean primo=true;
    if (n<=1) {
        primo=false;
    }
    else{
        for (int i=2; i<=Math.sqrt(n); i++) {
            if (n%i==0) {
                primo=false;
                break;
            }
        }
    }
    return primo;
}


}//end

