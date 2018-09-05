/** 전자제품 오브젝트*/
class Electronics{
	private int modelNo;	//모델번호
	private String modelName;	//모델이름
	private int modelPrice;		//모델가격
	private String modelDetail;	//모델설명

	Electronics(){}
	Electronics(int modelNo, String modelName){
		this.modelNo=modelNo;
		this.modelName=modelName;
	}
	Electronics(int modelNo, String modelName, int modelPrice, String modelDetail){
		this(modelNo,modelName);//생성자구현부 첫줄에서 생성자 호출
		this.modelPrice=modelPrice;
		this.modelDetail=modelDetail;
	}

	public void setModelNo(int modelNo){
		this.modelNo = modelNo;
	}

	public void setModelName(String modelName){
		this.modelName = modelName;
	}

	public void setModelPrice(int modelPrice){
		this.modelPrice = modelPrice;
	}

	public void setModelDetail(String modelDetail){
		this.modelDetail = modelDetail;
	}

	public int getModelNo(){
		return modelNo;
	}

	public String getModelName(){
		return modelName;
	}

	public int getModelPrice(){
		return modelPrice;
	}

	public String getModelDetail(){
		return modelDetail;
	}
}
