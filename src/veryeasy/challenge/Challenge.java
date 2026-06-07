package veryeasy.challenge;

public class Challenge {
    public static int equal(int a, int b, int c) {
        if (a == b && b == c) {
            return 3;// ANSWER
        }
        if (a == b || a == c || b == c) {
            return 2;
        } else {
            return 0;
        }
    }
}