package com.contentsquare.android.sdk;

import F8.g;
import java.util.Date;
import kotlin.jvm.internal.C17542s;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.contentsquare.android.sdk.n  reason: case insensitive filesystem */
public final class C7139n {

    /* renamed from: a  reason: collision with root package name */
    public final String f47508a;

    /* renamed from: b  reason: collision with root package name */
    public final int f47509b;

    /* renamed from: c  reason: collision with root package name */
    public final g.b f47510c;

    /* renamed from: d  reason: collision with root package name */
    public final String f47511d;

    /* renamed from: e  reason: collision with root package name */
    public final String f47512e;

    /* renamed from: f  reason: collision with root package name */
    public final String f47513f;

    /* renamed from: g  reason: collision with root package name */
    public final String f47514g;

    /* renamed from: h  reason: collision with root package name */
    public final String f47515h;

    /* renamed from: i  reason: collision with root package name */
    public final JSONObject f47516i;

    /* renamed from: j  reason: collision with root package name */
    public final JSONObject f47517j;

    /* renamed from: k  reason: collision with root package name */
    public final JSONArray f47518k;

    /* renamed from: l  reason: collision with root package name */
    public final long f47519l;

    /* renamed from: com.contentsquare.android.sdk.n$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final g.b f47520a;

        /* renamed from: b  reason: collision with root package name */
        public final String f47521b;

        /* renamed from: c  reason: collision with root package name */
        public final String f47522c;

        /* renamed from: d  reason: collision with root package name */
        public final String f47523d;

        /* renamed from: e  reason: collision with root package name */
        public final String f47524e;

        /* renamed from: f  reason: collision with root package name */
        public final String f47525f;

        /* renamed from: g  reason: collision with root package name */
        public final JSONObject f47526g;

        /* renamed from: h  reason: collision with root package name */
        public final JSONObject f47527h;

        /* renamed from: i  reason: collision with root package name */
        public final JSONArray f47528i = new JSONArray();

        /* renamed from: j  reason: collision with root package name */
        public final long f47529j = new Date().getTime();

        /* renamed from: k  reason: collision with root package name */
        public String f47530k;

        /* renamed from: l  reason: collision with root package name */
        public int f47531l;

        public a(g gVar) {
            C17542s.j(gVar, "deviceInfo");
            this.f47520a = gVar.j();
            this.f47521b = gVar.g();
            this.f47522c = gVar.n();
            this.f47523d = gVar.f();
            this.f47524e = gVar.e();
            this.f47525f = gVar.o();
            this.f47526g = gVar.x();
            this.f47527h = gVar.a();
        }
    }

    public C7139n(a aVar) {
        this.f47508a = aVar.f47530k;
        this.f47509b = aVar.f47531l;
        this.f47510c = aVar.f47520a;
        this.f47511d = aVar.f47521b;
        this.f47512e = aVar.f47522c;
        this.f47513f = aVar.f47523d;
        this.f47514g = aVar.f47524e;
        this.f47515h = aVar.f47525f;
        this.f47516i = aVar.f47526g;
        this.f47517j = aVar.f47527h;
        this.f47518k = aVar.f47528i;
        this.f47519l = aVar.f47529j;
    }
}
