import java.util.ArrayList;

public class Sensor{
    public static int tamano = 8;
    public static int posAnadir = 0;

    private String tipo;
    private double valor;

    public static Sensor sensores[] = new Sensor[tamano];

    public Sensor(){

    }

    public Sensor(String t, double v){
        this.tipo = t;
        this.valor = v;
    }

    public static void setTamano(int t){
        tamano = t;
    }
    public int getTamano(){
        return tamano;
    }

    public static void setPosAnadir(int p){
        posAnadir = p;
    }
    public int getPosAnadir(){
        return posAnadir;
    }

    public void setTipo(String t){
        this.tipo = t;
    }
    public String getTipo(){
        return this.tipo;
    }

    public void setValor(double v){
        this.valor = v;
    }
    public double getValor(){
        return this.valor;
    }

    public String toString(){
        return "Tipo: "+this.tipo+", Valor: "+this.valor;
    }

    public static void ingresoEnLista(Sensor s){
        sensores[posAnadir] = s;
        posAnadir++;
    }

    public static String toStringSensores(){
        int posSensor = 1;
        String t = "";
        for(int i=0; i<posAnadir; i++){
            t = t+posSensor+") "+sensores[i].toString()+"\n";
            posSensor++;
        }
        return t;
    }

    public static int cantidadSensores(){
        return posAnadir;
    }

    public static String sensoresTemp(){
        int posSensor = 1;
        String t = "";
        for(int i=0; i<posAnadir; i++){
            if(sensores[i].getTipo().equalsIgnoreCase("temperatura")){
                t = t+posSensor+") "+sensores[i].toString()+"\n";
                posSensor++;
            }
        }
        return t;
    }

    public static Sensor[] sensTempOrden(){
        ArrayList<Sensor> sensoresTemp = new ArrayList<>();
        for(int i=0; i<posAnadir; i++){
            if(sensores[i].getTipo().equalsIgnoreCase("temperatura")){
                sensoresTemp.add(sensores[i]);
            }
        }
        Sensor[] conversens = new Sensor[sensoresTemp.size()]; 
        for(int i=0; i<conversens.length; i++){
            conversens[i] = sensoresTemp.get(i);
        }
        for(int i=0; i<conversens.length; i++){
            for(int j=0; j<conversens.length-1; j++){
                if(conversens[j].getValor()>conversens[j+1].getValor()){
                    Sensor t = conversens[j];
                    conversens[j] = conversens[j+1];
                    conversens[j+1] = t;
                }
            }
        }
        return conversens;
    }

    public static String toStringLista(Sensor a[]){
        int posS = 1;
        String t = "";
        for(int i=0; i<a.length; i++){
            t = t+posS+") "+a[i].toString()+"\n";
            posS++;
        }
        return t;
    }

}

