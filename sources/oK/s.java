package oK;

import GJ.C15765h;
import GJ.C15768k;
import c2.n;
import c2.p;
import c2.q;
import c2.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import o1.C5673m;
import oK.C17718k;
import oK.C17719l;
import tI.C17978n;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u001a0\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a&\u0010\u000b\u001a\u00020\n*\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001b\u0010\u000f\u001a\u00020\n*\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001f\u0010\u0013\u001a\u00020\n*\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"LoK/k$a;", "Lc2/r;", "viewportSize", "unscaledImageSize", "minTileSize", "LoK/k;", "e", "(LoK/k$a;JJJ)LoK/k;", "LoK/l$a;", "scaledImageSize", "LoK/l;", "c", "(LoK/l$a;JJ)I", "", "zoom", "b", "(LoK/l$a;F)I", "", "other", "d", "(II)I", "sub-sampling-image_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class s {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LoK/l;", "current", "a", "(I)LoK/l;"}, k = 3, mv = {1, 9, 0})
    static final class a extends C17544u implements C17642l<C17719l, C17719l> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f145427c = new a();

        a() {
            super(1);
        }

        public final C17719l a(int i10) {
            if (i10 < 2) {
                return null;
            }
            return C17719l.a(s.d(i10, 2));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((C17719l) obj).h());
        }
    }

    public static final int b(C17719l.a aVar, float f10) {
        C17542s.j(aVar, "<this>");
        if (f10 == 0.0f) {
            return C17719l.c(1);
        }
        int i10 = 1;
        while (true) {
            int i11 = i10 * 2;
            if (((float) i11) > ((float) 1) / f10) {
                return C17719l.c(i10);
            }
            i10 = i11;
        }
    }

    public static final int c(C17719l.a aVar, long j10, long j11) {
        C17542s.j(aVar, "$this$calculateFor");
        if (((float) C17709b.h(j10)) > 0.0f) {
            return b(aVar, Math.min(((float) r.h(j10)) / ((float) r.h(j11)), ((float) r.g(j10)) / ((float) r.g(j11))));
        }
        String j12 = r.j(j10);
        throw new IllegalStateException(("Can't calculate a sample size for " + j12).toString());
    }

    /* access modifiers changed from: private */
    public static final int d(int i10, int i11) {
        return C17719l.c(i10 / i11);
    }

    public static final C17718k e(C17718k.a aVar, long j10, long j11, long j12) {
        long j13 = j11;
        C17542s.j(aVar, "$this$generate");
        int c10 = c(C17719l.f145388b, j10, j13);
        Object obj = null;
        C17717j jVar = new C17717j(c10, q.a(n.f23044b.a(), j13), (DefaultConstructorMarker) null);
        int i10 = 1;
        C15765h D10 = C15768k.D(C15768k.q(C17719l.a(c10), a.f145427c), 1);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = D10.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            int h10 = ((C17719l) next).h();
            long b10 = C17709b.b(C17709b.e(C5673m.o(c2.s.d(j11), ((float) h10) / ((float) c10))), j12, C17709b.a(j11, j12));
            int e10 = C17978n.e(r.h(j11) / r.h(b10), i10);
            int e11 = C17978n.e(r.g(j11) / r.g(b10), i10);
            ArrayList arrayList = new ArrayList(e10 * e11);
            int i11 = 0;
            while (i11 < e10) {
                int i12 = 0;
                while (i12 < e11) {
                    int i13 = c10;
                    Iterator it2 = it;
                    int i14 = e10;
                    arrayList.add(new C17717j(h10, new p(i11 * r.h(b10), i12 * r.g(b10), i11 == e10 + -1 ? r.h(j11) : (i11 + 1) * r.h(b10), i12 == e11 + -1 ? r.g(j11) : (i12 + 1) * r.g(b10)), (DefaultConstructorMarker) null));
                    i12++;
                    obj = null;
                    c10 = i13;
                    it = it2;
                    e10 = i14;
                    long j14 = j11;
                }
                int i15 = c10;
                Iterator it3 = it;
                Object obj2 = obj;
                int i16 = e10;
                i11++;
                long j15 = j11;
            }
            int i17 = c10;
            Iterator it4 = it;
            Object obj3 = obj;
            linkedHashMap.put(next, arrayList);
            i10 = 1;
            long j16 = j11;
        }
        return new C17718k(jVar, linkedHashMap);
    }

    public static /* synthetic */ C17718k f(C17718k.a aVar, long j10, long j11, long j12, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            j12 = r.d(j10, 2);
        }
        return e(aVar, j10, j11, j12);
    }
}
