package du;

import IC.C13023e;
import IC.C13026h;
import KJ.C15985a;
import KJ.C15990f;
import Wt.d;
import XH.C16796C;
import XH.t;
import XH.v;
import YH.C16877v;
import am.h;
import cu.i;
import ep.C11256b;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import jt.b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u001e2\u00020\u0001:\u0002\u000f\u0015B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001c¨\u0006\u001f"}, d2 = {"Ldu/a;", "", "Lep/b;", "localizedDateTimeFormatter", "Lam/h;", "timeProvider", "<init>", "(Lep/b;Lam/h;)V", "Ljt/b$f;", "LIC/e;", "c", "(Ljt/b$f;)LIC/e;", "Ljt/b;", "storeEvent", "Ldu/a$b;", "b", "(Ljt/b;)Ldu/a$b;", "timeSlot", "Ljava/time/LocalDateTime;", "currentTime", "Lcu/i;", "a", "(Ljt/b$f;Ljava/time/LocalDateTime;)Lcu/i;", "Lep/b;", "getLocalizedDateTimeFormatter", "()Lep/b;", "Lam/h;", "Ljava/time/format/DateTimeFormatter;", "Ljava/time/format/DateTimeFormatter;", "timeFormatter", "d", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: du.a  reason: case insensitive filesystem */
public final class C11241a {

