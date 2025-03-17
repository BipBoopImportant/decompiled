package vv;

import O4.b;
import Q4.k;
import TJ.C16532g;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.B;
import androidx.room.C7009f;
import androidx.room.C7013j;
import androidx.room.C7014k;
import androidx.room.x;
import com.ingka.ikea.mcomsettings.impl.AvailablePaymentOptionHolder;
import com.ingka.ikea.mcomsettings.impl.CardHolderNameValidation;
import com.ingka.ikea.mcomsettings.impl.DeliveryTimeSlotDatePatternsHolder;
import com.ingka.ikea.mcomsettings.impl.EmployeeDiscountConfig;
import com.ingka.ikea.mcomsettings.impl.PaymentTermsAndConditionHolder;
import com.ingka.ikea.mcomsettings.impl.db.MComSurveyConfig;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import wv.C12304a;
import wv.C12305b;
import wv.C12306c;
import wv.C12307d;
import wv.C12308e;
import wv.C12309f;
import wv.C12310g;

/* renamed from: vv.b  reason: case insensitive filesystem */
public final class C12269b implements C12268a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final x f105713a;

    /* renamed from: b  reason: collision with root package name */
    private final C7014k<C12270c> f105714b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C12309f f105715c = new C12309f();
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final C12306c f105716d = new C12306c();
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final C12305b f105717e = new C12305b();
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final C12304a f105718f = new C12304a();
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final C12310g f105719g = new C12310g();
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final C12307d f105720h = new C12307d();
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final C12308e f105721i = new C12308e();

    /* renamed from: j  reason: collision with root package name */
    private final C7013j<C12270c> f105722j;

    /* renamed from: vv.b$a */
    class a extends C7014k<C12270c> {
        a(x xVar) {
            super(xVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void bind(k kVar, C12270c cVar) {
            kVar.H(1, cVar.o());
            kVar.H(2, cVar.k());
            kVar.i2(3, cVar.h() ? 1 : 0);
            kVar.i2(4, cVar.t() ? 1 : 0);
            kVar.i2(5, cVar.s() ? 1 : 0);
            if (cVar.e() == null) {
                kVar.I2(6);
            } else {
                kVar.H(6, cVar.e());
            }
            String a10 = C12269b.this.f105715c.a(cVar.l());
            if (a10 == null) {
                kVar.I2(7);
            } else {
                kVar.H(7, a10);
            }
            String a11 = C12269b.this.f105716d.a(cVar.g());
            if (a11 == null) {
                kVar.I2(8);
            } else {
                kVar.H(8, a11);
            }
            String a12 = C12269b.this.f105717e.a(cVar.b());
            if (a12 == null) {
                kVar.I2(9);
            } else {
                kVar.H(9, a12);
            }
            kVar.i2(10, cVar.q() ? 1 : 0);
            String a13 = C12269b.this.f105718f.a(cVar.c());
            if (a13 == null) {
                kVar.I2(11);
            } else {
                kVar.H(11, a13);
            }
            kVar.i2(12, cVar.m() ? 1 : 0);
            kVar.H(13, cVar.f());
            String b10 = C12269b.this.f105719g.b(cVar.d());
            if (b10 == null) {
                kVar.I2(14);
            } else {
                kVar.H(14, b10);
            }
            String b11 = C12269b.this.f105719g.b(cVar.a());
            if (b11 == null) {
                kVar.I2(15);
            } else {
                kVar.H(15, b11);
            }
            kVar.i2(16, cVar.p() ? 1 : 0);
            String a14 = C12269b.this.f105720h.a(cVar.i());
            if (a14 == null) {
                kVar.I2(17);
            } else {
                kVar.H(17, a14);
            }
            kVar.i2(18, cVar.r() ? 1 : 0);
            String a15 = C12269b.this.f105721i.a(cVar.j());
            if (a15 == null) {
                kVar.I2(19);
            } else {
                kVar.H(19, a15);
            }
            if (cVar.n() == null) {
                kVar.I2(20);
            } else {
                kVar.g0(20, cVar.n().doubleValue());
            }
        }

        /* access modifiers changed from: protected */
        public String createQuery() {
            return "INSERT OR REPLACE INTO `Config` (`RetailCode`,`LanguageCode`,`DiscountCodeEnabled`,`ShowTotalExclTaxInCartAndCheckout`,`ShowPriceViewInPaymentExpanded`,`ContactUri`,`PaymentTermsAndConditionHolders`,`DeliveryTimeSlotDatePatternsHolder`,`AciCardHolderNameValidationInAci`,`ShowOrderSummaryInCheckoutExpanded`,`AvailablePaymentOptionHolders`,`PickupDisabled`,`DateAndTimePresentationPattern`,`CheckoutSurveyConfig`,`AbortCheckoutSurveyConfig`,`ShowMaterialsInCart`,`EmployeeDiscount`,`ShowPaymentInformationSectionCheckout`,`GooglePayExpressConfig`,`RemoteSalesCartThreshold`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    /* renamed from: vv.b$b  reason: collision with other inner class name */
    class C2507b extends C7013j<C12270c> {
        C2507b(C12269b bVar, x xVar) {
            super(xVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void bind(k kVar, C12270c cVar) {
            kVar.H(1, cVar.o());
            kVar.H(2, cVar.k());
        }

        /* access modifiers changed from: protected */
        public String createQuery() {
            return "DELETE FROM `Config` WHERE `RetailCode` = ? AND `LanguageCode` = ?";
        }
    }

    /* renamed from: vv.b$c */
    class c implements Callable<C12270c> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ B f105724a;

        c(B b10) {
            this.f105724a = b10;
        }

        /* renamed from: a */
        public C12270c call() {
            C12270c cVar;
            boolean z10;
            int i10;
            boolean z11;
            int i11;
            Cursor e10 = b.e(C12269b.this.f105713a, this.f105724a, false, (CancellationSignal) null);
            try {
                int d10 = O4.a.d(e10, "RetailCode");
                int d11 = O4.a.d(e10, "LanguageCode");
                int d12 = O4.a.d(e10, "DiscountCodeEnabled");
                int d13 = O4.a.d(e10, "ShowTotalExclTaxInCartAndCheckout");
                int d14 = O4.a.d(e10, "ShowPriceViewInPaymentExpanded");
                int d15 = O4.a.d(e10, "ContactUri");
                int d16 = O4.a.d(e10, "PaymentTermsAndConditionHolders");
                int d17 = O4.a.d(e10, "DeliveryTimeSlotDatePatternsHolder");
                int d18 = O4.a.d(e10, "AciCardHolderNameValidationInAci");
                int d19 = O4.a.d(e10, "ShowOrderSummaryInCheckoutExpanded");
                int d20 = O4.a.d(e10, "AvailablePaymentOptionHolders");
                int d21 = O4.a.d(e10, "PickupDisabled");
                int d22 = O4.a.d(e10, "DateAndTimePresentationPattern");
                int d23 = O4.a.d(e10, "CheckoutSurveyConfig");
                int d24 = O4.a.d(e10, "AbortCheckoutSurveyConfig");
                int d25 = O4.a.d(e10, "ShowMaterialsInCart");
                int d26 = O4.a.d(e10, "EmployeeDiscount");
                int d27 = O4.a.d(e10, "ShowPaymentInformationSectionCheckout");
                int d28 = O4.a.d(e10, "GooglePayExpressConfig");
                int d29 = O4.a.d(e10, "RemoteSalesCartThreshold");
                if (e10.moveToFirst()) {
                    String string = e10.getString(d10);
                    String string2 = e10.getString(d11);
                    boolean z12 = e10.getInt(d12) != 0;
                    boolean z13 = e10.getInt(d13) != 0;
                    boolean z14 = e10.getInt(d14) != 0;
                    String string3 = e10.isNull(d15) ? null : e10.getString(d15);
                    List<PaymentTermsAndConditionHolder> b10 = C12269b.this.f105715c.b(e10.isNull(d16) ? null : e10.getString(d16));
                    if (b10 != null) {
                        DeliveryTimeSlotDatePatternsHolder b11 = C12269b.this.f105716d.b(e10.isNull(d17) ? null : e10.getString(d17));
                        if (b11 != null) {
                            CardHolderNameValidation b12 = C12269b.this.f105717e.b(e10.isNull(d18) ? null : e10.getString(d18));
                            boolean z15 = e10.getInt(d19) != 0;
                            List<AvailablePaymentOptionHolder> b13 = C12269b.this.f105718f.b(e10.isNull(d20) ? null : e10.getString(d20));
                            boolean z16 = e10.getInt(d21) != 0;
                            String string4 = e10.getString(d22);
                            int i12 = d23;
                            MComSurveyConfig a10 = C12269b.this.f105719g.a(e10.isNull(i12) ? null : e10.getString(i12));
                            int i13 = d24;
                            MComSurveyConfig a11 = C12269b.this.f105719g.a(e10.isNull(i13) ? null : e10.getString(i13));
                            if (e10.getInt(d25) != 0) {
                                z10 = true;
                                i10 = d26;
                            } else {
                                i10 = d26;
                                z10 = false;
                            }
                            EmployeeDiscountConfig b14 = C12269b.this.f105720h.b(e10.isNull(i10) ? null : e10.getString(i10));
                            if (e10.getInt(d27) != 0) {
                                z11 = true;
                                i11 = d28;
                            } else {
                                i11 = d28;
                                z11 = false;
                            }
                            cVar = new C12270c(string, string2, z12, z13, z14, string3, b10, b11, b12, z15, b13, z16, string4, a10, a11, z10, b14, z11, C12269b.this.f105721i.b(e10.isNull(i11) ? null : e10.getString(i11)), e10.isNull(d29) ? null : Double.valueOf(e10.getDouble(d29)));
                        } else {
                            throw new IllegalStateException("Expected NON-NULL 'com.ingka.ikea.mcomsettings.impl.DeliveryTimeSlotDatePatternsHolder', but it was NULL.");
                        }
                    } else {
                        throw new IllegalStateException("Expected NON-NULL 'java.util.List<com.ingka.ikea.mcomsettings.impl.PaymentTermsAndConditionHolder>', but it was NULL.");
                    }
                } else {
                    cVar = null;
                }
                return cVar;
            } finally {
                e10.close();
            }
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            this.f105724a.h();
        }
    }

    public C12269b(x xVar) {
        this.f105713a = xVar;
        this.f105714b = new a(xVar);
        this.f105722j = new C2507b(this, xVar);
    }

    public static List<Class<?>> k() {
        return Collections.emptyList();
    }

    public C16532g<C12270c> a(String str, String str2) {
        B e10 = B.e("SELECT * FROM Config WHERE RetailCode = ? AND LanguageCode = ?", 2);
        e10.H(1, str);
        e10.H(2, str2);
        return C7009f.a(this.f105713a, false, new String[]{"Config"}, new c(e10));
    }

    public void b(C12270c cVar) {
        this.f105713a.assertNotSuspendingTransaction();
        this.f105713a.beginTransaction();
        try {
            this.f105714b.insert(cVar);
            this.f105713a.setTransactionSuccessful();
        } finally {
            this.f105713a.endTransaction();
        }
    }
}
