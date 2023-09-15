/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package file.project4;

import controller.CandidatesManagement;

/**
 *
 * @author huypd
 */
public class Project4 {

    public static void main(String[] args) {
        String title = "/----------------------------------/\nManage Candidate Of Company File";
        String[] s = new String[]{"Experience", "Fresher", "Intern", "Searching", "Exit"};
        CandidatesManagement manage = new CandidatesManagement(title, s);
        manage.run();
    }
}
