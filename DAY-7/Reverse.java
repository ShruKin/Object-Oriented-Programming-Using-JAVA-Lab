public class Reverse {
    public static void main(String[] args) {
        String[] originalArr = args[0].split(" ");

        int n = originalArr.length;
        String[] reversedArr = new String[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            reversedArr[j - 1] = originalArr[i];
            j = j - 1;
        }

        String reversed = String.join(" ", reversedArr);
        System.out.println(reversed);
    }
}