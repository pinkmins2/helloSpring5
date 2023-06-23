package hello.spring.basic;

public class Spring5App02 {
    // 세번째 사례
    // 인사말을 한국어,영어,일본어로 출력하도록 기능 추가
    public static void main(String[] args) {
        Spring5Bean02 app02 = new Spring5Bean02();
        // 메서드 호출: 변수명.메서드명
        app02.sayHelloKor("스프링5");
        app02.sayHelloEng("스프링5");
        app02.sayHelloJpn("스프링5");
    }

}
