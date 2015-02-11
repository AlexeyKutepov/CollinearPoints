# CollinearPoints

Submission
Submission time	Wed-11-Feb 01:24:54
Raw Score	100.00 / 100.00
Feedback	See the Assessment Guide for information on how to read this report.
Assessment Summary
Compilation:  PASSED
Style:        PASSED
Findbugs:     No potential bugs found.
API:          PASSED

Correctness:  36/36 tests passed
Memory:       1/1 tests passed
Timing:       17/17 tests passed

Aggregate score: 100.00% [Correctness: 65%, Memory: 10%, Timing: 25%, Style: 0%]
Assessment Details
The following files were submitted:
----------------------------------
total 16K
-rw-r--r-- 1 1.6K Feb 11 09:18 Brute.java
-rw-r--r-- 1 2.4K Feb 11 09:18 Fast.java
-rw-r--r-- 1 1.9K Feb 11 09:18 Point.java
-rw-r--r-- 1 2.3K Feb 11 09:18 studentSubmission.zip


******************************************************************************
*  compiling
******************************************************************************


% javac Point.java
*-----------------------------------------------------------
================================================================

% javac Brute.java
*-----------------------------------------------------------
================================================================

% javac Fast.java
*-----------------------------------------------------------
================================================================



% checkstyle *.java
*-----------------------------------------------------------
================================================================


Testing the APIs of your programs.
*-----------------------------------------------------------
Point:

Brute:

Fast:

================================================================


******************************************************************************
*  correctness
******************************************************************************

Testing methods in Point
*-----------------------------------------------------------
Running 3 total tests.

Test 1: p.slopeTo(q)
  *  positive infinite slope, where p and q have coordinates in [0, 500)
  *  positive infinite slope, where p and q have coordinates in [0, 32768)
  *  negative infinite slope, where p and q have coordinates in [0, 500)
  *  negative infinite slope, where p and q have coordinates in [0, 32768)
  *  positive zero     slope, where p and q have coordinates in [0, 500)
  *  positive zero     slope, where p and q have coordinates in [0, 32768)
  *  symmetric  for random points p and q with coordinates in [0, 500)
  *  symmetric  for random points p and q with coordinates in [0, 32768)
  *  transitive for random points p, q, and r with coordinates in [0, 500)
  *  transitive for random points p, q, and r with coordinates in [0, 32768)
  *  slopeTo(), where p and q have coordinates in [0, 500)
  *  slopeTo(), where p and q have coordinates in [0, 32768)
  *  slopeTo(), where p and q have coordinates in [0, 10)
  *  throw a java.lang.NullPointerException if argument is null
==> passed

Test 2: p.compareTo(q)
  *  reflexive, where p and q have coordinates in [0, 500)
  *  reflexive, where p and q have coordinates in [0, 32768)
  *  antisymmetric, where p and q have coordinates in [0, 500)
  *  antisymmetric, where p and q have coordinates in [0, 32768)
  *  transitive, where p, q, and r have coordinates in [0, 500)
  *  transitive, where p, q, and r have coordinates in [0, 32768)
  *  sign of compareTo(), where p and q have coordinates in [0, 500)
  *  sign of compareTo(), where p and q have coordinates in [0, 32768)
  *  sign of compareTo(), where p and q have coordinates in [0, 10)
  *  throw java.lang.NullPointerException exception if argument is null
==> passed

Test 3: p.SLOPE_ORDER.compare(q, r)
  *  reflexive, where p and q have coordinates in [0, 500)
  *  reflexive, where p and q have coordinates in [0, 32768)
  *  antisymmetric, where p, q, and r have coordinates in [0, 500)
  *  antisymmetric, where p, q, and r have coordinates in [0, 32768)
  *  transitive, where p, q, r, and s have coordinates in [0, 500)
  *  transitive, where p, q, r, and s have coordinates in [0, 32768)
  *  sign of compare(), where p, q, and r have coordinates in [0, 500)
  *  sign of compare(), where p, q, and r have coordinates in [0, 32768)
  *  sign of compare(), where p, q, and r have coordinates in [0, 10)
  *  throw java.lang.NullPointerException if either argument is null
