package frames;

import game.Game;
import game.GameData;
import game.Location;
import game.Player;
import lists.Queue;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import java.util.LinkedList;
import java.util.Random;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
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
	* @version 1.0 from 08.01.2017
	* @author 
	*/

public class SettingsWindow extends JFrame {

	private File file;
	private JFileChooser fc = new JFileChooser();
	private JLabel jLabel1 = new JLabel();
	private JLabel jLabel2 = new JLabel();
	private JLabel jLabel3 = new JLabel();
	private JSpinner jSpinner1 = new JSpinner();
	private SpinnerNumberModel jSpinner1Model = new SpinnerNumberModel(4, 2, 8, 1);
	private JSpinner jSpinner2 = new JSpinner();
	private SpinnerNumberModel jSpinner2Model = new SpinnerNumberModel(22, 10, 100, 1);
	private JSpinner jSpinner3 = new JSpinner();
	private SpinnerNumberModel jSpinner3Model = new SpinnerNumberModel(3, 0, 22, 1);
	private JLabel jLabel4 = new JLabel();
	private JSpinner jSpinner4 = new JSpinner();
	private SpinnerNumberModel jSpinner4Model = new SpinnerNumberModel(5, 1, 22, 1);
	private JLabel jLabel6 = new JLabel();
	private JSpinner jSpinner6 = new JSpinner();
	private SpinnerNumberModel jSpinner6Model = new SpinnerNumberModel(10, 0, 22, 1);
	private JLabel jLabel7 = new JLabel();
	private JSpinner jSpinner7 = new JSpinner();
	private SpinnerNumberModel jSpinner7Model = new SpinnerNumberModel(8, 0, 22, 1);
	private JLabel jLabel8 = new JLabel();
	private JSpinner jSpinner8 = new JSpinner();
	private SpinnerNumberModel jSpinner8Model = new SpinnerNumberModel(4, 0, 22, 1);
	private JLabel jLabel9 = new JLabel();
	private JLabel jLabel10 = new JLabel();
	private JSpinner jSpinner9 = new JSpinner();
	private SpinnerNumberModel jSpinner9Model = new SpinnerNumberModel(4, 0, 22, 1);
	private JLabel jLabel11 = new JLabel();
	private JSpinner jSpinner10 = new JSpinner();
	private SpinnerNumberModel jSpinner10Model = new SpinnerNumberModel(3, 0, 22, 1);
	private JLabel jLabel12 = new JLabel();
	private JSpinner jSpinner11 = new JSpinner();
	private SpinnerNumberModel jSpinner11Model = new SpinnerNumberModel(3, 0, 22, 1);
	private JLabel jLabel13 = new JLabel();
	private JLabel jLabel14 = new JLabel();
	private JSpinner jSpinner12 = new JSpinner();
	private SpinnerNumberModel jSpinner12Model = new SpinnerNumberModel(3, 0, 24, 1);
	private JLabel jLabel15 = new JLabel();
	private JSpinner jSpinner13 = new JSpinner();
	private SpinnerNumberModel jSpinner13Model = new SpinnerNumberModel(2, 0, 22, 1);
	private JLabel jLabel16 = new JLabel();
	private JLabel jLabel17 = new JLabel();
	private JButton jButton1 = new JButton();
	private JButton jButton2 = new JButton();
	private JTextField jTextField1 = new JTextField();
	private JLabel jLabel18 = new JLabel();
	private JLabel jLabel19 = new JLabel();
	private JLabel jLabel20 = new JLabel();
	private JRadioButton jRadioButton1 = new JRadioButton();
	private JRadioButton jRadioButton2 = new JRadioButton();
	private ButtonGroup buttonGroup1 = new ButtonGroup();

