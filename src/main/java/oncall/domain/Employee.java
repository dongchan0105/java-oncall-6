package oncall.domain;

public class Employee {
    private final String name;


    public Employee(String name) {
        validNameLength(name);
        this.name = name;
    }

    private void validNameLength(String name){
        if(name.length() > 5){
            throw new IllegalArgumentException("사원의 이름은 5자리를 넘을 수 없습니다");
        }
    }
}
