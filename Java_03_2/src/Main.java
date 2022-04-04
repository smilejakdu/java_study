// Java 프로그래밍 - 여러가지 연산자_2

public class Main {
    public static void main(String[] args) {

//      1. 비트 논리 연산자
        System.out.println("== 비트 논리 연산자 ==");
//      1-1. AND 연산자 (&)
//      모두 1 이면 1이 된다.
        int num1 = 5;
        int num2 = 3;
        int result = 0;

        result = num1 & num2;
        System.out.println("result = " + result); // result = 1
//        printf 는 출력 포맷을 해주는 녀석
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num1))); // 0101
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num2))); // 0011
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(result))); // 0001

//      1-2. OR 연산자 (|)
//      어느하나라도 1 이면 1로된다.
        num1 = 5;
        num2 = 3;
        result = num1 | num2;
        System.out.println("result = " + result); // result = 7
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num1))); // 0101
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num2))); // 0011
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(result))); // 0111

//      1-3. XOR 연산자 (^)
//      두개가 같으면 0 이되고 , 두개가 다르면 1이된다.
        num1 = 5;
        num2 = 3;
        result = num1 ^ num2;
        System.out.println("result = " + result); // result = 6
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num1))); // 0101
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num2))); // 0011
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(result))); // 0110

//      1-4. 반전 연산자 (~)
//      반전 체계가 되어서 앞에가 원래는 0 으로 되어있지만 1로 변환이된다.
        num1 = 5;
        result = ~num1;
        System.out.println("result = " + result); // result = -6
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num1))); // 0101
        System.out.printf("%s\n", (Integer.toBinaryString(result))); // 11111111111111111111111111111010

//      2. 비트 이동 연산자
        System.out.println("== 비트 이동 연산자 ==");
//      2-1. << 연산자
        int numA = 3; // 2진수로 보면 0011
        result = numA << 1; // 왼쪽으로 1만큼 이동시킨다.
        System.out.println("result = " + result); // result = 6
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(numA))); // 0011
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(result))); // 0110

//      2-2. >> 연산자
        numA = 3; // 2진수로 보면 0011
        result = numA >> 1; // 오른쪽으로 1만큼 이동시킨다.
        System.out.println("result = " + result); // result = 1
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(numA))); // 0011
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(result))); // 0001

//      2-3. >>> 연산자
        numA = -5;
        result = numA >> 1; // 오른쪽으로 1만큼 이동
        System.out.println("result = " + result); // -3
        System.out.printf("%s\n", (Integer.toBinaryString(numA))); // 11111111111111111111111111111011
        System.out.printf("%s\n", (Integer.toBinaryString(result))); // 11111111111111111111111111111101

        numA = -5;
        result = numA >>> 1;
        System.out.println("result = " + result); // 2147483645
        System.out.printf("%s\n", (Integer.toBinaryString(numA))); // 11111111111111111111111111111011
//        >>> 하게되면 오른쪽으로 이동하면서 앞에 있는 0 은 생략을 시킨다.
        System.out.printf("%s\n", (Integer.toBinaryString(result))); // 1111111111111111111111111111101

    }
}
