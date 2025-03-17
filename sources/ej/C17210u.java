package eJ;

import eJ.C17193d;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

/* renamed from: eJ.u  reason: case insensitive filesystem */
class C17210u extends C17193d {
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final int[] f143086h;

    /* renamed from: b  reason: collision with root package name */
    private final int f143087b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C17193d f143088c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final C17193d f143089d;

    /* renamed from: e  reason: collision with root package name */
    private final int f143090e;

    /* renamed from: f  reason: collision with root package name */
    private final int f143091f;

    /* renamed from: g  reason: collision with root package name */
    private int f143092g;

    /* renamed from: eJ.u$b */
    private static class b {

        /* renamed from: a  reason: collision with root package name */
        private final Stack<C17193d> f143093a;

        private b() {
            this.f143093a = new Stack<>();
        }

        /* access modifiers changed from: private */
        public C17193d b(C17193d dVar, C17193d dVar2) {
            c(dVar);
            c(dVar2);
            C17193d pop = this.f143093a.pop();
            while (!this.f143093a.isEmpty()) {
                pop = new C17210u(this.f143093a.pop(), pop);
            }
            return pop;
        }

        private void c(C17193d dVar) {
            if (dVar.t()) {
                e(dVar);
            } else if (dVar instanceof C17210u) {
                C17210u uVar = (C17210u) dVar;
                c(uVar.f143088c);
                c(uVar.f143089d);
            } else {
                String valueOf = String.valueOf(dVar.getClass());
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 49);
                sb2.append("Has a new type of ByteString been created? Found ");
                sb2.append(valueOf);
                throw new IllegalArgumentException(sb2.toString());
            }
        }

        private int d(int i10) {
            int binarySearch = Arrays.binarySearch(C17210u.f143086h, i10);
            return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
        }

