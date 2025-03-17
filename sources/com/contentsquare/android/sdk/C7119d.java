package com.contentsquare.android.sdk;

import D8.c;
import G8.g;
import XH.C16796C;
import YH.X;
import a9.C6829g;
import a9.C6837h;
import a9.C6865k3;
import a9.D6;
import a9.E6;
import a9.H1;
import a9.S6;
import android.app.Activity;
import android.os.Handler;
import android.webkit.WebView;
import com.contentsquare.android.sdk.Z0;
import com.optimizely.ab.config.FeatureVariable;
import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.C17542s;
import org.json.JSONException;
import org.json.JSONObject;
import u8.C8886a;
import v8.b;

/* renamed from: com.contentsquare.android.sdk.d  reason: case insensitive filesystem */
public final class C7119d {

    /* renamed from: l  reason: collision with root package name */
    public static final Map<Integer, String> f47359l = X.m(C16796C.a(25, "Custom error"), C16796C.a(26, "Javascript error"), C16796C.a(21, "API error"));

    /* renamed from: a  reason: collision with root package name */
    public final Handler f47360a;

    /* renamed from: b  reason: collision with root package name */
    public final C6865k3 f47361b;

    /* renamed from: c  reason: collision with root package name */
    public final C7164z0 f47362c;

    /* renamed from: d  reason: collision with root package name */
    public final O0 f47363d;

    /* renamed from: e  reason: collision with root package name */
    public final C7133k f47364e;

    /* renamed from: f  reason: collision with root package name */
    public final E6 f47365f;

    /* renamed from: g  reason: collision with root package name */
    public final b f47366g;

    /* renamed from: h  reason: collision with root package name */
    public final c f47367h;

    /* renamed from: i  reason: collision with root package name */
    public final WeakReference<Activity> f47368i;

    /* renamed from: j  reason: collision with root package name */
    public final WeakReference<WebView> f47369j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f47370k = true;

    public C7119d(Activity activity, Handler handler, WebView webView, F0 f02, C7164z0 z0Var, O0 o02, C7133k kVar, E6 e62, b bVar) {
        c cVar = new c("WebViewAnalyticsEventProcessor");
        C17542s.j(activity, "activity");
        C17542s.j(handler, "handler");
        C17542s.j(webView, "webView");
        C17542s.j(f02, "screenChangedCallback");
        C17542s.j(z0Var, "gestureProcessor");
        C17542s.j(o02, "analyticsPipeline");
        C17542s.j(kVar, "eventsBuildersFactory");
        C17542s.j(e62, "eventLimiter");
        C17542s.j(bVar, "screenViewTracker");
        C17542s.j(cVar, "logger");
        this.f47360a = handler;
        this.f47361b = f02;
        this.f47362c = z0Var;
        this.f47363d = o02;
        this.f47364e = kVar;
        this.f47365f = e62;
        this.f47366g = bVar;
        this.f47367h = cVar;
        this.f47368i = new WeakReference<>(activity);
        this.f47369j = new WeakReference<>(webView);
    }

    public static final void c(C7119d dVar, WebView webView) {
        C17542s.j(dVar, "this$0");
        c cVar = dVar.f47367h;
        cVar.k("WebView Tracking Tag is detected on page: " + webView.getUrl());
    }

    public static final void d(C7119d dVar, JSONObject jSONObject) {
        C17542s.j(dVar, "this$0");
        C17542s.j(jSONObject, "$dataJsonObject");
        Activity activity = dVar.f47368i.get();
        if (activity != null) {
            dVar.f47367h.l("WebView PAGE_VIEW triggered");
            try {
                String string = jSONObject.getString("url");
                C6865k3 k3Var = dVar.f47361b;
                C17542s.i(string, "url");
                k3Var.b(activity, string);
            } catch (JSONException e10) {
                c cVar = dVar.f47367h;
                H1.a(cVar, "Error while parsing " + jSONObject, e10);
            }
        }
    }

    public final void a() {
        WebView webView = this.f47369j.get();
        if (this.f47370k && webView != null) {
            this.f47370k = false;
            this.f47360a.post(new C6829g(this, webView));
        }
    }

    public final void b(int i10) {
        String str = f47359l.get(Integer.valueOf(i10));
        c cVar = this.f47367h;
        cVar.j("Limit of 20 " + str + "s per screenview has been reached for the current screenview. " + str + " collection is paused until next screenview");
    }

