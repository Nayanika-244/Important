import java.io.*;
import java.util.*;


public class Skyline {
    public List<int[]> getSkyline(int[][] buildings) {
        
         //1. find the important points and use merge sort like divide and conquer way to sort them into one unified skyline
         //2. remove redundant points
        List<int[]> result = new ArrayList<int[]>();

         if(buildings.length == 1){
                 
             int[] strip = buildings[0];
             int[] newstrip = {strip[0],strip[2]};
             int[] newstrip2 = {strip[1],0};
             result.add(newstrip);
             result.add(newstrip2);
             return result;
         
         }
        result = getSkyline(buildings,0,buildings.length-1);
        return result;
        
    }

    public List<int[]> getSkyline(int[][] buildings,int low,int high) 
    {

        List<int[]> resultant = new ArrayList<int[]>();
        if(low>high)
            return resultant;

        else if(low==high)
        {
            //implies there is only one point in the list
         
            

            int x = buildings[low][0];
            int y = buildings[low][1];
            int h = buildings[low][2];

            int[] p1 = {x,h};
            int[] p2 = {y,0};

            resultant.add(p1);
            resultant.add(p2);

            return resultant;


        }

        int mid = low+(high-low)/2;

        List<int[]> left = getSkyline(buildings,low,mid);
        List<int[]> right = getSkyline(buildings,mid+1,high);

        resultant = merge(left,right);
        return resultant;

    }
public List<int[]> merge(List<int[]> left,List<int[]> right)
{
    List<int[]> result = new ArrayList<int[]>();
    if(left.isEmpty())
    {
        int[] point = new int[2];
        for(int i=0;i<right.size();i++){
            point[0] = right.get(i)[0];
            point[1] = right.get(i)[2];

            result.add(point);
        }
    }
    else if(right.isEmpty())
    {
        int[] point = new int[2];
        for(int i=0;i<left.size();i++){
            point[0] = left.get(i)[0];
            point[1] = left.get(i)[2];

            result.add(point);
        }
        
    }

    int[] strip1 = left.get(0);
    int[] strip2 = right.get(0);

    int h1 = 0;
    int h2=0;
    int[] point = new int[2];
    if(strip1[0] < strip2[0])
    {
        
        point[0] = strip1[0];
        point[1] = strip1[2];

        if(h2>point[1])
            point[1] = h2;

        h1 = strip1[2];
        result.add(point);
        left.remove(0);
    }

    else if(strip2[0] < strip1[0])
    {
        
        point[0] = strip2[0];
        point[1] = strip2[2];

        if(h1>point[1])
            point[1] = h1;

        h2 = strip1[2];
        result.add(point);
        right.remove(0);
    }

    else
    {
        h1 = strip1[2];
        h2 = strip2[2];
        
        point[0] = strip2[0];
        point[1] = Math.max(strip2[2],strip1[2]);


        result.add(point);
        left.remove(0);
        right.remove(0);
    }

List<int[]> finalresult = removeRedundantPoints(result);

return finalresult;

}
//remove redundant points from the resultant list of points
List<int[]> removeRedundantPoints(List<int[]> result)
{
    boolean foundFlag = true;
    for(int i=0;i<result.size()-1;i++)
    {
        if(result.get(i)[1] == result.get(i+1)[1] && foundFlag)
            result.remove(i+1);
        else
            foundFlag = false;
    }
    return result;

}

public static void main(String[] args)

{
    Skyline sk = new Skyline();
    //int[][] buildings = new int[2][3];
    // buildings[0][0] = 1;
    // buildings[0][1] = 2;
    // buildings[0][2] = 3;
    // buildings[1][0] = 4;
    // buildings[1][1] = 5;
    // buildings[1][2] = 6;

    int[][] buildings = { {2,9,10}, {3,6,15}, {5,12,12}, {13,16,10}, {13,16,10}, {15,17,5}};
       
    List<int[]> result = sk.getSkyline(buildings);
}

}