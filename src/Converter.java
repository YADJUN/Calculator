public class Converter {
        static String[] Roman = new String[]{"0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
                "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX",
                "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX",
                "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L",
                "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII",
                "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII",
                "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII",
                "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV",
                "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
        public static boolean isRoman (String operation) {
            for ( int i = 0; i < Roman.length;i++) {
                if (operation.equals(Roman[i])){
                    return true;
                }
            }
            return false;
        }
        public static int romanToArab(String roman) {
            for (int i = 0;i < Roman.length;i++){
                if (roman.equals(Roman[i])){
                    return i;
                }
            }
            return -1;
        }
        public static String arabToRoman(int index) {
            if (index <= 0) {
                throw new RuntimeException("Roman numbers cannot be negative or equal to zero");
            }
            return Roman[index];
        }
    }