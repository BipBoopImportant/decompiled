package jD;

import GK.C15777E;
import HJ.C15854t;
import QL.C16361d;
import QL.f;
import QL.x;
import XH.C16807N;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import kD.C14674a;
import kD.d;
import kD.l;
import kD.m;
import kD.n;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import nI.p;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.e;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B;\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006\u0012\u001a\b\u0002\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0017\u001a\u00020\u00052\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001a\u001a\u00020\u00052\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u0010\u0019\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR$\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001cR4\u0010#\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001d8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R.\u0010*\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b%\u0010\u001c\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R.\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b+\u0010\u001c\u001a\u0004\b,\u0010'\"\u0004\b-\u0010)R4\u00102\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00040\u001d8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b/\u0010\u001e\u001a\u0004\b0\u0010 \"\u0004\b1\u0010\"¨\u00063"}, d2 = {"LjD/h;", "T", "LQL/f;", "Lkotlin/Function1;", "LkD/l;", "LXH/N;", "Lcom/ingka/ikea/useraccount/model/StateListener;", "stateListener", "block", "<init>", "(LnI/l;LnI/l;)V", "LQL/x;", "response", "LkD/d;", "g", "(LQL/x;)LkD/d;", "", "throwable", "LkD/n;", "h", "(Ljava/lang/Throwable;)LkD/n;", "LQL/d;", "call", "b", "(LQL/d;LQL/x;)V", "t", "a", "(LQL/d;Ljava/lang/Throwable;)V", "LnI/l;", "Lkotlin/Function2;", "LnI/p;", "getOnSuccess", "()LnI/p;", "p", "(LnI/p;)V", "onSuccess", "LkD/a;", "c", "getOnEmailVerificationNeeded", "()LnI/l;", "m", "(LnI/l;)V", "onEmailVerificationNeeded", "d", "getOnError", "n", "onError", "e", "getOnFailure", "o", "onFailure", "useraccount-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: jD.h  reason: case insensitive filesystem */
public final class C14626h<T> implements f<T> {

    /* renamed from: a  reason: collision with root package name */
    private final C17642l<l, C16807N> f127888a;

    /* renamed from: b  reason: collision with root package name */
    private p<? super T, ? super l, ? extends l> f127889b = new C14622d();

    /* renamed from: c  reason: collision with root package name */
    private C17642l<? super C14674a, ? extends l> f127890c = new C14623e();

    /* renamed from: d  reason: collision with root package name */
    private C17642l<? super d, ? extends l> f127891d = new C14624f();

    /* renamed from: e  reason: collision with root package name */
    private p<? super Throwable, ? super n, ? extends l> f127892e = new C14625g();

    public C14626h(C17642l<? super l, C16807N> lVar, C17642l<? super C14626h<T>, C16807N> lVar2) {
        C17542s.j(lVar, "stateListener");
        C17542s.j(lVar2, "block");
        this.f127888a = lVar;
        lVar2.invoke(this);
    }

    private final d g(x<T> xVar) {
        String str;
        C15777E d10 = xVar.d();
        if (d10 == null || (str = d10.l()) == null) {
            str = "Body was null";
        }
        return new d(str, String.valueOf(xVar.b()));
    }

    private final n h(Throwable th2) {
        String message = th2.getMessage();
        if (message == null) {
            message = "No message";
        }
        return new n(message, th2);
    }

    /* access modifiers changed from: private */
    public static final C14674a i(C14674a aVar) {
        C17542s.j(aVar, "default");
        return aVar;
    }

    /* access modifiers changed from: private */
    public static final d j(d dVar) {
        C17542s.j(dVar, "default");
        return dVar;
    }

    /* access modifiers changed from: private */
    public static final n k(Throwable th2, n nVar) {
        C17542s.j(th2, "<unused var>");
        C17542s.j(nVar, "default");
        return nVar;
    }

    /* access modifiers changed from: private */
    public static final l l(Object obj, l lVar) {
        C17542s.j(lVar, "default");
        return lVar;
    }

    public void a(C16361d<T> dVar, Throwable th2) {
        C17542s.j(dVar, "call");
        C17542s.j(th2, "t");
        this.f127888a.invoke(this.f127892e.invoke(th2, h(th2)));
        C16807N n10 = C16807N.f139792a;
        e eVar = e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a((String) null, th2);
                if (a10 != null) {
                    str = C11820c.a(a10);
                } else {
                    return;
                }
            }
            String str3 = str;
            if (str2 == null) {
                String name = C14626h.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, false, th2, str3);
            str = str3;
            str2 = str4;
        }
    }

    public void b(C16361d<T> dVar, x<T> xVar) {
        C17542s.j(dVar, "call");
        C17542s.j(xVar, "response");
        T a10 = xVar.a();
        if (!xVar.e()) {
            this.f127888a.invoke(this.f127891d.invoke(g(xVar)));
        } else if (xVar.b() == 202) {
            this.f127888a.invoke(this.f127890c.invoke(C14674a.f128619a));
        } else if (a10 == null) {
            this.f127888a.invoke(this.f127891d.invoke(g(xVar)));
        } else {
            this.f127888a.invoke(this.f127889b.invoke(a10, m.f128647a));
        }
    }

    public final void m(C17642l<? super C14674a, ? extends l> lVar) {
        C17542s.j(lVar, "<set-?>");
        this.f127890c = lVar;
    }

    public final void n(C17642l<? super d, ? extends l> lVar) {
        C17542s.j(lVar, "<set-?>");
        this.f127891d = lVar;
    }

    public final void o(p<? super Throwable, ? super n, ? extends l> pVar) {
        C17542s.j(pVar, "<set-?>");
        this.f127892e = pVar;
    }

    public final void p(p<? super T, ? super l, ? extends l> pVar) {
        C17542s.j(pVar, "<set-?>");
        this.f127889b = pVar;
    }
}
