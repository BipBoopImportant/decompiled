package com.ingka.ikea.account.impl.modalsettings.changepassword;

import Ae.h;
import HJ.C15854t;
import IC.C13023e;
import IC.C13026h;
import Rd.a;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16534i;
import Td.b;
import XH.t;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.ingka.ikea.account.impl.modalsettings.changepassword.a;
import com.ingka.ikea.account.impl.modalsettings.changepassword.b;
import com.ingka.ikea.account.impl.modalsettings.changepassword.c;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import ip.f;
import java.util.ArrayList;
import java.util.Map;
import kD.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17525a;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lD.C14759a;
import nI.r;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.e;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001b\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150#8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130#8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010%R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00110)8\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001d\u00101\u001a\b\u0012\u0004\u0012\u00020\u00170-8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b!\u00100¨\u00062"}, d2 = {"Lcom/ingka/ikea/account/impl/modalsettings/changepassword/d;", "Landroidx/lifecycle/f0;", "LTd/a;", "accountAnalytics", "LlD/a;", "getChangePasswordHlpUrlUseCase", "<init>", "(LTd/a;LlD/a;)V", "LXH/N;", "C", "()V", "E", "D", "LRd/a$b;", "result", "i", "(LRd/a$b;)V", "LkD/c;", "urlState", "LIC/e;", "userMessage", "Lcom/ingka/ikea/account/impl/modalsettings/changepassword/a;", "navigateTo", "Lcom/ingka/ikea/account/impl/modalsettings/changepassword/c;", "F", "(LkD/c;LIC/e;Lcom/ingka/ikea/account/impl/modalsettings/changepassword/a;)Lcom/ingka/ikea/account/impl/modalsettings/changepassword/c;", "destination", "G", "(Lcom/ingka/ikea/account/impl/modalsettings/changepassword/a;)V", "Lcom/ingka/ikea/account/impl/modalsettings/changepassword/b;", "event", "H", "(Lcom/ingka/ikea/account/impl/modalsettings/changepassword/b;)V", "m", "LTd/a;", "LTJ/B;", "n", "LTJ/B;", "navigateToFlow", "o", "userMessageFlow", "LTJ/g;", "p", "LTJ/g;", "changePasswordHlpUrlFlow", "LTJ/P;", "q", "LTJ/P;", "()LTJ/P;", "uiState", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d extends f0 {

    /* renamed from: m  reason: collision with root package name */
    private final Td.a f69677m;

    /* renamed from: n  reason: collision with root package name */
    private final C16505B<a> f69678n;

    /* renamed from: o  reason: collision with root package name */
    private final C16505B<C13023e> f69679o;

    /* renamed from: p  reason: collision with root package name */
    private final C16532g<c> f69680p;

    /* renamed from: q  reason: collision with root package name */
    private final C16519P<c> f69681q;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a extends C17525a implements r<c, C13023e, a, C17164e<? super c>, Object> {
        a(Object obj) {
            super(4, obj, d.class, "mapToUiState", "mapToUiState(Lcom/ingka/ikea/useraccount/model/HlpUrlState;Lcom/ingka/ikea/ui/common/UiText;Lcom/ingka/ikea/account/impl/modalsettings/changepassword/ChangePassword$Destination;)Lcom/ingka/ikea/account/impl/modalsettings/changepassword/ChangePassword$UiState;", 4);
        }

        /* renamed from: a */
        public final Object l(c cVar, C13023e eVar, a aVar, C17164e<? super c> eVar2) {
            return ((d) this.f144363a).F(cVar, eVar, aVar);
        }
    }

    public d(Td.a aVar, C14759a aVar2) {
        C17542s.j(aVar, "accountAnalytics");
        C17542s.j(aVar2, "getChangePasswordHlpUrlUseCase");
        this.f69677m = aVar;
        C16505B<a> a10 = C16521S.a(null);
        this.f69678n = a10;
        C16505B<C13023e> a11 = C16521S.a(null);
        this.f69679o = a11;
        C16532g<c> invoke = aVar2.invoke();
        this.f69680p = invoke;
        this.f69681q = C16534i.c0(C16534i.m(invoke, a11, a10, new a(this)), g0.a(this), f.a(), new c.C1202c((C13023e) null, (a) null, 3, (DefaultConstructorMarker) null));
    }

    private final void C() {
        c value = this.f69681q.getValue();
        if (value instanceof c.b) {
            h.a.a(this.f69677m, b.CHANGE_PASSWORD_BEGIN, (Map) null, 2, (Object) null);
            G(new a.b(((c.b) value).c()));
            return;
        }
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
                String a10 = C11818a.a("Clicked ChangePassword without url available", (Throwable) null);
                if (a10 != null) {
                    str = C11820c.a(a10);
                } else {
                    return;
                }
            }
            String str3 = str;
            if (str2 == null) {
                String name = d.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, false, (Throwable) null, str3);
            str = str3;
            str2 = str4;
        }
    }

    private final void D() {
        this.f69679o.setValue(null);
    }

    private final void E() {
        this.f69679o.setValue(C13026h.a(Sd.f.f63365e));
    }

    /* access modifiers changed from: private */
    public final c F(kD.c cVar, C13023e eVar, a aVar) {
        if (cVar instanceof c.C3171c) {
            return new c.C1202c(eVar, aVar);
        }
        if (cVar instanceof c.a) {
            return new c.a(aVar);
        }
        if (cVar instanceof c.b) {
            return new c.b(eVar, aVar, ((c.b) cVar).a());
        }
        throw new t();
    }

    private final void G(a aVar) {
        this.f69678n.setValue(aVar);
    }

    private final void i(a.b bVar) {
        G(new a.C1200a(bVar));
    }

    public final void H(b bVar) {
        C17542s.j(bVar, "event");
        if (bVar instanceof b.a) {
            i(a.b.C1080a.f63189a);
        } else if (bVar instanceof b.C1201b) {
            C();
        } else if (bVar instanceof b.d) {
            G((a) null);
        } else if (bVar instanceof b.e) {
            E();
        } else if (bVar instanceof b.c) {
            D();
        } else {
            throw new t();
        }
    }

    public final C16519P<c> m() {
        return this.f69681q;
    }
}
