package frames;

import game.Game;
import game.GameData;
import jeclasses.JNumberField;
import lists.Queue;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

/**
	*
	* description
	*
	* @version 1.0 from 09.01.2017
	* @author 
	*/

public class PlayerMenu extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
// Anfang Attribute
	private JComboBox<String> jComboBox1 = new JComboBox<String>();
	private DefaultComboBoxModel<String> jComboBox1Model = new DefaultComboBoxModel<String>();
	private JLabel jLabel1 = new JLabel();
	private JNumberField jNumberField1 = new JNumberField();
	private JLabel jLabel2 = new JLabel();
	private JComboBox<String> jComboBox2 = new JComboBox<String>();
	private DefaultComboBoxModel<String> jComboBox2Model = new DefaultComboBoxModel<String>();
	private JLabel jLabel3 = new JLabel();
	private JNumberField jNumberField2 = new JNumberField();
	private JNumberField jNumberField3 = new JNumberField();
	private JNumberField jNumberField4 = new JNumberField();
	private JNumberField jNumberField5 = new JNumberField();
	private JLabel jLabel4 = new JLabel();
	private JLabel jLabel5 = new JLabel();
	private JLabel jLabel6 = new JLabel();
	private JLabel jLabel7 = new JLabel();
	private JNumberField jNumberField6 = new JNumberField();
	private JLabel jLabel8 = new JLabel();
	private JButton jButton1 = new JButton();
	private JCheckBox jCheckBox1 = new JCheckBox();
	private JLabel jLabel9 = new JLabel();
	// Ende Attribute

	public PlayerMenu (String title) {
		super (title);
		setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		int frameWidth = 265; 
		int frameHeight = 344;
		setSize(frameWidth, frameHeight);
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (d.width - getSize().width) / 2;
		int y = (d.height - getSize().height) / 2;
		setLocation(x, y);
		Container cp = getContentPane();
		cp.setLayout(null);
		// Anfang Komponenten
		jComboBox1.setModel(jComboBox1Model);
		jComboBox1.setBounds(120, 72, 121, 25);
		jComboBox1.addItemListener(new ItemListener() { 
			public void itemStateChanged(ItemEvent evt) { 
				jComboBox1_ItemStateChanged(evt);
			}
		});
		cp.add(jComboBox1);
		jLabel1.setBounds(10, 10, 158, 50);
		jLabel1.setText("Spieler");
		jLabel1.setFont(new Font("Dialog", Font.BOLD, 36));
		cp.add(jLabel1);
		jNumberField1.setBounds(173, 10, 65, 50);
		jNumberField1.setText("888");
		jNumberField1.setFont(new Font("Dialog", Font.PLAIN, 36));
		jNumberField1.setEditable(false);
		cp.add(jNumberField1);
		jLabel2.setBounds(8, 72, 100, 25);
		jLabel2.setText("Fahrkarte:");
		cp.add(jLabel2);
		jComboBox2.setModel(jComboBox2Model);
		jComboBox2.setBounds(120, 112, 121, 25);
		cp.add(jComboBox2);
		jLabel3.setBounds(8, 112, 100, 25);
		jLabel3.setText("nächste Position:");
		cp.add(jLabel3);
		jNumberField2.setBounds(88, 168, 33, 25);
		jNumberField2.setText("666");
		jNumberField2.setHorizontalAlignment(SwingConstants.CENTER);
		jNumberField2.setEditable(false);
		cp.add(jNumberField2);
		jNumberField3.setBounds(200, 168, 33, 25);
		jNumberField3.setText("666");
		jNumberField3.setHorizontalAlignment(SwingConstants.CENTER);
		jNumberField3.setEditable(false);
		cp.add(jNumberField3);
		jNumberField4.setBounds(136, 200, 33, 25);
		jNumberField4.setText("666");
		jNumberField4.setHorizontalAlignment(SwingConstants.CENTER);
		jNumberField4.setEditable(false);
		cp.add(jNumberField4);
		jNumberField5.setBounds(88, 232, 33, 25);
		jNumberField5.setText("666");
		jNumberField5.setHorizontalAlignment(SwingConstants.CENTER);
		jNumberField5.setVisible(false);
		jNumberField5.setEditable(false);
		cp.add(jNumberField5);
		jLabel4.setBounds(8, 168, 77, 25);
		jLabel4.setText("Taxi-Tickets:");
		cp.add(jLabel4);
		jLabel5.setBounds(128, 168, 72, 25);
		jLabel5.setText("Bus-Tickets:");
		cp.add(jLabel5);
		jLabel6.setBounds(8, 200, 127, 25);
		jLabel6.setText("Underground-Tickets:");
		cp.add(jLabel6);
		jLabel7.setBounds(8, 232, 80, 25);
		jLabel7.setText("Blacktickets:");
		jLabel7.setVisible(false);
		cp.add(jLabel7);
		jNumberField6.setBounds(216, 232, 33, 25);
		jNumberField6.setText("666");
		jNumberField6.setHorizontalAlignment(SwingConstants.CENTER);
		jNumberField6.setVisible(false);
		jNumberField6.setEditable(false);
		cp.add(jNumberField6);
		jLabel8.setBounds(128, 232, 84, 25);
		jLabel8.setText("Multiplikators:");
		jLabel8.setVisible(false);
		cp.add(jLabel8);
		jButton1.setBounds(56, 272, 185, 25);
		jButton1.setText("Zug beenden!");
		jButton1.setMargin(new Insets(2, 2, 2, 2));
		jButton1.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent evt) { 
				jButton1_ActionPerformed(evt);
			}
		});
		cp.add(jButton1);
		jCheckBox1.setBounds(24, 272, 25, 25);
		jCheckBox1.setText("");
		jCheckBox1.setOpaque(false);
		jCheckBox1.setVisible(false);
		cp.add(jCheckBox1);
		jLabel9.setBounds(8, 272, 19, 25);
		jLabel9.setText("2x");
		jLabel9.setVisible(false);
		cp.add(jLabel9);
		// Ende Komponenten 
		setResizable(false);
		setVisible(true);
		playerPreparation(true);
	}

	// Anfang Methoden	
	public void playerPreparation(boolean erstesMal){
		if (endGame()) {
			Game.MTT.changeButtons();
			Game.MTT.setPositionsVisible();
			dispose();
		} 
		else { 
			if (Game.cp == 0) {
				if (erstesMal) {
					JOptionPane.showMessageDialog(PlayerMenu.this, "Willkommen MisterX!");
					jLabel1.setText("MisterX"); 
					jLabel7.setVisible(true);
					jLabel8.setVisible(true);
					jNumberField5.setVisible(true);
					jNumberField6.setVisible(true);
				} 
				
				jNumberField1.setInt(GameData.getPLAYERS()[0].getCurrentPostion());
				jNumberField5.setInt(GameData.getPLAYERS()[Game.cp].getSecretCards()); 
				jNumberField6.setInt(GameData.getPLAYERS()[Game.cp].getMultiplicators());
				if (erstesMal && 0 < GameData.getPLAYERS()[0].getMultiplicators()) {
					jLabel9.setVisible(true);
					jCheckBox1.setVisible(true);
				} 
				else {
					jLabel9.setVisible(false);
					jCheckBox1.setVisible(false);
				} 
			} 
			else {
				if (jumP()) {
					nextPlayer();
					return;
				} 		
				jLabel1.setText("Detektiv" + Game.cp);
				jNumberField1.setInt(GameData.getPLAYERS()[Game.cp].getCurrentPostion());
				jLabel7.setVisible(false);
				jLabel8.setVisible(false);
				jLabel9.setVisible(false);
				jNumberField5.setVisible(false);
				jNumberField6.setVisible(false);
				jCheckBox1.setVisible(false);
			} 
			
			jNumberField2.setInt(GameData.getPLAYERS()[Game.cp].getTaxiCards());
			jNumberField3.setInt(GameData.getPLAYERS()[Game.cp].getBusCards());
			jNumberField4.setInt(GameData.getPLAYERS()[Game.cp].getUndergroundCards());
			
			setFahrkarte();
		} 
	}
	
	public boolean jumP(){
		if (Game.cp != 0) {
			int c = 0;
			if (freieFahrt("Taxi", GameData.getPLAYERS()[Game.cp].getCurrentPostion())) {
				c++;
			} 
			if (freieFahrt("Bus", GameData.getPLAYERS()[Game.cp].getCurrentPostion())) {
				c++;
			} 
			if (freieFahrt("Underground", GameData.getPLAYERS()[Game.cp].getCurrentPostion())) {
				c++;
			} 
			if (c == 0) {
				return true;
			} 
		} 
		return false;
	}
		
	public boolean endGame(){
		for (int i=1;i<GameData.getPLAYERS().length;i++) {
			if (GameData.getPLAYERS()[0].getCurrentPostion() == GameData.getPLAYERS()[i].getCurrentPostion()) {
				Game.misterWin = false;
				return true;
			} 
		} 
		
		if (Game.r > GameData.getROUNDS()) {
			Game.misterWin = true;
			return true;
		} 
		
		int c = 0;
		for (int i=1;i<GameData.getPLAYERS().length;i++) {
			if (freieFahrt("Taxi", GameData.getPLAYERS()[i].getCurrentPostion())) {
				c++;
			} 
			if (freieFahrt("Bus", GameData.getPLAYERS()[i].getCurrentPostion())) {
				c++;
			} 
			if (freieFahrt("Underground", GameData.getPLAYERS()[i].getCurrentPostion())) {
				c++;
			} 
		} 
		if (c == 0) {
			Game.misterWin = true;
			return true;
		} 
		
		return false;
	}
		
	public int[] getDirections(String travel, int cpcp){
		int[] dir_a = new int[0];
		Queue dir_q = new Queue();
		switch (travel) {
			case "Taxi":
				for (int i=0;i<GameData.getLOCATIONS()[cpcp].getTaxiConnections().length;i++) {
					if (Game.cp == 0) {
						dir_q.enqueue(GameData.getLOCATIONS()[cpcp].getTaxiConnections()[i]);
					} 
					else {
						if (!GameData.getLOCATIONS()[GameData.getLOCATIONS()[cpcp].getTaxiConnections()[i]].getIsSelectedByD()) {
							dir_q.enqueue(GameData.getLOCATIONS()[cpcp].getTaxiConnections()[i]);
						} 
					} 
				} 
				break;
			case "Bus":
				for (int i=0;i<GameData.getLOCATIONS()[cpcp].getBusConnections().length;i++) {
					if (Game.cp == 0) {
						dir_q.enqueue(GameData.getLOCATIONS()[cpcp].getBusConnections()[i]);
					} 
					else {
						if (!GameData.getLOCATIONS()[GameData.getLOCATIONS()[cpcp].getBusConnections()[i]].getIsSelectedByD()) {
							dir_q.enqueue(GameData.getLOCATIONS()[cpcp].getBusConnections()[i]);
						} 
					} 
				} 
				break;
			case "Underground":
				for (int i=0;i<GameData.getLOCATIONS()[cpcp].getUndergroundConnections().length;i++) {
					if (Game.cp == 0) {
						dir_q.enqueue(GameData.getLOCATIONS()[cpcp].getUndergroundConnections()[i]);
					} 
					else {
						if (!GameData.getLOCATIONS()[GameData.getLOCATIONS()[cpcp].getUndergroundConnections()[i]].getIsSelectedByD()) {
							dir_q.enqueue(GameData.getLOCATIONS()[cpcp].getUndergroundConnections()[i]);
						} 
					} 
				} 
				break;
			case "Blackticket":
				for (int i=0;i<GameData.getLOCATIONS()[cpcp].getTaxiConnections().length;i++)
					dir_q.enqueue(GameData.getLOCATIONS()[cpcp].getTaxiConnections()[i]);
				
				for (int i=0;i<GameData.getLOCATIONS()[cpcp].getBusConnections().length;i++) 
					if (!Game.contains(dir_q.gibListeInts(), GameData.getLOCATIONS()[cpcp].getBusConnections()[i]))
						dir_q.enqueue(GameData.getLOCATIONS()[cpcp].getBusConnections()[i]);
				
				for (int i=0;i<GameData.getLOCATIONS()[cpcp].getUndergroundConnections().length;i++)
					if (!Game.contains(dir_q.gibListeInts(), GameData.getLOCATIONS()[cpcp].getUndergroundConnections()[i]))
						dir_q.enqueue(GameData.getLOCATIONS()[cpcp].getUndergroundConnections()[i]);
				
				for (int i=0;i<GameData.getLOCATIONS()[cpcp].getSecretConnections().length;i++)
					if (!Game.contains(dir_q.gibListeInts(), GameData.getLOCATIONS()[cpcp].getSecretConnections()[i]))
						dir_q.enqueue(GameData.getLOCATIONS()[cpcp].getSecretConnections()[i]);
				break;
		} dir_a = dir_q.gibListeInts();
		return dir_a; 
	}
	
	public boolean freieFahrt(String travel, int cpcp){
		switch (travel) {
			case "Taxi":
				if (GameData.getLOCATIONS()[cpcp].getTaxiConnections().length == 0)
					return false;
				if (Game.cp == 0)
					return true;
				else
					for (int i=0;i<GameData.getLOCATIONS()[cpcp].getTaxiConnections().length;i++)
						if (!GameData.getLOCATIONS()[GameData.getLOCATIONS()[cpcp].getTaxiConnections()[i]].getIsSelectedByD())
							return true;
				break;
			case "Bus":
				if (GameData.getLOCATIONS()[cpcp].getBusConnections().length == 0)
					return false;
				if (Game.cp == 0)
					return true; 
				else
					for (int i=0;i<GameData.getLOCATIONS()[cpcp].getBusConnections().length;i++)
						if (!GameData.getLOCATIONS()[GameData.getLOCATIONS()[cpcp].getBusConnections()[i]].getIsSelectedByD())
							return true;
				break;
			case "Underground":
				if (GameData.getLOCATIONS()[cpcp].getUndergroundConnections().length == 0)
					return false;
				if (Game.cp == 0)
					return true;
				else
					for (int i=0;i<GameData.getLOCATIONS()[cpcp].getUndergroundConnections().length;i++)
						if (!GameData.getLOCATIONS()[GameData.getLOCATIONS()[cpcp].getUndergroundConnections()[i]].getIsSelectedByD())
							return true;
				break;
		} return false;
	}
		
	public void setFahrkarte(){
		int cpcp = GameData.getPLAYERS()[Game.cp].getCurrentPostion();
		Queue fahrkarten = new Queue();
		
		if(freieFahrt("Taxi", cpcp)) {
			if (GameData.getPLAYERS()[Game.cp].getTaxiCards() > 0) {
				fahrkarten.enqueue("Taxi");
			} 
		} if(freieFahrt("Bus", cpcp)) {
			if(GameData.getPLAYERS()[Game.cp].getBusCards() > 0) {
				fahrkarten.enqueue("Bus");
			} 
		} if(freieFahrt("Underground", cpcp)) {
			if (GameData.getPLAYERS()[Game.cp].getUndergroundCards() > 0) {
				fahrkarten.enqueue("Underground");
			} 
		} if (GameData.getPLAYERS()[Game.cp].getSecretCards() > 0) {
			fahrkarten.enqueue("Blackticket");
		} jComboBox1.removeAllItems();
		while (!fahrkarten.isEmpty()) {
			jComboBox1.addItem(fahrkarten.peekString());
			fahrkarten.dequeue();	
		} jComboBox1.setSelectedIndex(0);
	}
		
	public void nextPlayer(){
		if (Game.cp == GameData.getPLAYERS().length-1) {
			Game.r++;
			Game.cp = 0;
		} else {
			Game.cp++;	
		} playerPreparation(true);
	}
		
	public void doubleTime(){
		GameData.getPLAYERS()[0].setMultiplicators(GameData.getPLAYERS()[0].getMultiplicators()-1);
		jCheckBox1.setSelected(false);
		GameData.setROUNDS(GameData.getROUNDS()+1);
		Game.r++;
		playerPreparation(false);
	}
		
	public void jComboBox1_ItemStateChanged(ItemEvent evt) {
		if (jComboBox1.getItemCount() > 0) {
			String fahrkarte = (String) jComboBox1.getSelectedItem();
			int[] directions = getDirections(fahrkarte, GameData.getPLAYERS()[Game.cp].getCurrentPostion()) ;
			jComboBox2.removeAllItems();
			for (int i=0;i<directions.length;i++) {
				jComboBox2.addItem(String.valueOf(directions[i]));
			} jComboBox2.setSelectedIndex(0);
		} 
	}
		
	public void jButton1_ActionPerformed(ActionEvent evt) {
		String fahrkarte = (String)jComboBox1.getSelectedItem();
		int direction = Integer.parseInt((String)jComboBox2.getSelectedItem());
		
		switch (fahrkarte) {
			case "Taxi":
				GameData.getPLAYERS()[Game.cp].setTaxiCards(GameData.getPLAYERS()[Game.cp].getTaxiCards()-1);
				break;
			case "Bus":
				GameData.getPLAYERS()[Game.cp].setBusCards(GameData.getPLAYERS()[Game.cp].getBusCards()-1);
				break;
			case "Underground":
				GameData.getPLAYERS()[Game.cp].setUndergroundCards(GameData.getPLAYERS()[Game.cp].getUndergroundCards()-1);
				break;
			case "Blackticket":
				GameData.getPLAYERS()[Game.cp].setSecretCards(GameData.getPLAYERS()[Game.cp].getSecretCards()-1);
				break;
		} 
		
		if (Game.cp == 0) {
			GameData.getPLAYERS()[Game.cp].moveTo(direction, false);
			Game.MTT.setNewMisterMove(fahrkarte, direction, (Game.r-1));
			
			if (jCheckBox1.isSelected()) {
				doubleTime();
			} else {
				nextPlayer();
			} 
		} else {
			GameData.getPLAYERS()[Game.cp].moveTo(direction, true);
			switch (fahrkarte) {
				case "Taxi":
					GameData.getPLAYERS()[0].setTaxiCards(GameData.getPLAYERS()[0].getTaxiCards()+1);
					break;
				case "Bus":
					GameData.getPLAYERS()[0].setBusCards(GameData.getPLAYERS()[0].getBusCards()+1);
					break;
				case "Underground":
					GameData.getPLAYERS()[0].setUndergroundCards(GameData.getPLAYERS()[0].getUndergroundCards()+1);
					break;
			} Game.MTT.sync_player_cp();
			nextPlayer();
		} 	 
	}

}