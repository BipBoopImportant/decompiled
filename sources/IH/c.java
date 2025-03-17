package IH;

import EH.C15618c;
import GH.C15702a;
import HH.C15813d;
import XH.C16807N;
import com.optimizely.ab.config.FeatureVariable;
import kK.C17514c;
import kK.C17516e;
import kK.v;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a%\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\"\u0017\u0010\u000b\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0006\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"LGH/a;", "LkK/c;", "json", "LEH/c;", "contentType", "LXH/N;", "a", "(LGH/a;LkK/c;LEH/c;)V", "LkK/c;", "getDefaultJson", "()LkK/c;", "DefaultJson", "ktor-serialization-kotlinx-json"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final C17514c f135444a = v.b((C17514c) null, a.f135445c, 1, (Object) null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LkK/e;", "LXH/N;", "invoke", "(LkK/e;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<C17516e, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f135445c = new a();

        a() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((C17516e) obj);
            return C16807N.f139792a;
        }

        public final void invoke(C17516e eVar) {
            C17542s.j(eVar, "$this$Json");
            eVar.e(true);
            eVar.h(true);
            eVar.c(true);
            eVar.d(true);
            eVar.i(false);
            eVar.l(false);
        }
    }

    public static final void a(C15702a aVar, C17514c cVar, C15618c cVar2) {
        C17542s.j(aVar, "<this>");
        C17542s.j(cVar, FeatureVariable.JSON_TYPE);
        C17542s.j(cVar2, "contentType");
        C15813d.a(aVar, cVar2, cVar);
    }

    public static /* synthetic */ void b(C15702a aVar, C17514c cVar, C15618c cVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cVar = f135444a;
        }
        if ((i10 & 2) != 0) {
            cVar2 = C15618c.a.f133990a.a();
        }
        a(aVar, cVar, cVar2);
    }
}
