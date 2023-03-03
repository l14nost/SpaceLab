package pattern.architect.MVVM;

import pattern.architect.MVP.View;

import java.util.ArrayList;

public class ViewModel {
    Model model = new Model();

    public ArrayList<Book> getBook(){
        return model.info;
    }
    public void newArr(String answer){
        for(int i =0; i<model.info.size(); i++){
            if(model.info.get(i).name.equals(answer)){
                model.info.remove(i);
            }
        }
    }

}
