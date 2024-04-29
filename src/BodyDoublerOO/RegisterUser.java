/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BodyDoublerOO;

import java.util.Scanner;

/**
 * change for HashMap
 *
 * @author zalit
 */
public class RegisterUser {

    public void registerUser() {
        Scanner scan = new Scanner(System.in);
        String userID;
        String password = "";
        PasswordValidator pv = new PasswordValidator();

        String firstName = "";

        while (firstName.isEmpty()) {
            System.out.println("Please enter user your first name: ");

            firstName = scan.nextLine().trim();
            if (firstName.equalsIgnoreCase("x")) {
                System.exit(0);
            }
            if (firstName.isEmpty()) {
                System.out.println("That is invalid input");
            }
        }

        String lastName = "";

        while (lastName.isEmpty()) {
            System.out.println("Please enter user your last name: ");

            lastName = scan.nextLine().trim();
            if (lastName.equalsIgnoreCase("x")) {
                System.exit(0);
            }
            if (lastName.isEmpty()) {
                System.out.println("That is invalid input");
            }
        }

        String email = "";
        while (email.isEmpty()) {
            System.out.println("Please enter user your email: ");

            email = scan.nextLine().trim();
            if (email.equalsIgnoreCase("x")) {
                System.exit(0);
            }
            if (email.isEmpty()) {
                System.out.println("That is invalid input");
            }
        }

        String ans = "";
        while (ans.isEmpty()) {
            System.out.println("Are you joining as a member or an admin?");

            ans = scan.nextLine().trim().toLowerCase();
            if (ans.equalsIgnoreCase("x")) {
                System.exit(0);
            }
            if (ans.isEmpty()) {
                System.out.println("That is invalid input");
            }
        }

        switch (ans) {
            case "x": {
                System.exit(0);
            }
            case "member": {
                String path = "./nbproject/files/members.txt";
                Sequencer seq = new Sequencer();
                String nextNumber = seq.getNextNumber(path);
                userID = "MEM" + nextNumber;
                // check userID does not already exist
                System.out.println("Your user ID is: " + userID);

                while (password.isEmpty()) {
                    System.out.println("Please enter user your password(a five letter word): ");

                    password = scan.nextLine().trim();
                    if (password.equalsIgnoreCase("x")) {
                        System.exit(0);
                    }
                    if (password.isEmpty()) {
                        System.out.println("That is invalid input");
                    }
                }

                System.out.println("Please write down your user Id and password.");
                pv.writePasswordEntry(userID, password);

                String age = "";
                while (age.isEmpty()) {
                    System.out.println("Please enter user your age: ");

                    age = scan.nextLine().trim();
                    if (age.equalsIgnoreCase("x")) {
                        System.exit(0);
                    }
                    if (age.isEmpty()) {
                        System.out.println("That is invalid input");
                    }
                }

                String studentID = "";
                while (studentID.isEmpty()) {
                    System.out.println("Please enter user your student ID number: ");

                    studentID = scan.nextLine().trim();
                    if (studentID.equalsIgnoreCase("x")) {
                        System.exit(0);
                    }
                    if (studentID.isEmpty()) {
                        System.out.println("That is an invalid ID, please try again.");
                    }
                }

                String degreeProgram = "";
                while (degreeProgram.isEmpty()) {
                    System.out.println("Please enter the degress program in which you are enrolled(BCIS,BS,BFA,etc), if not applicable please entre n/a: ");

                    degreeProgram = scan.nextLine().trim();
                    if (degreeProgram.equalsIgnoreCase("x")) {
                        System.exit(0);
                    }
                    if (degreeProgram.isEmpty()) {
                        System.out.println("That is an invalid degree prgram, please try again.");
                    }
                }

                Member member = new Member(userID, password, firstName, lastName,
                        email, age, studentID, degreeProgram);
                member.writeMemberToFile(member);
                System.out.println("If you would like to book a session now, please presss 1. ");
                String input = scan.nextLine();
                UserBooksSession ubs = new UserBooksSession();
                if (input.equalsIgnoreCase("x")) {
                    System.exit(0);
                } else if (input.equalsIgnoreCase("1")) {
                    ubs.selectSession();
                } else {
                    System.out.println("Thank you for registering!");
                }
                break;
            }
            case "admin": {
                String path = "./nbproject/files/admins.txt";
                Sequencer seq2 = new Sequencer();
                String nextNumber = seq2.getNextNumber(path);
                userID = "ADM" + nextNumber;
                // check userID does not already exist
                System.out.println("You're user ID is: " + userID);

                while (password.isEmpty()) {
                    System.out.println("Please enter user your password(a five letter word): ");

                    password = scan.nextLine().trim();
                    if (password.equalsIgnoreCase("x")) {
                        System.exit(0);
                    }
                    if (password.isEmpty()) {
                        System.out.println("That is invalid, please try again.");
                    }
                }

                System.out.println("Please write down your user ID and password.");
                pv.writePasswordEntry(userID, password);

                String role = "";
                while (role.isEmpty()) {
                    System.out.println("Please enter user your role(student, university staff or other): ");

                    role = scan.nextLine().trim();
                    if (role.equalsIgnoreCase("x")) {
                        System.exit(0);
                    }
                    if (role.isEmpty()) {
                        System.out.println("That is an invalid role, please try again.");
                    }
                }

                String department = "";
                while (department.isEmpty()) {
                    System.out.println("Please enter user your university department: ");
                    department = scan.nextLine().trim().toLowerCase();
                    if (department.equalsIgnoreCase("x")) {
                        System.exit(0);
                    }
                    if (department.isEmpty()) {
                        System.out.println("That is an invalid ID, please try again.");
                    }

                }

                Admin admin = new Admin(userID, password, firstName, lastName,
                        email, role, department);
                admin.writeToFile(admin);

                RegisterSession rs = new RegisterSession();
                String room = "";
                Room rm = new Room(room);
                System.out.println("You can now 1: Make a session, 2: Delete a session, 3: manage available rooms? ");

                Scanner input = new Scanner(System.in);
                String in = input.nextLine();
                if (in.equalsIgnoreCase("x")) {
                    System.exit(0);
                }
                int choice = Integer.parseInt(in);
                switch (choice) {
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

                break;
            }
            default:
                System.out.println("That is not an option. Please enter 'member' or 'admin'.");
        }

    }
}
