package pattern.behavioral.cof;

public abstract class Task {
    static String task = "x*y = 6\nx+y = 5\nx-?\ny-?";
    int x;
    int y;
    Task nextMessage;
    public void setNextMessage(Task nextMessage) {
        this.nextMessage = nextMessage;
    }


    public void clientMessage(int x, int y){
        if(nextMessage!=null){
            print("",x,y);
            nextMessage.clientMessage(x,y);

        }
        else{
            print("Successful",x,y);
        }
    }
    public abstract void print(String message, int x,int y);


}
