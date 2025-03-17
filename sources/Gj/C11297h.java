package gj;

import Sy.a;
import Vj.a;
import XH.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lgj/h;", "", "<init>", "()V", "", "format", "", "rawValue", "Lgj/h$a;", "a", "(ILjava/lang/String;)Lgj/h$a;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gj.h  reason: case insensitive filesystem */
public final class C11297h {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lgj/h$a;", "", "b", "a", "Lgj/h$a$a;", "Lgj/h$a$b;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: gj.h$a */
    public interface a {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lgj/h$a$a;", "Lgj/h$a;", "", "e", "<init>", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: gj.h$a$a  reason: collision with other inner class name */
        public static final class C2180a implements a {

            /* renamed from: a  reason: collision with root package name */
            private final Throwable f97548a;

            public C2180a(Throwable th2) {
                C17542s.j(th2, "e");
                this.f97548a = th2;
            }

            public final Throwable a() {
                return this.f97548a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2180a) && C17542s.e(this.f97548a, ((C2180a) obj).f97548a);
            }

            public int hashCode() {
                return this.f97548a.hashCode();
            }

            public String toString() {
                Throwable th2 = this.f97548a;
                return "Failure(e=" + th2 + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lgj/h$a$b;", "Lgj/h$a;", "Lgj/g;", "result", "<init>", "(Lgj/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgj/g;", "()Lgj/g;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: gj.h$a$b */
        public static final class b implements a {

            /* renamed from: a  reason: collision with root package name */
            private final C11296g f97549a;

            public b(C11296g gVar) {
                C17542s.j(gVar, "result");
                this.f97549a = gVar;
            }

            public final C11296g a() {
                return this.f97549a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && C17542s.e(this.f97549a, ((b) obj).f97549a);
            }

            public int hashCode() {
                return this.f97549a.hashCode();
            }

            public String toString() {
                C11296g gVar = this.f97549a;
                return "Success(result=" + gVar + ")";
            }
        }
    }

    public final a a(int i10, String str) {
        C17542s.j(str, "rawValue");
        Vj.a a10 = Vj.a.f88655c.a(i10);
        if (!a10.c(str)) {
            a10 = null;
        }
        if ((a10 instanceof a.e) || (a10 instanceof a.g)) {
            return new a.b(new C11296g(str, a.C2850a.C2851a.f116637c));
        }
        if (a10 instanceof a.d) {
            return new a.b(new C11296g(str, a.C2850a.c.f116638c));
        }
        if (C17542s.e(a10, a.i.f88666e)) {
            return new a.b(new C11296g(str, a.C2850a.e.f116640c));
        }
        if (C17542s.e(a10, a.h.f88665e) || C17542s.e(a10, a.j.f88667e) || a10 == null) {
            return new a.C2180a(new IllegalArgumentException("The encoding " + a10 + " is not supported"));
        }
        throw new t();
    }
}
