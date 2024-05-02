class Solution:
    def findMaxK(self, nums: List[int]) -> int:
        ans=-1
        for i in nums:
            if (-i in nums):
                if i>ans:
                    ans=i
        return ans
        