

class Service{
	private static Service service = new Service();   //instance()메소드를 통해서만 접근 가능, Service.service로 직접 접근 불가하게(private 때문에)
	private Service(){}				//외부에서 객체 생성불가(내부적으로 직접 생성해서 제공해주기 위해 : 개발자의 의도대로 생성할 수 있도록 하기 위해서)

	/**
		현재 객체를 생성해서 리턴해주는 메소드 작성한다.
	*/
	public static Service instance(){   //static 해야 외부에서 접근가능 , instance를 getService로 자주 사용(값 받아오는 거라서)
		
		return service;
	}
}

/////////////////////////////////////////////
class SingletonePrivateConstructor {
	public static void main(String[] args) {
		/**Service s1 =new Serivice();
		Service s2 =new Serivice();
		Service s3 =new Serivice();*/

		Service s1 = Service.instance();
		Service s2 = Service.instance();
		Service s3 = Service.instance();

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}
