package abstractclass;

public class testabstract {
	public static void main(String[] args) {
		person[] people =new person[2];
		
		people[0] = new student("zhangchi", "ee");
		people[1] = new employee("zhangchi", 3000, 1995, 12, 24);
		
		for(person p : people)
			System.out.println(p.getDescripton()+" "+p.gethash());
	}
}
