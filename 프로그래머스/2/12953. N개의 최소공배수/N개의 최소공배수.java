class Solution {
    public int solution(int[] arr) {

        int answer =arr[0];

        for (int i = 1; i < arr.length; i++) {
            answer = lcm(answer, arr[i]);
        }
        return answer;
    }

    // 최소공배수 = 두 수의 곱 / 두 수의 최대공약수
    public int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }


    // 최대공약수
    public int gcd(int a, int b) {
        int r;
        while (b != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

}