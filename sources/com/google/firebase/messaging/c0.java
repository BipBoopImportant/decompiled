package com.google.firebase.messaging;

import K9.C6619q;
import android.text.TextUtils;
import android.util.Log;
import java.util.regex.Pattern;

final class c0 {

    /* renamed from: d  reason: collision with root package name */
    private static final Pattern f68406d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a  reason: collision with root package name */
    private final String f68407a;

    /* renamed from: b  reason: collision with root package name */
    private final String f68408b;

    /* renamed from: c  reason: collision with root package name */
    private final String f68409c;

    private c0(String str, String str2) {
        this.f68407a = d(str2, str);
        this.f68408b = str;
        this.f68409c = str + "!" + str2;
    }

    static c0 a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("!", -1);
        if (split.length != 2) {
            return null;
        }
        return new c0(split[0], split[1]);
    }

    private static String d(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", new Object[]{str2}));
            str = str.substring(8);
        }
        if (str != null && f68406d.matcher(str).matches()) {
            return str;
        }
        throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", new Object[]{str, "[a-zA-Z0-9-_.~%]{1,900}"}));
    }

    public String b() {
        return this.f68408b;
    }

    public String c() {
        return this.f68407a;
    }

    public String e() {
        return this.f68409c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.f68407a.equals(c0Var.f68407a) && this.f68408b.equals(c0Var.f68408b);
    }

    public int hashCode() {
        return C6619q.c(this.f68408b, this.f68407a);
    }
}
