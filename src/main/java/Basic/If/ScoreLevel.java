package Basic.If;

import java.util.Scanner;

/**本类用于继续测试if嵌套
 * 需求:根据分数进行评级
 * 90分以上 优秀,80~89 良好,70~79 中等,60~69 及格,60分以下 不及格
 */
public class ScoreLevel {
    public static void main(String[] args) {
        double score = new Scanner(System.in).nextDouble();
        if (score >= 100 || score <= 0) {
            System.out.println("请输入0~100以内的值");
        }
        if (score > 90 && score <= 100) {
            System.out.println("优秀");
        } else if (score >= 80 && score <= 90) {
            System.out.println("良好");
        } else if (score >= 70 && score <= 79) {
            System.out.println("中等");
        } else if (score >= 60 && score <= 69) {
            System.out.println("及格");
        }else if (score < 60) {
            System.out.println("不及格");
        }
    }
}
