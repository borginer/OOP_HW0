import java.io.*;
import java.util.StringTokenizer;

// this was written before the change about the - sign
public class NumberStats {
    /**
     * @requires args.length == 1 && args[0] is the name of an existing readable text file.
     * @effects prints the number of numbers, percent positive, percent negative, and percent zero
     * of the numbers in the file and average for each line.
     */
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("No file provided");
            return;
        }

        String fileName = args[0];
        int numbersNum = 0;
        int positives = 0;
        int negatives = 0;
        int zeros = 0;
        int lineNum = 1;

        String delims = " ;?{}[]=+_!@#$%^&*():',.";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                StringTokenizer tokenizer = new StringTokenizer(line, delims + "-", true);
                int lineSum = 0;
                int lineNumbersNum = 0;
                boolean minusFlag = false;

                while (tokenizer.hasMoreTokens()) {
                    String token = tokenizer.nextToken();
                    if (token.equals("-")) {
                        minusFlag = true;
                    } else {
                        try {
                            int num = Integer.parseInt(token);
                            if (minusFlag) {
                                num = -num;
                                minusFlag = false;
                            }
                            numbersNum++;
                            lineNumbersNum++;
                            lineSum += num;

                            if (num > 0) positives++;
                            else if (num < 0) negatives++;
                            else zeros++;

                        } catch (NumberFormatException e) {
                            // if the token is not a number, ignore it and reset the minusFlag
                            minusFlag = false;
                        }
                    }
                }
                if (lineNumbersNum > 0) {
                    double average = (double) lineSum / lineNumbersNum;
                    System.out.printf("The average of the numbers in line %d is: %.2f\n", lineNum,
                            average);
                }
                lineNum++;
            }
        } catch (IOException e) {
            System.out.println("Error reading the file:" + e.getMessage());
            return;
        }

        double percentPositives = 100.0 * positives / numbersNum;
        double percentNegatives = 100.0 * negatives / numbersNum;
        double percentZeros = 100.0 * zeros / numbersNum;

        System.out.printf("The number of numbers in the file is: %d \n", numbersNum);
        System.out.printf("%.2f%% percent of the numbers are positive \n", percentPositives);
        System.out.printf("%.2f%% percent of the numbers are negative \n", percentNegatives);
        System.out.printf("%.2f%% percent of the numbers are zero \n", percentZeros);
    }
}