public class Upcasting{

	public static void main(String[] args){
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		
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
	
	System.out.println("\r\n\r\n///////////////////////////////////////////////////////\r\n\r\n");
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
		//if son override father's getColor, there will get a new value,otherwise there will get father's value
		System.out.println(">shap.getColor()\r\n"+shap.getColor());
		//the son always use father's attribute
		System.out.println(">>shap.getClass() ---- shap.weight\r\n"+shap.getClass()+" ---- "+shap.weight);
		
	}

}

class Shap{
	
	protected String weight="Shap weights 80kg";
	private String color="Shap-green";
	
	public void setColor(String color){
		this.color = color;
		
	}
	
	public String getColor(){
		
		return this.color;
	}
	
	public void erase(){
		
		System.out.println("Shap erase --- " + weight + " --- " + color);

	}
	
	public void draw(){
		
		System.out.println("Shap draw ---"+ weight + " --- " + color);
	
	}
	
	
	
}
class Circle extends Shap{
	
	private String weight="Circle-3kg";
	private String color="Circle-red";
	
	
	public void setColor(String color){
		this.color = color;
		
	}
	
	public String getColor(){
		
		return this.color;
	}
	public void erase(){
		
		System.out.println("Circle erase --- " + weight + " --- " + color);

	}
	
	public void draw(){
		
		System.out.println("Circle draw  --- " + weight + " --- " + color);
	}
	
}
class Square extends Shap{
	
	private String weight="Square-3kg";
	private String color="Square-blue";
	
	
	public String getColor(){
		
		return " the color of Square is blue";
	}
	
	public void erase(){
		
		System.out.println("Square erase  --- " + weight + " --- " + color);
	
	}
	
	public void draw(){
		
		System.out.println("Square draw  --- " + weight + " --- " + color);

	}
	
}
class Triangle extends Shap{
	
	//private String weight="Triangle-3kg";
	private String color="Triangle-black";
	
	public void erase(){
		
		System.out.println("Triangle erase  --- " + weight + " --- " + color);
				
	}
	
}
