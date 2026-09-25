package ExampleCircle;


import java.util.List;

public class circleMain {
   public static void main() {
       long start = System.currentTimeMillis();
       Circle cercle1 = new Circle("red");
       Circle cercle2= new Circle("green");
       Circle cercle3 = new Circle("blue");
       List<Circle> circles = List.of(cercle1, cercle2, cercle3);
//       for(Circle circle : circles) {
//           circle.setColor("yellow");
//       }
       circles.parallelStream()
               .forEach(circle -> circle.setColor("yellow"));
       System.out.println(circles);
       long end = System.currentTimeMillis();
       System.out.println((end-start)/1000);
    }
}
