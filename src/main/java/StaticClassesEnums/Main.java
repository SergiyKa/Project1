package StaticClassesEnums;

public class Main {
    public static void main(String[] args) {

        int team = Game.writeNumOfPlayersPerTeam(11,6, 15, Game.GameType.SOCCER);
        System.out.println("Number of players is " + team);

        team = Game.writeNumOfPlayersPerTeam(11,6, 15, Game.GameType.HOCKEY);
        System.out.println("Number of players is " + team);

        team = Game.writeNumOfPlayersPerTeam(11,6, 15, Game.GameType.RUGBY);
        System.out.println("Number of players is " + team);
    }
}
