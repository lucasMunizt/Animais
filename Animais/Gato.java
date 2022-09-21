public class Gato extends Animal {
    Gato(String nome, int idade, String raca){
        super(nome, idade, raca);
    }
    void comunicar(){
        System.out.println("miau");
    }
}
