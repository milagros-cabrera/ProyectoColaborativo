public class TransportePublico extends Vehiculo{
    
    public TransportePublico(int id) {
        super(id); 
    }
    
    @Override
    public void patronMovimiento(){
        System.out.println("El transporte avanza de forma segura con los pasajeros a bordo.");
    }
}
