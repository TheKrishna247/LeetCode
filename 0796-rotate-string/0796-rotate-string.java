class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) 
            return false;
        String ans = s + s;
        return ans.contains(goal);
    }
}

// char [] arr1 = s.toCharArray();
//         char [] arr2 = goal.toCharArray();
//         Arrays.sort(arr1);
//         Arrays.sort(arr2);
//         int i =0 , j=0;
//         boolean ans  = true;
//         if(arr1.length != arr2.length) return false;
//         while(i<arr1.length){
//             if(arr1[i] != arr2[i]){
//                 ans = false;
//                 break;
//             }
//             i++;
//         }
//         return ans;
//     }
// }