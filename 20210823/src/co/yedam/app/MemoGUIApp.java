package co.yedam.app;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MemoGUIApp extends JFrame {
	JTextField txtNo, txtDate, txtContent;
	JButton btnIns, btnDel, btnSearch,btnRead,btnSave;
	JTextArea txtArea;
	MemoStorage ms;

	public MemoGUIApp() {
		ms = MemoStorage.getinstance();
		JPanel p = (JPanel) this.getContentPane();
		p.setLayout(new FlowLayout());
		p.add(new JLabel("번호"));
		txtNo = new JTextField(20);
		p.add(txtNo);
		p.add(new JLabel("날짜"));
		txtDate = new JTextField(20);
		p.add(txtDate);
		p.add(new JLabel("내용"));
		txtContent = new JTextField(20);
		p.add(txtContent);
		btnIns = new JButton("등록");
		btnIns.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Memo pm = new Memo(txtNo.getText(),txtDate.getText(),txtContent.getText());
				if(ms.saveData(pm)) {
					JOptionPane.showMessageDialog(p,"등록 완료");
				}else {
					JOptionPane.showMessageDialog(p,"등록 실패");
				}
				clrt();
			}
		});
		p.add(btnIns);
		btnDel = new JButton("삭제");
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String no = txtNo.getText();
				if(ms.deleteData(no)) {
					JOptionPane.showMessageDialog(p,"삭제완료");
				}else {
					JOptionPane.showMessageDialog(p,"삭제실패");
				}
				clrt();				
			}
		});
		p.add(btnDel);
		btnSearch = new JButton("조회");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				List<Memo> list = ms.searchData();
				txtArea.setText("");
				for(Memo mm : list) {
					txtArea.append(mm.toString());
				}
				
			}
		});
		p.add(btnSearch);
		
		btnRead = new JButton("불러오기");
		btnRead.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ms.fileRead();
			}
		});
		p.add(btnRead);
		btnSave = new JButton("저장하기");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ms.fileSave();
			}
		});
		

		txtArea = new JTextArea(15, 23);
		p.add(txtArea);

		this.setSize(300, 400);
		this.setTitle("메모관리");
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new MemoGUIApp();
	}
	public void clrt() {
		txtNo.setText("");
		txtDate.setText("");
		txtContent.setText("");
	}
}
