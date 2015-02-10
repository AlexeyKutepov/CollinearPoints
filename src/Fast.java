import java.util.Arrays;

/**
 * Created by Alexey Kutepov on 10.02.15.
 */
public class Fast {
  public static void main(String[] args) {
    StdDraw.setXscale(0, 32768);
    StdDraw.setYscale(0, 32768);
    In in = new In(args[0]);
    Point[] pointList = new Point[in.readInt()];
    Point[] pointListNotSorted = new Point[pointList.length];
    int x, y;
    for (int i = 0; i < pointList.length; i++) {
      x = in.readInt();
      y = in.readInt();
      pointList[i] = new Point(x, y);
      pointListNotSorted[i] = new Point(x, y);
      pointList[i].draw();
    }

    for (int i = 0; i < pointListNotSorted.length; i++) {
      Arrays.sort(pointList, pointListNotSorted[i].SLOPE_ORDER);
      int index = 0, count = 1;
      for (int j = 1; j < pointList.length; j++) {
        if (pointListNotSorted[i].SLOPE_ORDER.compare(pointList[index], pointList[j]) == 0) {
          count++;
          if (count == 3) {
            StdOut.println(pointListNotSorted[i].toString() + " -> " + pointList[index].toString() + " -> " + pointList[index+1].toString() + " -> " + pointList[index+2].toString());
            pointListNotSorted[i].drawTo(pointList[index+count-1]);
          } else if (count > 3) {
            pointListNotSorted[i].drawTo(pointList[index+count-1]);
          }
        } else {
          count = 1;
          index = j;
        }
      }
    }
  }
}
