import java.util.Map;

public class HashMap {
    public static void main(String[] args) {
        String[] participant = new String[]{"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = new String[]{"josipa", "filipa", "marina", "nikola"};

        // 참가자들의 이름과 등장 횟수를 저장할 해시맵 생성
        Map<String, Integer> map = new java.util.HashMap<>();

        // 참가자들을 해시맵에 추가
        for (String str : participant) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        System.out.println(map.keySet());

        /*// 완주한 사람들을 해시맵에서 제거
        for (String str : completion) {
            map.put(str, map.get(str) - 1);
        }

        // 해시맵에서 값이 1인 사람을 찾아 출력
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 0) {
                System.out.println(entry.getKey());
                break;
            }
        }*/
    }
}
