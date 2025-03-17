package KL;

import LL.C16031a;
import com.oppwa.mobile.connect.BuildConfig;
import d9.M;
import java.util.Map;
import org.maplibre.android.maps.E;
import org.maplibre.android.maps.MapView;
import org.maplibre.android.maps.o;
import org.maplibre.android.style.layers.SymbolLayer;
import org.maplibre.android.style.layers.c;
import org.maplibre.android.style.sources.a;

public class m extends C15999c<SymbolLayer, k, n, Object, Object, Object> {
    public m(MapView mapView, o oVar, E e10) {
        this(mapView, oVar, e10, (String) null, (String) null, (a) null);
    }

    /* access modifiers changed from: package-private */
    public String k() {
        return "id";
    }

    /* access modifiers changed from: package-private */
    public void o() {
        Map<String, Boolean> map = this.f135945d;
        Boolean bool = Boolean.FALSE;
        map.put("symbol-sort-key", bool);
        this.f135945d.put("icon-size", bool);
        this.f135945d.put("icon-image", bool);
        this.f135945d.put("icon-rotate", bool);
        this.f135945d.put("icon-offset", bool);
        this.f135945d.put("icon-anchor", bool);
        this.f135945d.put("text-field", bool);
        this.f135945d.put("text-font", bool);
        this.f135945d.put("text-size", bool);
        this.f135945d.put("text-max-width", bool);
        this.f135945d.put("text-letter-spacing", bool);
        this.f135945d.put("text-justify", bool);
        this.f135945d.put("text-radial-offset", bool);
        this.f135945d.put("text-anchor", bool);
        this.f135945d.put("text-rotate", bool);
        this.f135945d.put("text-transform", bool);
        this.f135945d.put("text-offset", bool);
        this.f135945d.put("icon-opacity", bool);
        this.f135945d.put("icon-color", bool);
        this.f135945d.put("icon-halo-color", bool);
        this.f135945d.put("icon-halo-width", bool);
        this.f135945d.put("icon-halo-blur", bool);
        this.f135945d.put("text-opacity", bool);
        this.f135945d.put("text-color", bool);
        this.f135945d.put("text-halo-color", bool);
        this.f135945d.put("text-halo-width", bool);
        this.f135945d.put("text-halo-blur", bool);
    }

