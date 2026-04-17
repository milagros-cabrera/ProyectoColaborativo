import java.util.ArrayList;
import java.util.List;

public class CentroControl {
    private List<Vehiculo> ListaDeVehiculos;

    public CentroControl(){
        this.listaDeVehiculos = new ArrayList<>();
    }

    public void registrarUnidad(Vehiculo v){
        listaDeVehiculos.add(v);
    }

    public void monitorearFlota(){
        for(Vehiculo v:listaDeVehiculos){
            v.patronMovimiento();
            if (v instanceof IConectable) {
                IConectable unidadGps = (IConectable) v;
                unidadGps.sincronizarGPS();
            }
        }
    }

}
