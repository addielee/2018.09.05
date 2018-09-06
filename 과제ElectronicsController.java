/**
	View로부터 사용자 요청을 받아서 그에 해당하는 Service를 호출하고
	그 결과를 받아 결과에 해당하는 View를 호출한다.
*/

class ElectronicsController{
      static ElectronicsService service = ElectronicsService.getService();   //모두가 다 사용할 거니깐 위로 뺌

	/**
		1.전체검색
	*/

	public static void selectAll(){  
		//전체검색이라 따로 인수는 없음, 어차피 EndView에서 끝나기 때문에 StartView로 가긴 해도 결국 출력할 것은 없음(따라서 return 필요없음)

		//service 호출 -> 그 결과 받아서 -> EndView 호출
		Electronics[] elecArr = service.selectAll();
		EndView.printAll(elecArr);
	}

	/**
		2.조건검색
	*/

	public static void searchByModelNo(int modelNo){
		//service 호출 -> 그 결과 받아서 -> EndView 호출
		Electronics elec = service.searchByModelNo(modelNo);

		if(elec == null) EndView.printMessage(modelNo+"는 없는 정보입니다.");
		else EndView.printSearch(elec);
		
	}

	/**
		3.수정하기
	*/

	public static void update(Electronics elec){   //3개 다 오니깐
		//존재유무 체크하고 없으면 오류 메시지 있으면 수정

		Electronics searchElec = service.searchByModelNo(elec.getModelNo());  
		//elec 안에 ModelNo 있음   //searchElec으로 해야함, elec과 다름(searchElec은 들어있는 데이터)
		
		if(searchElec ==null) EndView.printMessage(elec.getModelNo()+" 수정 실패");
		else{
			service.update(elec);  //변경할 매개변수인 elec을 받아와야 함
			EndView.printMessage(elec.getModelNo()+" 수정 성공");
		}
	}

	/**
		4.등록하기
	*/

	public static void insert(Electronics elec){  //등록할 것 4개니깐, 외부에서 접근 가능하도록 static 붙임
		
		if(service.insert(elec)){

			EndView.printMessage("상품등록이 완료되었습니다.");

		}else{
			EndView.printMessage("상품등록되지 않았습니다.");  //내용 알려주지 않음, 보안 뚫리지 않기 위해
		}
	}
}
