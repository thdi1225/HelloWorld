package co.micol.prj.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lotto {
	private Scanner scn = new Scanner(System.in);
	private int price = 0; 
	 
	public void run() {
		game();
	}
	
	private void game() {
		
		List<Integer[]> gameCount = new ArrayList<Integer[]>();
		
		System.out.print("충전금액 : ");
		price = scn.nextInt();
		
		System.out.println("1. 수동 2. 자동");
		int lottoMenu = scn.nextInt();
		if(lottoMenu == 1) {
			//수동 입력
			for(int i = 0; i < price/1000; i++) {
				gameCount.add(insertNum());
			}
		}else {
			//자동 입력
			for(int i = 0; i < price/1000; i++) {
				gameCount.add(autoNum());
			}
		}
		
		//로또 번호
		int[] lottoNum = lottoNum();
		
		//맞춘 횟수
		for(int i = 0; i < gameCount.size(); i++) {
			lottoCount(gameCount.get(i), lottoNum);
		}
	}
	
	//수동
	private Integer[] insertNum() {
		Integer[] val = new Integer[6];
		
		for(int i = 0; i < 6; i++) {
			System.out.println("번호를 입력하세요.");
			val[i] = scn.nextInt();
		}
		
		System.out.print("입력하신 로또 번호 : ");
		for(int value : val) {
			System.out.print(value+" ");
		}
		System.out.println();
		
		return val;
	}

	//자동
	private Integer[] autoNum() {
		Integer[] lotto = new Integer[6];
		for(int i = 0; i < 6; i++) {
			lotto[i]= (int)(Math.random() * 45) + 1;
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		System.out.print("자동 번호 : ");
		for(int value : lotto) {
			System.out.print(value+" ");
		}
		System.out.println();
		return lotto;
	}
	
	//로또
	private int[] lottoNum() {
		int[] lotto = new int[6];
		for(int i = 0; i < 6; i++) {
			lotto[i]= (int)(Math.random() * 45) + 1;
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		System.out.print("로또 번호 : ");
		for(int value : lotto) {
			System.out.print(value+" ");
		}
		System.out.println();
		return lotto;
	}
	
	//정답
	private void lottoCount(Integer[] val, int[] lottoNum) {
		int count = 0;
		int value1 = 0;
		int value2 = 0;
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 6; j++) {
				if(val[i] == lottoNum[j]) {
					count++;
					break;
				}
				
			}
		}
		
		System.out.println("맞춘 번호는 " + count + "개 입니다.");
	}
}
