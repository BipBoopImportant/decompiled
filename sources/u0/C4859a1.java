package U0;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import mI.C17604b;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0013\u0010\u0014\u0001\u0004\u0001\u00020\u0003¨\u0006\u0015"}, d2 = {"LU0/a1;", "T", "", "LU0/m;", "composer", "b", "(LU0/m;)LU0/m;", "", "e", "(LU0/m;)Ljava/lang/String;", "", "d", "(LU0/m;)I", "other", "", "c", "(LU0/m;Ljava/lang/Object;)Z", "a", "LU0/m;", "getComposer$annotations", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@C17604b
/* renamed from: U0.a1  reason: case insensitive filesystem */
public final class C4859a1<T> {

    /* renamed from: a  reason: collision with root package name */
    private final C4889m f13905a;

    private /* synthetic */ C4859a1(C4889m mVar) {
        this.f13905a = mVar;
    }

    public static final /* synthetic */ C4859a1 a(C4889m mVar) {
        return new C4859a1(mVar);
    }

    public static <T> C4889m b(C4889m mVar) {
        return mVar;
    }

    public static boolean c(C4889m mVar, Object obj) {
        return (obj instanceof C4859a1) && C17542s.e(mVar, ((C4859a1) obj).f());
    }

    public static int d(C4889m mVar) {
        return mVar.hashCode();
    }

    public static String e(C4889m mVar) {
        return "SkippableUpdater(composer=" + mVar + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f13905a, obj);
    }

    public final /* synthetic */ C4889m f() {
        return this.f13905a;
    }

    public int hashCode() {
        return d(this.f13905a);
    }

    public String toString() {
        return e(this.f13905a);
    }
}
