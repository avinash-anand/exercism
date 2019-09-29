class ReverseString {

    String reverse(String inputString) {
        return new StringBuilder(inputString).reverse().toString();
    }

    String reverse2(String inputString) {
        int length = inputString.length();
        char[] reversed = new char[length];
        for (int i = 0; i < reversed.length; i++) {
            reversed[length - 1 - i] = inputString.charAt(i);
        }
        return String.valueOf(reversed);
    }

}