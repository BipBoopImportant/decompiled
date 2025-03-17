package Or;

import Dr.a;
import XH.C16807N;
import android.net.Uri;
import com.sugarcube.app.base.external.entrypoint.GetEntryPointUseCase;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J3\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0017¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010¨\u0006\u0011"}, d2 = {"LOr/b;", "LDr/a;", "Lcom/sugarcube/app/base/external/entrypoint/GetEntryPointUseCase;", "getEntryPointUseCase", "<init>", "(Lcom/sugarcube/app/base/external/entrypoint/GetEntryPointUseCase;)V", "LQr/b$c;", "model", "LDr/c$a;", "source", "Lkotlin/Function1;", "Landroid/net/Uri;", "LXH/N;", "onDeeplink", "a", "(LQr/b$c;LDr/c$a;LnI/l;LU0/m;I)V", "Lcom/sugarcube/app/base/external/entrypoint/GetEntryPointUseCase;", "geomagical-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final GetEntryPointUseCase f85377a;

    public b(GetEntryPointUseCase getEntryPointUseCase) {
        C17542s.j(getEntryPointUseCase, "getEntryPointUseCase");
        this.f85377a = getEntryPointUseCase;
    }

    /* access modifiers changed from: private */
    public static final C16807N c(C17642l lVar, Uri uri) {
        C17542s.j(uri, "uri");
        lVar.invoke(uri);
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: nI.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(Qr.b.c r10, Dr.c.a r11, nI.C17642l<? super android.net.Uri, XH.C16807N> r12, U0.C4889m r13, int r14) {
        /*
            r9 = this;
            java.lang.String r0 = "model"
            kotlin.jvm.internal.C17542s.j(r10, r0)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.C17542s.j(r11, r0)
            java.lang.String r0 = "onDeeplink"
            kotlin.jvm.internal.C17542s.j(r12, r0)
            r0 = -1579630188(0xffffffffa1d8c194, float:-1.4687969E-18)
            r13.W(r0)
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0021
            r1 = -1
            java.lang.String r2 = "com.ingka.ikea.geomagical.impl.ui.BannerKreativSectionImpl.Execute (BannerKreativSectionImpl.kt:26)"
            U0.C4895p.S(r0, r14, r1, r2)
        L_0x0021:
            com.sugarcube.app.base.external.entrypoint.GetEntryPointUseCase r3 = r9.f85377a
            com.sugarcube.app.base.data.analytics.OpeningSource r4 = Or.c.i(r11)
            nF.b r5 = Or.c.f(r10)
            r10 = 637169934(0x25fa710e, float:4.3444696E-16)
            r13.W(r10)
            r10 = r14 & 896(0x380, float:1.256E-42)
            r10 = r10 ^ 384(0x180, float:5.38E-43)
            r11 = 256(0x100, float:3.59E-43)
            if (r10 <= r11) goto L_0x003f
            boolean r10 = r13.V(r12)
            if (r10 != 0) goto L_0x0043
        L_0x003f:
            r10 = r14 & 384(0x180, float:5.38E-43)
            if (r10 != r11) goto L_0x0045
        L_0x0043:
            r10 = 1
            goto L_0x0046
        L_0x0045:
            r10 = 0
        L_0x0046:
            java.lang.Object r11 = r13.D()
            if (r10 != 0) goto L_0x0054
            U0.m$a r10 = U0.C4889m.f14007a
            java.lang.Object r10 = r10.a()
            if (r11 != r10) goto L_0x005c
        L_0x0054:
            Or.a r11 = new Or.a
            r11.<init>(r12)
            r13.u(r11)
        L_0x005c:
            r6 = r11
            nI.l r6 = (nI.C17642l) r6
            r13.P()
            int r10 = com.sugarcube.app.base.data.analytics.OpeningSource.$stable
            int r11 = nF.C14851b.f129813a
            int r11 = r11 << 3
            r8 = r10 | r11
            r7 = r13
            r3.invoke(r4, r5, r6, r7, r8)
            boolean r10 = U0.C4895p.J()
            if (r10 == 0) goto L_0x0077
            U0.C4895p.R()
        L_0x0077:
            r13.P()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Or.b.a(Qr.b$c, Dr.c$a, nI.l, U0.m, int):void");
    }
}
