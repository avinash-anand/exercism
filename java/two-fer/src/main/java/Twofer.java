import static java.util.Optional.ofNullable;

class Twofer {
    String twofer(String name) {
        return ofNullable(name)
                .map(n -> String.format("One for %s, one for me.", n))
                .orElse("One for you, one for me.");
    }
}
