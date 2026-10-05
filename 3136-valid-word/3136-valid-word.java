class Solution {
    public boolean isValid(String word) {
    int n=word.length();
    if(n<3){
        return false;
    } 
    boolean isVowel=false;
    boolean isConsonant=false;

    for(int i=0;i<n;i++){
        if(!Character.isLetterOrDigit(word.charAt(i))){
            return false;
        }
        char ch=Character.toLowerCase(word.charAt(i));
        if(Character.isLetter(word.charAt(i))){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                isVowel=true;
            } else{
            isConsonant=true;
        }
    }   
    }
    return isConsonant&&isVowel;
}
}