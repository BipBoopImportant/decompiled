package uy;

import XH.C16807N;
import YH.X;
import androidx.navigation.fragment.FragmentNavigator;
import androidx.navigation.fragment.c;
import com.ingka.ikea.room.impl.navigation.RoomRoute;
import com.ingka.ikea.room.impl.presentation.RoomFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.P;
import nI.C17642l;
import x4.s;
import x4.y;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0006\u001a\u00020\u0003*\u00020\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lx4/y;", "", "enabled", "LXH/N;", "b", "(Lx4/y;Z)V", "a", "(Lx4/y;)V", "room-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: uy.b  reason: case insensitive filesystem */
public final class C15122b {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000\"\n\b\u0001\u0010\u0003 \u0001*\u00020\u0002*\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "T", "Lx4/v;", "D", "Lx4/s;", "LXH/N;", "a", "(Lx4/s;)V"}, k = 3, mv = {2, 1, 0})
    /* renamed from: uy.b$a */
    public static final class a extends C17544u implements C17642l<s, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f131389c = new a();

        public a() {
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

    private static final void a(y yVar) {
        Class<RoomRoute> cls = RoomRoute.class;
        c cVar = new c((FragmentNavigator) yVar.l().d(FragmentNavigator.class), P.b(cls), X.j(), P.b(RoomFragment.class));
        cVar.e("ikea://navigation/room", P.b(cls), a.f131389c);
        yVar.k(cVar);
    }

    public static final void b(y yVar, boolean z10) {
        C17542s.j(yVar, "<this>");
        if (z10) {
            a(yVar);
        }
    }
}
