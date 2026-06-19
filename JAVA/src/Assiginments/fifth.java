//5. Declare product price and discount percentage (double) and calculate the final price after applying the discount.
package Assiginments;

public class fifth {
	public static void main(String[] args) {
		int headphone=3000;
		int moblie=10000;
		
		double dis=10.0;
		
		double after_dis_head=headphone - (headphone * dis / 100);
		double after_dis_moblie=moblie - (moblie * dis / 100);
		
		System.out.println("orignal price \nheadphone: " +headphone+ "\nmoblie: " +moblie );
		System.out.println("after Discount \nheadphone: " +after_dis_head+ "\nmoblie: " +after_dis_moblie);
	}

}
