import java.util.ArrayList;
import java.util.List;

public class Catraca {

    List<String> listaPassou = new ArrayList<>();

    public void getListaPassou() {
        System.out.println("REGISTROS:");
        System.out.println();
        for(int i =0; i < listaPassou.size(); i++){
            System.out.println(listaPassou.get(i));
        }
    }

    public void cadastrarCatraca(Cracha cracha){
        listaPassou.add("Crachá: " + cracha.getNumCracha() + " Entrada: " + cracha.getDataEntrada() + " Saída: " + cracha.getDataSaida());
    }
}
