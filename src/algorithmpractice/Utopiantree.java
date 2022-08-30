package algorithmpractice;

public class Utopiantree {
	public static void main (String[] args) {
		utopianTree(7);
	}
	
    public static int utopianTree(int n) {
    int height = 1;
    for (int i=1; i<n+1; i++){
        if (i%2 == 0){
            height=height+1;
        }else {
            height=height*2;
        }
    }
    System.out.println(height);
    return height;
    }
}
