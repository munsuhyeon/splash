import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import java.awt.Color;

public class splash extends JPanel {
	
	private static JLabel lblNewLabel;
	private static JLabel lblNewLabel_1;
	private static JProgressBar progressBar;
	
	public splash() {
		setLayout(null);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(12, 10, 426, 231);
		add(lblNewLabel);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setForeground(Color.MAGENTA);
		progressBar.setBounds(12, 270, 426, 20);
		add(progressBar);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(193, 251, 57, 15);
		add(lblNewLabel_1);
		
		int x;
		Splash_gifTest frame = new Splash_gifTest();
		frame.setVisible(true);
		try {
		for(x=0; x<=100; x++) {
			splash.progressBar.setValue(x);
			Thread.sleep(20);
			splash.lblNewLabel_1.setText(Integer.toString(x) + "%");
			if(x==100) {
				frame.dispose();
			}
			} 
			}catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

}
