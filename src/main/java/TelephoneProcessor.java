/**
 * Created by dmitry on 27.10.16.
 */
public class TelephoneProcessor
{
    public String process(String numberString) {
        long number = Long.parseLong(numberString);
        System.out.println("number=" +number);
        long sumOfDigits = number;
        long round = 1;
        do {
            sumOfDigits = this.getSumOfDigits(sumOfDigits);
            System.out.println(round + " round of calculation. Sum is: " + sumOfDigits);
            round++;
        } while (sumOfDigits > 10);
        return this.getNumberAsWord(sumOfDigits);
    }

    private long getSumOfDigits(long number)
    {
        long sum = 0;
        while (number > 0) {
            sum = sum + number % 10;
            number = number / 10;
            System.out.println("sum" + sum + "num" + number);
        }

        return sum;
    }

    private String getNumberAsWord(long x)
    {
        String result;
        switch ((int) x) {
            case 1:
                result = "One";
                break;
            case 2:
                result = "Two";
                break;
            case 3:
                result = "Three";
                break;
            case 4:
                result = "Four";
            break;
            default:
                result = Long.toString(x);
        }

        return result;
    }
}
