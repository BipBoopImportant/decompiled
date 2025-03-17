package F4;

import F4.b;
import android.graphics.Color;
import android.util.TimingLogger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import x2.C6244c;

final class a {

    /* renamed from: g  reason: collision with root package name */
    private static final Comparator<b> f35358g = new C0568a();

    /* renamed from: a  reason: collision with root package name */
    final int[] f35359a;

    /* renamed from: b  reason: collision with root package name */
    final int[] f35360b;

    /* renamed from: c  reason: collision with root package name */
    final List<b.d> f35361c;

    /* renamed from: d  reason: collision with root package name */
    final TimingLogger f35362d = null;

    /* renamed from: e  reason: collision with root package name */
    final b.c[] f35363e;

    /* renamed from: f  reason: collision with root package name */
    private final float[] f35364f = new float[3];

    /* renamed from: F4.a$a  reason: collision with other inner class name */
    static class C0568a implements Comparator<b> {
        C0568a() {
        }

        /* renamed from: a */
        public int compare(b bVar, b bVar2) {
            return bVar2.g() - bVar.g();
        }
    }

    private class b {

        /* renamed from: a  reason: collision with root package name */
        private int f35365a;

        /* renamed from: b  reason: collision with root package name */
        private int f35366b;

        /* renamed from: c  reason: collision with root package name */
        private int f35367c;

        /* renamed from: d  reason: collision with root package name */
        private int f35368d;

        /* renamed from: e  reason: collision with root package name */
        private int f35369e;

        /* renamed from: f  reason: collision with root package name */
        private int f35370f;

        /* renamed from: g  reason: collision with root package name */
        private int f35371g;

        /* renamed from: h  reason: collision with root package name */
        private int f35372h;

        /* renamed from: i  reason: collision with root package name */
        private int f35373i;

        b(int i10, int i11) {
            this.f35365a = i10;
            this.f35366b = i11;
            c();
        }

        /* access modifiers changed from: package-private */
        public final boolean a() {
            return e() > 1;
        }

        /* access modifiers changed from: package-private */
        public final int b() {
            int f10 = f();
            a aVar = a.this;
            int[] iArr = aVar.f35359a;
            int[] iArr2 = aVar.f35360b;
            a.e(iArr, f10, this.f35365a, this.f35366b);
            Arrays.sort(iArr, this.f35365a, this.f35366b + 1);
            a.e(iArr, f10, this.f35365a, this.f35366b);
            int i10 = this.f35367c / 2;
            int i11 = this.f35365a;
            int i12 = 0;
            while (true) {
                int i13 = this.f35366b;
                if (i11 > i13) {
                    return this.f35365a;
                }
                i12 += iArr2[iArr[i11]];
                if (i12 >= i10) {
                    return Math.min(i13 - 1, i11);
                }
                i11++;
            }
        }

        /* access modifiers changed from: package-private */
        public final void c() {
            a aVar = a.this;
            int[] iArr = aVar.f35359a;
            int[] iArr2 = aVar.f35360b;
            int i10 = Integer.MAX_VALUE;
            int i11 = Integer.MIN_VALUE;
            int i12 = Integer.MIN_VALUE;
            int i13 = Integer.MIN_VALUE;
            int i14 = 0;
            int i15 = Integer.MAX_VALUE;
            int i16 = Integer.MAX_VALUE;
            for (int i17 = this.f35365a; i17 <= this.f35366b; i17++) {
                int i18 = iArr[i17];
                i14 += iArr2[i18];
                int k10 = a.k(i18);
                int j10 = a.j(i18);
                int i19 = a.i(i18);
                if (k10 > i11) {
                    i11 = k10;
                }
                if (k10 < i10) {
                    i10 = k10;
                }
                if (j10 > i12) {
                    i12 = j10;
                }
                if (j10 < i15) {
                    i15 = j10;
                }
                if (i19 > i13) {
                    i13 = i19;
                }
                if (i19 < i16) {
                    i16 = i19;
                }
            }
            this.f35368d = i10;
            this.f35369e = i11;
            this.f35370f = i15;
            this.f35371g = i12;
            this.f35372h = i16;
            this.f35373i = i13;
            this.f35367c = i14;
        }

        /* access modifiers changed from: package-private */
        public final b.d d() {
            a aVar = a.this;
            int[] iArr = aVar.f35359a;
            int[] iArr2 = aVar.f35360b;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            for (int i14 = this.f35365a; i14 <= this.f35366b; i14++) {
                int i15 = iArr[i14];
                int i16 = iArr2[i15];
                i11 += i16;
                i10 += a.k(i15) * i16;
                i12 += a.j(i15) * i16;
                i13 += i16 * a.i(i15);
            }
            float f10 = (float) i11;
            return new b.d(a.b(Math.round(((float) i10) / f10), Math.round(((float) i12) / f10), Math.round(((float) i13) / f10)), i11);
        }

