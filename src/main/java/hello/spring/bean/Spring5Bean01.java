package hello.spring.bean;

public class Spring5Bean01 {

    public void sayHello(String msg) {
        System.out.println("안녕하세요, " +msg);
    }
}

// 여기서 보듯, Spring5App01을 실행하려면
// 반드시 Spring5Bean01이라는 클래스가 필수임
// 즉, 클래스간의 의존성이 커짐

// 의존성이 커짐으로 인해 발생하는 부수적인 단점은
// 코드변경시 그것과 연관되는 다른 클래스에 영향을 미침
// 따라서, 유지보수의 범위가 넓어짐
// 해결 : 인터페이스를 도입해서 객체간의 의존성을 낮춰줌