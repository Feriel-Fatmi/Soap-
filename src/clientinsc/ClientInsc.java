
package clientinsc;

import com.test.Projet;
import com.test.Projet_Service;

/**
 *
 * @author oussama
 */
public class ClientInsc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Projet_Service ps = new Projet_Service();
        final Projet p = ps.getProjetPort();
        System.out.println(p.creerTableJava());
    }
    
}
