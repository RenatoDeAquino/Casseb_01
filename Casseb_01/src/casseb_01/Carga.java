
package casseb_01;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Carga extends Thread{
    int dimensao;
    String id;
    public Carga(int dimensao, String id){
        this.id = id;
        this.dimensao = dimensao;
    }
    
    public void load(){
        for (int i = 0; i < dimensao; i++) {
            System.out.println("O "+this.id+" processou o "+i);
        }
        
        try {
            sleep(50);
        } catch (InterruptedException ex){
            Logger.getLogger(Carga.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void run(){
        this.load();
    }
}
