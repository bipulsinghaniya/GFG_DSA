class Solution {
  public:
    vector<int> nextLargerElement(vector<int>& arr) {
        vector<int>aa;
        stack<int>s1;
        int n = arr.size();
        
        for(int i = n-1; i >= 0; i--){
            
            while(!(s1.empty()) &&arr[i] >= s1.top()){
                s1.pop();
            }
                if(s1.empty()){
                    s1.push(arr[i]);
                    aa.push_back(-1);
                }else{
                    aa.push_back(s1.top());
                    s1.push(arr[i]);
                }
                
        }
        
        reverse(aa.begin(),aa.end());
        return aa;
        
        
    }
};