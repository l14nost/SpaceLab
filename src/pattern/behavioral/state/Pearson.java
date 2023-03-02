package pattern.behavioral.state;

public class Pearson {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    int condition = 0;

    public void changeActivity(){

            if(condition<30){
                setActivity(new Sleeping());
                do{
                    condition++;

                }
                while (condition<100);


            }
            else if(condition>49&&condition<=100){
                setActivity(new Training());
                do{

                    condition--;
                }
                while (condition>49);

            }
            else if(condition<=50&&condition>29){
                setActivity(new Learning());
                do{

                    condition--;
                }
                while (condition>29);

            }



    }
    public void doActivity(){
        activity.activity();
    }
}
