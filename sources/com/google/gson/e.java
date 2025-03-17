package com.google.gson;

import java.util.Objects;

public class e {

    /* renamed from: d  reason: collision with root package name */
    public static final e f68909d = new e("", "", false);

    /* renamed from: e  reason: collision with root package name */
    public static final e f68910e = new e("\n", "  ", true);

    /* renamed from: a  reason: collision with root package name */
    private final String f68911a;

    /* renamed from: b  reason: collision with root package name */
    private final String f68912b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f68913c;

    private e(String str, String str2, boolean z10) {
        Objects.requireNonNull(str, "newline == null");
        Objects.requireNonNull(str2, "indent == null");
        if (!str.matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        } else if (str2.matches("[ \t]*")) {
            this.f68911a = str;
            this.f68912b = str2;
            this.f68913c = z10;
        } else {
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
    }

    public String a() {
        return this.f68912b;
    }

    public String b() {
        return this.f68911a;
    }

    public boolean c() {
        return this.f68913c;
    }
}
