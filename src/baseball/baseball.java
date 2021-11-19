package baseball;

import java.util.Scanner;

public class baseball {
    public static void main(String[] args){
        int comp[] = new int[3];
        int user[] = new int[3];
        int num = 0;
        int ct = 0;
        boolean round = true;
        int strike = 0;
        int ball = 0;
        System.out.println("신나는 숫자야구게임");
        for (int i = 0; i < comp.length; i ++){
            comp[i] = (int)(Math.random() * 9 )+1;
            
            for(int j = 0; j < i; j++){
                if(comp[j] == comp[i]){
                    i --;
                    break;
                }
            }
        }
        Scanner sc = new Scanner(System.in);
        while(round) {
            System.out.println(ct + " 회차 입니다.");
            System.out.println("1~9사이의 정수를 입력하세요 : ");
            for (int i = 0; i < user.length; i++) {
                num = sc.nextInt();
                user[i] = num;
                if (num < 0 || num > 10) {
                    System.out.println("1~9사이의 정수를 다시 입력해주세요: ");
                }
            }
            for (int i = 0; i < comp.length; i++) {
                for (int j = 0; j < user.length; j++) {

                    if (comp[i] == user[j] && i == j) {
                        strike++;
                    } else if (comp[i] == user[j] && i != j) {
                        ball++;
                    }
                }
            }
            System.out.println(strike + " 스트라이크 " + ball + " 볼");
            if (strike >= 3) {
                round = false;
            }
            strike = 0;
            ball = 0;
            int out = 0;
            ct = ct + 1;
        }
        System.out.println("회차 : " + (ct -1));
        System.out.println("GAME OVER");
        sc.close();
    }

}

