import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        List<Signal> secretHandshake = new ArrayList<>();

        if ((number & 1) != 0) {
            secretHandshake.add(Signal.WINK);
        }

        if ((number & 2) != 0) {
            secretHandshake.add(Signal.DOUBLE_BLINK);
        }

        if ((number & 4) != 0) {
            secretHandshake.add(Signal.CLOSE_YOUR_EYES);
        }

        if ((number & 8) != 0) {
            secretHandshake.add(Signal.JUMP);
        }

        if ((number & 16) != 0) {
            Collections.reverse(secretHandshake);
        }

        return secretHandshake;
    }

}
