package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.WindowConstants;
import javax.swing.filechooser.FileNameExtensionFilter;

import frames.SettingsWindow;
import game.Game;


public class Index extends JPanel implements ActionListener {
	
	private JLabel jLabel1 = new JLabel();
	private JButton openButton;
	private JButton settings;
	private JFileChooser fc;
	private static JFrame frame;
	
	public Index() {
		super(new BorderLayout());
		
		//Create a file chooser
		fc = new JFileChooser();
		
		//Uncomment one of the following lines to try a different
		//file selection mode.	The first allows just directories
		//to be selected (and, at least in the Java look and feel,
		//shown).	The second allows both files and directories
		//to be selected.	If you leave these lines commented out,
		//then the default mode (FILES_ONLY) will be used.
		//
		//fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		//fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		
		jLabel1.setText("Willkommen bei Scotland Yard!");
		jLabel1.setFont(new Font("Arial Narrow", Font.BOLD, 21));
		jLabel1.setForeground(Color.BLUE);
		
		//Create the open button.	We use the image from the JLF
		//Graphics Repository (but we extracted it from the jar).
		openButton = new JButton("Letztes Spiel laden");
		openButton.addActionListener(this);
		
		
		settings = new JButton("Einstellungen");
		settings.addActionListener(this);
		
		//For layout purposes, put the buttons in a separate panel
		JPanel labelPanel = new JPanel();
		labelPanel.add(jLabel1);
		
		JPanel buttonPanel = new JPanel(); //use FlowLayout
		buttonPanel.add(openButton);
		buttonPanel.add(settings);
		
		//Add the buttons and the log to this panel.
		add(labelPanel, BorderLayout.PAGE_START);
		add(buttonPanel, BorderLayout.PAGE_END);
	}
		
	public void actionPerformed(ActionEvent e) {
		
		//Handle open button action.
		if (e.getSource() == openButton) {
			fc.setFileFilter(new FileNameExtensionFilter("scys files (*.scys)", "scys"));
			fc.removeChoosableFileFilter(fc.getAcceptAllFileFilter());
			
			int returnVal = fc.showOpenDialog(Index.this);
			if (returnVal == JFileChooser.APPROVE_OPTION) {
				File file = fc.getSelectedFile();
				Game.run(SettingsWindow.loadSetting(SettingsWindow.readLines(file.getAbsolutePath())));
				frame.dispose();
			} 
		} 
		else if (e.getSource() == settings) {
			new SettingsWindow("Scotland Yard - Einstellungen");
			frame.dispose();
		} // end of if
	}
			
	/**
	 * Create the GUI and show it.	For thread safety,
	 * this method should be invoked from the
	 * event dispatch thread.
	 */
	private static void createAndShowGUI() {
		//Create and set up the window.
		frame = new JFrame("Scotland Yard - Willkommen");
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		//Add content to the window.
		frame.add(new Index());
		
		//Display the window.
		frame.pack();
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (d.width - frame.getSize().width) / 2;
		int y = (d.height - frame.getSize().height) / 2;
		frame.setLocation(x, y);
		frame.setVisible(true);
		frame.setResizable(false);
	}

	public static void main(String[] args) {
		//Schedule a job for the event dispatch thread:
		//creating and showing this application's GUI.
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				//Turn off metal's use of bold fonts
				UIManager.put("swing.boldMetal", Boolean.FALSE); 
				createAndShowGUI();
			}
		});
	}

}

