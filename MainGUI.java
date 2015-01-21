import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

/**
* Main GUI 
*/ 
public class MainGUI extends JFrame implements ActionListener
{
	private JPanel left, center, right, weekPanel, locationPanel, levelPanel, firstPanel, lastPanel;
	private JLabel matchTitle, searchRefTitle, 
		weekLabel, locationLabel, levelLabel, findRefLabel, firstNameLabel,
		lastNameLabel, addRefLabel;
	private JTextField weekField, firstNameField, lastNameField;
	private JButton findRefButton, searchRefButton, addRefButton;
	private JRadioButton northButton, centralButton, southButton, juniorButton, seniorButton;
	private ButtonGroup locationGroup, levelGroup;
    private JScrollPane centerScroll;

	public MainGUI()
	{
		this.setTitle("Referee Selection"); //Provisional title
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.layoutComponents();
        this.setSize(1200,200);
		this.setLocation(100,100);
	}
	
	public void layoutComponents()
	{
		// Create left JPanel
		left = new JPanel();
        left.setLayout(new BoxLayout(left, BoxLayout.Y_AXIS));
        left.setMaximumSize(new Dimension(450,450));
        this.add(left,BorderLayout.WEST);
		
        // Create label for title/instructions for left panel
        matchTitle = new JLabel("To find a suitable referee enter the match details below");
        left.add(matchTitle);

        //Create weekPanel which holds the week label and textfield
        weekPanel = new JPanel();
        weekPanel.setMaximumSize(new Dimension(400,400));

		// Create label and textField for match week number
		weekLabel = new JLabel("Week Number (1-52)");
		weekPanel.add(weekLabel);
		weekField = new JTextField(2);
		weekPanel.add(weekField);

        // Add weekPanel to the left JPanel
        left.add(weekPanel);


        // Create locationPanel which holds the location label and radio buttons
        locationPanel = new JPanel();
        locationPanel.setMaximumSize(new Dimension(400,400));
		
		//Create Label and radio buttons for match location
		locationLabel = new JLabel("Match Location");
		locationPanel.add(locationLabel);
		northButton = new JRadioButton("North");
		centralButton = new JRadioButton("Central");
		southButton = new JRadioButton("South");

		
		//Group the location JRadioButtons so that they are mutually exclusive
		locationGroup = new ButtonGroup();
		locationGroup.add(northButton);
		locationGroup.add(centralButton);
		locationGroup.add(southButton);
        locationPanel.add(northButton);
        locationPanel.add(centralButton);
        locationPanel.add(southButton);
		//TODO altered so that they display horizontally

        // Add locationPanel to left Jpanel 
        left.add(locationPanel);


        // Create levelPanel which houses the level label and radio buttons
        levelPanel = new JPanel();
        levelPanel.setMaximumSize(new Dimension(400,400));;

        // Create label and radio buttons for level        
        levelLabel = new JLabel("Level");
        levelPanel.add(levelLabel);
        juniorButton = new JRadioButton("Junior");  
        seniorButton = new JRadioButton("Senior");

        // Group the level JRadioButtons so they are mutually exclusive
        levelGroup = new ButtonGroup();
        levelGroup.add(juniorButton);
        levelGroup.add(seniorButton);
        levelPanel.add(juniorButton);
        levelPanel.add(seniorButton);
        //TODO altered so that they display horizontally

        left.add(levelPanel);

        //Create label and button for finding suitable referee
        findRefLabel = new JLabel("Find a suitable referee");
        left.add(findRefLabel);
        findRefButton = new JButton("Find");
        findRefButton.addActionListener(this);
        left.add(findRefButton);




        // Create center JPanel
        center = new JPanel();
        center.setLayout(new BoxLayout(center, BoxLayout.PAGE_AXIS));
        this.add(center,BorderLayout.CENTER);

        //Create JTable to display list of referees
        
        //Create JScrollPane and add to center panel
        centerScroll = new JScrollPane();
        // Add JTable component to scroll pane
        center.add(centerScroll);




        // Create right JPanel
		right = new JPanel();
        right.setLayout(new BoxLayout(right, BoxLayout.PAGE_AXIS));
        this.add(right,BorderLayout.EAST);

        //Create label and button for adding new ref 
        addRefLabel = new JLabel("Add a new referee");
        right.add(addRefLabel);
        addRefButton = new JButton("Add");
        addRefButton.addActionListener(this);
        right.add(addRefButton);
        
        //Create title for search section
        searchRefTitle = new JLabel("To search for a referee enter their first and last name below");
        right.add(searchRefTitle);


        firstPanel = new JPanel();

        //Create label and button for first and last name
        firstNameLabel = new JLabel("First Name");
        firstPanel.add(firstNameLabel);
        firstNameField = new JTextField(10);
        firstPanel.add(firstNameField);

        right.add(firstPanel);

        lastPanel = new JPanel();
    
        lastNameLabel = new JLabel("Last Name");
        lastPanel.add(lastNameLabel);
        lastNameField = new JTextField(10);
        lastPanel.add(lastNameField);

        right.add(lastPanel);

        // Create the button for searching for the referee
        searchRefButton = new JButton("Search");
        searchRefButton.addActionListener(this);
        right.add(searchRefButton);

	}
	
	public void actionPerformed(ActionEvent e) {
		//
	}
	
}
