package view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public String selectFeature(){
        System.out.println("기능을 선택하세요.");
        System.out.println("1. 페어 매칭");
        System.out.println("2. 페어 조회");
        System.out.println("3. 페어 초기화");
        System.out.println("Q. 종료");
        return Console.readLine();
    }

    public void selectPairMatching(){
        System.out.println("");
    }


}
