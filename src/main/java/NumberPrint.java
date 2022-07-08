
import java.util.ArrayList;
import java.util.HashMap;

public class NumberPrint {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        HashMap<Character, char[][]> nums = new HashMap<>();

        if (args.length == 0) {
            System.out.println("Enter numbers");
        }
        char[] str = args[0].toCharArray();
        for (Character string : str) {
            switch (string) {
                case '0':
                    arrayList.add("0");
                    nums.put(string, Numbers.zero);
                    break;
                case '1':
                    arrayList.add("1");
                    nums.put(string, Numbers.one);
                    break;
                case '2':
                    arrayList.add("2");
                    nums.put(string, Numbers.two);
                    break;
                case '3':
                    arrayList.add("3");
                    nums.put(string, Numbers.three);
                    break;
                case '4':
                    arrayList.add("4");
                    nums.put(string, Numbers.four);
                    break;
                case '5':
                    arrayList.add("5");
                    nums.put(string, Numbers.five);
                    break;
                case '6':
                    arrayList.add("6");
                    nums.put(string, Numbers.six);
                    break;
                case '7':
                    arrayList.add("7");
                    nums.put(string, Numbers.seven);
                    break;
                case '8':
                    arrayList.add("8");
                    nums.put(string, Numbers.eight);
                    break;
                case '9':
                    arrayList.add("9");
                    nums.put(string, Numbers.nine);
                    break;
                default:
                    System.out.println("Enter only numbers");
            }

        }
        char[][][] res = new char[str.length][][];

        for (int i = 0; i < arrayList.size(); i++) {
            switch (arrayList.get(i)) {
                case "0":
                    res[i] = nums.get('0');
                    break;
                case "1":
                    res[i] = nums.get('1');
                    break;
                case "2":
                    res[i] = nums.get('2');
                    break;
                case "3":
                    res[i] = nums.get('3');
                    break;
                case "4":
                    res[i] = nums.get('4');
                    break;
                case "5":
                    res[i] = nums.get('5');
                    break;
                case "6":
                    res[i] = nums.get('6');
                    break;
                case "7":
                    res[i] = nums.get('7');
                    break;
                case "8":
                    res[i] = nums.get('8');
                    break;
                case "9":
                    res[i] = nums.get('9');
                    break;
                default:
                    System.out.println("Enter only numbers");
            }
        }
        try {
            LetterStars.printPhraz(res, str.length);
        } catch (NullPointerException e) {
            e.getMessage();
        }


    }

}
