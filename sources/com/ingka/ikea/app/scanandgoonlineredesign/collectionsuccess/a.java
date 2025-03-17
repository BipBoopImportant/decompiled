package com.ingka.ikea.app.scanandgoonlineredesign.collectionsuccess;

import QJ.C16297b0;
import QJ.F0;
import QJ.Q;
import QJ.T;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import androidx.lifecycle.U;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import cp.C11176a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001:\u0002\u0012\u0013B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/collectionsuccess/a;", "Landroidx/lifecycle/f0;", "Landroidx/lifecycle/U;", "savedStateHandle", "Lcp/a;", "uriDecoder", "<init>", "(Landroidx/lifecycle/U;Lcp/a;)V", "LTJ/B;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/collectionsuccess/a$c;", "m", "LTJ/B;", "_uiState", "LTJ/P;", "n", "LTJ/P;", "()LTJ/P;", "uiState", "c", "b", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a extends f0 {
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final C16505B<c> f91261m;

    /* renamed from: n  reason: collision with root package name */
    private final C16519P<c> f91262n;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.scanandgoonlineredesign.collectionsuccess.ProductCollectedSuccessDialogViewModel$1", f = "ProductCollectedSuccessDialogViewModel.kt", l = {45}, m = "invokeSuspend")
    /* renamed from: com.ingka.ikea.app.scanandgoonlineredesign.collectionsuccess.a$a  reason: collision with other inner class name */
    static final class C1992a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f91263c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a f91264d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1992a(a aVar, C17164e<? super C1992a> eVar) {
            super(2, eVar);
            this.f91264d = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C1992a(this.f91264d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((C1992a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object value;
            Object f10 = C17187b.f();
            int i10 = this.f91263c;
            if (i10 == 0) {
                y.b(obj);
                this.f91263c = 1;
                if (C16297b0.b(2500, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C16505B h10 = this.f91264d.f91261m;
            do {
                value = h10.getValue();
            } while (!h10.e(value, c.b((c) value, (String) null, 0, b.C1993a.f91265a, 3, (Object) null)));
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/collectionsuccess/a$b;", "", "<init>", "()V", "a", "Lcom/ingka/ikea/app/scanandgoonlineredesign/collectionsuccess/a$b$a;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/collectionsuccess/a$b$a;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/collectionsuccess/a$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.ingka.ikea.app.scanandgoonlineredesign.collectionsuccess.a$b$a  reason: collision with other inner class name */
        public static final class C1993a extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final C1993a f91265a = new C1993a();

            private C1993a() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C1993a);
            }

            public int hashCode() {
                return -787019029;
            }

            public String toString() {
                return "CloseScreen";
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public a(U u10, C11176a aVar) {
        C17542s.j(u10, "savedStateHandle");
        C17542s.j(aVar, "uriDecoder");
        Object f10 = u10.f("title");
        if (f10 != null) {
            String a10 = aVar.a((String) f10);
            Object f11 = u10.f("qty");
            if (f11 != null) {
                C16505B<c> a11 = C16521S.a(new c(a10, ((Number) f11).intValue(), (b) null, 4, (DefaultConstructorMarker) null));
                this.f91261m = a11;
                this.f91262n = C16534i.c(a11);
                F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new C1992a(this, (C17164e<? super C1992a>) null), 3, (Object) null);
                return;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final C16519P<c> m() {
        return this.f91262n;
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ0\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/collectionsuccess/a$c;", "", "", "productTitle", "", "qty", "Lcom/ingka/ikea/app/scanandgoonlineredesign/collectionsuccess/a$b;", "uiEffect", "<init>", "(Ljava/lang/String;ILcom/ingka/ikea/app/scanandgoonlineredesign/collectionsuccess/a$b;)V", "a", "(Ljava/lang/String;ILcom/ingka/ikea/app/scanandgoonlineredesign/collectionsuccess/a$b;)Lcom/ingka/ikea/app/scanandgoonlineredesign/collectionsuccess/a$c;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "c", "b", "I", "d", "Lcom/ingka/ikea/app/scanandgoonlineredesign/collectionsuccess/a$b;", "e", "()Lcom/ingka/ikea/app/scanandgoonlineredesign/collectionsuccess/a$b;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final String f91266a;

        /* renamed from: b  reason: collision with root package name */
        private final int f91267b;

        /* renamed from: c  reason: collision with root package name */
        private final b f91268c;

        public c(String str, int i10, b bVar) {
            C17542s.j(str, "productTitle");
            this.f91266a = str;
            this.f91267b = i10;
            this.f91268c = bVar;
        }

        public static /* synthetic */ c b(c cVar, String str, int i10, b bVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = cVar.f91266a;
            }
            if ((i11 & 2) != 0) {
                i10 = cVar.f91267b;
            }
            if ((i11 & 4) != 0) {
                bVar = cVar.f91268c;
            }
            return cVar.a(str, i10, bVar);
        }

        public final c a(String str, int i10, b bVar) {
            C17542s.j(str, "productTitle");
            return new c(str, i10, bVar);
        }

        public final String c() {
            return this.f91266a;
        }

        public final int d() {
            return this.f91267b;
        }

        public final b e() {
            return this.f91268c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return C17542s.e(this.f91266a, cVar.f91266a) && this.f91267b == cVar.f91267b && C17542s.e(this.f91268c, cVar.f91268c);
        }

        public int hashCode() {
            int hashCode = ((this.f91266a.hashCode() * 31) + Integer.hashCode(this.f91267b)) * 31;
            b bVar = this.f91268c;
            return hashCode + (bVar == null ? 0 : bVar.hashCode());
        }

        public String toString() {
            String str = this.f91266a;
            int i10 = this.f91267b;
            b bVar = this.f91268c;
            return "UiState(productTitle=" + str + ", qty=" + i10 + ", uiEffect=" + bVar + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ c(String str, int i10, b bVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i10, (i11 & 4) != 0 ? null : bVar);
        }
    }
}
