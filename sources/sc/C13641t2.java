package SC;

import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import androidx.compose.ui.d;
import androidx.recyclerview.widget.RecyclerView;
import com.google.ar.core.ImageMetadata;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import r0.l;
import r0.m;
import wK.X8;

@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0001\u0010\u0016\u001a\u00020\t\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"T", "", "hint", "label", "LSC/r2;", "selectItemsParams", "", "expanded", "Lkotlin/Function1;", "LXH/N;", "onClick", "onClickContentDescription", "Landroidx/compose/ui/d;", "modifier", "", "iconId", "helperText", "enabled", "Lr0/m;", "interactionSource", "LSC/G;", "state", "b", "(Ljava/lang/String;Ljava/lang/String;LSC/r2;ZLnI/l;Ljava/lang/String;Landroidx/compose/ui/d;Ljava/lang/Integer;Ljava/lang/String;ZLr0/m;LSC/G;LU0/m;III)V", "skapa_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: SC.t2  reason: case insensitive filesystem */
public final class C13641t2 {
    public static final <T> void b(String str, String str2, C13633r2<T> r2Var, boolean z10, C17642l<? super Boolean, C16807N> lVar, String str3, d dVar, Integer num, String str4, boolean z11, m mVar, G g10, C4889m mVar2, int i10, int i11, int i12) {
        int i13;
        int i14;
        C4889m mVar3;
        G g11;
        m mVar4;
        boolean z12;
        String str5;
        Integer num2;
        d dVar2;
        m mVar5;
        String str6 = str;
        String str7 = str2;
        C13633r2<T> r2Var2 = r2Var;
        C17642l<? super Boolean, C16807N> lVar2 = lVar;
        int i15 = i10;
        int i16 = i12;
        C17542s.j(str6, "hint");
        C17542s.j(str7, "label");
        C17542s.j(r2Var2, "selectItemsParams");
        C17542s.j(lVar2, "onClick");
        C4889m k10 = mVar2.k(-580864788);
        if ((i16 & 1) != 0) {
            i13 = i15 | 6;
        } else if ((i15 & 6) == 0) {
            i13 = (k10.V(str6) ? 4 : 2) | i15;
        } else {
            i13 = i15;
        }
        if ((i16 & 2) != 0) {
            i13 |= 48;
        } else if ((i15 & 48) == 0) {
            i13 |= k10.V(str7) ? 32 : 16;
        }
        if ((i16 & 4) != 0) {
            i13 |= 384;
        } else if ((i15 & 384) == 0) {
            i13 |= k10.F(r2Var2) ? 256 : 128;
        }
        if ((i16 & 8) != 0) {
            i13 |= 3072;
            boolean z13 = z10;
        } else {
            boolean z14 = z10;
            if ((i15 & 3072) == 0) {
                i13 |= k10.b(z14) ? RecyclerView.n.FLAG_MOVED : 1024;
            }
        }
        if ((i16 & 16) != 0) {
            i13 |= 24576;
        } else if ((i15 & 24576) == 0) {
            i13 |= k10.F(lVar2) ? 16384 : 8192;
        }
        if ((i16 & 32) != 0) {
            i13 |= ImageMetadata.EDGE_MODE;
            String str8 = str3;
        } else {
            String str9 = str3;
            if ((i15 & ImageMetadata.EDGE_MODE) == 0) {
                i13 |= k10.V(str9) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
            }
        }
        int i17 = i16 & 64;
        if (i17 != 0) {
            i13 |= 1572864;
            d dVar3 = dVar;
        } else {
            d dVar4 = dVar;
            if ((i15 & 1572864) == 0) {
                i13 |= k10.V(dVar4) ? ImageMetadata.SHADING_MODE : ImageMetadata.LENS_APERTURE;
            }
        }
        int i18 = i16 & 128;
        if (i18 != 0) {
            i13 |= 12582912;
            Integer num3 = num;
        } else {
            Integer num4 = num;
            if ((i15 & 12582912) == 0) {
                i13 |= k10.V(num4) ? 8388608 : 4194304;
            }
        }
        int i19 = i16 & 256;
        if (i19 != 0) {
            i13 |= 100663296;
            String str10 = str4;
        } else {
            String str11 = str4;
            if ((i15 & 100663296) == 0) {
                i13 |= k10.V(str11) ? 67108864 : 33554432;
            }
        }
        int i20 = i16 & 512;
        if (i20 != 0) {
            i13 |= 805306368;
            boolean z15 = z11;
        } else {
            boolean z16 = z11;
            if ((i15 & 805306368) == 0) {
                i13 |= k10.b(z16) ? 536870912 : 268435456;
            }
        }
        int i21 = i16 & 1024;
        if (i21 != 0) {
            i14 = i11 | 6;
            m mVar6 = mVar;
        } else {
            m mVar7 = mVar;
            if ((i11 & 6) == 0) {
                i14 = i11 | (k10.V(mVar7) ? 4 : 2);
            } else {
                i14 = i11;
            }
        }
        int i22 = i16 & RecyclerView.n.FLAG_MOVED;
        if (i22 != 0) {
            i14 |= 48;
        } else {
            G g12 = g10;
            if ((i11 & 48) == 0) {
                i14 |= k10.V(g12) ? 32 : 16;
            }
        }
        int i23 = i14;
        if ((i13 & 306783379) == 306783378 && (i23 & 19) == 18 && k10.l()) {
            k10.L();
            dVar2 = dVar;
            num2 = num;
            z12 = z11;
            mVar4 = mVar;
            g11 = g10;
            mVar3 = k10;
            str5 = str4;
        } else {
            d.a aVar = i17 != 0 ? d.f18749a : dVar;
            Integer num5 = i18 != 0 ? null : num;
            String str12 = i19 != 0 ? null : str4;
            boolean z17 = i20 != 0 ? true : z11;
            if (i21 != 0) {
                k10.W(-876194052);
                Object D10 = k10.D();
                if (D10 == C4889m.f14007a.a()) {
                    D10 = l.a();
                    k10.u(D10);
                }
                k10.P();
                mVar5 = (m) D10;
            } else {
                mVar5 = mVar;
            }
            G g13 = i22 != 0 ? G.DEFAULT : g10;
            if (C4895p.J()) {
                C4895p.S(-580864788, i13, i23, "com.ingka.ikea.ui.skapa.SkapaSelect (SkapaSelect.kt:30)");
            }
            mVar3 = k10;
            X8.g(str, str2, r2Var.a(), z10, lVar, str3, aVar, num5, str12, z17, mVar5, g13.b(), mVar3, i13 & 2147482750, i23 & 14, 0);
            if (C4895p.J()) {
                C4895p.R();
            }
            dVar2 = aVar;
            num2 = num5;
            str5 = str12;
            z12 = z17;
            mVar4 = mVar5;
            g11 = g13;
        }
        Y0 n10 = mVar3.n();
        if (n10 != null) {
            C13637s2 s2Var = r0;
            C13637s2 s2Var2 = new C13637s2(str, str2, r2Var, z10, lVar, str3, dVar2, num2, str5, z12, mVar4, g11, i10, i11, i12);
            n10.a(s2Var);
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(String str, String str2, C13633r2 r2Var, boolean z10, C17642l lVar, String str3, d dVar, Integer num, String str4, boolean z11, m mVar, G g10, int i10, int i11, int i12, C4889m mVar2, int i13) {
        b(str, str2, r2Var, z10, lVar, str3, dVar, num, str4, z11, mVar, g10, mVar2, M0.a(i10 | 1), M0.a(i11), i12);
        return C16807N.f139792a;
    }
}
