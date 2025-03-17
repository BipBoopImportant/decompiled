package Fh;

import c2.d;
import c2.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o1.C5673m;
import p1.Q0;
import p1.U0;
import p1.Y;
import p1.i1;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LFh/a;", "Lp1/i1;", "<init>", "()V", "Lo1/m;", "size", "Lc2/t;", "layoutDirection", "Lc2/d;", "density", "Lp1/Q0;", "a", "(JLc2/t;Lc2/d;)Lp1/Q0;", "onboarding_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements i1 {

    /* renamed from: a  reason: collision with root package name */
    public static final C0990a f60508a = new C0990a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LFh/a$a;", "", "<init>", "()V", "", "WALL_HEIGHT_QUOTA", "F", "onboarding_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Fh.a$a  reason: collision with other inner class name */
    public static final class C0990a {
        public /* synthetic */ C0990a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0990a() {
        }
    }

    public Q0 a(long j10, t tVar, d dVar) {
        C17542s.j(tVar, "layoutDirection");
        C17542s.j(dVar, "density");
        U0 a10 = Y.a();
        a10.b(C5673m.l(j10) / 2.0f, 0.0f);
        a10.d(C5673m.l(j10), C5673m.i(j10) * 0.385f);
        a10.d(C5673m.l(j10), C5673m.i(j10));
        a10.d(0.0f, C5673m.i(j10));
        a10.d(0.0f, C5673m.i(j10) * 0.385f);
        a10.close();
        return new Q0.a(a10);
    }
}
