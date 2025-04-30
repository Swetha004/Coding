class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int ch=0,c=0;
        while(ch<g.length && c<s.length){
            if(s[c] >= g[ch]){
                ch++;
            }
            c++;
        }
        return ch;
    }
}