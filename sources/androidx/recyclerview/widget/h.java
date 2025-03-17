package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class h {

    /* renamed from: a  reason: collision with root package name */
    private static final Comparator<d> f44019a = new a();

    class a implements Comparator<d> {
        a() {
        }

        /* renamed from: a */
        public int compare(d dVar, d dVar2) {
            return dVar.f44022a - dVar2.f44022a;
        }
    }

    public static abstract class b {
        public abstract boolean a(int i10, int i11);

        public abstract boolean b(int i10, int i11);

        public Object c(int i10, int i11) {
            return null;
        }

        public abstract int d();

        public abstract int e();
    }

    static class c {

        /* renamed from: a  reason: collision with root package name */
        private final int[] f44020a;

        /* renamed from: b  reason: collision with root package name */
        private final int f44021b;

        c(int i10) {
            int[] iArr = new int[i10];
            this.f44020a = iArr;
            this.f44021b = iArr.length / 2;
        }

        /* access modifiers changed from: package-private */
        public int[] a() {
            return this.f44020a;
        }

        /* access modifiers changed from: package-private */
        public int b(int i10) {
            return this.f44020a[i10 + this.f44021b];
        }

        /* access modifiers changed from: package-private */
        public void c(int i10, int i11) {
            this.f44020a[i10 + this.f44021b] = i11;
        }
    }

    static class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f44022a;

        /* renamed from: b  reason: collision with root package name */
        public final int f44023b;

        /* renamed from: c  reason: collision with root package name */
        public final int f44024c;

        d(int i10, int i11, int i12) {
            this.f44022a = i10;
            this.f44023b = i11;
            this.f44024c = i12;
        }

        /* access modifiers changed from: package-private */
        public int a() {
            return this.f44022a + this.f44024c;
        }

        /* access modifiers changed from: package-private */
        public int b() {
            return this.f44023b + this.f44024c;
        }
    }

    public static class e {

        /* renamed from: a  reason: collision with root package name */
        private final List<d> f44025a;

        /* renamed from: b  reason: collision with root package name */
        private final int[] f44026b;

        /* renamed from: c  reason: collision with root package name */
        private final int[] f44027c;

        /* renamed from: d  reason: collision with root package name */
        private final b f44028d;

        /* renamed from: e  reason: collision with root package name */
        private final int f44029e;

        /* renamed from: f  reason: collision with root package name */
        private final int f44030f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean f44031g;

        e(b bVar, List<d> list, int[] iArr, int[] iArr2, boolean z10) {
            this.f44025a = list;
            this.f44026b = iArr;
            this.f44027c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.f44028d = bVar;
            this.f44029e = bVar.e();
            this.f44030f = bVar.d();
            this.f44031g = z10;
            a();
            e();
        }

        private void a() {
            d dVar = this.f44025a.isEmpty() ? null : this.f44025a.get(0);
            if (!(dVar != null && dVar.f44022a == 0 && dVar.f44023b == 0)) {
                this.f44025a.add(0, new d(0, 0, 0));
            }
            this.f44025a.add(new d(this.f44029e, this.f44030f, 0));
        }

        private void d(int i10) {
            int size = this.f44025a.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                d dVar = this.f44025a.get(i12);
                while (i11 < dVar.f44023b) {
                    if (this.f44027c[i11] != 0 || !this.f44028d.b(i10, i11)) {
                        i11++;
                    } else {
                        int i13 = this.f44028d.a(i10, i11) ? 8 : 4;
                        this.f44026b[i10] = (i11 << 4) | i13;
                        this.f44027c[i11] = (i10 << 4) | i13;
                        return;
                    }
                }
                i11 = dVar.b();
            }
        }

        private void e() {
            for (d next : this.f44025a) {
                for (int i10 = 0; i10 < next.f44024c; i10++) {
                    int i11 = next.f44022a + i10;
                    int i12 = next.f44023b + i10;
                    int i13 = this.f44028d.a(i11, i12) ? 1 : 2;
                    this.f44026b[i11] = (i12 << 4) | i13;
                    this.f44027c[i12] = (i11 << 4) | i13;
                }
            }
            if (this.f44031g) {
                f();
            }
        }

        private void f() {
            int i10 = 0;
            for (d next : this.f44025a) {
                while (i10 < next.f44022a) {
                    if (this.f44026b[i10] == 0) {
                        d(i10);
                    }
                    i10++;
                }
                i10 = next.a();
            }
        }

        private static g g(Collection<g> collection, int i10, boolean z10) {
            g gVar;
            Iterator<g> it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    gVar = null;
                    break;
                }
                gVar = it.next();
                if (gVar.f44032a == i10 && gVar.f44034c == z10) {
                    it.remove();
                    break;
                }
            }
            while (it.hasNext()) {
                g next = it.next();
                if (z10) {
                    next.f44033b--;
                } else {
                    next.f44033b++;
                }
            }
            return gVar;
        }

        public void b(r rVar) {
            int i10;
            e eVar = rVar instanceof e ? (e) rVar : new e(rVar);
            int i11 = this.f44029e;
            ArrayDeque arrayDeque = new ArrayDeque();
            int i12 = this.f44029e;
            int i13 = this.f44030f;
            for (int size = this.f44025a.size() - 1; size >= 0; size--) {
                d dVar = this.f44025a.get(size);
                int a10 = dVar.a();
                int b10 = dVar.b();
                while (true) {
                    if (i12 <= a10) {
                        break;
                    }
                    i12--;
                    int i14 = this.f44026b[i12];
                    if ((i14 & 12) != 0) {
                        int i15 = i14 >> 4;
                        g g10 = g(arrayDeque, i15, false);
                        if (g10 != null) {
                            int i16 = (i11 - g10.f44033b) - 1;
                            eVar.d(i12, i16);
                            if ((i14 & 4) != 0) {
                                eVar.c(i16, 1, this.f44028d.c(i12, i15));
                            }
                        } else {
                            arrayDeque.add(new g(i12, (i11 - i12) - 1, true));
                        }
                    } else {
                        eVar.b(i12, 1);
                        i11--;
                    }
                }
                while (i13 > b10) {
                    i13--;
                    int i17 = this.f44027c[i13];
                    if ((i17 & 12) != 0) {
                        int i18 = i17 >> 4;
                        g g11 = g(arrayDeque, i18, true);
                        if (g11 == null) {
                            arrayDeque.add(new g(i13, i11 - i12, false));
                        } else {
                            eVar.d((i11 - g11.f44033b) - 1, i12);
                            if ((i17 & 4) != 0) {
                                eVar.c(i12, 1, this.f44028d.c(i18, i13));
                            }
                        }
                    } else {
                        eVar.a(i12, 1);
                        i11++;
                    }
                }
                int i19 = dVar.f44022a;
                int i20 = dVar.f44023b;
                for (i10 = 0; i10 < dVar.f44024c; i10++) {
                    if ((this.f44026b[i19] & 15) == 2) {
                        eVar.c(i19, 1, this.f44028d.c(i19, i20));
                    }
                    i19++;
                    i20++;
                }
                i12 = dVar.f44022a;
                i13 = dVar.f44023b;
            }
            eVar.e();
        }

        public void c(RecyclerView.h hVar) {
            b(new b(hVar));
        }
    }

    public static abstract class f<T> {
        public abstract boolean areContentsTheSame(T t10, T t11);

        public abstract boolean areItemsTheSame(T t10, T t11);

        public Object getChangePayload(T t10, T t11) {
            return null;
        }
    }

    private static class g {

        /* renamed from: a  reason: collision with root package name */
        int f44032a;

        /* renamed from: b  reason: collision with root package name */
        int f44033b;

        /* renamed from: c  reason: collision with root package name */
        boolean f44034c;

        g(int i10, int i11, boolean z10) {
            this.f44032a = i10;
            this.f44033b = i11;
            this.f44034c = z10;
        }
    }

    /* renamed from: androidx.recyclerview.widget.h$h  reason: collision with other inner class name */
    static class C0754h {

        /* renamed from: a  reason: collision with root package name */
        int f44035a;

        /* renamed from: b  reason: collision with root package name */
        int f44036b;

        /* renamed from: c  reason: collision with root package name */
        int f44037c;

        /* renamed from: d  reason: collision with root package name */
        int f44038d;

        public C0754h() {
        }

        /* access modifiers changed from: package-private */
        public int a() {
            return this.f44038d - this.f44037c;
        }

        /* access modifiers changed from: package-private */
        public int b() {
            return this.f44036b - this.f44035a;
        }

        public C0754h(int i10, int i11, int i12, int i13) {
            this.f44035a = i10;
            this.f44036b = i11;
            this.f44037c = i12;
            this.f44038d = i13;
        }
    }

    static class i {

        /* renamed from: a  reason: collision with root package name */
        public int f44039a;

        /* renamed from: b  reason: collision with root package name */
        public int f44040b;

        /* renamed from: c  reason: collision with root package name */
        public int f44041c;

        /* renamed from: d  reason: collision with root package name */
        public int f44042d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f44043e;

        i() {
        }

        /* access modifiers changed from: package-private */
        public int a() {
            return Math.min(this.f44041c - this.f44039a, this.f44042d - this.f44040b);
        }

        /* access modifiers changed from: package-private */
        public boolean b() {
            return this.f44042d - this.f44040b != this.f44041c - this.f44039a;
        }

        /* access modifiers changed from: package-private */
        public boolean c() {
            return this.f44042d - this.f44040b > this.f44041c - this.f44039a;
        }

        /* access modifiers changed from: package-private */
        public d d() {
            if (b()) {
                return this.f44043e ? new d(this.f44039a, this.f44040b, a()) : c() ? new d(this.f44039a, this.f44040b + 1, a()) : new d(this.f44039a + 1, this.f44040b, a());
            }
            int i10 = this.f44039a;
            return new d(i10, this.f44040b, this.f44041c - i10);
        }
    }

    private static i a(C0754h hVar, b bVar, c cVar, c cVar2, int i10) {
        int i11;
        int i12;
        int i13;
        boolean z10 = (hVar.b() - hVar.a()) % 2 == 0;
        int b10 = hVar.b() - hVar.a();
        int i14 = -i10;
        int i15 = i14;
        while (i15 <= i10) {
            if (i15 == i14 || (i15 != i10 && cVar2.b(i15 + 1) < cVar2.b(i15 - 1))) {
                i12 = cVar2.b(i15 + 1);
                i11 = i12;
            } else {
                i12 = cVar2.b(i15 - 1);
                i11 = i12 - 1;
            }
            int i16 = hVar.f44038d - ((hVar.f44036b - i11) - i15);
            int i17 = (i10 == 0 || i11 != i12) ? i16 : i16 + 1;
            while (i11 > hVar.f44035a && i16 > hVar.f44037c && bVar.b(i11 - 1, i16 - 1)) {
                i11--;
                i16--;
            }
            cVar2.c(i15, i11);
            if (!z10 || (i13 = b10 - i15) < i14 || i13 > i10 || cVar.b(i13) < i11) {
                i15 += 2;
            } else {
                i iVar = new i();
                iVar.f44039a = i11;
                iVar.f44040b = i16;
                iVar.f44041c = i12;
                iVar.f44042d = i17;
                iVar.f44043e = true;
                return iVar;
            }
        }
        return null;
    }

    public static e b(b bVar) {
        return c(bVar, true);
    }

    public static e c(b bVar, boolean z10) {
        int e10 = bVar.e();
        int d10 = bVar.d();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C0754h(0, e10, 0, d10));
        int i10 = ((((e10 + d10) + 1) / 2) * 2) + 1;
        c cVar = new c(i10);
        c cVar2 = new c(i10);
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            C0754h hVar = (C0754h) arrayList2.remove(arrayList2.size() - 1);
            i e11 = e(hVar, bVar, cVar, cVar2);
            if (e11 != null) {
                if (e11.a() > 0) {
                    arrayList.add(e11.d());
                }
                C0754h hVar2 = arrayList3.isEmpty() ? new C0754h() : (C0754h) arrayList3.remove(arrayList3.size() - 1);
                hVar2.f44035a = hVar.f44035a;
                hVar2.f44037c = hVar.f44037c;
                hVar2.f44036b = e11.f44039a;
                hVar2.f44038d = e11.f44040b;
                arrayList2.add(hVar2);
                hVar.f44036b = hVar.f44036b;
                hVar.f44038d = hVar.f44038d;
                hVar.f44035a = e11.f44041c;
                hVar.f44037c = e11.f44042d;
                arrayList2.add(hVar);
            } else {
                arrayList3.add(hVar);
            }
        }
        Collections.sort(arrayList, f44019a);
        return new e(bVar, arrayList, cVar.a(), cVar2.a(), z10);
    }

    private static i d(C0754h hVar, b bVar, c cVar, c cVar2, int i10) {
        int i11;
        int i12;
        int i13;
        boolean z10 = true;
        if (Math.abs(hVar.b() - hVar.a()) % 2 != 1) {
            z10 = false;
        }
        int b10 = hVar.b() - hVar.a();
        int i14 = -i10;
        int i15 = i14;
        while (i15 <= i10) {
            if (i15 == i14 || (i15 != i10 && cVar.b(i15 + 1) > cVar.b(i15 - 1))) {
                i12 = cVar.b(i15 + 1);
                i11 = i12;
            } else {
                i12 = cVar.b(i15 - 1);
                i11 = i12 + 1;
            }
            int i16 = (hVar.f44037c + (i11 - hVar.f44035a)) - i15;
            int i17 = (i10 == 0 || i11 != i12) ? i16 : i16 - 1;
            while (i11 < hVar.f44036b && i16 < hVar.f44038d && bVar.b(i11, i16)) {
                i11++;
                i16++;
            }
            cVar.c(i15, i11);
            if (!z10 || (i13 = b10 - i15) < i14 + 1 || i13 > i10 - 1 || cVar2.b(i13) > i11) {
                i15 += 2;
            } else {
                i iVar = new i();
                iVar.f44039a = i12;
                iVar.f44040b = i17;
                iVar.f44041c = i11;
                iVar.f44042d = i16;
                iVar.f44043e = false;
                return iVar;
            }
        }
        return null;
    }

    private static i e(C0754h hVar, b bVar, c cVar, c cVar2) {
        if (hVar.b() >= 1 && hVar.a() >= 1) {
            int b10 = ((hVar.b() + hVar.a()) + 1) / 2;
            cVar.c(1, hVar.f44035a);
            cVar2.c(1, hVar.f44036b);
            for (int i10 = 0; i10 < b10; i10++) {
                i d10 = d(hVar, bVar, cVar, cVar2, i10);
                if (d10 != null) {
                    return d10;
                }
                i a10 = a(hVar, bVar, cVar, cVar2, i10);
                if (a10 != null) {
                    return a10;
                }
            }
        }
        return null;
    }
}
