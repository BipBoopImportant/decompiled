package E1;

import kotlin.Metadata;
import kotlin.jvm.internal.C17540p;
import nI.p;
import pI.C17752b;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a#\u0010\u0004\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t\"\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\u000b\u0010\t¨\u0006\r"}, d2 = {"LE1/a;", "", "position1", "position2", "c", "(LE1/a;II)I", "LE1/p;", "a", "LE1/p;", "()LE1/p;", "FirstBaseline", "b", "LastBaseline", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: E1.b  reason: case insensitive filesystem */
public final class C4469b {

    /* renamed from: a  reason: collision with root package name */
    private static final C4483p f5869a = new C4483p(a.f5871a);

    /* renamed from: b  reason: collision with root package name */
    private static final C4483p f5870b = new C4483p(C0045b.f5872a);

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: E1.b$a */
    /* synthetic */ class a extends C17540p implements p<Integer, Integer, Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f5871a = new a();

        a() {
            super(2, C17752b.class, "min", "min(II)I", 1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return t(((Number) obj).intValue(), ((Number) obj2).intValue());
        }

        public final Integer t(int i10, int i11) {
            return Integer.valueOf(Math.min(i10, i11));
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: E1.b$b  reason: collision with other inner class name */
    /* synthetic */ class C0045b extends C17540p implements p<Integer, Integer, Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0045b f5872a = new C0045b();

        C0045b() {
            super(2, C17752b.class, "max", "max(II)I", 1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return t(((Number) obj).intValue(), ((Number) obj2).intValue());
        }

        public final Integer t(int i10, int i11) {
            return Integer.valueOf(Math.max(i10, i11));
        }
    }

    public static final C4483p a() {
        return f5869a;
    }

    public static final C4483p b() {
        return f5870b;
    }

    public static final int c(C4468a aVar, int i10, int i11) {
        return aVar.a().invoke(Integer.valueOf(i10), Integer.valueOf(i11)).intValue();
    }
}
