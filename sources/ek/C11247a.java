package ek;

import XH.C16807N;
import YH.X;
import androidx.navigation.fragment.FragmentNavigator;
import androidx.navigation.fragment.c;
import com.ingka.ikea.app.sharedlist.impl.navigation.SharedListRoutes$SharedList;
import com.ingka.ikea.app.sharedlist.impl.presentation.ui.SharedListFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.P;
import nI.C17642l;
import x4.s;
import x4.y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx4/y;", "LXH/N;", "a", "(Lx4/y;)V", "sharedlist-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: ek.a  reason: case insensitive filesystem */
public final class C11247a {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000\"\n\b\u0001\u0010\u0003 \u0001*\u00020\u0002*\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "T", "Lx4/v;", "D", "Lx4/s;", "LXH/N;", "a", "(Lx4/s;)V"}, k = 3, mv = {2, 1, 0})
    /* renamed from: ek.a$a  reason: collision with other inner class name */
    public static final class C2152a extends C17544u implements C17642l<s, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final C2152a f97127c = new C2152a();

        public C2152a() {
            super(1);
        }

        public final void a(s sVar) {
            C17542s.j(sVar, "$this$deepLink");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((s) obj);
            return C16807N.f139792a;
        }
    }

    public static final void a(y yVar) {
        C17542s.j(yVar, "<this>");
        Class<SharedListRoutes$SharedList> cls = SharedListRoutes$SharedList.class;
        c cVar = new c((FragmentNavigator) yVar.l().d(FragmentNavigator.class), P.b(cls), X.j(), P.b(SharedListFragment.class));
        cVar.e("ikea://navigation/sharedlist", P.b(cls), C2152a.f97127c);
        yVar.k(cVar);
    }
}
