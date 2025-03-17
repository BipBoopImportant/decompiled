package J1;

import J1.d;
import U0.C4889m;
import U0.C4895p;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import p1.J0;
import u1.C6006d;
import v1.C6155c;

@Metadata(d1 = {"\u00000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a3\u0010\u000b\u001a\u00020\n2\n\u0010\u0007\u001a\u00060\u0005R\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"", "id", "Lt1/c;", "c", "(ILU0/m;I)Lt1/c;", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "theme", "res", "changingConfigurations", "Lu1/d;", "b", "(Landroid/content/res/Resources$Theme;Landroid/content/res/Resources;IILU0/m;I)Lu1/d;", "", "path", "Lp1/J0;", "a", "(Ljava/lang/CharSequence;Landroid/content/res/Resources;I)Lp1/J0;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class e {
    private static final J0 a(CharSequence charSequence, Resources resources, int i10) {
        try {
            return c.b(J0.f27208a, resources, i10);
        } catch (Exception e10) {
            throw new h("Error attempting to load resource: " + charSequence, e10);
        }
    }

    private static final C6006d b(Resources.Theme theme, Resources resources, int i10, int i11, C4889m mVar, int i12) {
        if (C4895p.J()) {
            C4895p.S(21855625, i12, -1, "androidx.compose.ui.res.loadVectorResource (PainterResources.android.kt:91)");
        }
        d dVar = (d) mVar.Q(AndroidCompositionLocals_androidKt.h());
        d.b bVar = new d.b(theme, i10);
        d.a b10 = dVar.b(bVar);
        if (b10 == null) {
            XmlResourceParser xml = resources.getXml(i10);
            if (C17542s.e(C6155c.j(xml).getName(), "vector")) {
                b10 = k.a(theme, resources, xml, i11);
                dVar.d(bVar, b10);
            } else {
                throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
            }
        }
        C6006d b11 = b10.b();
        if (C4895p.J()) {
            C4895p.R();
        }
        return b11;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: p1.J0} */
    /* JADX WARNING: type inference failed for: r9v4, types: [u1.s] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final t1.C5942c c(int r9, U0.C4889m r10, int r11) {
        /*
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x000f
            r0 = -1
            java.lang.String r1 = "androidx.compose.ui.res.painterResource (PainterResources.android.kt:57)"
            r2 = 473971343(0x1c403a8f, float:6.3603156E-22)
            U0.C4895p.S(r2, r11, r0, r1)
        L_0x000f:
            U0.I0 r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r0 = r10.Q(r0)
            android.content.Context r0 = (android.content.Context) r0
            U0.I0 r1 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.f()
            r10.Q(r1)
            android.content.res.Resources r3 = r0.getResources()
            U0.I0 r1 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.i()
            java.lang.Object r1 = r10.Q(r1)
            J1.g r1 = (J1.g) r1
            android.util.TypedValue r1 = r1.b(r3, r9)
            java.lang.CharSequence r2 = r1.string
            r4 = 1
            r8 = 0
            if (r2 == 0) goto L_0x0060
            r5 = 2
            r6 = 0
            java.lang.String r7 = ".xml"
            boolean r5 = HJ.C15854t.j0(r2, r7, r8, r5, r6)
            if (r5 != r4) goto L_0x0060
            r2 = -803040357(0xffffffffd022939b, float:-1.09103299E10)
            r10.W(r2)
            android.content.res.Resources$Theme r2 = r0.getTheme()
            int r5 = r1.changingConfigurations
            int r11 = r11 << 6
            r7 = r11 & 896(0x380, float:1.256E-42)
            r4 = r9
            r6 = r10
            u1.d r9 = b(r2, r3, r4, r5, r6, r7)
            u1.s r9 = u1.t.g(r9, r10, r8)
            r10.P()
            goto L_0x00af
        L_0x0060:
            r1 = -802884675(0xffffffffd024f3bd, float:-1.10697482E10)
            r10.W(r1)
            android.content.res.Resources$Theme r0 = r0.getTheme()
            boolean r1 = r10.V(r2)
            r5 = r11 & 14
            r5 = r5 ^ 6
            r6 = 4
            if (r5 <= r6) goto L_0x007b
            boolean r5 = r10.d(r9)
            if (r5 != 0) goto L_0x0081
        L_0x007b:
            r11 = r11 & 6
            if (r11 != r6) goto L_0x0080
            goto L_0x0081
        L_0x0080:
            r4 = r8
        L_0x0081:
            r11 = r1 | r4
            boolean r0 = r10.V(r0)
            r11 = r11 | r0
            java.lang.Object r0 = r10.D()
            if (r11 != 0) goto L_0x0096
            U0.m$a r11 = U0.C4889m.f14007a
            java.lang.Object r11 = r11.a()
            if (r0 != r11) goto L_0x009d
        L_0x0096:
            p1.J0 r0 = a(r2, r3, r9)
            r10.u(r0)
        L_0x009d:
            r2 = r0
            p1.J0 r2 = (p1.J0) r2
            t1.a r9 = new t1.a
            r7 = 6
            r8 = 0
            r3 = 0
            r5 = 0
            r1 = r9
            r1.<init>(r2, r3, r5, r7, r8)
            r10.P()
        L_0x00af:
            boolean r10 = U0.C4895p.J()
            if (r10 == 0) goto L_0x00b8
            U0.C4895p.R()
        L_0x00b8:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: J1.e.c(int, U0.m, int):t1.c");
    }
}
