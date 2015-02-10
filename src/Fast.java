import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by Alexey Kutepov on 10.02.15.
 */
public class Fast {
  public static void main(String[] args) {
    HashSet<String> hashSet = new HashSet<String>();
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
    Merge.sort(pointListNotSorted);
    for (int i = 0; i < pointListNotSorted.length; i++) {
      if (hashSet.contains(pointListNotSorted[i].toString())) {
        continue;
      }
      Arrays.sort(pointList, pointListNotSorted[i].SLOPE_ORDER);
      int index = pointList.length - 1, count = 1;
      for (int j = pointList.length - 2; j >= 0; j--) {
        if (pointListNotSorted[i].SLOPE_ORDER.compare(pointList[index], pointList[j]) == 0) {
          count++;
        } else {
          if (count >= 3) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(pointListNotSorted[i].toString());
            hashSet.add(pointListNotSorted[i].toString());
            for (int k = index; k > index-count; k--) {
              stringBuilder.append(" -> " + pointList[k].toString());
              hashSet.add(pointList[k].toString());
            }
            StdOut.println(stringBuilder.toString());
            pointListNotSorted[i].drawTo(pointList[index-count+1]);
          }
          count = 1;
          index = j;
        }
      }
    }
  }
}
