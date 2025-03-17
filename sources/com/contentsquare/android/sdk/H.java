package com.contentsquare.android.sdk;

import E8.b;
import E8.c;
import a9.C6784a2;
import a9.C6790b0;
import a9.C6918r1;
import a9.C6964x;
import a9.H1;
import a9.L0;
import a9.Y0;
import android.content.Context;
import android.os.Handler;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import b8.i;
import com.contentsquare.android.internal.features.webviewbridge.assets.WebViewAsset;
import com.contentsquare.android.internal.features.webviewbridge.assets.a;
import fK.q;
import jK.C17451f;
import java.util.List;
import kK.C17514c;
import kotlin.jvm.internal.C17542s;
import l8.C8542f;
import nI.C17631a;
import org.json.JSONException;
import org.json.JSONObject;

public final class H {

    /* renamed from: a  reason: collision with root package name */
    public final WebView f46983a;

    /* renamed from: b  reason: collision with root package name */
    public final long f46984b;

    /* renamed from: c  reason: collision with root package name */
    public final C6790b0 f46985c;

    /* renamed from: d  reason: collision with root package name */
    public final C17631a<a> f46986d;

    /* renamed from: e  reason: collision with root package name */
    public final C17631a<C6964x> f46987e;

    /* renamed from: f  reason: collision with root package name */
    public final C17631a<c> f46988f;

    /* renamed from: g  reason: collision with root package name */
    public final L0 f46989g;

    /* renamed from: h  reason: collision with root package name */
    public final Handler f46990h;

    /* renamed from: i  reason: collision with root package name */
    public final D8.c f46991i;

    /* renamed from: j  reason: collision with root package name */
    public final Context f46992j;

    /* renamed from: k  reason: collision with root package name */
    public C7119d f46993k;

    /* renamed from: l  reason: collision with root package name */
    public K f46994l;

    public H() {
        throw null;
    }

    public static final void a(H h10) {
        C17542s.j(h10, "this$0");
        h10.f46989g.a();
        if (C7131j.f47442k != null) {
            h10.f46991i.f("onWebViewTrackingReady => startSR");
            h10.f46989g.f();
        }
    }

