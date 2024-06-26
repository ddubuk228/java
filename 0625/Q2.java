class Day {
    String doing;
    int time;
    String location;
    static int count=0;
    static int total_time=0;

    Day(String doing, int time, String location) {
        this.doing = doing;
        this.time = time;
        this.location = location;
        count ++;
        total_time += time;
    }

    public static double getAvg() {
        return total_time / (double)count;
    }

    @Override
    public String toString() {
        return doing +
                "를 " +
               time +
                "시간동안 " +
               location +
                "에서 했다";
    }

}

public class Q2 {
    public static void main(String[] args) {
        Day day1 = new Day("자바공부", 10, "강남");
        Day day2 = new Day("여행", 15,"강원도");
        Day day3 = new Day("운동", 11, "피트니스");

        System.out.println("전체 하는 일의 시간 : " +Day.total_time);
        System.out.println("평균 하는 일의 시간 : " +Day.getAvg());
        System.out.println(day1.toString());
        System.out.println(day2.toString());
        System.out.println(day3.toString());

    }
}
