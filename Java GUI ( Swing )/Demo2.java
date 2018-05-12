import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Demo2 extends JFrame {


	/*This demo is created using the drag and drop plugin named (window Builder) we can download it by searching on google as : 
	 search window builder-> on eclipse website copy ink for windowBuilder -> in Eclipse goto Help -> Install New Software -> paste the link 
	-> and done ...
	*/		

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Demo2 frame = new Demo2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	void okclick(){
		Demo2.this.getContentPane().setBackground(Color.YELLOW);
		String value = textField.getText();
		JOptionPane.showMessageDialog(this, "Your Name is "+value);
	}

	/**
	 * Create the frame.
	 */
	public Demo2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton ok = new JButton("OK");
		ok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				okclick();
				
			}
		});
		ok.setToolTipText("Click to OK");
		ok.setMnemonic('O');
		ok.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		ok.setBounds(59, 67, 117, 29);
		contentPane.add(ok);
		
		textField = new JTextField();
		textField.setBounds(80, 112, 252, 26);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
