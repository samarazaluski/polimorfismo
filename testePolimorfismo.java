import java.util.Arrays;

public class testePolimorfismo {
    public static void main(String[] args) {
        mamifero m = new mamifero();
        Reptil r = new Reptil();
        ave a = new ave();
        peixe p =new peixe();

        m.setPeso(40.5f);
        m.setCorPelo("Preto");
        m.alimentar();
        m.locomover();
        m.emitirsom();

        a.locomover();
        p.locomover();

      m.getCorPelo();
      a.locomover();
      p.locomover();

    }
}
