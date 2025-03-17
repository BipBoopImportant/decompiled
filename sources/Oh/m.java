package oH;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0012B/\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0012\u0010\r¨\u0006\u0018"}, d2 = {"LoH/m;", "", "", "left", "top", "right", "bottom", "<init>", "(IIII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "d", "c", "e", "insetter"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class m {

    /* renamed from: e  reason: collision with root package name */
    public static final a f145280e = new a((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    public static final m f145281f = new m(0, 0, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    private final int f145282a;

    /* renamed from: b  reason: collision with root package name */
    private final int f145283b;

    /* renamed from: c  reason: collision with root package name */
    private final int f145284c;

    /* renamed from: d  reason: collision with root package name */
    private final int f145285d;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LoH/m$a;", "", "<init>", "()V", "LoH/m;", "EMPTY", "LoH/m;", "insetter"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public m(int i10, int i11, int i12, int i13) {
        this.f145282a = i10;
        this.f145283b = i11;
        this.f145284c = i12;
        this.f145285d = i13;
    }

    public final int a() {
        return this.f145285d;
    }

    public final int b() {
        return this.f145282a;
    }

    public final int c() {
        return this.f145284c;
    }

    public final int d() {
        return this.f145283b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f145282a == mVar.f145282a && this.f145283b == mVar.f145283b && this.f145284c == mVar.f145284c && this.f145285d == mVar.f145285d;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f145282a) * 31) + Integer.hashCode(this.f145283b)) * 31) + Integer.hashCode(this.f145284c)) * 31) + Integer.hashCode(this.f145285d);
    }

    public String toString() {
        int i10 = this.f145282a;
        int i11 = this.f145283b;
        int i12 = this.f145284c;
        int i13 = this.f145285d;
        return "ViewDimensions(left=" + i10 + ", top=" + i11 + ", right=" + i12 + ", bottom=" + i13 + ")";
    }
}
