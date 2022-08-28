
public class Main {
    public static void main(String[] args) {
        MagicBox<Integer> magicBox= new MagicBox<>(5);
        magicBox.add(2);
        magicBox.add(7);
        magicBox.add(8);
        magicBox.add(0);
        magicBox.add(9);


        MagicBox<String> magicBox1= new MagicBox<>(3);
        magicBox1.add("NATASHA");
        magicBox1.add("Bezos");
        magicBox1.add("HHHh");

        System.out.println(magicBox1.pick());


    }
}

