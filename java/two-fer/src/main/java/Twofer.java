import static java.util.Optional.ofNullable;

class Twofer {

    private static final String MESSAGE_TEMPLATE = "One for %s, one for me.";

    String twofer(String name) {
        return String.format(MESSAGE_TEMPLATE, ofNullable(name).orElse("you"));
    }
}
