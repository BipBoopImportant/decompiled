package com.ingka.ikea.app.inappfeedback;

import Bg.a;
import HJ.C15854t;
import QJ.Q;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16534i;
import androidx.lifecycle.f0;
import com.ingka.ikea.app.inappfeedback.t;
import com.sugarcube.core.logger.DslKt;
import eb.C9631b;
import eb.c;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;
import wg.C10367a;
import xa.C8971l;
import zg.C10548a;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001f\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lcom/ingka/ikea/app/inappfeedback/l;", "Landroidx/lifecycle/f0;", "Lzg/a;", "feedbackRepositoryImpl", "Leb/c;", "reviewManager", "Lwg/a;", "appRatingAnalytics", "LQJ/Q;", "defaultScope", "<init>", "(Lzg/a;Leb/c;Lwg/a;LQJ/Q;)V", "LXH/N;", "D", "()V", "F", "m", "Lzg/a;", "n", "Leb/c;", "o", "Lwg/a;", "p", "LQJ/Q;", "getDefaultScope", "()LQJ/Q;", "LTJ/B;", "Lcom/ingka/ikea/app/inappfeedback/t;", "q", "LTJ/B;", "_reviewState", "LTJ/P;", "r", "LTJ/P;", "C", "()LTJ/P;", "reviewState", "inappfeedback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l extends f0 {

    /* renamed from: m  reason: collision with root package name */
    private final C10548a f71964m;

    /* renamed from: n  reason: collision with root package name */
    private final c f71965n;

    /* renamed from: o  reason: collision with root package name */
    private final C10367a f71966o;

    /* renamed from: p  reason: collision with root package name */
    private final Q f71967p;

    /* renamed from: q  reason: collision with root package name */
    private final C16505B<t> f71968q;

    /* renamed from: r  reason: collision with root package name */
    private final C16519P<t> f71969r;

    public l(C10548a aVar, c cVar, C10367a aVar2, Q q10) {
        C17542s.j(aVar, "feedbackRepositoryImpl");
        C17542s.j(cVar, "reviewManager");
        C17542s.j(aVar2, "appRatingAnalytics");
        C17542s.j(q10, "defaultScope");
        this.f71964m = aVar;
        this.f71965n = cVar;
        this.f71966o = aVar2;
        this.f71967p = q10;
        C16505B<t> a10 = C16521S.a(null);
        this.f71968q = a10;
        this.f71969r = C16534i.c(a10);
    }

    /* access modifiers changed from: private */
    public static final void E(l lVar, C8971l lVar2) {
        C17542s.j(lVar2, "task");
        if (lVar2.q()) {
            C9631b bVar = (C9631b) lVar2.m();
            C16505B<t> b10 = lVar.f71968q;
            C17542s.g(bVar);
            b10.setValue(new t.a(bVar));
            return;
        }
        Exception l10 = lVar2.l();
        e eVar = e.WARN;
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
                String a10 = C11818a.a("ReviewInfo failed, Error: " + (l10 != null ? l10.getClass().getSimpleName() : null) + "}, Error message: " + (l10 != null ? l10.getMessage() : null), (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = lVar.getClass().getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar2.a(eVar, str4, false, (Throwable) null, str3);
            str = str3;
            str2 = str4;
        }
        lVar.f71968q.setValue(t.b.f71986a);
    }

    public final C16519P<t> C() {
        return this.f71969r;
    }

    public final void D() {
        C8971l<C9631b> a10 = this.f71965n.a();
        C17542s.i(a10, "requestReviewFlow(...)");
        a10.c(new k(this));
    }

    public final void F() {
        a.f58907a.c();
        this.f71966o.a();
    }
}
