import java.awt.*;
import javax.swing.*;

public class HW_Q4 extends JFrame {
	HW_Q4() {
		setTitle("Ten Color Buttons Frame");
		setSize(600, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(1, 10));
		
		Color[] col = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
				Color.CYAN, Color.BLUE, Color.MAGENTA, Color.GRAY,
				Color.PINK, Color.LIGHT_GRAY};
		for (int i = 0; i < 10; i++) {
			String text = Integer.toString(i);
			JButton b = new JButton(text);
			b.setOpaque(true);
			b.setBackground(col[i]);
			c.add(b);
			}
		setVisible(true);
		}

	public static void main(String[] args) {
		new HW_Q4();
	}

}
