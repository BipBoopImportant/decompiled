package com.google.android.material.datepicker;

import Ea.C9076j;
import android.annotation.TargetApi;
import android.content.res.Resources;
import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

class y {

    /* renamed from: a  reason: collision with root package name */
    static AtomicReference<x> f66669a = new AtomicReference<>();

    static long a(long j10) {
        Calendar m10 = m();
        m10.setTimeInMillis(j10);
        return e(m10).getTimeInMillis();
    }

    @TargetApi(24)
    static DateFormat b(Locale locale) {
        return c("MMMd", locale);
    }

    @TargetApi(24)
    private static DateFormat c(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(l());
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        return instanceForSkeleton;
    }

    static String d(String str) {
        return str.replaceAll("[^dMy/\\-.]", "").replaceAll("d{1,2}", "dd").replaceAll("M{1,2}", "MM").replaceAll("y{1,4}", "yyyy").replaceAll("\\.$", "").replaceAll("My", "M/y");
    }

    static Calendar e(Calendar calendar) {
        Calendar n10 = n(calendar);
        Calendar m10 = m();
        m10.set(n10.get(1), n10.get(2), n10.get(5));
        return m10;
    }

    static SimpleDateFormat f() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(d(((SimpleDateFormat) java.text.DateFormat.getDateInstance(3, Locale.getDefault())).toPattern()), Locale.getDefault());
        simpleDateFormat.setTimeZone(j());
        simpleDateFormat.setLenient(false);
        return simpleDateFormat;
    }

    static String g(Resources resources, SimpleDateFormat simpleDateFormat) {
        String pattern = simpleDateFormat.toPattern();
        String string = resources.getString(C9076j.f59550G);
        String string2 = resources.getString(C9076j.f59549F);
        String string3 = resources.getString(C9076j.f59548E);
        if (Locale.getDefault().getLanguage().equals(Locale.KOREAN.getLanguage())) {
            pattern = pattern.replaceAll("d+", "d").replaceAll("M+", "M").replaceAll("y+", "y");
        }
        return pattern.replace("d", string3).replace("M", string2).replace("y", string);
    }

    @TargetApi(24)
    static DateFormat h(Locale locale) {
        return c("MMMMEEEEd", locale);
    }

    static x i() {
        x xVar = f66669a.get();
        return xVar == null ? x.c() : xVar;
    }

    private static TimeZone j() {
        return TimeZone.getTimeZone("UTC");
    }

    static Calendar k() {
        Calendar a10 = i().a();
        a10.set(11, 0);
        a10.set(12, 0);
        a10.set(13, 0);
        a10.set(14, 0);
        a10.setTimeZone(j());
        return a10;
    }

    @TargetApi(24)
    private static android.icu.util.TimeZone l() {
        return android.icu.util.TimeZone.getTimeZone("UTC");
    }

    static Calendar m() {
        return n((Calendar) null);
    }

    static Calendar n(Calendar calendar) {
        Calendar instance = Calendar.getInstance(j());
        if (calendar == null) {
            instance.clear();
        } else {
            instance.setTimeInMillis(calendar.getTimeInMillis());
        }
        return instance;
    }

    @TargetApi(24)
    static DateFormat o(Locale locale) {
        return c("yMMMd", locale);
    }

    @TargetApi(24)
    static DateFormat p(Locale locale) {
        return c("yMMMM", locale);
    }

    @TargetApi(24)
    static DateFormat q(Locale locale) {
        return c("yMMMMEEEEd", locale);
    }
}
