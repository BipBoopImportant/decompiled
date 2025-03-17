package j1;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mI.C17604b;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b@\u0018\u0000 \u00042\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\u0001\u0003\u0001\u00020\u0002¨\u0006\u0012"}, d2 = {"Lj1/k;", "", "", "dataType", "b", "(I)I", "", "e", "(I)Ljava/lang/String;", "d", "other", "", "c", "(ILjava/lang/Object;)Z", "a", "I", "getDataType", "()I", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@C17604b
/* renamed from: j1.k  reason: case insensitive filesystem */
public final class C5480k {

    /* renamed from: b  reason: collision with root package name */
    public static final a f24681b = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final int f24682c = b(1);

    /* renamed from: d  reason: collision with root package name */
    private static final int f24683d = b(3);

    /* renamed from: e  reason: collision with root package name */
    private static final int f24684e = b(4);

    /* renamed from: f  reason: collision with root package name */
    private static final int f24685f = b(2);

    /* renamed from: g  reason: collision with root package name */
    private static final int f24686g = b(0);

    /* renamed from: a  reason: collision with root package name */
    private final int f24687a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Lj1/k$a;", "", "<init>", "()V", "Lj1/k;", "Text", "I", "a", "()I", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: j1.k$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return C5480k.f24682c;
        }

        private a() {
        }
    }

    public static int b(int i10) {
        return i10;
    }

    public static boolean c(int i10, Object obj) {
        return (obj instanceof C5480k) && i10 == ((C5480k) obj).f();
    }

    public static int d(int i10) {
        return Integer.hashCode(i10);
    }

    public static String e(int i10) {
        return "ContentDataType(dataType=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f24687a, obj);
    }

    public final /* synthetic */ int f() {
        return this.f24687a;
    }

    public int hashCode() {
        return d(this.f24687a);
    }

    public String toString() {
        return e(this.f24687a);
    }
}
