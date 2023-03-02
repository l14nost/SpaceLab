package pattern.structural.proxy;

public class Security {
    public static void main(String[] args) {
        Club club = new ClubProxy();
        club.dance();
    }



}
