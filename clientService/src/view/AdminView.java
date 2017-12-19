//package view;
//
//import implementation.Packagee;
//import implementation.Route;
//import implementation.User;
//
//import javax.swing.*;
//import javax.swing.table.DefaultTableModel;
//import java.awt.*;
//import java.awt.event.ActionListener;
//import java.util.List;
//
//public class AdminView extends JFrame{
//
//	private JPanel panel;
//	private JLabel username, cityl, timel;
//	private JLabel idl,namel,descriptionl,senderl,receiverl,scityl,dcityl,trackingl,statusl;
//	private JTextField idf,namef,descriptionf,senderf,receiverf,scityf,dcityf,trackingf,statusf;
//	private JTextField cityf,timef;
//	private TextArea route;
//	private JButton logout, addR, add, delete, updateT, updateS;
//	private JScrollPane scroll;
//
//	private JTable table;
//	private DefaultTableModel model;
//
//	String column[] = {"Id","Name","Description","Sender","Receiver","Receiver City",
//			"Sender City", "Tracking", "Status"};
//    String data[][] = {};
//
//
//	private User user;
//	private List<Packagee> packages;
//	private List<User> users;
//	private List<Route> routes;
//	//private List<Route> listanoua;
//
//	public AdminView(User user,List<Packagee> packages, List<User> users, List<Route> lr) {
//		super("User");
//		this.setVisible(true);
//		this.setResizable(false);
//		this.setSize(1300,700);
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		this.setLayout(null);
//
//		this.user = user;
//		this.packages = packages;
//		this.users = users;
//		this.routes = lr;
//
//
//		panel = new JPanel();
//		this.add(panel);
//
////		setPanel(packages, users);
//	}
//
//	public void logout(ActionListener a) {
//		logout.addActionListener(a);
//	}
//
//	public void closePanel() {
//		this.dispose();
//	}
//
//	// ------------ for add, update and delete ------------
//
//	public int getId() {
//		return Integer.parseInt(idf.getText());
//	}
//
//	public String getName() {
//		return namef.getText();
//	}
//
//	public String getDescrition() {
//		return descriptionf.getText();
//	}
//
//	public String getSender() {
//		return senderf.getText();
//	}
//
//	public String getReceiver() {
//		return receiverf.getText();
//	}
//
//	public int getTracking() {
//		return Integer.parseInt(trackingf.getText());
//	}
//
//	public String getStatus() {
//		return statusf.getText();
//	}
//
//	public String getSenderCity() {
//		return scityf.getText();
//	}
//
//	public String getReceiverCity() {
//		return dcityf.getText();
//	}
//
//	public void updateTracking(ActionListener a) {
//		updateT.addActionListener(a);
//	}
//
//	public void updateStatus(ActionListener a) {
//		updateS.addActionListener(a);
//	}
//
//	public void addPackage(ActionListener a) {
//		add.addActionListener(a);
//	}
//
//	public void delete(ActionListener a) {
//		delete.addActionListener(a);
//	}
//
//	//-------------------- for route ---------------------
//
//	public String getCityForRoute() {
//		return cityf.getText();
//	}
//
//	public String getTime() {
//		return timef.getText();
//	}
//
//	public void addRoute(ActionListener a) {
//		addR.addActionListener(a);
//	}
//
//	public void showRoute(Route r) {
//		route.setText("");
//		route.setText("City: " + r.getRoutePairs().get(0).getCity() + "\n" +
//				"Time: " + r.getRoutePairs().get(0).getTime() + "\n" +
//				"Package id: " + r.getPackageId()
//				);
//		//System.out.println("\n asta e ruta");
//	}
//
//	public void showRoutes(List<Route> r) {
//		route.setText("");
//		for(int i=0; i<r.size();i++){
//			route.append("City: " + r.get(i).getCity() + "\n" +
//					"Time: " + r.get(i).getTime() + "\n" +
//					"Package id: " + r.get(i).getPackageId() +"\n"+"\n"
//					);
//		}
//	}
//
//	/**
//	 * Afisarea packages in tabel
//	 * @param bookArray
//	 */
//	public void DisplayTable(List<Packagee> list, List<User> users){
//
//		for(int i = 0; i < list.size(); i++)
//		{
//			String[] date = {String.valueOf(list.get(i).getId()),
//							 list.get(i).getName(),
//							 list.get(i).getDescription(),
//							 users.get(i).getUsername(),
//							 users.get(i+1).getUsername(),
//							 list.get(i).getScity(),
//							 list.get(i).getDcity(),
//							 String.valueOf(list.get(i).getTracking()),
//							 list.get(i).getStatus()
//							 };
//			model.addRow(date);
//		}
//	}
//
//	/**
//	   * adauga in TextField-uri datele de pe randul selectat
//	   */
//	 public void writeTextFieldUser(){
//
//			ListSelectionModel cellSelectionModel = table.getSelectionModel();
//		    cellSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
//
//		    cellSelectionModel.addListSelectionListener(new ListSelectionListener() {
//		      public void valueChanged(ListSelectionEvent e) {
//
//		    	int row = table.getSelectedRow();
//		    	System.out.println( "VALOARE" +table.getValueAt(row, 0).toString());
//
//				if(row >= 0){
//			    	idf.setText((String)table.getValueAt(row, 0));
//					namef.setText((String)table.getValueAt(row, 1));
//					descriptionf.setText((String)table.getValueAt(row, 2));
//					senderf.setText((String)table.getValueAt(row, 3));
//					receiverf.setText((String)table.getValueAt(row, 4));
//					scityf.setText((String)table.getValueAt(row, 5));
//					dcityf.setText((String)table.getValueAt(row, 6));
//					trackingf.setText((String)table.getValueAt(row, 7));
//					statusf.setText((String)table.getValueAt(row, 8));
//
//					/*listanoua = routes;
//					int id = Integer.parseInt((String) table.getValueAt(row, 0));
//					for(int i = 0; i < listanoua.size(); i++)
//						{
//
//						System.out.println(listanoua.get(i).getCity());
//
//						if(listanoua.get(i).getPackageId()  != id)
//						{
//							listanoua.remove(listanoua.get(i));
//						}
//
//						}
//*/
//					//showRoutes(listanoua);
//				}
//
//		      }
//		    });
//	   }
//
//	 public void reset(){
//		    idf.setText("");
//		    namef.setText("");
//			descriptionf.setText("");
//			senderf.setText("");
//			receiverf.setText("");
//			scityf.setText("");
//			dcityf.setText("");
//			trackingf.setText("");
//			statusf.setText("");
//			cityf.setText("");
//			timef.setText("");
//	}
//
//	 public void updateTable(List<Packagee> list, List<User> users){
//
//	    	int row = model.getRowCount();
//	    	for (int i = row-1 ; i >= 0; i--) {
//	    		model.removeRow(i);
//	    	}
//	    	for(int i = 0; i < list.size(); i++)
//			{
//				String[] date = {String.valueOf(list.get(i).getId()),
//								 list.get(i).getName(),
//								 list.get(i).getDescription(),
//								 users.get(i).getUsername(),
//								 users.get(i+1).getUsername(),
//								 list.get(i).getScity(),
//								 list.get(i).getDcity(),
//								 String.valueOf(list.get(i).getTracking()),
//								 list.get(i).getStatus()
//								 };
//				model.addRow(date);
//			}
//		}
//
//	public void setPanel(List<Packagee> packagee, List<User> users) {
//		Font myFont = new Font("Serif", Font.BOLD, 20);
//
//		logout = new JButton("logout");
//		logout.setBackground(new Color(255, 204, 255));
//		logout.setBounds(10,10,70,30);
//		logout.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED ));
//
//		username = new JLabel (user.getUsername());
//		username.setFont(myFont);
//		username.setForeground(new Color(255, 0, 0));
//		username.setBounds(90,10,250,30);
//
//		model = new DefaultTableModel(column,0);
//		table = new JTable(model){
//
//			public boolean isCellEditable(int arg0, int arg1) {
//			     return true; }};
//
//		table.setFillsViewportHeight(true);
//		scroll = new JScrollPane(table);
//		scroll.setBounds(10,100,750,280);
//
//		idl = new JLabel("Id:");
//		idl.setBounds(860,10,50,30);
//
//		idf = new JTextField();
//		idf.setBounds(940,13,50,25);
//
//		namel = new JLabel("Name:");
//		namel.setBounds(860,40,100,30);
//
//		namef = new JTextField();
//		namef.setBounds(940,43,200,25);
//
//		descriptionl = new JLabel("Description:");
//		descriptionl.setBounds(860,70,100,30);
//
//		descriptionf = new JTextField();
//		descriptionf.setBounds(940,73,200,25);
//
//		senderl = new JLabel("Sender:");
//		senderl.setBounds(860,100,50,30);
//
//		senderf = new JTextField();
//		senderf.setBounds(940,103,200,25);
//
//		receiverl = new JLabel("Receiver:");
//		receiverl.setBounds(860,130,100,30);
//
//		receiverf = new JTextField();
//		receiverf.setBounds(940,133,200,25);
//
//		scityl = new JLabel("Sender City:");
//		scityl.setBounds(860,160,150,30);
//
//		scityf = new JTextField();
//		scityf.setBounds(940,163,200,25);
//
//		dcityl = new JLabel("Receiver City:");
//		dcityl.setBounds(860,190,150,30);
//
//		dcityf = new JTextField();
//		dcityf.setBounds(940,193,200,25);
//
//		trackingl = new JLabel("Tracking:");
//		trackingl.setBounds(860,220,100,30);
//
//		trackingf = new JTextField();
//		trackingf.setBounds(940,223,200,25);
//
//		statusl = new JLabel("Status:");
//		statusl.setBounds(860,250,100,30);
//
//		statusf = new JTextField();
//		statusf.setBounds(940,253,200,25);
//
//		//------------------------------------------------------------------------------------------------------------------
// 	    add = new JButton("Add");
// 	    add.setBounds(900,300,90,30);
// 	    add.setBackground(new Color(255, 204, 255));
// 	    add.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED ));
//
// 	    delete = new JButton("Delete");
//		delete.setBounds(1100,300,100,30);
//		delete.setBackground(new Color(255, 204, 255));
//		delete.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED ));
//
//		updateT = new JButton("Update Tracking");
//		updateT.setBounds(900,350,100,30);
//		updateT.setBackground(new Color(255, 204, 255));
//		updateT.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED ));
//
//		updateS = new JButton("Update Status");
//		updateS.setBounds(1100,350,100,30);
//		updateS.setBackground(new Color(255, 204, 255));
//		updateS.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED ));
//
//		cityl = new JLabel("City:");
//		cityl.setBounds(860, 450, 100, 30);
//
//		cityf = new JTextField();
//		cityf.setBounds(940, 450, 133, 25);
//
//		timel = new JLabel("Time: ");
//		timel.setBounds(860, 480, 100, 30);
//
//		timef = new JTextField();
//		timef.setBounds(940, 483, 133, 25);
//
//		addR = new JButton("Add");
//		addR.setBackground(new Color(255, 204, 255));
//		addR.setBounds(950,530,70,30);
//		addR.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED ));
//
//
//		route = new TextArea();
//		route.setBounds(10,480,400,180);
//
//		DisplayTable(packagee,users);
//		writeTextFieldUser();
//
//		panel.setBackground(new Color(220, 243, 243));
//		panel.setLayout(null);
//		panel.setSize(1300,700);
//
//		panel.add(idl);
//		panel.add(idf);
//		panel.add(namel);
//		panel.add(namef);
//		panel.add(descriptionl);
//		panel.add(descriptionf);
//		panel.add(senderl);
//		panel.add(senderf);
//		panel.add(receiverl);
//		panel.add(receiverf);
//		panel.add(scityl);
//		panel.add(scityf);
//		panel.add(dcityl);
//		panel.add(dcityf);
//		panel.add(trackingl);
//		panel.add(trackingf);
//		panel.add(statusl);
//		panel.add(statusf);
//		panel.add(add);
//		panel.add(updateT);
//		panel.add(updateS);
//		panel.add(delete);
//		panel.add(scroll,BorderLayout.CENTER);
//
//		panel.add(logout);
//		panel.add(username);
//
//		panel.add(cityl);
//		panel.add(cityf);
//		panel.add(timel);
//		panel.add(timef);
//		panel.add(addR);
//		panel.add(route);
//
//	}
//}
