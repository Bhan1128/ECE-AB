package Get_content;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class content {

	private JFrame frame;
	private JTextField T1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					content window = new content();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public content() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 255, 255));
		frame.setBounds(100, 100, 622, 478);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Restro Bill");
		lblNewLabel.setFont(new Font("Sylfaen", Font.PLAIN, 40));
		lblNewLabel.setBounds(197, 11, 184, 63);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Menu");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(84, 116, 66, 31);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Qnty");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_2.setBounds(84, 172, 61, 31);
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox C1 = new JComboBox();
		C1.setModel(new DefaultComboBoxModel(new String[] {"select", "dosa - Rs.35", "idli - Rs.25", "puri - Rs.30"}));
		C1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		C1.setBounds(181, 116, 98, 32);
		frame.getContentPane().add(C1);
		
		T1 = new JTextField();
		T1.setBounds(181, 172, 98, 31);
		frame.getContentPane().add(T1);
		T1.setColumns(10);
		
		JButton btnNewButton = new JButton("Order");
		btnNewButton.addActionListener(new ActionListener() {
			private int bill;

			public void actionPerformed(ActionEvent e) {
				String item=(String) C1.getSelectedItem();
				String qnty=T1.getText();
				int q=Integer.parseInt(qnty);
				int bill=0;
				if(item.equals("dosa - Rs.35"))
				{
				 bill=q*35;
				 JOptionPane.showMessageDialog(btnNewButton, "hello \n selected item:" +item+"\n Qnty: "+q+" \n your bill:"+bill);
				}
				else if(item.equals("idli - Rs.25"))
				{
				 bill=q*25;
				 JOptionPane.showMessageDialog(btnNewButton, "hello \n selected item:" +item+"\n Qnty: "+q+" \n your bill:"+bill);
				}
				else if(item.equals("puri - Rs.30"))
				{
				 bill=q*30;
				 JOptionPane.showMessageDialog(btnNewButton, "hello \n selected item:" +item+"\n Qnty: "+q+" \n your bill:"+bill);
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnNewButton.setBounds(127, 270, 86, 37);
		frame.getContentPane().add(btnNewButton);
	}
}
