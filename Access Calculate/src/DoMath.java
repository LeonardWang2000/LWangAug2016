//Leonard Wang 8/30/16
public class DoMath {

	public static void main(String[] args) {
		System.out.println(Calculate.square(5));
		System.out.println(Calculate.cube(5));
		System.out.println(Calculate.average(5, 2));
		System.out.println(Calculate.average(5, 5, 5));
		System.out.println(Calculate.toDegrees(5));
		System.out.println(Calculate.toRadians(180));
		System.out.println(Calculate.discriminant(5, 2, 3));
		System.out.println(Calculate.toImproperFrac(2, 1, 2));
		System.out.println(Calculate.toMixedNum(5, 2));
		System.out.println(Calculate.foil(5, -2, 3, 4, "x"));
		System.out.println(Calculate.isDivisibleBy(10, 10));
		System.out.println(Calculate.absValue(5));
		System.out.println(Calculate.max(5, 10));
		
		
	}

}
