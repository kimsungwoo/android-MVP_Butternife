package kr.co.swkim.di_example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import kr.co.swkim.di_example.model.CalcModel;
import kr.co.swkim.di_example.presenter.CalcPresenter;
import kr.co.swkim.di_example.presenter.CalcPresenterImpl;
import kr.co.swkim.di_example.view.MainView;

public class MainActivity extends AppCompatActivity implements MainView {
    CalcPresenter calcPresenter = new CalcPresenterImpl();

    @BindView(R.id.txtv_top_message)
    TextView txtvTopMessage;

    @BindView(R.id.txtv_bottom_meessage)
    TextView txtvBottomMessage;

    @BindString(R.string.app_name)
    String appName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        calcPresenter.setView(this);
        txtvTopMessage.setText
                ("하하하하_탑");
        txtvBottomMessage.setText("하하하_아래");

        ButterKnife.apply(txtvTopMessage, View.ALPHA, 0.5f);
    }


    @OnClick({R.id.txtv_top_message, R.id.txtv_bottom_meessage})
    public void onTextMessageClick(TextView textView) {
        CalcModel calcModel = new CalcModel(1, 2);

        calcPresenter.onPlus(calcModel.getA(), calcModel.getB());
    }

    @Override
    public void onPlus(String plus) {
        txtvTopMessage.setText(plus);
    }
}
