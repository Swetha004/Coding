class MyCalendar {
    private ArrayList<Integer> l=new ArrayList<>();
    public MyCalendar() {
        
    }
    
    public boolean book(int start, int end) {
        for(int i=0;i<l.size();i+=2){
            int s=l.get(i);
            int e=l.get(i+1);
            if(Math.max(s,start)<Math.min(e,end)){
                return false;
            }
        }
        l.add(start);
        l.add(end);
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */