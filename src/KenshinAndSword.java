import java.io.*;

/**
 * Created by HARISH on 7/24/2015.
 */
class ReadSword {

    private long[] tree;
    private int maxsize;
    private int height;

    private  final int STARTINDEX = 0;
    private  final int ENDINDEX;
    private  final int ROOT = 0;

    public ReadSword(int size)
    {
        height = (int)(Math.ceil(Math.log(size) /  Math.log(2)));
        maxsize = 2 * (int) Math.pow(2, height) - 1;
        tree = new long[maxsize];
        ENDINDEX = size - 1;
    }

    private int leftchild(int pos)
    {
        return 2 * pos + 1;
    }

    private int rightchild(int pos)
    {
        return 2 * pos + 2;
    }

    private int mid(int start, int end)
    {
        return (start + (end - start) / 2);
    }

    private long getSumUtil(int startIndex, int endIndex, int queryStart, int queryEnd, int current)
    {
        if (queryStart <= startIndex && queryEnd >= endIndex )
        {
            return tree[current];
        }
        if (endIndex < queryStart || startIndex > queryEnd)
        {
            return 0;
        }
        int mid = mid(startIndex, endIndex);
        return  getSumUtil(startIndex, mid, queryStart, queryEnd, leftchild(current))
                + getSumUtil( mid + 1, endIndex, queryStart, queryEnd, rightchild(current));
    }

    public long getSum(int queryStart, int queryEnd)
    {
        if(queryStart < 0 || queryEnd > tree.length)
        {
            return -1;
        }
        return getSumUtil(STARTINDEX, ENDINDEX, queryStart, queryEnd, ROOT);
    }

    private long constructSegmentTreeUtil(long[] elements, int startIndex, int endIndex, int current)
    {
        if (startIndex == endIndex)
        {
            tree[current] = elements[startIndex];
            return tree[current];
        }
        int mid = mid(startIndex, endIndex);
        tree[current] = constructSegmentTreeUtil(elements, startIndex, mid, leftchild(current))
                + constructSegmentTreeUtil(elements, mid + 1, endIndex, rightchild(current));
        return tree[current];
    }

    public void constructSegmentTree(long[] elements)
    {
        constructSegmentTreeUtil(elements, STARTINDEX, ENDINDEX, ROOT);
    }

    private void updateTreeUtil(int startIndex, int endIndex, int updatePos, long update, int current)
    {
        if ( updatePos < startIndex || updatePos > endIndex)
        {
            return;
        }
        tree[current] = tree[current] + update;
        if (startIndex != endIndex)
        {
            int mid = mid(startIndex, endIndex);
            updateTreeUtil(startIndex, mid, updatePos, update, leftchild(current));
            updateTreeUtil(mid+1, endIndex, updatePos, update, rightchild(current));
        }
    }

    public void update(long update, int updatePos, long[] elements)
    {
        long updatediff = update - elements[updatePos]  ;
        elements[updatePos] = update;
        updateTreeUtil(STARTINDEX, ENDINDEX, updatePos, updatediff, ROOT);
    }

    public static void main(String[] args) {

    }
}
