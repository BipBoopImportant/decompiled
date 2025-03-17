package vD;

import GD.C12928a;
import GD.C12929b;
import GD.C12931d;
import GD.C12932e;
import GD.C12934g;
import GD.i;
import GD.k;
import HD.C12992b;
import IC.C13023e;
import IC.C13026h;
import KJ.C15985a;
import KJ.C15987c;
import Oo.b;
import com.ingka.ikea.core.model.Image;
import ix.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001f\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010%\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010(\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b&\u0010\u0010\u001a\u0004\b'\u0010\u0012R\u0017\u0010+\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b)\u0010\u0016\u001a\u0004\b*\u0010\u0018R\u0017\u0010.\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b,\u0010\"\u001a\u0004\b-\u0010$¨\u0006/"}, d2 = {"LvD/a;", "", "<init>", "()V", "LHD/b;", "b", "LHD/b;", "mapper", "Lix/c;", "c", "Lix/c;", "refundCardRemote", "d", "giftCardRemote", "LGD/k$b$e;", "e", "LGD/k$b$e;", "getRefundCard", "()LGD/k$b$e;", "refundCard", "LGD/k$b$c;", "f", "LGD/k$b$c;", "a", "()LGD/k$b$c;", "giftCard", "LGD/k$a$a;", "g", "LGD/k$a$a;", "getFamilyCard", "()LGD/k$a$a;", "familyCard", "LGD/i;", "h", "LGD/i;", "getSuccessRegular", "()LGD/i;", "successRegular", "i", "getRefundCardExpired", "refundCardExpired", "j", "getGiftCardExpired", "giftCardExpired", "k", "getSuccessFamily", "successFamily", "wallet-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: vD.a  reason: case insensitive filesystem */
public final class C15133a {

    /* renamed from: a  reason: collision with root package name */
    public static final C15133a f131425a = new C15133a();

    /* renamed from: b  reason: collision with root package name */
    private static final C12992b f131426b;

    /* renamed from: c  reason: collision with root package name */
    private static final c f131427c;

    /* renamed from: d  reason: collision with root package name */
    private static final c f131428d;

    /* renamed from: e  reason: collision with root package name */
    private static final k.b.e f131429e;

    /* renamed from: f  reason: collision with root package name */
    private static final k.b.c f131430f;

    /* renamed from: g  reason: collision with root package name */
    private static final k.a.C2649a f131431g;

    /* renamed from: h  reason: collision with root package name */
    private static final i f131432h;

    /* renamed from: i  reason: collision with root package name */
    private static final k.b.e f131433i;

    /* renamed from: j  reason: collision with root package name */
    private static final k.b.c f131434j;

    /* renamed from: k  reason: collision with root package name */
    private static final i f131435k;

    /* renamed from: l  reason: collision with root package name */
    public static final int f131436l = 8;

    static {
        C12992b bVar = new C12992b();
        f131426b = bVar;
        c.d dVar = c.d.RefundCard;
        c.C3149c cVar = c.C3149c.Active;
        c.C3149c cVar2 = cVar;
        c cVar3 = new c("id-refundCard", "9237426789118223895", "ZSDHUISHDIUHDIAD", "qrData", cVar2, "2007-12-03T10:15:30.00Z", dVar, new c.a("€500"), new c.b(new Image("https://shop.static.ingka.ikea.com/wallet/refund-card.png", ""), new Image("https://shop.static.ingka.ikea.com/wallet/refund-card-landscape.png", "")));
        f131427c = cVar3;
        c cVar4 = cVar3;
        c cVar5 = new c("id-giftCard", "9237426789118223895", "ZSDHUISHDIUHDIAD", "qrData", cVar, "2007-12-03T10:15:30.00Z", c.d.GiftCard, new c.a("€500"), new c.b(new Image("https://shop.static.ingka.ikea.com/wallet/gift-card-green.png", ""), new Image("https://shop.static.ingka.ikea.com/wallet/gift-card-green-landscape.png", "")));
        f131428d = cVar5;
        k.b a10 = bVar.a(cVar4);
        C17542s.h(a10, "null cannot be cast to non-null type com.ingka.ikea.wallet.impl.model.WalletCard.Prepaid.RefundCard");
        k.b.e eVar = (k.b.e) a10;
        f131429e = eVar;
        k.b a11 = bVar.a(cVar5);
        C17542s.h(a11, "null cannot be cast to non-null type com.ingka.ikea.wallet.impl.model.WalletCard.Prepaid.GiftCard");
        k.b.c cVar6 = (k.b.c) a11;
        f131430f = cVar6;
        k.a.C2649a aVar = new k.a.C2649a(new C12929b(C13026h.a(b.f84461O3), C13026h.c("First Lastname"), C13026h.c("6275980123012345")), "6275980123012345");
        f131431g = aVar;
        f131432h = new i(C15985a.b(k.d.f110442a, eVar), (C12934g) null, (C13023e) null, false, (C12932e) null, (Integer) null, false, 126, (DefaultConstructorMarker) null);
        c.C3149c cVar7 = c.C3149c.Expired;
        k.b a12 = bVar.a(c.b(cVar4, "id-refundCard-expired", (String) null, (String) null, (String) null, cVar7, (String) null, (c.d) null, (c.a) null, (c.b) null, 494, (Object) null));
        C17542s.h(a12, "null cannot be cast to non-null type com.ingka.ikea.wallet.impl.model.WalletCard.Prepaid.RefundCard");
        k.b.e eVar2 = (k.b.e) a12;
        f131433i = eVar2;
        k.b a13 = bVar.a(c.b(cVar5, "id-giftCard-expired", (String) null, (String) null, (String) null, cVar7, (String) null, (c.d) null, (c.a) null, (c.b) null, 494, (Object) null));
        C17542s.h(a13, "null cannot be cast to non-null type com.ingka.ikea.wallet.impl.model.WalletCard.Prepaid.GiftCard");
        k.b.c cVar8 = (k.b.c) a13;
        f131434j = cVar8;
        f131435k = new i(C15985a.b(aVar, C15134b.a(), k.c.a.h(C15134b.a(), "id 2", (C12929b) null, (C12928a) null, (k.c.a.C2652a) null, (C15987c) null, (C12931d) null, 62, (Object) null), k.c.a.h(C15134b.a(), "id 3", (C12929b) null, (C12928a) null, (k.c.a.C2652a) null, (C15987c) null, (C12931d) null, 30, (Object) null), eVar, eVar2, cVar6, cVar8), (C12934g) null, (C13023e) null, false, (C12932e) null, (Integer) null, false, 126, (DefaultConstructorMarker) null);
    }

    private C15133a() {
    }

    public final k.b.c a() {
        return f131430f;
    }
}
