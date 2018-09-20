package medium;


public class IntegerToRoman {

    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        int mCount = num / 1000;
        num = num - mCount * 1000;
        while (mCount-- > 0) {
            sb.append('M');
        }
        int dCount = num / 100;
        num = num - dCount * 100;
        if (dCount > 0) {
            switch (dCount) {
                case 9:
                    sb.append('C');
                    sb.append('M');
                    break;
                case 4:
                    sb.append('C');
                    sb.append('D');
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                    dCount = dCount - 5;
                    sb.append('D');
                    while (dCount-- > 0) {
                        sb.append('C');
                    }
                    break;
                default:
                    while (dCount -- > 0) {
                        sb.append('C');
                    }
            }
        }

        int xCount = num / 10;
        num = num - xCount * 10;
        if (xCount > 0) {
            switch (xCount) {
                case 9:
                    sb.append('X');
                    sb.append('C');
                    break;
                case 4:
                    sb.append('X');
                    sb.append('L');
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                    xCount = xCount - 5;
                    sb.append('L');
                    while (xCount-- > 0) {
                        sb.append('X');
                    }
                    break;
                default:
                    while (xCount -- > 0) {
                        sb.append('X');
                    }
            }
        }

        if (num > 0) {
            switch (num) {
                case 9:
                    sb.append('I');
                    sb.append('X');
                    break;
                case 4:
                    sb.append('I');
                    sb.append('V');
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                    num = num - 5;
                    sb.append('V');
                    while (num-- > 0) {
                        sb.append('I');
                    }
                    break;
                default:
                    while (num -- > 0) {
                        sb.append('I');
                    }
            }
        }

        return sb.toString();
    }
}
