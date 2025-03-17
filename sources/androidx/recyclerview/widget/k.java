package androidx.recyclerview.widget;

import D2.p;
import android.annotation.SuppressLint;
import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

final class k implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    static final ThreadLocal<k> f44084e = new ThreadLocal<>();

    /* renamed from: f  reason: collision with root package name */
    static Comparator<c> f44085f = new a();

    /* renamed from: a  reason: collision with root package name */
    ArrayList<RecyclerView> f44086a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    long f44087b;

    /* renamed from: c  reason: collision with root package name */
    long f44088c;

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList<c> f44089d = new ArrayList<>();

    class a implements Comparator<c> {
        a() {
        }

        /* renamed from: a */
        public int compare(c cVar, c cVar2) {
            RecyclerView recyclerView = cVar.f44097d;
            if ((recyclerView == null) != (cVar2.f44097d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z10 = cVar.f44094a;
            if (z10 != cVar2.f44094a) {
                return z10 ? -1 : 1;
            }
            int i10 = cVar2.f44095b - cVar.f44095b;
            if (i10 != 0) {
                return i10;
            }
            int i11 = cVar.f44096c - cVar2.f44096c;
            if (i11 != 0) {
                return i11;
            }
            return 0;
        }
    }

    @SuppressLint({"VisibleForTests"})
    static class b implements RecyclerView.q.c {

        /* renamed from: a  reason: collision with root package name */
        int f44090a;

        /* renamed from: b  reason: collision with root package name */
        int f44091b;

        /* renamed from: c  reason: collision with root package name */
        int[] f44092c;

        /* renamed from: d  reason: collision with root package name */
        int f44093d;

        b() {
        }

        public void a(int i10, int i11) {
            if (i10 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i11 >= 0) {
                int i12 = this.f44093d;
                int i13 = i12 * 2;
                int[] iArr = this.f44092c;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.f44092c = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i13 >= iArr.length) {
                    int[] iArr3 = new int[(i12 * 4)];
                    this.f44092c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.f44092c;
                iArr4[i13] = i10;
                iArr4[i13 + 1] = i11;
                this.f44093d++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }

        /* access modifiers changed from: package-private */
        public void b() {
            int[] iArr = this.f44092c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f44093d = 0;
        }

        /* access modifiers changed from: package-private */
        public void c(RecyclerView recyclerView, boolean z10) {
            this.f44093d = 0;
            int[] iArr = this.f44092c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.q qVar = recyclerView.f43764n;
            if (recyclerView.f43763m != null && qVar != null && qVar.R0()) {
                if (z10) {
                    if (!recyclerView.f43753e.p()) {
                        qVar.R(recyclerView.f43763m.getItemCount(), this);
                    }
                } else if (!recyclerView.x0()) {
                    qVar.Q(this.f44090a, this.f44091b, recyclerView.f43717J0, this);
                }
                int i10 = this.f44093d;
                if (i10 > qVar.f43842m) {
                    qVar.f43842m = i10;
                    qVar.f43843n = z10;
                    recyclerView.f43749c.P();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public boolean d(int i10) {
            if (this.f44092c != null) {
                int i11 = this.f44093d * 2;
                for (int i12 = 0; i12 < i11; i12 += 2) {
                    if (this.f44092c[i12] == i10) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public void e(int i10, int i11) {
            this.f44090a = i10;
            this.f44091b = i11;
        }
    }

    static class c {

        /* renamed from: a  reason: collision with root package name */
        public boolean f44094a;

        /* renamed from: b  reason: collision with root package name */
        public int f44095b;

        /* renamed from: c  reason: collision with root package name */
        public int f44096c;

        /* renamed from: d  reason: collision with root package name */
        public RecyclerView f44097d;

        /* renamed from: e  reason: collision with root package name */
        public int f44098e;

        c() {
        }

        public void a() {
            this.f44094a = false;
            this.f44095b = 0;
            this.f44096c = 0;
            this.f44097d = null;
            this.f44098e = 0;
        }
    }

    k() {
    }

    private void b() {
        c cVar;
        int size = this.f44086a.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView = this.f44086a.get(i11);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.f43715I0.c(recyclerView, false);
                i10 += recyclerView.f43715I0.f44093d;
            }
        }
        this.f44089d.ensureCapacity(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView recyclerView2 = this.f44086a.get(i13);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.f43715I0;
                int abs = Math.abs(bVar.f44090a) + Math.abs(bVar.f44091b);
                for (int i14 = 0; i14 < bVar.f44093d * 2; i14 += 2) {
                    if (i12 >= this.f44089d.size()) {
                        cVar = new c();
                        this.f44089d.add(cVar);
                    } else {
                        cVar = this.f44089d.get(i12);
                    }
                    int[] iArr = bVar.f44092c;
                    int i15 = iArr[i14 + 1];
                    cVar.f44094a = i15 <= abs;
                    cVar.f44095b = abs;
                    cVar.f44096c = i15;
                    cVar.f44097d = recyclerView2;
                    cVar.f44098e = iArr[i14];
                    i12++;
                }
            }
        }
        Collections.sort(this.f44089d, f44085f);
    }

    private void c(c cVar, long j10) {
        RecyclerView.G i10 = i(cVar.f44097d, cVar.f44098e, cVar.f44094a ? Long.MAX_VALUE : j10);
        if (i10 != null && i10.mNestedRecyclerView != null && i10.isBound() && !i10.isInvalid()) {
            h(i10.mNestedRecyclerView.get(), j10);
        }
    }

    private void d(long j10) {
        int i10 = 0;
        while (i10 < this.f44089d.size()) {
            c cVar = this.f44089d.get(i10);
            if (cVar.f44097d != null) {
                c(cVar, j10);
                cVar.a();
                i10++;
            } else {
                return;
            }
        }
    }

    static boolean e(RecyclerView recyclerView, int i10) {
        int j10 = recyclerView.f43755f.j();
        for (int i11 = 0; i11 < j10; i11++) {
            RecyclerView.G p02 = RecyclerView.p0(recyclerView.f43755f.i(i11));
            if (p02.mPosition == i10 && !p02.isInvalid()) {
                return true;
            }
        }
        return false;
    }

    private void h(RecyclerView recyclerView, long j10) {
        if (recyclerView != null) {
            if (recyclerView.f43708F && recyclerView.f43755f.j() != 0) {
                recyclerView.i1();
            }
            b bVar = recyclerView.f43715I0;
            bVar.c(recyclerView, true);
            if (bVar.f44093d != 0) {
                try {
                    Trace.beginSection(j10 == Long.MAX_VALUE ? "RV Nested Prefetch" : "RV Nested Prefetch forced - needed next frame");
                    recyclerView.f43717J0.f(recyclerView.f43763m);
                    for (int i10 = 0; i10 < bVar.f44093d * 2; i10 += 2) {
                        i(recyclerView, bVar.f44092c[i10], j10);
                    }
                } finally {
                    Trace.endSection();
                }
            }
        }
    }

    private RecyclerView.G i(RecyclerView recyclerView, int i10, long j10) {
        if (e(recyclerView, i10)) {
            return null;
        }
        RecyclerView.x xVar = recyclerView.f43749c;
        if (j10 == Long.MAX_VALUE) {
            try {
                if (p.c()) {
                    Trace.beginSection("RV Prefetch forced - needed next frame");
                }
            } catch (Throwable th2) {
                recyclerView.U0(false);
                Trace.endSection();
                throw th2;
            }
        }
        recyclerView.S0();
        RecyclerView.G N10 = xVar.N(i10, false, j10);
        if (N10 != null) {
            if (!N10.isBound() || N10.isInvalid()) {
                xVar.a(N10, false);
            } else {
                xVar.G(N10.itemView);
            }
        }
        recyclerView.U0(false);
        Trace.endSection();
        return N10;
    }

    public void a(RecyclerView recyclerView) {
        if (!RecyclerView.f43688g1 || !this.f44086a.contains(recyclerView)) {
            this.f44086a.add(recyclerView);
            return;
        }
        throw new IllegalStateException("RecyclerView already present in worker list!");
    }

    /* access modifiers changed from: package-private */
    public void f(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.isAttachedToWindow()) {
            if (RecyclerView.f43688g1 && !this.f44086a.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            } else if (this.f44087b == 0) {
                this.f44087b = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        recyclerView.f43715I0.e(i10, i11);
    }

    /* access modifiers changed from: package-private */
    public void g(long j10) {
        b();
        d(j10);
    }

    public void j(RecyclerView recyclerView) {
        boolean remove = this.f44086a.remove(recyclerView);
        if (RecyclerView.f43688g1 && !remove) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
    }

    public void run() {
        try {
            Trace.beginSection("RV Prefetch");
            if (!this.f44086a.isEmpty()) {
                int size = this.f44086a.size();
                long j10 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    RecyclerView recyclerView = this.f44086a.get(i10);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j10 = Math.max(recyclerView.getDrawingTime(), j10);
                    }
                }
                if (j10 != 0) {
                    g(TimeUnit.MILLISECONDS.toNanos(j10) + this.f44088c);
                    this.f44087b = 0;
                    Trace.endSection();
                }
            }
        } finally {
            this.f44087b = 0;
            Trace.endSection();
        }
    }
}
