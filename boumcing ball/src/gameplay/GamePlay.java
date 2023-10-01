package gameplay;
import mainframe.MainFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GamePlay extends JPanel implements ActionListener, KeyListener {
    private boolean play = true;

    private Timer timer;
    private int delay = 8;
    private int ballX = 120;
    private int ballY = 350;
    private int ballXDir = 1;
    private int ballYDir = -2;

    public GamePlay() {

        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        timer = new Timer(delay, this);
        timer.start();
    }



    @Override
    public void paintComponent(Graphics g) {
        //background
        g.setColor(Color.black);
        g.fillRect(1,1,685,585);
        //borders
        g.setColor(Color.yellow);
        g.fillRect(0,0,3,585);
        g.fillRect(0,0,685,3);
        g.fillRect(684,0,3,592);
        g.fillRect(0,560,685,3);
        //ball
        g.setColor(Color.blue);
        g.fillOval(ballX, ballY, 20, 20);
        g.dispose();

    }



    @Override
    public void actionPerformed(ActionEvent e) {
        timer.start();
        if(play){
            ballmovement();
        }

        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {


    }

    @Override
    public void keyPressed(KeyEvent e) {

    }


    @Override
    public void keyReleased(KeyEvent e) {

    }

    private void ballmovement() {
        // Change direction for ballX
        if (ballX >= 670 || ballX <= 3) {
            ballXDir = -ballXDir;
        }

        // Change direction for ballY
        if (ballY >= 560 || ballY <= 3) {
            ballYDir = -ballYDir;
        }

        // Move the ball in its current direction
        ballX += ballXDir;
        ballY += ballYDir;
    }



}
