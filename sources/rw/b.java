package rw;

import XH.C16807N;
import android.os.Bundle;
import com.google.android.libraries.places.api.model.PlaceTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import x4.C;
import x4.C8951o;
import x4.v;
import x4.x;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0007\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lx4/o;", "", "route", "Lkotlin/Function0;", "LXH/N;", "block", "Lx4/o$c;", "b", "(Lx4/o;Ljava/lang/String;LnI/a;)Lx4/o$c;", "Lx4/C$a;", "a", "(Lx4/o;)Lx4/C$a;", "navigation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class b {

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"rw/b$a", "Lx4/o$c;", "Lx4/o;", "controller", "Lx4/v;", "destination", "Landroid/os/Bundle;", "arguments", "LXH/N;", "a", "(Lx4/o;Lx4/v;Landroid/os/Bundle;)V", "navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements C8951o.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C8951o f28695a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f28696b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f28697c;

        a(C8951o oVar, String str, C17631a<C16807N> aVar) {
            this.f28695a = oVar;
            this.f28696b = str;
            this.f28697c = aVar;
        }

        public void a(C8951o oVar, v vVar, Bundle bundle) {
            C17542s.j(oVar, "controller");
            C17542s.j(vVar, "destination");
            v J10 = this.f28695a.J();
            if (C17542s.e(J10 != null ? J10.C() : null, this.f28696b)) {
                oVar.y0(this);
                this.f28697c.invoke();
            }
        }
    }

    public static final C.a a(C8951o oVar) {
        C17542s.j(oVar, "<this>");
        return new C.a().m(true).d(true).i(x.f57702q.b(oVar.L()).C(), false, true);
    }

    public static final C8951o.c b(C8951o oVar, String str, C17631a<C16807N> aVar) {
        C17542s.j(oVar, "<this>");
        C17542s.j(str, PlaceTypes.ROUTE);
        C17542s.j(aVar, "block");
        v J10 = oVar.J();
        if (C17542s.e(J10 != null ? J10.C() : null, str)) {
            aVar.invoke();
            return null;
        }
        a aVar2 = new a(oVar, str, aVar);
        oVar.r(aVar2);
        return aVar2;
    }
}
