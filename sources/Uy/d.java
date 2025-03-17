package uy;

import SJ.C16423B;
import XH.C16807N;
import XH.t;
import android.content.Context;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.p;
import x4.C8951o;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001:\u0002\u0007\u0005J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Luy/d;", "", "Luy/d$a;", "action", "LXH/N;", "a", "(Luy/d$a;LdI/e;)Ljava/lang/Object;", "b", "room-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface d {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0002\u0004\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Luy/d$a;", "", "a", "c", "b", "Luy/d$a$a;", "Luy/d$a$c;", "room-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f131390a = b.f131392a;

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Luy/d$a$a;", "Luy/d$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "room-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: uy.d$a$a  reason: collision with other inner class name */
        public static final class C3254a implements a {

            /* renamed from: b  reason: collision with root package name */
            public static final C3254a f131391b = new C3254a();

            private C3254a() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C3254a);
            }

            public int hashCode() {
                return 442115791;
            }

            public String toString() {
                return "Back";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\n\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Luy/d$a$b;", "", "<init>", "()V", "Luy/d$a;", "Landroid/content/Context;", "context", "Lx4/o;", "navController", "LXH/N;", "a", "(Luy/d$a;Landroid/content/Context;Lx4/o;)V", "room-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b {

            /* renamed from: a  reason: collision with root package name */
            static final /* synthetic */ b f131392a = new b();

            private b() {
            }

            public final void a(a aVar, Context context, C8951o oVar) {
                C17542s.j(aVar, "<this>");
                C17542s.j(context, "context");
                C17542s.j(oVar, "navController");
                if (C17542s.e(aVar, C3254a.f131391b)) {
                    oVar.k0();
                } else if (aVar instanceof c) {
                    ((c) aVar).a().invoke(context, oVar);
                } else {
                    throw new t();
                }
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R)\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Luy/d$a$c;", "Luy/d$a;", "Lkotlin/Function2;", "Landroid/content/Context;", "Lx4/o;", "LXH/N;", "navigate", "<init>", "(LnI/p;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "LnI/p;", "a", "()LnI/p;", "room-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class c implements a {

            /* renamed from: b  reason: collision with root package name */
            private final p<Context, C8951o, C16807N> f131393b;

            public c(p<? super Context, ? super C8951o, C16807N> pVar) {
                C17542s.j(pVar, "navigate");
                this.f131393b = pVar;
            }

            public final p<Context, C8951o, C16807N> a() {
                return this.f131393b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && C17542s.e(this.f131393b, ((c) obj).f131393b);
            }

            public int hashCode() {
                return this.f131393b.hashCode();
            }

            public String toString() {
                p<Context, C8951o, C16807N> pVar = this.f131393b;
                return "Navigate(navigate=" + pVar + ")";
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Luy/d$b;", "", "LSJ/B;", "Luy/d$a;", "channel", "Luy/d;", "a", "(LSJ/B;)Luy/d;", "room-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface b {
        d a(C16423B<? super a> b10);
    }

    Object a(a aVar, C17164e<? super C16807N> eVar);
}
