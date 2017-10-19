

### About 
Butter Knife를 활용한 Android MVP Sample Project

### MVP Pattern Wiki 
https://en.wikipedia.org/wiki/Model%E2%80%93view%E2%80%93presenter


### Used Library
```
Butternife,Esspresso
```


### Usage
A값과 B값을 더하는 예제
```
@OnClick({R.id.txtv_top_message, R.id.txtv_bottom_meessage})
public void onTextMessageClick(TextView textView) {
    CalcModel calcModel = new CalcModel(1, 2);

    calcPresenter.onPlus(calcModel.getA(), calcModel.getB());
}
@Override
public void onPlus(String plus) {
    txtvTopMessage.setText(plus);
}
```

### Usage Test
```
@Test
public void addition_isCorrect() throws Exception {
    MainView mainView = mock(MainActivity.class);

    CalcModel calcModel = new CalcModel(1,2);
    calcPresenter.setView(mainView);
    calcPresenter.onPlus(calcModel.getA(),calcModel.getB());

    assertEquals("Plus Test",calcPresenter.getCalc(), 3);
}
```

### ChangeLog: 

- **MVP_BUTTERKNIFE 1.0.0**:
	- Initial Created  
	



