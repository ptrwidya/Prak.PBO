package projek;

public class Array2Dimensi {
	public static void main (String[] args) {
		String[] [] myBouquet = {{"Red", "Yellow", "Peach"},
		{"Yellow", "Blue", "Violet"}, 
		{"Green", "Purple", "Blue"},
		{"Pink", "Violet", "Red"},
		{"White", "Orange", "Pink"},
		{"Orange", "Blue", "Yellow"}};
		
		for(int i = 0; i< myBouquet.length; i++) {
			for(int j = 0; j < myBouquet[i].length; j++){
				System.out.println (myBouquet[i][j]);
				}
			}
		
		}
	}
