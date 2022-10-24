public class Vehiculo{
    public static int tamano = 10;
    public static int posAnadir = 0;
    
    private int modelo;
    private String marca;
    private double valorComercial;
    private String color;

    public static Vehiculo[] vehiculos = new Vehiculo[tamano];
    
    public Vehiculo(){

    }

    public Vehiculo(int mo, String ma, double va){
        this(mo,ma,va,"verde");
    }

    public Vehiculo(int mo, String ma, double va, String co){
        this.modelo = mo;
        this.marca = ma;
        this.valorComercial = va;
        this.color = co;
    }

    public static void setTamano(int n){
        tamano = n;
    }
    public int getTamano(){
        return tamano;
    }

    public static void setPosAnadir(int n){
        posAnadir = n;
    }
    public int getPosAnadir(){
        return posAnadir;
    }

    public void setModelo(int n){
        this.modelo = n;
    }
    public int getModelo(){
        return this.modelo;
    }

    public void setMarca(String m){
        this.marca = m;
    }
    public String getMarca(){
        return this.marca;
    }

    public void setValorComercial(double n){
        this.valorComercial = n;
    }
    public double getValorComercial(){
        return this.valorComercial;
    }

    public void setColor(String c){
        this.color = c;
    }
    public String getColor(){
        return this.color;
    }

    public String toString(){
        return "Modelo: "+this.modelo+", Marca: "+this.marca+", Valor Comercial: "+this.valorComercial+", Color: "+this.color;
    }

    public static void ingresoEnLista(Vehiculo c){
        vehiculos[posAnadir] = c;
        posAnadir++;
    }

    public static String toStringVehiculos(){
        int posVehiculo = 1;
        String t = "";
        for(int i=0; i<posAnadir; i++){
            t = t+posVehiculo+") "+vehiculos[i].toString()+"\n";
            posVehiculo++;
        }
        return t;
    }

    public static int cantidadVehiculos(){
        return posAnadir;
    }

    public static String vehiculosVerdes(){
        int posVerde = 1;
        String t = "";
        for(int i=0; i<posAnadir; i++){
            if(vehiculos[i].getColor().equalsIgnoreCase("verde")){
               t = t+posVerde+") "+vehiculos[i].toString()+"\n";
               posVerde++;
            }
        }
        return t;
    }

    public static String modeloEntre2000y2021(){
        int posModel = 1;
        String t = "";
        for(int i=0; i<posAnadir; i++){
            if(vehiculos[i].getModelo()>=2000 && vehiculos[i].getModelo()<=2021){
                t = t+posModel+") "+vehiculos[i].toString()+"\n";
                posModel++;
            }
        }
        return t;
    }

}