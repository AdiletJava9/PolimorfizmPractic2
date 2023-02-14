public class Daughter extends Mother{
    String hairColor;
    String height;

    public Daughter(String name, int age, String eyeColor, String hairColor, String height) {
        super(name, age, eyeColor);
        this.hairColor = hairColor;
        this.height = height;
    }

    @Override
    public String getName() {
        return "this is Daughter";
    }
}

