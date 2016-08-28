package notepad;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;

import notepad.main2.exit_act;

public class source {
	private JEditorPane write;
	private JLabel  statusbar;
	private JMenuBar menubar;
	//private JButton changeTheme;
	
	
	
	public main2(){
		//basic things
		super("Notepad(Alpha verson)");
		
		//menu bar
		
		menubar = new JMenuBar();
		setJMenuBar(menubar);
		
		//file
		JMenu file = new JMenu("file");
		menubar.add(file);
		JMenuItem exit = new JMenuItem("Exit");
		file.add(exit);
		
		//Help
		JMenu help = new JMenu("Help");
		menubar.add(help);
		JMenuItem about = new JMenuItem("About");
		help.add(about);
		
		
		//define JEditorPane
		write = new JEditorPane();
		write.setEditable(true);
		add(new JScrollPane(write) , BorderLayout.CENTER);
		
		//adding action listeners
		exit_act close = new exit_act();
		exit.addActionListener(close);
		
																											
																											//changing theme
																											//changeTheme = new JButton("Switch Theme");
																											//changeTheme.addActionListener(
																													//new ActionListener(){
																														//public void actionPerformed(ActionEvent event){
																															//write.setForeground(Color.WHITE);
																															//write.setBackground(Color.BLACK);
																															//write.setFont(new Font("Serif",Font.BOLD + Font.ITALIC ,14));
																															
																														//}
																													//}
																								  			
																											//);
																											//add(changeTheme , BorderLayout.SOUTH);
			
		
	}
	//action listeners
	
	private class exit_act implements ActionListener{
			public void actionPerformed(ActionEvent event){
				System.exit(0);
			}
	}
	
	
}
