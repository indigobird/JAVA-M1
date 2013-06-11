/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package car2.corba.rdv;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import org.omg.CORBA.ORB;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;
import rdv.FactRdv;
import rdv.FactRdvHelper;

/**
 *
 * @author fsalles
 */
public class Server {
    public static void main(String[] args) {
        try{
             // initialiser l’ORB
            ORB orb = ORB.init(args, null);
            // recuperer l’IOR du rootpoa & activer le POAManager
            POA rootpoa = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
            rootpoa.the_POAManager().activate();
            // creer le servant
            FactRdvImpl facto = new FactRdvImpl(rootpoa);
            // creer l’objet CORBA et l’enregistrer auprès du POA
            org.omg.CORBA.Object ref = rootpoa.servant_to_reference(facto);
            // Publication de l’IOR par fichier
            String IORenString = orb.object_to_string(ref);
            FileWriter fw = new FileWriter("FicPourIOR");
            fw.write(IORenString);
            fw.close();
            // Attendre les invocations des clients
            orb.run();
        }
        // Gestion des exceptions
        catch (Exception e) {
            System.err.println("ERROR: " + e);
            e.printStackTrace(System.out);
        }
    }
}
