import java.util.Scanner;
//import java.util.InputMismatchException;

class WorldCupPredictor {

    public static void main(String[] args) {

        WorldCupPredictor obj = new WorldCupPredictor();
    }


    public WorldCupPredictor() {
        System.out.print("\n---- 2022 WORLD CUP PREDICTIONS ----\n");

        String roundOneTeams = "Netherlands,USA,Argentina,Australia,Japan,Croatia,Brazil,South_Korea,England,Senegal,France,Poland,Morocco,Spain,Portugal,Switzerland";

        String roundTwoTeams = "";
        String roundThreeTeams = "";
        String finalTeams = "";
        String champion = "";

        roundTwoTeams = predictions(roundOneTeams, "FIRST ROUND");

        roundThreeTeams = predictions(roundTwoTeams, "QUARTER-FINALS");

        finalTeams = predictions(roundThreeTeams, "SEMI-FINALS");

        champion = predictions(finalTeams, "FINALS");

        System.out.print("\nRESULTS: You predicted that " +  champion.toUpperCase() + " will be the champions!");
    }



    public static String predictions(String teams, String round) {

        String userChoice = "";
        String advancingTeams = "";

        System.out.println("\n.... " + round + " ....");

        Scanner in = new Scanner(teams);
        in.useDelimiter(",");

        while (in.hasNext()) {
            String countryA = in.next();
            String countryB = in.next();

            Scanner in2 = new Scanner(System.in);

            System.out.printf("%-12s  vs  %-13s:  ", countryA, countryB);

            userChoice = in2.next().toLowerCase();

            System.out.println(userChoice);

            while (!(userChoice.equals(countryA.toLowerCase()) || userChoice.equals(countryB.toLowerCase()))) {
                System.out.println("(Please type in one the of the choices provided)");
                System.out.printf("%-12s  vs  %-13s:  ", countryA, countryB);

                userChoice = in2.next();
            }

            advancingTeams = advancingTeams + "," + userChoice;

        }

        return advancingTeams;
    }


}
