
public class TennisGame {
    private static String result = "";

    public static String displayScoreToEqual(int scoreOfPlayer) {

        switch (scoreOfPlayer) {
            case 0:
                result = "Love-All";
                break;
            case 1:
                result = "Fifteen-All";
                break;
            case 2:
                result = "Thirty-All";
                break;
            case 3:
                result = "Forty-All";
                break;
            default:
                return result = "Deuce" ;
        }
        return result;
    }

    public  String displayToEndGame(int scoreOfPlayer1, int scoreOfPlayer2) {
        int minusScore = scoreOfPlayer1 - scoreOfPlayer2;
        if (minusScore == 1) {
            result = "Advantage player1";
        } else if (minusScore == -1) {
            result = "Advantage player2";
        } else if (minusScore >= 2) {
            result = "Win for player1";
        } else {
            result = "Win for player2";
        }

        return result;
    }

    public static String getScoreToCall(int score) {
        switch (score) {
            case 0:
                result = "Love";
                break;
            case 1:
                result = "Fifteen";
                break;
            case 2:
                result = "Thirty";
                break;
            case 3:
                result = "Forty";
                break;
        }
        return result;
    }

    public static String getScoreOfDifferent(int scoreOfPlayer1, int scoreOfPlayer2) {
        result += getScoreToCall(scoreOfPlayer1) +
                " vs " + getScoreToCall(scoreOfPlayer2);
        return result;
    }
}