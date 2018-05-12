import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Demo extends JFrame {   //implements ActionListener
	
	JButton button = new JButton("Ok");
	JButton button2 = new JButton("Cancel");
	
	//two buttons created using Jbutton .

	// This is a less recomended way of setting listeners to buttons (by implementing ActionListener interface and overriding actionPerformed .
	  
	/*
	@Override
	public void actionPerformed(ActionEvent e){
		Color color = Color.WHITE;
		String buttonName = e.getActionCommand();

		//Now we can check the name of the button and compare it to the text on it,but problem is what if we have set button without name .
		if(buttonName.equals("Ok")){
			color = Color.RED;
		}
		else
		if(buttonName.equals("Cancel")){
			color = Color.YELLOW;
		}

		
		//Or we can simply get the source of the button and compare it with the button variable we created .		
		/*JButton source = (JButton)e.getSource();
		Color color = Color.WHITE;
		if(source == button){
			color = Color.RED;
		}
		else
		if(source == button2){
			color = Color.GREEN;
		}*/
		
		// this.getContentPane().setBackground(color);
		
	//}
		
	
	Demo(){
		/* we can alse anonymous class or lambda expressions (Annonumous class created $classname type class for each button so it is best to 			use the lambda expressions for setting listeners 
		  */

		//Lambda Expression .

		button.addActionListener(e->Demo.this.getContentPane().setBackground(Color.RED));
		
		button2.addActionListener(e->Demo.this.getContentPane().setBackground(Color.GREEN));

		//Anonymous Class .
		
//		button.addActionListener(new ActionListener(){
//			public void actionPerformed(ActionEvent e){
//				Demo.this.getContentPane().setBackground(Color.RED);
//			}
//		});
//		
//		button2.addActionListener(new ActionListener(){
//			public void actionPerformed(ActionEvent e){
//				Demo.this.getContentPane().setBackground(Color.GREEN);
//			}
//		});
		//button.addActionListener(this);
		
		//button2.addActionListener(this);

		//Now,this method getContentPane() is used to select the content on the pain so that we can set the Layout of it .
		this.getContentPane().setLayout(new FlowLayout());
		//Also we need to add the button to the pane using add method .
		this.getContentPane().add(button);
		this.getContentPane().add(button2);
		//this.getContentPane().add(button,BorderLayout.SOUTH);
		setLocationRelativeTo(null);
		//setLocation(400, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setTitle("Frame1");
		setVisible(true);
	}

	public static void main(String[] args) {
		Demo obj = new Demo();
		// TODO Auto-generated method stub
		//System.out.println("hello");

	}

}
