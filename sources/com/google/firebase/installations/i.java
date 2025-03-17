package com.google.firebase.installations;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import pc.d;
import rc.C10214a;
import rc.b;

public final class i {

    /* renamed from: b  reason: collision with root package name */
    public static final long f68293b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c  reason: collision with root package name */
    private static final Pattern f68294c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d  reason: collision with root package name */
    private static i f68295d;

    /* renamed from: a  reason: collision with root package name */
    private final C10214a f68296a;

    private i(C10214a aVar) {
        this.f68296a = aVar;
    }

    public static i c() {
        return d(b.b());
    }

    public static i d(C10214a aVar) {
        if (f68295d == null) {
            f68295d = new i(aVar);
        }
        return f68295d;
    }

    static boolean g(String str) {
        return f68294c.matcher(str).matches();
    }

    static boolean h(String str) {
        return str.contains(":");
    }

    public long a() {
        return this.f68296a.a();
    }

    public long b() {
        return TimeUnit.MILLISECONDS.toSeconds(a());
    }

    public long e() {
        return (long) (Math.random() * 1000.0d);
    }

    public boolean f(d dVar) {
        return TextUtils.isEmpty(dVar.b()) || dVar.h() + dVar.c() < b() + f68293b;
    }
}
