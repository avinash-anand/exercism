class Darts {

    private final double x;
    private final double y;
    private final double radius;

    Darts(double x, double y) {
        this.x = x;
        this.y = y;
        this.radius = calculateRadius();
    }

    int score() {
        if (insideInnerCircle()) return 10;
        if (insideMiddleCircle()) return 5;
        if (insideOuterCircle()) return 1;
        return 0;
    }

    private boolean insideInnerCircle() {
        return radius <= 1;
    }

    private boolean insideMiddleCircle() {
        return radius <= 5;
    }

    private boolean insideOuterCircle() {
        return radius <= 10;
    }

    //hypotenuse = sqrt(sq(base)+sq(height))
    private double calculateRadius() {
        return Math.sqrt((x * x) + (y * y));
    }

}
