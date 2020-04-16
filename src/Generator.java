public class Generator {
    String [] inputs;
    String result;
    String alphabet = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯabcdefghijklmnopqrstuvwxyz";

    public Generator(String[] inputs) {
        this.inputs = inputs;
    }

    String generate() {
        String str = "";

        // Первый символ
        str += alphabeticOffset(inputs[0].charAt(2), 1);

        // Второй символ
        str += alphabeticOffset(inputs[1].charAt(0), -1);

        // Третий символ
        if (inputs[2].length() % 2 == 1) {
            str += alphabeticOffset(inputs[2].charAt(inputs[2].length()/2), 1);
        } else {
            str += alphabeticOffset(inputs[2].charAt(inputs[2].length()/2 - 1), -1);
        }

        // Четвёртый символ
        str += alphabeticOffset(alphabet.charAt(0), inputs[0].length() + inputs[1].length() - 1);

        result = str;
        return result;
    }

    private char alphabeticOffset(char c, int offset) {
        return alphabet.charAt((alphabet.indexOf(c) + offset) % alphabet.length());
    }

    public String getResult() {
        return result;
    }
}
