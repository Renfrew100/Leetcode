class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        // **** initialization ****        
    int area1   = (ax2 - ax1) * (ay2 - ay1);
    int area2   = (bx2 - bx1) * (by2 - by1);
     
    // **** rectangles do not overlap ****
    if ((ay1 >= by2 || by1 >= ay2) ||
        (ax2 <= bx1 || bx2 <= ax1))
        return area1 + area2;
 
    // **** rectangles overlap ****
    return area1 + area2 - 
                Math.max(Math.min(ax2, bx2) - Math.max(ax1, bx1), 0) *
                Math.max(Math.min(ay2, by2) - Math.max(ay1, by1), 0);
    }
}