import java.awt.*;
import javax.swing.*;
public class BallGame extends JFrame{
    Image ball =Toolkit.getDefaultToolkit().getImage("images/ball.png");
    Image desk =Toolkit.getDefaultToolkit().getImage("images/desk.jpg");
    double i =100; //小球的横坐标
    double j = 100;
    boolean right = true;//方向
    //画窗口
    public void paint(Graphics g){
        System.out.println("窗口被画了一次");
        g.drawImage(desk,0,0,null);
        g.drawImage(ball,(int)i,(int)j,null);
        if(right){
            i=i+10;
        }else{
            i=i-10;
        }
        if(i>816-30){ //30小球直径
            right = false;
        }
        if (i<40){
            right = true;
        }
        i = i+1;

    }
    //窗口加载
    void launchFrame(){
        setSize(856,500);
        setLocation(50,50);
        setVisible(true);
        //重画窗口
        while(true) {
            repaint();
            try {
                Thread.sleep(40);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }
    //程序执行的入口
    public static void main(String[] args){
        System.out.println("我是朱烨，开始游戏啦");
        BallGame game = new BallGame();
        game.launchFrame();
    }
}
