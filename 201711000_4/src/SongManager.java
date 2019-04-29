/*실습 2: SongManager.java*/
public class SongManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] c={"Benny Andersson","Björn Ulvaeus","Stick Andoson"};
		Song song=new Song("Dancing Queen","ABBA","<ARRIVAL>",c,1976,2);
		
		song.show();

	}

}
