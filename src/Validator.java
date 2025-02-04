public class Validator {

    public static boolean isValidNumber(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("잘못된 숫자 입력입니다. 다시 시도해주세요.");
            return false;
        }
    }

    public static boolean isValidString(String input) {
        if (input == null || input.trim().isEmpty()) {
            System.out.println("입력값이 비어있습니다. 다시 입력해주세요.");
            return false;
        }
        return true;
    }

    // 음료, 스프, 샐러드 이름 입력 유효성 검사
    public static boolean isValidInput(String input) {
        return !input.trim().isEmpty();
    }
    
}
