package oK;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mI.C17604b;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b@\u0018\u0000 \u00072\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0001\u0003\u0001\u00020\u0002\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, d2 = {"LoK/l;", "", "", "size", "c", "(I)I", "other", "b", "(II)I", "", "g", "(I)Ljava/lang/String;", "f", "", "d", "(ILjava/lang/Object;)Z", "a", "I", "getSize", "()I", "sub-sampling-image_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C17604b
/* renamed from: oK.l  reason: case insensitive filesystem */
public final class C17719l {

    /* renamed from: b  reason: collision with root package name */
    public static final a f145388b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final int f145389a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LoK/l$a;", "", "<init>", "()V", "sub-sampling-image_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: oK.l$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private /* synthetic */ C17719l(int i10) {
        this.f145389a = i10;
    }

    public static final /* synthetic */ C17719l a(int i10) {
        return new C17719l(i10);
    }

    public static final int b(int i10, int i11) {
        return i10 > i11 ? i11 : i10;
    }

    public static int c(int i10) {
        if (i10 == 1 || i10 % 2 == 0) {
            return i10;
        }
        throw new IllegalStateException(("Incorrect size = " + i10 + ". BitmapRegionDecoder requires values based on powers of 2.").toString());
    }

    public static boolean d(int i10, Object obj) {
        return (obj instanceof C17719l) && i10 == ((C17719l) obj).h();
    }

    public static final boolean e(int i10, int i11) {
        return i10 == i11;
    }

    public static int f(int i10) {
        return Integer.hashCode(i10);
    }

    public static String g(int i10) {
        return "ImageSampleSize(size=" + i10 + ")";
    }

    public boolean equals(Object obj) {
        return d(this.f145389a, obj);
    }

    public final /* synthetic */ int h() {
        return this.f145389a;
    }

    public int hashCode() {
        return f(this.f145389a);
    }

    public String toString() {
        return g(this.f145389a);
    }
}
