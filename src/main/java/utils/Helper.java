package utils;


public class Helper {
    //TODO
    public static String reverseString(String string) {
        if (string.isEmpty() || string == null) {
            return "";
        }

        int strStart = 0;
        int strEnd = string.length();
        char[] result = string.toCharArray();

        for (int i = 0; i < string.length(); i++) {
            strStart = i;
            strEnd = (string.length() - 1) - strStart;

            if (strStart >= strEnd) {
                return new String (result);
            }

            char local = result[strStart];
            result[strStart] = result[strEnd];
            result[strEnd] = local;
        }

        return "";
    }
}
