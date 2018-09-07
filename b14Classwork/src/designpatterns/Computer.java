package designpatterns;

public class Computer {
	
	String HDD;
	String RAM;
	
	boolean bluetooth;
	boolean graphicsCard;
	
	
	
	 private Computer(String HHD, String RAM) {
		 this.HDD =HHD;
		 this.RAM = RAM;
		// TODO Auto-generated constructor stub
	}
	 
	 class ComputerBuilder
	 {
		 String HHD;
		 String RAM;
		 boolean  bt;
		 boolean graphics;
		 
		 
		 public String getHHD() {
			return HHD;
		}

		public void setHHD(String hHD) {
			HHD = hHD;
		}

		public String getRAM() {
			return RAM;
		}

		public void setRAM(String rAM) {
			RAM = rAM;
		}

		public boolean isBt() {
			return bt;
		}

		public void setBt(boolean bt) {
			this.bt = bt;
		}

		public boolean isGraphics() {
			return graphics;
		}

		public void setGraphics(boolean graphics) {
			this.graphics = graphics;
		}

		public ComputerBuilder(String HHD, String RAM)
		 {
			 this.HHD = HHD;
			 this.RAM = RAM:
				 
		 }
		 
		 Computer build() {return new Computer(this);}
	 }

}
