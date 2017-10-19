
## About 
Butter Knife를 활용한 Android MVP Sample Project

### Used Library
```
Butternife,Dagger,
```

## Gradle Settings
```
buildscript {
    repositories {
        mavenCentral()
    }
    dependencies {
        classpath 'com.neenbedankt.gradle.plugins:android-apt:1.8'
    }
}

apply plugin: 'android-apt'

dependencies {
    compile 'com.jakewharton:butterknife:8.2.1'
        apt 'com.jakewharton:butterknife-compiler:8.2.1'
}

```


## Usage



## ChangeLog: 

- **MVP_BUTTERKNIFE 1.0.0**:
	- Initial Created  
	



### MVP Patter

>[뷰]
>-이벤트를 프리젠터에 전달
>-사용자UI제공
>
>[프리젠터]
>-유저 요청에 반응
>-뷰의 흐름제어
>
>[모델]
>-데이터
>-비지니스 로직




### MVP 

>뷰 구현,UI 로직, 모델 구현을 분리
>복잡도감소
>- 분리에 따른 복잡도 <<< 뒤섞일 때의 복잡도
>생산성 향상시키기
>- 코드 변경이 상대적으로 쉬워짐
>- UI없이 테스트가능