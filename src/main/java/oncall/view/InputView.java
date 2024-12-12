package oncall.view;

import camp.nextstep.edu.missionutils.Console;
import oncall.util.InputValidator;

public class InputView {

    public String getWorkingMonthAndDay(){
        System.out.println("비상 근무를 배정할 월과 시작 요일을 콤마를 기준으로 입력하세요>");
        System.out.println("EX) 5,월");
        return InputValidator.validateEmpty(Console.readLine());
    }

    public String getWeekDayWorkOrder(){
        System.out.println("평일 비상 근무 순번대로 사원 닉네임을 입력하세요>");
        return InputValidator.validateEmpty(Console.readLine());
    }

    public String getHolidayDayWorkOrder(){
        System.out.println("휴일 비상 근무 순번대로 사원 닉네임을 입력하세요>");
        return InputValidator.validateEmpty(Console.readLine());
    }
}
