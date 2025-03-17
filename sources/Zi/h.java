package ZI;

import XI.v;
import XI.w;
import YH.C16877v;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class h {

    /* renamed from: b  reason: collision with root package name */
    public static final a f140844b = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final h f140845c = new h(C16877v.n());

    /* renamed from: a  reason: collision with root package name */
    private final List<v> f140846a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h a(w wVar) {
            C17542s.j(wVar, "table");
            if (wVar.q() == 0) {
                return b();
            }
            List<v> r10 = wVar.r();
            C17542s.i(r10, "getRequirementList(...)");
            return new h(r10, (DefaultConstructorMarker) null);
        }

        public final h b() {
            return h.f140845c;
        }

        private a() {
        }
    }

    public /* synthetic */ h(List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(list);
    }

    private h(List<v> list) {
        this.f140846a = list;
    }
}
