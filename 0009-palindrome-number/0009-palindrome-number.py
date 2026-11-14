class Solution(object):
    def isPalindrome(self, x):
        num=x
        result=0
        while x>0:
            lastdigit=x%10
            result=(result*10)+lastdigit
            x=x//10
        if (num==result):
            return True
        else:
            return False
        