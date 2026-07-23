class Solution {
    public int compress(char[] chars) { // gonna do this via 2 pointer 
        int write = 0; // checking where we update
        int read = 0;  // checking where we read
        
        while (read < chars.length) {
            char currChar = chars[read];   // taking the first char(for default starting obv)
            int count = 0;
            while (read < chars.length && chars[read] == currChar) { // counting all the same characters
                read++;
                count++;
            }
            chars[write] = currChar;// writing the character
            write++; // next index to add the count
            if (count > 1) { // only write when more than 1 character
                String countStr = String.valueOf(count);
                for (int i = 0; i < countStr.length(); i++){    // for the third case it will only take 1 for input 
                    chars[write] = countStr.charAt(i);          // and not the 2 of the 12 "b", hence a loop used
                    write++;
                }
            }
        }
        return write;
    }
}