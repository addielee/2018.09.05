/**
	요청 결과에 대한 정보를 화면에 출력 담당 클래스
*/

class EndView{

	/**
		1.전체 전자제품 출력하기
	*/

	public static void printAll(Electronics [] elecArr){   //이제 출력만 하면 되고 갖고 나갈 건 없으니깐, elecArr에 모든 데이터 다 들어있음
		//static 붙이기 : 멤버변수 따로 호출할 필요도 없고, 객체 생성 안하고 메소드 호출 가능해서 편함
		System.out.println("\n----------전자제품 List-----------");
		for(int i=0; i < ElectronicsService.count; i++){    //count에 static이 붙어서 이렇게 호출할 수 있음
			System.out.print(elecArr[i].getModelNo() + "|");
			System.out.print(elecArr[i].getModelName() + "|");
			System.out.print(elecArr[i].getModelPrice() + "|");
			System.out.print(elecArr[i].getModelDetail() + "\n");
		}
		System.out.println();
	}

	/**
		2.모델 번호에 해당하는 제품 출력하기
	*/

	public static void printSearch(Electronics elec){    //변수가 elec이기 때문에 밑에도 elec.getModelNo() 형식
		System.out.println("\n-----"+elec.getModelNo()+"의 검색 결과-------");
		System.out.print(elec.getModelNo() + "|");
		System.out.print(elec.getModelName() + "|");
		System.out.print(elec.getModelPrice() + "|");
		System.out.print(elec.getModelDetail() + "\n");

	}

	/**
		3. 수정 or 등록의 결과 메시지를 출력하기
	*/

	public static void printMessage(String message){
		System.out.println(message);

	}
	
}
