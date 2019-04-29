package lab5;

class Dictionary {
	private static String[] kor= {"사랑","아기","돈","미래","희망"};
	private static String[] eng= {"love","baby","money","future","hope"};
	//한글을 입력하면 영어로 반환해주기!
	
	
	
	public static String kor2Eng (String word) {
		int index=-1;
		for(int idx=0;idx<kor.length;idx++) {
			if(word.equals(kor[idx])) {
				index=idx;
			}
		}
		if(index!=-1) {
			return eng[index];
		}
		else {
			return "없습니다";
		}
	}
}
