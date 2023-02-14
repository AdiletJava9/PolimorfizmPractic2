public class Main {
    public static void main(String[] args) {
        Mother mother = new Mother("Ainura", 40, "Black");
        System.out.println(mother);
        System.out.println(mother.getName());
        Mother mother1 = new Mother("Ainagul", 30, "Blakc");
        System.out.println(mother1);
        System.out.println(mother1.getName());

        Mother mother2 = new Daughter("Aibyke", 9, "Black", "Blakc", "1.45cm");
        System.out.println(mother2);
        System.out.println(mother2.getName());
        Daughter daughter = new Daughter("Adelia", 12, "brown", "Black", "1,56cm");
        System.out.println(daughter);
        System.out.println(daughter.getName());
    }
}