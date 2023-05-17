package Сourse_base;

public class EmployeeService {

    public String formatStr(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }

    public String checkInputErrors(String str) {
        if (str != null || str.length() != 0) {
            str = str.replaceAll("[^\\а-яa-zA-zА-ЯЁё]", "");
            formatStr(str);
        }
        return str;
    }

}
