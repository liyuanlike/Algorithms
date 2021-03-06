package dataabstraction;

/*如果字符串 s 中的字符循环移动任意位置之后能够得到另一个字符串 t，
 * 那么 s 就被称为 t 的回环变位（circular rotation）。例如，
 * ACTGACG 就是 TGACGAC 的一个回环变位，反之亦然。
 * 判定这个条件在基因组序列的研究中是很重要的。
 * 编写一个程序检查两个给定的字符串 s 和 t 是否互为回环变位。
 * 提示：答案只需要一行用到 indexOf()、length() 和字符串连接的代码
*/
public class CircularRotation {
	public static boolean isCircularRotation(String a,String b){
		return a.length()==b.length()&&(b+b).indexOf(a)!=-1;
	}
	public static void main(String[] args) {
		if(isCircularRotation("ACTGACG","TGACGAC"))
			System.out.println("It is");
		else
			System.out.println("It isn't");
	}

}
