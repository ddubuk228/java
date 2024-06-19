import javax.swing.*;

public class PointAvg {
    public static void main(String[] args) {
        String data = JOptionPane.showInputDialog("첫 번째 수학 점수를 입력하세요: ");
        double math_score1 = Integer.parseInt(data);
        data = JOptionPane.showInputDialog("두 번째 수학 점수를 입력하세요: ");
        double math_score2 = Integer.parseInt(data);
        double math_avg = (math_score1 + math_score2)/2;

        data = JOptionPane.showInputDialog("첫 번째 영어 점수를 입력하세요: ");
        double english_score1 = Integer.parseInt(data);
        data = JOptionPane.showInputDialog("두 번째 영어 점수를 입력하세요: ");
        double english_score2 = Integer.parseInt(data);
        double english_avg = (english_score1 + english_score2)/2;

        String result = "수학 평균 점수: " +math_avg+ "\n"+
                        "영어 평균 점수: " +english_avg;
        JOptionPane.showMessageDialog(null, result);
    }
}
