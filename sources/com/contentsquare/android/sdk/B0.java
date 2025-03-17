package com.contentsquare.android.sdk;

import HJ.C15854t;
import a9.J6;
import a9.W2;
import android.view.View;
import com.oppwa.mobile.connect.provider.AsyncPaymentWebViewClient;
import kotlin.jvm.internal.C17542s;

public class B0 {

    /* renamed from: a  reason: collision with root package name */
    public boolean f46904a;

    /* renamed from: b  reason: collision with root package name */
    public int f46905b;

    /* renamed from: c  reason: collision with root package name */
    public W2 f46906c;

    /* renamed from: d  reason: collision with root package name */
    public int f46907d;

    /* renamed from: e  reason: collision with root package name */
    public double f46908e;

    /* renamed from: f  reason: collision with root package name */
    public double f46909f;

    /* renamed from: g  reason: collision with root package name */
    public double f46910g;

    /* renamed from: h  reason: collision with root package name */
    public double f46911h;

    /* renamed from: i  reason: collision with root package name */
    public int f46912i;

    /* renamed from: j  reason: collision with root package name */
    public int f46913j;

    /* renamed from: k  reason: collision with root package name */
    public J6<View> f46914k;

    public static final class a {
        public static boolean a(String str) {
            C17542s.j(str, "path");
            return C15854t.d0(str, ">WebView", false, 2, (Object) null) || C15854t.d0(str, ">RNCWebView", false, 2, (Object) null) || C15854t.d0(str, ">CapacitorWebView", false, 2, (Object) null) || C15854t.d0(str, ">SystemWebView", false, 2, (Object) null) || (C15854t.d0(str, ">FlutterView", false, 2, (Object) null) && C15854t.d0(str, ">PlatformViewWrapper", false, 2, (Object) null) && C15854t.d0(str, AsyncPaymentWebViewClient.LOG_TAG, false, 2, (Object) null));
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GestureResult{unresponsive=");
        sb2.append(this.f46904a);
        sb2.append(", gesture=");
        sb2.append(this.f46905b);
        sb2.append(", pathDescriptor=");
        W2 w22 = this.f46906c;
        sb2.append(w22 != null ? w22.a() : null);
        sb2.append(", fingerDirection=");
        sb2.append(this.f46907d);
        sb2.append(", gestureDistance=");
        sb2.append(this.f46908e);
        sb2.append(", gestureVelocity=");
        sb2.append(this.f46909f);
        sb2.append('}');
        return sb2.toString();
    }
}
