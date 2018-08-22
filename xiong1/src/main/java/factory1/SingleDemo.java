package factory1;

public class SingleDemo {
	//饿汉式
	public static  SingleDemo  singleDemo=new  SingleDemo ();
	//懒汉式
//	public static SingleDemo singleDemo;
//	//什么是单例模式：类只会产生一个对象
//	private SingleDemo(){}
//	//提供方法获取当前对象
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