	public SettingsWindow (String title){
		super (title);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		int frameWidth = 497; 
		int frameHeight = 568;
		setSize(frameWidth, frameHeight);
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (d.width - getSize().width) / 2;
		int y = (d.height - getSize().height) / 2;
		setLocation(x, y);
		Container cp = getContentPane();
		cp.setLayout(null);

		jLabel1.setBounds(16, 64, 160, 25);
		jLabel1.setText("Anzahl der Spieler:");
		cp.add(jLabel1);
		jLabel2.setBounds(16, 104, 160, 25);
		jLabel2.setText("max. Runden:");
		cp.add(jLabel2);
		jLabel3.setBounds(256, 64, 160, 25);
		jLabel3.setText("erste Sichtung:");
		jLabel3.setToolTipText("in welcher Runde wird MisterX für die Detektive zum ersten mal Sichtbar");
		jLabel3.setForeground(new Color(0x008000));
		jLabel3.setFont(new Font("Dialog", Font.BOLD, 12));
		cp.add(jLabel3);
		jSpinner1.setBounds(184, 64, 49, 25);
		jSpinner1.setValue(4);
		jSpinner1.setModel(jSpinner1Model);
		jSpinner1.addChangeListener(new ChangeListener() { 
			public void stateChanged(ChangeEvent evt) { 
				jSpinner1_StateChanged(evt);
			}
		});
		cp.add(jSpinner1);
		
		jSpinner2.setBounds(184, 104, 49, 25);
		jSpinner2.setValue(22);
		jSpinner2.setModel(jSpinner2Model);
		jSpinner2.addChangeListener(new ChangeListener() { 
			public void stateChanged(ChangeEvent evt) { 
				jSpinner2_StateChanged(evt);
			}
		});
		cp.add(jSpinner2);
		
		
		jSpinner3.setBounds(424, 64, 49, 25);
		jSpinner3.setValue(3);
		jSpinner3.setModel(jSpinner3Model);
		
		jSpinner3.setFont(new Font("Dialog", Font.BOLD, 12));
		jSpinner3.setForeground(new Color(0x008000));
		cp.add(jSpinner3);
		
		jLabel4.setBounds(256, 104, 160, 25);
		jLabel4.setText("Sichtungs Wiederholungen:");
		jLabel4.setToolTipText("in welcher Runden-Regelmäßigkeit sich MisterX zeigen muss nach der ersten Sichtung");
		jLabel4.setForeground(new Color(0x008000));
		
		jLabel4.setFont(new Font("Dialog", Font.BOLD, 12));
		cp.add(jLabel4);
		jSpinner4.setBounds(424, 104, 49, 25);
		jSpinner4.setValue(5);
		jSpinner4.setModel(jSpinner4Model);
		
		jSpinner4.setFont(new Font("Dialog", Font.BOLD, 12));
		jSpinner4.setForeground(new Color(0x008000));
		cp.add(jSpinner4);
		
		jLabel6.setBounds(16, 288, 160, 25);
		jLabel6.setText("Taxi-Tickets:");
		jLabel6.setToolTipText("");
		jLabel6.setForeground(Color.BLUE);
		cp.add(jLabel6);
		jSpinner6.setBounds(184, 288, 49, 25);
		jSpinner6.setValue(10);
		jSpinner6.setModel(jSpinner6Model);
		cp.add(jSpinner6);
		
		jLabel7.setBounds(16, 328, 160, 25);
		jLabel7.setText("Bus-Tickets:");
		jLabel7.setToolTipText("");
		jLabel7.setForeground(Color.BLUE);
		cp.add(jLabel7);
		jSpinner7.setBounds(184, 328, 49, 25);
		jSpinner7.setValue(8);
		jSpinner7.setModel(jSpinner7Model);
		cp.add(jSpinner7);
		
		jLabel8.setBounds(16, 368, 160, 25);
		jLabel8.setText("Underground-Tickets:");
		jLabel8.setToolTipText("");
		jLabel8.setForeground(Color.BLUE);
		cp.add(jLabel8);
		jSpinner8.setBounds(184, 368, 49, 25);
		jSpinner8.setValue(4);
		jSpinner8.setModel(jSpinner8Model);
		cp.add(jSpinner8);
		
		jLabel9.setBounds(16, 240, 219, 33);
		jLabel9.setText("Detektiv");
		jLabel9.setForeground(Color.BLUE);
		jLabel9.setFont(new Font("Arial Narrow", Font.BOLD, 24));
		jLabel9.setHorizontalAlignment(SwingConstants.CENTER);
		cp.add(jLabel9);
		jLabel10.setBounds(256, 208, 160, 25);
		jLabel10.setText("Taxi-Tickets:");
		jLabel10.setForeground(Color.RED);
		cp.add(jLabel10);
		jSpinner9.setBounds(424, 208, 49, 25);
		jSpinner9.setValue(4);
		jSpinner9.setModel(jSpinner9Model);
		cp.add(jSpinner9);
		
		jLabel11.setBounds(256, 248, 160, 25);
		jLabel11.setText("Bus-Tickets:");
		jLabel11.setForeground(Color.RED);
		cp.add(jLabel11);
		jSpinner10.setBounds(424, 248, 49, 25);
		jSpinner10.setValue(3);
		jSpinner10.setModel(jSpinner10Model);
		cp.add(jSpinner10);
		
		jLabel12.setBounds(256, 288, 160, 25);
		jLabel12.setText("Underground-Tickets:");
		jLabel12.setForeground(Color.RED);
		cp.add(jLabel12);
		jSpinner11.setBounds(424, 288, 49, 25);
		jSpinner11.setValue(3);
		jSpinner11.setModel(jSpinner11Model);
		cp.add(jSpinner11);
		
		jLabel13.setBounds(256, 160, 219, 33);
		jLabel13.setText("MisterX");
		jLabel13.setFont(new Font("Arial Narrow", Font.BOLD, 24));
		jLabel13.setForeground(Color.RED);
		jLabel13.setHorizontalAlignment(SwingConstants.CENTER);
		cp.add(jLabel13);
		jLabel14.setBounds(256, 328, 160, 25);
		jLabel14.setText("Blacktickets:");
		jLabel14.setForeground(Color.RED);
		cp.add(jLabel14);
		jSpinner12.setBounds(424, 328, 49, 25);
		jSpinner12.setValue(3);
		jSpinner12.setModel(jSpinner12Model);
		cp.add(jSpinner12);
		
		jLabel15.setBounds(256, 368, 160, 25);
		jLabel15.setText("Multiplicators:");
		jLabel15.setForeground(Color.RED);
		cp.add(jLabel15);
		jSpinner13.setBounds(424, 368, 49, 25);
		jSpinner13.setValue(2);
		jSpinner13.setModel(jSpinner13Model);
		cp.add(jSpinner13);
		
		jLabel16.setBounds(16, 16, 219, 33);
		jLabel16.setText("Allgemein");
		jLabel16.setForeground(Color.BLACK);
		jLabel16.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel16.setFont(new Font("Arial Narrow", Font.BOLD, 24));
		cp.add(jLabel16);
		jLabel17.setBounds(256, 16, 219, 33);
		jLabel17.setText("Sichtungen");
		jLabel17.setForeground(new Color(0x008000));
		jLabel17.setHorizontalAlignment(SwingConstants.CENTER);
		
		jLabel17.setFont(new Font("Arial Narrow", Font.BOLD, 24));
		cp.add(jLabel17);
		jButton1.setBounds(8, 464, 465, 57);
		jButton1.setText("Bitte Karte wählen!");
		jButton1.setMargin(new Insets(2, 2, 2, 2));
		jButton1.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent evt){ 
				jButton1_ActionPerformed(evt);
			}
		});
		jButton1.setEnabled(false);
		jButton1.setForeground(Color.WHITE);
		jButton1.setBackground(Color.BLACK);
		jButton1.setFont(new Font("Dialog", Font.BOLD, 36));
		cp.add(jButton1);
		jButton2.setBounds(376, 416, 97, 25);
		jButton2.setText("Lade Karte");
		jButton2.setMargin(new Insets(2, 2, 2, 2));
		jButton2.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent evt) { 
				jButton2_ActionPerformed(evt);
			}
		});
		cp.add(jButton2);
		jTextField1.setBounds(8, 416, 345, 25);
		cp.add(jTextField1);
		jLabel18.setBounds(16, 192, 51, 25);
		jLabel18.setText("normal");
		cp.add(jLabel18);
		jLabel19.setBounds(128, 192, 51, 25);
		jLabel19.setText("random");
		cp.add(jLabel19);
		jLabel20.setBounds(16, 152, 197, 25);
		jLabel20.setText("Spielerstartpositionsbestimmung:");
		cp.add(jLabel20);
		jRadioButton1.setBounds(72, 192, 25, 25);
		jRadioButton1.setText("");
		jRadioButton1.setOpaque(false);
		jRadioButton1.setSelected(true);
		buttonGroup1.add(jRadioButton1);
		cp.add(jRadioButton1);
		jRadioButton2.setBounds(184, 192, 25, 25);
		jRadioButton2.setText("");
		jRadioButton2.setOpaque(false);
		buttonGroup1.add(jRadioButton2);
		cp.add(jRadioButton2);
		
		setResizable(false);
		setVisible(true);
	}

	public static String[] readLines(String filepath){
		Queue lines = new Queue();
		String line;
		FileReader fr;
		BufferedReader br;
		
		try {
			fr = new FileReader(filepath);
			br = new BufferedReader(fr);
			
			while ((line = br.readLine()) != null) {
				lines.enqueue(line);
			}
			
			br.close();
			fr.close();
		} catch (IOException e) {
			System.out.println(e);
		} return lines.gibListeStrings();
	}	
	
	public static int loadSetting(String[] lines){
		GameData.setMAP(lines[0]);
		createMap(readLines(GameData.getMAP()));
		
		Player[] player = new Player[Integer.parseInt(lines[1])];
		
		String[] pp = lines[2].split(",");
		String[] pt = lines[3].split(",");
		String[] pb = lines[4].split(",");
		String[] pu = lines[5].split(",");
		
		for (int i=0; i<player.length; i++) {
			player[i] = new Player();
			player[i].moveTo(Integer.parseInt(pp[i]),(i!=0));
			player[i].setTaxiCards(Integer.parseInt(pt[i]));
			player[i].setBusCards(Integer.parseInt(pb[i]));
			player[i].setUndergroundCards(Integer.parseInt(pu[i]));
		} 
		player[0].setSecretCards(Integer.parseInt(lines[6]));
		player[0].setMultiplicators(Integer.parseInt(lines[7]));
		GameData.setPLAYERS(player);
		
		String[] sa = lines[8].split(",");
		Queue sq = new Queue();
		for (int i=0; i<sa.length; i++) {
			sq.enqueue(Integer.parseInt(sa[i]));
		} 
		GameData.setSIGHTS(sq.gibListeInts());
		
		if (!lines[9].equals("")) {
			String[] tla = lines[9].split(",");
			String[] npa = lines[10].split(",");
			for (int i=0; i<tla.length; i++) {
				MisterTravelTable.tl.enqueue(tla[i]);
				MisterTravelTable.np.enqueue(Integer.parseInt(npa[i]));
			} 	
		} 
		
		GameData.setROUNDS(Integer.parseInt(lines[11]));
		Game.cp = Integer.parseInt(lines[12]);
		return Integer.parseInt(lines[13]);
	} 
			
	public static void createMap(String[] lines){
		Location[] locations = new Location[lines.length];
		for (int i=0;i<lines.length;i++) {
			locations[i] = new Location();
		} 
		
		for (int i=0;i<lines.length;i++) {
			String[] lp = lines[i].split("/");
			for (int j=0; j<lp.length; j++) {
				if (lp[j].charAt(0) != 32) {
					String[] sn = lp[j].split(",");
					if (j == 0) {
						int[] in = new int[sn.length];
						for (int k=0; k<sn.length; k++) {
							in[k] = Integer.parseInt(sn[k]);
						} 
						locations[i].setTaxiConnections(in);
					} 
					if (j == 1) {
						int[] in = new int[sn.length];
						for (int k=0; k<sn.length; k++) {
							in[k] = Integer.parseInt(sn[k]);
						} 
						locations[i].setBusConnections(in);
					} 
					if (j == 2) {
						int[] in = new int[sn.length];
						for (int k=0; k<sn.length; k++) {
							in[k] = Integer.parseInt(sn[k]);
						} 
						locations[i].setUndergroundConnections(in);
					} 
					if (j == 3) {
						int[] in = new int[sn.length];
						for (int k=0; k<sn.length; k++) {
							in[k] = Integer.parseInt(sn[k]);
						} 
						locations[i].setSecretConnections(in);
					} 
				} 
			} 
		} GameData.setLOCATIONS(locations);
	}
		
	public void spawnPlayer(boolean random){
		createMap(readLines(GameData.getMAP()));
		Random rnd = new Random();
		rnd.setSeed(System.nanoTime());
		LinkedList<Integer> ml = new LinkedList<Integer>();
		if (random) {
			for (int i=1; i<GameData.getLOCATIONS().length; i++)
				ml.add(i);
			
			for (int i=0; i<GameData.getPLAYERS().length; i++) {
				int index = rnd.nextInt(ml.size())+1;
				int mlld = ml.get(index);
				GameData.getPLAYERS()[i].moveTo(mlld,(i!=0));
				
				ml.remove(index);
				for (int j=0; j<GameData.getLOCATIONS()[mlld].getTaxiConnections().length; j++)
					ml.remove(GameData.getLOCATIONS()[mlld].getTaxiConnections()[j]);
				
				for (int j=0; j<GameData.getLOCATIONS()[mlld].getBusConnections().length; j++)
					ml.remove(GameData.getLOCATIONS()[mlld].getBusConnections()[j]);
					
				for (int j=0; j<GameData.getLOCATIONS()[mlld].getUndergroundConnections().length; j++)
					ml.remove(GameData.getLOCATIONS()[mlld].getUndergroundConnections()[j]);
			} 
		} else {
			for (int i=0; i<GameData.getLOCATIONS()[0].getTaxiConnections().length; i++)
				ml.add(GameData.getLOCATIONS()[0].getTaxiConnections()[i]);
			
			for (int i=0; i<GameData.getPLAYERS().length; i++) {
				int index = rnd.nextInt(ml.size())+1;
				GameData.getPLAYERS()[i].moveTo(ml.get(index),(i!=0));
				ml.remove(index);
			} 
		}
	}
		
	public void jButton1_ActionPerformed(ActionEvent evt){
		
		//Sichtungsliste erstellen
		Queue sights = new Queue();
		for (int i=(int)jSpinner3.getValue(); i<=(int)jSpinner2.getValue() + (int)jSpinner13.getValue(); i+=(int)jSpinner4.getValue()) {
			sights.enqueue(i);
		} 
		
		//erstelle Spieler 
		Player[] players = new Player[(int)jSpinner1.getValue()];
		for (int i=0; i<players.length; i++) {
			players[i] = new Player();
		} 
		
		players[0].setTaxiCards((int)jSpinner9.getValue());
		players[0].setBusCards((int)jSpinner10.getValue());
		players[0].setUndergroundCards((int)jSpinner11.getValue());
		players[0].setSecretCards((int)jSpinner12.getValue());
		players[0].setMultiplicators((int)jSpinner13.getValue());
		for (int i=1; i<players.length; i++) {
			players[i].setTaxiCards((int)jSpinner6.getValue());
			players[i].setBusCards((int)jSpinner7.getValue());
			players[i].setUndergroundCards((int)jSpinner8.getValue());
			players[i].setMultiplicators(0);
			players[i].setSecretCards(0);
		} 
		
		GameData.setROUNDS((int)jSpinner2.getValue());
		GameData.setSIGHTS(sights.gibListeInts());
		GameData.setPLAYERS(players);
		GameData.setMAP(fc.getSelectedFile().getAbsolutePath());
		
		boolean random = false;
		if (jRadioButton1.isSelected()) {
			random = false;
		} 
		else if (jRadioButton2.isSelected()) {
			random = true;
		} 
		spawnPlayer(random);
		
		Game.run(1);
		dispose();
	}
		
	public void jSpinner2_StateChanged(ChangeEvent evt) { 
		//Beim ändern der max. Runden Zahl soll das Maximum der Tickets und Sichtungen angepasst werden
		int mr = (int) jSpinner2.getValue();
		
		//Maximums den SpinnerModels zuweisen ohne andere Werte zu verändern
		jSpinner3Model.setMaximum(mr);
		jSpinner4Model.setMaximum(mr);
		jSpinner6Model.setMaximum(mr);
		jSpinner7Model.setMaximum(mr);
		jSpinner8Model.setMaximum(mr);
		jSpinner9Model.setMaximum(mr);
		jSpinner10Model.setMaximum(mr);
		jSpinner11Model.setMaximum(mr);
		jSpinner12Model.setMaximum(mr);
		jSpinner13Model.setMaximum(mr);
		
		//veränderte Spinnermodels den Spinnern neu zuweisen
		jSpinner3.setModel(jSpinner3Model);
		jSpinner4.setModel(jSpinner4Model);
		jSpinner6.setModel(jSpinner6Model);
		jSpinner7.setModel(jSpinner7Model);
		jSpinner8.setModel(jSpinner8Model);
		jSpinner9.setModel(jSpinner9Model);
		jSpinner10.setModel(jSpinner10Model);
		jSpinner11.setModel(jSpinner11Model);
		jSpinner12.setModel(jSpinner12Model);
		jSpinner13.setModel(jSpinner13Model);
		
		//Spinner Value reduzieren, falls es neues Maximum überschritten haben
		if ((int)jSpinner3.getValue() > mr) {
			jSpinner3.setValue(mr);
		} 
		if ((int)jSpinner4.getValue() > mr) {
			jSpinner4.setValue(mr);
		} 
		if ((int)jSpinner6.getValue() > mr) {
			jSpinner6.setValue(mr);
		} 
		if ((int)jSpinner7.getValue() > mr) {
			jSpinner7.setValue(mr);
		} 
		if ((int)jSpinner8.getValue() > mr) {
			jSpinner8.setValue(mr);
		} 
		if ((int)jSpinner9.getValue() > mr) {
			jSpinner9.setValue(mr);
		} 
		if ((int)jSpinner10.getValue() > mr) {
			jSpinner10.setValue(mr);
		} 
		if ((int)jSpinner11.getValue() > mr) {
			jSpinner11.setValue(mr);
		} 
		if ((int)jSpinner12.getValue() > mr) {
			jSpinner12.setValue(mr);
		} 
		if ((int)jSpinner13.getValue() > mr) {
			jSpinner13.setValue(mr);
		} 
	} 
			
	public void jSpinner1_StateChanged(ChangeEvent evt) { 
		jSpinner12.setValue((int)jSpinner1.getValue()-1); //MisterX erhält soviele Blacktickets, wie Detektive am Spiel teilnehmen
	} 
		
	public void jButton2_ActionPerformed(ActionEvent evt) {
		fc.setFileFilter(new FileNameExtensionFilter("scym files (*.scym)", "scym"));
		fc.removeChoosableFileFilter(fc.getAcceptAllFileFilter());
		int returnVal = fc.showOpenDialog(SettingsWindow.this);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			file = fc.getSelectedFile();
			jTextField1.setText(file.getAbsolutePath());
			jButton1.setEnabled(true);
			jButton1.setText("Lasst uns spielen!");
		}
	}
			
	public String buttonGroup1_getSelectedRadioButtonLabel() {
		for (java.util.Enumeration<AbstractButton> e = buttonGroup1.getElements(); e.hasMoreElements();) {
			AbstractButton b = e.nextElement();
			if (b.isSelected()) return b.getText();
		}
		return "";
	}

}
		