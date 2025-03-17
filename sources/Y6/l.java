package y6;

import D6.j;
import android.annotation.TargetApi;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

@TargetApi(19)
public class l implements m, j {

    /* renamed from: a  reason: collision with root package name */
    private final Path f57918a = new Path();

    /* renamed from: b  reason: collision with root package name */
    private final Path f57919b = new Path();

    /* renamed from: c  reason: collision with root package name */
    private final Path f57920c = new Path();

    /* renamed from: d  reason: collision with root package name */
    private final String f57921d;

    /* renamed from: e  reason: collision with root package name */
    private final List<m> f57922e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private final j f57923f;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f57924a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                D6.j$a[] r0 = D6.j.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f57924a = r0
                D6.j$a r1 = D6.j.a.MERGE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f57924a     // Catch:{ NoSuchFieldError -> 0x001d }
                D6.j$a r1 = D6.j.a.ADD     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f57924a     // Catch:{ NoSuchFieldError -> 0x0028 }
                D6.j$a r1 = D6.j.a.SUBTRACT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f57924a     // Catch:{ NoSuchFieldError -> 0x0033 }
                D6.j$a r1 = D6.j.a.INTERSECT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f57924a     // Catch:{ NoSuchFieldError -> 0x003e }
                D6.j$a r1 = D6.j.a.EXCLUDE_INTERSECTIONS     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: y6.l.a.<clinit>():void");
        }
    }

    public l(j jVar) {
        this.f57921d = jVar.c();
        this.f57923f = jVar;
    }

    private void a() {
        for (int i10 = 0; i10 < this.f57922e.size(); i10++) {
            this.f57920c.addPath(this.f57922e.get(i10).m());
        }
    }

    @TargetApi(19)
    private void c(Path.Op op2) {
        this.f57919b.reset();
        this.f57918a.reset();
        for (int size = this.f57922e.size() - 1; size >= 1; size--) {
            m mVar = this.f57922e.get(size);
            if (mVar instanceof C8987d) {
                C8987d dVar = (C8987d) mVar;
                List<m> k10 = dVar.k();
                for (int size2 = k10.size() - 1; size2 >= 0; size2--) {
                    Path m10 = k10.get(size2).m();
                    m10.transform(dVar.l());
                    this.f57919b.addPath(m10);
                }
            } else {
                this.f57919b.addPath(mVar.m());
            }
        }
        m mVar2 = this.f57922e.get(0);
        if (mVar2 instanceof C8987d) {
            C8987d dVar2 = (C8987d) mVar2;
            List<m> k11 = dVar2.k();
            for (int i10 = 0; i10 < k11.size(); i10++) {
                Path m11 = k11.get(i10).m();
                m11.transform(dVar2.l());
                this.f57918a.addPath(m11);
            }
        } else {
            this.f57918a.set(mVar2.m());
        }
        this.f57920c.op(this.f57918a, this.f57919b, op2);
    }

    public void b(List<C8986c> list, List<C8986c> list2) {
        for (int i10 = 0; i10 < this.f57922e.size(); i10++) {
            this.f57922e.get(i10).b(list, list2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:3:0x000a, LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f(java.util.ListIterator<y6.C8986c> r3) {
        /*
            r2 = this;
        L_0x0000:
            boolean r0 = r3.hasPrevious()
            if (r0 == 0) goto L_0x000d
            java.lang.Object r0 = r3.previous()
            if (r0 == r2) goto L_0x000d
            goto L_0x0000
        L_0x000d:
            boolean r0 = r3.hasPrevious()
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r3.previous()
            y6.c r0 = (y6.C8986c) r0
            boolean r1 = r0 instanceof y6.m
            if (r1 == 0) goto L_0x000d
            java.util.List<y6.m> r1 = r2.f57922e
            y6.m r0 = (y6.m) r0
            r1.add(r0)
            r3.remove()
            goto L_0x000d
        L_0x0028:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y6.l.f(java.util.ListIterator):void");
    }

    public Path m() {
        this.f57920c.reset();
        if (this.f57923f.d()) {
            return this.f57920c;
        }
        int i10 = a.f57924a[this.f57923f.b().ordinal()];
        if (i10 == 1) {
            a();
        } else if (i10 == 2) {
            c(Path.Op.UNION);
        } else if (i10 == 3) {
            c(Path.Op.REVERSE_DIFFERENCE);
        } else if (i10 == 4) {
            c(Path.Op.INTERSECT);
        } else if (i10 == 5) {
            c(Path.Op.XOR);
        }
        return this.f57920c;
    }
}
