class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int s=0,c=capacity;
        for(int i=0;i<plants.length;i++)
        {
            if(capacity>=plants[i])
            {
                capacity=capacity-plants[i];
                s++;
            }
            else
            {
                capacity=c-plants[i];
                s=s+i*2+1;
            }
        }
        return s;
    }
}