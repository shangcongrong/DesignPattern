package SingletonPattern.simple;

public class Singleton {
	private static final Singleton SINGLETON=new Singleton();
	//限制产生多个对象
	private Singleton(){
		
	}
	//通过本方法获得实例对象
	public static Singleton getSingleton() {
		return SINGLETON;
	}
	//类中其他方法
	public static void doSomething(){
		System.out.println("doSomething!");
	}
}
