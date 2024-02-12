package org.example;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        String nombreCliente, cadula;
        LocalDate fecha=LocalDate.now();
        String nombreEmpleado, contrasenaEmpleado, nombreEmpleadoBD="jose",contrasenaEmpleadoBD="321";
        Integer options;
        boolean loginExitoso=false;
        int productoSeleccionado;
        Double valorProducto=0.0;
        Scanner lea = new Scanner(System.in);

        System.out.println("***** Panaderia Jairo *****");
        System.out.println("***************************");
        System.out.println("Amado empleado, inicie secion si me hace el favor: ");

       while(!loginExitoso){
           System.out.println("Digite el usuario: ");
           nombreEmpleado=lea.nextLine();
           System.out.println("Digie su contrasena: ");
           contrasenaEmpleado = lea.nextLine();
           loginExitoso=true;
           if(nombreEmpleado.equals(nombreEmpleadoBD) && contrasenaEmpleado.equals(contrasenaEmpleadoBD) ){
               System.out.println("Funciona la sistemeta");
           }else{
               System.out.println("Nombre de usuario o contrasena incorrectos :(");
           }
       }

       do{
           System.out.println("Seleccione una opcion: ");
           options = lea.nextInt();
           Integer cantidadTradicional=0,cantidadGuayaba=0, cantidadArequipe=0, cantidadSieteQuesos=0;
           Integer cantidadBebidas=0;
           switch(options){
               case 1:
                   System.out.println("Pande bono tradicional: $8.000");
                   System.out.println("Pande bono guayaba: $9.500");
                   System.out.println("Pande bono arequipe: $12.000");
                   System.out.println("Pande bono siete quesos: $20.000");
                   System.out.println("*** Bebidas ***");
                   System.out.println("Chocolate: $9.500");
                   System.out.println("Cafe: $9.500");
                   do{
                       System.out.println("Producto deseado: ");
                       productoSeleccionado= lea.nextInt();
                       switch (productoSeleccionado){
                           case 1:
                               System.out.println("cantidad tradicional: ");
                               cantidadTradicional= lea.nextInt();;
                               System.out.println("cantidad guayaba: ");
                               cantidadGuayaba=lea.nextInt();
                               System.out.println("cantidad arequipe: ");
                               cantidadArequipe=lea.nextInt();
                               System.out.println("7 cueros: ");
                               cantidadSieteQuesos=lea.nextInt();
                               System.out.println("chocolate: ");
                               cantidadBebidas= lea.nextInt();
                               System.out.println("cafe: ");
                               cantidadBebidas= lea.nextInt();
                               break;
                           case 2:
                               Integer totalSinPropina=((cantidadTradicional*8.000)
                               +(cantidadGuayaba*9.500)+
                               (cantidadArequipe*12.000)+
                               (cantidadSieteQuesos*20.000)+
                               (cantidadBebidas*9.500))
                               break;
                           case 3:             

                       }
                       }
                   }while(productoSeleccionado!=6);


       }while(options!=4);


    }
}