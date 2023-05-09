public class Teste {
    public static void main(String[] args) {
        Cracha cracha1 = new Cracha(123, "Afonso");
        Cracha cracha2 = new Cracha(341, "Nisflei");
        Catraca catraca = new Catraca();

        cracha1.passarCracha();
        cracha2.passarCracha();
        cracha2.passarCracha();
        cracha1.passarCracha();
        catraca.cadastrarCatraca(cracha1);
        catraca.cadastrarCatraca(cracha2);
        catraca.getListaPassou();
    }
}
