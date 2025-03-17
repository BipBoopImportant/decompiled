package HF;

import UE.C13733a;
import XH.C16807N;
import cF.C14046h;
import com.sugarcube.app.base.data.analytics.OpeningSource;
import com.sugarcube.app.base.external.entrypoint.GetMembershipListsCardUseCase;
import com.sugarcube.app.base.ui.gallery.h;
import java.util.List;
import java.util.UUID;
import kF.C14681B;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LHF/f;", "Lcom/sugarcube/app/base/external/entrypoint/GetMembershipListsCardUseCase;", "LUE/a;", "deeplinks", "<init>", "(LUE/a;)V", "Landroidx/compose/ui/d;", "modifier", "Lcom/sugarcube/app/base/external/entrypoint/GetMembershipListsCardUseCase$Model;", "latestSpace", "Lkotlin/Function1;", "Lcom/sugarcube/app/base/external/entrypoint/GetMembershipListsCardUseCase$a;", "LXH/N;", "onAction", "invoke", "(Landroidx/compose/ui/d;Lcom/sugarcube/app/base/external/entrypoint/GetMembershipListsCardUseCase$Model;LnI/l;LU0/m;I)V", "a", "LUE/a;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: HF.f  reason: case insensitive filesystem */
public final class C13011f implements GetMembershipListsCardUseCase {

    /* renamed from: a  reason: collision with root package name */
    private final C13733a f110734a;

    public C13011f(C13733a aVar) {
        C17542s.j(aVar, "deeplinks");
        this.f110734a = aVar;
    }

