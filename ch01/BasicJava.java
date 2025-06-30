package ch01;

public class BasicJava {
    public static void main(String[] args) {
        //두 수 a,b를 바꾸려면
        //빈 변수(정수)를 만든다.
        // 1. a를 b로 넣는다.
        //2. b를 a로 보낸다.
        //3. temp를 b로 보낸다.
        // 4., 바꾼 이후 a와 b를 출력해본다.
        // --------------------------------
        int a = 10;
        int b = 20;
        int temp;

//        두 수 a,b를 바꾸는 작업을 합니다.
        temp = a;

        a = b;
        b = temp;
        //두 수를 바꾼 후 출력
        System.out.println("a" + b);
        System.out.println();
        System.out.println("a= " + a + ", b= " + b);
    }
}

