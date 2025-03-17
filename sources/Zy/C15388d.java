package zy;

import E1.H;
import E1.I;
import E1.J;
import E1.K;
import E1.a0;
import XH.C16807N;
import YH.C16877v;
import c2.C5267b;
import c2.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tI.C17978n;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u000f\u001a\u00020\u000e*\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0012\u001a\u00020\u0011*\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015¨\u0006\u0018"}, d2 = {"Lzy/d;", "LE1/I;", "Lc2/h;", "minWidth", "spacedByHorizontally", "spacedByVertically", "<init>", "(FFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "LE1/K;", "", "LE1/H;", "measurables", "Lc2/b;", "constraints", "", "e", "(LE1/K;Ljava/util/List;J)I", "LE1/J;", "i", "(LE1/K;Ljava/util/List;J)LE1/J;", "a", "F", "b", "c", "room-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: zy.d  reason: case insensitive filesystem */
final class C15388d implements I {

    /* renamed from: a  reason: collision with root package name */
    private final float f132772a;

    /* renamed from: b  reason: collision with root package name */
    private final float f132773b;

    /* renamed from: c  reason: collision with root package name */
    private final float f132774c;

    public /* synthetic */ C15388d(float f10, float f11, float f12, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.Number} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: java.lang.Integer} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int e(E1.K r7, java.util.List<? extends E1.H> r8, long r9) {
        /*
            r6 = this;
            float r0 = r6.f132772a
            float r0 = r7.H1(r0)
            int r1 = c2.C5267b.l(r9)
            float r1 = (float) r1
            float r1 = r1 / r0
            int r1 = (int) r1
            int r8 = r8.size()
            r2 = 1
            int r8 = tI.C17978n.m(r1, r2, r8)
            float r1 = r6.f132773b
            r3 = 0
            float r3 = (float) r3
            float r3 = c2.h.B(r3)
            int r1 = c2.h.v(r1, r3)
            if (r1 <= 0) goto L_0x005f
            float r1 = r6.f132773b
            float r7 = r7.H1(r1)
            tI.j r1 = new tI.j
            r1.<init>(r2, r8)
            java.util.Iterator r8 = r1.iterator()
            r1 = 0
        L_0x0034:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L_0x0056
            java.lang.Object r3 = r8.next()
            r4 = r3
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            float r5 = (float) r4
            float r5 = r5 * r0
            int r4 = r4 - r2
            float r4 = (float) r4
            float r4 = r4 * r7
            float r5 = r5 + r4
            int r4 = c2.C5267b.l(r9)
            float r4 = (float) r4
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 > 0) goto L_0x0034
            r1 = r3
            goto L_0x0034
        L_0x0056:
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L_0x0060
            int r2 = r1.intValue()
            goto L_0x0060
        L_0x005f:
            r2 = r8
        L_0x0060:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: zy.C15388d.e(E1.K, java.util.List, long):int");
    }

    /* access modifiers changed from: private */
    public static final C16807N f(a0.a aVar) {
        C17542s.j(aVar, "$this$layout");
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N g(float f10, float f11, K k10, List list, int i10, int i11, int i12, int i13, a0.a aVar) {
        C17542s.j(aVar, "$this$layout");
        int i14 = (int) f10;
        int i15 = (int) f11;
        int i16 = 0;
        if (k10.getLayoutDirection() == t.Ltr) {
            for (Object next : list) {
                int i17 = i16 + 1;
                if (i16 < 0) {
                    C16877v.x();
                }
                a0.a aVar2 = aVar;
                a0.a.m(aVar2, (a0) next, (i11 + i14) * (i16 % i10), (i16 / i10) * (i12 + i15), 0.0f, 4, (Object) null);
                i16 = i17;
            }
        } else {
            for (Object next2 : list) {
                int i18 = i16 + 1;
                if (i16 < 0) {
                    C16877v.x();
                }
                a0.a aVar3 = aVar;
                a0.a.m(aVar3, (a0) next2, (i13 - ((i10 * i11) + ((i10 - 1) * i14))) + ((i16 % i10) * (i11 + i14)), (i16 / i10) * (i12 + i15), 0.0f, 4, (Object) null);
                i16 = i18;
            }
        }
        return C16807N.f139792a;
    }

    public J i(K k10, List<? extends H> list, long j10) {
        int i10;
        K k11 = k10;
        List<? extends H> list2 = list;
        C17542s.j(k11, "$this$measure");
        C17542s.j(list2, "measurables");
        if (C5267b.p(j10) || list.isEmpty()) {
            return K.v0(k10, 0, 0, (Map) null, new C15386b(), 4, (Object) null);
        }
        float H12 = k11.H1(this.f132773b);
        float H13 = k11.H1(this.f132774c);
        int e10 = e(k10, list, j10);
        int size = ((list.size() + e10) - 1) / e10;
        if (C5267b.h(j10)) {
            i10 = (int) ((((float) C5267b.l(j10)) - (((float) (e10 - 1)) * H12)) / ((float) e10));
        } else {
            Iterator it = list2.iterator();
            if (it.hasNext()) {
                i10 = ((H) it.next()).h0(Integer.MAX_VALUE);
                while (it.hasNext()) {
                    int h02 = ((H) it.next()).h0(Integer.MAX_VALUE);
                    if (i10 < h02) {
                        i10 = h02;
                    }
                }
            } else {
                throw new NoSuchElementException();
            }
        }
        Iterable<H> iterable = list2;
        Iterator it2 = iterable.iterator();
        if (it2.hasNext()) {
            int x10 = ((H) it2.next()).x(i10);
            while (it2.hasNext()) {
                int x11 = ((H) it2.next()).x(i10);
                if (x10 < x11) {
                    x10 = x11;
                }
            }
            if (C5267b.g(j10)) {
                x10 = Math.min(x10, (int) ((((float) C5267b.k(j10)) - (((float) (size - 1)) * H13)) / ((float) size)));
            }
            long c10 = C5267b.c(j10, i10, i10, x10, x10);
            ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
            for (H i02 : iterable) {
                arrayList.add(i02.i0(c10));
            }
            int i11 = (int) (((float) (e10 * i10)) + (((float) (e10 - 1)) * H12));
            if (C5267b.h(j10)) {
                i11 = C17978n.m(i11, C5267b.n(j10), C5267b.l(j10));
            }
            int i12 = i11;
            int i13 = (int) (((float) (size * x10)) + (((float) (size - 1)) * H13));
            if (C5267b.g(j10)) {
                i13 = C17978n.m(i13, C5267b.m(j10), C5267b.k(j10));
            }
            return K.v0(k10, i12, i13, (Map) null, new C15387c(H12, H13, k10, arrayList, e10, i10, x10, i12), 4, (Object) null);
        }
        throw new NoSuchElementException();
    }

    private C15388d(float f10, float f11, float f12) {
        this.f132772a = f10;
        this.f132773b = f11;
        this.f132774c = f12;
    }
}
