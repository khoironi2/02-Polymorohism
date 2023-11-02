package example;

public class Main {
    static void getSuara(Hewan hewan){
        hewan.bersuara();
    }
    public static void main(String[] args) {
        Hewan hewan = new Kucing(); // polimorphise run time
        // hewan.bersuara(); // invocation/memanggil method virtual pada class kucing
        Hewan hewan1 = new Burung();
        // hewan1.bersuara();
        Hewan hewan2 = new Ikan();
        getSuara(hewan);
        getSuara(hewan1); // polimorphic argument

        if (hewan1 instanceof Burung) {
            Burung burung = (Burung) hewan1;
            System.out.println("Benarr");
            burung.bersuara();
        }else{
            System.out.println("Bukannn");
        }
    }
}
