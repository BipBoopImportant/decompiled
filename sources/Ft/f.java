package Ft;

import IC.C13023e;
import IC.C13026h;
import YH.C16877v;
import am.h;
import ep.C11256b;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import jt.b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import st.c;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LFt/f;", "LFt/e;", "Lep/b;", "localizedDateTimeFormatter", "Lam/h;", "timeProvider", "<init>", "(Lep/b;Lam/h;)V", "Ljt/b$f;", "timeSlot", "LIC/e;", "a", "(Ljt/b$f;)LIC/e;", "Lep/b;", "b", "Lam/h;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f implements e {

    /* renamed from: a  reason: collision with root package name */
    private final C11256b f81059a;

    /* renamed from: b  reason: collision with root package name */
    private final h f81060b;

    public f(C11256b bVar, h hVar) {
        C17542s.j(bVar, "localizedDateTimeFormatter");
        C17542s.j(hVar, "timeProvider");
        this.f81059a = bVar;
        this.f81060b = hVar;
    }

    private static final boolean b(LocalDateTime localDateTime, LocalDateTime localDateTime2) {
        return C17542s.e(localDateTime.toLocalDate(), localDateTime2.toLocalDate());
    }

    public C13023e a(b.f fVar) {
        C17542s.j(fVar, "timeSlot");
        DateTimeFormatter d10 = this.f81059a.d();
        LocalDateTime d11 = this.f81060b.d();
        if (b(fVar.f(), d11)) {
            C13023e.d dVar = new C13023e.d(c.f102723M, C16877v.e(d10.format(fVar.f())));
            if (b(fVar.c(), d11)) {
                int i10 = c.f102705D;
                String format = d10.format(fVar.c());
                C17542s.i(format, "format(...)");
                return C13026h.e(i10, C16877v.q(dVar, C13026h.c(format)));
            }
            LocalDateTime c10 = fVar.c();
            LocalDateTime plusDays = d11.plusDays(1);
            C17542s.i(plusDays, "plusDays(...)");
            if (b(c10, plusDays)) {
                return C13026h.e(c.f102705D, C16877v.q(dVar, new C13023e.d(c.f102725N, C16877v.e(d10.format(fVar.c())))));
            }
            C13023e c11 = C13026h.c(this.f81059a.b(fVar.c(), "EE, dd MMM HH:mm"));
            return C13026h.e(c.f102705D, C16877v.q(dVar, c11));
        }
        LocalDateTime f10 = fVar.f();
        LocalDateTime plusDays2 = d11.plusDays(1);
        C17542s.i(plusDays2, "plusDays(...)");
        if (b(f10, plusDays2)) {
            C13023e.d dVar2 = new C13023e.d(c.f102725N, C16877v.e(d10.format(fVar.f())));
            LocalDateTime c12 = fVar.c();
            LocalDateTime plusDays3 = d11.plusDays(1);
            C17542s.i(plusDays3, "plusDays(...)");
            if (b(c12, plusDays3)) {
                int i11 = c.f102705D;
                String format2 = d10.format(fVar.c());
                C17542s.i(format2, "format(...)");
                return C13026h.e(i11, C16877v.q(dVar2, C13026h.c(format2)));
            }
            C13023e c13 = C13026h.c(this.f81059a.b(fVar.c(), "EE, dd MMM HH:mm"));
            return C13026h.e(c.f102705D, C16877v.q(dVar2, c13));
        }
        return C13026h.e(c.f102705D, C16877v.q(C13026h.c(this.f81059a.b(fVar.f(), "EE, dd MMM HH:mm")), C13026h.c(this.f81059a.b(fVar.c(), "EE, dd MMM HH:mm"))));
    }
}
