class Solution {
    public boolean isValid(String word) {
        if (word.length() < 3) return false;

        String vowels = "aeiou";
        word = word.toLowerCase();

        boolean hasVowel = false;
        boolean hasConsonant = false;

        for (int i = 0; i < word.length(); i++) {
            char curr = word.charAt(i);

            if (!Character.isLetterOrDigit(curr)) return false;

            if (Character.isLetter(curr)) {
                if (vowels.indexOf(curr) != -1) {
                    hasVowel = true;
                } else {
                    hasConsonant = true;
                }
            }
        }

        return hasVowel && hasConsonant;
    }
}
