package kr.co.swkim.di_example;

import org.junit.Test;

import kr.co.swkim.di_example.model.CalcModel;
import kr.co.swkim.di_example.presenter.CalcPresenterImpl;
import kr.co.swkim.di_example.view.MainView;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.mockito.Mockito.mock;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    MainView mainView;
    CalcPresenterImpl calcPresenter = new CalcPresenterImpl();
    @Test
    public void addition_isCorrect() throws Exception {
        MainView mainView = mock(MainActivity.class);

        CalcModel calcModel = new CalcModel(1,2);
        calcPresenter.setView(mainView);
        calcPresenter.onPlus(calcModel.getA(),calcModel.getB());

        assertEquals("더하기 테스트",calcPresenter.getCalc(), 3);
    }

    @Test
    public void addition_notCorrect() throws Exception {
        MainView mainView = mock(MainActivity.class);

        CalcModel calcModel = new CalcModel(1,2);
        calcPresenter.setView(mainView);
        calcPresenter.onPlus(calcModel.getA(),calcModel.getB());

        assertNotSame("더하기 테스트",calcPresenter.getCalc(), 2);
    }



}