package FrameworksDrivers;

import Entities.User;
import FrameworksDrivers.UIElements.Button;
import FrameworksDrivers.UIElements.textArea;
import FrameworksDrivers.UIElements.textField;
import InterfaceAdapters.MainPagePresenter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPageView implements ActionListener, View {
    Button logOut;
    private textArea bioTextField;
    private JPanel masterPanel;
    private Object[] paths;
    User displayUser;
    private CardLayout layout;

    Button homeButton;
    Button chatButton;
    Button myProfileButton;
    Button likeButton;
    Button dislikeButton;
    Button viewOtherAccount;
    textField nameTextField;

    public MainPageView(JPanel masterPanel, CardLayout layout){
        this.masterPanel = masterPanel;
        this.layout = layout;
        JPanel panel = new JPanel();

        // Create Lower Panel
        JPanel lowerPanel = new JPanel();
        lowerPanel.setLayout(new GridLayout(1, 3));

        // Create HomeButton
        homeButton = new Button();
        homeButton.createButton(lowerPanel, "Home", 0,600,200,200);
        homeButton.getButton().addActionListener(this);

        // Create ChatButton
        chatButton = new Button();
        chatButton.createButton(lowerPanel, "Chats", 200,600,200,200);
        chatButton.getButton().addActionListener(this);

        // Create MyProfileButton
        myProfileButton = new Button();
        myProfileButton.createButton(lowerPanel, "My Profile", 400,600,200,200);
        myProfileButton.getButton().addActionListener(this);

        // Add these buttons to the lower panel
        lowerPanel.add(homeButton.getButton());
        lowerPanel.add(chatButton.getButton());
        lowerPanel.add(myProfileButton.getButton());

        // Create Middle Panel
        JPanel middlePanel = new JPanel();
        lowerPanel.setLayout(new GridLayout(1, 2));

        // Create like button
        likeButton = new Button();
        likeButton.createButton(lowerPanel, "Like", 0,500,300,100);
        likeButton.getButton().addActionListener(this);

        // Create like button
        dislikeButton = new Button();
        dislikeButton.createButton(lowerPanel, "Dislike", 300,500,300,100);
        dislikeButton.getButton().addActionListener(this);

        // Add these buttons to the middle panel
        middlePanel.add(likeButton.getButton());
        middlePanel.add(dislikeButton.getButton());

        // Create Top Panel
        JPanel topPanel = new JPanel();

        // Create viewOtherAccount Button
        viewOtherAccount = new Button();
        viewOtherAccount.createButton(lowerPanel, "View Profile", 400,0,200,100);
        viewOtherAccount.getButton().addActionListener(this);

        // Add this button to the top panel
        topPanel.add(viewOtherAccount.getButton());
        logOut = new Button();
        logOut.createButton(lowerPanel, "Log Out", 500,0,200,100);
        logOut.getButton().addActionListener(this);

        // Create Name Text Panel
        JPanel namePanel = new JPanel();

        // Create Text Field
        nameTextField = new textField();
        nameTextField.createTextField(namePanel,150,200,300,200);
        nameTextField.setText(" ");

        bioTextField = new textArea();
        bioTextField.createTextArea(namePanel, "",150, 200, 400, 500);
        bioTextField.getTextArea().setEnabled(false);
        bioTextField.getTextArea().setWrapStyleWord(true);

        // Add Text Field to the Panel
        namePanel.add(nameTextField.getTextField());
        namePanel.add(bioTextField.getTextArea());


        // Adding all panels to the masterPanel
        panel.add(lowerPanel);
        panel.add(middlePanel);
        panel.add(topPanel);
        panel.add(namePanel);
        this.masterPanel.add(panel, "mainpageView");
    }

    public void sendPaths(Object[] paths) {
        this.paths = paths;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //create presenter
        MainPagePresenter mainPagePreseter = new MainPagePresenter();


        // All button cases
        if (e.getSource() == homeButton.getButton()){
            mainPagePreseter.updatePage(this.displayUser, "mainpageView",this.paths[3]);
            this.layout.show(this.masterPanel, "mainpageView");
        }
        if (e.getSource() == chatButton.getButton()){
            mainPagePreseter.updatePage(this.displayUser, "chatView", this.paths[1]);
            this.layout.show(this.masterPanel, "chatView");
        }
        if (e.getSource() == myProfileButton.getButton()){
            mainPagePreseter.updatePage(this.displayUser, "usereditView", this.paths[2]);
            this.layout.show(this.masterPanel, "userEditView");
        }

        if (e.getSource() == likeButton.getButton()){
            mainPagePreseter.Like(this.displayUser);
            mainPagePreseter.updatePage(this.displayUser, "mainpageView", this.paths[3]);
        }
        if (e.getSource() == dislikeButton.getButton()){
            mainPagePreseter.updatePage(this.displayUser, "mainpageView", this.paths[3]);
        }
        if (e.getSource() == viewOtherAccount.getButton()){
            mainPagePreseter.updatePage(this.displayUser, "otherAccount", this.paths[0]);
            this.layout.show(this.masterPanel, "otherAccount");
        }
        if(e.getSource() == logOut.getButton()){
            mainPagePreseter.logOut(this.paths[1]);
            this.layout.show(this.masterPanel, "loginView");

        }
    }
    public void updatePage(Object[] info) {
        //Just switch the user
        if(info == null){
            MainPagePresenter mainPagePresenter = new MainPagePresenter();
            mainPagePresenter.updatePage(null, "mainpageView", this);
        }
        else {
            this.displayUser = (User) info[0];
            this.nameTextField.setText(displayUser.getDisplayName().getData());
            this.bioTextField.setText(displayUser.getBio().getData());
            this.bioTextField.getTextArea().setForeground(Color.BLACK);
        }
    }

}
