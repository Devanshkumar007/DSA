class Solution {
public:
    int countPairs(vector<int>& nums, int k) {
        int count = 0;
        unordered_map<int, vector<int>> mp;

        for (int i = 0; i < nums.size(); i++) {
            if (mp.find(nums[i]) != mp.end()) {
                vector<int>& curr = mp[nums[i]];
                for (int j = 0; j < curr.size(); j++) {
                    if ((curr[j] * i) % k == 0) {
                        count++;
                    }
                }
                mp[nums[i]].push_back(i);
            } else {
                mp[nums[i]] = {i};
            }
        }

        return count;
    }
};