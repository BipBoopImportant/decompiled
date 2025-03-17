package ys;

import IC.C13023e;
import IC.C13026h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import ys.C12503b;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0001\u0001\u0006¨\u0006\u0007"}, d2 = {"Lys/f;", "", "d", "c", "b", "a", "Lys/f$d;", "inbox-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ys.f  reason: case insensitive filesystem */
public interface C12507f {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lys/f$a;", "", "LIC/e;", "text", "Lys/b;", "event", "<init>", "(LIC/e;Lys/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIC/e;", "b", "()LIC/e;", "Lys/b;", "()Lys/b;", "inbox-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ys.f$a */
    public static final class a {

        /* renamed from: c  reason: collision with root package name */
        public static final int f107258c = C13023e.f110931a;

        /* renamed from: a  reason: collision with root package name */
        private final C13023e f107259a;

        /* renamed from: b  reason: collision with root package name */
        private final C12503b f107260b;

        public a(C13023e eVar, C12503b bVar) {
            C17542s.j(eVar, "text");
            C17542s.j(bVar, "event");
            this.f107259a = eVar;
            this.f107260b = bVar;
        }

        public final C12503b a() {
            return this.f107260b;
        }

        public final C13023e b() {
            return this.f107259a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f107259a, aVar.f107259a) && C17542s.e(this.f107260b, aVar.f107260b);
        }

        public int hashCode() {
            return (this.f107259a.hashCode() * 31) + this.f107260b.hashCode();
        }

        public String toString() {
            C13023e eVar = this.f107259a;
            C12503b bVar = this.f107260b;
            return "Action(text=" + eVar + ", event=" + bVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\u00020\n8\u0016X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0005\u0010\r¨\u0006\u000f"}, d2 = {"Lys/f$b;", "Lys/f$d;", "<init>", "()V", "LIC/e;", "b", "LIC/e;", "a", "()LIC/e;", "text", "Lys/f$a;", "c", "Lys/f$a;", "()Lys/f$a;", "action", "inbox-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ys.f$b */
    public static final class b implements d {

        /* renamed from: a  reason: collision with root package name */
        public static final b f107261a = new b();

        /* renamed from: b  reason: collision with root package name */
        private static final C13023e f107262b = C13026h.a(Oo.b.f84406I8);

        /* renamed from: c  reason: collision with root package name */
        private static final a f107263c = new a(C13026h.a(Oo.b.f84416J8), C12503b.k.f107226a);

        /* renamed from: d  reason: collision with root package name */
        public static final int f107264d = C13023e.f110931a;

        private b() {
        }

        public C13023e a() {
            return f107262b;
        }

        public a b() {
            return f107263c;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\u00020\n8\u0016X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0005\u0010\r¨\u0006\u000f"}, d2 = {"Lys/f$c;", "Lys/f$d;", "<init>", "()V", "LIC/e;", "b", "LIC/e;", "a", "()LIC/e;", "text", "Lys/f$a;", "c", "Lys/f$a;", "()Lys/f$a;", "action", "inbox-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ys.f$c */
    public static final class c implements d {

        /* renamed from: a  reason: collision with root package name */
        public static final c f107265a = new c();

        /* renamed from: b  reason: collision with root package name */
        private static final C13023e f107266b = C13026h.a(qs.d.f101989a);

        /* renamed from: c  reason: collision with root package name */
        private static final a f107267c = new a(C13026h.a(Oo.b.f84750p7), C12503b.j.f107225a);

        /* renamed from: d  reason: collision with root package name */
        public static final int f107268d = C13023e.f110931a;

        private c() {
        }

        public C13023e a() {
            return f107266b;
        }

        public a b() {
            return f107267c;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lys/f$d;", "Lys/f;", "LIC/e;", "a", "()LIC/e;", "text", "Lys/f$a;", "b", "()Lys/f$a;", "action", "Lys/f$b;", "Lys/f$c;", "inbox-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ys.f$d */
    public interface d extends C12507f {
        C13023e a();

        a b();
    }
}
