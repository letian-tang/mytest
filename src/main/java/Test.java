import java.util.UUID;

/** 
* [简要描述]:<br/>
* [详细描述]:<br/>
* @author  tangdingyi  E-mail: 13913364179@163.com
* @date 创建时间：2016年8月30日 下午2:14:18 
* @version 1.0 *
* @since  
*/
public class Test {
	
	

	public static void main(String[] args) {
		
		
		Student s = new Student();
		s.setS(1);
		s.setSs("1111");
		new Thread(new Ru(s)).start();
		
		s.setS(2);
		s.setSs("2222");
		new Thread(new Ru(s)).start();
		
		s.setS(3);
		s.setSs("3333");
		new Thread(new Ru(s)).start();
		
		

	}

}
class Ru implements Runnable{
	private Student s;
	public Ru(Student s){
		this.s = s;
	}
	public void run() {
		
		System.out.println(s);
	}
}

class Student{
	private int s;
	private String ss;
	public int getS() {
		return s;
	}
	public String getSs() {
		return ss;
	}
	public void setS(int s) {
		this.s = s;
	}
	public void setSs(String ss) {
		this.ss = ss;
	}
	@Override
	public String toString() {
		return "Student [s=" + s + ", ss=" + ss + "]";
	}
	
}