==> passed


Total: 3/3 tests passed!

================================================================

******************************************************************************
*  correctness (substituting reference Point.java)
******************************************************************************

Testing methods in Brute
*-----------------------------------------------------------
Running 15 total tests.

Test 0: Run on a small input file; show standard output; compare
standard output to the reference solution

  *  calling Brute.main("input8.txt")
     [standard output]
     (10000, 0) -> (7000, 3000) -> (3000, 7000) -> (0, 10000)
     (3000, 4000) -> (6000, 7000) -> (14000, 15000) -> (20000, 21000)

  *  calling Brute.main("input8.txt") a second time
     [standard output]
     (10000, 0) -> (7000, 3000) -> (3000, 7000) -> (0, 10000)
     (3000, 4000) -> (6000, 7000) -> (14000, 15000) -> (20000, 21000)

==> passed

Test 1a (stdout): Points from a file with at most 4 on any line segment
  *  input8.txt
  *  equidistant.txt
  *  input40.txt
  *  input48.txt
==> passed

Test 1b (stddraw): Points from a file with at most 4 on any line segment
  *  input8.txt
  *  equidistant.txt
  *  input40.txt
  *  input48.txt
==> passed

Test 2: Points from a file with horizontal line segments
  *  horizontal5.txt
  *  horizontal25.txt
==> passed

Test 3: Points from a file with vertical line segments
  *  vertical5.txt
  *  vertical25.txt
==> passed

Test 4a (stdout):Points from a file with no line segments
  *  random23.txt
  *  random38.txt
==> passed

Test 4b (stddraw): Points from a file with no line segments
  *  random23.txt
  *  random38.txt
==> passed

Test 5 (stddraw): Points from a file with 5 or more on any line segment
  *  input6.txt
  *  input9.txt
  *  input10.txt
  *  input20.txt
==> passed

Test 6a (stdout): Points from a file with fewer than 4 points
  *  input1.txt
  *  input2.txt
  *  input3.txt
==> passed

Test 6b (stddraw): Points from a file with fewer than 4 points
  *  input1.txt
  *  input2.txt
  *  input3.txt
==> passed

Test 7 (stdraw): Check that each point is drawn exactly once
  *  equidistant.txt
  *  input40.txt
  *  input48.txt
==> passed

Test 8 (stdout): Depends upon compareTo() or compare() returning { -1, +1, 0 }
  *  equidistant.txt
  *  input40.txt
  *  input48.txt
==> passed

Test 9 (stddraw): N random 4-point line segments
  *   1 random 4-point line segments (not vertical or horizontal)
  *   5 random 4-point line segments (not vertical or horizontal)
  *  10 random 4-point line segments (not vertical or horizontal)
  *  15 random 4-point line segments (not vertical or horizontal)
==> passed

Test 10 (stddraw): Random distinct points in a given range
  *   5 random points in [0..10) x [0..10)
  *  10 random points in [0..10) x [0..10)
  *  25 random points in [0..10) x [0..10)
==> passed

Test 11 (stddraw): Points distributed across grids of a given size
  *   9 random points in [0..3) x [0..3)
  *  16 random points in [0..4) x [0..4)
  *  25 random points in [0..5) x [0..5)
  *  36 random points in [0..6) x [0..6)
  *  49 random points in [0..7) x [0..7)
  *  20 random points in [0..5) x [0..4)
  *  24 random points in [0..6) x [0..4)
  *  40 random points in [0..10) x [0..4)
==> passed


Total: 15/15 tests passed!

================================================================

Testing methods in Fast
*-----------------------------------------------------------
Running 18 total tests.

