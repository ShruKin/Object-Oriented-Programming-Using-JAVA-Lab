public class CountAndPrintArgs {
    public static void main(String[] args) {
        System.out.print("No. of arguments - " + args.length + "\t");
        for (String arg : args) {
            System.out.print(arg.charAt(0));
        }
    }
}