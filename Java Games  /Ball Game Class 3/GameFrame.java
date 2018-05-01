import javax.swing.JFrame;

public class GameFrame extends JFrame implements GameConstants {
	
	public GameFrame() {
		
		
		
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setTitle(TITLE);
		Board board = new Board();
		add(board);
		setSize(GWIDTH,GHEIGHT);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameFrame frame = new GameFrame();
		System.out.println(Thread.currentThread());
		

	}

}
