package com.ingka.ikea.mcomsettings.impl.db;

import O4.b;
import O4.f;
import Q4.g;
import Q4.h;
import androidx.room.A;
import androidx.room.C7011h;
import androidx.room.r;
import androidx.room.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import vv.C12268a;
import vv.C12269b;

public final class MComDatabase_Impl extends MComDatabase {

    /* renamed from: c  reason: collision with root package name */
    private volatile C12268a f96649c;

    class a extends A.b {
        a(int i10) {
            super(i10);
        }

        public void createAllTables(g gVar) {
            gVar.T("CREATE TABLE IF NOT EXISTS `Config` (`RetailCode` TEXT NOT NULL, `LanguageCode` TEXT NOT NULL, `DiscountCodeEnabled` INTEGER NOT NULL, `ShowTotalExclTaxInCartAndCheckout` INTEGER NOT NULL, `ShowPriceViewInPaymentExpanded` INTEGER NOT NULL, `ContactUri` TEXT, `PaymentTermsAndConditionHolders` TEXT NOT NULL, `DeliveryTimeSlotDatePatternsHolder` TEXT NOT NULL, `AciCardHolderNameValidationInAci` TEXT, `ShowOrderSummaryInCheckoutExpanded` INTEGER NOT NULL, `AvailablePaymentOptionHolders` TEXT, `PickupDisabled` INTEGER NOT NULL, `DateAndTimePresentationPattern` TEXT NOT NULL, `CheckoutSurveyConfig` TEXT, `AbortCheckoutSurveyConfig` TEXT, `ShowMaterialsInCart` INTEGER NOT NULL, `EmployeeDiscount` TEXT, `ShowPaymentInformationSectionCheckout` INTEGER NOT NULL, `GooglePayExpressConfig` TEXT, `RemoteSalesCartThreshold` REAL, PRIMARY KEY(`RetailCode`, `LanguageCode`))");
            gVar.T("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            gVar.T("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '44b41e7e93283f23ef6965201585254c')");
        }

        public void dropAllTables(g gVar) {
            gVar.T("DROP TABLE IF EXISTS `Config`");
            List<x.b> d10 = MComDatabase_Impl.this.mCallbacks;
            if (d10 != null) {
                for (x.b b10 : d10) {
                    b10.b(gVar);
                }
            }
        }

        public void onCreate(g gVar) {
            List<x.b> e10 = MComDatabase_Impl.this.mCallbacks;
            if (e10 != null) {
                for (x.b a10 : e10) {
                    a10.a(gVar);
                }
            }
        }

        public void onOpen(g gVar) {
            g unused = MComDatabase_Impl.this.mDatabase = gVar;
            MComDatabase_Impl.this.internalInitInvalidationTracker(gVar);
            List<x.b> h10 = MComDatabase_Impl.this.mCallbacks;
            if (h10 != null) {
                for (x.b c10 : h10) {
                    c10.c(gVar);
                }
            }
        }

        public void onPostMigrate(g gVar) {
        }

        public void onPreMigrate(g gVar) {
            b.b(gVar);
        }

        public A.c onValidateSchema(g gVar) {
            HashMap hashMap = new HashMap(20);
            hashMap.put("RetailCode", new f.a("RetailCode", "TEXT", true, 1, (String) null, 1));
            hashMap.put("LanguageCode", new f.a("LanguageCode", "TEXT", true, 2, (String) null, 1));
            hashMap.put("DiscountCodeEnabled", new f.a("DiscountCodeEnabled", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("ShowTotalExclTaxInCartAndCheckout", new f.a("ShowTotalExclTaxInCartAndCheckout", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("ShowPriceViewInPaymentExpanded", new f.a("ShowPriceViewInPaymentExpanded", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("ContactUri", new f.a("ContactUri", "TEXT", false, 0, (String) null, 1));
            hashMap.put("PaymentTermsAndConditionHolders", new f.a("PaymentTermsAndConditionHolders", "TEXT", true, 0, (String) null, 1));
            hashMap.put("DeliveryTimeSlotDatePatternsHolder", new f.a("DeliveryTimeSlotDatePatternsHolder", "TEXT", true, 0, (String) null, 1));
            hashMap.put("AciCardHolderNameValidationInAci", new f.a("AciCardHolderNameValidationInAci", "TEXT", false, 0, (String) null, 1));
            hashMap.put("ShowOrderSummaryInCheckoutExpanded", new f.a("ShowOrderSummaryInCheckoutExpanded", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("AvailablePaymentOptionHolders", new f.a("AvailablePaymentOptionHolders", "TEXT", false, 0, (String) null, 1));
            hashMap.put("PickupDisabled", new f.a("PickupDisabled", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("DateAndTimePresentationPattern", new f.a("DateAndTimePresentationPattern", "TEXT", true, 0, (String) null, 1));
            hashMap.put("CheckoutSurveyConfig", new f.a("CheckoutSurveyConfig", "TEXT", false, 0, (String) null, 1));
            hashMap.put("AbortCheckoutSurveyConfig", new f.a("AbortCheckoutSurveyConfig", "TEXT", false, 0, (String) null, 1));
            hashMap.put("ShowMaterialsInCart", new f.a("ShowMaterialsInCart", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("EmployeeDiscount", new f.a("EmployeeDiscount", "TEXT", false, 0, (String) null, 1));
            hashMap.put("ShowPaymentInformationSectionCheckout", new f.a("ShowPaymentInformationSectionCheckout", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("GooglePayExpressConfig", new f.a("GooglePayExpressConfig", "TEXT", false, 0, (String) null, 1));
            hashMap.put("RemoteSalesCartThreshold", new f.a("RemoteSalesCartThreshold", "REAL", false, 0, (String) null, 1));
            f fVar = new f("Config", hashMap, new HashSet(0), new HashSet(0));
            f a10 = f.a(gVar, "Config");
            if (fVar.equals(a10)) {
                return new A.c(true, (String) null);
            }
            return new A.c(false, "Config(com.ingka.ikea.mcomsettings.impl.db.MComConfigHolder).\n Expected:\n" + fVar + "\n Found:\n" + a10);
        }
    }

    public C12268a c() {
        C12268a aVar;
        if (this.f96649c != null) {
            return this.f96649c;
        }
        synchronized (this) {
            try {
                if (this.f96649c == null) {
                    this.f96649c = new C12269b(this);
                }
                aVar = this.f96649c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    public void clearAllTables() {
        super.assertNotMainThread();
        g writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.T("DELETE FROM `Config`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            writableDatabase.u2("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.N2()) {
                writableDatabase.T("VACUUM");
            }
        }
    }

    /* access modifiers changed from: protected */
    public r createInvalidationTracker() {
        return new r(this, new HashMap(0), new HashMap(0), "Config");
    }

    /* access modifiers changed from: protected */
    public h createOpenHelper(C7011h hVar) {
        return hVar.f44336c.a(h.b.a(hVar.f44334a).d(hVar.f44335b).c(new A(hVar, new a(44), "44b41e7e93283f23ef6965201585254c", "3c2a42eed41ea4cc179e3068b938008e")).b());
    }

    public List<N4.b> getAutoMigrations(Map<Class<? extends N4.a>, N4.a> map) {
        return new ArrayList();
    }

    public Set<Class<? extends N4.a>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    /* access modifiers changed from: protected */
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(C12268a.class, C12269b.k());
        return hashMap;
    }
}
