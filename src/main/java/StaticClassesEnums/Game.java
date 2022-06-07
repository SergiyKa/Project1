package StaticClassesEnums;

public class Game {

    enum GameType{
        SOCCER,
        HOCKEY,
        RUGBY
    }

    public static int writeNumOfPlayersPerTeam(int s, int h, int r, GameType gameType){
        int team = 0;

     switch (gameType){
         case SOCCER:
             team = s;
             break;
         case HOCKEY:
             team = h;
             break;
         case RUGBY:
             team = r;
             break;

     }


        return team;
    }
}
