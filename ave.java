public class ave extends Animal {
    private String CorPena;

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Frutas");
    }

    @Override
    public void emitirsom() {
        System.out.println("Som de Ave");
    }

    public void fazzerNinho(){
        System.out.println("Construindo Ninho");
    }
}
