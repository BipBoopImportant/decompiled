package BJ;

import YH.C16859c;
import YH.C16870n;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: BJ.d  reason: case insensitive filesystem */
public final class C15469d<T> extends C15468c<T> {

    /* renamed from: c  reason: collision with root package name */
    public static final a f133303c = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public Object[] f133304a;

    /* renamed from: b  reason: collision with root package name */
    private int f133305b;

    /* renamed from: BJ.d$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: BJ.d$b */
    public static final class b extends C16859c<T> {

        /* renamed from: c  reason: collision with root package name */
        private int f133306c = -1;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C15469d<T> f133307d;

        b(C15469d<T> dVar) {
            this.f133307d = dVar;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void c() {
            /*
                r2 = this;
            L_0x0000:
                int r0 = r2.f133306c
                int r0 = r0 + 1
                r2.f133306c = r0
                BJ.d<T> r1 = r2.f133307d
                java.lang.Object[] r1 = r1.f133304a
                int r1 = r1.length
                if (r0 >= r1) goto L_0x001b
                BJ.d<T> r0 = r2.f133307d
                java.lang.Object[] r0 = r0.f133304a
                int r1 = r2.f133306c
                r0 = r0[r1]
                if (r0 == 0) goto L_0x0000
            L_0x001b:
                int r0 = r2.f133306c
                BJ.d<T> r1 = r2.f133307d
                java.lang.Object[] r1 = r1.f133304a
                int r1 = r1.length
                if (r0 < r1) goto L_0x002a
                r2.d()
                goto L_0x003c
            L_0x002a:
                BJ.d<T> r0 = r2.f133307d
                java.lang.Object[] r0 = r0.f133304a
                int r1 = r2.f133306c
                r0 = r0[r1]
                java.lang.String r1 = "null cannot be cast to non-null type T of org.jetbrains.kotlin.util.ArrayMapImpl"
                kotlin.jvm.internal.C17542s.h(r0, r1)
                r2.f(r0)
            L_0x003c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: BJ.C15469d.b.c():void");
        }
    }

    private C15469d(Object[] objArr, int i10) {
        super((DefaultConstructorMarker) null);
        this.f133304a = objArr;
        this.f133305b = i10;
    }

    private final void k(int i10) {
        Object[] objArr = this.f133304a;
        if (objArr.length <= i10) {
            int length = objArr.length;
            do {
                length *= 2;
            } while (length <= i10);
            Object[] copyOf = Arrays.copyOf(this.f133304a, length);
            C17542s.i(copyOf, "copyOf(...)");
            this.f133304a = copyOf;
        }
    }

    public int a() {
        return this.f133305b;
    }

    public void b(int i10, T t10) {
        C17542s.j(t10, "value");
        k(i10);
        if (this.f133304a[i10] == null) {
            this.f133305b = a() + 1;
        }
        this.f133304a[i10] = t10;
    }

    public T get(int i10) {
        return C16870n.p0(this.f133304a, i10);
    }

    public Iterator<T> iterator() {
        return new b(this);
    }

    public C15469d() {
        this(new Object[20], 0);
    }
}
