package mainframe;
import gameplay.GamePlay;

import javax.swing.*;


public class MainFrame {
    public JFrame obj = new JFrame();
    public MainFrame(){
        obj.setBounds(10,10,700,600);
        obj.setTitle("Brick Breaker");
        GamePlay gamePlay = new GamePlay();
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        obj.add(gamePlay);

    }


}
