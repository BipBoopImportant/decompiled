package A1;

import kotlin.Metadata;
import mI.C17604b;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b@\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0006J\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0000X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0001\u0004\u0001\u00060\u0002j\u0002`\u0003¨\u0006\u0011"}, d2 = {"LA1/O;", "", "", "Landroidx/compose/ui/input/pointer/NativePointerKeyboardModifiers;", "packedValue", "b", "(I)I", "", "e", "(I)Ljava/lang/String;", "d", "other", "", "c", "(ILjava/lang/Object;)Z", "a", "I", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@C17604b
public final class O {

    /* renamed from: a  reason: collision with root package name */
    private final int f4355a;

    private /* synthetic */ O(int i10) {
        this.f4355a = i10;
    }

    public static final /* synthetic */ O a(int i10) {
        return new O(i10);
    }

    public static int b(int i10) {
        return i10;
    }

    public static boolean c(int i10, Object obj) {
        return (obj instanceof O) && i10 == ((O) obj).f();
    }

    public static int d(int i10) {
        return Integer.hashCode(i10);
    }

    public static String e(int i10) {
        return "PointerKeyboardModifiers(packedValue=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f4355a, obj);
    }

    public final /* synthetic */ int f() {
        return this.f4355a;
    }

    public int hashCode() {
        return d(this.f4355a);
    }

    public String toString() {
        return e(this.f4355a);
    }
}
