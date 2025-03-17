package u0;

import W0.b;
import YH.C16877v;
import androidx.compose.foundation.lazy.layout.d;
import kotlin.Metadata;
import p0.v;
import q0.C5764e;
import v0.K;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\f\u001a\u00020\u000b*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u000b*\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\u000b*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001c¨\u0006\u001e"}, d2 = {"Lu0/a;", "Lu0/A;", "", "nestedPrefetchItemCount", "<init>", "(I)V", "Lu0/z;", "", "delta", "Lu0/s;", "layoutInfo", "LXH/N;", "d", "(Lu0/z;FLu0/s;)V", "c", "(Lu0/z;Lu0/s;)V", "Lv0/K;", "firstVisibleItemIndex", "a", "(Lv0/K;I)V", "I", "b", "lineToPrefetch", "LW0/b;", "Landroidx/compose/foundation/lazy/layout/d$b;", "LW0/b;", "currentLinePrefetchHandles", "", "Z", "wasScrollingForward", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: u0.a  reason: case insensitive filesystem */
final class C5977a implements C5966A {

    /* renamed from: a  reason: collision with root package name */
    private final int f29640a;

    /* renamed from: b  reason: collision with root package name */
    private int f29641b = -1;

    /* renamed from: c  reason: collision with root package name */
    private final b<d.b> f29642c = new b<>(new d.b[16], 0);

    /* renamed from: d  reason: collision with root package name */
    private boolean f29643d;

    public C5977a(int i10) {
        this.f29640a = i10;
    }

    public void a(K k10, int i10) {
        int i11 = this.f29640a;
        for (int i12 = 0; i12 < i11; i12++) {
            k10.a(i10 + i12);
        }
    }

    public void c(C6002z zVar, C5995s sVar) {
        int i10;
        if (this.f29641b != -1 && !sVar.i().isEmpty()) {
            if (this.f29643d) {
                C5987k kVar = (C5987k) C16877v.I0(sVar.i());
                i10 = (sVar.a() == v.Vertical ? kVar.g() : kVar.i()) + 1;
            } else {
                C5987k kVar2 = (C5987k) C16877v.w0(sVar.i());
                i10 = (sVar.a() == v.Vertical ? kVar2.g() : kVar2.i()) - 1;
            }
            if (this.f29641b != i10) {
                this.f29641b = -1;
                b<d.b> bVar = this.f29642c;
                int r10 = bVar.r();
                if (r10 > 0) {
                    Object[] q10 = bVar.q();
                    int i11 = 0;
                    do {
                        ((d.b) q10[i11]).cancel();
                        i11++;
                    } while (i11 < r10);
                }
                this.f29642c.k();
            }
        }
    }

    public void d(C6002z zVar, float f10, C5995s sVar) {
        int i10;
        int i11;
        b<d.b> bVar;
        int r10;
        b<d.b> bVar2;
        int r11;
        b<d.b> bVar3;
        int r12;
        if (!sVar.i().isEmpty()) {
            int i12 = 0;
            boolean z10 = f10 < 0.0f;
            if (z10) {
                C5987k kVar = (C5987k) C16877v.I0(sVar.i());
                i11 = (sVar.a() == v.Vertical ? kVar.g() : kVar.i()) + 1;
                i10 = ((C5987k) C16877v.I0(sVar.i())).getIndex() + 1;
            } else {
                C5987k kVar2 = (C5987k) C16877v.w0(sVar.i());
                i11 = (sVar.a() == v.Vertical ? kVar2.g() : kVar2.i()) - 1;
                i10 = ((C5987k) C16877v.w0(sVar.i())).getIndex() - 1;
            }
            if (i10 >= 0 && i10 < sVar.f()) {
                if (i11 != this.f29641b && i11 >= 0) {
                    if (this.f29643d == z10 || (r12 = bVar3.r()) <= 0) {
                        this.f29643d = z10;
                        this.f29641b = i11;
                        this.f29642c.k();
                        b<d.b> bVar4 = this.f29642c;
                        bVar4.h(bVar4.r(), zVar.a(i11));
                    } else {
                        Object[] q10 = (bVar3 = this.f29642c).q();
                        int i13 = 0;
                        do {
                            ((d.b) q10[i13]).cancel();
                            i13++;
                        } while (i13 < r12);
                        this.f29643d = z10;
                        this.f29641b = i11;
                        this.f29642c.k();
                        b<d.b> bVar42 = this.f29642c;
                        bVar42.h(bVar42.r(), zVar.a(i11));
                    }
                }
                if (z10) {
                    C5987k kVar3 = (C5987k) C16877v.I0(sVar.i());
                    if (((float) (((C5764e.a(kVar3, sVar.a()) + C5764e.b(kVar3, sVar.a())) + sVar.g()) - sVar.e())) < (-f10) && (r11 = bVar2.r()) > 0) {
                        Object[] q11 = (bVar2 = this.f29642c).q();
                        do {
                            ((d.b) q11[i12]).a();
                            i12++;
                        } while (i12 < r11);
                    }
                } else if (((float) (sVar.h() - C5764e.a((C5987k) C16877v.w0(sVar.i()), sVar.a()))) < f10 && (r10 = bVar.r()) > 0) {
                    Object[] q12 = (bVar = this.f29642c).q();
                    do {
                        ((d.b) q12[i12]).a();
                        i12++;
                    } while (i12 < r10);
                }
            }
        }
    }
}
