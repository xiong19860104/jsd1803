package factory1;

public class SingleDemo {
	//����ʽ
	public static  SingleDemo  singleDemo=new  SingleDemo ();
	//����ʽ
//	public static SingleDemo singleDemo;
//	//ʲô�ǵ���ģʽ����ֻ�����һ������
//	private SingleDemo(){}
//	//�ṩ������ȡ��ǰ����
//	public static SingleDemo getSingleDemo(){
//		if(singleDemo==null){
//			singleDemo=new SingleDemo();
//			return singleDemo;
//		}else{
//			return singleDemo;
//		}
//	}
	private  SingleDemo (){}
	public static  SingleDemo getSingleDemo(){
		return  singleDemo;
	}
	
	
	

}
