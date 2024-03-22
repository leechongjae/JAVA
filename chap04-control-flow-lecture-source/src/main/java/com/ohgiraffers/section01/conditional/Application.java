package com.ohgiraffers.section01.conditional;

public class Application {

    public static void main(String[] args) {

        /* 설명.
         *  여기서 모든 테스트 할 클래스들은 클래스 네이밍 규칙에 어긋나긴 하지만 학습 순서를 보기 좋게 정렬하기 위해
         *  지은 이름이다. 모든 메소드는 해당 메소드 내에서 호출할 것이기 때문에, 하나의 메소드를 확인한 후 다음 메소드를
         *  호출하여 다른 것을 확인할 때 주석처리 하여 매번 실행되지 않게끔 한다.
         * */
        A_if a = new A_if();

//        a.testSimpleIfStatement();  // 단독 if문 흐름 확인용 메소드 호출
//        a.testNestedIfStatement();  // 중첩 if문 흐름 확인용 메소드 호출

        B_ifElse b = new B_ifElse();

//        b.testSimpleIfElseStatement();  // 단독 if-else 문 흐름 확인용 메소드 호출
//        b.testNestedIfElseStatement();  // 중첩 if-else 문 흐름 확인용 메소드 호출

        C_ifElseIf c = new C_ifElseIf();

//        c.testSimpleIfElseIfStatement();        // 단독 if-else 문 흐름 확인용 메소드 호출
//        c.testNestedIfElseIfStatement();        // 중첩 if-else-if 문 흐름 확인용 메소드 호출
//        c.improveNestedIfElseIfStatement();     // 중첩 if-else-if 문 로직 개선

        D_switch d = new D_switch();

//        d.testSimpleSwitchStatement();  // switch문 흐름 확인용 메소드 호출
        d.testSwitchVendingMachine();   // 문자열값 비교 및 break 테스트
    }
}
