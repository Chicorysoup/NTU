public class Player {
    private int number;
    private float x;
    private float y;
    private float z = 0.0f;

    Player(int number, float x, float y, float z){
    }

    public void move(float xDisp, float yDisp){
        x += xDisp;
        y += yDisp;
    }

    public void jump(float zDisp){

    }

    public Boolean near(Ball ball){
        int distance = (int) Math.sqrt(Math.pow(x-ball.getX(), 2) + Math.pow(y-ball.getY(), 2));
        if (distance < 8){
            return true;
        } else {
            return false;
        }
    }

    public void kick(Ball ball){

    }
}
