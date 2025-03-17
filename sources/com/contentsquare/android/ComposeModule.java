package com.contentsquare.android;

import GJ.C15768k;
import I2.C4610g0;
import L1.p;
import XH.v;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.AndroidViewsHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m8.C8560a;
import m8.C8563d;
import n8.C8589a;
import nI.C17642l;
import o1.C5667g;
import o1.C5668h;
import r8.C8709a;
import t8.C8840a;
import v8.c;
import w8.C8933a;
import w8.d;
import w8.e;
import z8.C9036b;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\t\b\u0016¢\u0006\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Lcom/contentsquare/android/ComposeModule;", "Lv8/c;", "Lw8/a;", "Ln8/a;", "viewNodeProcessor", "Lr8/a;", "viewLightProcessor", "<init>", "(Ln8/a;Lr8/a;)V", "()V", "compose_release"}, k = 1, mv = {1, 8, 0})
public final class ComposeModule implements c, C8933a {

    /* renamed from: a  reason: collision with root package name */
    public final C8589a f46602a;

    /* renamed from: b  reason: collision with root package name */
    public final C8709a f46603b;

    public static final class a extends C17544u implements C17642l<View, d> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ ComposeModule f46604c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ v<Integer, Integer> f46605d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(ComposeModule composeModule, v<Integer, Integer> vVar) {
            super(1);
            this.f46604c = composeModule;
            this.f46605d = vVar;
        }

        public final Object invoke(Object obj) {
            View view = (View) obj;
            C17542s.j(view, "child");
            return this.f46604c.g(view, this.f46605d);
        }
    }

    public ComposeModule() {
        this(new C8589a((C8560a) null, 1, (DefaultConstructorMarker) null), new C8709a((C8560a) null, 1, (DefaultConstructorMarker) null));
    }

    public final boolean a(View view) {
        C17542s.j(view, "view");
        return view instanceof AndroidComposeView;
    }

    public final void b(Context context) {
        C17542s.j(context, "context");
    }

    public final e c(View view, boolean z10, C17642l<? super Rect, String> lVar) {
        C17542s.j(view, "view");
        C17542s.j(lVar, "bitmapProvider");
        if (!(view instanceof AndroidComposeView)) {
            return null;
        }
        C8563d e10 = C8840a.e((AndroidComposeView) view);
        C17542s.j(e10, "node");
        C17542s.j(lVar, "bitmapProvider");
        return this.f46602a.g(e10, z10, lVar);
    }

    public final boolean d(View view) {
        C17542s.j(view, "view");
        return view instanceof AndroidViewsHandler;
    }

    public final void e(View view, C9036b bVar, boolean z10) {
        C17542s.j(view, "view");
        C17542s.j(bVar, "nativeViewLight");
        if (view instanceof AndroidComposeView) {
            C8563d e10 = C8840a.e((AndroidComposeView) view);
            C17542s.j(e10, "root");
            C17542s.j(bVar, "nativeViewLight");
            this.f46603b.a(e10, bVar, z10);
        }
    }

    public final void f(Context context) {
        C17542s.j(context, "context");
    }

    public final d g(View view, v<Integer, Integer> vVar) {
        C17542s.j(view, "view");
        C5667g gVar = null;
        if (view instanceof AndroidComposeView) {
            p d10 = C8840a.d((AndroidComposeView) view);
            if (vVar != null) {
                gVar = C5667g.d(C5668h.a((float) vVar.c().intValue(), (float) vVar.d().intValue()));
            }
            return p8.c.c(d10, gVar);
        } else if (view instanceof ViewGroup) {
            return (d) C15768k.L(C15768k.T(C4610g0.b((ViewGroup) view), new a(this, vVar)));
        } else {
            return null;
        }
    }

    public ComposeModule(C8589a aVar, C8709a aVar2) {
        C17542s.j(aVar, "viewNodeProcessor");
        C17542s.j(aVar2, "viewLightProcessor");
        this.f46602a = aVar;
        this.f46603b = aVar2;
    }
}
