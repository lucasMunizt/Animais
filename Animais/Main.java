class Main {
    public static void main(String[] args) {
        Animal c1[] = new Animal[10];
        c1[0] = new Cachorro("Cachorro",10, "bulldog");
        c1[1] = new Abelha("Abelha",9,"Persa");
        c1[2] = new Cavalo("Cavalo",8,"Persa");
        c1[3] = new Cobra("Cobra",7,"Persa");
        c1[4] = new Leao("Leao",6,"Persa");
        c1[5] = new Lobo("Lobo",5,"Persa");
        c1[6] = new Mosca("Mosca",4,"Persa");
        c1[7] = new Tigre("Tigre",3,"Persa");
        c1[8] = new Vaca("Vaca",2,"Persa");
        c1[9] = new Gato("Gato",1,"Persa");

        for(int i=0;i<10;i++){
            System.out.print(c1[i].nome + " ");
            c1[i].comunicar();
        }
       System.out.println(c1[0].nome);
      
      
    }
  }