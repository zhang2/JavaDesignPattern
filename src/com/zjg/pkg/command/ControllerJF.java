package com.zjg.pkg.command;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ControllerJF extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ControllerJF frame = new ControllerJF();
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
	public ControllerJF() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton turnOnButton = new JButton("开灯");
		turnOnButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Receiver receiver = new Receiver();
				ConcreteCommandA concreteCommand = new ConcreteCommandA(receiver);
				Invoker invoker = new Invoker(concreteCommand);
				invoker.call();
			}
		});
		turnOnButton.setBounds(106, 126, 117, 29);
		contentPane.add(turnOnButton);
		
		JButton turnOffButton = new JButton("关灯");
		turnOffButton.setBounds(235, 126, 117, 29);
		contentPane.add(turnOffButton);
		
		JButton turnOnTVButton = new JButton("开电视");
		turnOnTVButton.setBounds(106, 167, 117, 29);
		contentPane.add(turnOnTVButton);
		
		JButton turnOffTVButton = new JButton("关闭电视");
		turnOffTVButton.setBounds(235, 167, 117, 29);
		contentPane.add(turnOffTVButton);
		
		turnOffButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Receiver receiver = new Receiver();
				ConcreteCommandB concreteCommand = new ConcreteCommandB(receiver);
				Invoker invoker = new Invoker(concreteCommand);
				invoker.call();
			}
		});
		
	}
}
