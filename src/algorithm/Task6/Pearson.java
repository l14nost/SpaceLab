package algorithm.Task6;

public class Pearson {
    private String name;
    private int num;
    private Address address;
//    private String[] clothes;
//    public String[] getClothes() {
//        return clothes;
//    }
//
//    public void setClothes(String[] clothes) {
//        this.clothes = clothes;
//    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Pearson(String name, int num, Address address) {
        this.name = name;
        this.num = num;
        this.address = address;
//        this.clothes = clothes;
    }

    @Override
    public String toString() {
        return "Pearson{" +
                "name='" + name + '\'' +
                ", num=" + num +
                ", address=" + address +
                '}';
    }
}
