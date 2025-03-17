package com.ingka.ikea.appconfig.impl.config;

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

public final class MarketConfigDatabase_Impl extends MarketConfigDatabase {

    /* renamed from: u  reason: collision with root package name */
    private volatile Kl.a f92889u;

    class a extends A.b {
        a(int i10) {
            super(i10);
        }

        public void createAllTables(g gVar) {
            gVar.T("CREATE TABLE IF NOT EXISTS `MarketConfig` (`marketCode` TEXT NOT NULL, `languageCode` TEXT NOT NULL, `calendar` TEXT NOT NULL, `dateFormat` TEXT NOT NULL, `emptyListCarouselData` TEXT NOT NULL, `measurementSystem` TEXT NOT NULL, `urls` TEXT NOT NULL, `isSignUpHlp` INTEGER NOT NULL, `showEnergyLabelCartList` INTEGER NOT NULL, `mapServiceData` TEXT, `legalInformationFooter` TEXT, `postalCodePickerConfig` TEXT NOT NULL, `searchHints` TEXT NOT NULL, `giftCardConfiguration` TEXT, `trackIcm` INTEGER NOT NULL, `familyAndRegularPriceSameSize` INTEGER NOT NULL DEFAULT false, `assets` TEXT, `symbol` TEXT NOT NULL, `decimalSymbol` TEXT NOT NULL, `code` TEXT NOT NULL, `negativeFormat` TEXT NOT NULL, `positiveFormat` TEXT NOT NULL, `digitGroupSymbol` TEXT NOT NULL, `integerSymbol` TEXT NOT NULL, `nbrFractionDigits` INTEGER NOT NULL, `showFractionDigitsOnInteger` INTEGER NOT NULL, `conversionRate` REAL, `decimalVerticalAlignment` TEXT, `decimalSign` TEXT, `currencyVerticalAlignment` TEXT, `currencyPosition` TEXT, `analyticsConversionRate` REAL, `detailedUnitPrice` INTEGER NOT NULL, `perPiecePrice` INTEGER NOT NULL, `showFoodComparisionPrice` INTEGER NOT NULL, `formerPriceCrossOutNLP` INTEGER NOT NULL, `formerPriceCrossOutTRO` INTEGER NOT NULL, `showNLPDateInterval` INTEGER NOT NULL, `showVATInformation` INTEGER NOT NULL, `enablePrf` INTEGER NOT NULL, `showPricesInclVat` INTEGER NOT NULL, `domain` TEXT NOT NULL, `clientId` TEXT NOT NULL, `parameters` TEXT NOT NULL, `signUp_domain` TEXT NOT NULL, `signUp_clientId` TEXT NOT NULL, `signUp_parameters` TEXT NOT NULL, PRIMARY KEY(`marketCode`, `languageCode`))");
            gVar.T("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            gVar.T("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '84c9a66cfa97c65eaa89c393f1be1c0a')");
        }

        public void dropAllTables(g gVar) {
            gVar.T("DROP TABLE IF EXISTS `MarketConfig`");
            List<x.b> v10 = MarketConfigDatabase_Impl.this.mCallbacks;
            if (v10 != null) {
                for (x.b b10 : v10) {
                    b10.b(gVar);
                }
            }
        }

        public void onCreate(g gVar) {
            List<x.b> w10 = MarketConfigDatabase_Impl.this.mCallbacks;
            if (w10 != null) {
                for (x.b a10 : w10) {
                    a10.a(gVar);
                }
            }
        }

