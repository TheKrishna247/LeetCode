class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens); // sort tokens
        int i = 0, j = tokens.length - 1;
        int score = 0, maxScore = 0;

        while (i <= j) {
            if (power >= tokens[i]) {
                power -= tokens[i];
                score++;
                i++;
                maxScore = Math.max(maxScore, score);
            } else if (score > 0) {
                power += tokens[j];
                score--;
                j--;
            } else {
                break;
            }
        }
        return maxScore;
    }
}        

// int score = 0 ;
//         for(int i = 0 ; i<tokens.length ; i++){
//             if(power>= tokens[i]){
//                 power -= tokens[i];
//                 score++;
//             }
//             else if(score>=1){
//                 power += tokens[i];
//                 score--;
//             }
//         }
//         return score;
//     }
// }