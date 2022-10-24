import java.util.Scanner;
public class Principal{

    public static void mostrarMenu(){
        System.out.println("Ingrese 0 para Cerrar \nIngrese 1 para crear un Vehiculo \nIngrese 2 para ver la informacion de todos los vehiculos almacenados \nIngrese 3 para ver cuantos vehiculos se han creado \nIngrese 4 para ver la informacion de los vehiculos de color verde \nIngrese 5 para ver la informacion de los vehiculos de modelo entre 2000 y 2021 \nIngrese 6 para crear un Sensor \nIngrese 7 para ver la informacion de todos los sensores almacenados \nIngrese 8 para ver cuantos sensores se han creado \nIngrese 9 para ver la informacion de todos los sensores de tipo temperatura \nIngrese 666 para ver los sensores de tipo temperatura ordenados de menor a mayor");

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("Ingrese su opcion: ");
            int i = sc.nextInt();
            if(i==0){
                break;
            }
            else if(i==1){
                if(Vehiculo.posAnadir<Vehiculo.tamano){
                    System.out.print("Ingrese el modelo del vehiculo: ");
                    int moo = sc.nextInt();
                    System.out.print("Ingrese la marca del vehiculo: ");
                    String maa = sc.next();
                    System.out.print("Ingrese el valor comercial del vehiculo: ");
                    double vc = sc.nextDouble();
                    System.out.print("Ingrese el color del vehiculo: ");
                    String col = sc.next();
                    Vehiculo v = new Vehiculo(moo, maa, vc, col);
                    v.ingresoEnLista(v);
                }
                else{
                    System.out.println("Error base de datos llena");
                }
            }
            else if(i==2){
                System.out.println(Vehiculo.toStringVehiculos());
            }
            else if(i==3){
                System.out.println("La cantidad de vehiculos creados hasta ahora es: "+Vehiculo.cantidadVehiculos());
            }
            else if(i==4){
                System.out.println(Vehiculo.vehiculosVerdes());
            }
            else if(i==5){
                System.out.println(Vehiculo.modeloEntre2000y2021());
            }
            else if(i==6){
                if(Sensor.posAnadir<Sensor.tamano){
                    System.out.print("Ingrese el tipo del sensor: ");
                    String ti = sc.next();
                    System.out.print("Ingrese el valor del sensor: ");
                    double va = sc.nextDouble();
                    Sensor s = new Sensor(ti, va);
                    s.ingresoEnLista(s);
                }
                else{
                    System.out.println("Error base de datos llena");
                }
            }
            else if(i==7){
                System.out.println(Sensor.toStringSensores());
            }
            else if(i==8){
                System.out.println("La cantidad de sensores creados hasta ahora es: "+Sensor.cantidadSensores());
            }
            else if(i==9){
                System.out.println(Sensor.sensoresTemp());
            }
            else if(i==666){
                Sensor[] STO = Sensor.sensTempOrden();
                System.out.println(Sensor.toStringLista(STO));
            }
        }
    }

    public static void main(String[] args){
        Principal.mostrarMenu();
    }

}