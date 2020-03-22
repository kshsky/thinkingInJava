public class Upcasting{

	public static void main(String[] args){
	Shap shap = new Shap();
	Circle circle = new Circle();
	Square square = new Square();
	Triangle triangle = new Triangle();
	
	Upcasting test= new Upcasting();
	System.out.println(">>>normal call:");
	test.doSomething(shap);
	System.out.println(">>>upcasting:");
	System.out.println("===============>>> Circle circle = new Circle();");
	test.doSomething(circle);
	System.out.println("===============>>>Square square = new Square();");
	test.doSomething(square);
	System.out.println("===============>>>Triangle triangle = new Triangle();");
	test.doSomething(triangle);
	
	System.out.println("====================");
	Shap circleShap = new Circle();
	Shap squareShap = new Square();
	Shap triangleShap = new Triangle();
	System.out.println("===============>>>Shap circleShap = new Circle();");
	test.doSomething(circleShap);
	System.out.println("===============>>>Shap squareShap = new Square();");
	test.doSomething(squareShap);
	System.out.println("===============>>>Shap triangleShap = new Triangle();");
	test.doSomething(triangleShap);
	
	
	System.out.println("-------------------------------------");
	System.out.println("downcasting does not exist, the followings are all wrong");
    System.out.println("Circle circleShap1 = new Shap();");
	System.out.println("Square squareShap1 = new Shap();");
	System.out.println("Triangle triangleShap1 = new Shap()");
	
//	Circle circleShap1 = new Shap();
//	Square squareShap1 = new Shap();
//	Triangle triangleShap1 = new Shap();
//	test.doSomething(circleShap1);
//	test.doSomething(squareShap1);
//	test.doSomething(triangleShap1);
	
	}

	public void doSomething(Shap shap){
		
		shap.erase();
		shap.draw();
		
	}

}

class Shap{
	

	
	public void erase(){
		
		System.out.println("Shap erase - Shap");
				
	}
	
	public void draw(){
		
		System.out.println("Shap draw - Shap");
			
	}
	
	
	
}
class Circle extends Shap{
	
	public void erase(){
		
		System.out.println("Circle erase - Circle");
			
		
	}
	
	public void draw(){
		
		System.out.println("Circle draw - Circle");
			
	}
	
}
class Square extends Shap{
	
		public void erase(){
		
		System.out.println("Square erase - Square");
				
	}
	
	public void draw(){
		
		System.out.println("Square draw - Square");
				
	}
	
}
class Triangle extends Shap{
	
	public void erase(){
		
		System.out.println("Triangle erase - Triangle");
				
	}
	
	public void draw(){
		
		System.out.println("Triangle draw - Triangle");
			
	}
	
}