Test 0: Run on a small input file; show standard output; compare
        standard output to the reference solution

  *  calling Fast.main("input6.txt")
     [standard output]
     (14000, 10000) -> (18000, 10000) -> (19000, 10000) -> (21000, 10000) -> (32000, 10000)

  *  calling Fast.main("input6.txt") a second time
     [standard output]
     (14000, 10000) -> (18000, 10000) -> (19000, 10000) -> (21000, 10000) -> (32000, 10000)

  *  calling Fast.main("input8.txt")
     [standard output]
     (10000, 0) -> (7000, 3000) -> (3000, 7000) -> (0, 10000)
     (3000, 4000) -> (6000, 7000) -> (14000, 15000) -> (20000, 21000)

  *  calling Fast.main("input8.txt") a second time
     [standard output]
     (10000, 0) -> (7000, 3000) -> (3000, 7000) -> (0, 10000)
     (3000, 4000) -> (6000, 7000) -> (14000, 15000) -> (20000, 21000)

==> passed

Test 1a (stdout): Points from a file with at most 4 on any line segment
  *  input8.txt
  *  equidistant.txt
  *  input40.txt
  *  input48.txt
  *  input299.txt
==> passed

Test 1b (stddraw): Points from a file with at most 4 on any line segment
  *  input8.txt
  *  equidistant.txt
  *  input40.txt
  *  input48.txt
  *  input299.txt
==> passed

Test 2a (stdout): Points from a file with horizontal line segments
  *  horizontal5.txt
  *  horizontal25.txt
  *  horizontal50.txt
  *  horizontal75.txt
  *  horizontal100.txt
==> passed

Test 2b (stddraw): Points from a file with horizontal line segments
  *  horizontal5.txt
  *  horizontal25.txt
  *  horizontal50.txt
  *  horizontal75.txt
  *  horizontal100.txt
==> passed

Test 3a (stdout): Points from a file with vertical line segments
  *  vertical5.txt
  *  vertical25.txt
  *  vertical50.txt
  *  vertical75.txt
  *  vertical100.txt
==> passed

Test 3b (stddraw): Points from a file with vertical line segments
  *  vertical5.txt
  *  vertical25.txt
  *  vertical50.txt
  *  vertical75.txt
  *  vertical100.txt
==> passed

Test 4a (stdout): Points from a file with no line segments
  *  random23.txt
  *  random38.txt
  *  random91.txt
  *  random152.txt
==> passed

Test 4b (stddraw): Points from a file with no line segments
  *  random23.txt
  *  random38.txt
  *  random91.txt
  *  random152.txt
==> passed

Test 5a (stdout): Points from a file with 5 or more on some line segments
  *  input6.txt
  *  input9.txt
  *  input10.txt
  *  input20.txt
  *  input50.txt
  *  input80.txt
  *  input300.txt
  *  kw1260.txt
  *  rs1423.txt
  *  inarow.txt
==> passed

Test 5b (stddraw): Points from a file with 5 or more on some line segments
  *  input6.txt
  *  input9.txt
  *  input10.txt
  *  input20.txt
  *  input50.txt
  *  input80.txt
  *  input300.txt
  *  kw1260.txt
  *  rs1423.txt
  *  inarow.txt
==> passed

Test 6a (stdout): Points from a file with fewer than 4 points
  *  input1.txt
  *  input2.txt
  *  input3.txt
==> passed

Test 6b (stddraw): Points from a file with fewer than 4 points
  *  input1.txt
  *  input2.txt
  *  input3.txt
==> passed

Test 7 (stdraw): Check that each point is drawn exactly once
  *  equidistant.txt
  *  input40.txt
  *  input48.txt
==> passed

Test 8 (stdout): Depends upon compareTo() or compare() returning { -1, +1, or 0 }.
  *  equidistant.txt
  *  input40.txt
  *  input48.txt
  *  input299.txt
==> passed

Test 9 (stddraw): N random 4-point line segments
  *    1 random 4-point line segments (not vertical or horizontal)
  *    5 random 4-point line segments (not vertical or horizontal)
  *   25 random 4-point line segments (not vertical or horizontal)
  *   50 random 4-point line segments (not vertical or horizontal)
  *  100 random 4-point line segments (not vertical or horizontal)
