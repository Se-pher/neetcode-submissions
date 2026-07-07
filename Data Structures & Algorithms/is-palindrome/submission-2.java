class Solution {
    public boolean isPalindrome(String s) {
        // Khởi tạo "hai con trỏ" (chỉ là 2 biến int lưu index)
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            // Hố logic 1: Vòng lặp trượt lố đà
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++; 
            }
            
            // Hố logic 2: Quên trượt con trỏ phải
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // Hố logic 3: So sánh thô mà quên chuẩn hóa
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false; // Lộ tẩy, không đối xứng!
            }

            // Xử lý xong 1 cặp, dịch cả 2 ngón tay vào giữa
            left++;
            right--;
        }

        return true; // Đi qua hết mà không bị chặn -> Là Anagram
    }
}
