package test15;

public class ExtednsTest3 {

	static void singing(Singer[] singers) {
		for(int i=0;i<singers.length;i++) {
			singers[i].singing();
		}
	}
	public static void main(String[] args) {		
		Singer[] singers = new Singer[2];
		singers[0] = new Momyson();
		singers[1] = new Ssamd();
		singing(singers);
		Singer s = new Singer();
		s = new HipHopSinger();
		s = new Ssamd();
		s = new Momyson();
		
	}
}







