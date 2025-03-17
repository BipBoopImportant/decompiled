package Kl;

import Ll.f;
import Ll.g;
import Ll.h;
import Ll.i;
import Ll.j;
import Ll.k;
import Ll.l;
import Ll.m;
import TJ.C16532g;
import XH.C16807N;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.B;
import androidx.room.C7009f;
import androidx.room.C7014k;
import androidx.room.H;
import androidx.room.x;
import com.ingka.ikea.appconfig.model.GiftCardConfiguration;
import com.ingka.ikea.appconfig.model.MapServiceData;
import com.ingka.ikea.appconfig.model.PostalCodePickerConfig;
import com.ingka.ikea.appconfig.model.RemoteMedia;
import com.ingka.ikea.appconfig.model.UrlConfig;
import dI.C17164e;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

public final class b implements a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final x f82823a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C7014k<Ml.e> f82824b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final h f82825c = new h();
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final l f82826d = new l();
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final g f82827e = new g();
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final i f82828f = new i();
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final k f82829g = new k();
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final Ll.e f82830h = new Ll.e();
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final j f82831i = new j();
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final m f82832j = new m();
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final Ll.c f82833k = new Ll.c();
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final Ll.a f82834l = new Ll.a();
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final f f82835m = new f();

    /* renamed from: n  reason: collision with root package name */
    private final H f82836n;

    class a extends C7014k<Ml.e> {
        a(x xVar) {
            super(xVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void bind(Q4.k kVar, Ml.e eVar) {
            kVar.H(1, eVar.n());
            kVar.H(2, eVar.k());
            kVar.H(3, eVar.b());
            kVar.H(4, eVar.d());
            kVar.H(5, eVar.e());
            kVar.H(6, b.this.f82825c.a(eVar.o()));
            kVar.H(7, b.this.f82826d.b(eVar.t()));
            kVar.i2(8, eVar.u() ? 1 : 0);
            kVar.i2(9, eVar.s() ? 1 : 0);
            String a10 = b.this.f82827e.a(eVar.m());
            if (a10 == null) {
                kVar.I2(10);
            } else {
                kVar.H(10, a10);
            }
            if (eVar.l() == null) {
                kVar.I2(11);
            } else {
                kVar.H(11, eVar.l());
            }
            kVar.H(12, b.this.f82828f.a(eVar.p()));
            kVar.H(13, b.this.f82829g.a(eVar.r()));
            String a11 = b.this.f82830h.a(eVar.h());
            if (a11 == null) {
                kVar.I2(14);
            } else {
                kVar.H(14, a11);
            }
            kVar.i2(15, eVar.f() ? 1 : 0);
            kVar.i2(16, eVar.g() ? 1 : 0);
            String a12 = eVar.a() == null ? null : b.this.f82831i.a(eVar.a());
            if (a12 == null) {
                kVar.I2(17);
            } else {
                kVar.H(17, a12);
            }
            Ml.a c10 = eVar.c();
            kVar.H(18, c10.o());
            kVar.H(19, c10.g());
            kVar.H(20, c10.b());
            kVar.H(21, c10.l());
            kVar.H(22, c10.m());
            kVar.H(23, c10.i());
            kVar.H(24, c10.j());
            kVar.i2(25, (long) c10.k());
            kVar.i2(26, c10.n() ? 1 : 0);
            if (c10.c() == null) {
                kVar.I2(27);
            } else {
                kVar.g0(27, c10.c().doubleValue());
            }
            kVar.H(28, b.this.f82832j.b(c10.h()));
            kVar.H(29, b.this.f82833k.a(c10.f()));
            kVar.H(30, b.this.f82832j.b(c10.e()));
            kVar.H(31, b.this.f82834l.a(c10.d()));
            kVar.g0(32, c10.a());
            Rl.h q10 = eVar.q();
            kVar.i2(33, q10.a() ? 1 : 0);
            kVar.i2(34, q10.e() ? 1 : 0);
            kVar.i2(35, q10.f() ? 1 : 0);
            kVar.i2(36, q10.c() ? 1 : 0);
            kVar.i2(37, q10.d() ? 1 : 0);
            kVar.i2(38, q10.g() ? 1 : 0);
            kVar.i2(39, q10.i() ? 1 : 0);
            kVar.i2(40, q10.b() ? 1 : 0);
            kVar.i2(41, q10.h() ? 1 : 0);
            Rl.a i10 = eVar.i();
            kVar.H(42, i10.b());
            kVar.H(43, i10.a());
            kVar.H(44, b.this.f82835m.a(i10.c()));
            Rl.a j10 = eVar.j();
            kVar.H(45, j10.b());
            kVar.H(46, j10.a());
            kVar.H(47, b.this.f82835m.a(j10.c()));
        }

        /* access modifiers changed from: protected */
        public String createQuery() {
            return "INSERT OR REPLACE INTO `MarketConfig` (`marketCode`,`languageCode`,`calendar`,`dateFormat`,`emptyListCarouselData`,`measurementSystem`,`urls`,`isSignUpHlp`,`showEnergyLabelCartList`,`mapServiceData`,`legalInformationFooter`,`postalCodePickerConfig`,`searchHints`,`giftCardConfiguration`,`trackIcm`,`familyAndRegularPriceSameSize`,`assets`,`symbol`,`decimalSymbol`,`code`,`negativeFormat`,`positiveFormat`,`digitGroupSymbol`,`integerSymbol`,`nbrFractionDigits`,`showFractionDigitsOnInteger`,`conversionRate`,`decimalVerticalAlignment`,`decimalSign`,`currencyVerticalAlignment`,`currencyPosition`,`analyticsConversionRate`,`detailedUnitPrice`,`perPiecePrice`,`showFoodComparisionPrice`,`formerPriceCrossOutNLP`,`formerPriceCrossOutTRO`,`showNLPDateInterval`,`showVATInformation`,`enablePrf`,`showPricesInclVat`,`domain`,`clientId`,`parameters`,`signUp_domain`,`signUp_clientId`,`signUp_parameters`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    /* renamed from: Kl.b$b  reason: collision with other inner class name */
    class C1638b extends H {
        C1638b(b bVar, x xVar) {
            super(xVar);
        }

        public String createQuery() {
            return "DELETE FROM MarketConfig";
        }
    }

    class c implements Callable<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Ml.e f82838a;

        c(Ml.e eVar) {
            this.f82838a = eVar;
        }

        /* renamed from: a */
        public C16807N call() {
            b.this.f82823a.beginTransaction();
            try {
                b.this.f82824b.insert(this.f82838a);
                b.this.f82823a.setTransactionSuccessful();
                return C16807N.f139792a;
            } finally {
                b.this.f82823a.endTransaction();
            }
        }
    }

    class d implements Callable<Ml.e> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ B f82840a;

        d(B b10) {
            this.f82840a = b10;
        }

        /* renamed from: a */
        public Ml.e call() {
            Ml.e eVar;
            boolean z10;
            int i10;
            boolean z11;
            int i11;
            List<RemoteMedia> list;
            int i12;
            boolean z12;
            int i13;
            Double d10;
            int i14;
            Ml.d dVar;
            int i15;
            Ml.c cVar;
            int i16;
            Ml.d dVar2;
            int i17;
            Ml.b bVar;
            int i18;
            boolean z13;
            int i19;
            boolean z14;
            int i20;
            boolean z15;
            int i21;
            boolean z16;
            int i22;
            boolean z17;
            int i23;
            boolean z18;
            int i24;
            boolean z19;
            int i25;
            boolean z20;
            int i26;
            Cursor e10 = O4.b.e(b.this.f82823a, this.f82840a, false, (CancellationSignal) null);
            try {
                int d11 = O4.a.d(e10, "marketCode");
                int d12 = O4.a.d(e10, "languageCode");
                int d13 = O4.a.d(e10, "calendar");
                int d14 = O4.a.d(e10, "dateFormat");
                int d15 = O4.a.d(e10, "emptyListCarouselData");
                int d16 = O4.a.d(e10, "measurementSystem");
                int d17 = O4.a.d(e10, "urls");
                int d18 = O4.a.d(e10, "isSignUpHlp");
                int d19 = O4.a.d(e10, "showEnergyLabelCartList");
                int d20 = O4.a.d(e10, "mapServiceData");
                int d21 = O4.a.d(e10, "legalInformationFooter");
                int d22 = O4.a.d(e10, "postalCodePickerConfig");
                int d23 = O4.a.d(e10, "searchHints");
                int d24 = O4.a.d(e10, "giftCardConfiguration");
                int d25 = O4.a.d(e10, "trackIcm");
                int d26 = O4.a.d(e10, "familyAndRegularPriceSameSize");
                int d27 = O4.a.d(e10, "assets");
                int d28 = O4.a.d(e10, "symbol");
                int d29 = O4.a.d(e10, "decimalSymbol");
                int d30 = O4.a.d(e10, "code");
                int d31 = O4.a.d(e10, "negativeFormat");
                int d32 = O4.a.d(e10, "positiveFormat");
                int d33 = O4.a.d(e10, "digitGroupSymbol");
                int d34 = O4.a.d(e10, "integerSymbol");
                int d35 = O4.a.d(e10, "nbrFractionDigits");
                int d36 = O4.a.d(e10, "showFractionDigitsOnInteger");
                int d37 = O4.a.d(e10, "conversionRate");
                int d38 = O4.a.d(e10, "decimalVerticalAlignment");
                int d39 = O4.a.d(e10, "decimalSign");
                int d40 = O4.a.d(e10, "currencyVerticalAlignment");
                int d41 = O4.a.d(e10, "currencyPosition");
                int d42 = O4.a.d(e10, "analyticsConversionRate");
                int d43 = O4.a.d(e10, "detailedUnitPrice");
                int d44 = O4.a.d(e10, "perPiecePrice");
                int d45 = O4.a.d(e10, "showFoodComparisionPrice");
                int d46 = O4.a.d(e10, "formerPriceCrossOutNLP");
                int d47 = O4.a.d(e10, "formerPriceCrossOutTRO");
                int d48 = O4.a.d(e10, "showNLPDateInterval");
                int d49 = O4.a.d(e10, "showVATInformation");
                int d50 = O4.a.d(e10, "enablePrf");
                int d51 = O4.a.d(e10, "showPricesInclVat");
                int d52 = O4.a.d(e10, "domain");
                int d53 = O4.a.d(e10, "clientId");
                int d54 = O4.a.d(e10, "parameters");
                int d55 = O4.a.d(e10, "signUp_domain");
                int d56 = O4.a.d(e10, "signUp_clientId");
                int d57 = O4.a.d(e10, "signUp_parameters");
                if (e10.moveToFirst()) {
                    String string = e10.getString(d11);
                    String string2 = e10.getString(d12);
                    String string3 = e10.getString(d13);
                    String string4 = e10.getString(d14);
                    String string5 = e10.getString(d15);
                    Rl.g b10 = b.this.f82825c.b(e10.getString(d16));
                    if (b10 != null) {
                        List<UrlConfig> a10 = b.this.f82826d.a(e10.getString(d17));
                        if (a10 != null) {
                            boolean z21 = e10.getInt(d18) != 0;
                            boolean z22 = e10.getInt(d19) != 0;
                            MapServiceData b11 = b.this.f82827e.b(e10.isNull(d20) ? null : e10.getString(d20));
                            String string6 = e10.isNull(d21) ? null : e10.getString(d21);
                            PostalCodePickerConfig b12 = b.this.f82828f.b(e10.getString(d22));
                            List<String> b13 = b.this.f82829g.b(e10.getString(d23));
                            int i27 = d24;
                            GiftCardConfiguration b14 = b.this.f82830h.b(e10.isNull(i27) ? null : e10.getString(i27));
                            if (e10.getInt(d25) != 0) {
                                z10 = true;
                                i10 = d26;
                            } else {
                                i10 = d26;
                                z10 = false;
                            }
                            if (e10.getInt(i10) != 0) {
                                z11 = true;
                                i11 = d27;
                            } else {
                                i11 = d27;
                                z11 = false;
                            }
                            String string7 = e10.isNull(i11) ? null : e10.getString(i11);
                            if (string7 == null) {
                                i12 = d28;
                                list = null;
                            } else {
                                list = b.this.f82831i.b(string7);
                                i12 = d28;
                            }
                            String string8 = e10.getString(i12);
                            String string9 = e10.getString(d29);
                            String string10 = e10.getString(d30);
                            String string11 = e10.getString(d31);
                            String string12 = e10.getString(d32);
                            String string13 = e10.getString(d33);
                            String string14 = e10.getString(d34);
                            int i28 = e10.getInt(d35);
                            if (e10.getInt(d36) != 0) {
                                z12 = true;
                                i13 = d37;
                            } else {
                                i13 = d37;
                                z12 = false;
                            }
                            if (e10.isNull(i13)) {
                                i14 = d38;
                                d10 = null;
                            } else {
                                d10 = Double.valueOf(e10.getDouble(i13));
                                i14 = d38;
                            }
                            String string15 = e10.isNull(i14) ? null : e10.getString(i14);
                            if (string15 == null) {
                                i15 = d39;
                                dVar = null;
                            } else {
                                dVar = b.this.f82832j.a(string15);
                                i15 = d39;
                            }
                            String string16 = e10.isNull(i15) ? null : e10.getString(i15);
                            if (string16 == null) {
                                i16 = d40;
                                cVar = null;
                            } else {
                                cVar = b.this.f82833k.b(string16);
                                i16 = d40;
                            }
                            String string17 = e10.isNull(i16) ? null : e10.getString(i16);
                            if (string17 == null) {
                                i17 = d41;
                                dVar2 = null;
                            } else {
                                dVar2 = b.this.f82832j.a(string17);
                                i17 = d41;
                            }
                            String string18 = e10.isNull(i17) ? null : e10.getString(i17);
                            if (string18 == null) {
                                i18 = d42;
                                bVar = null;
                            } else {
                                bVar = b.this.f82834l.b(string18);
                                i18 = d42;
                            }
                            Ml.a aVar = new Ml.a(string8, string9, string10, string11, string12, string13, string14, i28, z12, d10, dVar, cVar, dVar2, bVar, e10.isNull(i18) ? null : Double.valueOf(e10.getDouble(i18)));
                            if (e10.getInt(d43) != 0) {
                                z13 = true;
                                i19 = d44;
                            } else {
                                i19 = d44;
                                z13 = false;
                            }
                            if (e10.getInt(i19) != 0) {
                                z14 = true;
                                i20 = d45;
                            } else {
                                i20 = d45;
                                z14 = false;
                            }
                            if (e10.getInt(i20) != 0) {
                                z15 = true;
                                i21 = d46;
                            } else {
                                i21 = d46;
                                z15 = false;
                            }
                            if (e10.getInt(i21) != 0) {
                                z16 = true;
                                i22 = d47;
                            } else {
                                i22 = d47;
                                z16 = false;
                            }
                            if (e10.getInt(i22) != 0) {
                                z17 = true;
                                i23 = d48;
                            } else {
                                i23 = d48;
                                z17 = false;
                            }
                            if (e10.getInt(i23) != 0) {
                                z18 = true;
                                i24 = d49;
                            } else {
                                i24 = d49;
                                z18 = false;
                            }
                            if (e10.getInt(i24) != 0) {
                                z19 = true;
                                i25 = d50;
                            } else {
                                i25 = d50;
                                z19 = false;
                            }
                            if (e10.getInt(i25) != 0) {
                                z20 = true;
                                i26 = d51;
                            } else {
                                i26 = d51;
                                z20 = false;
                            }
                            Rl.h hVar = new Rl.h(z13, z14, z15, z16, z17, z18, z19, z20, e10.getInt(i26) != 0);
                            String string19 = e10.getString(d52);
                            String string20 = e10.getString(d53);
                            Map<String, String> b15 = b.this.f82835m.b(e10.getString(d54));
                            if (b15 != null) {
                                Rl.a aVar2 = new Rl.a(string19, string20, b15);
                                String string21 = e10.getString(d55);
                                String string22 = e10.getString(d56);
                                Map<String, String> b16 = b.this.f82835m.b(e10.getString(d57));
                                if (b16 != null) {
                                    eVar = new Ml.e(string, string2, string3, aVar, string4, hVar, string5, b10, a10, aVar2, new Rl.a(string21, string22, b16), z21, z22, b11, string6, b12, b13, b14, z10, z11, list);
                                } else {
                                    throw new IllegalStateException("Expected NON-NULL 'java.util.Map<java.lang.String, java.lang.String>', but it was NULL.");
                                }
                            } else {
                                throw new IllegalStateException("Expected NON-NULL 'java.util.Map<java.lang.String, java.lang.String>', but it was NULL.");
                            }
                        } else {
                            throw new IllegalStateException("Expected NON-NULL 'java.util.List<com.ingka.ikea.appconfig.model.UrlConfig>', but it was NULL.");
                        }
                    } else {
                        throw new IllegalStateException("Expected NON-NULL 'com.ingka.ikea.appconfig.model.MeasurementSystem', but it was NULL.");
                    }
                } else {
                    eVar = null;
                }
                return eVar;
            } finally {
                e10.close();
                this.f82840a.h();
            }
        }
    }

    class e implements Callable<Ml.e> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ B f82842a;

        e(B b10) {
            this.f82842a = b10;
        }

        /* renamed from: a */
        public Ml.e call() {
            Ml.e eVar;
            boolean z10;
            int i10;
            boolean z11;
            int i11;
            List<RemoteMedia> list;
            int i12;
            boolean z12;
            int i13;
            Double d10;
            int i14;
            Ml.d dVar;
            int i15;
            Ml.c cVar;
            int i16;
            Ml.d dVar2;
            int i17;
            Ml.b bVar;
            int i18;
            boolean z13;
            int i19;
            boolean z14;
            int i20;
            boolean z15;
            int i21;
            boolean z16;
            int i22;
            boolean z17;
            int i23;
            boolean z18;
            int i24;
            boolean z19;
            int i25;
            boolean z20;
            int i26;
            Cursor e10 = O4.b.e(b.this.f82823a, this.f82842a, false, (CancellationSignal) null);
            try {
                int d11 = O4.a.d(e10, "marketCode");
                int d12 = O4.a.d(e10, "languageCode");
                int d13 = O4.a.d(e10, "calendar");
                int d14 = O4.a.d(e10, "dateFormat");
                int d15 = O4.a.d(e10, "emptyListCarouselData");
                int d16 = O4.a.d(e10, "measurementSystem");
                int d17 = O4.a.d(e10, "urls");
                int d18 = O4.a.d(e10, "isSignUpHlp");
                int d19 = O4.a.d(e10, "showEnergyLabelCartList");
                int d20 = O4.a.d(e10, "mapServiceData");
                int d21 = O4.a.d(e10, "legalInformationFooter");
                int d22 = O4.a.d(e10, "postalCodePickerConfig");
                int d23 = O4.a.d(e10, "searchHints");
                int d24 = O4.a.d(e10, "giftCardConfiguration");
                int d25 = O4.a.d(e10, "trackIcm");
                int d26 = O4.a.d(e10, "familyAndRegularPriceSameSize");
                int d27 = O4.a.d(e10, "assets");
                int d28 = O4.a.d(e10, "symbol");
                int d29 = O4.a.d(e10, "decimalSymbol");
                int d30 = O4.a.d(e10, "code");
                int d31 = O4.a.d(e10, "negativeFormat");
                int d32 = O4.a.d(e10, "positiveFormat");
                int d33 = O4.a.d(e10, "digitGroupSymbol");
                int d34 = O4.a.d(e10, "integerSymbol");
                int d35 = O4.a.d(e10, "nbrFractionDigits");
                int d36 = O4.a.d(e10, "showFractionDigitsOnInteger");
                int d37 = O4.a.d(e10, "conversionRate");
                int d38 = O4.a.d(e10, "decimalVerticalAlignment");
                int d39 = O4.a.d(e10, "decimalSign");
                int d40 = O4.a.d(e10, "currencyVerticalAlignment");
                int d41 = O4.a.d(e10, "currencyPosition");
                int d42 = O4.a.d(e10, "analyticsConversionRate");
                int d43 = O4.a.d(e10, "detailedUnitPrice");
                int d44 = O4.a.d(e10, "perPiecePrice");
                int d45 = O4.a.d(e10, "showFoodComparisionPrice");
                int d46 = O4.a.d(e10, "formerPriceCrossOutNLP");
                int d47 = O4.a.d(e10, "formerPriceCrossOutTRO");
                int d48 = O4.a.d(e10, "showNLPDateInterval");
                int d49 = O4.a.d(e10, "showVATInformation");
                int d50 = O4.a.d(e10, "enablePrf");
                int d51 = O4.a.d(e10, "showPricesInclVat");
                int d52 = O4.a.d(e10, "domain");
                int d53 = O4.a.d(e10, "clientId");
                int d54 = O4.a.d(e10, "parameters");
                int d55 = O4.a.d(e10, "signUp_domain");
                int d56 = O4.a.d(e10, "signUp_clientId");
                int d57 = O4.a.d(e10, "signUp_parameters");
                if (e10.moveToFirst()) {
                    String string = e10.getString(d11);
                    String string2 = e10.getString(d12);
                    String string3 = e10.getString(d13);
                    String string4 = e10.getString(d14);
                    String string5 = e10.getString(d15);
                    Rl.g b10 = b.this.f82825c.b(e10.getString(d16));
                    if (b10 != null) {
                        List<UrlConfig> a10 = b.this.f82826d.a(e10.getString(d17));
                        if (a10 != null) {
                            boolean z21 = e10.getInt(d18) != 0;
                            boolean z22 = e10.getInt(d19) != 0;
                            MapServiceData b11 = b.this.f82827e.b(e10.isNull(d20) ? null : e10.getString(d20));
                            String string6 = e10.isNull(d21) ? null : e10.getString(d21);
                            PostalCodePickerConfig b12 = b.this.f82828f.b(e10.getString(d22));
                            List<String> b13 = b.this.f82829g.b(e10.getString(d23));
                            int i27 = d24;
                            GiftCardConfiguration b14 = b.this.f82830h.b(e10.isNull(i27) ? null : e10.getString(i27));
                            if (e10.getInt(d25) != 0) {
                                z10 = true;
                                i10 = d26;
                            } else {
                                i10 = d26;
                                z10 = false;
                            }
                            if (e10.getInt(i10) != 0) {
                                z11 = true;
                                i11 = d27;
                            } else {
                                i11 = d27;
                                z11 = false;
                            }
                            String string7 = e10.isNull(i11) ? null : e10.getString(i11);
                            if (string7 == null) {
                                i12 = d28;
                                list = null;
                            } else {
                                list = b.this.f82831i.b(string7);
                                i12 = d28;
                            }
                            String string8 = e10.getString(i12);
                            String string9 = e10.getString(d29);
                            String string10 = e10.getString(d30);
                            String string11 = e10.getString(d31);
                            String string12 = e10.getString(d32);
                            String string13 = e10.getString(d33);
                            String string14 = e10.getString(d34);
                            int i28 = e10.getInt(d35);
                            if (e10.getInt(d36) != 0) {
                                z12 = true;
                                i13 = d37;
                            } else {
                                i13 = d37;
                                z12 = false;
                            }
                            if (e10.isNull(i13)) {
                                i14 = d38;
                                d10 = null;
                            } else {
                                d10 = Double.valueOf(e10.getDouble(i13));
                                i14 = d38;
                            }
                            String string15 = e10.isNull(i14) ? null : e10.getString(i14);
                            if (string15 == null) {
                                i15 = d39;
                                dVar = null;
                            } else {
                                dVar = b.this.f82832j.a(string15);
                                i15 = d39;
                            }
                            String string16 = e10.isNull(i15) ? null : e10.getString(i15);
                            if (string16 == null) {
                                i16 = d40;
                                cVar = null;
                            } else {
                                cVar = b.this.f82833k.b(string16);
                                i16 = d40;
                            }
                            String string17 = e10.isNull(i16) ? null : e10.getString(i16);
                            if (string17 == null) {
                                i17 = d41;
                                dVar2 = null;
                            } else {
                                dVar2 = b.this.f82832j.a(string17);
                                i17 = d41;
                            }
                            String string18 = e10.isNull(i17) ? null : e10.getString(i17);
                            if (string18 == null) {
                                i18 = d42;
                                bVar = null;
                            } else {
                                bVar = b.this.f82834l.b(string18);
                                i18 = d42;
                            }
                            Ml.a aVar = new Ml.a(string8, string9, string10, string11, string12, string13, string14, i28, z12, d10, dVar, cVar, dVar2, bVar, e10.isNull(i18) ? null : Double.valueOf(e10.getDouble(i18)));
                            if (e10.getInt(d43) != 0) {
                                z13 = true;
                                i19 = d44;
                            } else {
                                i19 = d44;
                                z13 = false;
                            }
                            if (e10.getInt(i19) != 0) {
                                z14 = true;
                                i20 = d45;
                            } else {
                                i20 = d45;
                                z14 = false;
                            }
                            if (e10.getInt(i20) != 0) {
                                z15 = true;
                                i21 = d46;
                            } else {
                                i21 = d46;
                                z15 = false;
                            }
                            if (e10.getInt(i21) != 0) {
                                z16 = true;
                                i22 = d47;
                            } else {
                                i22 = d47;
                                z16 = false;
                            }
                            if (e10.getInt(i22) != 0) {
                                z17 = true;
                                i23 = d48;
                            } else {
                                i23 = d48;
                                z17 = false;
                            }
                            if (e10.getInt(i23) != 0) {
                                z18 = true;
                                i24 = d49;
                            } else {
                                i24 = d49;
                                z18 = false;
                            }
                            if (e10.getInt(i24) != 0) {
                                z19 = true;
                                i25 = d50;
                            } else {
                                i25 = d50;
                                z19 = false;
                            }
                            if (e10.getInt(i25) != 0) {
                                z20 = true;
                                i26 = d51;
                            } else {
                                i26 = d51;
                                z20 = false;
                            }
                            Rl.h hVar = new Rl.h(z13, z14, z15, z16, z17, z18, z19, z20, e10.getInt(i26) != 0);
                            String string19 = e10.getString(d52);
                            String string20 = e10.getString(d53);
                            Map<String, String> b15 = b.this.f82835m.b(e10.getString(d54));
                            if (b15 != null) {
                                Rl.a aVar2 = new Rl.a(string19, string20, b15);
                                String string21 = e10.getString(d55);
                                String string22 = e10.getString(d56);
                                Map<String, String> b16 = b.this.f82835m.b(e10.getString(d57));
                                if (b16 != null) {
                                    eVar = new Ml.e(string, string2, string3, aVar, string4, hVar, string5, b10, a10, aVar2, new Rl.a(string21, string22, b16), z21, z22, b11, string6, b12, b13, b14, z10, z11, list);
                                } else {
                                    throw new IllegalStateException("Expected NON-NULL 'java.util.Map<java.lang.String, java.lang.String>', but it was NULL.");
                                }
                            } else {
                                throw new IllegalStateException("Expected NON-NULL 'java.util.Map<java.lang.String, java.lang.String>', but it was NULL.");
                            }
                        } else {
                            throw new IllegalStateException("Expected NON-NULL 'java.util.List<com.ingka.ikea.appconfig.model.UrlConfig>', but it was NULL.");
                        }
                    } else {
                        throw new IllegalStateException("Expected NON-NULL 'com.ingka.ikea.appconfig.model.MeasurementSystem', but it was NULL.");
                    }
                } else {
                    eVar = null;
                }
                return eVar;
            } finally {
                e10.close();
            }
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            this.f82842a.h();
        }
    }

    public b(x xVar) {
        this.f82823a = xVar;
        this.f82824b = new a(xVar);
        this.f82836n = new C1638b(this, xVar);
    }

    public static List<Class<?>> q() {
        return Collections.emptyList();
    }

    public Object a(String str, String str2, C17164e<? super Ml.e> eVar) {
        B e10 = B.e("SELECT * FROM MarketConfig WHERE MarketCode = ? AND LanguageCode = ?", 2);
        e10.H(1, str);
        e10.H(2, str2);
        return C7009f.b(this.f82823a, false, O4.b.a(), new d(e10), eVar);
    }

    public C16532g<Ml.e> b(String str, String str2) {
        B e10 = B.e("SELECT * FROM MarketConfig WHERE MarketCode = ? AND LanguageCode = ?", 2);
        e10.H(1, str);
        e10.H(2, str2);
        return C7009f.a(this.f82823a, false, new String[]{"MarketConfig"}, new e(e10));
    }

    public Object c(Ml.e eVar, C17164e<? super C16807N> eVar2) {
        return C7009f.c(this.f82823a, true, new c(eVar), eVar2);
    }
}
