import java.awt.*;
import javax.swing.*;
public class BallGame2 extends JFrame{
    Image ball =Toolkit.getDefaultToolkit().getImage("images/ball.png");
    Image desk =Toolkit.getDefaultToolkit().getImage("images/desk.jpg");

    double i =100; //小球的横坐标
    double j = 100;
    double degree = 3.14/3; //弧度.此处的为60度

    //画窗口
    public void paint(Graphics g){
        System.out.println("窗口被画了一次");
        g.drawImage(desk,0,0,null);
        g.drawImage(ball,(int)i,(int)j,null);
        i= i+10*Math.cos(degree);
        j = j+10*Math.sin(degree);

        if(j>500-40-30||j<40+40){
            degree = -degree;
        }
        if(i>816||i<40)
            degree = 3.14-degree;
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
        BallGame2 game = new BallGame2();
        game.launchFrame();
    }
}
