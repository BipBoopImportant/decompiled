package com.contentsquare.android.sdk;

import QJ.Q;
import XH.C16807N;
import XH.y;
import a9.C6822f0;
import a9.C6912q2;
import a9.D4;
import a9.K2;
import a9.W3;
import android.view.View;
import android.view.ViewGroup;
import com.contentsquare.android.sdk.P;
import dI.C17164e;
import eI.C17187b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import l8.C8537a;
import nI.p;

@f(c = "com.contentsquare.android.analytics.internal.features.clientmode.screencapture.screenrecorder.VerticalComposeLazyScreenRecorder$generateScreenGraph$2", f = "VerticalComposeLazyScreenRecorder.kt", l = {}, m = "invokeSuspend")
public final class S extends l implements p<Q, C17164e<? super C6912q2>, Object> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ P f47138c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ W3 f47139d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ p<View, C7153u, C16807N> f47140e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f47141f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public S(P p10, W3 w32, P.d dVar, String str, C17164e eVar) {
        super(2, eVar);
        this.f47138c = p10;
        this.f47139d = w32;
        this.f47140e = dVar;
        this.f47141f = str;
    }

    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
        return new S(this.f47138c, this.f47139d, (P.d) this.f47140e, this.f47141f, eVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((S) create((Q) obj, (C17164e) obj2)).invokeSuspend(C16807N.f139792a);
    }

    public final Object invokeSuspend(Object obj) {
        C17187b.f();
        y.b(obj);
        P p10 = this.f47138c;
        C6822f0 f0Var = p10.f47085f;
        ViewGroup e10 = p10.e();
        if (e10 == null) {
            return null;
        }
        P p11 = this.f47138c;
        C8537a[] aVarArr = ((D4) p11.f47533b).f41962f;
        E e11 = p11.f47084e;
        W3 w32 = this.f47139d;
        K2 k22 = new K2(p11.e(), false);
        P p12 = this.f47138c;
        C6912q2 a10 = f0Var.a(e10, aVarArr, e11, w32, k22, new P.a(p12.f47090k, p12.f47092m), this.f47140e);
        String str = this.f47141f;
        P p13 = this.f47138c;
        a10.f42805a = str;
        String h10 = p13.h();
        C17542s.j(h10, "<set-?>");
        a10.f42806b = h10;
        return a10;
    }
}
