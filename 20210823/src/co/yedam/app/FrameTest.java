package co.yedam.app;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FrameTest extends JFrame  implements ActionListener{
	JButton btn1, btn2, btn3;

	public FrameTest() {
		JPanel jp = (JPanel) this.getContentPane();
		jp.setLayout(new FlowLayout());

		/*
		 * 1. 객체 생성 2. 속성 설정 3. 이벤트 설정 4. 에드
		 */
		btn1 = new JButton("1b");
		btn2 = new JButton("2b");
		btn3 = new JButton("3b");

		btn1.setBackground(Color.CYAN);
//		btn1.addActionListener(new MyActionListener());
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btn2.setText("1버튼 클릭됨");
				
			}
		});
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("2버튼 클릭됨");
				
			}
		});
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("3번");
				
			}
		});

		jp.add(btn1);
		jp.add(btn2);
		jp.add(btn3);
		this.setSize(400, 300);
		this.setTitle("HI!");
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new FrameTest();
	}
	public void actionPerformed(ActionEvent arg0) {
		btn3.setText("3버튼 클릭됨");
		
	}
}