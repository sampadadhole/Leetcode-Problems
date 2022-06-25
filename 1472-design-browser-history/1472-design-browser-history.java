class BrowserHistory {

    HashMap<Integer, String> history = new HashMap<Integer, String>();
    int step;
    String url;
    int currentpage;
    public BrowserHistory(String homepage) {
        history = new HashMap();
        history.put(history.size()+1, homepage);
        currentpage = history.size();
    }
    
    public void visit(String url) {
        int prevSize = history.size();
        for(int i = currentpage + 1; i <= prevSize; i += 1) {
            if(history.containsKey(i)) history.remove(i);
        }
        history.put(history.size() + 1, url);
        currentpage = history.size();
        
    }
    
    public String back(int steps) {
       currentpage = currentpage - steps < 1 ? 1 : currentpage - steps;
        return history.get(currentpage);
    }
    
    public String forward(int steps) {
        currentpage = steps + currentpage > history.size() ? history.size() : currentpage + steps;
        return history.get(currentpage);
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */