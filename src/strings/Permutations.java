package strings;
public class Permutations {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		String input = "abcd";
		permutation(input , 0 , input.length()-1);
		
	}

	private static void permutation(String input , int l ,int r) {
		// TODO Auto-generated method stub
		if(l==r){
			System.out.println(input);
		}else {
		    for(int i =l;i<=r;i++){
		    	input = swap(input,l,i);
		    	permutation(input,l+1, r);
		    	//input = swap(input,l,i);
		    	}
			}
		}

	private static String swap(String input, int i, int j) {
		// TODO Auto-generated method stub
		   char temp;
		   char[] charArray = input.toCharArray();
		   temp=charArray[i];
		   charArray[i]=charArray[j];
		   charArray[j]=temp;
		   return String.valueOf(charArray);
		}

}
