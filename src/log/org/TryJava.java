package log.org;

public class TryJava {
	
	public static void main(String[] args) {
		
		
		String name1 = "Riya";
		String name2 = "Riya";
		
		String name3=name1.concat(name2);
		
		System.out.println(name3);
		
		String name4="RiyaRiya";
		
		System.out.println("n1:"+System.identityHashCode(name1)+" "
		+"n2:"+System.identityHashCode(name2)+" "+"n3:"+System.identityHashCode(name3));
		
		System.out.println("n4:"+System.identityHashCode(name4));
	}

}
