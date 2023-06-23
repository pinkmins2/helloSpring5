package hello.spring.bean;

public class Spring5bean04factory {
    // 인사말을 출력하는 객체를 생성하는 creat 메서드
    public static Spring5Bean03 create(String bean){
        Spring5Bean03 obj = null;

        if(bean.equals("kor"))
            obj = new Spring5Bean03Kor();
         else if(bean.equals("eng"))
            obj = new Spring5Bean03Eng();
         else if(bean.equals("jpn"))
            obj = new Spring5Bean03Jpn();

        return obj;
    }

}
