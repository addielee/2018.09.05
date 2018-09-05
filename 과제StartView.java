import java.util.Scanner;

/**
	사용자로부터 메뉴를 통해 원하는 기능을 요청 받기 위한 View
*/


class StartView {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("\n*******메뉴 선택********");
			System.out.println("1.전체검색   2.조건검색   3.수정하기   4.등록하기   5.종료");
			int choiceMenu = sc.nextInt();

			switch(choiceMenu){
				case 1 : ElectronicsController.selectAll(); break;  
				case 2 : searchMenu(sc) ; break;   //입력받을 것이 많아서 따로 메소드를 뺌 , static 메소드라 this키워드 못씀
				case 3 : updateMenu(sc); break;
				case 4 : ; break;
				case 5 : 
					System.out.println("프로그램 종료됩니다.\n");
					System.exit(0); //프로그램 강제 종료    //exit:프로그램 끝내는 메소드, 0:가장 정상적으로 프로그램 끝냄
			}
		}
	}
	/**
		조건검색 메뉴
	*/

	public static void searchMenu(Scanner sc){ 
		System.out.print("검색하려는 모델 번호는?");
		int modelNo=sc.nextInt();
		ElectronicsController.searchByModelNo(modelNo);    //Controller에서 호출
	}

	/**
		수정하기  메뉴
	*/
	public static void updateMenu(Scanner sc){
		//3개를 인수로 받는 생성자를 만들까?

		System.out.print("수정하려는 모델 번호는?");   //없으면 그냥 boolean값 false임
		int modelNo=sc.nextInt();

		System.out.print("수정하려는 가격은?");
		int modelPrice=sc.nextInt();
		
		System.out.print("수정하려는 내용은?");
		String modelDetail = sc.next();
	}

	/**
		등록하기  메뉴
	*/
	public static void insertMenu(Scanner sc){

		//객체를 새로 만들어야 함 
		//Electronics elec = new Electronics(int modelNo, String modelName, int modelPrice, String modelDetail) 생성자를 호출해서
	}


}
