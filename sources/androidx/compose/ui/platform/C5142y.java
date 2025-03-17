package androidx.compose.ui.platform;

import G1.G;
import L1.l;
import L1.m;
import L1.p;
import L1.s;
import L1.w;
import c2.t;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u001a)\u0010\u0004\u001a\u0004\u0018\u00010\u0000*\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0002*\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\u000b\u001a\u00020\u0002*\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\r\u001a\u00020\u0002*\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\b\u001a!\u0010\u0011\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\"\u0018\u0010\u0014\u001a\u00020\u0002*\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\b¨\u0006\u0015"}, d2 = {"LG1/G;", "Lkotlin/Function1;", "", "selector", "j", "(LG1/G;LnI/l;)LG1/G;", "LL1/p;", "h", "(LL1/p;)Z", "LL1/l;", "oldConfig", "l", "(LL1/p;LL1/l;)Z", "i", "LL1/a;", "", "other", "g", "(LL1/a;Ljava/lang/Object;)Z", "k", "isRtl", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.y  reason: case insensitive filesystem */
public final class C5142y {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LG1/G;", "it", "", "a", "(LG1/G;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.y$a */
    static final class a extends C17544u implements C17642l<G, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f19676c = new a();

        a() {
            super(1);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
            if (r3.k(L1.s.f9010a.g()) != false) goto L_0x001b;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Boolean invoke(G1.G r3) {
            /*
                r2 = this;
                L1.l r3 = r3.L()
                if (r3 == 0) goto L_0x001a
                boolean r0 = r3.A()
                r1 = 1
                if (r0 != r1) goto L_0x001a
                L1.s r0 = L1.s.f9010a
                L1.w r0 = r0.g()
                boolean r3 = r3.k(r0)
                if (r3 == 0) goto L_0x001a
                goto L_0x001b
            L_0x001a:
                r1 = 0
            L_0x001b:
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.C5142y.a.invoke(G1.G):java.lang.Boolean");
        }
    }

    /* access modifiers changed from: private */
    public static final boolean g(L1.a<?> aVar, Object obj) {
        if (aVar == obj) {
            return true;
        }
        if (!(obj instanceof L1.a)) {
            return false;
        }
        L1.a aVar2 = (L1.a) obj;
        if (!C17542s.e(aVar.b(), aVar2.b())) {
            return false;
        }
        if (aVar.a() != null || aVar2.a() == null) {
            return aVar.a() == null || aVar2.a() != null;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static final boolean h(p pVar) {
        return !pVar.n().k(s.f9010a.f());
    }

    /* access modifiers changed from: private */
    public static final boolean i(p pVar) {
        l w10 = pVar.w();
        s sVar = s.f9010a;
        if (w10.k(sVar.g()) && !C17542s.e(m.a(pVar.w(), sVar.i()), Boolean.TRUE)) {
            return true;
        }
        G j10 = j(pVar.q(), a.f19676c);
        if (j10 != null) {
            l L10 = j10.L();
            if (!(L10 != null ? C17542s.e(m.a(L10, sVar.i()), Boolean.TRUE) : false)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static final G j(G g10, C17642l<? super G, Boolean> lVar) {
        for (G q02 = g10.q0(); q02 != null; q02 = q02.q0()) {
            if (lVar.invoke(q02).booleanValue()) {
                return q02;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static final boolean k(p pVar) {
        return pVar.p().getLayoutDirection() == t.Rtl;
    }

    /* access modifiers changed from: private */
    public static final boolean l(p pVar, l lVar) {
        Iterator<Map.Entry<w<?>, Object>> it = lVar.iterator();
        while (it.hasNext()) {
            if (!pVar.n().k((w) it.next().getKey())) {
                return true;
            }
        }
        return false;
    }
}
