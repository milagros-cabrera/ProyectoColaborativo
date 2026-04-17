import java.util.ArrayList;
import java.util.List;

public class CentroControl {
    private List<Vehiculo> listaDeVehiculos;

    public CentroControl(){
        this.listaDeVehiculos = new ArrayList<>();
    }

    public void registrarUnidad(Vehiculo v){
        listaDeVehiculos.add(v);
    }

    public void monitorearFlota(){
        for(Vehiculo v:listaDeVehiculos){
            v.patronMovimiento();
            if (v instanceof IConectable unidadGps) {
                unidadGps.sincronizarGPS();
            }
        }
    }

}
