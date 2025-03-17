package uD;

import Ae.e;
import GD.C12935h;
import GD.k;
import XH.t;
import com.ingka.ikea.analytics.Interaction$Component;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013¨\u0006\u0014"}, d2 = {"LuD/b;", "LuD/a;", "LAe/e;", "analytics", "<init>", "(LAe/e;)V", "LGD/h$a$g;", "source", "LXH/N;", "c", "(LGD/h$a$g;)V", "LGD/k$b$f;", "card", "d", "(LGD/k$b$f;)V", "LGD/k$c;", "a", "(LGD/k$c;)V", "b", "LAe/e;", "wallet-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: uD.b  reason: case insensitive filesystem */
public final class C15117b implements C15116a {

    /* renamed from: a  reason: collision with root package name */
    private final e f131375a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: uD.b$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f131376a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                GD.h$a$g[] r0 = GD.C12935h.a.g.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                GD.h$a$g r1 = GD.C12935h.a.g.Toolbar     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                GD.h$a$g r1 = GD.C12935h.a.g.EmptyState     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f131376a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: uD.C15117b.a.<clinit>():void");
        }
    }

    public C15117b(e eVar) {
        C17542s.j(eVar, "analytics");
        this.f131375a = eVar;
    }

    public void a(k.c cVar) {
        C17542s.j(cVar, "card");
        e eVar = this.f131375a;
        if (cVar instanceof k.c.a) {
            e.c.b(eVar, Interaction$Component.WALLET_INFO_CLAIMED_REWARD_CARD, (String) null, (Map) null, (e.b) null, 14, (Object) null);
            return;
        }
        throw new t();
    }

    public void b(k.b.f fVar) {
        Interaction$Component interaction$Component;
        C17542s.j(fVar, "card");
        e eVar = this.f131375a;
        if (fVar instanceof k.b.c) {
            interaction$Component = Interaction$Component.WALLET_REMOVE_GIFT_CARD;
        } else if (fVar instanceof k.b.e) {
            interaction$Component = Interaction$Component.WALLET_REMOVE_REFUND_CARD;
        } else {
            throw new t();
        }
        e.c.b(eVar, interaction$Component, (String) null, (Map) null, (e.b) null, 14, (Object) null);
    }

    public void c(C12935h.a.g gVar) {
        Interaction$Component interaction$Component;
        C17542s.j(gVar, "source");
        e eVar = this.f131375a;
        int i10 = a.f131376a[gVar.ordinal()];
        if (i10 == 1) {
            interaction$Component = Interaction$Component.WALLET_ADD_GIFT_REFUND_CARD;
        } else if (i10 == 2) {
            interaction$Component = Interaction$Component.WALLET_ADD_GIFT_REFUND_CARD_EMPTY_STATE;
        } else {
            throw new t();
        }
        e.c.b(eVar, interaction$Component, (String) null, (Map) null, (e.b) null, 14, (Object) null);
    }

    public void d(k.b.f fVar) {
        Interaction$Component interaction$Component;
        C17542s.j(fVar, "card");
        e eVar = this.f131375a;
        if (fVar instanceof k.b.c) {
            interaction$Component = Interaction$Component.WALLET_INFO_GIFT_CARD;
        } else if (fVar instanceof k.b.e) {
            interaction$Component = Interaction$Component.WALLET_INFO_REFUND_CARD;
        } else {
            throw new t();
        }
        e.c.b(eVar, interaction$Component, (String) null, (Map) null, (e.b) null, 14, (Object) null);
    }
}
