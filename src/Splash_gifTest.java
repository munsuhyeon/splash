import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.thehowtotutorial.splashscreen.JSplash;

import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JProgressBar;

public class Splash_gifTest extends JFrame {

	private JPanel contentPane;
	private static JProgressBar progressBar;
	private static JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		int x;
			Splash_gifTest frame = new Splash_gifTest();
			frame.setVisible(true);
			try {
			for(x=0; x<=100; x++) {
				Splash_gifTest.progressBar.setValue(x);
				Thread.sleep(20);
				Splash_gifTest.lblNewLabel_1.setText(Integer.toString(x) + "%");
				if(x==100) {
					frame.dispose();
				}
				} 
				}catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	/**
	 * Create the frame.
	 */
	public Splash_gifTest() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(Color.PINK);
		ImageIcon icon = new ImageIcon(this.getClass().getResource("/giphy.gif"));
		lblNewLabel.setIcon(icon);
		lblNewLabel.setBounds(33, 28, 480, 272);
		contentPane.add(lblNewLabel);
		
		progressBar = new JProgressBar();
		progressBar.setForeground(Color.MAGENTA);
		progressBar.setBounds(12, 364, 555, 14);
		contentPane.add(progressBar);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(248, 330, 57, 15);
		contentPane.add(lblNewLabel_1);
	}
}
