package codeWars;

public class TotalPoints {

    public static int points(String[] games) {
        int count = 0;
        for( int i = 0; i < games.length; i++) {
            if(games[i].charAt (0) > games[i].charAt (2)) {
                count = count + 3;
            } else if (games[i].charAt (0) == games[i].charAt (2)) {
                count = count + 1;
            } else count = count;

        }
        return count;
    }
}