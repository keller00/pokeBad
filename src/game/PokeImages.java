package game;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Mark
 */
public class PokeImages {
    public static Image[] pmf;
    public static Image[] pmb;
    
    public static void loadImages(){
        pmf=new Image[30];
        pmf[1]=new ImageIcon("images\\pokefront\\1.png").getImage();
        pmf[4]=new ImageIcon("images\\pokefront\\4.png").getImage();
        pmf[7]=new ImageIcon("images\\pokefront\\7.png").getImage();
        
        pmb=new Image[30];
        pmb[25]=new ImageIcon("images\\pokeback\\25.png").getImage();
    }
}
