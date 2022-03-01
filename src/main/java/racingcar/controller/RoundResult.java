package racingcar.controller;

import java.util.HashMap;

public class RoundResult {

    private final HashMap<String, Integer> roundResult = new HashMap<>();

    public HashMap<String, Integer> getRoundResult() {
        return new HashMap<>(roundResult);
    }

    public void setRoundResult(String carName, Integer carPosition) {
        roundResult.put(carName, carPosition);
    }
}
