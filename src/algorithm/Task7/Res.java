package algorithm.Task7;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Res {
    public static void main(String[] args) {
        City odesa = new City("Odesa");
        City uman = new City("Uman");
        City kiev = new City("Kiev");
        City kropyvnytskyi = new City("Kropyvnytskyi");
        City mykolaiv = new City("Mykolaiv");
        City dnipro = new City("Dnipro");
        City kharkov = new City("Kharkov");
        City sumy = new City("Sumy");
        City poltava = new City("Poltava");
        City kryvyiRih = new City("Kryvyi Rih");
        City kherson = new City("Kherson");
        City vinnytsia = new City("Vinnytsia");
        City ternopil = new City("Ternopil");
        City lviv = new City("Lviv");
        City rivne = new City("Rivne");
        City zhytomyr = new City("Zhytomyr");
        City khmelnytskyi = new City("Khmelnytskyi");
        List<City> city= Arrays.asList(odesa,uman,kiev,kropyvnytskyi,mykolaiv,dnipro,kharkov,sumy,poltava,kryvyiRih,kherson,
                vinnytsia,ternopil,lviv,rivne,zhytomyr,khmelnytskyi);
        List<Road> road = Arrays.asList(
                new Road (uman,odesa,271),
                new Road (mykolaiv,odesa,1313),
                new Road(kherson,mykolaiv ,71),
                new Road(kryvyiRih,mykolaiv ,204),
                new Road(dnipro,kryvyiRih ,146),
                new Road(kharkov,dnipro ,216),
                new Road(sumy,kharkov ,183),
                new Road(kiev,uman ,212),
                new Road(vinnytsia,uman ,160),
                new Road(kropyvnytskyi,uman,1671),
                new Road(kryvyiRih,kropyvnytskyi,119),
                new Road(dnipro,kropyvnytskyi ,245),
                new Road(khmelnytskyi,vinnytsia ,122),
                new Road(ternopil,khmelnytskyi ,111),
                new Road(rivne,ternopil ,159),
                new Road(lviv,ternopil ,127),
                new Road(poltava,kiev ,342),
                new Road(kharkov,poltava ,143),
                new Road(zhytomyr,kiev ,140),
                new Road(rivne,zhytomyr ,188),
                new Road(lviv,rivne ,121));
//         new Road (odesa,uman,271),
//        new Road (odesa,mykolaiv,132),
//        new Road(mykolaiv,kherson,71),
//        new Road(mykolaiv,kryvyiRih,204),
//        new Road(kryvyiRih,dnipro,146),
//        new Road(dnipro,kharkov,216),
//        new Road(kharkov,sumy,183),
//        new Road(uman,kiev,212),
//        new Road(uman,vinnytsia,160),
//        new Road(uman,kropyvnytskyi,167),
//        new Road(kropyvnytskyi,kryvyiRih,119),
//        new Road(kropyvnytskyi,dnipro,245),
//        new Road(vinnytsia,khmelnytskyi,122),
//        new Road(khmelnytskyi,ternopil,111),
//        new Road(ternopil,rivne,159),
//        new Road(ternopil,lviv,127),
//        new Road(kiev,poltava,342),
//        new Road(poltava,kharkov,143),
//        new Road(kiev,zhytomyr,140),
//        new Road(zhytomyr,rivne,188),
//        new Road(rivne,lviv,121));
        Graph graph = new Graph(city,road);
        DijkstraAlgorithm dijkstraAlgorithm = new DijkstraAlgorithm(graph);
        dijkstraAlgorithm.execute(kharkov);
        System.out.println(dijkstraAlgorithm.reverseLinkedList(dijkstraAlgorithm.getPath(odesa)));

    }
}
