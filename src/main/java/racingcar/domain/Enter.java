package racingcar.domain;

import java.util.Scanner;

public class Enter implements Enterable {

    private static final Scanner scanner = new Scanner(System.in);

    @Override
    public String enter() {
        return scanner.nextLine();
    }
}
