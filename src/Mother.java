public class Mother {
   private  String name;
   private int age;
   private String eyeColor;

    public Mother(String name, int age, String eyeColor) {
        this.name = name;
        this.age = age;
        this.eyeColor = eyeColor;
    }

    @Override
    public String toString() {
        return "Mother{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", eyeColor='" + eyeColor + '\'' +
                '}';
    }

    public  String getName(){
        return name+"This  is Mother";
    }
}
