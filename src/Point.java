import java.util.Comparator;

public class Point implements Comparable<Point> {

  // compare points by slope
  public final Comparator<Point> SLOPE_ORDER = null;

  private final int x;                              // x coordinate
  private final int y;                              // y coordinate

  // create the point (x, y)
  public Point(int x, int y) {
        /* DO NOT MODIFY */
    this.x = x;
    this.y = y;
  }

  // plot this point to standard drawing
  public void draw() {
        /* DO NOT MODIFY */
    StdDraw.point(x, y);
  }

  // draw line between this point and that point to standard drawing
  public void drawTo(Point that) {
        /* DO NOT MODIFY */
    StdDraw.line(this.x, this.y, that.x, that.y);
  }

  // slope between this point and that point
  public double slopeTo(Point that) {

    return 0;
  }

  // is this point lexicographically smaller than that one?
  // comparing y-coordinates and breaking ties by x-coordinates
  public int compareTo(Point that) {

    return 0;
  }

  // return string representation of this point
  public String toString() {
        /* DO NOT MODIFY */
    return "(" + x + ", " + y + ")";
  }

  // unit test
  public static void main(String[] args) {

  }
}