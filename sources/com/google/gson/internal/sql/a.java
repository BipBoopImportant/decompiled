package com.google.gson.internal.sql;

import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import com.google.gson.v;
import java.sql.Timestamp;
import java.util.Date;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f69178a;

    /* renamed from: b  reason: collision with root package name */
    public static final DefaultDateTypeAdapter.a<? extends Date> f69179b;

    /* renamed from: c  reason: collision with root package name */
    public static final DefaultDateTypeAdapter.a<? extends Date> f69180c;

    /* renamed from: d  reason: collision with root package name */
    public static final v f69181d;

    /* renamed from: e  reason: collision with root package name */
    public static final v f69182e;

    /* renamed from: f  reason: collision with root package name */
    public static final v f69183f;

    /* renamed from: com.google.gson.internal.sql.a$a  reason: collision with other inner class name */
    class C1189a extends DefaultDateTypeAdapter.a<java.sql.Date> {
        C1189a(Class cls) {
            super(cls);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public java.sql.Date d(Date date) {
            return new java.sql.Date(date.getTime());
        }
    }

    class b extends DefaultDateTypeAdapter.a<Timestamp> {
        b(Class cls) {
            super(cls);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public Timestamp d(Date date) {
            return new Timestamp(date.getTime());
        }
    }

    static {
        boolean z10;
        try {
            Class.forName("java.sql.Date");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        f69178a = z10;
        if (z10) {
            f69179b = new C1189a(java.sql.Date.class);
            f69180c = new b(Timestamp.class);
            f69181d = SqlDateTypeAdapter.f69172b;
            f69182e = SqlTimeTypeAdapter.f69174b;
            f69183f = SqlTimestampTypeAdapter.f69176b;
            return;
        }
        f69179b = null;
        f69180c = null;
        f69181d = null;
        f69182e = null;
        f69183f = null;
    }
}
