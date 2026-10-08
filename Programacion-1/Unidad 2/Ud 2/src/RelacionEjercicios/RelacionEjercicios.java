package RelacionEjercicios;
import java.time.LocalDateTime;
import java.util.Scanner;

public class RelacionEjercicios {
public static void main(String[] args) {
    

//Ejercicio 1

//Scan time, if x then y 

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
//Ejercicio 3
// introduce day, introduce month: scan
//Switch: 12 months

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
// read numbers, calculate mean
//>5 Pass, <5 Recuperation


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
//1-5: Day Itinerary
//6: Full Timetable
//7: close

int lunes=1,martes=2,miercoles=3,jueves=4,viernes=5,completo=6,cerrar=7;

System.out.println("Introduce la dia");
Scanner sc=new Scanner(System.in);
int dia = sc.nextInt();

if(dia==lunes){
    System.out.println("Ent. de Desarrollo, Lenguajes de Marcas, BBDD, Sist. Inf., Programacion");
}else{
    if(dia==martes){
        System.out.println("Sist Inf, Digitalizacion, IPE, Sostenibilidad, Programacion");
    }
}
{
    if(dia==miercoles){
        System.out.println("Programacion, IPE, BBDD, Programacion");
    }
}
{
    if(dia==jueves){
        System.out.println("Leng. de Marcas, BBDD, Programacion");
    }
}
{
    if(dia==viernes){
        System.out.println("Sist. Inf, BBDD, Ent. de Desarrollo, IPE");
    }
}
{
    if(dia==completo){
        System.out.println("Horario completo: "+lunes+", "+martes+", "+miercoles+", "+jueves+", "+viernes);
    }
}
{
    if(dia==cerrar){
        System.out.println("Cerrar");
    }
}
//Ejercicio 6-------------------------------------------------------------------------
//Save position, days of travel, marital status.
//Save Base payment
//Calculate extra and tax

int nomina;
int Prog.junior, prog.senior, JefeProyecto;
int dias;
int estadoCivil;




//System.out.println("");
}//main
}//end

