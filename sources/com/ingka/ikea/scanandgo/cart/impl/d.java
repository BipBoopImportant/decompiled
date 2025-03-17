package com.ingka.ikea.scanandgo.cart.impl;

import XH.C16818i;
import android.content.Context;
import android.util.DisplayMetrics;
import androidx.lifecycle.L;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.p;
import kotlin.Metadata;
import kotlin.jvm.internal.C17537m;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/recyclerview/widget/LinearLayoutManager;", "Landroid/content/Context;", "context", "", "position", "", "slowFactor", "LXH/N;", "a", "(Landroidx/recyclerview/widget/LinearLayoutManager;Landroid/content/Context;IF)V", "cart-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class d {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements L, C17537m {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ C17642l f119835a;

        a(C17642l lVar) {
            C17542s.j(lVar, "function");
            this.f119835a = lVar;
        }

        public final C16818i<?> c() {
            return this.f119835a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof L) || !(obj instanceof C17537m)) {
                return false;
            }
            return C17542s.e(c(), ((C17537m) obj).c());
        }

        public final int hashCode() {
            return c().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f119835a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/ingka/ikea/scanandgo/cart/impl/d$b", "Landroidx/recyclerview/widget/p;", "", "B", "()I", "Landroid/util/DisplayMetrics;", "displayMetrics", "", "v", "(Landroid/util/DisplayMetrics;)F", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends p {

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ float f119836q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(int i10, Context context, float f10) {
            super(context);
            this.f119836q = f10;
            p(i10);
        }

        /* access modifiers changed from: protected */
        public int B() {
            return -1;
        }

        /* access modifiers changed from: protected */
        public float v(DisplayMetrics displayMetrics) {
            C17542s.j(displayMetrics, "displayMetrics");
            return super.v(displayMetrics) * this.f119836q;
        }
    }

    private static final void a(LinearLayoutManager linearLayoutManager, Context context, int i10, float f10) {
        linearLayoutManager.j2(new b(i10, context, f10));
    }

    static /* synthetic */ void b(LinearLayoutManager linearLayoutManager, Context context, int i10, float f10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            f10 = 1.0f;
        }
        a(linearLayoutManager, context, i10, f10);
    }
}
