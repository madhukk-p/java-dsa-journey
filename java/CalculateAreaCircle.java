public class CalculateAreaCircle {
  
        public static double getCircleArea(double radius){
    
            double circleArea = 3.14 * radius *radius;
    
            return circleArea;
        }
        
        public static void main(String[] args){
    
            double circle1 = getCircleArea(12);
            double circle2 =  getCircleArea(22);
            System.out.println(circle1);
            System.out.println(circle2);
        }
    }
    