==> passed

Test 10 (stddraw): Random distinct points in a given range
  *    5 random points in [0..10) x [0..10)
  *   10 random points in [0..10) x [0..10)
  *   50 random points in [0..10) x [0..10)
  *   90 random points in [0..10) x [0..10)
  *  200 random points in [0..50) x [0..50)
==> passed

Test 11 (stddraw): N*M points on an N x M grid
  *    9 random points in [0..3) x [0..3)
  *   16 random points in [0..4) x [0..4)
  *   25 random points in [0..5) x [0..5)
  *  100 random points in [0..10) x [0..10)
  *  400 random points in [0..20) x [0..20)
  *   20 random points in [0..5) x [0..4)
  *   24 random points in [0..6) x [0..4)
  *   40 random points in [0..10) x [0..4)
  *   60 random points in [0..15) x [0..4)
  *  100 random points in [0..25) x [0..4)
==> passed


Total: 18/18 tests passed!

================================================================

******************************************************************************
*  memory
******************************************************************************

Computing memory of Point
*-----------------------------------------------------------
Running 1 total tests.

Student memory = 56 bytes (passed)

Total: 1/1 tests passed!

================================================================



******************************************************************************
*  timing
******************************************************************************

Timing Brute
*-----------------------------------------------------------
Running 4 total tests.

Maximum time allowed per test = 10 seconds

Test 1a-1e: Find collinear points among N random distinct points

                                                      slopeTo()
             N    time     slopeTo()   compare()  + 2*compare()        compareTo()
-----------------------------------------------------------------------------------------------
=> passed    16   0.10        1120           0           1120                 1286         
=> passed    32   0.01        9920           0           9920                10538         
=> passed    64   0.03       83328           0          83328                85651         
=> passed   128   0.03      682752           0         682752               691620         
==> 4/4 tests passed

Total: 4/4 tests passed!

================================================================



Timing Fast
*-----------------------------------------------------------
Running 13 total tests.

Maximum time allowed per test = 10 seconds


Test 1a-1g: Find collinear points among N random distinct points

                                                      slopeTo()
             N    time     slopeTo()   compare()  + 2*compare()        compareTo()
-----------------------------------------------------------------------------------------------
=> passed   128   0.16           0      104542         209084                    0         
=> passed   256   0.12           0      478145         956290                    0         
=> passed   512   0.33           0     2141471        4282942                    0         
=> passed  1024   0.46           0     9523902       19047804                    0         

lg ratio(slopeTo() + 2*compare()) = lg (19047804 / 4282942) = 2.15
=> passed

==> 5/5 tests passed


Test 2a-2e: Find collinear points among the 4N points on an N x 4 grid

                                                      slopeTo()
             N    time     slopeTo()   compare()  + 2*compare()        compareTo()
-----------------------------------------------------------------------------------------------
=> passed   128   0.41           0     1372430        2744860               189520         
=> passed   256   0.47           0     5451686       10903372               729906         
=> passed   512   1.76           0    21727883       43455766              2828539         

lg ratio(slopeTo() + 2*compare()) = lg (43455766 / 10903372) = 1.99
=> passed

==> 4/4 tests passed


Test 3a-3e: Find collinear points among the 8N points on an N x 8 grid

                                                      slopeTo()
             N    time     slopeTo()   compare()  + 2*compare()        compareTo()
-----------------------------------------------------------------------------------------------
=> passed    64   0.11           0     1651039        3302078               201395         
=> passed   128   0.48           0     7065634       14131268               788151         
=> passed   256   2.11           0    29978527       59957054              3125918         

lg ratio(slopeTo() + 2*compare()) = lg (59957054 / 14131268) = 2.09
=> passed

==> 4/4 tests passed

Total: 13/13 tests passed!

================================================================


