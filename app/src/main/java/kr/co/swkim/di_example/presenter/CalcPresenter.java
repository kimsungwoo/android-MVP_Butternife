package kr.co.swkim.di_example.presenter;

import kr.co.swkim.di_example.view.MainView;

/**
 * Created by swkim on 2016-11-01.
 */

public interface CalcPresenter {

    void setView(MainView view);

    void onPlus(int a,int b);
}
