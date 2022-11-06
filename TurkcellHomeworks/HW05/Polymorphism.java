
public class Polymorphism {

	public static void main(String[] args) {
		Trainer fitnessTrainer=new FitnessTrainer();
		fitnessTrainer.teach();
		fitnessTrainer.workout();
		
		Trainer muayThaiTrainer=new MuayThaiTrainer();
		muayThaiTrainer.teach();
		muayThaiTrainer.workout();

	}

}
