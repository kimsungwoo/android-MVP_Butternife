package kr.co.swkim.di_example.presenter;

import kr.co.swkim.di_example.view.MainView;

/**
 * Created by swkim on 2016-11-01.
 */

public class CalcPresenterImpl implements CalcPresenter {
    MainView mainView;
    int calc;

    @Override
    public void setView(MainView view) {
        mainView = view;
    }

    @Override
    public void onPlus(int a, int b) {
        calc = a + b;
        mainView.onPlus(String.valueOf(calc));
    }

    public int getCalc() {
        return calc;
    }
}