        private void e(C17193d dVar) {
            int d10 = d(dVar.size());
            int i10 = C17210u.f143086h[d10 + 1];
            if (this.f143093a.isEmpty() || this.f143093a.peek().size() >= i10) {
                this.f143093a.push(dVar);
                return;
            }
            int i11 = C17210u.f143086h[d10];
            C17193d pop = this.f143093a.pop();
            while (!this.f143093a.isEmpty() && this.f143093a.peek().size() < i11) {
                pop = new C17210u(this.f143093a.pop(), pop);
            }
            C17210u uVar = new C17210u(pop, dVar);
            while (!this.f143093a.isEmpty()) {
                if (this.f143093a.peek().size() >= C17210u.f143086h[d(uVar.size()) + 1]) {
                    break;
                }
                uVar = new C17210u(this.f143093a.pop(), uVar);
            }
            this.f143093a.push(uVar);
        }
    }

    /* renamed from: eJ.u$c */
    private static class c implements Iterator<C17205p> {

        /* renamed from: a  reason: collision with root package name */
        private final Stack<C17210u> f143094a;

        /* renamed from: b  reason: collision with root package name */
        private C17205p f143095b;

        private C17205p a(C17193d dVar) {
            while (dVar instanceof C17210u) {
                C17210u uVar = (C17210u) dVar;
                this.f143094a.push(uVar);
                dVar = uVar.f143088c;
            }
            return (C17205p) dVar;
        }

        private C17205p c() {
            while (!this.f143094a.isEmpty()) {
                C17205p a10 = a(this.f143094a.pop().f143089d);
                if (!a10.isEmpty()) {
                    return a10;
                }
            }
            return null;
        }

        /* renamed from: d */
        public C17205p next() {
            C17205p pVar = this.f143095b;
            if (pVar != null) {
                this.f143095b = c();
                return pVar;
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            return this.f143095b != null;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        private c(C17193d dVar) {
            this.f143094a = new Stack<>();
            this.f143095b = a(dVar);
        }
    }

    /* renamed from: eJ.u$d */
    private class d implements C17193d.a {

        /* renamed from: a  reason: collision with root package name */
        private final c f143096a;

        /* renamed from: b  reason: collision with root package name */
        private C17193d.a f143097b;

        /* renamed from: c  reason: collision with root package name */
        int f143098c;

        /* renamed from: a */
        public Byte next() {
            return Byte.valueOf(b());
        }

        public byte b() {
            if (!this.f143097b.hasNext()) {
                this.f143097b = this.f143096a.next().iterator();
            }
            this.f143098c--;
            return this.f143097b.b();
        }

        public boolean hasNext() {
            return this.f143098c > 0;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        private d() {
            c cVar = new c(C17210u.this);
            this.f143096a = cVar;
            this.f143097b = cVar.next().iterator();
            this.f143098c = C17210u.this.size();
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        int i10 = 1;
        int i11 = 1;
        while (i10 > 0) {
            arrayList.add(Integer.valueOf(i10));
            int i12 = i11 + i10;
            i11 = i10;
            i10 = i12;
        }
        arrayList.add(Integer.MAX_VALUE);
        f143086h = new int[arrayList.size()];
        int i13 = 0;
        while (true) {
            int[] iArr = f143086h;
            if (i13 < iArr.length) {
                iArr[i13] = ((Integer) arrayList.get(i13)).intValue();
                i13++;
            } else {
                return;
            }
        }
    }

    static C17193d O(C17193d dVar, C17193d dVar2) {
        C17210u uVar = dVar instanceof C17210u ? (C17210u) dVar : null;
        if (dVar2.size() == 0) {
            return dVar;
        }
        if (dVar.size() != 0) {
            int size = dVar.size() + dVar2.size();
            if (size < 128) {
                return P(dVar, dVar2);
            }
            if (uVar != null && uVar.f143089d.size() + dVar2.size() < 128) {
                dVar2 = new C17210u(uVar.f143088c, P(uVar.f143089d, dVar2));
            } else if (uVar == null || uVar.f143088c.s() <= uVar.f143089d.s() || uVar.s() <= dVar2.s()) {
                return size >= f143086h[Math.max(dVar.s(), dVar2.s()) + 1] ? new C17210u(dVar, dVar2) : new b().b(dVar, dVar2);
            } else {
                dVar2 = new C17210u(uVar.f143088c, new C17210u(uVar.f143089d, dVar2));
            }
        }
        return dVar2;
    }

    private static C17205p P(C17193d dVar, C17193d dVar2) {
        int size = dVar.size();
        int size2 = dVar2.size();
        byte[] bArr = new byte[(size + size2)];
        dVar.q(bArr, 0, 0, size);
        dVar2.q(bArr, 0, size, size2);
        return new C17205p(bArr);
    }

    private boolean Q(C17193d dVar) {
        c cVar = new c(this);
        C17205p pVar = (C17205p) cVar.next();
        c cVar2 = new c(dVar);
        C17205p pVar2 = (C17205p) cVar2.next();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int size = pVar.size() - i10;
            int size2 = pVar2.size() - i11;
            int min = Math.min(size, size2);
            if (!(i10 == 0 ? pVar.L(pVar2, i11, min) : pVar2.L(pVar, i10, min))) {
                return false;
            }
            i12 += min;
            int i13 = this.f143087b;
            if (i12 < i13) {
                if (min == size) {
                    pVar = (C17205p) cVar.next();
                    i10 = 0;
                } else {
                    i10 += min;
                }
                if (min == size2) {
                    pVar2 = (C17205p) cVar2.next();
                    i11 = 0;
                } else {
                    i11 += min;
                }
            } else if (i12 == i13) {
                return true;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public C17194e A() {
        return C17194e.h(new e());
    }

    /* access modifiers changed from: protected */
    public int C(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.f143090e;
        if (i13 <= i14) {
            return this.f143088c.C(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.f143089d.C(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.f143089d.C(this.f143088c.C(i10, i11, i15), 0, i12 - i15);
    }

    /* access modifiers changed from: protected */
    public int D(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.f143090e;
        if (i13 <= i14) {
            return this.f143088c.D(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.f143089d.D(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.f143089d.D(this.f143088c.D(i10, i11, i15), 0, i12 - i15);
    }

    /* access modifiers changed from: protected */
    public int E() {
        return this.f143092g;
    }

    public String G(String str) {
        return new String(F(), str);
    }

    /* access modifiers changed from: package-private */
    public void J(OutputStream outputStream, int i10, int i11) {
        int i12 = i10 + i11;
        int i13 = this.f143090e;
        if (i12 <= i13) {
            this.f143088c.J(outputStream, i10, i11);
        } else if (i10 >= i13) {
            this.f143089d.J(outputStream, i10 - i13, i11);
        } else {
            int i14 = i13 - i10;
            this.f143088c.J(outputStream, i10, i14);
            this.f143089d.J(outputStream, 0, i11 - i14);
        }
    }

    public boolean equals(Object obj) {
        int E10;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17193d)) {
            return false;
        }
        C17193d dVar = (C17193d) obj;
        if (this.f143087b != dVar.size()) {
            return false;
        }
        if (this.f143087b == 0) {
            return true;
        }
        if (this.f143092g == 0 || (E10 = dVar.E()) == 0 || this.f143092g == E10) {
            return Q(dVar);
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.f143092g;
        if (i10 == 0) {
            int i11 = this.f143087b;
            i10 = C(i11, 0, i11);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f143092g = i10;
        }
        return i10;
    }

    /* access modifiers changed from: protected */
    public void r(byte[] bArr, int i10, int i11, int i12) {
        int i13 = i10 + i12;
        int i14 = this.f143090e;
        if (i13 <= i14) {
            this.f143088c.r(bArr, i10, i11, i12);
        } else if (i10 >= i14) {
            this.f143089d.r(bArr, i10 - i14, i11, i12);
        } else {
            int i15 = i14 - i10;
            this.f143088c.r(bArr, i10, i11, i15);
            this.f143089d.r(bArr, 0, i11 + i15, i12 - i15);
        }
    }

    /* access modifiers changed from: protected */
    public int s() {
        return this.f143091f;
    }

    public int size() {
        return this.f143087b;
    }

    /* access modifiers changed from: protected */
    public boolean t() {
        return this.f143087b >= f143086h[this.f143091f];
    }

    public boolean x() {
        int D10 = this.f143088c.D(0, 0, this.f143090e);
        C17193d dVar = this.f143089d;
        return dVar.D(D10, 0, dVar.size()) == 0;
    }

    /* renamed from: y */
    public C17193d.a iterator() {
        return new d();
    }

    private C17210u(C17193d dVar, C17193d dVar2) {
        this.f143092g = 0;
        this.f143088c = dVar;
        this.f143089d = dVar2;
        int size = dVar.size();
        this.f143090e = size;
        this.f143087b = size + dVar2.size();
        this.f143091f = Math.max(dVar.s(), dVar2.s()) + 1;
    }

    /* renamed from: eJ.u$e */
    private class e extends InputStream {

        /* renamed from: a  reason: collision with root package name */
        private c f143100a;

        /* renamed from: b  reason: collision with root package name */
        private C17205p f143101b;

        /* renamed from: c  reason: collision with root package name */
        private int f143102c;

        /* renamed from: d  reason: collision with root package name */
        private int f143103d;

        /* renamed from: e  reason: collision with root package name */
        private int f143104e;

        /* renamed from: f  reason: collision with root package name */
        private int f143105f;

        public e() {
            d();
        }

        private void c() {
            int i10;
            if (this.f143101b != null && this.f143103d == (i10 = this.f143102c)) {
                this.f143104e += i10;
                this.f143103d = 0;
                if (this.f143100a.hasNext()) {
                    C17205p d10 = this.f143100a.next();
                    this.f143101b = d10;
                    this.f143102c = d10.size();
                    return;
                }
                this.f143101b = null;
                this.f143102c = 0;
            }
        }

        private void d() {
            c cVar = new c(C17210u.this);
            this.f143100a = cVar;
            C17205p d10 = cVar.next();
            this.f143101b = d10;
            this.f143102c = d10.size();
            this.f143103d = 0;
            this.f143104e = 0;
        }

        private int e(byte[] bArr, int i10, int i11) {
            int i12 = i11;
            while (true) {
                if (i12 <= 0) {
                    break;
                }
                c();
                if (this.f143101b != null) {
                    int min = Math.min(this.f143102c - this.f143103d, i12);
                    if (bArr != null) {
                        this.f143101b.q(bArr, this.f143103d, i10, min);
                        i10 += min;
                    }
                    this.f143103d += min;
                    i12 -= min;
                } else if (i12 == i11) {
                    return -1;
                }
            }
            return i11 - i12;
        }

        public int available() {
            return C17210u.this.size() - (this.f143104e + this.f143103d);
        }

        public void mark(int i10) {
            this.f143105f = this.f143104e + this.f143103d;
        }

        public boolean markSupported() {
            return true;
        }

        public int read(byte[] bArr, int i10, int i11) {
            bArr.getClass();
            if (i10 >= 0 && i11 >= 0 && i11 <= bArr.length - i10) {
                return e(bArr, i10, i11);
            }
            throw new IndexOutOfBoundsException();
        }

        public synchronized void reset() {
            d();
            e((byte[]) null, 0, this.f143105f);
        }

        public long skip(long j10) {
            if (j10 >= 0) {
                if (j10 > 2147483647L) {
                    j10 = 2147483647L;
                }
                return (long) e((byte[]) null, 0, (int) j10);
            }
            throw new IndexOutOfBoundsException();
        }

        public int read() {
            c();
            C17205p pVar = this.f143101b;
            if (pVar == null) {
                return -1;
            }
            int i10 = this.f143103d;
            this.f143103d = i10 + 1;
            return pVar.K(i10) & 255;
        }
    }
}
