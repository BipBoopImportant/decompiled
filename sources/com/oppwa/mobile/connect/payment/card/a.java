package com.oppwa.mobile.connect.payment.card;

import java.lang.ref.SoftReference;
import java.util.regex.Pattern;

class a {

    /* renamed from: a  reason: collision with root package name */
    private static SoftReference<Pattern> f121859a;

    /* renamed from: b  reason: collision with root package name */
    private static SoftReference<Pattern> f121860b;

    /* renamed from: c  reason: collision with root package name */
    private static SoftReference<Pattern> f121861c;

    /* renamed from: d  reason: collision with root package name */
    private static SoftReference<Pattern> f121862d;

    /* renamed from: e  reason: collision with root package name */
    private static SoftReference<Pattern> f121863e;

    /* renamed from: f  reason: collision with root package name */
    private static SoftReference<Pattern> f121864f;

    /* renamed from: g  reason: collision with root package name */
    private static SoftReference<Pattern> f121865g;

    static Pattern a() {
        if (!a(f121863e)) {
            f121863e = new SoftReference<>(Pattern.compile("[0-9]{3,4}"));
        }
        return f121863e.get();
    }

    static Pattern b() {
        if (!a(f121861c)) {
            f121861c = new SoftReference<>(Pattern.compile("^1[0-2]$|^0[1-9]$"));
        }
        return f121861c.get();
    }

    static Pattern c() {
        if (!a(f121862d)) {
            f121862d = new SoftReference<>(Pattern.compile("20[0-9]{2}"));
        }
        return f121862d.get();
    }

    static Pattern d() {
        if (!a(f121859a)) {
            f121859a = new SoftReference<>(Pattern.compile(".{3,128}"));
        }
        return f121859a.get();
    }

    static Pattern e() {
        if (!a(f121864f)) {
            f121864f = new SoftReference<>(Pattern.compile("^[0-9].*"));
        }
        return f121864f.get();
    }

    static Pattern f() {
        if (!a(f121860b)) {
            f121860b = new SoftReference<>(Pattern.compile("[0-9]{10,19}"));
        }
        return f121860b.get();
    }

    static Pattern g() {
        if (!a(f121865g)) {
            f121865g = new SoftReference<>(Pattern.compile("[0-9]{1,5}"));
        }
        return f121865g.get();
    }

    private static boolean a(SoftReference<Pattern> softReference) {
        return (softReference == null || softReference.get() == null) ? false : true;
    }
}
