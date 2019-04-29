/*실습 2: song.java*/
class Song {
	String title;//Dancing Queen
	String artist;//ABBA
	String album;//ARRIVAL(어라이벌)
	String[] composer;//Benny Andersson,Björn Ulvaeus
	int year;//1976
	int track;//2
	
	public Song() {
		
	}
	public Song(String title,String art,String alb,String[] c,int y,int track) {
		this.title=title;
		this.artist=art;
		this.album=alb;
		this.composer=c;
		this.year=y;
		this.track=track;
	}
	
	void show() {
		System.out.println("제목 :"+this.title);
		System.out.println("아티스트: "+this.artist);
		System.out.println("앨범: "+this.album);
		System.out.print("작곡가: ");
		for(int i=0;i<composer.length-1;i++) {
			System.out.print(this.composer[i]+", ");
		}
		System.out.println(this.composer[composer.length-1]);
		System.out.println("발매연도: "+this.year);
		System.out.println("트랙번호: "+this.track);
	}	
}
