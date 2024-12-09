package oncall.view;

import camp.nextstep.edu.missionutils.Console;
import oncall.util.InputValidator;

public class InputView {

    public final String EMERGENCY_TABLE_USER_INPUT="비상 근무를 배정할 월과 시작 요일을 입력하세요>"
            + "EX) 5,화";
    public final String ON_WEEKDAY_EMERGENCY="평일 비상 근무 순번대로 쉼표를 기준으로 사원 닉네임을 입력하세요>";
    public final String WEEK_DAY_EMERGENCY_INPUT="휴일 비상 근무 순번대로 쉼표를 기준으로 사원 닉네임을 입력하세요>";

    public String getStartDayAndMonth(){
        System.out.println("EMERGENCY_TABLE_USER_INPUT");
        return InputValidator.validateEmpty(Console.readLine());
    }
}
