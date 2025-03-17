package com.contentsquare.android.sdk;

import QJ.Q;
import XH.C16807N;
import XH.y;
import a9.C6867k5;
import android.view.View;
import android.view.ViewGroup;
import com.contentsquare.android.sdk.v1;
import dI.C17164e;
import eI.C17187b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.p;

@f(c = "com.contentsquare.android.analytics.internal.features.clientmode.ui.overlay.captureusecase.AppBarHandler$resetAppBar$2", f = "AppBarHandler.kt", l = {75}, m = "invokeSuspend")
/* renamed from: com.contentsquare.android.sdk.f  reason: case insensitive filesystem */
public final class C7123f extends l implements p<Q, C17164e<? super C16807N>, Object> {

    /* renamed from: c  reason: collision with root package name */
    public int f47394c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ View f47395d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ v1.a f47396e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ v1 f47397f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ View f47398g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7123f(View view, v1.a aVar, v1 v1Var, View view2, C17164e<? super C7123f> eVar) {
        super(2, eVar);
        this.f47395d = view;
        this.f47396e = aVar;
        this.f47397f = v1Var;
        this.f47398g = view2;
    }

    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
        return new C7123f(this.f47395d, this.f47396e, this.f47397f, this.f47398g, eVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((C7123f) create((Q) obj, (C17164e) obj2)).invokeSuspend(C16807N.f139792a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f10 = C17187b.f();
        int i10 = this.f47394c;
        if (i10 == 0) {
            y.b(obj);
            ViewGroup.LayoutParams layoutParams = this.f47395d.getLayoutParams();
            layoutParams.height = this.f47396e.f47666c;
            this.f47395d.setLayoutParams(layoutParams);
            v1.b(this.f47397f, this.f47398g, false);
            View view = this.f47395d;
            this.f47394c = 1;
            if (C6867k5.b(view, this) == f10) {
                return f10;
            }
        } else if (i10 == 1) {
            y.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C16807N.f139792a;
    }
}