    /* renamed from: d  reason: collision with root package name */
    public static final C2151a f97111d = new C2151a((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f97112e = 8;

    /* renamed from: a  reason: collision with root package name */
    private final C11256b f97113a;

    /* renamed from: b  reason: collision with root package name */
    private final h f97114b;

    /* renamed from: c  reason: collision with root package name */
    private final DateTimeFormatter f97115c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ldu/a$a;", "", "<init>", "()V", "", "DATE_TIME_PATTERN", "Ljava/lang/String;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: du.a$a  reason: collision with other inner class name */
    public static final class C2151a {
        public /* synthetic */ C2151a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C2151a() {
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u0001BU\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u0016\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001f¨\u0006 "}, d2 = {"Ldu/a$b;", "", "LKJ/f;", "Lcu/i;", "comingSoon", "available", "waitingList", "fullyBooked", "closedForRegistration", "", "isSignedUpForEvent", "<init>", "(LKJ/f;LKJ/f;LKJ/f;LKJ/f;LKJ/f;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LKJ/f;", "c", "()LKJ/f;", "b", "e", "d", "f", "Z", "()Z", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: du.a$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final C15990f<i> f97116a;

        /* renamed from: b  reason: collision with root package name */
        private final C15990f<i> f97117b;

        /* renamed from: c  reason: collision with root package name */
        private final C15990f<i> f97118c;

        /* renamed from: d  reason: collision with root package name */
        private final C15990f<i> f97119d;

        /* renamed from: e  reason: collision with root package name */
        private final C15990f<i> f97120e;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f97121f;

        public b(C15990f<i> fVar, C15990f<i> fVar2, C15990f<i> fVar3, C15990f<i> fVar4, C15990f<i> fVar5, boolean z10) {
            C17542s.j(fVar, "comingSoon");
            C17542s.j(fVar2, "available");
            C17542s.j(fVar3, "waitingList");
            C17542s.j(fVar4, "fullyBooked");
            C17542s.j(fVar5, "closedForRegistration");
            this.f97116a = fVar;
            this.f97117b = fVar2;
            this.f97118c = fVar3;
            this.f97119d = fVar4;
            this.f97120e = fVar5;
            this.f97121f = z10;
        }

        public final C15990f<i> a() {
            return this.f97117b;
        }

        public final C15990f<i> b() {
            return this.f97120e;
        }

        public final C15990f<i> c() {
            return this.f97116a;
        }

        public final C15990f<i> d() {
            return this.f97119d;
        }

        public final C15990f<i> e() {
            return this.f97118c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f97116a, bVar.f97116a) && C17542s.e(this.f97117b, bVar.f97117b) && C17542s.e(this.f97118c, bVar.f97118c) && C17542s.e(this.f97119d, bVar.f97119d) && C17542s.e(this.f97120e, bVar.f97120e) && this.f97121f == bVar.f97121f;
        }

        public final boolean f() {
            return this.f97121f;
        }

        public int hashCode() {
            return (((((((((this.f97116a.hashCode() * 31) + this.f97117b.hashCode()) * 31) + this.f97118c.hashCode()) * 31) + this.f97119d.hashCode()) * 31) + this.f97120e.hashCode()) * 31) + Boolean.hashCode(this.f97121f);
        }

        public String toString() {
            C15990f<i> fVar = this.f97116a;
            C15990f<i> fVar2 = this.f97117b;
            C15990f<i> fVar3 = this.f97118c;
            C15990f<i> fVar4 = this.f97119d;
            C15990f<i> fVar5 = this.f97120e;
            boolean z10 = this.f97121f;
            return "TimeSlotList(comingSoon=" + fVar + ", available=" + fVar2 + ", waitingList=" + fVar3 + ", fullyBooked=" + fVar4 + ", closedForRegistration=" + fVar5 + ", isSignedUpForEvent=" + z10 + ")";
        }
    }

    public C11241a(C11256b bVar, h hVar) {
        C17542s.j(bVar, "localizedDateTimeFormatter");
        C17542s.j(hVar, "timeProvider");
        this.f97113a = bVar;
        this.f97114b = hVar;
        this.f97115c = bVar.d();
    }

    private final C13023e c(b.f fVar) {
        v vVar;
        String format = this.f97115c.format(fVar.f());
        String format2 = this.f97115c.format(fVar.c());
        if (C17542s.e(fVar.f().toLocalDate(), fVar.c().toLocalDate())) {
            vVar = C16796C.a(this.f97113a.b(fVar.f(), "EEEE, dd MMM") + " " + format, format2);
        } else {
            String b10 = this.f97113a.b(fVar.f(), "EEEE, dd MMM");
            String str = b10 + " " + format;
            vVar = C16796C.a(str, this.f97113a.b(fVar.c(), "EEEE, dd MMM") + " " + format2);
        }
        return C13026h.c(((String) vVar.a()) + " - " + ((String) vVar.b()));
    }

    public final i a(b.f fVar, LocalDateTime localDateTime) {
        C17542s.j(fVar, "timeSlot");
        C17542s.j(localDateTime, "currentTime");
        return new i(fVar.d(), c(fVar), d.b(fVar, localDateTime, true), !fVar.h(localDateTime) && !(fVar.g() instanceof b.f.a.C2235b), fVar.g());
    }

    public final b b(jt.b bVar) {
        boolean z10;
        jt.b bVar2 = bVar;
        C17542s.j(bVar2, "storeEvent");
        C15990f.a e10 = C15985a.a().e();
        C15990f.a<i> e11 = C15985a.a().e();
        C15990f.a<i> e12 = C15985a.a().e();
        C15990f.a e13 = C15985a.a().e();
        C15990f.a e14 = C15985a.a().e();
        LocalDateTime d10 = this.f97114b.d();
        String str = null;
        for (b.f fVar : bVar.h()) {
            i a10 = a(fVar, d10);
            if (!bVar2.i(d10)) {
                e10.add(a10);
            } else if (fVar.h(d10)) {
                e14.add(a10);
            } else {
                b.f.a g10 = fVar.g();
                if (C17542s.e(g10, b.f.a.C2235b.f98747a)) {
                    e13.add(a10);
                } else if (C17542s.e(g10, b.f.a.c.f98748a)) {
                    e11.add(a10);
                } else if (C17542s.e(g10, b.f.a.d.f98749a)) {
                    str = fVar.d();
                    e12.add(a10);
                } else if (C17542s.e(g10, b.f.a.e.f98750a)) {
                    str = fVar.d();
                    e11.add(a10);
                } else if (g10 instanceof b.f.a.C2236f) {
                    e11.add(a10);
                } else if (C17542s.e(g10, b.f.a.g.f98754a)) {
                    e12.add(a10);
                } else {
                    throw new t();
                }
            }
        }
        if (str != null) {
            ArrayList arrayList = new ArrayList(C16877v.y(e11, 10));
            for (i iVar : e11) {
                arrayList.add(i.b(iVar, (String) null, (C13023e) null, (C13023e) null, C17542s.e(iVar.f(), str), (b.f.a) null, 23, (Object) null));
            }
            e11 = C15985a.l(arrayList).e();
            ArrayList arrayList2 = new ArrayList(C16877v.y(e12, 10));
            for (i iVar2 : e12) {
                arrayList2.add(i.b(iVar2, (String) null, (C13023e) null, (C13023e) null, C17542s.e(iVar2.f(), str), (b.f.a) null, 23, (Object) null));
            }
            e12 = C15985a.l(arrayList2).e();
        }
        C15990f g11 = e10.g();
        C15990f g12 = e11.g();
        C15990f g13 = e12.g();
        C15990f g14 = e13.g();
        C15990f g15 = e14.g();
        Iterable h10 = bVar.h();
        if (!(h10 instanceof Collection) || !((Collection) h10).isEmpty()) {
            Iterator it = h10.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((b.f) it.next()).g().b()) {
                        z10 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z10 = false;
        return new b(g11, g12, g13, g14, g15, z10);
    }
}
