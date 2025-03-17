package qw;

import QJ.Q;
import U0.A1;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.P;
import U0.Y0;
import XH.C16807N;
import XH.y;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.r;
import com.google.android.libraries.places.api.model.PlaceTypes;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import nI.p;
import x4.C8948l;
import x4.C8951o;
import z4.m;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a9\u0010\b\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001aA\u0010\r\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011²\u0006\u0014\u0010\u000f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00008\nX\u0002²\u0006\u000e\u0010\u0010\u001a\u0004\u0018\u00010\u00018\nX\u0002²\u0006\u0014\u0010\u000f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00008\nX\u0002²\u0006\u000e\u0010\u0010\u001a\u0004\u0018\u00010\u00018\nX\u0002²\u0006\u0014\u0010\u000f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00008\nX\u0002"}, d2 = {"T", "Lx4/l;", "navBackStackEntry", "", "key", "Lkotlin/Function1;", "LXH/N;", "onResult", "c", "(Lx4/l;Ljava/lang/String;LnI/l;LU0/m;I)V", "Lx4/o;", "navController", "route", "d", "(Lx4/o;Ljava/lang/String;Ljava/lang/String;LnI/l;LU0/m;I)V", "result", "backStackEntry", "navigation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class l {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.navigation.composable.NavigationResultHandlerKt$NavigationResultHandler$1$1", f = "NavigationResultHandler.kt", l = {}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f28575c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ A1<T> f28576d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l<T, C16807N> f28577e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C8948l f28578f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f28579g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(A1<? extends T> a12, C17642l<? super T, C16807N> lVar, C8948l lVar2, String str, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f28576d = a12;
            this.f28577e = lVar;
            this.f28578f = lVar2;
            this.f28579g = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f28576d, this.f28577e, this.f28578f, this.f28579g, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f28575c == 0) {
                y.b(obj);
                Object j10 = l.e(this.f28576d);
                if (j10 != null) {
                    C17642l<T, C16807N> lVar = this.f28577e;
                    C8948l lVar2 = this.f28578f;
                    String str = this.f28579g;
                    lVar.invoke(j10);
                    lVar2.h().m(str, null);
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.navigation.composable.NavigationResultHandlerKt$NavigationResultHandler$3$1$1", f = "NavigationResultHandler.kt", l = {}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f28580c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ A1<T> f28581d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l<T, C16807N> f28582e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C8948l f28583f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f28584g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(A1<? extends T> a12, C17642l<? super T, C16807N> lVar, C8948l lVar2, String str, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f28581d = a12;
            this.f28582e = lVar;
            this.f28583f = lVar2;
            this.f28584g = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f28581d, this.f28582e, this.f28583f, this.f28584g, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f28580c == 0) {
                y.b(obj);
                Object k10 = l.h(this.f28581d);
                if (k10 != null) {
                    C17642l<T, C16807N> lVar = this.f28582e;
                    C8948l lVar2 = this.f28583f;
                    String str = this.f28584g;
                    lVar.invoke(k10);
                    lVar2.h().m(str, null);
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final <T> void c(C8948l lVar, String str, C17642l<? super T, C16807N> lVar2, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        C8948l lVar3 = lVar;
        String str2 = str;
        C17642l<? super T, C16807N> lVar4 = lVar2;
        int i12 = i10;
        C17542s.j(lVar3, "navBackStackEntry");
        C17542s.j(str2, "key");
        C17542s.j(lVar4, "onResult");
        C4889m k10 = mVar.k(1068914128);
        if ((i12 & 6) == 0) {
            i11 = (k10.F(lVar3) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.V(str2) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.F(lVar4) ? 256 : 128;
        }
        if ((i11 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1068914128, i11, -1, "com.ingka.ikea.navigation.composable.NavigationResultHandler (NavigationResultHandler.kt:26)");
            }
            A1 c10 = j3.a.c(lVar.h().i(str2, null), (C5221y) null, (r.b) null, (C17168i) null, k10, 0, 7);
            Object e10 = e(c10);
            k10.W(846367168);
            boolean z10 = true;
            boolean V10 = k10.V(c10) | ((i11 & 896) == 256) | k10.F(lVar3);
            if ((i11 & 112) != 32) {
                z10 = false;
            }
            boolean z11 = V10 | z10;
            Object D10 = k10.D();
            if (z11 || D10 == C4889m.f14007a.a()) {
                mVar2 = k10;
                a aVar = new a(c10, lVar2, lVar, str, (C17164e<? super a>) null);
                mVar2.u(aVar);
                D10 = aVar;
            } else {
                mVar2 = k10;
            }
            mVar2.P();
            P.g(e10, (p) D10, mVar2, 0);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new j(lVar3, str2, lVar4, i12));
        }
    }

    public static final <T> void d(C8951o oVar, String str, String str2, C17642l<? super T, C16807N> lVar, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        C8951o oVar2 = oVar;
        String str3 = str;
        String str4 = str2;
        C17642l<? super T, C16807N> lVar2 = lVar;
        int i12 = i10;
        C17542s.j(oVar2, "navController");
        C17542s.j(str3, PlaceTypes.ROUTE);
        C17542s.j(str4, "key");
        C17542s.j(lVar2, "onResult");
        C4889m k10 = mVar.k(743745132);
        if ((i12 & 6) == 0) {
            i11 = (k10.F(oVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.V(str3) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.V(str4) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i11 |= k10.F(lVar2) ? 2048 : 1024;
        }
        if ((i11 & 1171) != 1170 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(743745132, i11, -1, "com.ingka.ikea.navigation.composable.NavigationResultHandler (NavigationResultHandler.kt:51)");
            }
            C8948l g10 = g(m.d(oVar2, k10, i11 & 14));
            if (g10 == null) {
                mVar2 = k10;
            } else {
                k10.W(846391683);
                if (C17542s.e(g10.e().C(), str3)) {
                    A1 c10 = j3.a.c(g10.h().i(str4, null), (C5221y) null, (r.b) null, (C17168i) null, k10, 0, 7);
                    Object h10 = h(c10);
                    k10.W(-1160382169);
                    boolean z10 = true;
                    boolean V10 = ((i11 & 7168) == 2048) | k10.V(c10) | k10.F(g10);
                    if ((i11 & 896) != 256) {
                        z10 = false;
                    }
                    boolean z11 = V10 | z10;
                    Object D10 = k10.D();
                    if (z11 || D10 == C4889m.f14007a.a()) {
                        mVar2 = k10;
                        b bVar = new b(c10, lVar, g10, str2, (C17164e<? super b>) null);
                        mVar2.u(bVar);
                        D10 = bVar;
                    } else {
                        mVar2 = k10;
                    }
                    mVar2.P();
                    P.g(h10, (p) D10, mVar2, 0);
                } else {
                    mVar2 = k10;
                }
                mVar2.P();
            }
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new k(oVar, str, str2, lVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final <T> T e(A1<? extends T> a12) {
        return a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N f(C8948l lVar, String str, C17642l lVar2, int i10, C4889m mVar, int i11) {
        c(lVar, str, lVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final C8948l g(A1<C8948l> a12) {
        return a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final <T> T h(A1<? extends T> a12) {
        return a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N i(C8951o oVar, String str, String str2, C17642l lVar, int i10, C4889m mVar, int i11) {
        d(oVar, str, str2, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
