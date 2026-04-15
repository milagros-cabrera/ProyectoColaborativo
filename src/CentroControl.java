import java.util.ArrayList;

public class CentroControl {
    private ArrayList<Vehiculo> listaDeVehiculos;
    public CentroControl(){
        this.listaDeVehiculos=new ArrayList<>();
    }

    public void registrarUnidad(Vehiculo v){
        listaDeVehiculos.add(v);
    }

    public void monitorearFlota(){
        for(Vehiculo v:listaDeVehiculos){
            v.patronMovimiento();
        }
    }

}
