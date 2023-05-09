import java.util.Date;

public class Cracha {
    private int numCracha;
    private String dataEntrada;
    private String dataSaida;

    public Cracha(int numCracha, String colaborador) {
        this.numCracha = numCracha;
    }

    public int getNumCracha() {
        return this.numCracha;
    }

    public String getDataEntrada() {
        return this.dataEntrada;
    }

    public String getDataSaida() {
        return this.dataSaida;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada.getDate() + "/" + (dataEntrada.getMonth() + 1) + "/" + (dataEntrada.getYear() + 1900) + " às " + dataEntrada.getHours() + ":" + dataEntrada.getMinutes();
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida.getDate() + "/" + (dataSaida.getMonth() + 1) + "/" + (dataSaida.getYear() + 1900) + " às " + dataSaida.getHours() + ":" + (dataSaida.getMinutes() + 5);
    }

    public void passarCracha(){
        if(this.getDataEntrada() == null){
            this.setDataEntrada(new Date());
        }else if(this.getDataSaida() == null){
            this.setDataSaida(new Date());
        }
    }
}