    /* access modifiers changed from: protected */
    public void t(String str) {
        String str2;
        String str3 = str;
        String str4 = "icon-image";
        String str5 = "icon-color";
        String str6 = "icon-halo-width";
        String str7 = "icon-halo-color";
        String str8 = "text-radial-offset";
        String str9 = "icon-rotate";
        String str10 = "icon-offset";
        String str11 = "text-rotate";
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2146810373:
                if (str3.equals(str11)) {
                    c10 = 0;
                    break;
                }
                break;
            case -2041493401:
                str2 = str11;
                String str12 = str10;
                if (str3.equals(str12)) {
                    c10 = 1;
                }
                str10 = str12;
                break;
            case -1946894033:
                str2 = str11;
                String str13 = str9;
                if (str3.equals(str13)) {
                    c10 = 2;
                }
                str9 = str13;
                break;
            case -1717422239:
                str2 = str11;
                String str14 = str8;
                if (str3.equals(str14)) {
                    c10 = 3;
                }
                str8 = str14;
                break;
            case -1708933018:
                str2 = str11;
                String str15 = str7;
                if (str3.equals(str15)) {
                    c10 = 4;
                }
                str7 = str15;
                break;
            case -1690648887:
                str2 = str11;
                String str16 = str6;
                if (str3.equals(str16)) {
                    c10 = 5;
                }
                str6 = str16;
                break;
            case -1600683761:
                str2 = str11;
                String str17 = str5;
                if (str3.equals(str17)) {
                    c10 = 6;
                }
                str5 = str17;
                break;
            case -1595213049:
                str2 = str11;
                String str18 = str4;
                if (str3.equals(str18)) {
                    c10 = 7;
                }
                str4 = str18;
                break;
            case -1436636971:
                str2 = str11;
                if (str3.equals("icon-size")) {
                    c10 = 8;
                    break;
                }
                break;
            case -1336352187:
                str2 = str11;
                if (str3.equals("symbol-sort-key")) {
                    c10 = 9;
                    break;
                }
                break;
            case -1262567732:
                str2 = str11;
                if (str3.equals("text-transform")) {
                    c10 = 10;
                    break;
                }
                break;
            case -1084154641:
                str2 = str11;
                if (str3.equals("text-font")) {
                    c10 = 11;
                    break;
                }
                break;
            case -1083772767:
                str2 = str11;
                if (str3.equals("text-size")) {
                    c10 = 12;
                    break;
                }
                break;
            case -888013006:
                str2 = str11;
                if (str3.equals("text-halo-color")) {
                    c10 = 13;
                    break;
                }
                break;
            case -886443260:
                str2 = str11;
                if (str3.equals("icon-halo-blur")) {
                    c10 = 14;
                    break;
                }
                break;
            case -869728875:
                str2 = str11;
                if (str3.equals("text-halo-width")) {
                    c10 = 15;
                    break;
                }
                break;
            case -483024021:
                str2 = str11;
                if (str3.equals("text-opacity")) {
                    c10 = 16;
                    break;
                }
                break;
            case -465299984:
                str2 = str11;
                if (str3.equals("text-justify")) {
                    c10 = 17;
                    break;
                }
                break;
            case 317300605:
                str2 = str11;
                if (str3.equals("text-max-width")) {
                    c10 = 18;
                    break;
                }
                break;
            case 428355132:
                str2 = str11;
                if (str3.equals("text-letter-spacing")) {
                    c10 = 19;
                    break;
                }
                break;
            case 525511352:
                str2 = str11;
                if (str3.equals("text-halo-blur")) {
                    c10 = 20;
                    break;
                }
                break;
            case 748171971:
                str2 = str11;
                if (str3.equals("text-color")) {
                    c10 = 21;
                    break;
                }
                break;
            case 750756954:
                str2 = str11;
                if (str3.equals("text-field")) {
                    c10 = 22;
                    break;
                }
                break;
            case 1419415223:
                str2 = str11;
                if (str3.equals("icon-opacity")) {
                    c10 = 23;
                    break;
                }
                break;
            case 1660037973:
                str2 = str11;
                if (str3.equals("text-anchor")) {
                    c10 = 24;
                    break;
                }
                break;
            case 1859954313:
                str2 = str11;
                if (str3.equals("icon-anchor")) {
                    c10 = 25;
                    break;
                }
                break;
            case 2053557555:
                str2 = str11;
                if (str3.equals("text-offset")) {
                    c10 = 26;
                    break;
                }
                break;
        }
        str11 = str2;
        switch (c10) {
            case 0:
                ((SymbolLayer) this.f135952k).f(c.y(C16031a.c(str11)));
                return;
            case 1:
                ((SymbolLayer) this.f135952k).f(c.g(C16031a.c(str10)));
                return;
            case 2:
                ((SymbolLayer) this.f135952k).f(c.i(C16031a.c(str9)));
                return;
            case 3:
                ((SymbolLayer) this.f135952k).f(c.x(C16031a.c(str8)));
                return;
            case 4:
                ((SymbolLayer) this.f135952k).f(c.d(C16031a.c(str7)));
                return;
            case 5:
                ((SymbolLayer) this.f135952k).f(c.e(C16031a.c(str6)));
                return;
            case 6:
                ((SymbolLayer) this.f135952k).f(c.b(C16031a.c(str5)));
                return;
            case 7:
                ((SymbolLayer) this.f135952k).f(c.f(C16031a.c(str4)));
                return;
            case 8:
                ((SymbolLayer) this.f135952k).f(c.j(C16031a.c("icon-size")));
                return;
            case 9:
                ((SymbolLayer) this.f135952k).f(c.k(C16031a.c("symbol-sort-key")));
                return;
            case 10:
                ((SymbolLayer) this.f135952k).f(c.A(C16031a.c("text-transform")));
                return;
            case 11:
                ((SymbolLayer) this.f135952k).f(c.o(C16031a.c("text-font")));
                return;
            case 12:
                ((SymbolLayer) this.f135952k).f(c.z(C16031a.c("text-size")));
                return;
            case 13:
                ((SymbolLayer) this.f135952k).f(c.q(C16031a.c("text-halo-color")));
                return;
            case 14:
                ((SymbolLayer) this.f135952k).f(c.c(C16031a.c("icon-halo-blur")));
                return;
            case 15:
                ((SymbolLayer) this.f135952k).f(c.r(C16031a.c("text-halo-width")));
                return;
            case 16:
                ((SymbolLayer) this.f135952k).f(c.w(C16031a.c("text-opacity")));
                return;
            case 17:
                ((SymbolLayer) this.f135952k).f(c.s(C16031a.c("text-justify")));
                return;
            case 18:
                ((SymbolLayer) this.f135952k).f(c.u(C16031a.c("text-max-width")));
                return;
            case 19:
                ((SymbolLayer) this.f135952k).f(c.t(C16031a.c("text-letter-spacing")));
                return;
            case 20:
                ((SymbolLayer) this.f135952k).f(c.p(C16031a.c("text-halo-blur")));
                return;
            case 21:
                ((SymbolLayer) this.f135952k).f(c.m(C16031a.c("text-color")));
                return;
            case 22:
                ((SymbolLayer) this.f135952k).f(c.n(C16031a.c("text-field")));
                return;
            case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER:
                ((SymbolLayer) this.f135952k).f(c.h(C16031a.c("icon-opacity")));
                return;
            case BuildConfig.MIN_SDK_VERSION:
                ((SymbolLayer) this.f135952k).f(c.l(C16031a.c("text-anchor")));
                return;
            case 25:
                ((SymbolLayer) this.f135952k).f(c.a(C16031a.c("icon-anchor")));
                return;
            case 26:
                ((SymbolLayer) this.f135952k).f(c.v(C16031a.c("text-offset")));
                return;
            default:
                return;
        }
    }

    public void u(C16031a aVar) {
        this.f135947f = aVar;
        ((SymbolLayer) this.f135952k).g(aVar);
    }

    public m(MapView mapView, o oVar, E e10, String str, String str2, a aVar) {
        this(mapView, oVar, e10, new l(), str, str2, aVar, C16002f.c(mapView, oVar));
    }

    m(MapView mapView, o oVar, E e10, C16001e<SymbolLayer> eVar, String str, String str2, a aVar, C16002f fVar) {
        super(mapView, oVar, e10, eVar, fVar, str, str2, aVar);
    }
}
