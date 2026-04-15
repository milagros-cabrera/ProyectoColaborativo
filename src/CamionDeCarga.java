public class CamionDeCarga extends Vehiculo implements IConectable{
    @Override
    public void patronMovimiento(){
        System.out.println("El camion avanza lentamente con la carga.");
    }
    @Override
    public void sincronizarGPS(){
        System.out.println("Se monitorea el trayecto del camion de carga");
    }

}
