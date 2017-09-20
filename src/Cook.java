import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by 18240 on 2017/9/4.
 */
/**
 * 题目源于牛客网
 * 下厨房
 **/
public class Cook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//创建输入扫描
        HashSet<String> results = new HashSet<>();//创建去重字符数组
        for (int i = 0; i < 50; i++) {
            String str = null;
            try {
                str = scanner.nextLine();
            } catch (Exception e) {
                break;
            }
            if ("".equals(str)) {
                break;
            } else {
                String[] tempStr = str.split(" ");
                for (String s : tempStr) {
                    results.add(s);
                }
            }
        }
        System.out.println(results);
    }
}
