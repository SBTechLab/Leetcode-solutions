import java.util.Scanner;

public class Main {

    public static char nextGreatestLetter(char[] letters, char target) {

        int left = 0;
        int right = letters.length - 1;

        while(left <= right) {

            int mid = left + (right - left) / 2;

            if(letters[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return letters[left % letters.length];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        char[] letters = new char[n];

        for(int i = 0; i < n; i++) {
            letters[i] = sc.next().charAt(0);
        }

        char target = sc.next().charAt(0);

        System.out.println(
            nextGreatestLetter(letters, target)
        );
    }
}
