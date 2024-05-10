class Solution:
    def kthSmallestPrimeFraction(self, arr: List[int], k: int) -> List[int]:
        new=[]
        arr2=[]
        for i in range(len(arr)):
            for j in range(i+1,len(arr)):
                new.append(arr[i]/arr[j])
                arr2.append([arr[i],arr[j]])
        # print(new)
        # print(arr2)
        new.sort()
        ans=new[k-1]
        for i in arr2:
            if(i[0]/i[1]==ans):
                return i




                
        #         new.append([str(arr[i])+"/"+str(arr[j]),arr[i]/arr[j]])
        #         arr2.append(arr[i]/arr[j])
        # print (new)
        # arr2.sort()
        # ans=arr2[k-1]
        # for i in new:
        #     if i[1]==ans:
        #         return i[0]




        