        /* access modifiers changed from: package-private */
        public final int e() {
            return (this.f35366b + 1) - this.f35365a;
        }

        /* access modifiers changed from: package-private */
        public final int f() {
            int i10 = this.f35369e - this.f35368d;
            int i11 = this.f35371g - this.f35370f;
            int i12 = this.f35373i - this.f35372h;
            if (i10 < i11 || i10 < i12) {
                return (i11 < i10 || i11 < i12) ? -1 : -2;
            }
            return -3;
        }

        /* access modifiers changed from: package-private */
        public final int g() {
            return ((this.f35369e - this.f35368d) + 1) * ((this.f35371g - this.f35370f) + 1) * ((this.f35373i - this.f35372h) + 1);
        }

        /* access modifiers changed from: package-private */
        public final b h() {
            if (a()) {
                int b10 = b();
                b bVar = new b(b10 + 1, this.f35366b);
                this.f35366b = b10;
                c();
                return bVar;
            }
            throw new IllegalStateException("Can not split a box with only 1 color");
        }
    }

    a(int[] iArr, int i10, b.c[] cVarArr) {
        this.f35363e = cVarArr;
        int[] iArr2 = new int[32768];
        this.f35360b = iArr2;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            int g10 = g(iArr[i11]);
            iArr[i11] = g10;
            iArr2[g10] = iArr2[g10] + 1;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < 32768; i13++) {
            if (iArr2[i13] > 0 && l(i13)) {
                iArr2[i13] = 0;
            }
            if (iArr2[i13] > 0) {
                i12++;
            }
        }
        int[] iArr3 = new int[i12];
        this.f35359a = iArr3;
        int i14 = 0;
        for (int i15 = 0; i15 < 32768; i15++) {
            if (iArr2[i15] > 0) {
                iArr3[i14] = i15;
                i14++;
            }
        }
        if (i12 <= i10) {
            this.f35361c = new ArrayList();
            for (int i16 = 0; i16 < i12; i16++) {
                int i17 = iArr3[i16];
                this.f35361c.add(new b.d(a(i17), iArr2[i17]));
            }
            return;
        }
        this.f35361c = h(i10);
    }

    private static int a(int i10) {
        return b(k(i10), j(i10), i(i10));
    }

    static int b(int i10, int i11, int i12) {
        return Color.rgb(f(i10, 5, 8), f(i11, 5, 8), f(i12, 5, 8));
    }

    private List<b.d> c(Collection<b> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (b d10 : collection) {
            b.d d11 = d10.d();
            if (!n(d11)) {
                arrayList.add(d11);
            }
        }
        return arrayList;
    }

    static void e(int[] iArr, int i10, int i11, int i12) {
        if (i10 == -2) {
            while (i11 <= i12) {
                int i13 = iArr[i11];
                iArr[i11] = i(i13) | (j(i13) << 10) | (k(i13) << 5);
                i11++;
            }
        } else if (i10 == -1) {
            while (i11 <= i12) {
                int i14 = iArr[i11];
                iArr[i11] = k(i14) | (i(i14) << 10) | (j(i14) << 5);
                i11++;
            }
        }
    }

    private static int f(int i10, int i11, int i12) {
        return (i12 > i11 ? i10 << (i12 - i11) : i10 >> (i11 - i12)) & ((1 << i12) - 1);
    }

    private static int g(int i10) {
        return f(Color.blue(i10), 8, 5) | (f(Color.red(i10), 8, 5) << 10) | (f(Color.green(i10), 8, 5) << 5);
    }

    private List<b.d> h(int i10) {
        PriorityQueue priorityQueue = new PriorityQueue(i10, f35358g);
        priorityQueue.offer(new b(0, this.f35359a.length - 1));
        o(priorityQueue, i10);
        return c(priorityQueue);
    }

    static int i(int i10) {
        return i10 & 31;
    }

    static int j(int i10) {
        return (i10 >> 5) & 31;
    }

    static int k(int i10) {
        return (i10 >> 10) & 31;
    }

    private boolean l(int i10) {
        int a10 = a(i10);
        C6244c.h(a10, this.f35364f);
        return m(a10, this.f35364f);
    }

    private boolean m(int i10, float[] fArr) {
        b.c[] cVarArr = this.f35363e;
        if (cVarArr != null && cVarArr.length > 0) {
            int length = cVarArr.length;
            for (int i11 = 0; i11 < length; i11++) {
                if (!this.f35363e[i11].a(i10, fArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean n(b.d dVar) {
        return m(dVar.e(), dVar.c());
    }

    private void o(PriorityQueue<b> priorityQueue, int i10) {
        b poll;
        while (priorityQueue.size() < i10 && (poll = priorityQueue.poll()) != null && poll.a()) {
            priorityQueue.offer(poll.h());
            priorityQueue.offer(poll);
        }
    }

    /* access modifiers changed from: package-private */
    public List<b.d> d() {
        return this.f35361c;
    }
}
