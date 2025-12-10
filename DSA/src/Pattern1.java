public class Pattern1 {
    static String rankTeams(String[] votes) {
        if (votes.length == 1) {
            return votes[0];
        }
        String rankedOrder = "";
        


        return rankedOrder;
    }
    public static void main(String[] args) {
        int n = 5,count = 1;

        for (int i = 1; i <= n; i++) {
            int temp = count;
            for (int j = 0; j < n; j++) {
                if (j < n - i) {
                    System.out.print("  ");
                }
                else {
                    System.out.print(count + " ");
                    count--;
                }
            }
            temp = temp + (i + 1);
            count = temp;
            System.out.println();
        }
    }
}
