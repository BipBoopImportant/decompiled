package l1;

import E1.C4488v;
import E1.C4489w;
import G1.A0;
import G1.B0;
import G1.C0;
import G1.C4508k;
import c2.r;
import kotlin.Metadata;
import nI.C17642l;
import o1.C5667g;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001e\u0010\n\u001a\u00020\t*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a1\u0010\u0011\u001a\u00020\u0003\"\b\b\u0000\u0010\r*\u00020\f*\u00028\u00002\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Ll1/g;", "Ll1/b;", "event", "LXH/N;", "e", "(Ll1/g;Ll1/b;)V", "Ll1/d;", "Lo1/g;", "position", "", "d", "(Ll1/d;J)Z", "LG1/B0;", "T", "Lkotlin/Function1;", "LG1/A0;", "block", "f", "(LG1/B0;LnI/l;)V", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: l1.f  reason: case insensitive filesystem */
public final class C5513f {
    /* access modifiers changed from: private */
    public static final boolean d(C5511d dVar, long j10) {
        if (!dVar.E0().j2()) {
            return false;
        }
        C4488v s10 = C4508k.m(dVar).s();
        if (!s10.c()) {
            return false;
        }
        long a10 = s10.a();
        int h10 = r.h(a10);
        int g10 = r.g(a10);
        long f10 = C4489w.f(s10);
        float m10 = C5667g.m(f10);
        float n10 = C5667g.n(f10);
        float f11 = ((float) h10) + m10;
        float f12 = ((float) g10) + n10;
        float m11 = C5667g.m(j10);
        if (m10 > m11 || m11 > f11) {
            return false;
        }
        float n11 = C5667g.n(j10);
        return n10 <= n11 && n11 <= f12;
    }

    /* access modifiers changed from: private */
    public static final void e(C5514g gVar, C5509b bVar) {
        gVar.h0(bVar);
        gVar.c0(bVar);
    }

    /* access modifiers changed from: private */
    public static final <T extends B0> void f(T t10, C17642l<? super T, ? extends A0> lVar) {
        if (lVar.invoke(t10) == A0.ContinueTraversal) {
            C0.f(t10, lVar);
        }
    }
}
