package frames;

import game.Game;
import game.GameData;
import game.Location;
import game.Player;
import lists.Queue;
import jeclasses.JNumberField;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Random;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
	*
	* description
	*
	* @version 1.0 from 09.01.2017
	* @author 
	*/

public class MisterTravelTable extends JFrame {

	private JFileChooser fc = new JFileChooser();
	public static Queue tl = new Queue();
	public static Queue np = new Queue();
	private JLabel[] round;
	private JLabel[] travel;
	private JLabel[] position ;
	private JLabel[] player;
	private JNumberField[] player_cp; 
	private JScrollBar jScrollBar1 = new JScrollBar();
	private JTextArea jTextArea1 = new JTextArea("");
	private JScrollPane jTextArea1ScrollPane = new JScrollPane(jTextArea1);
	private JButton jButton1 = new JButton();
	private JButton jButton2 = new JButton();
	private int sgpgm;

	public MisterTravelTable (String title) {
		super (title);
		setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		int frameWidth = 681; 
		int frameHeight = 637;
		setSize(frameWidth, frameHeight);
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (d.width - getSize().width) / 2;
		int y = (d.height - getSize().height) / 2;
		setLocation(x, y);
		Container cp = getContentPane();
		cp.setLayout(null);
		
		sgpgm = GameData.getROUNDS() + GameData.getPLAYERS()[0].getMultiplicators();
		
		round = new JLabel[sgpgm];
		travel = new JLabel[sgpgm];
		position = new JLabel[sgpgm];
		player_cp = new JNumberField[GameData.getPLAYERS().length-1];
		player = new JLabel[GameData.getPLAYERS().length-1];
		
		for (int i=0;i<GameData.getPLAYERS().length-1;i++) {
			player[i] = new JLabel();
			player[i].setBounds(455,((i*30)+175),140,25);
			player[i].setText("Detektiv" + (i+1) + " Position:");
			
			player_cp[i] = new JNumberField();
			player_cp[i].setBounds(610,((i*30)+175),40,25);
			player_cp[i].setInt(GameData.getPLAYERS()[i+1].getCurrentPostion());
			player_cp[i].setEditable(false);
			
			cp.add(player[i]);
			cp.add(player_cp[i]);
		} 	
		
		for (int i=0; i<sgpgm; i++) {
			round[i] = new JLabel();
			round[i].setBounds(10,((i*60)+10),65,50);
			round[i].setText(String.valueOf(i+1));
			round[i].setFont(new Font("Dialog", Font.BOLD, 36));
			round[i].setBackground(Color.GRAY);
			round[i].setOpaque(true);
			round[i].setHorizontalAlignment(SwingConstants.RIGHT);
						
			travel[i] = new JLabel();
			travel[i].setBounds(90,((i*60)+10),230,50);
			travel[i].setFont(new Font("Dialog", Font.BOLD, 36));
			travel[i].setBackground(Color.GRAY);
			travel[i].setOpaque(true);
			travel[i].setHorizontalAlignment(SwingConstants.CENTER);
			
			position[i] = new JLabel();
			position[i].setBounds(345,((i*60)+10),65,50);
			position[i].setVisible(false);
			position[i].setFont(new Font("Dialog", Font.BOLD, 36));
			position[i].setBackground(Color.GRAY);
			position[i].setOpaque(true);
			position[i].setHorizontalAlignment(SwingConstants.CENTER);
			
			if (Game.contains(GameData.getSIGHTS(),i+1)) {
				round[i].setForeground(Color.GREEN);
				round[i].setBackground(Color.DARK_GRAY);
				position[i].setVisible(true);
			} 	
			
			cp.add(round[i]);
			cp.add(travel[i]);
			cp.add(position[i]);
		} 	
		
		int tll = tl.length();
		System.out.println(tll);
		for (int i=0;i<tll;i++) {
			setNewMisterMove(tl.peekString(),np.peekInt(),i); 
			tl.dequeue();
			np.dequeue();
		} 	
		
		jScrollBar1.setBounds(425, 10, 17, 585);
		jScrollBar1.setOrientation(SwingConstants.VERTICAL);
		jScrollBar1.setMaximum(sgpgm);
		jScrollBar1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		jScrollBar1.setBackground(new Color(0xC0C0C0));
		jScrollBar1.addAdjustmentListener(new AdjustmentListener() { 
			public void adjustmentValueChanged(AdjustmentEvent evt) { 
				jScrollBar1_AdjustmentValueChanged(evt);
			}
		});
		jScrollBar1.setMinimum(0);
		jScrollBar1.setUnitIncrement(1);
		jScrollBar1.setVisibleAmount(10);
		jScrollBar1.setBlockIncrement(10);
		cp.add(jScrollBar1);
		jTextArea1ScrollPane.setBounds(456, 8, 200, 150);
		cp.add(jTextArea1ScrollPane);
		
		jButton1.setBounds(456, 496, 203, 41);
		jButton1.setText("Spiel speichern?");
		jButton1.setMargin(new Insets(2, 2, 2, 2));
		jButton1.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent evt) { 
				jButton1_ActionPerformed(evt);
			}
		});
		jButton1.setFont(new Font("Dialog", Font.BOLD, 20));
		cp.add(jButton1);
		jButton2.setBounds(456, 552, 203, 41);
		jButton2.setText("Beenden?!");
		jButton2.setMargin(new Insets(2, 2, 2, 2));
		jButton2.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent evt) { 
				jButton2_ActionPerformed(evt);
			}
		});
		jButton2.setFont(new Font("Dialog", Font.BOLD, 20));
		cp.add(jButton2);
		setResizable(false);
		setVisible(true);
	}

	public void jScrollBar1_AdjustmentValueChanged(AdjustmentEvent evt) {
		int value = jScrollBar1.getValue();
		for (int i=0; i<sgpgm; i++) {
			round[i].setBounds(10,(((i*60)+10)-value*60),65,50);
			travel[i].setBounds(90,(((i*60)+10)-value*60),230,50);
			position[i].setBounds(345,(((i*60)+10)-value*60),65,50);
		} 	
	}
	
	public void sync_player_cp(){
		for (int i=1;i<GameData.getPLAYERS().length;i++) {
			player_cp[i-1].setInt(GameData.getPLAYERS()[i].getCurrentPostion());
		} 	
	}
	
	public void setNewMisterMove(String t, int p, int r){
		tl.enqueue(t);
		np.enqueue(p);
		travel[r].setText(t);
		position[r].setText(String.valueOf(p));
		
		switch (t) {
			case "Taxi":
				travel[r].setBackground(Color.BLACK);
				travel[r].setForeground(Color.WHITE);
				break;
			case "Bus":
				travel[r].setBackground(Color.ORANGE);
				travel[r].setForeground(Color.BLUE);
				break;
			case "Underground":
				travel[r].setBackground(Color.YELLOW);
				travel[r].setForeground(Color.RED);
				break;
			case "Blackticket":
				travel[r].setBackground(Color.LIGHT_GRAY);
				travel[r].setForeground(Color.BLACK);
				break;
		}
	}
	
	public void setPositionsVisible(){
		for (int i=0; i<position.length; i++) {
			position[i].setVisible(true);
		} 	
	} 
	
	public void writeLines(String filepath){
		try{
			PrintWriter writer = new PrintWriter(filepath, "UTF-8");
			
			writer.println(GameData.getMAP());
			writer.println(String.valueOf(GameData.getPLAYERS().length));
			
			StringBuilder builder = new StringBuilder();
			for (int i=0;i<GameData.getPLAYERS().length;i++) {
				builder.append(String.valueOf(GameData.getPLAYERS()[i].getCurrentPostion()) + ",");
			} 	
			writer.println(builder.toString());
			
			builder = new StringBuilder();
			for (int i=0;i<GameData.getPLAYERS().length;i++) {
				builder.append(String.valueOf(GameData.getPLAYERS()[i].getTaxiCards()) + ",");
			} 	
			writer.println(builder.toString());
			
			builder = new StringBuilder();
			for (int i=0;i<GameData.getPLAYERS().length;i++) {
				builder.append(String.valueOf(GameData.getPLAYERS()[i].getBusCards()) + ",");
			} 	
			writer.println(builder.toString());
			
			builder = new StringBuilder();
			for (int i=0;i<GameData.getPLAYERS().length;i++) {
				builder.append(String.valueOf(GameData.getPLAYERS()[i].getUndergroundCards()) + ",");
			} 	
			writer.println(builder.toString());
			
			writer.println(String.valueOf(GameData.getPLAYERS()[0].getSecretCards()));
			writer.println(String.valueOf(GameData.getPLAYERS()[0].getMultiplicators()));																					 
			
			builder = new StringBuilder();
			for (int i=0;i<GameData.getSIGHTS().length;i++) {
				builder.append(String.valueOf(GameData.getSIGHTS()[i]) + ",");
			} 	
			writer.println(builder.toString());
			
			builder = new StringBuilder();
			for (int i=0;i<MisterTravelTable.tl.length();i++) {
				builder.append(MisterTravelTable.tl.peekString() + ",");
				MisterTravelTable.tl.dequeue();
			} 	
			writer.println(builder.toString());
			
			builder = new StringBuilder();
			for (int i=0;i<MisterTravelTable.np.length();i++) {
				builder.append(String.valueOf(MisterTravelTable.np.peekInt()) + ",");
				MisterTravelTable.np.dequeue();
			} 	
			writer.println(builder.toString());
			
			writer.println(String.valueOf(GameData.getROUNDS()));
			writer.println(String.valueOf(Game.cp));
			writer.println(String.valueOf(Game.r));
			
			writer.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	
	public void changeButtons(){
		jButton1.setVisible(false);
		
		if (Game.misterWin) {
			JOptionPane.showMessageDialog(MisterTravelTable.this, "MisterX hat gewonnen");
		} 	
		else {
			JOptionPane.showMessageDialog(MisterTravelTable.this, "die Detektive haben gewonnen");
		}
	}
	
	public void jButton1_ActionPerformed(ActionEvent evt) {
		fc.setFileFilter(new FileNameExtensionFilter("scys files (*.scys)", "scys"));
		fc.removeChoosableFileFilter(fc.getAcceptAllFileFilter());
		
		int returnVal = fc.showSaveDialog(MisterTravelTable.this);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			String filepath = fc.getSelectedFile().getAbsolutePath();
			if (!filepath.endsWith(".scys")) {
				StringBuilder builder = new StringBuilder();
				builder.append(filepath);
				builder.append(".scys");
				filepath = builder.toString();
			} 	
			writeLines(filepath);
		} 
	}

	public void jButton2_ActionPerformed(ActionEvent evt) {
		if (!Game.PM.endGame()) {
			Game.PM.dispose();
			Game.MTT.dispose();
		} 	
		dispose();
	}

}
