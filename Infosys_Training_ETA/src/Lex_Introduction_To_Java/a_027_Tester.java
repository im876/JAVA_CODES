package Lex_Introduction_To_Java;

class Point {
    //Implement your code here
	private double xCoordinate;
	private double yCoordinate;
	
	
	
	public Point(double xCoordinate, double yCoordinate) {
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
	}
	
	public double getxCoordinate() {
		return xCoordinate;
	}
	public void setxCoordinate(double xCoordinate) {
		this.xCoordinate = xCoordinate;
	}
	public double getyCoordinate() {
		return yCoordinate;
	}
	public void setyCoordinate(double yCoordinate) {
		this.yCoordinate = yCoordinate;
	}

	public double calculateDistance() {
		// TODO Auto-generated method stub
		double x1 = 0.0;
		double y1 = 0.0;
		double distance = Math.sqrt(((getxCoordinate()-x1)*(getxCoordinate()-x1))+
				                    ((getyCoordinate()-y1)*(getyCoordinate()-y1)));
		
		return Math.round(distance*100)/100.0;
	}
	
	public double calculateDistance(Point point)
	{
		double distance = Math.sqrt(((point.xCoordinate - xCoordinate)*(point.xCoordinate - xCoordinate))+
                                    ((point.yCoordinate - yCoordinate)*(point.yCoordinate - yCoordinate)));
		return Math.round(distance*100)/100.0;
	}
	
	
	/*public double calculateDistance() {
		// TODO Auto-generated method stub
		result(getxCoordinate(), getyCoordinate());
		return 0.0;
	}*/
	
}


class a_027_Tester {

	public static void main(String[] args) {
		Point point1 = new Point(3.5, 1.5);
        Point point2 = new Point(6, 4);
                                
        System.out.println("Distance of point1 from origin is "+point1.calculateDistance());
        System.out.println("Distance of point2 from origin is "+point2.calculateDistance());
        System.out.println("Distance of point1 from point2 is "+point1.calculateDistance(point2));
        
        //Create more objects for testing your code                

	}
}

