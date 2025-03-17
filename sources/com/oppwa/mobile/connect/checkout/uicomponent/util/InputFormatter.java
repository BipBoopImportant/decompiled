package com.oppwa.mobile.connect.checkout.uicomponent.util;

import android.text.Editable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class InputFormatter {
    public static final String CARD_EXPIRY_DATE_MASK = "## / ####";
    public static final String IBAN_MASK = "#### #### #### #### #### #### #### ###";
    public static final String PHONE_COUNTRY_CODE_MASK = "+#";
    public static final String PHONE_NUMBER_MASK = "###-###-####";

    /* renamed from: c  reason: collision with root package name */
    private static final Set<Character> f121542c = new HashSet(Arrays.asList(new Character[]{' ', '/', '+', '-'}));

    /* renamed from: a  reason: collision with root package name */
    private final String f121543a;

    /* renamed from: b  reason: collision with root package name */
    private String f121544b = "";

    public InputFormatter(String str) {
        this.f121543a = str;
    }

    private void a(Editable editable) {
        int i10 = 0;
        while (i10 < editable.length()) {
            if (f121542c.contains(Character.valueOf(editable.charAt(i10)))) {
                editable.delete(i10, i10 + 1);
                i10--;
            }
            i10++;
        }
    }

    public void applyMask(Editable editable) {
        char charAt;
        a(editable);
        this.f121544b = editable.toString();
        int i10 = 0;
        while (i10 < editable.length()) {
            if (i10 < this.f121543a.length() && (charAt = this.f121543a.charAt(i10)) != '#') {
                while (charAt != '#' && charAt != editable.charAt(i10)) {
                    editable.insert(i10, String.valueOf(charAt));
                    i10++;
                    if (i10 >= this.f121543a.length()) {
                        break;
                    }
                    charAt = this.f121543a.charAt(i10);
                }
            }
            i10++;
        }
    }

    public String getUnmaskedInput() {
        return this.f121544b;
    }
}
