import copy
class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
                    
        res = []
        sl = m if m<n else n
        j = 0
        i = 0
        if m==0:
            k=0
            for i in nums2:
                nums1[k] = i
                k += 1
            return
        elif n==0:
            return
        while i<m and j<n:
            if nums1[i] < nums2[j]:
                res.append(nums1[i])
                i += 1
            else:
                res.append(nums2[j])
                j += 1
            if i ==m or j==n:
                break
        while j <n:
            res.append(nums2[j])
            j+=1
        while i<m:
            res.append(nums1[i])
            i+= 1
        
        #print("==>",res)
        k=0
        for i in res:
            nums1[k] = i
            k += 1
            
         
