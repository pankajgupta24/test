


	
	interface Moveable
	{
	 int AVG_SPEED = 40;
	 void move();
	}

	class Vehicle implements Moveable
	{
	 public void move()
	 {
	  System.out.print  ("Average speed is"+ AVG_SPEED);
	 }
	 public static void main (String[] arg)
	 {
	  Vehicle vc = new Vehicle();
	  vc.move();
	 }
	}

