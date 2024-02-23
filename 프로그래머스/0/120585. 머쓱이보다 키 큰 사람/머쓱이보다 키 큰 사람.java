class Solution {
    public int solution(int[] array, int height) {
        int count = 0; // 머쓱이보다 큰 사람의 수를 저장할 변수

        // 주어진 배열을 순회하며 머쓱이의 키보다 큰 사람의 수를 센다
        for (int i = 0; i < array.length; i++) {
            if (array[i] > height) {
                count++; // 머쓱이보다 큰 사람을 발견하면 count를 증가시킨다
            }
        }

        return count; // 결과 반환
    }
}