package co.yedam.app;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FrameTest extends JFrame implements ActionListener {
   
   JButton btn1, btn2, btn3;
   
   public FrameTest() {
      JPanel panel = (JPanel)this.getContentPane();
      
      //������Ʈ�� âũ�⿡���� �ڵ����� ��ġ�� ���ִ°�
      panel.setLayout(new FlowLayout());
      
      //������ ������Ʈ �߰�
      //.1 ������Ʈ ����
      btn1 = new JButton("��ư1");
      //2.������Ʈ �Ӽ��� ����
      btn1.setBackground(Color.CYAN);
      //3. �̺�Ʈ�ڵ鷯
      btn1.addActionListener(new ActionListener(){

         @Override
         public void actionPerformed(ActionEvent e) {
            btn1.setText("�͸�ü");
            
         }} );
         
   
      //4. �г�(�θ�)�� ����
      panel.add(btn1);
      
      
      
      btn2 = new JButton("��ư2");
      btn2.addActionListener(new ActionListener() {
         
         @Override
         public void actionPerformed(ActionEvent e) {
            btn2.setText("�ٲ���");
         }
      });
      btn2.setBackground(Color.CYAN);
      panel.add(btn2);
      
      
      btn3 = new JButton("��ư3");
      btn3.addActionListener(this);
      btn3.setBackground(Color.CYAN);
      panel.add(btn3);
      
      
      this.setSize(400, 300);
      this.setTitle("�����ӿ���");
      this.setVisible(true);
   }
   
   public static void main(String[] args) {
   
      new FrameTest();
      
      
      
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      // TODO Auto-generated method stub
      
   }


//�̺�Ʈ �ڵ鷯(����Ŭ����)
//��øŬ����(����Ŭ���� - �ܺ�Ŭ������ �ʵ忡 ���ٰ���)
//class MyActionListener implements ActionListener{
//
//   @Override
//   public void actionPerformed(ActionEvent e) {
//      System.out.println("Ŭ����");
//      System.out.println(((JButton)e.getSource()).getX());
//      btn2.setText("�����");
//      
//   }
//}
}