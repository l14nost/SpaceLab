package pattern.behavioral.memento;

public class Txt {


    private String txt = "";
    public void addTxt(String word){
        txt+=word;
    }
    public Save save(){
        return new Save(txt);
    }
    public void printSave(Save save){
        save.getTxt();
    }
    @Override
    public String toString() {
        return "Txt{" +
                "txt='" + txt + '\'' +
                '}';
    }
}
