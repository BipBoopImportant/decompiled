package com.ingka.ikea.app.scanandgoonlineredesign.dialog.bottomsheet;

import Ae.e;
import Ae.j;
import HJ.C15854t;
import QJ.F0;
import QJ.N;
import QJ.Q;
import QJ.T;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import XH.C16796C;
import XH.C16807N;
import XH.x;
import XH.y;
import YH.C16877v;
import YH.X;
import androidx.lifecycle.F;
import androidx.lifecycle.K;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.ingka.ikea.analytics.Interaction$Component;
import com.ingka.ikea.app.scanandgoonlineredesign.dialog.bottomsheet.a;
import com.sugarcube.core.logger.DslKt;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import oj.C11680a;
import oj.C11681b;
import oj.i;
import pj.C11719a;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0 8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R#\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00140,8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u0014008\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0014\u00108\u001a\u0002058\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u00069"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/bottomsheet/b;", "Landroidx/lifecycle/f0;", "LAe/e;", "analytics", "Lpj/a;", "getBottomSheetContent", "<init>", "(LAe/e;Lpj/a;)V", "Lcom/ingka/ikea/analytics/Interaction$Component;", "component", "", "productId", "storeId", "LXH/N;", "G", "(Lcom/ingka/ikea/analytics/Interaction$Component;Ljava/lang/String;Ljava/lang/String;)V", "Loj/i;", "type", "E", "(Loj/i;)V", "Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/bottomsheet/a;", "actionType", "H", "(Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/bottomsheet/a;)V", "Loj/a;", "event", "F", "(Loj/a;)V", "m", "LAe/e;", "n", "Lpj/a;", "Landroidx/lifecycle/K;", "", "Loj/b;", "o", "Landroidx/lifecycle/K;", "_content", "Landroidx/lifecycle/F;", "p", "Landroidx/lifecycle/F;", "D", "()Landroidx/lifecycle/F;", "content", "LTJ/B;", "q", "LTJ/B;", "_actionType", "LTJ/P;", "r", "LTJ/P;", "C", "()LTJ/P;", "LQJ/N;", "s", "LQJ/N;", "exceptionHandler", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b extends f0 {

    /* renamed from: m  reason: collision with root package name */
    private final e f91366m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final C11719a f91367n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final K<List<C11681b>> f91368o;

    /* renamed from: p  reason: collision with root package name */
    private final F<List<C11681b>> f91369p;

    /* renamed from: q  reason: collision with root package name */
    private C16505B<a> f91370q;

    /* renamed from: r  reason: collision with root package name */
    private final C16519P<a> f91371r;

    /* renamed from: s  reason: collision with root package name */
    private final N f91372s = new C2004b(N.f137593c0, this);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.scanandgoonlineredesign.dialog.bottomsheet.ScanAndGoBottomSheetViewModel$init$1", f = "ScanAndGoBottomSheetViewModel.kt", l = {45}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f91373c;

        /* renamed from: d  reason: collision with root package name */
        int f91374d;

        /* renamed from: e  reason: collision with root package name */
        private /* synthetic */ Object f91375e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ b f91376f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ i f91377g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar, i iVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f91376f = bVar;
            this.f91377g = iVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f91376f, this.f91377g, eVar);
            aVar.f91375e = obj;
            return aVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Q q10;
            K k10;
            Object f10 = C17187b.f();
            int i10 = this.f91374d;
            if (i10 == 0) {
                y.b(obj);
                q10 = (Q) this.f91375e;
                K i11 = this.f91376f.f91368o;
                C11719a h10 = this.f91376f.f91367n;
                i iVar = this.f91377g;
                this.f91375e = q10;
                this.f91373c = i11;
                this.f91374d = 1;
                Object f11 = h10.f(iVar, this);
                if (f11 == f10) {
                    return f10;
                }
                k10 = i11;
                obj2 = f11;
            } else if (i10 == 1) {
                k10 = (K) this.f91373c;
                q10 = (Q) this.f91375e;
                y.b(obj);
                obj2 = ((x) obj).j();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Throwable e10 = x.e(obj2);
            if (e10 != null) {
                qv.e eVar = qv.e.ERROR;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                String str = null;
                String str2 = null;
                for (C11819b bVar : arrayList) {
                    if (str == null) {
                        String a10 = C11818a.a((String) null, e10);
                        if (a10 == null) {
                            break;
                        }
                        str = C11820c.a(a10);
                    }
                    String str3 = str;
                    if (str2 == null) {
                        String name = q10.getClass().getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str4 = str2;
                    bVar.a(eVar, str4, false, e10, str3);
                    str = str3;
                    str2 = str4;
                }
                obj2 = C16877v.n();
            }
            k10.setValue(obj2);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/ingka/ikea/app/scanandgoonlineredesign/dialog/bottomsheet/b$b", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.ingka.ikea.app.scanandgoonlineredesign.dialog.bottomsheet.b$b  reason: collision with other inner class name */
    public static final class C2004b extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f91378a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2004b(N.a aVar, b bVar) {
            super(aVar);
            this.f91378a = bVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            b bVar = this.f91378a;
            qv.e eVar = qv.e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar2 : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a((String) null, th2);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = bVar.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar2.a(eVar, str4, false, th2, str3);
                str = str3;
                str2 = str4;
            }
            this.f91378a.f91368o.setValue(C16877v.n());
        }
    }

    public b(e eVar, C11719a aVar) {
        C17542s.j(eVar, "analytics");
        C17542s.j(aVar, "getBottomSheetContent");
        this.f91366m = eVar;
        this.f91367n = aVar;
        K<List<C11681b>> k10 = new K<>();
        this.f91368o = k10;
        this.f91369p = k10;
        C16505B<a> a10 = C16521S.a(a.C2000a.f91360a);
        this.f91370q = a10;
        this.f91371r = a10;
    }

    private final void G(Interaction$Component interaction$Component, String str, String str2) {
        e.c.c(this.f91366m, j.SHOP_AND_GO_VIEWED.b(), X.m(C16796C.a("item_id", str), C16796C.a("store_id", str2)), interaction$Component, (e.b) null, 8, (Object) null);
    }

    public final C16519P<a> C() {
        return this.f91371r;
    }

    public final F<List<C11681b>> D() {
        return this.f91369p;
    }

    public final void E(i iVar) {
        C17542s.j(iVar, "type");
        F0 unused = C16314k.d(g0.a(this), this.f91372s, (T) null, new a(this, iVar, (C17164e<? super a>) null), 2, (Object) null);
    }

    public final void F(C11680a aVar) {
        C17542s.j(aVar, "event");
        G(aVar.a(), aVar.b(), aVar.c());
    }

    public final void H(a aVar) {
        C17542s.j(aVar, "actionType");
        this.f91370q.setValue(aVar);
    }
}
