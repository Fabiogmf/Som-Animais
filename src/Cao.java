public class Cao extends Animal {

    public Cao(String nome) {

        super(nome);
    }

    public void latir() {

        System.out.println(nome + " está latindo.");
    }
}

class Gato extends Animal {

    public Gato(String nome) {

        super(nome);
    }

    public void miar() {

        System.out.println(nome + " está miando.");
    }
}
