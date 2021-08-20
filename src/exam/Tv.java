package exam;

public class Tv {
	
   private String color = "black";
   private boolean power;
   private int channel;
   private int channelUp;
   private int channelDown;
   
   public Tv( ) { 
	   
   }

   
   public void print() {
	   System.out.println("color:"+this.color+"   power:"+this.power+"    channel:"+this.channel);
	    

   }
   
   public void power() {
	   this.power =! false;
	
	  
   }
   
   public void channel() {
	   this.channel = 0;
   }
  
   public void channelUp() {
	   this.channelUp = channel++;
	
	
   }
   public void channelDown() {
	   this.channelDown = channel--;
   }





   

   

	
	
	
}
   
		

	


