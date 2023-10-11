
import java.util.*;
import java.math.*;

public class Exam_15 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int dei = 10;
		// 1<= n <= 16
		// arr1과 arr2로 길이가 n인 정수 배열
		int len = 0;
		System.out.print("길이 지정 : ");
		len = in.nextInt();
		int arr1[] = new int[len];
		int arr2[] = new int[len];
		for(int j = 0 ; j< len ; ++j) {
			for(int i = 0 ; i < len ; ++i) {
				arr1[i] = (int)(Math.random()*Math.pow((double)len, 2)-1)+1;
			}
			for(int i = 0 ; i < len ; ++i) {
				arr2[i] = (int)(Math.random()*Math.pow((double)len, 2)-1)+1;
			}
		}
		String[] arr = new String[len];
		for(int i = 0 ; i <len ; ++i) {
			String bin1 = Integer.toBinaryString(arr1[i]);
			for(int li = 0; li < len-bin1.length();++li) {
				bin1 = "0"+bin1;
			}
			String bin2 = Integer.toBinaryString(arr2[i]);
			for(int li = 0; li < len-bin2.length();++li) {
				bin2 = "0"+bin2;
			}
			
			for(int j = 0 ; j < len ;++j) {
				if(bin1.charAt(j)==0 && bin2.charAt(j)==0) {
					arr[i] = arr[i]+" ";
				}else {
					arr[i] = arr[i]+"#";
				}
			}
			System.out.println(arr[i]);
		}
	}
}
