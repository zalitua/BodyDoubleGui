/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BodyDoublerOO;

import java.util.Scanner;

/**
 *
 * @author GVE Rouse
 */
         
public class BodyDoubleApp {

    public static void main(String[] args) {
        BodyDoubleApp bda = new BodyDoubleApp();
        bda.questionaire();
    }

    public void questionaire() {

        RegisterUser ru = new RegisterUser();
        PasswordValidator pv = new PasswordValidator();
        RegisterSession rs = new RegisterSession();
        String room = "";
        Room rm = new Room(room);
        UserBooksSession ubs = new UserBooksSession();
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the body double app!\n\n"
                + "This app has been made to make studying for people who benefit from body doubling are able to join study sessions with others like them.\n"
                + "You can\n 1: Create an account\n 2: Join a session as a member or withdraw from a session\n 3: Make or delete sessions as an admin\n"
                + "\nEnter 'x' at anytime to exit the program. \nAre you a new user?(yes/no)");
        String userStatus = input.nextLine();

        //asks if new
        if (userStatus.equalsIgnoreCase("yes")) {
            //RegisterUser ru = new RegisterUser();
            ru.registerUser();
        } //if not new, asks if admin or user
        else if (userStatus.equalsIgnoreCase("no")) {
            if (pv.enterPassword()) {
                System.out.println("Are you an admin or an member?");

                String type = input.nextLine();

                //if admin
                if (type.equalsIgnoreCase("admin")) {
                    System.out.println("Would you like to 1: Make a session, 2: Delete a session, 3: manage available rooms? ");
                    String in = input.nextLine();
                    if (in.equalsIgnoreCase("x")) {
                        System.exit(0);
                    }
                    int admin = Integer.parseInt(in);
                    switch (admin) {
                        case 1:
                            rs.registerSession();
                            break;
                        case 2:
                            rs.removeSession();
                            break;
                        case 3:
                            rm.manageRooms();
                            break;
                        default:
                            System.out.println("Sorry that's not an option");
                            break;
                    }
                } //if user
                else if (type.equalsIgnoreCase("member")) {
                    System.out.println("Would you like to join an avaliable session(join), or withdraw (cancel) from a session?");
                    String user = input.nextLine();

                    if (user.equalsIgnoreCase("x")) {
                        System.exit(0);
                    }
                    else if (user.equalsIgnoreCase("join")) {
                        ubs.selectSession();
                    }
                    else if (user.equalsIgnoreCase("cancel")) {
                        ubs.cancelSession();
                    }
                    else{
                        System.out.println("Sorry, that's not a valid choice.");
                    }
                } else if (type.equalsIgnoreCase("x")) {
                    System.exit(0);
                } else {
                    System.out.println("Sorry that's not an option");
                }
            }
        } else if (userStatus.equalsIgnoreCase("x")) {
            System.exit(0);
        } else {
            System.out.println("Sorry that's not an option");
            questionaire();
        }

        //close scanner
        input.close();
    }

}
