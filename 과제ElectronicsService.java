/**

Model

	실제 CRUD 작업을 담당할 Business Logic 처리하는 클래스
		: 싱글톤 클래스 - 생성자를 통해서 초기치 데이터를 세팅
*/

class ElectronicsService{
	private static ElectronicsService service = new ElectronicsService();   //싱글톤 만들기 위해 static

	String data [][] = {
      {"100" , "에어컨" , "250000", "삼성 무풍에어컨"} ,
      {"200" , "세탁기" , "350000", "LG 세탁짱"} ,
      {"300" , "냉장고" , "500000", "냉장고입니다."} ,
      {"400" , "전자렌지" , "640000", "전자렌즈입니다."} ,
      {"500" , "밥통" , "450000", "쿠쿠밥솥 최고!"} 
   };
	
	Electronics elecArr [] = new Electronics[20];


	/**
		Electronics타입 배열 안에 실제 들어있는 전자제품 개수 check하는 변수
	*/

	static int count;  //메모리에 딱 하나 만들어서 사용할 것, 다른 class에서도 접근해야 함, 앞에 public을 붙여도 되지만 같은 폴더라서 안 붙여도 됨


	/**
		외부에서 객체 생성 못하도록 private 생성자 작성
	*/
	private ElectronicsService(){  //elecArr []에 담기 위해 생성자 호출
		//초기치 데이터 세팅하기

		for(int i=0;i<data.length;i++){     //elctronics는 20개로 넉넉히 만듦, 초기치인 제품 개수만큼만 돌아야해서 data 행만큼 돌기
			elecArr[i]=new Electronics(Integer.parseInt(data[i][0]),
									   data[i][1], Integer.parseInt(data[i][2]), data[i][3]);
			count++;
		}
	}


	/**
		현재 객체를 사용할 수 있도록 현재 객체를 리턴해주는 메소드 작성
	*/
	public static ElectronicsService getService(){
		return service;
	}



	/**
		1.전체검색기능 : 전체를 EndView에 보내기만 하면 됨, 보내야 하기 때문에 리턴
	*/

	public Electronics [] selectAll(){        //Electronics [] 배열을 리턴해야 함!!!!!!!!!!!!
		return elecArr;
	}

	/**
		2.모델번호에 해당하는 검색
	*/

	public Electronics searchByModelNo(int modelNo){    //modelNo는 하나이기 때문에 배열이 아님!!!!!!!!
		for(int i=0; i<count ; i++ ){
			if(elecArr[i].getModelNo() == modelNo){   //여기서 찾은 elecArr[i]을 리턴, 찾으면 바로 빠져나감
				//어제는 여기서 출력
				return elecArr[i];   //전체 리턴한 거 아님, 찾았으면 객체 하나만 리턴
			}
		}
		return null;
	}

	/**
		3. 모델번호에 해당하는 전자제품 수정하기(가격, 상품내용)
		@return : true - 수정성공, false - 수정실패
	*/

	public boolean update(Electronics elec){  //관리가 용이, 3개라서 다 받아올 바에 Electronics elec으로 인수 하나 받아옴
		for(int i=0; i<count ; i++){
			if(elecArr[i].getModelNo() == modelNo){
				setModelPrice(modelPrice);
				setModelDetail(modelDetail);

				return true;
			}
		}
		return false;
	}

	/**
		4.전자제품 추가하기(등록)
		@return : true - 등록성공, false - 등록실패
	*/

	public boolean insert(Electronics elec){   //Electronics elec 하나에 4개 들어올 수 있으니깐
		return false;
	}
}
