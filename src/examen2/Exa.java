package examen2;

import java.util.*;
public class Exa {
 int eror, i,op; 
 int nip=122501,res, leernip; 
 int efectivo=50000; 
 int retiro,transac;
    String nom,tar,mont;
    Scanner cp = new Scanner(System.in);
    public int Desiciones()
    {
        System.out.println("_______BANCO UPJR_______");
    System.out.print("Ingrese su NIP=>"); 
    leernip=cp.nextInt();
        System.out.println("_________________________");
    if (nip==leernip)
    {
     System.out.println("\t+++++Su NIP es correcto bienvenido+++++");
           do{
        System.out.println("\tQue operacion desea realizar?");
          System.out.println("\t1.-Consultar saldo");
          System.out.println("\t2.-Retirar efectivo");
          System.out.println("\t3.-Transferencia");
          System.out.print("\tingrese la operacion arealizar=>");
          op=cp.nextInt();
               System.out.println("\t++++++++++++++++++++++++++++");
        switch(op)
        {
            case 1:System.out.print("Su saldo actual es de"+efectivo);
            break;
            case 2:System.out.print("Ingrese la cantidad que desea retirar=>");
            retiro=cp.nextInt();
            efectivo=efectivo-retiro;
                System.out.println("Ahora su saldo es de=>"+efectivo);
            break;
                    case 3:System.out.println("\t-----envio de efectivo------");
                        System.out.print("Ingrese el nombre de la persona ah quien se le hara la transaccion=>");
                        nom=cp.next();
                        System.out.print("Ingrese el numero de tarjeta de "+nom+"=>");
                        tar=cp.next();
                        System.out.print("Ingrese el monto que le enviara ah "+nom+" con numero de tarjeta "+tar+"=>");
                        mont=cp.next();
                        System.out.print("Se ah enviado correctamnete los $"+mont+" ah "+nom+ " con numero de tarjeta "+tar);
                        System.out.println("\t------------------------------------------");
                    break;
        }
               System.out.println("\t**********************************");
               System.out.print("\tDesea realizar otra Accion?");
               System.out.print("\t1 para si, 2 para no=>");
               res=cp.nextInt();
               System.out.println("\t**********************************");
    }while(res==1);
           
    }
    else
    {
        for(i=0;i<2;i++)
        {
     if(leernip!=nip);
    {
    System.out.println("*****Su NIP no es correcto*****"); 
        System.out.print("Ingresar su NIP nuevamente=>");
        leernip=cp.nextInt();
    }
        }
    if(nip!=leernip)
    {
        System.out.println("\txxxxxxx-Su cuenta ah sido bloqueada por 10 horas-xxxxxxx");
    }
        
    if(leernip==nip)
    { 
       System.out.println("\t+++++Su NIP es correcto+++++");
           do{
        System.out.println("\tQue operacion desea realizar=>");
          System.out.println("\t1.-saldo existente");
          System.out.println("\t2.retiro de efectivo");
          System.out.println("\t3.Transaccion");
          System.out.print("ingrese la operacion arealizar=>");
          op=cp.nextInt();
               System.out.println("\t++++++++++++++++++++++++++++");
        switch(op)
        {
           case 1:System.out.print("\nSu saldo es de"+efectivo);
            break;
            case 2:System.out.print("ingrese la cantidad que desea retirar=>");
            retiro=cp.nextInt();
            efectivo=efectivo-retiro;
                System.out.println("su saldo es de=>"+efectivo);
            break;
                    case 3:System.out.println("\t----envio de efectivo-----");
                        System.out.print("Ingrese el nombre de la persona veneficiaria=>");
                        nom=cp.next();
                        System.out.print("Ingrese el numero de tarjeta de "+nom+"=>");
                        tar=cp.next();
                        System.out.print("Ingrese le monto que le enviara a "+nom+ "con numero de tarjeta" +tar+"=>");
                        mont=cp.next();
                        System.out.println("Se ah enviado correctamnete "+mont+" ah "+nom+" con numero de tarjeta "+tar);
                        System.out.print("\t------------------------------------------");
                    break;
        }
               System.out.println("\t**********************************");
               System.out.print("\n\tQuiere realizar otra Accion?");
               System.out.print("\n\t1 para si, 2 para no=>");
               res=cp.nextInt();
               System.out.println("\t**********************************");
    }while(res==1);
    }
    }
       return 0;   
    }
   
}

 

    

