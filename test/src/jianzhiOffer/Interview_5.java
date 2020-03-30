package jianzhiOffer;

/**
 * 去掉字符串中的空格
 *
 * @author ZhiFei
 */
public class Interview_5 {
    public static void main(String[] args) {
        String str = "dasdad sadasdad asda ";
        System.out.println(str);
        System.out.println(replace(str, '1'));
    }

    private static String replace(String str, char c) {
        StringBuilder sb = new StringBuilder();
        for (char x : str.toCharArray()) {
            if (x == ' ')
                sb.append(c);
            else
                sb.append(x);
        }
        return sb.toString();
    }
}
