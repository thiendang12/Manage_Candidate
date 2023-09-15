/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Controller.Candidate;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Candidate> candidates = new ArrayList<>();
        //loop until user want to exit
//        candidates.add(new Experience(99, "code", "1", "Pham Ngoc", "Hoa", 1991,
//                "Ninh Binh", "0968038714", "hoapnse05740", 0));
//        candidates.add(new Fresher("2000", "good", "2", "Äo Quang", "Hiep",
//                1995, "Ha Noi", "0984481349", "thaycacac@gmail.com", 1));
//        candidates.add(new Internship("PRJ311", "Spring", "FPT University",
//                "2", "Nguyen Xuan", "Cuong", 2018, "Ha Noi", "0986246813",
//                "thaycacacoficial@gmail.com", 2));
        while (true) {
            int choice = Manager.menu();
            switch (choice) {
                case 1:
                    Manager.createCandidate(candidates, 0);
                    break;
                case 2:
                    Manager.createCandidate(candidates, 1);
                    break;
                case 3:
                    Manager.createCandidate(candidates, 2);
                    break;
                case 4:
                    Manager.searchCandidate(candidates);
                    break;
                case 5:
                    return;
            }
        }
    }

    private static class Manager {

        private static void createCandidate(ArrayList<Candidate> candidates, int i) {
        }

        private static void searchCandidate(ArrayList<Candidate> candidates) {
        }

        private static int menu() {
            return 0;
        }
        public Manager() {
        }
    }
}