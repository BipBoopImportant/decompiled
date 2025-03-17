package com.google.android.material.datepicker;

import Ea.C9076j;
import android.content.Context;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

class j {
    static String a(long j10) {
        return b(j10, (SimpleDateFormat) null);
    }

    static String b(long j10, SimpleDateFormat simpleDateFormat) {
        return simpleDateFormat != null ? simpleDateFormat.format(new Date(j10)) : o(j10) ? d(j10) : k(j10);
    }

    static String c(Context context, long j10, boolean z10, boolean z11, boolean z12) {
        String h10 = h(j10);
        if (z10) {
            h10 = String.format(context.getString(C9076j.f59551H), new Object[]{h10});
        }
        return z11 ? String.format(context.getString(C9076j.f59547D), new Object[]{h10}) : z12 ? String.format(context.getString(C9076j.f59580w), new Object[]{h10}) : h10;
    }

    static String d(long j10) {
        return e(j10, Locale.getDefault());
    }

    static String e(long j10, Locale locale) {
        return y.b(locale).format(new Date(j10));
    }

    static String f(long j10) {
        return g(j10, Locale.getDefault());
    }

    static String g(long j10, Locale locale) {
        return y.h(locale).format(new Date(j10));
    }

    static String h(long j10) {
        return o(j10) ? f(j10) : m(j10);
    }

    static String i(Context context, int i10) {
        return y.k().get(1) == i10 ? String.format(context.getString(C9076j.f59544A), new Object[]{Integer.valueOf(i10)}) : String.format(context.getString(C9076j.f59545B), new Object[]{Integer.valueOf(i10)});
    }

    static String j(long j10) {
        return y.p(Locale.getDefault()).format(new Date(j10));
    }

    static String k(long j10) {
        return l(j10, Locale.getDefault());
    }

    static String l(long j10, Locale locale) {
        return y.o(locale).format(new Date(j10));
    }

    static String m(long j10) {
        return n(j10, Locale.getDefault());
    }

    static String n(long j10, Locale locale) {
        return y.q(locale).format(new Date(j10));
    }

    private static boolean o(long j10) {
        Calendar k10 = y.k();
        Calendar m10 = y.m();
        m10.setTimeInMillis(j10);
        return k10.get(1) == m10.get(1);
    }
}
