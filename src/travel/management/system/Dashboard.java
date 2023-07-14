package travel.management.system;

import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener{
	
	String username;
	JButton addPersonalDetails,updatePersonalDetails, viewPersonalDetails, deletePersonalDetails,checkPackages, bookPackage, viewPackages, viewHotels, bookHotel, viewBookedHotel, destinations, payments, about;
	Dashboard(String username){
		this.username = username;
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setLayout(null);
		
		JPanel p1 = new JPanel();
		p1.setLayout(null);
		p1.setBackground(new Color(0,0,102));
		p1.setBounds(0,0,1600,65);
		add(p1);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
		Image i2 = i1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel icon = new JLabel(i3);
		icon.setBounds(5,0,70,70);
		p1.add(icon);
		
		JLabel heading = new JLabel("Dashboard");
		heading.setBounds(80,10,150,40);
		heading.setForeground(Color.WHITE);
		heading.setFont(new Font("Tahoma",Font.BOLD,20));
		p1.add(heading);
		
		JPanel p2 = new JPanel();
		p2.setLayout(null);
		p2.setBackground(new Color(0,0,102));
		p2.setBounds(0,65,300,900);
		add(p2);
		
		addPersonalDetails = new JButton("Add Personal Details");
		addPersonalDetails.setBounds(0,0,300,50);
		addPersonalDetails.addActionListener(this);
		p2.add(addPersonalDetails);
		
		updatePersonalDetails = new JButton("Update Personal Details");
		updatePersonalDetails.setBounds(0,50,300,50);
		updatePersonalDetails.addActionListener(this);
		p2.add(updatePersonalDetails);
		
		viewPersonalDetails = new JButton("View Personal Details");
		viewPersonalDetails.setBounds(0,100,300,50);
		viewPersonalDetails.addActionListener(this);
		p2.add(viewPersonalDetails);
		
		deletePersonalDetails = new JButton("Delete Personal Details");
		deletePersonalDetails.setBounds(0,150,300,50);
		deletePersonalDetails.addActionListener(this);
		p2.add(deletePersonalDetails);
		
		checkPackages = new JButton("Check Packages");
		checkPackages.setBounds(0,200,300,50);
		checkPackages.addActionListener(this);
		p2.add(checkPackages);
		
		bookPackage = new JButton("Book Packages");
		bookPackage.setBounds(0,250,300,50);
		bookPackage.addActionListener(this);
		p2.add(bookPackage);
		
		viewPackages = new JButton("View Packages");
		viewPackages.setBounds(0,300,300,50);
		viewPackages.addActionListener(this);
		p2.add(viewPackages);
		
		viewHotels = new JButton("View Hotels");
		viewHotels.setBounds(0,350,300,50);
		viewHotels.addActionListener(this);
		p2.add(viewHotels);
		
		bookHotel = new JButton("Book Hotel");
		bookHotel.setBounds(0,400,300,50);
		bookHotel.addActionListener(this);
		p2.add(bookHotel);
		
		viewBookedHotel = new JButton("View Booked Hotel");
		viewBookedHotel.setBounds(0,450,300,50);
		viewBookedHotel.addActionListener(this);
		p2.add(viewBookedHotel);
		
		destinations = new JButton("View Destinations");
		destinations.setBounds(0,500,300,50);
		destinations.addActionListener(this);
		p2.add(destinations);
		
		payments = new JButton("Payments");
		payments.setBounds(0,550,300,50);
		payments.addActionListener(this);
		p2.add(payments);
		
		about = new JButton("About");
		about.setBounds(0,600,300,50);
		about.addActionListener(this);
		p2.add(about);
		
		ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
		Image i5 = i4.getImage().getScaledInstance(1650, 1000, Image.SCALE_DEFAULT);
		ImageIcon i6 = new ImageIcon(i5);
		JLabel image = new JLabel(i6);
		image.setBounds(0,0,1650,1000);
		add(image);
		
		JLabel text = new JLabel("Travel and Tourism Management System");
		text.setBounds(400,70,1200,70);
		text.setForeground(Color.BLACK);
		text.setFont(new Font("Raleway",Font.PLAIN,50));
		image.add(text);
		
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == addPersonalDetails) {
			new AddCustomer(username);
		} else if (ae.getSource() == viewPersonalDetails) {
			new ViewCustomer(username);
		} else if (ae.getSource() == updatePersonalDetails) {
			new UpdateCustomer(username);
		} else if (ae.getSource() == checkPackages) {
			new CheckPackage();
		} else if (ae.getSource() == bookPackage) {
			new BookPackage(username);
		} else if(ae.getSource() == viewPackages) {
			new ViewPackage(username);
		} else if(ae.getSource() == viewHotels) {
			new CheckHotels();
		} else if (ae.getSource() == destinations) {
			new Destinations();
		} else if (ae.getSource() == bookHotel) {
			new BookHotel(username);
		} else if (ae.getSource() == viewBookedHotel) {
			new ViewBookedHotel(username);
		} else if (ae.getSource() == payments) {
			new Payment();
		} else if (ae.getSource() == about) {
			new About();
		}
	}
	
	public static void main(String[] args) {
		new Dashboard("");
		
	}

}
