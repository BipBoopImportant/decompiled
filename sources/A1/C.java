package A1;

import j0.C5468y;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\u0003R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000f¨\u0006\u0011"}, d2 = {"LA1/C;", "", "<init>", "()V", "LA1/D;", "pointerInputEvent", "LA1/Q;", "positionCalculator", "LA1/h;", "b", "(LA1/D;LA1/Q;)LA1/h;", "LXH/N;", "a", "Lj0/y;", "LA1/C$a;", "Lj0/y;", "previousPointerInputData", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class C {

    /* renamed from: a  reason: collision with root package name */
    private final C5468y<a> f4319a = new C5468y<>(0, 1, (DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\f\u0010\u0012R\u001d\u0010\t\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"LA1/C$a;", "", "", "uptime", "Lo1/g;", "positionOnScreen", "", "down", "LA1/P;", "type", "<init>", "(JJZILkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "J", "c", "()J", "b", "Z", "()Z", "d", "I", "getType-T8wyACA", "()I", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final long f4320a;

        /* renamed from: b  reason: collision with root package name */
        private final long f4321b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f4322c;

        /* renamed from: d  reason: collision with root package name */
        private final int f4323d;

        public /* synthetic */ a(long j10, long j11, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(j10, j11, z10, i10);
        }

        public final boolean a() {
            return this.f4322c;
        }

        public final long b() {
            return this.f4321b;
        }

        public final long c() {
            return this.f4320a;
        }

        private a(long j10, long j11, boolean z10, int i10) {
            this.f4320a = j10;
            this.f4321b = j11;
            this.f4322c = z10;
            this.f4323d = i10;
        }
    }

    public final void a() {
        this.f4319a.a();
    }

    public final C4341h b(D d10, Q q10) {
        boolean z10;
        long j10;
        long j11;
        C5468y yVar = new C5468y(d10.b().size());
        List<E> b10 = d10.b();
        int size = b10.size();
        for (int i10 = 0; i10 < size; i10++) {
            E e10 = b10.get(i10);
            a d11 = this.f4319a.d(e10.d());
            if (d11 == null) {
                j11 = e10.k();
                j10 = e10.f();
                z10 = false;
                Q q11 = q10;
            } else {
                long c10 = d11.c();
                boolean a10 = d11.a();
                j11 = c10;
                z10 = a10;
                j10 = q10.u(d11.b());
            }
            yVar.k(e10.d(), new B(e10.d(), e10.k(), e10.f(), e10.b(), e10.h(), j11, j10, z10, false, e10.j(), e10.c(), e10.i(), e10.e(), (DefaultConstructorMarker) null));
            if (e10.b()) {
                C5468y<a> yVar2 = this.f4319a;
                long d12 = e10.d();
                a aVar = r11;
                a aVar2 = new a(e10.k(), e10.g(), e10.b(), e10.j(), (DefaultConstructorMarker) null);
                yVar2.k(d12, aVar);
            } else {
                this.f4319a.m(e10.d());
            }
        }
        return new C4341h(yVar, d10);
    }
}
