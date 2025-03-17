package U5;

import E1.C4478k;
import T5.r;
import U0.B;
import U0.C4889m;
import U0.C4895p;
import U0.P;
import U5.e;
import V5.c;
import V5.l;
import XH.C16807N;
import android.os.Trace;
import dI.C17169j;
import k6.C8441h;
import kotlin.Metadata;
import nI.C17642l;

@Metadata(d1 = {"\u00008\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ac\u0010\u000e\u001a\u00020\r2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001aQ\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"", "model", "LT5/r;", "imageLoader", "Lkotlin/Function1;", "LU5/e$c;", "transform", "LXH/N;", "onState", "LE1/k;", "contentScale", "Lp1/E0;", "filterQuality", "LU5/e;", "a", "(Ljava/lang/Object;LT5/r;LnI/l;LnI/l;LE1/k;ILU0/m;II)LU5/e;", "LV5/c;", "state", "b", "(LV5/c;LnI/l;LnI/l;LE1/k;ILU0/m;I)LU5/e;", "coil-compose-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class f {
    public static final e a(Object obj, r rVar, C17642l<? super e.c, ? extends e.c> lVar, C17642l<? super e.c, C16807N> lVar2, C4478k kVar, int i10, C4889m mVar, int i11, int i12) {
        C17642l<e.c, e.c> lVar3 = lVar;
        if ((i12 & 4) != 0) {
            lVar3 = e.f40189y.a();
        }
        C17642l<? super e.c, ? extends e.c> lVar4 = lVar3;
        if ((i12 & 8) != 0) {
            lVar2 = null;
        }
        C17642l<? super e.c, C16807N> lVar5 = lVar2;
        if ((i12 & 16) != 0) {
            kVar = C4478k.f5915a.e();
        }
        C4478k kVar2 = kVar;
        if ((i12 & 32) != 0) {
            i10 = r1.f.f28623w0.b();
        }
        int i13 = i10;
        if (C4895p.J()) {
            C4895p.S(1066092719, i11, -1, "coil3.compose.rememberAsyncImagePainter (AsyncImagePainter.kt:113)");
        }
        e b10 = b(new c(obj, (c) mVar.Q(p.c()), rVar), lVar4, lVar5, kVar2, i13, mVar, (i11 >> 3) & 65520);
        if (C4895p.J()) {
            C4895p.R();
        }
        return b10;
    }

    private static final e b(c cVar, C17642l<? super e.c, ? extends e.c> lVar, C17642l<? super e.c, C16807N> lVar2, C4478k kVar, int i10, C4889m mVar, int i11) {
        mVar.W(-1242991349);
        if (C4895p.J()) {
            C4895p.S(-1242991349, i11, -1, "coil3.compose.rememberAsyncImagePainter (AsyncImagePainter.kt:128)");
        }
        Trace.beginSection("rememberAsyncImagePainter");
        try {
            C8441h l10 = l.l(cVar.b(), mVar, 0);
            l.v(l10);
            e.b bVar = new e.b(cVar.a(), l10, cVar.c());
            Object D10 = mVar.D();
            C4889m.a aVar = C4889m.f14007a;
            if (D10 == aVar.a()) {
                D10 = new e(bVar);
                mVar.u(D10);
            }
            e eVar = (e) D10;
            Object D11 = mVar.D();
            if (D11 == aVar.a()) {
                D11 = new B(P.k(C17169j.f142968a, mVar));
                mVar.u(D11);
            }
            eVar.F(((B) D11).a());
            eVar.G(lVar);
            eVar.B(lVar2);
            eVar.y(kVar);
            eVar.A(i10);
            eVar.D(l.j(mVar, 0));
            eVar.H(bVar);
            if (C4895p.J()) {
                C4895p.R();
            }
            mVar.P();
            Trace.endSection();
            return eVar;
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }
}
