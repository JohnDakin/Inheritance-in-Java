
public class BoxWeight extends Box{

	double weight;
	
	public BoxWeight(){
		this.weight = -1;
		
	}
	
	public BoxWeight(double l, double w, double h, double weight) {
		//used to initialize values present in the parent class
		super(l,w,h);// call the parent class constructor
		
//		System.out.println(super.weight);
		
		this.weight = weight;
	}
}
