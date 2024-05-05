class Solution:
    def isValid(self, word: str) -> bool:
        c=d=uc=lc=v=con=0
        if len(word)<3:
            return False
        for i in word:
            if i.isalpha():
                if i.isupper():
                    uc+=1
                else:
                    lc+=1
                if i in "aeiouAEIOU":
                    v+=1
                else:
                    con+=1
            elif i.isdigit():
                d+=1
            else:
                return False
        if((d>0 or uc>0 or lc>0) and v>0 and con>0):
            return True
        return False
                    
                