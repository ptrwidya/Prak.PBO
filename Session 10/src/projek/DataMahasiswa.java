package projek;

public class DataMahasiswa {
	public static void main (String[] args) {
		int maxSize = 100;
		ManageMahasiswa obj = new ManageMahasiswa (maxSize);
		obj.insert("1187050001", "Andre", 24);
		obj.insert("1187050002", "Parto", 29);
		obj.insert("1187050003", "Lisa", 27);
		obj.insert("1187050004", "Putri", 20);
		obj.insert("1187050005", "Amelia", 20);
		System.out.println("Data mahasiswa :");
		obj.display();
	}

}
