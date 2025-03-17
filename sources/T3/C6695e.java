package T3;

import N3.O;
import q3.B;

/* renamed from: T3.e  reason: case insensitive filesystem */
abstract class C6695e {

    /* renamed from: a  reason: collision with root package name */
    protected final O f40003a;

    /* renamed from: T3.e$a */
    public static final class a extends B {
        public a(String str) {
            super(str, (Throwable) null, false, 1);
        }
    }

    protected C6695e(O o10) {
        this.f40003a = o10;
    }

    public final boolean a(t3.B b10, long j10) {
        return b(b10) && c(b10, j10);
    }

    /* access modifiers changed from: protected */
    public abstract boolean b(t3.B b10);

    /* access modifiers changed from: protected */
    public abstract boolean c(t3.B b10, long j10);
}
