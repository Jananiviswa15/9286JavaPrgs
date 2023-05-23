
public class Learners {

	String name;
	int rollNum;
	String favSubj;
	static String trainerName;
	static {
		trainerName = "janani";
		displayTrainerName();
		Learners ob = new Learners();
		ob.displayLearnerDetails();
	}
	
	 Learners(){
		System.out.println("non param");
		displayTrainerName();
		displayLearnerDetails();
	}
	
	Learners(String name){
	this.name = name; //alway refer to cyrrnt cls obj , learner2
	//learner2.name = "anusha;
	}
	
	//"kavitha", 23
	Learners(String name, int enrollmentNumber){
		//this.name = name;
		this(name);  //
		this.rollNum = enrollmentNumber;
		
//		learner3.name = kavitha;
//		learner3.rollNum = 23;
	}
	
	Learners(String name, int enrollmentNumber, String favSub){
//		this.name = name;
//		this.rollNum = enrollmentNumber;
		//this(name);
		this(name, enrollmentNumber); //call to other cons should be the 1st line
		this.favSubj = favSub;
		 
	}
	static void displayTrainerName() {
		System.out.println(trainerName);
	}
	
	
	void displayLearnerDetails() {
		System.out.println(" non stat");
		System.out.println(this.name + " "+this. rollNum+ this.favSubj);
	}
	
	public static void main(String args[]) {
		Learners learner1 = new Learners(); // an obj , mem alloc , dc --> default val
		//non param
		
	Learners learner2 = new Learners("anusha");
//		learner1.displayLearnerDetails();
//		learner2.displayLearnerDetails();
//		
	Learners learner3 = new Learners("kavitha", 23);
//		learner3.displayLearnerDetails();
	
	Learners learner4 = new Learners("kavitha", 23, "math");
	learner4.displayLearnerDetails();
	}
}
