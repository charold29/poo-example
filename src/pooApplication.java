import LastExercises.SoccerTeam.Coach;
import LastExercises.SoccerTeam.Doctor;
import LastExercises.SoccerTeam.Person;
import LastExercises.SoccerTeam.SoccerPlayer;

import javax.swing.*;
import java.util.ArrayList;

public class pooApplication {

    static ArrayList<Person> soccerTeam = new ArrayList<>();

    public static ArrayList<SoccerPlayer> generatePlayers(){
        SoccerPlayer player;

        String name;
        String lastname;
        int dorsal, averageAge = 22;

        ArrayList<SoccerPlayer> players = new ArrayList<>();

        for(int i = 1 ; i < 22; i+=2){
            name = "Player";
            lastname = String.valueOf(i);
            dorsal = i;

            player = new SoccerPlayer(name,lastname,averageAge,dorsal,"Free");
            players.add(player);
        }
        return players;
    }

    public static void showSoccerTeam(ArrayList<Person> soccerTeam){
        StringBuilder soccerTeamString = new StringBuilder();

        for (Person person: soccerTeam) {
            if(person != null){
                soccerTeamString.append(person);
            }
        }

        JOptionPane.showMessageDialog(null,"Soccer Team:\n"+soccerTeamString);
    }

    //Creating people
    static ArrayList<SoccerPlayer> players = generatePlayers();
    static Person coach = new Coach("Massimiliano","Allegri",49,"Defensive");
    static Person doctor = new Doctor("Lucas","Martinez",50,"Physical Therapy",5);

    public static void teamMenu(ArrayList<Person> team){
        int option;
        do{
            option = Integer.parseInt(JOptionPane.showInputDialog("MENU\n" +
                    "(1) Team Travel \n" +
                    "(2) Training\n" +
                    "(3) Soccer Game\n" +
                    "(4) Plan training\n" +
                    "(5) Interview\n" +
                    "(6) Cure Injury\n" +
                    "(7) Exit"));

            switch(option){
                case 1: // Team Travel
                    for (Person p: team) {
                        if(p != null)
                            p.travel();
                    }
                    break;
                case 2: // Training
                    for (Person p: team) {
                        if(p != null)
                            p.train();
                    }
                    break;
                case 3: // Soccer Game
                    for (Person p: team) {
                        if(p != null)
                            p.soccerGame();
                    }
                    break;
                case 4: // Plan Training
                    ((Coach)coach).planTraining();
                    break;
                case 5: // Interview
                    for (Person p: team) {
                        if(p.getClass() == SoccerPlayer.class)
                           ((SoccerPlayer) p).interview();
                    }

                    break;
                case 6: // Cure Injury
                    ((Doctor)doctor).cureInjury();
                    break;
                case 7:
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Type a correct option");
            }
        }while(option != 7);
    }

    public static void main (String[] args) {

        //Adding people to soccer team
        soccerTeam.addAll(players);
        soccerTeam.add(coach);
        soccerTeam.add(doctor);

        //Showing soccer team
        showSoccerTeam(soccerTeam);

        //MENU display
        teamMenu(soccerTeam);
    }

}