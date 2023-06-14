package FactoryMethod;

public class GetPlanFactory {
	//Plan --> domestic, commeric, institi, industr
	public Plan getPlan(String planType){  //institu
		if(planType == null){
			return null;
		}
		if(planType.equalsIgnoreCase("DOMESTICPLAN")) {
			return new DomesticPlan();  //anonyomous
		}
		else if(planType.equalsIgnoreCase("COMMERCIALPLAN")){
			return new CommercialPlan();
		}
		else if(planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {
			return new InstitutionalPlan();
		}
		return null;
	}
}
