package casseb_01;

public class Casseb_01 {

    public static void main(String[] args) {
        Carga c1 = new Carga(80,"Tork");
        Carga c2 = new Carga(100,"Demasi");
        Carga c3 = new Carga(1200,"Renato");
        
        c3.start();
        c2.start();
        c1.start();
                
    }
}
