// Given an encoded string, return its decoded string.

// The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.

// You may assume that the input string is always valid; there are no extra white spaces, square brackets are well-formed, etc. Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there will not be input like 3a or 2[4].

class Solution {
    public String decodeString(String s) {
        Stack<Integer> intst = new Stack<>();
        Stack<String> charst = new Stack<>();
        
        StringBuilder temp = new StringBuilder();
        int k=0;
        for(int i=0;i<s.length();i++){
            
            if(Character.isDigit(s.charAt(i))){
                k = k*10 + s.charAt(i) - '0';
            }
            else if(s.charAt(i)=='['){
                charst.push(temp.toString());
                temp=new StringBuilder();
                intst.push(k);
                k=0;
            }
            else if(s.charAt(i)==']'){
                int l=intst.pop();
                StringBuilder ll = new StringBuilder(charst.pop());
                
                for(int p=0;p<l;p++){
                    ll.append(temp);
                }
                
                temp = ll;
            }
            else{
                temp = temp.append(s.charAt(i));
            }
            
            
        }
        return temp.toString();
    }
}
