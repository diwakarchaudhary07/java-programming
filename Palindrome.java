class Palindrome {
    public static void main(String[] args) {
        int n = 121, r, num = 0;
        int originalnum = n;
        while (n > 0) {
            r = n % 10;
            num = num * 10 + r;
            n = n / 10;
        }
        if (originalnum == num) {
            System.out.println("This number is Palindrome");
        } else {
            System.out.println("This number is not Palindrome");
        }
    }
}
