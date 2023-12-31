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

    public String selectPairMatching(){
        printPairMatchingInfo();
        printChoice();
        return Console.readLine();
    }

    private static void printChoice() {
        System.out.println("과정, 레벨, 미션을 선택하세요.");
        System.out.println("ex) 백엔드, 레벨1, 자동차경주");
    }

    private static void printPairMatchingInfo() {
        printBoarder();
        printCourseInfo();
        printMissionInfo();
        printBoarder();
    }

    private static void printBoarder() {
        System.out.println("#############################################");
    }

    private static void printCourseInfo() {
        System.out.println("과정: 백엔드 | 프론트엔드");
    }

    private static void printMissionInfo() {
        System.out.println("미션:");
        System.out.println("  - 레벨1: 자동차경주 | 로또 | 숫자야구게임");
        System.out.println("  - 레벨2: 장바구니 | 결제 | 지하철노선도");
        System.out.println("  - 레벨3: ");
        System.out.println("  - 레벨4: 성능개선 | 배포");
        System.out.println("  - 레벨5: ");
    }

    public String selectPairMatchingRetry(){
        System.out.println("매칭 정보가 있습니다. 다시 매칭하시겠습니까?");
        System.out.println("네 | 아니오");
        return Console.readLine();
    }


}
