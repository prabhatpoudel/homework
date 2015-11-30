package HomeWork;

class Television {
	final String MANUFACTURER;
	final int SCREEN_SIZE;
	boolean powerOn=false;
	int channel=0;
	int volume=0;

	Television(String brand,int size)
	{
		this.MANUFACTURER=brand;
		this.SCREEN_SIZE=size;
	}
	
	void setChannel(int station){
		this.channel=station;
		

	}
	
	void power()
	{
		if(powerOn){
			powerOn=false;
		}
		else powerOn=true;
	}
	
	void increaseVolume()
	{
		this.volume++;
//		System.out.println("Voulme is set to: "+volume);
	}
	
	void decreaseVolume()
	{
		this.volume--;
//		System.out.println("Voulme is set to: "+volume);
	}
	
	String getManufacturer()
	{
		return MANUFACTURER; 
	}
	
	int getScreenSize()
	{
	  return SCREEN_SIZE;	
	}
}
public class TelevisionChanel {

	public static void main(String [] args)
	{
		String tvBrand = new String();
		tvBrand= "Sony";
		int tvSize=17;
		Television tele =new Television(tvBrand,tvSize);
		System.out.println("Below are the details of TV: \n Brand is "+tele.getManufacturer() +" \n Size of TV is: "+tele.getScreenSize());
        
		tele.increaseVolume();
        tele.increaseVolume();
		tele.decreaseVolume();
		tele.setChannel(100);
		System.out.println("Below are the details of Current Channel: \n Current Channel is: "+tele.channel+"\n Volume is: "+tele.volume);
        
	}
}
