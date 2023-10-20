package baseball.domain;

public record RoundResult(int ballCount, int strikeCount) {

    public boolean hasBall() {
        return ballCount != 0;
    }

    public boolean hasStrike() {
        return strikeCount != 0;
    }

    public boolean isWin() {
        return strikeCount == 3;
    }
}