    public final boolean b() {
        c invoke = this.f46988f.invoke();
        boolean b10 = invoke != null ? invoke.b(b.IS_OPT_OUT, false) : false;
        c invoke2 = this.f46988f.invoke();
        boolean b11 = invoke2 != null ? invoke2.b(b.TRACKING_ENABLE, false) : false;
        c invoke3 = this.f46988f.invoke();
        boolean b12 = invoke3 != null ? invoke3.b(b.FORGET_ME, false) : false;
        c invoke4 = this.f46988f.invoke();
        return !b10 && b11 && !b12 && !(invoke4 != null ? invoke4.b(b.PAUSE_TRACKING, false) : false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.contentsquare.android.sdk.C7119d c() {
        /*
            r3 = this;
            com.contentsquare.android.sdk.d r0 = r3.f46993k
            if (r0 != 0) goto L_0x0038
            android.webkit.WebView r0 = r3.f46983a
            int r1 = b8.o.f45595b
            java.lang.Object r0 = r0.getTag(r1)
            boolean r1 = r0 instanceof android.app.Activity
            r2 = 0
            if (r1 == 0) goto L_0x0014
        L_0x0011:
            android.app.Activity r0 = (android.app.Activity) r0
            goto L_0x002b
        L_0x0014:
            android.webkit.WebView r0 = r3.f46983a
            android.content.Context r0 = r0.getContext()
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x002a
            android.webkit.WebView r0 = r3.f46983a
            android.content.Context r0 = r0.getContext()
            java.lang.String r1 = "null cannot be cast to non-null type android.app.Activity"
            kotlin.jvm.internal.C17542s.h(r0, r1)
            goto L_0x0011
        L_0x002a:
            r0 = r2
        L_0x002b:
            if (r0 != 0) goto L_0x002e
            return r2
        L_0x002e:
            a9.b0 r1 = r3.f46985c
            android.webkit.WebView r2 = r3.f46983a
            com.contentsquare.android.sdk.d r0 = r1.a(r2, r0)
            r3.f46993k = r0
        L_0x0038:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.sdk.H.c():com.contentsquare.android.sdk.d");
    }

    @JavascriptInterface
    public final String getAssetTransformerMode() {
        return this.f46987e.invoke().name();
    }

    @JavascriptInterface
    public final int getVersion() {
        return 2;
    }

    @JavascriptInterface
    public final void onWebviewTrackingReady() {
        this.f46991i.f("onWebViewTrackingReady");
        if (b()) {
            this.f46990h.post(new Y0(this));
        }
    }

    @JavascriptInterface
    public final void optIn() {
        this.f46991i.f("optIn triggered");
        i.j(this.f46992j);
    }

    @JavascriptInterface
    public final void optOut() {
        this.f46991i.f("optOut triggered");
        i.k(this.f46992j);
    }

    @JavascriptInterface
    public final void sendAssets(String str, String str2) {
        C17542s.j(str, "jsonAssets");
        try {
            C17514c.a aVar = C17514c.f144280d;
            aVar.a();
            List list = (List) aVar.c(new C17451f(WebViewAsset.Companion.serializer()), str);
            c invoke = this.f46988f.invoke();
            if (invoke != null) {
                boolean b10 = invoke.b(b.IS_OPT_OUT, false);
                a invoke2 = this.f46986d.invoke();
                if (invoke2 != null) {
                    invoke2.c(list, str2, b10);
                }
            }
        } catch (q e10) {
            D8.c cVar = this.f46991i;
            H1.a(cVar, "Json Error while parsing " + str, e10);
        }
    }

    @JavascriptInterface
    public final void sendDynamicVar(String str, String str2) {
        C17542s.j(str, "key");
        C17542s.j(str2, "value");
        try {
            long parseLong = Long.parseLong(str2);
            D8.c cVar = this.f46991i;
            cVar.f("Receiving Dvar, with key = " + str + ", value(int) = " + parseLong);
            i.m(str, parseLong);
        } catch (NumberFormatException unused) {
            D8.c cVar2 = this.f46991i;
            cVar2.f("Receiving Dvar, with key = " + str + ", value(String) = " + str2);
            i.n(str, str2);
        }
    }

    @JavascriptInterface
    public final void sendEvent(String str) {
        C17542s.j(str, "obj");
        D8.c cVar = this.f46991i;
        cVar.f("sendEvent triggered: " + str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            C7119d c10 = c();
            if (c10 != null) {
                c10.f(jSONObject);
            }
        } catch (JSONException e10) {
            D8.c cVar2 = this.f46991i;
            H1.a(cVar2, "Error while parsing " + str, e10);
        }
    }

    @JavascriptInterface
    public final void sendLog(String str) {
        C17542s.j(str, "obj");
        D8.c cVar = this.f46991i;
        cVar.f("sendLog triggered: " + str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("message");
            String string2 = jSONObject.getString("errorCode");
            String string3 = jSONObject.getString("level");
            C7119d c10 = c();
            if (c10 != null) {
                C17542s.i(string3, "level");
                c10.e(string, string2, string3);
            }
        } catch (JSONException e10) {
            D8.c cVar2 = this.f46991i;
            H1.a(cVar2, "Error while parsing " + str, e10);
        }
    }

    @JavascriptInterface
    public final void sendNativeSREvent(String str) {
        C17542s.j(str, "event");
        try {
            D8.c cVar = this.f46991i;
            cVar.f("sendNativeSREvent triggered: " + str);
            JSONObject jSONObject = new JSONObject(str);
            K k10 = this.f46994l;
            if (k10 == null) {
                k10 = this.f46985c.a();
                this.f46994l = k10;
            }
            if (k10 != null) {
                k10.a(jSONObject);
            }
        } catch (JSONException e10) {
            D8.c cVar2 = this.f46991i;
            H1.a(cVar2, "Json Error while parsing " + str, e10);
        }
    }

    @JavascriptInterface
    public final void sendSREvent(String str) {
        C17542s.j(str, "event");
        D8.c cVar = this.f46991i;
        cVar.f("sendSrEvent triggered: " + str);
        C7131j jVar = C7131j.f47442k;
        if (jVar != null) {
            C6918r1 r1Var = new C6918r1(str, this.f46984b);
            C17542s.j(r1Var, "event");
            jVar.f47450d.a(r1Var);
        }
    }

    @JavascriptInterface
    public final void sendTransaction(String str, float f10, String str2) {
        C17542s.j(str2, "currency");
        D8.c cVar = this.f46991i;
        cVar.f("Receiving transaction, with id = " + str + ", value(float) = " + f10 + ", currency = " + str2);
        C8542f.b b10 = C8542f.f54809d.b(f10, str2);
        if (str != null) {
            b10.e(str);
        }
        i.o(b10.a());
    }

    public H(WebView webView, long j10, B b10, C6784a2.a aVar, C6784a2.b bVar, C17631a aVar2, L0 l02, Handler handler) {
        D8.c cVar = new D8.c("CsJavaScriptInterface");
        C17542s.j(webView, "webView");
        C17542s.j(b10, "webViewEventProcessorsFactory");
        C17542s.j(aVar, "webViewAssetsProcessor");
        C17542s.j(bVar, "transformerModeFactory");
        C17542s.j(aVar2, "preferencesStore");
        C17542s.j(l02, "webViewJsExecutor");
        C17542s.j(handler, "mainThreadHandler");
        C17542s.j(cVar, "logger");
        this.f46983a = webView;
        this.f46984b = j10;
        this.f46985c = b10;
        this.f46986d = aVar;
        this.f46987e = bVar;
        this.f46988f = aVar2;
        this.f46989g = l02;
        this.f46990h = handler;
        this.f46991i = cVar;
        this.f46992j = webView.getContext().getApplicationContext();
    }
}
