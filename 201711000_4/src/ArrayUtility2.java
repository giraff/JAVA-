/*실습1
 * concat : 두 배열을 나란히 연결
 * remove: s1,s2를 비교하여 s2와 같은 요소를 제거한 새로운 s1을 생성*/
public class ArrayUtility2 {
	static int[] concat(int[] s1,int[] s2) {
		int[] tmp=new int[s1.length+s2.length];
		//s1부터 입력
		for(int i=0;i<s1.length;i++) {
			tmp[i]=s1[i];
		}
		for(int i=0;i<s2.length;i++) {
			tmp[s1.length+i]=s2[i];
		}
		return tmp;
	}
	
	static int[] remove(int[] s1, int[] s2) {
		int[] tmp=new int[s1.length];
		int count=0;
		boolean eq=false;
		for(int i=0;i<s1.length;i++) {
			for(int j=0;j<s2.length;j++) {
				if(s1[i]==s2[j]) {
					eq=false;
					break;
				}
				else {
					eq=true;
				}
			}
			if(eq==true) {
				tmp[count++]=s1[i];
				eq=false;
				}
		}
		
		int[] array=new int[count];
		for(int i=0;i<array.length;i++) {
			array[i]=tmp[i];
		}
		return array;
	}
}

