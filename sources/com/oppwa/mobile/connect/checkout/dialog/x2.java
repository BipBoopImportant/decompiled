package com.oppwa.mobile.connect.checkout.dialog;

import java.util.Comparator;
import java.util.Locale;

public final /* synthetic */ class x2 implements Comparator {
    public final int compare(Object obj, Object obj2) {
        return ((Locale) obj).getDisplayCountry().compareTo(((Locale) obj2).getDisplayCountry());
    }
}
