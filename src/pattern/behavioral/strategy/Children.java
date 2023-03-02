package pattern.behavioral.strategy;

public class Children {
    Ball ball;
    String nameBall;

    public Children(String nameBall) {
        this.nameBall = nameBall;
    }

    public void setBall(Ball ball) {
        this.ball = ball;
    }
    public void doSport(){
        ball.playBall();
    }

}
