package Or;

import Dr.d;
import XH.C16807N;
import XH.t;
import com.sugarcube.app.base.external.entrypoint.GetMembershipListsCardUseCase;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ3\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0017¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LOr/e;", "LDr/d;", "Lcom/sugarcube/app/base/external/entrypoint/GetMembershipListsCardUseCase;", "card", "<init>", "(Lcom/sugarcube/app/base/external/entrypoint/GetMembershipListsCardUseCase;)V", "LDr/d$b;", "Lcom/sugarcube/app/base/external/entrypoint/GetMembershipListsCardUseCase$Model;", "d", "(LDr/d$b;)Lcom/sugarcube/app/base/external/entrypoint/GetMembershipListsCardUseCase$Model;", "Landroidx/compose/ui/d;", "modifier", "model", "Lkotlin/Function1;", "LDr/d$a;", "LXH/N;", "onAction", "a", "(Landroidx/compose/ui/d;LDr/d$b;LnI/l;LU0/m;I)V", "Lcom/sugarcube/app/base/external/entrypoint/GetMembershipListsCardUseCase;", "geomagical-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e implements d {

    /* renamed from: a  reason: collision with root package name */
    private final GetMembershipListsCardUseCase f85380a;

    public e(GetMembershipListsCardUseCase getMembershipListsCardUseCase) {
        C17542s.j(getMembershipListsCardUseCase, "card");
        this.f85380a = getMembershipListsCardUseCase;
    }

    /* access modifiers changed from: private */
    public static final C16807N c(C17642l lVar, GetMembershipListsCardUseCase.a aVar) {
        C17542s.j(aVar, "action");
        lVar.invoke(f.b(aVar));
        return C16807N.f139792a;
    }

    private final GetMembershipListsCardUseCase.Model d(d.b bVar) {
        if (bVar instanceof d.b.C1512b) {
            d.b.C1512b bVar2 = (d.b.C1512b) bVar;
            return new GetMembershipListsCardUseCase.Model.b(bVar2.f(), bVar2.g(), bVar2.c(), bVar2.e(), bVar2.b(), bVar2.d(), bVar2.a());
        } else if (bVar instanceof d.b.a) {
            d.b.a aVar = (d.b.a) bVar;
            return new GetMembershipListsCardUseCase.Model.a(aVar.f(), aVar.c(), aVar.a(), aVar.b(), aVar.d(), aVar.e(), aVar.g());
        } else {
            throw new t();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: nI.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(androidx.compose.ui.d r10, Dr.d.b r11, nI.C17642l<? super Dr.d.a, XH.C16807N> r12, U0.C4889m r13, int r14) {
        /*
            r9 = this;
            java.lang.String r0 = "modifier"
            kotlin.jvm.internal.C17542s.j(r10, r0)
            java.lang.String r0 = "model"
            kotlin.jvm.internal.C17542s.j(r11, r0)
            java.lang.String r0 = "onAction"
            kotlin.jvm.internal.C17542s.j(r12, r0)
            r0 = -2033948410(0xffffffff86c46906, float:-7.3881324E-35)
            r13.W(r0)
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0021
            r1 = -1
            java.lang.String r2 = "com.ingka.ikea.geomagical.impl.ui.MembershipListsKreativCardImpl.Execute (MembershipListsKreativCardImpl.kt:23)"
            U0.C4895p.S(r0, r14, r1, r2)
        L_0x0021:
            com.sugarcube.app.base.external.entrypoint.GetMembershipListsCardUseCase r3 = r9.f85380a
            com.sugarcube.app.base.external.entrypoint.GetMembershipListsCardUseCase$Model r5 = r9.d(r11)
            r11 = -1425378939(0xffffffffab0a7185, float:-4.918499E-13)
            r13.W(r11)
            r11 = r14 & 896(0x380, float:1.256E-42)
            r11 = r11 ^ 384(0x180, float:5.38E-43)
            r0 = 256(0x100, float:3.59E-43)
            if (r11 <= r0) goto L_0x003b
            boolean r11 = r13.V(r12)
            if (r11 != 0) goto L_0x003f
        L_0x003b:
            r11 = r14 & 384(0x180, float:5.38E-43)
            if (r11 != r0) goto L_0x0041
        L_0x003f:
            r11 = 1
            goto L_0x0042
        L_0x0041:
            r11 = 0
        L_0x0042:
            java.lang.Object r0 = r13.D()
            if (r11 != 0) goto L_0x0050
            U0.m$a r11 = U0.C4889m.f14007a
            java.lang.Object r11 = r11.a()
            if (r0 != r11) goto L_0x0058
        L_0x0050:
            Or.d r0 = new Or.d
            r0.<init>(r12)
            r13.u(r0)
        L_0x0058:
            r6 = r0
            nI.l r6 = (nI.C17642l) r6
            r13.P()
            r8 = r14 & 14
            r4 = r10
            r7 = r13
            r3.invoke(r4, r5, r6, r7, r8)
            boolean r10 = U0.C4895p.J()
            if (r10 == 0) goto L_0x006e
            U0.C4895p.R()
        L_0x006e:
            r13.P()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Or.e.a(androidx.compose.ui.d, Dr.d$b, nI.l, U0.m, int):void");
    }
}
