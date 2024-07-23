class TriangleStar {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.err.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.err.print("* ");
            }
            System.err.println("");
        }
    }
}
