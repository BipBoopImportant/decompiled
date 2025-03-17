package com.contentsquare.android.sdk;

import D8.c;
import F8.e;
import F8.g;
import android.os.SystemClock;
import java.util.UUID;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* renamed from: com.contentsquare.android.sdk.y0  reason: case insensitive filesystem */
public abstract class C7162y0 {

    /* renamed from: l  reason: collision with root package name */
    public static final c f47731l = new c((String) null, 1, (DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f47732a;

    /* renamed from: b  reason: collision with root package name */
    public final int f47733b;

    /* renamed from: c  reason: collision with root package name */
    public final String f47734c;

    /* renamed from: d  reason: collision with root package name */
    public final int f47735d;

    /* renamed from: e  reason: collision with root package name */
    public final e f47736e;

    /* renamed from: f  reason: collision with root package name */
    public final String f47737f;

    /* renamed from: g  reason: collision with root package name */
    public final g.c f47738g;

    /* renamed from: h  reason: collision with root package name */
    public final JSONObject f47739h;

    /* renamed from: i  reason: collision with root package name */
    public final int f47740i;

    /* renamed from: j  reason: collision with root package name */
    public final long f47741j;

    /* renamed from: k  reason: collision with root package name */
    public final long f47742k;

    /* renamed from: com.contentsquare.android.sdk.y0$a */
    public static abstract class a<T extends C7162y0> {

        /* renamed from: a  reason: collision with root package name */
        public final int f47743a;

        /* renamed from: b  reason: collision with root package name */
        public String f47744b = "";

        /* renamed from: c  reason: collision with root package name */
        public int f47745c;

        /* renamed from: d  reason: collision with root package name */
        public e f47746d = e.CONNECTIVITY_ERROR;

        /* renamed from: e  reason: collision with root package name */
        public String f47747e = "";

        /* renamed from: f  reason: collision with root package name */
        public g.c f47748f = g.c.PORTRAIT;

        /* renamed from: g  reason: collision with root package name */
        public JSONObject f47749g = new JSONObject();

        /* renamed from: h  reason: collision with root package name */
        public int f47750h;

        /* renamed from: i  reason: collision with root package name */
        public long f47751i = System.currentTimeMillis();

        /* renamed from: j  reason: collision with root package name */
        public final long f47752j = SystemClock.uptimeMillis();

        public a(int i10) {
            this.f47743a = i10;
        }

        public abstract T a();
    }

    public C7162y0(a<?> aVar) {
        C17542s.j(aVar, "builder");
        String uuid = UUID.randomUUID().toString();
        C17542s.i(uuid, "randomUUID().toString()");
        this.f47732a = uuid;
        this.f47733b = aVar.f47743a;
        this.f47734c = aVar.f47744b;
        this.f47735d = aVar.f47745c;
        this.f47736e = aVar.f47746d;
        this.f47737f = aVar.f47747e;
        this.f47738g = aVar.f47748f;
        this.f47739h = aVar.f47749g;
        this.f47740i = aVar.f47750h;
        this.f47741j = aVar.f47751i;
        this.f47742k = aVar.f47752j;
    }

    public abstract void a();
}
