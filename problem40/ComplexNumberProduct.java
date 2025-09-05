package DSA;


class Complex{
	private int real,img;
	
	Complex(int real, int img){
		this.real = real;
		this.img = img;
	}
	
	public String toString() {
		if(this.img<0) {
//			if(this.img == -1) {
//				return this.real+" -i";
//			}
			return this.real+" - "+Math.abs(this.img)+"i";
		}
//		if(this.img == 0) {
//			return this.real+"";
//		}
//		if(this.real == 0) {
//			return this.img+"i";
//		}
		return this.real+" + "+this.img+"i";
	}
	
//	public  static String Product(Complex c1,Complex c2) {
//		 
//		
//		int real3 = c1.real*c2.real - c1.img*c2.img;
//		int img3 = c1.real*c2.img + c1.img*c2.real;
//		return new Complex(real3,img3).toString(); 
//	}
	public  static String Product1(Complex ...args) {
		 
		
		Complex result = args[0];
		for(int i = 1;i<args.length;i++) {
			int real = result.real*args[i].real - result.img * args[i].img; 
			int img = result.img*args[i].real + result.real*args[i].img;
			result = new Complex(real,img);
		}
		return result.toString(); 
	}
}
public class ComplexNumberProduct {
	
	
	
	public static void main(String[] args) {
		
		Complex c = new Complex(0,-1);
		Complex c1 = new Complex(0,2);
		System.out.println(c);
		System.out.println(c1);
//		System.out.println(Complex.Product(c,c1));
		System.out.println(Complex.Product1(new Complex(2,2), new Complex(2,2),new Complex(2,2)));
	}
}
