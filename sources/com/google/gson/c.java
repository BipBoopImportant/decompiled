package com.google.gson;

import java.lang.reflect.Field;
import java.util.Locale;

public enum c implements d {
    IDENTITY {
        public String a(Field field) {
            return field.getName();
        }
    },
    UPPER_CAMEL_CASE {
        public String a(Field field) {
            return c.j(field.getName());
        }
    },
    UPPER_CAMEL_CASE_WITH_SPACES {
        public String a(Field field) {
            return c.j(c.b(field.getName(), ' '));
        }
    },
    UPPER_CASE_WITH_UNDERSCORES {
        public String a(Field field) {
            return c.b(field.getName(), '_').toUpperCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_UNDERSCORES {
        public String a(Field field) {
            return c.b(field.getName(), '_').toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DASHES {
        public String a(Field field) {
            return c.b(field.getName(), '-').toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DOTS {
        public String a(Field field) {
            return c.b(field.getName(), '.').toLowerCase(Locale.ENGLISH);
        }
    };

    static String b(String str, char c10) {
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (Character.isUpperCase(charAt) && sb2.length() != 0) {
                sb2.append(c10);
            }
            sb2.append(charAt);
        }
        return sb2.toString();
    }

    static String j(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            char charAt = str.charAt(i10);
            if (!Character.isLetter(charAt)) {
                i10++;
            } else if (Character.isUpperCase(charAt)) {
                return str;
            } else {
                char upperCase = Character.toUpperCase(charAt);
                if (i10 == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i10) + upperCase + str.substring(i10 + 1);
            }
        }
        return str;
    }
}
