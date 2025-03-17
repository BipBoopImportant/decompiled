package Gx;

import D4.M;
import Hx.c;
import Hx.d;
import Hx.f;
import Hx.g;
import TJ.C16532g;
import XH.C16807N;
import XH.x;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0001.J\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\nH¦@¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH¦@¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00022\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0016\u0010\u0017J(\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u000fH¦@¢\u0006\u0004\b\u001b\u0010\u001cJ \u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u000fH¦@¢\u0006\u0004\b\u001e\u0010\u001fJ*\u0010#\u001a\u00020\"2\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000f2\b\u0010!\u001a\u0004\u0018\u00010\u000fH¦@¢\u0006\u0004\b#\u0010\u001cJ(\u0010&\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000f2\u0006\u0010%\u001a\u00020$H¦@¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010(\u001a\u00020\u000fH¦@¢\u0006\u0004\b*\u0010+J\"\u0010-\u001a\u0004\u0018\u00010)2\u0006\u0010,\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\u000fH¦@¢\u0006\u0004\b-\u0010\u001f¨\u0006/"}, d2 = {"LGx/a;", "", "LTJ/g;", "LD4/M;", "LHx/d;", "h", "()LTJ/g;", "LXH/N;", "k", "()V", "LXH/x;", "m", "(LdI/e;)Ljava/lang/Object;", "LHx/f;", "type", "", "id", "LHx/c;", "l", "(LHx/f;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "j", "(Ljava/lang/String;)LTJ/g;", "i", "(Ljava/lang/String;)LHx/c;", "orderId", "cancelToken", "reasonCode", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "liteId", "e", "(Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "rescheduleToken", "deliveryNumber", "LHx/g;", "d", "LGx/a$a;", "timeWindow", "g", "(Ljava/lang/String;Ljava/lang/String;LGx/a$a;LdI/e;)Ljava/lang/Object;", "purchaseId", "LGx/b;", "c", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "customerId", "f", "a", "purchasehistorydata_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface a {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"LGx/a$a;", "", "", "id", "", "authorityToLeave", "LHx/c$c$c;", "type", "<init>", "(Ljava/lang/String;ZLHx/c$c$c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "()Z", "c", "LHx/c$c$c;", "()LHx/c$c$c;", "purchasehistorydata_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Gx.a$a  reason: collision with other inner class name */
    public static final class C2656a {

        /* renamed from: a  reason: collision with root package name */
        private final String f110512a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f110513b;

        /* renamed from: c  reason: collision with root package name */
        private final c.C2661c.C2663c f110514c;

        public C2656a(String str, boolean z10, c.C2661c.C2663c cVar) {
            C17542s.j(str, "id");
            this.f110512a = str;
            this.f110513b = z10;
            this.f110514c = cVar;
        }

        public final boolean a() {
            return this.f110513b;
        }

        public final String b() {
            return this.f110512a;
        }

        public final c.C2661c.C2663c c() {
            return this.f110514c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2656a)) {
                return false;
            }
            C2656a aVar = (C2656a) obj;
            return C17542s.e(this.f110512a, aVar.f110512a) && this.f110513b == aVar.f110513b && this.f110514c == aVar.f110514c;
        }

        public int hashCode() {
            int hashCode = ((this.f110512a.hashCode() * 31) + Boolean.hashCode(this.f110513b)) * 31;
            c.C2661c.C2663c cVar = this.f110514c;
            return hashCode + (cVar == null ? 0 : cVar.hashCode());
        }

        public String toString() {
            String str = this.f110512a;
            boolean z10 = this.f110513b;
            c.C2661c.C2663c cVar = this.f110514c;
            return "RescheduleTimeWindowInput(id=" + str + ", authorityToLeave=" + z10 + ", type=" + cVar + ")";
        }
    }

    Object b(String str, String str2, String str3, C17164e<? super C16807N> eVar);

    Object c(String str, C17164e<? super b> eVar);

    Object d(String str, String str2, String str3, C17164e<? super g> eVar);

    Object e(String str, String str2, C17164e<? super c> eVar);

    Object f(String str, String str2, C17164e<? super b> eVar);

    Object g(String str, String str2, C2656a aVar, C17164e<? super C16807N> eVar);

    C16532g<M<d>> h();

    c i(String str);

    C16532g<c> j(String str);

    void k();

    Object l(f fVar, String str, C17164e<? super c> eVar);

    Object m(C17164e<? super x<d>> eVar);
}
