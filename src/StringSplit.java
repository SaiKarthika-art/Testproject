
public class StringSplit {

	public static void main(String[] args) {
		 String s = "hello,how,hai" ;
		 String[] split = s.split(",");
		 for(int i=0;i<split.length;i++) {
			 System.out.println(split[i]);
		 }

	}

}
