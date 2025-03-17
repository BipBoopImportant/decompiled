package vD;

import GD.C12928a;
import GD.C12929b;
import GD.C12930c;
import GD.C12931d;
import GD.k;
import IC.C13026h;
import KJ.C15985a;
import com.ingka.ikea.core.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001a\u0010\u0004\u001a\u00020\u00008\u0000X\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003¨\u0006\u0005"}, d2 = {"LGD/k$c$a;", "a", "LGD/k$c$a;", "()LGD/k$c$a;", "claimedRewardCard", "wallet-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: vD.b  reason: case insensitive filesystem */
public final class C15134b {

    /* renamed from: a  reason: collision with root package name */
    private static final k.c.a f131437a;

    static {
        C12929b bVar = new C12929b("Instore reward", "Save 10€ on IKEA home furnishings and accessories", "Expires 2024-04-18");
        k.c.a.C2652a.C2653a aVar = new k.c.a.C2652a.C2653a("some code");
        f131437a = new k.c.a("id", bVar, new C12928a(new Image("https://shop.static.ingka.ikea.com/wallet/refund-card.png", ""), (Image) null, 2, (DefaultConstructorMarker) null), aVar, C15985a.b(new C12930c(C13026h.c("Reward code"), "0001 2345 6000 HKAH", (String) null, false, 12, (DefaultConstructorMarker) null), new C12930c(C13026h.c("Expiration date"), "2024-04-18", (String) null, false, 12, (DefaultConstructorMarker) null), new C12930c(C13026h.c("Terms and conditions"), "Minimum transaction value £10. Excludes express delivery. Delivery is subject to availability based on order size, location and stock availability. Discount will be applied after delivery selection. One delivery reward voucher per transaction. Cannot be used in conjunction with any other offer requiring a code or QR code. Reward valid for 30 days after selection and conversion of points to the reward. Reward not redeemable for cash. Terms and Conditions apply see ikea.co.uk/ikeafamilyterms", (String) null, false, 12, (DefaultConstructorMarker) null)), new C12931d("This reward is also usable online", "Select this reward in the shopping bag before proceeding to checkout."));
    }

    public static final k.c.a a() {
        return f131437a;
    }
}
