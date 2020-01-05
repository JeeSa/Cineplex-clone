import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.Window.Type;
import javax.swing.SwingConstants;
import java.awt.Font;


public class SeatNumber extends JFrame {

	private JPanel contentPane;
	private JButton btnN001;
	private JButton btnN003;
	private JButton btnN002;
	private JButton btnN004;
	private JButton btnN005;
	private JButton btnN006;
	private JButton btnN007;
	private JButton btnN008;
	private JButton btnN009;
	private JButton btnN010;
	private JButton btnN011;
	private JButton btnN013;
	private JButton btnN012;
	private JButton btnN014;
	private JButton btnN015;
	private JButton btnN016;
	private JButton btnN017;
	private JButton btnN018;
	private JButton btnN019;
	private JButton btnN020;
	private JButton btnN021;
	private JButton btnN022;
	private JButton btnN023;
	private JButton btnN024;
	private JButton btnN025;
	private JButton btnN027;
	private JButton btnN026;
	private JButton btnN028;
	private JButton btnN029;
	private JButton btnN030;
	private JButton btnN031;
	private JButton btnN033;
	private JButton btnN032;
	private JButton btnN034;
	private JButton btnN035;
	private JButton btnN036;
	private JButton btnS_001;
	private JButton btnS_002;
	private JButton btnS_003;
	private JButton btnS_004;
	private JButton btnS_005;
	private JButton btnS_006;
	private JButton btnS_007;
	private JButton btnS_008;
	private JButton btnS_009;
	private JButton btnS_010;
	private JButton btnS_011;
	private JButton btnS_012;
	private JButton btnS_013;
	private JButton btnS_014;
	private JButton btnS_015;
	private JButton btnS_016;
	private JButton btnS_017;
	private JButton btnS_018;
	private JButton btnS_019;
	private JButton btnS_020;
	private JButton btnS_022;
	private JButton btnS_021;
	private JButton btnS_023;
	private JButton btnS_024;
	private JButton btnS_025;
	private JButton btnS_027;
	private JButton btnS_026;
	private JButton btnS_028;
	private JButton btnS_029;
	private JButton btnS_030;
	private JButton btnS_031;
	private JButton btnS_033;
	private JButton btnS_034;
	private JButton btnS_035;
	private JButton btnS_036;
	private JButton btnS_038;
	private JButton btnS_039;
	private JButton btnS_040;
	private JButton btnS_037;
	private JButton btnS_032;
	private JButton btnW001;
	private JButton btnW002;
	private JButton btnW003;
	private JButton btnW004;
	private JButton btnW006;
	private JButton btnW005;
	private JButton btnW007;
	private JButton btnW008;
	private JButton btnW009;
	private JButton btnW011;
	private JButton btnW012;
	private JButton btnW013;
	private JButton btnW014;
	private JButton btnW030;
	private JButton btnW010;
	private JButton btnW031;
	private JButton btnW015;
	private JButton btnW032;
	private JButton btnW016;
	private JButton btnW017;
	private JButton btnW019;
	private JButton btnW020;
	private JButton btnW021;
	private JButton btnW022;
	private JButton btnW023;
	private JButton btnW024;
	private JButton btnW025;
	private JButton btnW026;
	private JButton btnW028;
	private JButton btnW029;
	private JButton btn2;
	private JButton btn1;
	private JButton btn3;
	private JButton btn20;
	private JButton btn19;
	private JButton btn21;
	private JButton btn14;
	private JButton btn22;
	private JButton btn23;
	private JButton btn24;
	private JButton btn13;
	private JButton btn6;
	private JButton btn5;
	private JButton btn4;
	private JButton btn18;
	private JButton btn29;
	private JButton btn28;
	private JButton btn30;
	private JButton btn17;
	private JButton btn12;
	private JButton btn11;
	private JButton btn10;
	private JButton btn15;
	private JButton btn9;
	private JButton btn8;
	private JButton btn7;
	private JButton btn16;
	private JButton btn25;
	private JButton btn26;
	private JButton btn27;
	private JButton btnE;
	private JButton btnW;
	private JButton btnN;
	private JButton btnS;
	private JPanel panel_2;
	private JPanel panel_E_11;
	
