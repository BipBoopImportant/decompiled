package au;

import XH.t;
import Zt.b;
import ep.C11256b;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import jt.b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tI.C17978n;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u001c2\u00020\u0001:\u0001\u0014B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010 \u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0007¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\"¨\u0006#"}, d2 = {"Lau/a;", "", "Lep/b;", "localizedDateTimeFormatter", "<init>", "(Lep/b;)V", "Ljava/time/LocalDateTime;", "startDate", "endDate", "Ljava/util/Locale;", "locale", "", "d", "(Ljava/time/LocalDateTime;Ljava/time/LocalDateTime;Ljava/util/Locale;)Ljava/lang/String;", "Ljt/b;", "event", "mobileNumber", "", "e", "(Ljt/b;Ljava/lang/String;)Ljava/lang/Boolean;", "a", "(Ljt/b;)Ljava/lang/Boolean;", "Ljt/b$f;", "timeSlot", "", "selectedAdults", "selectedChildren", "LZt/b$b;", "b", "(Ljt/b;Ljt/b$f;II)LZt/b$b;", "Ljt/b$d;", "eventRegistration", "c", "(Ljt/b$d;Ljt/b$f;II)I", "Lep/b;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.a  reason: case insensitive filesystem */
public final class C11096a {

    /* renamed from: b  reason: collision with root package name */
    public static final C1962a f90451b = new C1962a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f90452c = 8;

    /* renamed from: a  reason: collision with root package name */
    private final C11256b f90453a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lau/a$a;", "", "<init>", "()V", "", "DATE_TIME_PATTERN", "Ljava/lang/String;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.a$a  reason: collision with other inner class name */
    public static final class C1962a {
        public /* synthetic */ C1962a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1962a() {
        }
    }

    public C11096a(C11256b bVar) {
        C17542s.j(bVar, "localizedDateTimeFormatter");
        this.f90453a = bVar;
    }

    public final Boolean a(b bVar) {
        C17542s.j(bVar, "event");
        if (bVar.f().f().contains(b.e.EMAIL)) {
            return Boolean.FALSE;
        }
        return null;
    }

    public final b.C1947b b(jt.b bVar, b.f fVar, int i10, int i11) {
        C17542s.j(bVar, "event");
        C17542s.j(fVar, "timeSlot");
        b.d f10 = bVar.f();
        int c10 = c(f10, fVar, i10, i11);
        boolean z10 = false;
        boolean z11 = f10.c() > 0;
        if (f10.b() > 0) {
            z10 = true;
        }
        return new b.C1947b(z11, z10, C17978n.i(f10.c(), c10), f10.a() ? C17978n.i(f10.b(), c10) : f10.b());
    }

    public final int c(b.d dVar, b.f fVar, int i10, int i11) {
        int i12;
        C17542s.j(dVar, "eventRegistration");
        C17542s.j(fVar, "timeSlot");
        b.f.a g10 = fVar.g();
        b.f.a.C2236f.C2237a aVar = null;
        b.f.a.C2236f fVar2 = g10 instanceof b.f.a.C2236f ? (b.f.a.C2236f) g10 : null;
        if (fVar2 != null) {
            aVar = fVar2.c();
        }
        if (aVar instanceof b.f.a.C2236f.C2237a.C2238a) {
            i12 = ((b.f.a.C2236f.C2237a.C2238a) aVar).a();
        } else if (C17542s.e(aVar, b.f.a.C2236f.C2237a.C2239b.f98753a)) {
            i12 = 10;
        } else if (aVar == null) {
            i12 = 0;
        } else {
            throw new t();
        }
        if (i12 == 0) {
            return 0;
        }
        return (dVar.b() != 0 && dVar.a()) ? (i12 - i10) - i11 : i12 - i10;
    }

    public final String d(LocalDateTime localDateTime, LocalDateTime localDateTime2, Locale locale) {
        C17542s.j(localDateTime, "startDate");
        C17542s.j(localDateTime2, "endDate");
        C17542s.j(locale, "locale");
        return DateTimeFormatter.ofPattern("EEEE, dd MMM HH:mm", locale).format(localDateTime) + " – " + this.f90453a.d().format(localDateTime2);
    }

    public final Boolean e(jt.b bVar, String str) {
        C17542s.j(bVar, "event");
        if (!bVar.f().f().contains(b.e.SMS) || str == null || str.length() == 0) {
            return null;
        }
        return Boolean.FALSE;
    }
}
