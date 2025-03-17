package com.ingka.ikea.account.impl.upgrade;

import HJ.C15854t;
import Wd.M;
import XH.C16807N;
import androidx.lifecycle.F;
import cD.C14029a;
import com.ingka.ikea.dynamicfields.datalayer.DynamicFields$Configuration;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import java.util.Map;
import kD.l;
import kD.p;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u000b\u001a\u00020\b2\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ;\u0010\u0010\u001a\u00020\b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r2\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\"\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00148\u0016X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/ingka/ikea/account/impl/upgrade/N;", "LWd/M;", "LcD/a;", "repository", "<init>", "(LcD/a;)V", "Lkotlin/Function1;", "LkD/l;", "LXH/N;", "Lcom/ingka/ikea/useraccount/model/StateListener;", "stateListener", "b", "(LnI/l;)V", "", "", "data", "c", "(Ljava/util/Map;LnI/l;)V", "a", "LcD/a;", "Landroidx/lifecycle/F;", "Lcom/ingka/ikea/dynamicfields/datalayer/DynamicFields$Configuration;", "Landroidx/lifecycle/F;", "()Landroidx/lifecycle/F;", "configuration", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class N implements M {

    /* renamed from: a  reason: collision with root package name */
    private final C14029a f69844a;

    /* renamed from: b  reason: collision with root package name */
    private final F<DynamicFields$Configuration> f69845b;

    public N(C14029a aVar) {
        C17542s.j(aVar, "repository");
        this.f69844a = aVar;
        this.f69845b = aVar.n();
    }

    public F<DynamicFields$Configuration> a() {
        return this.f69845b;
    }

    public void b(C17642l<? super l, C16807N> lVar) {
        C17542s.j(lVar, "stateListener");
        try {
            this.f69844a.c(lVar);
        } catch (Exception e10) {
            e eVar = e.WARN;
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
                    String name = N.class.getName();
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
            lVar.invoke(p.f128655a);
        }
    }

    public void c(Map<String, String> map, C17642l<? super l, C16807N> lVar) {
        C17542s.j(map, "data");
        C17542s.j(lVar, "stateListener");
        this.f69844a.m(map, lVar);
    }

    public void d(C17642l<? super l, C16807N> lVar) {
        M.a.a(this, lVar);
    }
}