    /* access modifiers changed from: private */
    public static final C16807N f(C13011f fVar, C17642l lVar) {
        lVar.invoke(new GetMembershipListsCardUseCase.a.c(fVar.f110734a.a(OpeningSource.MembersList.INSTANCE)));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N g(C13011f fVar, C17642l lVar) {
        lVar.invoke(new GetMembershipListsCardUseCase.a.b(fVar.f110734a.b(OpeningSource.MembersList.INSTANCE, h.b.f124418e)));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N h(C13011f fVar, C17642l lVar) {
        lVar.invoke(new GetMembershipListsCardUseCase.a.d(fVar.f110734a.b(OpeningSource.MembersList.INSTANCE, h.d.f124420e)));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N i(C14681B b10) {
        C17542s.j(b10, "it");
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N j(C13011f fVar, C17642l lVar, String str, String str2) {
        C17542s.j(str, "sceneUuid");
        UUID e10 = C14046h.e(str);
        if (e10 != null) {
            lVar.invoke(new GetMembershipListsCardUseCase.a.C3032a(C13733a.e(fVar.f110734a, e10, C14046h.e(str2), OpeningSource.MembersList.INSTANCE, (List) null, 8, (Object) null)));
        }
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void invoke(androidx.compose.ui.d r14, com.sugarcube.app.base.external.entrypoint.GetMembershipListsCardUseCase.Model r15, nI.C17642l<? super com.sugarcube.app.base.external.entrypoint.GetMembershipListsCardUseCase.a, XH.C16807N> r16, U0.C4889m r17, int r18) {
        /*
            r13 = this;
            r0 = r13
            r1 = r15
            r2 = r16
            r8 = r17
            r3 = r18
            java.lang.String r4 = "modifier"
            r5 = r14
            kotlin.jvm.internal.C17542s.j(r14, r4)
            java.lang.String r4 = "latestSpace"
            kotlin.jvm.internal.C17542s.j(r15, r4)
            java.lang.String r4 = "onAction"
            kotlin.jvm.internal.C17542s.j(r2, r4)
            r4 = 248289719(0xecc99b7, float:5.0437905E-30)
            r8.W(r4)
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x002a
            r5 = -1
            java.lang.String r6 = "com.sugarcube.app.base.ui.membership.GetMembershipListsCardUseCaseImpl.invoke (GetMembershipListsCardUseCaseImpl.kt:20)"
            U0.C4895p.S(r4, r3, r5, r6)
        L_0x002a:
            boolean r4 = r1 instanceof com.sugarcube.app.base.external.entrypoint.GetMembershipListsCardUseCase.Model.a
            r5 = 256(0x100, float:3.59E-43)
            r6 = 1
            r7 = 2048(0x800, float:2.87E-42)
            r9 = 0
            if (r4 == 0) goto L_0x00f4
            r4 = 1221781520(0x48d2e810, float:431936.5)
            r8.W(r4)
            com.sugarcube.app.base.external.entrypoint.GetMembershipListsCardUseCase$Model$a r1 = (com.sugarcube.app.base.external.entrypoint.GetMembershipListsCardUseCase.Model.a) r1
            r4 = -1068962699(0xffffffffc048ec75, float:-3.1394322)
            r8.W(r4)
            r4 = r3 & 7168(0x1c00, float:1.0045E-41)
            r4 = r4 ^ 3072(0xc00, float:4.305E-42)
            if (r4 <= r7) goto L_0x004e
            boolean r10 = r8.V(r13)
            if (r10 != 0) goto L_0x0052
        L_0x004e:
            r10 = r3 & 3072(0xc00, float:4.305E-42)
            if (r10 != r7) goto L_0x0054
        L_0x0052:
            r10 = r6
            goto L_0x0055
        L_0x0054:
            r10 = r9
        L_0x0055:
            r11 = r3 & 896(0x380, float:1.256E-42)
            r11 = r11 ^ 384(0x180, float:5.38E-43)
            if (r11 <= r5) goto L_0x0061
            boolean r12 = r8.V(r2)
            if (r12 != 0) goto L_0x0065
        L_0x0061:
            r12 = r3 & 384(0x180, float:5.38E-43)
            if (r12 != r5) goto L_0x0067
        L_0x0065:
            r12 = r6
            goto L_0x0068
        L_0x0067:
            r12 = r9
        L_0x0068:
            r10 = r10 | r12
            java.lang.Object r12 = r17.D()
            if (r10 != 0) goto L_0x0077
            U0.m$a r10 = U0.C4889m.f14007a
            java.lang.Object r10 = r10.a()
            if (r12 != r10) goto L_0x007f
        L_0x0077:
            HF.a r12 = new HF.a
            r12.<init>(r13, r2)
            r8.u(r12)
        L_0x007f:
            r10 = r12
            nI.a r10 = (nI.C17631a) r10
            r17.P()
            r12 = -1068954528(0xffffffffc0490c60, float:-3.1413803)
            r8.W(r12)
            if (r4 <= r7) goto L_0x0093
            boolean r4 = r8.V(r13)
            if (r4 != 0) goto L_0x0097
        L_0x0093:
            r4 = r3 & 3072(0xc00, float:4.305E-42)
            if (r4 != r7) goto L_0x0099
        L_0x0097:
            r4 = r6
            goto L_0x009a
        L_0x0099:
            r4 = r9
        L_0x009a:
            if (r11 <= r5) goto L_0x00a2
            boolean r7 = r8.V(r2)
            if (r7 != 0) goto L_0x00a8
        L_0x00a2:
            r3 = r3 & 384(0x180, float:5.38E-43)
            if (r3 != r5) goto L_0x00a7
            goto L_0x00a8
        L_0x00a7:
            r6 = r9
        L_0x00a8:
            r3 = r4 | r6
            java.lang.Object r4 = r17.D()
            if (r3 != 0) goto L_0x00b8
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r4 != r3) goto L_0x00c0
        L_0x00b8:
            HF.b r4 = new HF.b
            r4.<init>(r13, r2)
            r8.u(r4)
        L_0x00c0:
            r3 = r4
            nI.a r3 = (nI.C17631a) r3
            r17.P()
            r2 = -1068943288(0xffffffffc0493848, float:-3.1440601)
            r8.W(r2)
            java.lang.Object r2 = r17.D()
            U0.m$a r4 = U0.C4889m.f14007a
            java.lang.Object r4 = r4.a()
            if (r2 != r4) goto L_0x00e0
            HF.c r2 = new HF.c
            r2.<init>()
            r8.u(r2)
        L_0x00e0:
            r4 = r2
            nI.l r4 = (nI.C17642l) r4
            r17.P()
            r6 = 3072(0xc00, float:4.305E-42)
            r7 = 0
            r2 = r10
            r5 = r17
            iF.G.t(r1, r2, r3, r4, r5, r6, r7)
            r17.P()
            goto L_0x018e
        L_0x00f4:
            boolean r4 = r1 instanceof com.sugarcube.app.base.external.entrypoint.GetMembershipListsCardUseCase.Model.b
            if (r4 == 0) goto L_0x019b
            r4 = 1222631447(0x48dfe017, float:458496.72)
            r8.W(r4)
            com.sugarcube.app.base.external.entrypoint.GetMembershipListsCardUseCase$Model$b r1 = (com.sugarcube.app.base.external.entrypoint.GetMembershipListsCardUseCase.Model.b) r1
            r4 = -1068934894(0xffffffffc0495912, float:-3.1460614)
            r8.W(r4)
            r4 = r3 & 7168(0x1c00, float:1.0045E-41)
            r4 = r4 ^ 3072(0xc00, float:4.305E-42)
            if (r4 <= r7) goto L_0x0112
            boolean r10 = r8.V(r13)
            if (r10 != 0) goto L_0x0116
        L_0x0112:
            r10 = r3 & 3072(0xc00, float:4.305E-42)
            if (r10 != r7) goto L_0x0118
        L_0x0116:
            r10 = r6
            goto L_0x0119
        L_0x0118:
            r10 = r9
        L_0x0119:
            r11 = r3 & 896(0x380, float:1.256E-42)
            r11 = r11 ^ 384(0x180, float:5.38E-43)
            if (r11 <= r5) goto L_0x0125
            boolean r12 = r8.V(r2)
            if (r12 != 0) goto L_0x0129
        L_0x0125:
            r12 = r3 & 384(0x180, float:5.38E-43)
            if (r12 != r5) goto L_0x012b
        L_0x0129:
            r12 = r6
            goto L_0x012c
        L_0x012b:
            r12 = r9
        L_0x012c:
            r10 = r10 | r12
            java.lang.Object r12 = r17.D()
            if (r10 != 0) goto L_0x013b
            U0.m$a r10 = U0.C4889m.f14007a
            java.lang.Object r10 = r10.a()
            if (r12 != r10) goto L_0x0143
        L_0x013b:
            HF.d r12 = new HF.d
            r12.<init>(r13, r2)
            r8.u(r12)
        L_0x0143:
            nI.p r12 = (nI.p) r12
            r17.P()
            r10 = -1068916925(0xffffffffc0499f43, float:-3.1503456)
            r8.W(r10)
            if (r4 <= r7) goto L_0x0156
            boolean r4 = r8.V(r13)
            if (r4 != 0) goto L_0x015a
        L_0x0156:
            r4 = r3 & 3072(0xc00, float:4.305E-42)
            if (r4 != r7) goto L_0x015c
        L_0x015a:
            r4 = r6
            goto L_0x015d
        L_0x015c:
            r4 = r9
        L_0x015d:
            if (r11 <= r5) goto L_0x0165
            boolean r7 = r8.V(r2)
            if (r7 != 0) goto L_0x016b
        L_0x0165:
            r3 = r3 & 384(0x180, float:5.38E-43)
            if (r3 != r5) goto L_0x016a
            goto L_0x016b
        L_0x016a:
            r6 = r9
        L_0x016b:
            r3 = r4 | r6
            java.lang.Object r4 = r17.D()
            if (r3 != 0) goto L_0x017b
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r4 != r3) goto L_0x0183
        L_0x017b:
            HF.e r4 = new HF.e
            r4.<init>(r13, r2)
            r8.u(r4)
        L_0x0183:
            nI.a r4 = (nI.C17631a) r4
            r17.P()
            iF.G.x(r1, r12, r4, r8, r9)
            r17.P()
        L_0x018e:
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0197
            U0.C4895p.R()
        L_0x0197:
            r17.P()
            return
        L_0x019b:
            r1 = -1068967722(0xffffffffc048d8d6, float:-3.1382346)
            r8.W(r1)
            r17.P()
            XH.t r1 = new XH.t
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: HF.C13011f.invoke(androidx.compose.ui.d, com.sugarcube.app.base.external.entrypoint.GetMembershipListsCardUseCase$Model, nI.l, U0.m, int):void");
    }
}
