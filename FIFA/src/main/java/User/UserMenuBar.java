package User;


import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

public class UserMenuBar  {
    public UserMenuBar(){
        MenuBar menuBar = new MenuBar();
        Menu[] menu = new Menu[10];
        MenuItem[] menuItems = new MenuItem[20];
        menu[0] = new Menu("Home");
        menu[1] = new Menu("Edit");
        menu[2] = new Menu("View");
        menu[3] = new Menu("News");
        menu[4] = new Menu("Settings");
        menu[5] = new Menu("Help");


        menuItems[0] = new MenuItem("Close");
        menuItems[1] = new MenuItem("Log Out");
        menuItems[2] = new MenuItem("Profile");
        menuItems[3] = new MenuItem("Match Tree");
        menuItems[4] = new MenuItem("Buy Tickets");
        menuItems[5] = new MenuItem("BMI");
        menuItems[6] = new MenuItem("Groups");
        menuItems[7] = new MenuItem("Players");
        menuItems[8] = new MenuItem("Group Matches");
        menuItems[9] = new MenuItem("Match score");
        menuItems[10] = new MenuItem("Live Match");
        menuItems[11] = new MenuItem("Feed");
        menuItems[12] = new MenuItem("Sports");
        menuItems[13] = new MenuItem("Match News");
        menuItems[14] = new MenuItem("About");
        menuItems[15] = new MenuItem("How to?");
        menuItems[16] = new MenuItem("Font");

        menu[0].getItems().addAll(menuItems[11],menuItems[0],menuItems[1]);
        menu[1].getItems().add(menuItems[2]);
        menu[2].getItems().addAll(menuItems[3],menuItems[5],menuItems[6],menuItems[7],menuItems[8],menuItems[9],menuItems[10]);
        menu[3].getItems().add(menuItems[12]);
        menu[4].getItems().addAll(menuItems[16]);
        menu[5].getItems().addAll(menuItems[14],menuItems[15]);
        menuBar.getMenus().addAll(menu[0], menu[1], menu[2], menu[3], menu[4], menu[5]);




    }


}
