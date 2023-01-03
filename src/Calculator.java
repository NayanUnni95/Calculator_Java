import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator {
	public Calculator(){
		JFrame jf=new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(600,600);
		jf.setLocation(373,100);
		
		JLabel DisplayLabel=new JLabel("Hello");
		DisplayLabel.setBounds(30,50,540,40);
		DisplayLabel.setBackground(Color.gray);
		DisplayLabel.setOpaque(true);
		DisplayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		DisplayLabel.setForeground(Color.white);
		jf.add(DisplayLabel);
		
		JButton SevenButton=new JButton("7");
		SevenButton.setBounds(30,130,80,80);
		jf.add(SevenButton);
		
		JButton EightButton=new JButton("8");
		EightButton.setBounds(130,130,80,80);
		jf.add(EightButton);
		
		JButton NineButton=new JButton("9");
		NineButton.setBounds(230,130,80,80);
		jf.add(NineButton);
		
		JButton SixButton=new JButton("6");
		SixButton.setBounds(30,230,80,80);
		jf.add(SixButton);
		
		JButton FiveButton=new JButton("5");
		FiveButton.setBounds(130,230,80,80);
		jf.add(FiveButton);
		
		JButton FourButton=new JButton("4");
		FourButton.setBounds(230,230,80,80);
		jf.add(FourButton);
		
		JButton OneButton=new JButton("1");
		OneButton.setBounds(30, 330, 80, 80);
		jf.add(OneButton);
				
		JButton TwoButton=new JButton("2");
		TwoButton.setBounds(130,330,80,80);
		jf.add(TwoButton);
		
		JButton ThreeButton=new JButton("3");
		ThreeButton.setBounds(230,330,80,80);
		jf.add(ThreeButton);
		
		JButton ZeroButton=new JButton("0");
		ZeroButton.setBounds(30, 430, 80, 80);
		jf.add(ZeroButton);
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		Calculator C=new Calculator();
	}
}
