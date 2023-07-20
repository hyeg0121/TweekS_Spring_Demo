package tweeks.tweeksspring.controller;

import org.springframework.stereotype.Controller;

public class MemberForm {
    private static String name;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        MemberForm.name = name;
    }
}
