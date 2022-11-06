
public class inheritance {

	public static void main(String[] args) {
		Workers worker=new Workers();
		
		worker.setSalary(40000);
		System.out.println("My salary is "+worker.getSalary()+" dollars.");
		
		SalesConsultant salesConsultant=new SalesConsultant();
		salesConsultant.setName("Bahadir");
		salesConsultant.setBonus(20);
		System.out.println("My name is "+salesConsultant.getName()+".");
		salesConsultant.workMonth();
		
//		workers
//			engineering
//				computer engineer
//			sales
//				sales consultant
	}

}
