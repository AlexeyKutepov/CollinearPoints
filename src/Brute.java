/**
 * Created by Alexey Kutepov on 10.02.15.
 */
public class Brute {
  public static void main(String[] args) {
    In in = new In(args[0]);
    Point[] pointList = new Point[in.readInt()];
    int x, y;
    for (int i = 0; i < pointList.length; i++) {
      x = in.readInt();
      y = in.readInt();
      pointList[i] = new Point(x, y);
    }
    Merge.sort(pointList);
    for (int i = 0; i < pointList.length; i++) {
      for (int j = i + 1; j < pointList.length; j++) {
        if (pointList[i].compareTo(pointList[j]) == 0) {
          continue;
        }
        for (int k = j + 1; k < pointList.length; k++) {
          if (pointList[i].compareTo(pointList[k]) == 0 || pointList[j].compareTo(pointList[k]) == 0) {
            continue;
          } else if (pointList[i].slopeTo(pointList[j]) !=  pointList[i].slopeTo(pointList[k])) {
            continue;
          }
          for (int t = k + 1; t < pointList.length; t++) {
            if (pointList[i].compareTo(pointList[t]) == 0 || pointList[j].compareTo(pointList[t]) == 0 || pointList[k].compareTo(pointList[t]) == 0) {
              continue;
            } else if (pointList[i].slopeTo(pointList[k]) ==  pointList[i].slopeTo(pointList[t])) {
              StdOut.println(pointList[i].toString() + " -> " + pointList[j].toString() + " -> " + pointList[k].toString() + " -> " + pointList[t].toString());
            }
          }
        }
      }
    }
  }
}
