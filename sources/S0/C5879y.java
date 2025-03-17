package s0;

import E1.C4484q;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\f\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\u000bJ+\u0010\u000e\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000bJ+\u0010\u000f\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u000bJ+\u0010\u0010\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u000bJ+\u0010\u0011\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u000bJ+\u0010\u0012\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u000bJ+\u0010\u0013\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u000b¨\u0006\u0014"}, d2 = {"Ls0/y;", "", "<init>", "()V", "", "LE1/q;", "measurables", "", "availableHeight", "mainAxisSpacing", "d", "(Ljava/util/List;II)I", "h", "availableWidth", "c", "g", "b", "f", "a", "e", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: s0.y  reason: case insensitive filesystem */
public final class C5879y {

    /* renamed from: a  reason: collision with root package name */
    public static final C5879y f28856a = new C5879y();

    private C5879y() {
    }

    public final int a(List<? extends C4484q> list, int i10, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * i11, i10);
        int size = list.size();
        int i12 = 0;
        float f10 = 0.0f;
        for (int i13 = 0; i13 < size; i13++) {
            C4484q qVar = (C4484q) list.get(i13);
            float e10 = C5838I.e(C5838I.c(qVar));
            if (e10 == 0.0f) {
                int min2 = Math.min(qVar.h0(Integer.MAX_VALUE), i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i10 - min);
                min += min2;
                i12 = Math.max(i12, qVar.x(min2));
            } else if (e10 > 0.0f) {
                f10 += e10;
            }
        }
        int round = f10 == 0.0f ? 0 : i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(((float) Math.max(i10 - min, 0)) / f10);
        int size2 = list.size();
        for (int i14 = 0; i14 < size2; i14++) {
            C4484q qVar2 = (C4484q) list.get(i14);
            float e11 = C5838I.e(C5838I.c(qVar2));
            if (e11 > 0.0f) {
                i12 = Math.max(i12, qVar2.x(round != Integer.MAX_VALUE ? Math.round(((float) round) * e11) : Integer.MAX_VALUE));
            }
        }
        return i12;
    }

    public final int b(List<? extends C4484q> list, int i10, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i12 = 0;
        int i13 = 0;
        float f10 = 0.0f;
        for (int i14 = 0; i14 < size; i14++) {
            C4484q qVar = (C4484q) list.get(i14);
            float e10 = C5838I.e(C5838I.c(qVar));
            int h02 = qVar.h0(i10);
            if (e10 == 0.0f) {
                i13 += h02;
            } else if (e10 > 0.0f) {
                f10 += e10;
                i12 = Math.max(i12, Math.round(((float) h02) / e10));
            }
        }
        return Math.round(((float) i12) * f10) + i13 + ((list.size() - 1) * i11);
    }

    public final int c(List<? extends C4484q> list, int i10, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * i11, i10);
        int size = list.size();
        int i12 = 0;
        float f10 = 0.0f;
        for (int i13 = 0; i13 < size; i13++) {
            C4484q qVar = (C4484q) list.get(i13);
            float e10 = C5838I.e(C5838I.c(qVar));
            if (e10 == 0.0f) {
                int min2 = Math.min(qVar.h0(Integer.MAX_VALUE), i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i10 - min);
                min += min2;
                i12 = Math.max(i12, qVar.V(min2));
            } else if (e10 > 0.0f) {
                f10 += e10;
            }
        }
        int round = f10 == 0.0f ? 0 : i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(((float) Math.max(i10 - min, 0)) / f10);
        int size2 = list.size();
        for (int i14 = 0; i14 < size2; i14++) {
            C4484q qVar2 = (C4484q) list.get(i14);
            float e11 = C5838I.e(C5838I.c(qVar2));
            if (e11 > 0.0f) {
                i12 = Math.max(i12, qVar2.V(round != Integer.MAX_VALUE ? Math.round(((float) round) * e11) : Integer.MAX_VALUE));
            }
        }
        return i12;
    }

    public final int d(List<? extends C4484q> list, int i10, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i12 = 0;
        int i13 = 0;
        float f10 = 0.0f;
        for (int i14 = 0; i14 < size; i14++) {
            C4484q qVar = (C4484q) list.get(i14);
            float e10 = C5838I.e(C5838I.c(qVar));
            int g02 = qVar.g0(i10);
            if (e10 == 0.0f) {
                i13 += g02;
            } else if (e10 > 0.0f) {
                f10 += e10;
                i12 = Math.max(i12, Math.round(((float) g02) / e10));
            }
        }
        return Math.round(((float) i12) * f10) + i13 + ((list.size() - 1) * i11);
    }

    public final int e(List<? extends C4484q> list, int i10, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i12 = 0;
        int i13 = 0;
        float f10 = 0.0f;
        for (int i14 = 0; i14 < size; i14++) {
            C4484q qVar = (C4484q) list.get(i14);
            float e10 = C5838I.e(C5838I.c(qVar));
            int x10 = qVar.x(i10);
            if (e10 == 0.0f) {
                i13 += x10;
            } else if (e10 > 0.0f) {
                f10 += e10;
                i12 = Math.max(i12, Math.round(((float) x10) / e10));
            }
        }
        return Math.round(((float) i12) * f10) + i13 + ((list.size() - 1) * i11);
    }

    public final int f(List<? extends C4484q> list, int i10, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * i11, i10);
        int size = list.size();
        int i12 = 0;
        float f10 = 0.0f;
        for (int i13 = 0; i13 < size; i13++) {
            C4484q qVar = (C4484q) list.get(i13);
            float e10 = C5838I.e(C5838I.c(qVar));
            if (e10 == 0.0f) {
                int min2 = Math.min(qVar.x(Integer.MAX_VALUE), i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i10 - min);
                min += min2;
                i12 = Math.max(i12, qVar.h0(min2));
            } else if (e10 > 0.0f) {
                f10 += e10;
            }
        }
        int round = f10 == 0.0f ? 0 : i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(((float) Math.max(i10 - min, 0)) / f10);
        int size2 = list.size();
        for (int i14 = 0; i14 < size2; i14++) {
            C4484q qVar2 = (C4484q) list.get(i14);
            float e11 = C5838I.e(C5838I.c(qVar2));
            if (e11 > 0.0f) {
                i12 = Math.max(i12, qVar2.h0(round != Integer.MAX_VALUE ? Math.round(((float) round) * e11) : Integer.MAX_VALUE));
            }
        }
        return i12;
    }

    public final int g(List<? extends C4484q> list, int i10, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i12 = 0;
        int i13 = 0;
        float f10 = 0.0f;
        for (int i14 = 0; i14 < size; i14++) {
            C4484q qVar = (C4484q) list.get(i14);
            float e10 = C5838I.e(C5838I.c(qVar));
            int V10 = qVar.V(i10);
            if (e10 == 0.0f) {
                i13 += V10;
            } else if (e10 > 0.0f) {
                f10 += e10;
                i12 = Math.max(i12, Math.round(((float) V10) / e10));
            }
        }
        return Math.round(((float) i12) * f10) + i13 + ((list.size() - 1) * i11);
    }

    public final int h(List<? extends C4484q> list, int i10, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * i11, i10);
        int size = list.size();
        int i12 = 0;
        float f10 = 0.0f;
        for (int i13 = 0; i13 < size; i13++) {
            C4484q qVar = (C4484q) list.get(i13);
            float e10 = C5838I.e(C5838I.c(qVar));
            if (e10 == 0.0f) {
                int min2 = Math.min(qVar.x(Integer.MAX_VALUE), i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i10 - min);
                min += min2;
                i12 = Math.max(i12, qVar.g0(min2));
            } else if (e10 > 0.0f) {
                f10 += e10;
            }
        }
        int round = f10 == 0.0f ? 0 : i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(((float) Math.max(i10 - min, 0)) / f10);
        int size2 = list.size();
        for (int i14 = 0; i14 < size2; i14++) {
            C4484q qVar2 = (C4484q) list.get(i14);
            float e11 = C5838I.e(C5838I.c(qVar2));
            if (e11 > 0.0f) {
                i12 = Math.max(i12, qVar2.g0(round != Integer.MAX_VALUE ? Math.round(((float) round) * e11) : Integer.MAX_VALUE));
            }
        }
        return i12;
    }
}
