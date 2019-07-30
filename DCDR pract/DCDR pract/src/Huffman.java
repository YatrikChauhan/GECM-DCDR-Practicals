import java.util.*; 


class HuffmanNode { 

	int data; 
	char c; 

	HuffmanNode left; 
	HuffmanNode right; 
} 

class MyComparator implements Comparator<HuffmanNode> { 
	public int compare(HuffmanNode x, HuffmanNode y) 
	{ 

		return x.data - y.data; 
	} 
} 

public class Huffman { 
	public static void printCode(HuffmanNode root, String s) 
	{ 
		if (root.left 
				== null
			&& root.right 
				== null
			&& Character.isLetter(root.c)) { 

			System.out.println(root.c + ":" + s); 

			return; 
		} 
		printCode(root.left, s + "0"); 
		printCode(root.right, s + "1"); 
	} 
	public static void main(String[] args) 
	{ 

		Scanner sc = new Scanner(System.in); 
		int n; 
		System.out.print("How Many Characters?: ");
		n=sc.nextInt();
		int a[]=new int[n];
		char[] charArray=new char[n];
		System.out.println("!!Note: Index Value Starts From 0!!\n");
		
		char[] charArray1 = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'}; 
		System.out.println("Enter The Index Value of Characters: ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			charArray[i]=charArray1[a[i]];
		}
		int[] charfreq = new int[n];
		System.out.println("Enter The Frequency of Characters: ");
		for(int j=0;j<n;j++)
		{
			charfreq[j]=sc.nextInt();
		}
		PriorityQueue<HuffmanNode> q 
			= new PriorityQueue<HuffmanNode>(n, new MyComparator()); 

		for (int i = 0; i < n; i++) { 
			HuffmanNode hn = new HuffmanNode(); 

			hn.c = charArray[i]; 
			hn.data = charfreq[i]; 

			hn.left = null; 
			hn.right = null; 

			q.add(hn); 
		} 

		HuffmanNode root = null; 

		while (q.size() > 1) { 
			HuffmanNode x = q.peek(); 
			q.poll(); 

			HuffmanNode y = q.peek(); 
			q.poll(); 

			HuffmanNode f = new HuffmanNode(); 

			f.data = x.data + y.data; 
			f.c = '-'; 
			f.left = x; 
			f.right = y; 
			root = f; 

			q.add(f); 
		} 
		printCode(root, ""); 
	} 
} 