	JLabel label_W_12;
	private JPanel panel_W_12;
	private JLabel label_E_11;
	private JPanel panel_N_13;
	private JLabel label_N_13;
	private JPanel panel_S_14;
	private JLabel label_S_14;
	
	
	String east = "E - 11" , west = "W - 12",north = "N - 13",south = "S - 14";
	
	
	static SeatNumber frame;
	private JLabel lblOut;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 frame = new SeatNumber();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SeatNumber() {
		setResizable(false);
		setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		setBounds(100, 100, 773, 412);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(51, 122, 673, 215);
		contentPane.add(panel);
		panel.setLayout(new CardLayout(0, 0));
		
		JPanel e11panel = new JPanel();
		e11panel.setBackground(Color.DARK_GRAY);
		panel.add(e11panel, "name_4049809064218");
		e11panel.setLayout(null);
		
		btn1 = new JButton("A1");
		btn1.setBackground(Color.GREEN);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//btnA1.enable(false);
				btn1.setBackground(Color.red);
				
				Seat(btn1.getText(),east);
				
				btn1.setEnabled(false);
				
				
				
			}
		});
		btn1.setBounds(0, 32, 52, 23);
		e11panel.add(btn1);
		
		btn2 = new JButton("A2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btn2.getText(),east);
				
				btn2.setEnabled(false);
				
				
			}
		});
		btn2.setBounds(62, 32, 52, 23);
		e11panel.add(btn2);
		
		btn3 = new JButton("A3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Seat(btn3.getText(),east);
				
				btn3.setEnabled(false);
			}
		});
		btn3.setBounds(124, 32, 52, 23);
		e11panel.add(btn3);
		
		btn19 = new JButton("A2");
		btn19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Seat(btn19.getText(),east);
				btn19.setEnabled(false);
			}
		});
		btn19.setBounds(464, 32, 52, 23);
		e11panel.add(btn19);
		
		btn20 = new JButton("A3");
		btn20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btn20.getText(),east);
				btn20.setEnabled(false);
			}
		});
		btn20.setBounds(526, 32, 52, 23);
		e11panel.add(btn20);
		
		btn21 = new JButton("A4");
		btn21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btn21.getText(),east);
				btn21.setEnabled(false);
			}
		});
		btn21.setBounds(588, 32, 52, 23);
		e11panel.add(btn21);
		
		btn14 = new JButton("A1");
		btn14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btn14.getText(),east);
				btn14.setEnabled(false);
			}
		});
		btn14.setBounds(313, 77, 52, 23);
		e11panel.add(btn14);
		
		btn22 = new JButton("A2");
		btn22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btn22.getText(),east);
				btn22.setEnabled(false);
			}
		});
		btn22.setBounds(464, 77, 52, 23);
		e11panel.add(btn22);
		
		btn23 = new JButton("A3");
		btn23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btn23.getText(),east);
				btn23.setEnabled(false);
			}
		});
		btn23.setBounds(526, 77, 52, 23);
		e11panel.add(btn23);
		
		btn24 = new JButton("A4");
		btn24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btn24.getText(),east);
				btn24.setEnabled(false);
			}
		});
		btn24.setBounds(588, 77, 52, 23);
		e11panel.add(btn24);
		
		btn13 = new JButton("A4");
		btn13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btn13.getText(),east);
				btn13.setEnabled(false);
			}
		});
		btn13.setBounds(251, 77, 52, 23);
		e11panel.add(btn13);
		
		btn6 = new JButton("A3");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btn6.getText(),east);
				btn6.setEnabled(false);
			}
		});
		btn6.setBounds(124, 77, 52, 23);
		e11panel.add(btn6);
		
		btn5 = new JButton("A2");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btn5.getText(),east);
				btn5.setEnabled(false);
			}
		});
		btn5.setBounds(62, 77, 52, 23);
		e11panel.add(btn5);
		
		btn4 = new JButton("A1");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btn4.getText(),east);
				btn4.setEnabled(false);
			}
		});
		btn4.setBounds(0, 77, 52, 23);
		e11panel.add(btn4);
		
		btn18 = new JButton("A1");
		btn18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btn18.getText(),east);
				btn18.setEnabled(false);
			}
		});
		btn18.setBounds(313, 168, 52, 23);
		e11panel.add(btn18);
		
		btn28 = new JButton("A2");
		btn28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btn28.getText(),east);
				btn28.setEnabled(false);
			}
		});
		btn28.setBounds(464, 168, 52, 23);
		e11panel.add(btn28);
		
		btn29 = new JButton("A3");
		btn29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btn29.getText(),east);
				btn29.setEnabled(false);
			}
		});
		btn29.setBounds(526, 168, 52, 23);
		e11panel.add(btn29);
		
		btn30 = new JButton("A4");
		btn30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btn30.getText(),east);
				btn30.setEnabled(false);
			}
		});
		btn30.setBounds(588, 168, 52, 23);
		e11panel.add(btn30);
		
		btn17 = new JButton("A4");
		btn17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btn17.getText(),east);
				btn17.setEnabled(false);
			}
		});
		btn17.setBounds(251, 168, 52, 23);
		e11panel.add(btn17);
		
		btn12 = new JButton("A3");
		btn12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btn12.getText(),east);
				btn12.setEnabled(false);
			}
		});
		btn12.setBounds(124, 168, 52, 23);
		e11panel.add(btn12);
		
		btn11 = new JButton("A2");
		btn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btn11.getText(),east);
				btn11.setEnabled(false);
			}
		});
		btn11.setBounds(62, 168, 52, 23);
		e11panel.add(btn11);
		
		btn10 = new JButton("A1");
		btn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btn10.getText(),east);
				btn10.setEnabled(false);
			}
		});
		btn10.setBounds(0, 168, 52, 23);
		e11panel.add(btn10);
		
		btn15 = new JButton("A4");
		btn15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btn15.getText(),east);
				btn15.setEnabled(false);
			}
		});
		btn15.setBounds(251, 123, 52, 23);
		e11panel.add(btn15);
		
		btn9 = new JButton("A3");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btn9.getText(),east);
				btn9.setEnabled(false);
			}
		});
		btn9.setBounds(124, 123, 52, 23);
		e11panel.add(btn9);
		
		btn8 = new JButton("A2");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btn8.getText(),east);
				btn8.setEnabled(false);
			}
		});
		btn8.setBounds(62, 123, 52, 23);
		e11panel.add(btn8);
		
		btn7 = new JButton("A1");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btn7.getText(),east);
				btn7.setEnabled(false);
			}
		});
		btn7.setBounds(0, 123, 52, 23);
		e11panel.add(btn7);
		
		btn16 = new JButton("A1");
		btn16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btn16.getText(),east);
				btn16.setEnabled(false);
			}
		});
		btn16.setBounds(313, 123, 52, 23);
		e11panel.add(btn16);
		
		btn25 = new JButton("A2");
		btn25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btn25.getText(),east);
				btn25.setEnabled(false);
			}
		});
		btn25.setBounds(464, 123, 52, 23);
		e11panel.add(btn25);
		
		btn26 = new JButton("A3");
		btn26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btn26.getText(),east);
				btn26.setEnabled(false);
			}
		});
		btn26.setBounds(526, 123, 52, 23);
		e11panel.add(btn26);
		
		btn27 = new JButton("A4");
		btn27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btn27.getText(),east);
				btn27.setEnabled(false);
			}
		});
		btn27.setBounds(588, 123, 52, 23);
		e11panel.add(btn27);
		
		///////////////////////////////// Second Panel (W - 12) ///////////////////////
		
		JPanel w12panel = new JPanel();
		w12panel.setBackground(new Color(255, 0, 255));
		panel.add(w12panel, "name_4049890866411");
		w12panel.setLayout(null);
		
		btnW001 = new JButton("A1");
		btnW001.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnW001.getText(),west);
				btnW001.setEnabled(false);
			}
		});
		btnW001.setBounds(10, 45, 52, 23);
		w12panel.add(btnW001);
		
		btnW002 = new JButton("A2");
		btnW002.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnW002.getText(),west);
				btnW002.setEnabled(false);
			}
		});
		btnW002.setBounds(72, 45, 52, 23);
		w12panel.add(btnW002);
		
		btnW003 = new JButton("A3");
		btnW003.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnW003.getText(),west);
				btnW003.setEnabled(false);
			}
		});
		btnW003.setBounds(134, 45, 52, 23);
		w12panel.add(btnW003);
		
		btnW004 = new JButton("A1");
		btnW004.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnW004.getText(),west);
				btnW004.setEnabled(false);
			}
		});
		btnW004.setBounds(10, 90, 52, 23);
		w12panel.add(btnW004);
		
		btnW005 = new JButton("A2");
		btnW005.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnW005.getText(),west);
				btnW005.setEnabled(false);
			}
		});
		btnW005.setBounds(72, 90, 52, 23);
		w12panel.add(btnW005);
		
		btnW006 = new JButton("A3");
		btnW006.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnW006.getText(),west);
				btnW006.setEnabled(false);
			}
		});
		btnW006.setBounds(134, 90, 52, 23);
		w12panel.add(btnW006);
		
		btnW007 = new JButton("A1");
		btnW007.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnW007.getText(),west);
				btnW007.setEnabled(false);
			}
		});
		btnW007.setBounds(10, 136, 52, 23);
		w12panel.add(btnW007);
		
		btnW008 = new JButton("A2");
		btnW008.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnW008.getText(),west);
				btnW008.setEnabled(false);
			}
		});
		btnW008.setBounds(72, 136, 52, 23);
		w12panel.add(btnW008);
		
		btnW009 = new JButton("A3");
		btnW009.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnW009.getText(),west);
				btnW009.setEnabled(false);
			}
		});
		btnW009.setBounds(134, 136, 52, 23);
		w12panel.add(btnW009);
		
		btnW011 = new JButton("A1");
		btnW011.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnW011.getText(),west);
				btnW011.setEnabled(false);
			}
		});
		btnW011.setBounds(10, 181, 52, 23);
		w12panel.add(btnW011);
		
		btnW012 = new JButton("A2");
		btnW012.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnW012.getText(),west);
				btnW012.setEnabled(false);
			}
		});
		btnW012.setBounds(72, 181, 52, 23);
		w12panel.add(btnW012);
		
		btnW013 = new JButton("A3");
		btnW013.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnW013.getText(),west);
				btnW013.setEnabled(false);
			}
		});
		btnW013.setBounds(134, 181, 52, 23);
		w12panel.add(btnW013);
		
		btnW014 = new JButton("A4");
		btnW014.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnW014.getText(),west);
				btnW014.setEnabled(false);
			}
		});
		btnW014.setBounds(190, 181, 52, 23);
		w12panel.add(btnW014);
		
		btnW030 = new JButton("A1");
		btnW030.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnW030.getText(),west);
				btnW030.setEnabled(false);
			}
		});
		btnW030.setBounds(422, 136, 52, 23);
		w12panel.add(btnW030);
		
		btnW010 = new JButton("A4");
		btnW010.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnW010.getText(),west);
				btnW010.setEnabled(false);
			}
		});
		btnW010.setBounds(196, 136, 52, 23);
		w12panel.add(btnW010);
		
		btnW031 = new JButton("A1");
		btnW031.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnW031.getText(),west);
				btnW031.setEnabled(false);
			}
		});
		btnW031.setBounds(422, 181, 52, 23);
		w12panel.add(btnW031);
		
		btnW015 = new JButton("A4");
		btnW015.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnW015.getText(),west);
				btnW015.setEnabled(false);
			}
		});
		btnW015.setBounds(252, 181, 52, 23);
		w12panel.add(btnW015);
		
		btnW032 = new JButton("A1");
		btnW032.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnW032.getText(),west);
				btnW032.setEnabled(false);
			}
		});
		btnW032.setBounds(360, 181, 52, 23);
		w12panel.add(btnW032);
		
		btnW016 = new JButton("A2");
		btnW016.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnW016.getText(),west);
				btnW016.setEnabled(false);
			}
		});
		btnW016.setBounds(480, 45, 52, 23);
		w12panel.add(btnW016);
		
		btnW017 = new JButton("A3");
		btnW017.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnW017.getText(),west);
				btnW017.setEnabled(false);
			}
		});
		btnW017.setBounds(542, 45, 52, 23);
		w12panel.add(btnW017);
		
		btnW019 = new JButton("A4");
		btnW019.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnW019.getText(),west);
				btnW019.setEnabled(false);
			}
		});
		btnW019.setBounds(604, 45, 52, 23);
		w12panel.add(btnW019);
		
		btnW020 = new JButton("A2");
		btnW020.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnW020.getText(),west);
				btnW020.setEnabled(false);
			}
		});
		btnW020.setBounds(480, 90, 52, 23);
		w12panel.add(btnW020);
		
		btnW021 = new JButton("A3");
		btnW021.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnW021.getText(),west);
				btnW021.setEnabled(false);
			}
		});
		btnW021.setBounds(542, 90, 52, 23);
		w12panel.add(btnW021);
		
		btnW022 = new JButton("A4");
		btnW022.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnW022.getText(),west);
				btnW022.setEnabled(false);
			}
		});
		btnW022.setBounds(604, 90, 52, 23);
		w12panel.add(btnW022);
		
		btnW023 = new JButton("A2");
		btnW023.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnW023.getText(),west);
				btnW023.setEnabled(false);
			}
		});
		btnW023.setBounds(480, 136, 52, 23);
		w12panel.add(btnW023);
		
		btnW024 = new JButton("A3");
		btnW024.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnW024.getText(),west);
				btnW024.setEnabled(false);
			}
		});
		btnW024.setBounds(542, 136, 52, 23);
		w12panel.add(btnW024);
		
		btnW025 = new JButton("A4");
		btnW025.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnW025.getText(),west);
				btnW025.setEnabled(false);
			}
		});
		btnW025.setBounds(604, 136, 52, 23);
		w12panel.add(btnW025);
		
		btnW026 = new JButton("A2");
		btnW026.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnW026.getText(),west);
				btnW026.setEnabled(false);
			}
		});
		btnW026.setBounds(480, 181, 52, 23);
		w12panel.add(btnW026);
		
		btnW028 = new JButton("A3");
		btnW028.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnW028.getText(),west);
				btnW028.setEnabled(false);
			}
		});
		btnW028.setBounds(542, 181, 52, 23);
		w12panel.add(btnW028);
		
		btnW029 = new JButton("A4");
		btnW029.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnW029.getText(),west);
				btnW029.setEnabled(false);
			}
		});
		btnW029.setBounds(604, 181, 52, 23);
		w12panel.add(btnW029);
		
		////////////////////////  3rd Panel (N-13) //////////////////// 
		
		JPanel n13panel = new JPanel();
		n13panel.setBackground(new Color(128, 128, 128));
		panel.add(n13panel, "name_4049956467796");
		n13panel.setLayout(null);
		
		btnN021 = new JButton("A2");
		btnN021.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnN021.getText(),north);
				btnN021.setEnabled(false);
			}
		});
		btnN021.setBounds(243, 164, 52, 23);
		n13panel.add(btnN021);
		
		btnN001 = new JButton("A1");
		btnN001.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnN001.getText(),north);
				btnN001.setEnabled(false);
			}
		});
		btnN001.setBounds(0, 28, 52, 23);
		n13panel.add(btnN001);
		
		btnN002 = new JButton("A2");
		btnN002.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnN002.getText(),north);
				btnN002.setEnabled(false);
			}
		});

		btnN002.setBounds(62, 28, 52, 23);
		n13panel.add(btnN002);
		
		btnN003 = new JButton("A3");
		btnN003.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnN003.getText(),north);
				btnN003.setEnabled(false);
			}
		});
		btnN003.setBounds(124, 28, 52, 23);
		n13panel.add(btnN003);
		
		btnN004 = new JButton("A1");
		btnN004.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnN004.getText(),north);
				btnN004.setEnabled(false);
			}
		});
		btnN004.setBounds(0, 73, 52, 23);
		n13panel.add(btnN004);
		
		btnN005 = new JButton("A2");
		btnN005.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnN005.getText(),north);
				btnN005.setEnabled(false);
			}
		});
		btnN005.setBounds(62, 73, 52, 23);
		n13panel.add(btnN005);
		
		btnN006 = new JButton("A3");
		btnN006.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnN006.getText(),north);
				btnN006.setEnabled(false);
			}
		});
		btnN006.setBounds(124, 73, 52, 23);
		n13panel.add(btnN006);
		
		btnN007 = new JButton("A1");
		btnN007.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnN007.getText(),north);
				btnN007.setEnabled(false);
			}
		});
		btnN007.setBounds(0, 119, 52, 23);
		n13panel.add(btnN007);
		
		btnN008 = new JButton("A2");
		btnN008.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnN008.getText(),north);
				btnN008.setEnabled(false);
			}
		});
		btnN008.setBounds(62, 119, 52, 23);
		n13panel.add(btnN008);
		
		btnN009 = new JButton("A3");
		btnN009.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnN009.getText(),north);
				btnN009.setEnabled(false);
			}
		});
		btnN009.setBounds(124, 119, 52, 23);
		n13panel.add(btnN009);
		
		btnN010 = new JButton("A1");
		btnN010.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnN010.getText(),north);
				btnN010.setEnabled(false);
			}
		});
		btnN010.setBounds(0, 164, 52, 23);
		n13panel.add(btnN010);
		
		btnN011 = new JButton("A2");
		btnN011.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnN011.getText(),north);
				btnN011.setEnabled(false);
			}
		});
		btnN011.setBounds(62, 164, 52, 23);
		n13panel.add(btnN011);
		
		btnN012 = new JButton("A3");
		btnN012.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnN012.getText(),north);
				btnN012.setEnabled(false);
			}
		});
		btnN012.setBounds(124, 164, 52, 23);
		n13panel.add(btnN012);
		
		btnN013 = new JButton("A2");
		btnN013.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnN013.getText(),north);
				btnN013.setEnabled(false);
			}
		});
		btnN013.setBounds(243, 28, 52, 23);
		n13panel.add(btnN013);
		
		btnN014 = new JButton("A3");
		btnN014.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnN014.getText(),north);
				btnN014.setEnabled(false);
			}
		});
		btnN014.setBounds(305, 28, 52, 23);
		n13panel.add(btnN014);
		
		btnN015 = new JButton("A4");
		btnN015.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnN015.getText(),north);
				btnN015.setEnabled(false);
			}
		});
		btnN015.setBounds(367, 28, 52, 23);
		n13panel.add(btnN015);
		
		btnN016 = new JButton("A2");
		btnN016.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnN016.getText(),north);
				btnN016.setEnabled(false);
			}
		});
		btnN016.setBounds(243, 73, 52, 23);
		n13panel.add(btnN016);
		
		btnN017 = new JButton("A3");
		btnN017.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnN017.getText(),north);
				btnN017.setEnabled(false);
			}
		});
		btnN017.setBounds(305, 73, 52, 23);
		n13panel.add(btnN017);
		
		btnN018 = new JButton("A4");
		btnN018.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnN018.getText(),north);
				btnN018.setEnabled(false);
			}
		});
		btnN018.setBounds(367, 73, 52, 23);
		n13panel.add(btnN018);
		
		btnN019 = new JButton("A2");
		btnN019.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnN019.getText(),north);
				btnN019.setEnabled(false);
			}
		});
		btnN019.setBounds(243, 119, 52, 23);
		n13panel.add(btnN019);
		
		btnN020 = new JButton("A3");
		btnN020.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnN020.getText(),north);
				btnN020.setEnabled(false);
			}
		});
		btnN020.setBounds(305, 119, 52, 23);
		n13panel.add(btnN020);
		
		btnN022 = new JButton("A4");
		btnN022.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnN022.getText(),north);
				btnN022.setEnabled(false);
			}
		});
		btnN022.setBounds(367, 119, 52, 23);
		n13panel.add(btnN022);
		
		btnN023 = new JButton("A3");
		btnN023.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnN023.getText(),north);
				btnN023.setEnabled(false);
			}
		});
		btnN023.setBounds(305, 164, 52, 23);
		n13panel.add(btnN023);
		
		btnN024 = new JButton("A4");
		btnN024.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnN024.getText(),north);
				btnN024.setEnabled(false);
			}
		});
		btnN024.setBounds(367, 164, 52, 23);
		n13panel.add(btnN024);
		
		btnN025 = new JButton("A1");
		btnN025.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnN025.getText(),north);
				btnN025.setEnabled(false);
			}
		});
		btnN025.setBounds(633, 73, 52, 23);
		n13panel.add(btnN025);
		
		btnN026 = new JButton("A1");
		btnN026.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnN026.getText(),north);
				btnN026.setEnabled(false);
			}
		});
		btnN026.setBounds(633, 119, 52, 23);
		n13panel.add(btnN026);
		
		btnN027 = new JButton("A1");
		btnN027.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnN027.getText(),north);
				btnN027.setEnabled(false);
			}
		});
		btnN027.setBounds(633, 164, 52, 23);
		n13panel.add(btnN027);
		
		btnN028 = new JButton("A4");
		btnN028.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnN028.getText(),north);
				btnN028.setEnabled(false);
			}
		});
		btnN028.setBounds(571, 164, 52, 23);
		n13panel.add(btnN028);
		
		btnN029 = new JButton("A4");
		btnN029.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnN029.getText(),north);
				btnN029.setEnabled(false);
			}
		});
		btnN029.setBounds(571, 119, 52, 23);
		n13panel.add(btnN029);
		
		btnN030 = new JButton("A4");
		btnN030.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnN030.getText(),north);
				btnN030.setEnabled(false);
			}
		});
		btnN030.setBounds(571, 73, 52, 23);
		n13panel.add(btnN030);
		
		btnN031 = new JButton("A1");
		btnN031.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnN031.getText(),north);
				btnN031.setEnabled(false);
			}
		});
		btnN031.setBounds(447, 73, 52, 23);
		n13panel.add(btnN031);
		
		btnN032 = new JButton("A1");
		btnN032.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnN032.getText(),north);
				btnN032.setEnabled(false);
			}
		});
		btnN032.setBounds(571, 28, 52, 23);
		n13panel.add(btnN032);
		
		btnN033 = new JButton("A1");
		btnN033.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnN033.getText(),north);
				btnN033.setEnabled(false);
			}
		});
		btnN033.setBounds(509, 101, 52, 23);
		n13panel.add(btnN033);
		
		btnN034 = new JButton("A4");
		btnN034.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnN034.getText(),north);
				btnN034.setEnabled(false);
			}
		});
		btnN034.setBounds(447, 101, 52, 23);
		n13panel.add(btnN034);
		
		btnN035 = new JButton("A4");
		btnN035.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnN035.getText(),north);
				btnN035.setEnabled(false);
			}
		});
		btnN035.setBounds(509, 73, 52, 23);
		n13panel.add(btnN035);
		
		btnN036 = new JButton("A4");
		btnN036.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnN036.getText(),north);
				btnN036.setEnabled(false);
			}
		});
		btnN036.setBounds(633, 28, 52, 23);
		n13panel.add(btnN036);
		
		//////////////////////////////  4th Panel ( S - 14 )   ///////////////////////
		
		
		JPanel s14panel = new JPanel();
		s14panel.setBackground(Color.DARK_GRAY);
		panel.add(s14panel, "name_4050012667108");
		s14panel.setLayout(null);
		
		btnS_001 = new JButton("A1");
		btnS_001.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnS_001.getText(),south);
				btnS_001.setEnabled(false);
			}
		});
		btnS_001.setToolTipText("");
		btnS_001.setBounds(10, 34, 52, 23);
		s14panel.add(btnS_001);
		
		btnS_002 = new JButton("A1");
		btnS_002.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnS_002.getText(),south);
				btnS_002.setEnabled(false);
			}
		});
		btnS_002.setBounds(10, 79, 52, 23);
		s14panel.add(btnS_002);
		
		btnS_003 = new JButton("A1");
		btnS_003.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnS_003.getText(),south);
				btnS_003.setEnabled(false);
			}
		});
		btnS_003.setBounds(10, 125, 52, 23);
		s14panel.add(btnS_003);
		
		btnS_004 = new JButton("A1");
		btnS_004.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnS_004.getText(),south);
				btnS_004.setEnabled(false);
			}
		});
		btnS_004.setBounds(10, 170, 52, 23);
		s14panel.add(btnS_004);
		
		btnS_005 = new JButton("A2");
		btnS_005.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnS_005.getText(),south);
				btnS_005.setEnabled(false);
			}
		});
		btnS_005.setBounds(72, 170, 52, 23);
		s14panel.add(btnS_005);
		
		btnS_006 = new JButton("A2");
		btnS_006.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnS_006.getText(),south);
				btnS_006.setEnabled(false);
			}
		});
		btnS_006.setBounds(72, 125, 52, 23);
		s14panel.add(btnS_006);
		
		btnS_007 = new JButton("A2");
		btnS_007.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnS_007.getText(),south);
				btnS_007.setEnabled(false);
			}
		});
		btnS_007.setBounds(72, 79, 52, 23);
		s14panel.add(btnS_007);
		
		btnS_008 = new JButton("A2");
		btnS_008.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnS_008.getText(),south);
				btnS_008.setEnabled(false);
			}
		});
		btnS_008.setBounds(72, 34, 52, 23);
		s14panel.add(btnS_008);
		
		btnS_009 = new JButton("A3");
		btnS_009.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnS_009.getText(),south);
				btnS_009.setEnabled(false);
			}
		});
		btnS_009.setBounds(134, 34, 52, 23);
		s14panel.add(btnS_009);
		
		btnS_010 = new JButton("A3");
		btnS_010.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnS_010.getText(),south);
				btnS_010.setEnabled(false);
			}
		});
		btnS_010.setBounds(134, 79, 52, 23);
		s14panel.add(btnS_010);
		
		btnS_011 = new JButton("A3");
		btnS_011.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnS_011.getText(),south);
				btnS_011.setEnabled(false);
			}
		});
		btnS_011.setBounds(134, 125, 52, 23);
		s14panel.add(btnS_011);
		
		btnS_012 = new JButton("A3");
		btnS_012.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnS_012.getText(),south);
				btnS_012.setEnabled(false);
			}
		});
		btnS_012.setBounds(134, 170, 52, 23);
		s14panel.add(btnS_012);
		
		btnS_013 = new JButton("A2");
		btnS_013.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnS_013.getText(),south);
				btnS_013.setEnabled(false);
			}
		});
		btnS_013.setBounds(229, 170, 52, 23);
		s14panel.add(btnS_013);
		
		btnS_014 = new JButton("A2");
		btnS_014.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnS_014.getText(),south);
				btnS_014.setEnabled(false);
			}
		});
		btnS_014.setBounds(229, 125, 52, 23);
		s14panel.add(btnS_014);
		
		btnS_015 = new JButton("A2");
		btnS_015.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnS_015.getText(),south);
				btnS_015.setEnabled(false);
			}
		});
		btnS_015.setBounds(229, 79, 52, 23);
		s14panel.add(btnS_015);
		
		btnS_016 = new JButton("A2");
		btnS_016.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnS_016.getText(),south);
				btnS_016.setEnabled(false);
			}
		});
		btnS_016.setBounds(229, 34, 52, 23);
		s14panel.add(btnS_016);
		
		btnS_017 = new JButton("A3");
		btnS_017.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnS_017.getText(),south);
				btnS_017.setEnabled(false);
			}
		});
		btnS_017.setBounds(291, 34, 52, 23);
		s14panel.add(btnS_017);
		
		btnS_018 = new JButton("A4");
		btnS_018.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnS_018.getText(),south);
				btnS_018.setEnabled(false);
			}
		});
		btnS_018.setBounds(353, 34, 52, 23);
		s14panel.add(btnS_018);
		
		btnS_019 = new JButton("A4");
		btnS_019.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnS_019.getText(),south);
				btnS_019.setEnabled(false);
			}
		});
		btnS_019.setBounds(353, 79, 52, 23);
		s14panel.add(btnS_019);
		
		btnS_020 = new JButton("A3");
		btnS_020.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnS_020.getText(),south);
				btnS_020.setEnabled(false);
			}
		});
		btnS_020.setBounds(291, 79, 52, 23);
		s14panel.add(btnS_020);
		
		btnS_021 = new JButton("A3");
		btnS_021.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnS_021.getText(),south);
				btnS_021.setEnabled(false);
			}
		});
		btnS_021.setBounds(291, 125, 52, 23);
		s14panel.add(btnS_021);
		
		btnS_022 = new JButton("A4");
		btnS_022.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnS_022.getText(),south);
				btnS_022.setEnabled(false);
			}
		});
		btnS_022.setBounds(353, 125, 52, 23);
		s14panel.add(btnS_022);
		
		btnS_023 = new JButton("A4");
		btnS_023.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnS_023.getText(),south);
				btnS_023.setEnabled(false);
			}
		});
		btnS_023.setBounds(353, 170, 52, 23);
		s14panel.add(btnS_023);
		
		btnS_024 = new JButton("A3");
		btnS_024.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnS_024.getText(),south);
				btnS_024.setEnabled(false);
			}
		});
		btnS_024.setBounds(291, 170, 52, 23);
		s14panel.add(btnS_024);
		
		btnS_025 = new JButton("A4");
		btnS_025.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnS_025.getText(),south);
				btnS_025.setEnabled(false);
			}
		});
		btnS_025.setBounds(675, 34, 52, 23);
		s14panel.add(btnS_025);
		
		btnS_026 = new JButton("A3");
		btnS_026.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnS_026.getText(),south);
				btnS_026.setEnabled(false);
			}
		});
		btnS_026.setBounds(613, 34, 52, 23);
		s14panel.add(btnS_026);
		
		btnS_027 = new JButton("A3");
		btnS_027.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnS_027.getText(),south);
				btnS_027.setEnabled(false);
			}
		});
		btnS_027.setBounds(613, 79, 52, 23);
		s14panel.add(btnS_027);
		
		btnS_028 = new JButton("A3");
		btnS_028.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnS_028.getText(),south);
				btnS_028.setEnabled(false);
			}
		});
		btnS_028.setBounds(613, 125, 52, 23);
		s14panel.add(btnS_028);
		
		btnS_029 = new JButton("A3");
		btnS_029.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnS_029.getText(),south);
				btnS_029.setEnabled(false);
			}
		});
		btnS_029.setBounds(613, 170, 52, 23);
		s14panel.add(btnS_029);
		
		btnS_030 = new JButton("A4");
		btnS_030.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnS_030.getText(),south);
				btnS_030.setEnabled(false);
			}
		});
		btnS_030.setBounds(675, 170, 52, 23);
		s14panel.add(btnS_030);
		
		btnS_031 = new JButton("A4");
		btnS_031.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnS_031.getText(),south);
				btnS_031.setEnabled(false);
			}
		});
		btnS_031.setBounds(675, 125, 52, 23);
		s14panel.add(btnS_031);
		
		btnS_032 = new JButton("A4");
		btnS_032.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnS_032.getText(),south);
				btnS_032.setEnabled(false);
			}
		});
		btnS_032.setBounds(675, 79, 52, 23);
		s14panel.add(btnS_032);
		
		btnS_033 = new JButton("A4");
		btnS_033.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnS_033.getText(),south);
				btnS_033.setEnabled(false);
			}
		});
		btnS_033.setBounds(511, 34, 52, 23);
		s14panel.add(btnS_033);
		
		btnS_034 = new JButton("A3");
		btnS_034.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnS_034.getText(),south);
				btnS_034.setEnabled(false);
			}
		});
		btnS_034.setBounds(449, 34, 52, 23);
		s14panel.add(btnS_034);
		
		btnS_035 = new JButton("A3");
		btnS_035.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnS_035.getText(),south);
				btnS_035.setEnabled(false);
			}
		});
		btnS_035.setBounds(449, 79, 52, 23);
		s14panel.add(btnS_035);
		
		btnS_036 = new JButton("A3");
		btnS_036.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnS_036.getText(),south);
				btnS_036.setEnabled(false);
			}
		});
		btnS_036.setBounds(449, 125, 52, 23);
		s14panel.add(btnS_036);
		
		btnS_037 = new JButton("A3");
		btnS_037.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnS_037.getText(),south);
				btnS_037.setEnabled(false);
			}
		});
		btnS_037.setBounds(449, 170, 52, 23);
		s14panel.add(btnS_037);
		
		btnS_038 = new JButton("A4");
		btnS_038.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnS_038.getText(),south);
				btnS_038.setEnabled(false);
			}
		});
		btnS_038.setBounds(511, 170, 52, 23);
		s14panel.add(btnS_038);
		
		btnS_039 = new JButton("A4");
		btnS_039.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnS_039.getText(),south);
				btnS_039.setEnabled(false);
			}
		});
		btnS_039.setBounds(511, 125, 52, 23);
		s14panel.add(btnS_039);
		
		btnS_040 = new JButton("A4");
		btnS_040.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seat(btnS_040.getText(),south);
				btnS_040.setEnabled(false);
			}
		});
		btnS_040.setBounds(511, 79, 52, 23);
		s14panel.add(btnS_040);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 338, 737, 25);
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 4, 0, 0));
		
		btnE = new JButton(east);
		btnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				e11panel.setVisible(true);
				w12panel.setVisible(false);
				n13panel.setVisible(false);
				s14panel.setVisible(false);
				
				btnE.setEnabled(false);
				btnW.setEnabled(true);
				btnN.setEnabled(true);
				btnS.setEnabled(true);
				
				
				
				panel_E_11.setVisible(true);
				panel_N_13.setVisible(false);
				panel_S_14.setVisible(false);
				panel_W_12.setVisible(false);
				
				
				//frame.setTitle(east);
				
			}
		});
		panel_1.add(btnE);
		
		btnW = new JButton(west);
		btnW.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				e11panel.setVisible(false);
				w12panel.setVisible(true);
				n13panel.setVisible(false);
				s14panel.setVisible(false);
				
				btnE.setEnabled(true);
				btnW.setEnabled(false);
				btnN.setEnabled(true);
				btnS.setEnabled(true);
				
				
				
				
				panel_E_11.setVisible(false);
				panel_N_13.setVisible(false);
				panel_S_14.setVisible(false);
				panel_W_12.setVisible(true);
				
				//frame.setTitle(west);
				
				
				
			}
		});
		panel_1.add(btnW);
		
		btnN = new JButton(north);
		btnN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				e11panel.setVisible(false);
				w12panel.setVisible(false);
				n13panel.setVisible(true);
				s14panel.setVisible(false);
				
				btnE.setEnabled(true);
				btnW.setEnabled(true);
				btnN.setEnabled(false);
				btnS.setEnabled(true);
				
				
				
				panel_E_11.setVisible(false);
				panel_N_13.setVisible(true);
				panel_S_14.setVisible(false);
				panel_W_12.setVisible(false);
				
				//frame.setTitle(north);
				
				
			}
		});
		panel_1.add(btnN);
		
		btnS = new JButton(south);
		btnS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				e11panel.setVisible(false);
				w12panel.setVisible(false);
				n13panel.setVisible(false);
				s14panel.setVisible(true);
				
				btnE.setEnabled(true);
				btnW.setEnabled(true);
				btnN.setEnabled(true);
				btnS.setEnabled(false);
				
				
				panel_E_11.setVisible(false);
				panel_N_13.setVisible(false);
				panel_S_14.setVisible(true);
				panel_W_12.setVisible(false);
				
				
				//frame.setTitle(south);
				
				
			}
		});
		panel_1.add(btnS);
		
		panel_2 = new JPanel();
		panel_2.setBounds(10, 0, 737, 118);
		contentPane.add(panel_2);
		panel_2.setLayout(new CardLayout(0, 0));
		
		panel_E_11 = new JPanel();
		panel_2.add(panel_E_11, "name_13275386856660");
		panel_E_11.setLayout(null);
		
		label_E_11 = new JLabel(".");
		label_E_11.setBounds(0, 0, 737, 121);
		panel_E_11.add(label_E_11);
		Image img2 = new ImageIcon(this.getClass().getResource("/Ant Man_e.jpg")).getImage();		/// v.v. important to make EXE . >> 
		label_E_11.setIcon(new ImageIcon(img2));
		
		panel_W_12 = new JPanel();
		panel_2.add(panel_W_12, "name_13897853333590");
		panel_W_12.setLayout(null);
		
		 label_W_12 = new JLabel(".");
		 label_W_12.setBounds(0, 0, 737, 121);
		 panel_W_12.add(label_W_12);
		 //label_W_12.setIcon(new ImageIcon(img2));
		 Image img3 = new ImageIcon(this.getClass().getResource("/three idiotsE.jpg")).getImage();		/// v.v. important to make EXE . >> 
		 label_W_12.setIcon(new ImageIcon(img3));
		 
		 panel_N_13 = new JPanel();
		 panel_2.add(panel_N_13, "name_14015547583009");
		 panel_N_13.setLayout(null);
		 
		 label_N_13 = new JLabel(".");
		 label_N_13.setBounds(0, 0, 737, 121);
		 panel_N_13.add(label_N_13);
		 Image img4 = new ImageIcon(this.getClass().getResource("/hulk.gif")).getImage();
		// Image img4 = new ImageIcon(this.getClass().getResource("/hancockE.jpg")).getImage();		/// v.v. important to make EXE . >> 
		 label_N_13.setIcon(new ImageIcon(img4));
		 
		 
		 
		 panel_S_14 = new JPanel();
		 panel_2.add(panel_S_14, "name_14317886312990");
		 panel_S_14.setLayout(null);
		 
		 label_S_14 = new JLabel("");
		 label_S_14.setBounds(0, 0, 737, 122);
		 panel_S_14.add(label_S_14);
		 Image img5 = new ImageIcon(this.getClass().getResource("/hancock23.jpg")).getImage();		/// v.v. important to make EXE . >> 
		 label_S_14.setIcon(new ImageIcon(img5));
		 
		 JLabel lblIn = new JLabel("Entry");
		 lblIn.setForeground(Color.GREEN);
		 lblIn.setBackground(Color.GREEN);
		 lblIn.setFont(new Font("Tahoma", Font.BOLD, 18));
		 lblIn.setBounds(0, 122, 56, 24);
		 contentPane.add(lblIn);
		 
		 lblOut = new JLabel("Out");
		 lblOut.setForeground(Color.RED);
		 lblOut.setFont(new Font("Tahoma", Font.BOLD, 19));
		 lblOut.setBackground(Color.GREEN);
		 lblOut.setBounds(725, 121, 42, 24);
		 contentPane.add(lblOut);
		 
		 JButton btnBack = new JButton("Back");
		 btnBack.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent arg0) {
		 		Show.obseatnumber.dispose();
		 		//UserInfo.frame.setVisible(true);
		 	}
		 });
		 btnBack.setBounds(145, 361, 461, 23);
		 contentPane.add(btnBack);
		 setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{contentPane, panel, e11panel, btn1, btn2, btn3, btn19, btn20, btn21, btn14, btn22, btn23, btn24, btn13, btn6, btn5, btn4, btn18, btn28, btn29, btn30, btn17, btn12, btn11, btn10, btn15, btn9, btn8, btn7, btn16, btn25, btn26, btn27, w12panel, btnW001, btnW002, btnW003, btnW004, btnW005, btnW006, btnW007, btnW008, btnW009, btnW011, btnW012, btnW013, btnW014, btnW030, btnW010, btnW031, btnW015, btnW032, btnW016, btnW017, btnW019, btnW020, btnW021, btnW022, btnW023, btnW024, btnW025, btnW026, btnW028, btnW029, n13panel, btnN021, btnN001, btnN002, btnN003, btnN004, btnN005, btnN006, btnN007, btnN008, btnN009, btnN010, btnN011, btnN012, btnN013, btnN014, btnN015, btnN016, btnN017, btnN018, btnN019, btnN020, btnN022, btnN023, btnN024, btnN025, btnN026, btnN027, btnN028, btnN029, btnN030, btnN031, btnN032, btnN033, btnN034, btnN035, btnN036, s14panel, btnS_001, btnS_002, btnS_003, btnS_004, btnS_005, btnS_006, btnS_007, btnS_008, btnS_009, btnS_010, btnS_011, btnS_012, btnS_013, btnS_014, btnS_015, btnS_016, btnS_017, btnS_018, btnS_019, btnS_020, btnS_021, btnS_022, btnS_023, btnS_024, btnS_025, btnS_026, btnS_027, btnS_028, btnS_029, btnS_030, btnS_031, btnS_032, btnS_033, btnS_034, btnS_035, btnS_036, btnS_037, btnS_038, btnS_039, btnS_040, panel_1, btnE, btnW, btnN, btnS, panel_2, panel_E_11, label_E_11, panel_W_12, label_W_12, panel_N_13, label_N_13, panel_S_14, label_S_14}));
	}
	
	public void Seat(String seat,String hall ) {
		UserInfo.info_data_seat(seat, hall);
		
		//Show.obseatnumber.dispose();
		
	}
}
