package dC;

import IB.C13018a;
import IC.C13023e;
import IC.C13026h;
import SB.C13561a;
import am.h;
import gC.C14509b;
import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u000b2\u00020\u0001:\u0001\u0010B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\n*\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0016¨\u0006\u0017"}, d2 = {"LdC/b;", "LgC/b;", "Lam/h;", "timeProvider", "LIl/a;", "appConfigApi", "<init>", "(Lam/h;LIl/a;)V", "Ljava/time/LocalDateTime;", "date", "", "c", "(Ljava/time/LocalDateTime;Ljava/time/LocalDateTime;)Z", "LIB/a$a$a;", "amenityOpeningHours", "LgC/b$a;", "a", "(LIB/a$a$a;)LgC/b$a;", "LIC/e;", "b", "(LIB/a$a$a;)LIC/e;", "Lam/h;", "LIl/a;", "storedetails-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: dC.b  reason: case insensitive filesystem */
public final class C14338b implements C14509b {

    /* renamed from: c  reason: collision with root package name */
    private static final a f126185c = new a((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f126186d = 8;

    /* renamed from: e  reason: collision with root package name */
    private static final Duration f126187e;

    /* renamed from: a  reason: collision with root package name */
    private final h f126188a;

    /* renamed from: b  reason: collision with root package name */
    private final Il.a f126189b;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LdC/b$a;", "", "<init>", "()V", "", "SOON_OPENING_HOUR_TIME_DIFF_MINUTES", "J", "Ljava/time/Duration;", "openingSoonThreshold", "Ljava/time/Duration;", "storedetails-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: dC.b$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        Duration ofMinutes = Duration.ofMinutes(120);
        C17542s.i(ofMinutes, "ofMinutes(...)");
        f126187e = ofMinutes;
    }

    public C14338b(h hVar, Il.a aVar) {
        C17542s.j(hVar, "timeProvider");
        C17542s.j(aVar, "appConfigApi");
        this.f126188a = hVar;
        this.f126189b = aVar;
    }

    private final boolean c(LocalDateTime localDateTime, LocalDateTime localDateTime2) {
        return C17542s.e(localDateTime != null ? localDateTime.toLocalDate() : null, localDateTime2.toLocalDate());
    }

    public C14509b.a a(C13018a.C2677a.C2678a aVar) {
        DayOfWeek dayOfWeek;
        C17542s.j(aVar, "amenityOpeningHours");
        String str = null;
        if (C17542s.e(aVar.e(), Boolean.TRUE)) {
            return null;
        }
        LocalDateTime c10 = aVar.c();
        LocalDateTime d10 = this.f126188a.d();
        LocalDateTime f10 = aVar.f();
        if (f10 == null) {
            f10 = d10;
        }
        Duration between = Duration.between(d10, f10);
        if (between.toNanos() <= 0) {
            between = null;
        }
        LocalDateTime f11 = aVar.f();
        String str2 = "";
        if (f11 == null || !c(f11, d10) || between == null) {
            if (aVar.c() == null) {
                return new C14509b.a(C14509b.a.C3118a.CLOSED, (C13023e) null);
            }
            LocalDateTime plusDays = d10.plusDays(1);
            C17542s.i(plusDays, "plusDays(...)");
            if (c(c10, plusDays)) {
                C14509b.a.C3118a aVar2 = C14509b.a.C3118a.CLOSED;
                int i10 = C13561a.f115649l;
                String d11 = aVar.d();
                if (d11 != null) {
                    str2 = d11;
                }
                return new C14509b.a(aVar2, C13026h.b(i10, str2));
            }
            if (!(c10 == null || (dayOfWeek = c10.getDayOfWeek()) == null)) {
                str = dayOfWeek.getDisplayName(TextStyle.FULL, this.f126189b.A());
            }
            return new C14509b.a(C14509b.a.C3118a.CLOSED, C13026h.b(C13561a.f115647j, str + " " + aVar.d()));
        } else if (between.compareTo(f126187e) <= 0) {
            C14509b.a.C3118a aVar3 = C14509b.a.C3118a.OPENS_SOON;
            int i11 = C13561a.f115647j;
            String g10 = aVar.g();
            if (g10 != null) {
                str2 = g10;
            }
            return new C14509b.a(aVar3, C13026h.b(i11, str2));
        } else {
            C14509b.a.C3118a aVar4 = C14509b.a.C3118a.CLOSED;
            int i12 = C13561a.f115648k;
            String g11 = aVar.g();
            if (g11 != null) {
                str2 = g11;
            }
            return new C14509b.a(aVar4, C13026h.b(i12, str2));
        }
    }

    public C13023e b(C13018a.C2677a.C2678a aVar) {
        C17542s.j(aVar, "amenityOpeningHours");
        String g10 = aVar.g();
        String str = "";
        if (g10 == null) {
            g10 = str;
        }
        Boolean e10 = aVar.e();
        Boolean bool = Boolean.TRUE;
        if (C17542s.e(e10, bool) && aVar.b()) {
            return C13026h.b(C13561a.f115638a, g10);
        }
        if (!C17542s.e(aVar.e(), bool)) {
            return C13026h.a(C13561a.f115643f);
        }
        int i10 = C13561a.f115639b;
        String a10 = aVar.a();
        if (a10 != null) {
            str = a10;
        }
        return C13026h.b(i10, str);
    }
}
