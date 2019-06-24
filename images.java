import java.awt.*;
import javax.swing.*;

//*Creates a window with two pictures*/

public class AddImages extends JFrame {
	private ImageIcon image1;
	private JLabel label1;
	private ImageIcon image2;
	private JLabel label2;
	
	AddImages(){ //adding pictures
		setLayout(new FlowLayout());
		
		image1 = new ImageIcon(getClass().getResource("duck.jpg"));//link to image1
		label1 = new JLabel(image1);//pin image1 to label1
		add(label1);//add label to window
		
		image2 = new ImageIcon(getClass().getResource("fiveducks.jpg"));
		label2 = new JLabel(image2);
		add(label2);
	}
	
	public static void main(String[] args) {//create window frame to display pictures
		AddImages frame = new AddImages();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.pack();//shrinks the window only around what you have in it, no extra space
		frame.setTitle("Ducks");
	}	
}
