
public class IndiaTraffic implements Traiffic,China {

	public static void main(String[] args) {
		
		Traiffic a =new IndiaTraffic();
		a.Green();
		a.red();
		a.yellow();
		a.rules();
		
		System.out.println(z);
		
		

	}

	@Override
	public void Green() {
		System.out.println("Green Method");
		
	}

	@Override
	public void red() {
		System.out.println("red Method");
		
	}

	@Override
	public void yellow() {
		System.out.println("yellow Method");
		
	}
	
	public void rules()
	{
		System.out.println("rules");
	}

	@Override
	public void stop() {
		System.out.println("stop");
		
	}

	

}
