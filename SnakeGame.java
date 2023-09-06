
package snakegame;
import javax.swing.*;

public class SnakeGame extends JFrame{
    
    SnakeGame(){
        super("Snake Game");
        add(new Board());
        //board become panel and it is added to frame
        pack();
        //refresh the frame
        setLocationRelativeTo(null);
//        setSize(300,300);
setResizable(false);
     
            }

    
    public static void main(String[] args) {
        // TODO code application logic here
        new SnakeGame().setVisible(true);
        
        
        
        
        
        
 
        
    }
    
}
