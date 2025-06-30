package ch01;

public class Calcurator {
    // a = 20, b= 5
    // 두 수를 더하고, 빼고, 곱하고, 나눈 결과를
    // 각각 출력
    public static void main(String[] args) {
        int a = 20;
        int b = 5;
        System.out.println("뭘 더 할까요?");

            // 1. 덧셈
            int sum = a + b;
            System.out.println(" 덧셈 결과 : " + sum );

            // 2. 뺼셈
            int minus = a - b;
            System.out.println(" 뺄셈 결과 : " + minus );

            //3. 곱셈
            int multiply = a * b;
            System.out.println(" 곱셈 결과 : " + multiply );

            //4. 나눗셈
            double divide = a / b;
            System.out.println("나눗셈 결과" + divide );

            //5. 나머지를 구하는 연산자 (%)
            //7을 3으로 나눈 나머지
            System.out.println(7%3);
            //3을 7로 나눈 나머지
            // System.out.println(3%7);

            //문제 . 7을 3으로 나눈 나머지와 몫을 구하시오.
            //출력 형식은 다음과 같이
        // 1. 몫: 2, 나머지 : 1
        int result  = 7/3;
        System.out.println(" 몫은 : " + result );
        //2.나머지
        int na = 7%3;
        STRING r2 = "나머지는 : "  + NA);
        //3.합해서 출력
        System.out.println(r1 + r2);

    }
}

