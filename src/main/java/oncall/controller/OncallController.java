package oncall.controller;

import java.util.HashMap;
import java.util.Map;
import oncall.domain.Days;
import oncall.domain.Month;
import oncall.service.OncallService;
import oncall.util.Parser;
import oncall.view.ErrorView;
import oncall.view.InputView;
import oncall.view.OutputView;

public class OncallController {

    private final OncallService oncallService;
    private final InputView inputView;
    private final OutputView outputView;
    private final ErrorView errorView;

    public OncallController(OncallService oncallService, InputView inputView, OutputView outputView,
                            ErrorView errorView) {
        this.oncallService = oncallService;
        this.inputView = inputView;
        this.outputView = outputView;
        this.errorView = errorView;
    }

    public void run() {
        Map<Month,Days> userWorkDate=requestMonthAndDay();
    }

    private Map<Month, Days> requestMonthAndDay() {
        try {
            String[] input = Parser.splitWithDelimiter(inputView.getWorkingMonthAndDay());
            Month month = Month.valueOf(input[0]);
            Days days = Days.valueOf(input[1]);
            return Map.of(month, days);
        } catch (IllegalArgumentException e) {
            errorView.printErrorMessage(e.getMessage());
            return requestMonthAndDay();
        }
    }
}
