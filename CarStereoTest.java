package hw1;

public class CarStereoTest
{
	public static void main(String[] args) 
	{
		CarStereo c = new CarStereo(100, 200, 5);
		System.out.println(c.getVolume()); //Expected 0.5
		c.louder();
		c.louder();
		System.out.println(c.getVolume()); //Expected 0.82
		c.louder();
		c.louder();
		System.out.println(c.getVolume()); //Expected 1.0
		c.quieter();
		System.out.println(c.getVolume()); //Expected 0.84			
		
		System.out.println(c.getTuner()); //Expected 100.0			
		c.setTuner(123.4);
		System.out.println(c.getTuner()); //Expected 123.4		
		c.setTuner(500);
		System.out.println(c.getTuner()); //Expected 200.0		
		c.setTuner(42);
		System.out.println(c.getTuner()); //Expected 100.0			
		
		System.out.println(c.getTuner()); //Expected 100.0		
		c.turnDial(360); //Full rotation
		System.out.println(c.getTuner()); //Expected 200.0
		c.turnDial(-180); //Half rotation to the left
		System.out.println(c.getTuner()); //Expected 150.0
		c.turnDial(15); // 1/24th rotation right
		System.out.println(c.getTuner()); //Expected ~154.17
		c.turnDial(720); //Two rotations right
		System.out.println(c.getTuner()); //Expected 200.0
		
		c.setTunerFromStationNumber(3);
		System.out.println(c.getTuner()); //Expected 170.0
		c.setTunerFromStationNumber(42);
		System.out.println(c.getTuner()); //Expected 190.0
		c.setTunerFromStationNumber(-5);
		System.out.println(c.getTuner()); //Expected 110.0
		
		c.setTuner(162);
		System.out.println(c.findStationNumber()); //Expected 3
		c.setTuner(134);
		System.out.println(c.findStationNumber()); //Expected 1
		c.setTuner(180);
		System.out.println(c.findStationNumber()); //Expected 4
		c.setTuner(200);
		System.out.println(c.findStationNumber()); //Expected 4
		
		c.setTuner(162);
		c.seekUp();
		System.out.println(c.getTuner()); //Expected 190
		c.setTuner(185);
		c.seekUp();
		System.out.println(c.getTuner()); //Expected 110
		
		c.setTuner(82);
		c.seekDown();
		System.out.println(c.getTuner()); //Expected 190
		
		c.setTuner(162);
		c.savePreset(); //Save station 3
		c.setTuner(123.4); //Whatever
		c.goToPreset(); //Tune to station 3's broadcast frequency
		System.out.println(c.getTuner()); //Expected 170	
	}	
}
