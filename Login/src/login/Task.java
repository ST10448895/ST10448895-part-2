
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login;

import login.TO_DO_LIST;
import javax.swing.JOptionPane;


public class Task {

    public static String description, task_NAME, taskID, Status,developer_Name;
    public static int loops, Tasknumber, duration, option;
    public static int totals = 0;

    public static void main(String[] args) {
       LoginDetail login = new LoginDetail();
        Login2 sign = new Login2();
        
        login.start();
        
        JOptionPane.showMessageDialog(null,"Welcome to EasyKanban" );
        TO_DO_LIST task;
        task = getTasks();
    }

    public static TO_DO_LIST getTasks() {
        TO_DO_LIST task = new TO_DO_LIST();
        Tasknumber = 0;
        while (option != 3) {
            option = Integer.parseInt(JOptionPane.showInputDialog("Welcome to EasyKanban" + '\n' + "Choose an option" + '\n' + "OPTION1): Add task" + '\n' + "OPTION2): show report" + '\n' + "OPTION3): EXIT"));
            switch (option) {
                case 1:
//the user’s input for the number of tasks they want to enter and converts it to an integer value stored in the loops variable.
                    loops = Integer.parseInt(JOptionPane.showInputDialog("please enter how many tasks you want to eneter"));
                    for (int i = 0; i < loops; i++) {//this for loop iterates from 0 up to (but not including) the value stored in loops,
                        
                         task.setTaskNO(Tasknumber);
                        developer_Name = JOptionPane.showInputDialog("Enter developer's name and surname");
                        task.setDeev_Name(developer_Name);
                        task.getDev_Name();
                        task_NAME = JOptionPane.showInputDialog("Enter the name of new task");
                        task.setTask_Name(task_NAME);
                        task.getTask_Name();
                        description = JOptionPane.showInputDialog("Enter task description (less than 50 characters):");
                        task.description = description;  // Set the description in the task object
                        task.checkTaskDescription();
                        task.status();
                        task.TaskID();
                        duration = Integer.parseInt(JOptionPane.showInputDialog("Please enter total duration of task in hours"));
                        task.setDuration(duration);
                        totals = task.Printtotal(duration);
                        task.TaskDetails();
                                         
                        Tasknumber++;
                    }
                    while(true){
                    JOptionPane.showMessageDialog(null," The total task hours is"+'\n'+ task.totals);
                    
                    break;
                    }
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Coming soon.....");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Quitting.....");
                    break;
            }

        }
        return task;
    }
}