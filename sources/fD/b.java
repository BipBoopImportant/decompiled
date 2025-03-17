package Fd;

import E1.I;
import G1.C4504g;
import Hd.m;
import Jd.e;
import Jd.i;
import U0.A1;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import U0.p1;
import XH.C16807N;
import android.content.Context;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.f0;
import androidx.lifecycle.k0;
import bL.C17057a;
import cL.C17079a;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.ikea.kompassmap.model.store.map.IconMapping;
import dI.C17168i;
import fL.C17263a;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import m3.a;
import nI.C17631a;
import nI.p;
import org.maplibre.geojson.Feature;
import pL.C17770a;
import qL.C17844a;
import s0.C5843N;
import s0.C5844O;
import tK.C18029u;
import tK.C18030v;
import yd.C10443N;
import yd.C10456j;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lorg/maplibre/geojson/Feature;", "facility", "LXH/N;", "b", "(Lorg/maplibre/geojson/Feature;LU0/m;I)V", "KompassMap_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class b {
    public static final void b(Feature feature, C4889m mVar, int i10) {
        int i11;
        String str;
        JsonElement jsonElement;
        Feature feature2 = feature;
        int i12 = i10;
        C17542s.j(feature2, "facility");
        C4889m k10 = mVar.k(307409238);
        if ((i12 & 6) == 0) {
            i11 = (k10.F(feature2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(307409238, i11, -1, "com.ikea.kompassmap.ui.components.bottomSheet.facility.SelectedFacility (SelectedFacility.kt:27)");
            }
            Context context = (Context) k10.Q(AndroidCompositionLocals_androidKt.g());
            k10.C(-1614864554);
            k0 a10 = a.f26247a.a(k10, a.f26249c);
            if (a10 != null) {
                f0 b10 = C17079a.b(P.b(i.class), a10.getViewModelStore(), (String) null, C17057a.a(a10, k10, 8), (C17844a) null, C17263a.d(k10, 0), (C17631a<? extends C17770a>) null);
                k10.U();
                A1<e> b11 = p1.b(((i) b10).T(), (C17168i) null, k10, 0, 1);
                JsonObject properties = feature.properties();
                C5437c.a aVar = C5437c.f24302a;
                C5437c.C0386c i13 = aVar.i();
                C5073d dVar = C5073d.f18068a;
                C18029u uVar = C18029u.f147649a;
                C5073d.f n10 = dVar.n(uVar.a());
                d.a aVar2 = d.f18749a;
                d j10 = D.j(aVar2, uVar.c(), uVar.l());
                I b12 = G.b(n10, i13, k10, 48);
                int a11 = C4883j.a(k10, 0);
                C4912y s10 = k10.s();
                d e10 = c.e(k10, j10);
                C4504g.a aVar3 = C4504g.f6515W;
                C17631a<C4504g> a12 = aVar3.a();
                if (k10.m() == null) {
                    C4883j.c();
                }
                k10.I();
                if (k10.i()) {
                    k10.p(a12);
                } else {
                    k10.t();
                }
                C4889m a13 = F1.a(k10);
                F1.c(a13, b12, aVar3.c());
                F1.c(a13, s10, aVar3.e());
                p<C4504g, Integer, C16807N> b13 = aVar3.b();
                if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                    a13.u(Integer.valueOf(a11));
                    a13.w(Integer.valueOf(a11), b13);
                }
                F1.c(a13, e10, aVar3.d());
                C5843N n11 = C5843N.f28726a;
                Ed.b.b(c(properties), k10, 0);
                I b14 = G.b(dVar.f(), aVar.l(), k10, 0);
                int a14 = C4883j.a(k10, 0);
                C4912y s11 = k10.s();
                d e11 = c.e(k10, aVar2);
                C17631a<C4504g> a15 = aVar3.a();
                if (k10.m() == null) {
                    C4883j.c();
                }
                k10.I();
                if (k10.i()) {
                    k10.p(a15);
                } else {
                    k10.t();
                }
                C4889m a16 = F1.a(k10);
                F1.c(a16, b14, aVar3.c());
                F1.c(a16, s11, aVar3.e());
                p<C4504g, Integer, C16807N> b15 = aVar3.b();
                if (a16.i() || !C17542s.e(a16.D(), Integer.valueOf(a14))) {
                    a16.u(Integer.valueOf(a14));
                    a16.w(Integer.valueOf(a14), b15);
                }
                F1.c(a16, e11, aVar3.d());
                if (properties == null || (jsonElement = properties.get("name")) == null || (str = jsonElement.getAsString()) == null) {
                    String string = context.getString(C10443N.f77914h);
                    C17542s.i(string, "getString(...)");
                    str = string;
                }
                C18030v vVar = C18030v.f147664a;
                int i14 = C18030v.f147665b;
                C4889m mVar2 = k10;
                Dd.p.b(str, n11.a(aVar2, 1.0f, false), 0, vVar.b(k10, i14).c().e(), mVar2, 0, 4);
                C5844O.a(D.i(aVar2, uVar.f()), k10, 0);
                int i15 = i14;
                Dd.p.b(d(properties, b11), n11.a(aVar2, 0.5f, false), vVar.a(k10, i15).u0(), vVar.b(k10, i15).a().b(), mVar2, 0, 0);
                k10.x();
                k10.x();
                if (C4895p.J()) {
                    C4895p.R();
                }
            } else {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
        } else {
            k10.L();
        }
        Y0 n12 = k10.n();
        if (n12 != null) {
            n12.a(new a(feature, i10));
        }
    }

    private static final String c(JsonObject jsonObject) {
        String str;
        IconMapping iconMapping;
        IconMapping iconMapping2 = null;
        if (jsonObject != null) {
            JsonElement jsonElement = jsonObject.get("id");
            if (jsonElement == null || (str = jsonElement.getAsString()) == null) {
                str = jsonObject.get("subtype").getAsString();
            }
        } else {
            str = null;
        }
        IconMapping[] a10 = m.f60810a.a();
        int length = a10.length;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                iconMapping = null;
                break;
            }
            iconMapping = a10[i11];
            if (C17542s.e(iconMapping.getId(), str)) {
                break;
            }
            i11++;
        }
        if (iconMapping != null) {
            return C10456j.BUBBLE_SELECTED.b() + '/' + iconMapping.getIconName() + ".png";
        }
        IconMapping[] b10 = m.f60810a.b();
        int length2 = b10.length;
        while (true) {
            if (i10 >= length2) {
                break;
            }
            IconMapping iconMapping3 = b10[i10];
            if (C17542s.e(iconMapping3.getId(), str)) {
                iconMapping2 = iconMapping3;
                break;
            }
            i10++;
        }
        if (iconMapping2 != null) {
            return C10456j.PIN_SELECTED.b() + '/' + iconMapping2.getIconName() + ".png";
        }
        return C10456j.BUBBLE_SELECTED.b() + "/incorrect.png";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
        r3 = r1.getName();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.lang.String d(com.google.gson.JsonObject r3, U0.A1<Jd.e> r4) {
        /*
            java.lang.String r0 = ""
            if (r3 == 0) goto L_0x0047
            java.lang.String r1 = "floor"
            com.google.gson.JsonElement r3 = r3.get(r1)
            if (r3 == 0) goto L_0x0047
            java.lang.String r3 = r3.getAsString()
            if (r3 == 0) goto L_0x0047
            java.lang.Object r4 = r4.getValue()
            Jd.e r4 = (Jd.e) r4
            java.util.List r4 = r4.n()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L_0x0022:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x003a
            java.lang.Object r1 = r4.next()
            r2 = r1
            com.ikea.kompassmap.model.store.map.Floor r2 = (com.ikea.kompassmap.model.store.map.Floor) r2
            java.lang.String r2 = r2.getFloorId()
            boolean r2 = kotlin.jvm.internal.C17542s.e(r2, r3)
            if (r2 == 0) goto L_0x0022
            goto L_0x003b
        L_0x003a:
            r1 = 0
        L_0x003b:
            com.ikea.kompassmap.model.store.map.Floor r1 = (com.ikea.kompassmap.model.store.map.Floor) r1
            if (r1 == 0) goto L_0x0047
            java.lang.String r3 = r1.getName()
            if (r3 != 0) goto L_0x0046
            goto L_0x0047
        L_0x0046:
            r0 = r3
        L_0x0047:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Fd.b.d(com.google.gson.JsonObject, U0.A1):java.lang.String");
    }

    /* access modifiers changed from: private */
    public static final C16807N e(Feature feature, int i10, C4889m mVar, int i11) {
        b(feature, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
