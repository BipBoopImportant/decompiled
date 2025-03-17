package wy;

import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.q;
import sy.d;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u0000 \u00122\u00020\u0001:\u0002\u0012\u0010B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lwy/l;", "", "Lwy/l$b;", "content", "<init>", "(Lwy/l$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lwy/l$b;", "b", "room-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l {

    /* renamed from: b  reason: collision with root package name */
    public static final a f131816b = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final b<?> f131817a;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lwy/l$a;", "", "<init>", "()V", "Lwy/l;", "LXH/N;", "b", "(Lwy/l;LU0/m;I)V", "room-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public static final C16807N c(a aVar, l lVar, int i10, C4889m mVar, int i11) {
            aVar.b(lVar, mVar, M0.a(i10 | 1));
            return C16807N.f139792a;
        }

        public final void b(l lVar, C4889m mVar, int i10) {
            int i11;
            C17542s.j(lVar, "<this>");
            C4889m k10 = mVar.k(-489264401);
            if ((i10 & 6) == 0) {
                i11 = (k10.V(lVar) ? 4 : 2) | i10;
            } else {
                i11 = i10;
            }
            if ((i11 & 3) != 2 || !k10.l()) {
                if (C4895p.J()) {
                    C4895p.S(-489264401, i11, -1, "com.ingka.ikea.room.impl.presentation.composables.Slot.Companion.Content (Slot.kt:45)");
                }
                lVar.f131817a.b(k10, 0);
                if (C4895p.J()) {
                    C4895p.R();
                }
            } else {
                k10.L();
            }
            Y0 n10 = k10.n();
            if (n10 != null) {
                n10.a(new k(this, lVar, i10));
            }
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B#\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00028\u00008\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0018R\u0017\u0010\u001c\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000e¨\u0006\u001d"}, d2 = {"Lwy/l$b;", "Lsy/d;", "T", "", "slotModel", "Lkotlin/Function1;", "LXH/N;", "content", "<init>", "(Lsy/d;LnI/q;)V", "b", "(LU0/m;I)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsy/d;", "LnI/q;", "c", "Ljava/lang/String;", "getId", "id", "room-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b<T extends d> {

        /* renamed from: a  reason: collision with root package name */
        private final T f131818a;

        /* renamed from: b  reason: collision with root package name */
        private final q<T, C4889m, Integer, C16807N> f131819b;

        /* renamed from: c  reason: collision with root package name */
        private final String f131820c;

        public b(T t10, q<? super T, ? super C4889m, ? super Integer, C16807N> qVar) {
            C17542s.j(t10, "slotModel");
            C17542s.j(qVar, "content");
            this.f131818a = t10;
            this.f131819b = qVar;
            this.f131820c = t10.getId();
        }

        /* access modifiers changed from: private */
        public static final C16807N c(b bVar, int i10, C4889m mVar, int i11) {
            bVar.b(mVar, M0.a(i10 | 1));
            return C16807N.f139792a;
        }

        public final void b(C4889m mVar, int i10) {
            int i11;
            C4889m k10 = mVar.k(-2045886455);
            if ((i10 & 6) == 0) {
                i11 = (k10.V(this) ? 4 : 2) | i10;
            } else {
                i11 = i10;
            }
            if ((i11 & 3) != 2 || !k10.l()) {
                if (C4895p.J()) {
                    C4895p.S(-2045886455, i11, -1, "com.ingka.ikea.room.impl.presentation.composables.Slot.Content.Render (Slot.kt:37)");
                }
                this.f131819b.invoke(this.f131818a, k10, 0);
                if (C4895p.J()) {
                    C4895p.R();
                }
            } else {
                k10.L();
            }
            Y0 n10 = k10.n();
            if (n10 != null) {
                n10.a(new m(this, i10));
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f131818a, bVar.f131818a) && C17542s.e(this.f131819b, bVar.f131819b);
        }

        public int hashCode() {
            return (this.f131818a.hashCode() * 31) + this.f131819b.hashCode();
        }

        public String toString() {
            T t10 = this.f131818a;
            q<T, C4889m, Integer, C16807N> qVar = this.f131819b;
            return "Content(slotModel=" + t10 + ", content=" + qVar + ")";
        }
    }

    public l(b<?> bVar) {
        C17542s.j(bVar, "content");
        this.f131817a = bVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && C17542s.e(this.f131817a, ((l) obj).f131817a);
    }

    public int hashCode() {
        return this.f131817a.hashCode();
    }

    public String toString() {
        b<?> bVar = this.f131817a;
        return "Slot(content=" + bVar + ")";
    }
}
