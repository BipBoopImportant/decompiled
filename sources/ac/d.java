package AC;

import FC.C12865a;
import FC.C12866b;
import FC.C12867c;
import XH.C16807N;
import XH.C16818i;
import android.net.Uri;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.L;
import androidx.lifecycle.U;
import kotlin.Metadata;
import kotlin.jvm.internal.C17537m;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import ow.c;
import x4.C8951o;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ3\u0010\u0012\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b0\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LAC/d;", "LFC/c;", "<init>", "()V", "Lx4/o;", "navController", "LFC/a;", "mode", "LXH/N;", "a", "(Lx4/o;LFC/a;)V", "Landroidx/lifecycle/U;", "savedStateHandle", "Landroidx/lifecycle/y;", "lifecycleOwner", "Lkotlin/Function1;", "LFC/b;", "result", "b", "(Landroidx/lifecycle/U;Landroidx/lifecycle/y;LnI/l;)V", "timeslot-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements C12867c {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements L, C17537m {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ C17642l f107619a;

        a(C17642l lVar) {
            C17542s.j(lVar, "function");
            this.f107619a = lVar;
        }

        public final C16818i<?> c() {
            return this.f107619a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof L) || !(obj instanceof C17537m)) {
                return false;
            }
            return C17542s.e(c(), ((C17537m) obj).c());
        }

        public final int hashCode() {
            return c().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f107619a.invoke(obj);
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N d(U u10, C17642l lVar, C12866b bVar) {
        u10.j("selected_time_slot");
        C17542s.g(bVar);
        lVar.invoke(bVar);
        return C16807N.f139792a;
    }

    public void a(C8951o oVar, C12865a aVar) {
        C17542s.j(oVar, "navController");
        C17542s.j(aVar, "mode");
        Uri build = c.a(Uri.parse("ikea://navigation/scanandgo/timeslot/picker?type={type}")).buildUpon().appendQueryParameter("type", String.valueOf(aVar.ordinal())).build();
        C17542s.i(build, "build(...)");
        oVar.Y(build, rw.c.f28698a.c().a());
    }

    public void b(U u10, C5221y yVar, C17642l<? super C12866b, C16807N> lVar) {
        C17542s.j(u10, "savedStateHandle");
        C17542s.j(yVar, "lifecycleOwner");
        C17542s.j(lVar, "result");
        u10.g("selected_time_slot").observe(yVar, new a(new C12562c(u10, lVar)));
    }
}