        public void onOpen(g gVar) {
            g unused = MarketConfigDatabase_Impl.this.mDatabase = gVar;
            MarketConfigDatabase_Impl.this.internalInitInvalidationTracker(gVar);
            List<x.b> z10 = MarketConfigDatabase_Impl.this.mCallbacks;
            if (z10 != null) {
                for (x.b c10 : z10) {
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
            HashMap hashMap = new HashMap(47);
            hashMap.put("marketCode", new f.a("marketCode", "TEXT", true, 1, (String) null, 1));
            hashMap.put("languageCode", new f.a("languageCode", "TEXT", true, 2, (String) null, 1));
            hashMap.put("calendar", new f.a("calendar", "TEXT", true, 0, (String) null, 1));
            hashMap.put("dateFormat", new f.a("dateFormat", "TEXT", true, 0, (String) null, 1));
            hashMap.put("emptyListCarouselData", new f.a("emptyListCarouselData", "TEXT", true, 0, (String) null, 1));
            hashMap.put("measurementSystem", new f.a("measurementSystem", "TEXT", true, 0, (String) null, 1));
            hashMap.put("urls", new f.a("urls", "TEXT", true, 0, (String) null, 1));
            hashMap.put("isSignUpHlp", new f.a("isSignUpHlp", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("showEnergyLabelCartList", new f.a("showEnergyLabelCartList", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("mapServiceData", new f.a("mapServiceData", "TEXT", false, 0, (String) null, 1));
            hashMap.put("legalInformationFooter", new f.a("legalInformationFooter", "TEXT", false, 0, (String) null, 1));
            hashMap.put("postalCodePickerConfig", new f.a("postalCodePickerConfig", "TEXT", true, 0, (String) null, 1));
            hashMap.put("searchHints", new f.a("searchHints", "TEXT", true, 0, (String) null, 1));
            hashMap.put("giftCardConfiguration", new f.a("giftCardConfiguration", "TEXT", false, 0, (String) null, 1));
            hashMap.put("trackIcm", new f.a("trackIcm", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("familyAndRegularPriceSameSize", new f.a("familyAndRegularPriceSameSize", "INTEGER", true, 0, "false", 1));
            hashMap.put("assets", new f.a("assets", "TEXT", false, 0, (String) null, 1));
            hashMap.put("symbol", new f.a("symbol", "TEXT", true, 0, (String) null, 1));
            hashMap.put("decimalSymbol", new f.a("decimalSymbol", "TEXT", true, 0, (String) null, 1));
            hashMap.put("code", new f.a("code", "TEXT", true, 0, (String) null, 1));
            hashMap.put("negativeFormat", new f.a("negativeFormat", "TEXT", true, 0, (String) null, 1));
            hashMap.put("positiveFormat", new f.a("positiveFormat", "TEXT", true, 0, (String) null, 1));
            hashMap.put("digitGroupSymbol", new f.a("digitGroupSymbol", "TEXT", true, 0, (String) null, 1));
            hashMap.put("integerSymbol", new f.a("integerSymbol", "TEXT", true, 0, (String) null, 1));
            hashMap.put("nbrFractionDigits", new f.a("nbrFractionDigits", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("showFractionDigitsOnInteger", new f.a("showFractionDigitsOnInteger", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("conversionRate", new f.a("conversionRate", "REAL", false, 0, (String) null, 1));
            hashMap.put("decimalVerticalAlignment", new f.a("decimalVerticalAlignment", "TEXT", false, 0, (String) null, 1));
            hashMap.put("decimalSign", new f.a("decimalSign", "TEXT", false, 0, (String) null, 1));
            hashMap.put("currencyVerticalAlignment", new f.a("currencyVerticalAlignment", "TEXT", false, 0, (String) null, 1));
            hashMap.put("currencyPosition", new f.a("currencyPosition", "TEXT", false, 0, (String) null, 1));
            hashMap.put("analyticsConversionRate", new f.a("analyticsConversionRate", "REAL", false, 0, (String) null, 1));
            hashMap.put("detailedUnitPrice", new f.a("detailedUnitPrice", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("perPiecePrice", new f.a("perPiecePrice", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("showFoodComparisionPrice", new f.a("showFoodComparisionPrice", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("formerPriceCrossOutNLP", new f.a("formerPriceCrossOutNLP", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("formerPriceCrossOutTRO", new f.a("formerPriceCrossOutTRO", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("showNLPDateInterval", new f.a("showNLPDateInterval", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("showVATInformation", new f.a("showVATInformation", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("enablePrf", new f.a("enablePrf", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("showPricesInclVat", new f.a("showPricesInclVat", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("domain", new f.a("domain", "TEXT", true, 0, (String) null, 1));
            hashMap.put("clientId", new f.a("clientId", "TEXT", true, 0, (String) null, 1));
            hashMap.put("parameters", new f.a("parameters", "TEXT", true, 0, (String) null, 1));
            hashMap.put("signUp_domain", new f.a("signUp_domain", "TEXT", true, 0, (String) null, 1));
            hashMap.put("signUp_clientId", new f.a("signUp_clientId", "TEXT", true, 0, (String) null, 1));
            hashMap.put("signUp_parameters", new f.a("signUp_parameters", "TEXT", true, 0, (String) null, 1));
            f fVar = new f("MarketConfig", hashMap, new HashSet(0), new HashSet(0));
            f a10 = f.a(gVar, "MarketConfig");
            if (fVar.equals(a10)) {
                return new A.c(true, (String) null);
            }
            return new A.c(false, "MarketConfig(com.ingka.ikea.appconfig.impl.config.model.MarketConfigEntity).\n Expected:\n" + fVar + "\n Found:\n" + a10);
        }
    }

    public void clearAllTables() {
        super.assertNotMainThread();
        g writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.T("DELETE FROM `MarketConfig`");
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
        return new r(this, new HashMap(0), new HashMap(0), "MarketConfig");
    }

    /* access modifiers changed from: protected */
    public h createOpenHelper(C7011h hVar) {
        return hVar.f44336c.a(h.b.a(hVar.f44334a).d(hVar.f44335b).c(new A(hVar, new a(32), "84c9a66cfa97c65eaa89c393f1be1c0a", "74474e052dea93b0421f1a22723dc18a")).b());
    }

    public List<N4.b> getAutoMigrations(Map<Class<? extends N4.a>, N4.a> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a());
        arrayList.add(new b());
        arrayList.add(new c());
        arrayList.add(new d());
        arrayList.add(new e());
        arrayList.add(new f());
        arrayList.add(new g());
        arrayList.add(new h());
        arrayList.add(new i());
        arrayList.add(new j());
        arrayList.add(new k());
        arrayList.add(new l());
        arrayList.add(new m());
        return arrayList;
    }

    public Set<Class<? extends N4.a>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    /* access modifiers changed from: protected */
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(Kl.a.class, Kl.b.q());
        return hashMap;
    }

    public Kl.a u() {
        Kl.a aVar;
        if (this.f92889u != null) {
            return this.f92889u;
        }
        synchronized (this) {
            try {
                if (this.f92889u == null) {
                    this.f92889u = new Kl.b(this);
                }
                aVar = this.f92889u;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }
}
