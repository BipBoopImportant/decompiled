package z3;

public final class C extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    public final int f32381a;

    public C(int i10) {
        super(a(i10));
        this.f32381a = i10;
    }

    private static String a(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "Undefined timeout." : "Detaching surface timed out." : "Setting foreground mode timed out." : "Player release timed out.";
    }
}
