package bootcamp;

import java.awt.Color;
import java.sql.Date;

public final class ImmutableCar {
	
	private int yil;
	private int kacKisi;
	private Date uretimTarihi;
	private int km;
	private Color color;
	private enum Model{
		A(1),
		B(2),
		C(3),
		D(4);
		
		private int model;
		private Model(int model) {
			this.model = model;
		}
		public int getModel() {
			return model;
		}
	}
	
	public ImmutableCar(int yil, int kacKisi, Date uretimTarihi, int km, Color color) {
		super();
		this.yil = yil;
		this.kacKisi = kacKisi;
		this.uretimTarihi = uretimTarihi;
		this.km = km;
		this.color = color;
	}
	
	public int getYil() {
		return yil;
	}

	public int getKacKisi() {
		return kacKisi;
	}
	public Date getUretimTarihi() {
		return uretimTarihi;
	}
	public int getKm() {
		return km;
	}
	public Color getColor() {
		return color;
	}

	public static void main(String[] args) {
//		ImmutableCar myCar = new ImmutableCar(5, 2, (2020,1,4)  , 5000, Color.black);
//	    Level myVar = Level.MEDIUM; 
//	    System.out.println(myVar);
		
//		 Level myVar = Level.MEDIUM;
//
//		    switch(myVar) {
//		      case LOW:
//		        System.out.println("Low level");
//		        break;
//		      case MEDIUM:
//		         System.out.println("Medium level");
//		        break;
//		      case HIGH:
//		        System.out.println("High level");
//		        break;
//		    }
	  }
	
}
