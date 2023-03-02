package pattern.creational.builder;

public class Boss {


    public static void main(String[] args) {
        Developer developer = new HR().setAge(18).setLanguage("Java").setName("Oleg").build();
        Developer developer1 = new HR().setAge(30).setLanguage("Python").setName("Oleg").setExpirience(5).build();
        System.out.println(developer+"\n"+developer1);
    }

}
