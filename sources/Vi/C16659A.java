package VI;

import XH.t;
import ZI.c;
import aJ.C17030a;
import bJ.C17045d;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: VI.A  reason: case insensitive filesystem */
public final class C16659A {

    /* renamed from: b  reason: collision with root package name */
    public static final a f139314b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f139315a;

    /* renamed from: VI.A$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C16659A a(String str, String str2) {
            C17542s.j(str, "name");
            C17542s.j(str2, "desc");
            return new C16659A(str + '#' + str2, (DefaultConstructorMarker) null);
        }

        public final C16659A b(C17045d dVar) {
            C17542s.j(dVar, "signature");
            if (dVar instanceof C17045d.b) {
                C17045d.b bVar = (C17045d.b) dVar;
                return d(bVar.e(), bVar.d());
            } else if (dVar instanceof C17045d.a) {
                C17045d.a aVar = (C17045d.a) dVar;
                return a(aVar.e(), aVar.d());
            } else {
                throw new t();
            }
        }

        public final C16659A c(c cVar, C17030a.c cVar2) {
            C17542s.j(cVar, "nameResolver");
            C17542s.j(cVar2, "signature");
            return d(cVar.getString(cVar2.s()), cVar.getString(cVar2.r()));
        }

        public final C16659A d(String str, String str2) {
            C17542s.j(str, "name");
            C17542s.j(str2, "desc");
            return new C16659A(str + str2, (DefaultConstructorMarker) null);
        }

        public final C16659A e(C16659A a10, int i10) {
            C17542s.j(a10, "signature");
            return new C16659A(a10.a() + '@' + i10, (DefaultConstructorMarker) null);
        }

        private a() {
        }
    }

    public /* synthetic */ C16659A(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String a() {
        return this.f139315a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C16659A) && C17542s.e(this.f139315a, ((C16659A) obj).f139315a);
    }

    public int hashCode() {
        return this.f139315a.hashCode();
    }

    public String toString() {
        return "MemberSignature(signature=" + this.f139315a + ')';
    }

    private C16659A(String str) {
        this.f139315a = str;
    }
}
