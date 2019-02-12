import javax.swing.JOptionPane;

public class TestScores {
public static void main(String[] args) {
	String test = JOptionPane.showInputDialog("What was your test score?");
	double scores = Double.parseDouble(test);
	if (scores>=80) {
		JOptionPane.showMessageDialog(null, "Great Job, You must have studied really hard");
		
	}else if(scores>=70) {
		JOptionPane.showMessageDialog(null, "Good Job, You Passed");
		
	}else if(scores<=69.9) {
		JOptionPane.showMessageDialog(null, "Study harder to get a better score next time");
	}
			

	
	
}

}
