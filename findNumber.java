package com.example.gaeul.quickcoding02;

/**
 * Created by Gaeul on 2016-10-05.
 */

//Binary Search의 개념을 이용
public class findNumber {
    int randomNum;
    int low=1, high=500;
    int currentNum;
    int cnt=0;

    //처음 send 버튼을 눌렀을 떄
    public int random(){
        randomNum = (int)(Math.random()*500)+1;
        this.currentNum = randomNum;
        return this.currentNum;
    }

    //low~high 내의 숫자 중 랜덤 숫자 호출
    public int random(int low, int high){
        randomNum = (int)(Math.random()*(high-low+1))+low;
        this.currentNum = randomNum;
        cnt++;
        return this.currentNum;
    }

    //Bigger 버튼을 눌렀을 때는 그 수보다 작은 숫자를 탐색
    public int pressBigger(){
        this.low = currentNum;
        this.currentNum = random(currentNum, high);
        return this.currentNum;
    }

    //Smaller 버튼을 눌렀을 때는 그 수보다 큰 숫자를 탐색
    public int pressSmaller(){
        this.high = currentNum;
        this.currentNum = random(low, currentNum);
        return this.currentNum;
    }

    public int pressBingo(){
        return cnt;
    }
}
