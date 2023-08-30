public class mamifero extends Animal{

    private String CorPelo;

    @Override
    public void locomover() {
        System.out.println("Correndo");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo");
    }

    @Override
    public void emitirsom() {
        System.out.println("Som de Mamifero");
    }

    public String getCorPelo() {
        return CorPelo;
    }

    public void setCorPelo(String corPelo) {
        CorPelo = corPelo;
    }
}