    public final void e(String str, String str2, String str3) {
        C17542s.j(str3, "level");
        try {
            String upperCase = str3.toUpperCase(Locale.ROOT);
            C17542s.i(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            int a10 = S6.a(upperCase);
            if (a10 == 3 || a10 == 4) {
                c cVar = this.f47367h;
                cVar.j("[WebView JS log] (" + str2 + ") " + str);
            }
        } catch (IllegalArgumentException e10) {
            c cVar2 = this.f47367h;
            H1.a(cVar2, "Error while parsing the log level: " + str3, e10);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c5 A[Catch:{ JSONException -> 0x0049 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(org.json.JSONObject r9) {
        /*
            r8 = this;
            java.lang.String r0 = "type: "
            java.lang.String r1 = "json"
            kotlin.jvm.internal.C17542s.j(r9, r1)
            java.lang.String r2 = "type"
            int r2 = r9.getInt(r2)     // Catch:{ JSONException -> 0x0049 }
            D8.c r3 = r8.f47367h     // Catch:{ JSONException -> 0x0049 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0049 }
            r4.<init>(r0)     // Catch:{ JSONException -> 0x0049 }
            r4.append(r2)     // Catch:{ JSONException -> 0x0049 }
            java.lang.String r0 = r4.toString()     // Catch:{ JSONException -> 0x0049 }
            r3.l(r0)     // Catch:{ JSONException -> 0x0049 }
            r8.a()     // Catch:{ JSONException -> 0x0049 }
            java.lang.ref.WeakReference<android.webkit.WebView> r0 = r8.f47369j     // Catch:{ JSONException -> 0x0049 }
            java.lang.Object r0 = r0.get()     // Catch:{ JSONException -> 0x0049 }
            android.webkit.WebView r0 = (android.webkit.WebView) r0     // Catch:{ JSONException -> 0x0049 }
            r8.g(r2)     // Catch:{ JSONException -> 0x0049 }
            a9.E6 r3 = r8.f47365f     // Catch:{ JSONException -> 0x0049 }
            boolean r3 = r3.a(r2)     // Catch:{ JSONException -> 0x0049 }
            if (r3 != 0) goto L_0x00f7
            r3 = 4
            r4 = 0
            r5 = 1
            java.lang.String r6 = "dataObject"
            java.lang.String r7 = "data"
            if (r2 != r3) goto L_0x004c
            org.json.JSONObject r0 = r9.getJSONObject(r7)     // Catch:{ JSONException -> 0x0049 }
            kotlin.jvm.internal.C17542s.i(r0, r6)     // Catch:{ JSONException -> 0x0049 }
            r8.i(r0)     // Catch:{ JSONException -> 0x0049 }
            goto L_0x00c0
        L_0x0049:
            r0 = move-exception
            goto L_0x00fb
        L_0x004c:
            r3 = 26
            if (r2 != r3) goto L_0x0076
            org.json.JSONObject r0 = r9.getJSONObject(r7)     // Catch:{ JSONException -> 0x0049 }
            kotlin.jvm.internal.C17542s.i(r0, r6)     // Catch:{ JSONException -> 0x0049 }
            kotlin.jvm.internal.C17542s.j(r0, r1)     // Catch:{ JSONException -> 0x0049 }
            u8.a$a r1 = u8.C8886a.f56874d     // Catch:{ JSONException -> 0x0049 }
            u8.a r1 = r1.a()     // Catch:{ JSONException -> 0x0049 }
            java.lang.String r3 = "webview_javascript_errors"
            boolean r1 = a9.D6.a(r1, r3)     // Catch:{ JSONException -> 0x0049 }
            if (r1 == 0) goto L_0x00c3
            com.contentsquare.android.sdk.k r3 = r8.f47364e     // Catch:{ JSONException -> 0x0049 }
            v8.b r6 = r8.f47366g     // Catch:{ JSONException -> 0x0049 }
            com.contentsquare.android.sdk.b$a r0 = com.contentsquare.android.sdk.r.c(r3, r0, r6)     // Catch:{ JSONException -> 0x0049 }
            com.contentsquare.android.sdk.O0 r3 = r8.f47363d     // Catch:{ JSONException -> 0x0049 }
            r3.a(r0)     // Catch:{ JSONException -> 0x0049 }
            goto L_0x00c3
        L_0x0076:
            r3 = 25
            if (r2 != r3) goto L_0x00a0
            org.json.JSONObject r0 = r9.getJSONObject(r7)     // Catch:{ JSONException -> 0x0049 }
            kotlin.jvm.internal.C17542s.i(r0, r6)     // Catch:{ JSONException -> 0x0049 }
            kotlin.jvm.internal.C17542s.j(r0, r1)     // Catch:{ JSONException -> 0x0049 }
            u8.a$a r1 = u8.C8886a.f56874d     // Catch:{ JSONException -> 0x0049 }
            u8.a r1 = r1.a()     // Catch:{ JSONException -> 0x0049 }
            java.lang.String r3 = "webview_custom_errors"
            boolean r1 = a9.D6.a(r1, r3)     // Catch:{ JSONException -> 0x0049 }
            if (r1 == 0) goto L_0x00c3
            com.contentsquare.android.sdk.k r3 = r8.f47364e     // Catch:{ JSONException -> 0x0049 }
            v8.b r6 = r8.f47366g     // Catch:{ JSONException -> 0x0049 }
            com.contentsquare.android.sdk.W$a r0 = com.contentsquare.android.sdk.r.a(r3, r0, r6)     // Catch:{ JSONException -> 0x0049 }
            com.contentsquare.android.sdk.O0 r3 = r8.f47363d     // Catch:{ JSONException -> 0x0049 }
            r3.a(r0)     // Catch:{ JSONException -> 0x0049 }
            goto L_0x00c3
        L_0x00a0:
            r1 = 21
            if (r2 != r1) goto L_0x00b0
            org.json.JSONObject r0 = r9.getJSONObject(r7)     // Catch:{ JSONException -> 0x0049 }
            kotlin.jvm.internal.C17542s.i(r0, r6)     // Catch:{ JSONException -> 0x0049 }
            boolean r1 = r8.h(r0)     // Catch:{ JSONException -> 0x0049 }
            goto L_0x00c3
        L_0x00b0:
            if (r0 == 0) goto L_0x00c2
            com.contentsquare.android.sdk.z0 r1 = r8.f47362c     // Catch:{ JSONException -> 0x0049 }
            a9.x4 r3 = new a9.x4     // Catch:{ JSONException -> 0x0049 }
            r3.<init>(r0)     // Catch:{ JSONException -> 0x0049 }
            com.contentsquare.android.sdk.G0 r0 = com.contentsquare.android.sdk.G0.a.a(r9, r3)     // Catch:{ JSONException -> 0x0049 }
            r1.d(r0)     // Catch:{ JSONException -> 0x0049 }
        L_0x00c0:
            r1 = r5
            goto L_0x00c3
        L_0x00c2:
            r1 = r4
        L_0x00c3:
            if (r1 == 0) goto L_0x010e
            a9.E6 r0 = r8.f47365f     // Catch:{ JSONException -> 0x0049 }
            r0.getClass()     // Catch:{ JSONException -> 0x0049 }
            java.util.List<java.lang.Integer> r1 = a9.E6.f41987c     // Catch:{ JSONException -> 0x0049 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch:{ JSONException -> 0x0049 }
            boolean r1 = r1.contains(r3)     // Catch:{ JSONException -> 0x0049 }
            if (r1 == 0) goto L_0x010e
            java.util.LinkedHashMap r1 = r0.f41989b     // Catch:{ JSONException -> 0x0049 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch:{ JSONException -> 0x0049 }
            java.util.LinkedHashMap r0 = r0.f41989b     // Catch:{ JSONException -> 0x0049 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ JSONException -> 0x0049 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ JSONException -> 0x0049 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ JSONException -> 0x0049 }
            if (r0 == 0) goto L_0x00ee
            int r4 = r0.intValue()     // Catch:{ JSONException -> 0x0049 }
        L_0x00ee:
            int r4 = r4 + r5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ JSONException -> 0x0049 }
            r1.put(r3, r0)     // Catch:{ JSONException -> 0x0049 }
            goto L_0x010e
        L_0x00f7:
            r8.b(r2)     // Catch:{ JSONException -> 0x0049 }
            goto L_0x010e
        L_0x00fb:
            D8.c r1 = r8.f47367h
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Error while parsing "
            r2.<init>(r3)
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            a9.H1.a(r1, r9, r0)
        L_0x010e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.sdk.C7119d.f(org.json.JSONObject):void");
    }

    public final void g(int i10) {
        if (this.f47366g.d()) {
            c cVar = this.f47367h;
            cVar.j("No screenview detected. " + f47359l.get(Integer.valueOf(i10)) + " is linked to screenviews. Please implement screenview tracking to enable it.");
        }
    }

    public final boolean h(JSONObject jSONObject) {
        C17542s.j(jSONObject, FeatureVariable.JSON_TYPE);
        boolean a10 = D6.a(C8886a.f56874d.a(), "webview_api_errors");
        if (a10) {
            C7133k kVar = this.f47364e;
            C17542s.j(kVar, "eventsBuildersFactory");
            C17542s.j(jSONObject, "dataJsonObject");
            Z0.a aVar = (Z0.a) C7133k.b(kVar, 21);
            aVar.f47266k = g.g(jSONObject, "url");
            Integer d10 = g.d(jSONObject, "statusCode");
            aVar.f47270o = d10 != null ? d10.intValue() : 0;
            Long f10 = g.f(jSONObject, "responseTime");
            long j10 = 0;
            aVar.f47269n = f10 != null ? f10.longValue() : 0;
            Long f11 = g.f(jSONObject, "requestTime");
            if (f11 != null) {
                j10 = f11.longValue();
            }
            aVar.f47268m = j10;
            aVar.f47267l = g.g(jSONObject, "method");
            aVar.f47271p = "webview";
            this.f47363d.a(aVar);
        }
        return a10;
    }

    public final void i(JSONObject jSONObject) {
        C17542s.j(jSONObject, "dataJsonObject");
        this.f47360a.post(new C6837h(this, jSONObject));
    }
}
