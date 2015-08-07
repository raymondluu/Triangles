/*************************
* File Name: Triangles
* Coder Name: Raymond Luu
* Assignment: 4
*************************/

public class Triangles
{
	public static void main( String [] args )
	{
		printTriangleType( 5, 7, 7 );
		printTriangleType( 7, 7, 7 );
		printTriangleType( 5, 7, 8 );
		printTriangleType( 2, 1, 2 );
		printTriangleType( 2, 18, 2 );
	}
	public static void printTriangleType( int x, int y, int z )
	{
		if ( x + y <= z || x + z <= y || y + z <= x )
		{
			throw new IllegalArgumentException("The length of two sides is way too small compared to the last length");
		}
		else if ( x == y && y == z )
		{
			System.out.println( "Equilateral" );
		}
		else if ( x == y || y == z || x == z )
		{
			System.out.println( "Isosceles" );
		}
		else
		{
			System.out.println( "Scalene" );
		}
	}
}