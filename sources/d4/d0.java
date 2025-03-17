package D4;

import HJ.C15854t;
import XH.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0013\u0016B)\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0013\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\u0012\u0001\u0002\u0018\u0019¨\u0006\u001a"}, d2 = {"LD4/d0;", "", "", "presentedItemsBefore", "presentedItemsAfter", "originalPageOffsetFirst", "originalPageOffsetLast", "<init>", "(IIII)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "LD4/x;", "loadType", "e", "(LD4/x;)I", "hashCode", "()I", "a", "I", "d", "b", "c", "LD4/d0$a;", "LD4/d0$b;", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class d0 {

    /* renamed from: a  reason: collision with root package name */
    private final int f34334a;

    /* renamed from: b  reason: collision with root package name */
    private final int f34335b;

    /* renamed from: c  reason: collision with root package name */
    private final int f34336c;

    /* renamed from: d  reason: collision with root package name */
    private final int f34337d;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0018\u0010\u0011¨\u0006\u0019"}, d2 = {"LD4/d0$a;", "LD4/d0;", "", "pageOffset", "indexInPage", "presentedItemsBefore", "presentedItemsAfter", "originalPageOffsetFirst", "originalPageOffsetLast", "<init>", "(IIIIII)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "e", "I", "g", "f", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends d0 {

        /* renamed from: e  reason: collision with root package name */
        private final int f34338e;

        /* renamed from: f  reason: collision with root package name */
        private final int f34339f;

        public a(int i10, int i11, int i12, int i13, int i14, int i15) {
            super(i12, i13, i14, i15, (DefaultConstructorMarker) null);
            this.f34338e = i10;
            this.f34339f = i11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f34338e == aVar.f34338e && this.f34339f == aVar.f34339f && d() == aVar.d() && c() == aVar.c() && a() == aVar.a() && b() == aVar.b();
        }

        public final int f() {
            return this.f34339f;
        }

        public final int g() {
            return this.f34338e;
        }

        public int hashCode() {
            return d0.super.hashCode() + Integer.hashCode(this.f34338e) + Integer.hashCode(this.f34339f);
        }

        public String toString() {
            return C15854t.o("ViewportHint.Access(\n            |    pageOffset=" + this.f34338e + ",\n            |    indexInPage=" + this.f34339f + ",\n            |    presentedItemsBefore=" + d() + ",\n            |    presentedItemsAfter=" + c() + ",\n            |    originalPageOffsetFirst=" + a() + ",\n            |    originalPageOffsetLast=" + b() + ",\n            |)", (String) null, 1, (Object) null);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LD4/d0$b;", "LD4/d0;", "", "presentedItemsBefore", "presentedItemsAfter", "originalPageOffsetFirst", "originalPageOffsetLast", "<init>", "(IIII)V", "", "toString", "()Ljava/lang/String;", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b extends d0 {
        public b(int i10, int i11, int i12, int i13) {
            super(i10, i11, i12, i13, (DefaultConstructorMarker) null);
        }

        public String toString() {
            return C15854t.o("ViewportHint.Initial(\n            |    presentedItemsBefore=" + d() + ",\n            |    presentedItemsAfter=" + c() + ",\n            |    originalPageOffsetFirst=" + a() + ",\n            |    originalPageOffsetLast=" + b() + ",\n            |)", (String) null, 1, (Object) null);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f34340a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                D4.x[] r0 = D4.C6449x.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                D4.x r1 = D4.C6449x.REFRESH     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                D4.x r1 = D4.C6449x.PREPEND     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                D4.x r1 = D4.C6449x.APPEND     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f34340a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: D4.d0.c.<clinit>():void");
        }
    }

    public /* synthetic */ d0(int i10, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, i12, i13);
    }

    public final int a() {
        return this.f34336c;
    }

    public final int b() {
        return this.f34337d;
    }

    public final int c() {
        return this.f34335b;
    }

    public final int d() {
        return this.f34334a;
    }

    public final int e(C6449x xVar) {
        C17542s.j(xVar, "loadType");
        int i10 = c.f34340a[xVar.ordinal()];
        if (i10 == 1) {
            throw new IllegalArgumentException("Cannot get presentedItems for loadType: REFRESH");
        } else if (i10 == 2) {
            return this.f34334a;
        } else {
            if (i10 == 3) {
                return this.f34335b;
            }
            throw new t();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.f34334a == d0Var.f34334a && this.f34335b == d0Var.f34335b && this.f34336c == d0Var.f34336c && this.f34337d == d0Var.f34337d;
    }

    public int hashCode() {
        return Integer.hashCode(this.f34334a) + Integer.hashCode(this.f34335b) + Integer.hashCode(this.f34336c) + Integer.hashCode(this.f34337d);
    }

    private d0(int i10, int i11, int i12, int i13) {
        this.f34334a = i10;
        this.f34335b = i11;
        this.f34336c = i12;
        this.f34337d = i13;
    }
}
