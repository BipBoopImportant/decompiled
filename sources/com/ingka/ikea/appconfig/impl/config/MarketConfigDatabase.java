package com.ingka.ikea.appconfig.impl.config;

import YH.X;
import android.content.Context;
import androidx.room.x;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b!\u0018\u0000 \u00072\u00020\u0001:\b\b\t\n\u000b\f\r\u0005\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/ingka/ikea/appconfig/impl/config/MarketConfigDatabase;", "Landroidx/room/x;", "<init>", "()V", "LKl/a;", "u", "()LKl/a;", "a", "s", "z", "w", "y", "t", "x", "v", "appconfig-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class MarketConfigDatabase extends androidx.room.x {

    /* renamed from: a  reason: collision with root package name */
    public static final s f92869a = new s((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static volatile MarketConfigDatabase f92870b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final N4.b f92871c = new j();
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final N4.b f92872d = new k();
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final N4.b f92873e = new l();
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final N4.b f92874f = new m();
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final N4.b f92875g = new n();
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final N4.b f92876h = new o();
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final N4.b f92877i = new p();
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static final N4.b f92878j = new q();
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final N4.b f92879k = new r();
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public static final N4.b f92880l = new a();
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public static final N4.b f92881m = new b();
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public static final N4.b f92882n = new c();
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public static final N4.b f92883o = new d();
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public static final N4.b f92884p = new e();
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public static final N4.b f92885q = new f();
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public static final N4.b f92886r = new g();
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public static final N4.b f92887s = new h();
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public static final N4.b f92888t = new i();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/ingka/ikea/appconfig/impl/config/MarketConfigDatabase$a", "LN4/b;", "LQ4/g;", "database", "LXH/N;", "migrate", "(LQ4/g;)V", "appconfig-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends N4.b {
        a() {
            super(10, 11);
        }

        public void migrate(Q4.g gVar) {
            C17542s.j(gVar, "database");
            gVar.T("ALTER TABLE `MarketConfig` ADD COLUMN `showPricesInclVat` INTEGER NOT NULL DEFAULT 1");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/ingka/ikea/appconfig/impl/config/MarketConfigDatabase$b", "LN4/b;", "LQ4/g;", "database", "LXH/N;", "migrate", "(LQ4/g;)V", "appconfig-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends N4.b {
        b() {
            super(11, 12);
        }

        public void migrate(Q4.g gVar) {
            C17542s.j(gVar, "database");
            gVar.T("ALTER TABLE `MarketConfig` ADD COLUMN `legalInformationFooter` TEXT");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/ingka/ikea/appconfig/impl/config/MarketConfigDatabase$c", "LN4/b;", "LQ4/g;", "database", "LXH/N;", "migrate", "(LQ4/g;)V", "appconfig-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends N4.b {
        c() {
            super(12, 13);
        }

        public void migrate(Q4.g gVar) {
            C17542s.j(gVar, "database");
            gVar.T("ALTER TABLE `MarketConfig` ADD COLUMN `ikeaBusiness` INTEGER NOT NULL DEFAULT 1");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/ingka/ikea/appconfig/impl/config/MarketConfigDatabase$d", "LN4/b;", "LQ4/g;", "database", "LXH/N;", "migrate", "(LQ4/g;)V", "appconfig-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d extends N4.b {
        d() {
            super(13, 14);
        }

        public void migrate(Q4.g gVar) {
            C17542s.j(gVar, "database");
            String a10 = new Ll.f().a(X.j());
            gVar.T("ALTER TABLE `MarketConfig` ADD COLUMN `signUp_domain` TEXT NOT NULL DEFAULT ''");
            gVar.T("ALTER TABLE `MarketConfig` ADD COLUMN `signUp_clientId` TEXT NOT NULL DEFAULT ''");
            gVar.T("ALTER TABLE `MarketConfig` ADD COLUMN `signUp_parameters` TEXT NOT NULL DEFAULT '" + a10 + "'");
            gVar.T("ALTER TABLE `MarketConfig` ADD COLUMN `isSignUpHlp` INTEGER NOT NULL DEFAULT 0");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/ingka/ikea/appconfig/impl/config/MarketConfigDatabase$e", "LN4/b;", "LQ4/g;", "database", "LXH/N;", "migrate", "(LQ4/g;)V", "appconfig-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e extends N4.b {
        e() {
            super(14, 15);
        }

        public void migrate(Q4.g gVar) {
            C17542s.j(gVar, "database");
            gVar.T("UPDATE `MarketConfig` SET `mapServiceData` = null ");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/ingka/ikea/appconfig/impl/config/MarketConfigDatabase$f", "LN4/b;", "LQ4/g;", "database", "LXH/N;", "migrate", "(LQ4/g;)V", "appconfig-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class f extends N4.b {
        f() {
            super(15, 16);
        }

        public void migrate(Q4.g gVar) {
            C17542s.j(gVar, "database");
            gVar.T("CREATE TABLE `MarketConfig_New` (`marketCode` TEXT NOT NULL, `languageCode` TEXT NOT NULL, `calendar` TEXT NOT NULL, `catalogBase` TEXT NOT NULL, `dateFormat` TEXT NOT NULL, `emptyListCarouselData` TEXT NOT NULL, `popularCategoryId` TEXT NOT NULL, `measurementSystem` TEXT NOT NULL, `urls` TEXT NOT NULL, `mCommerceVersion` TEXT NOT NULL DEFAULT 'V2', `shoppingListVersion` TEXT NOT NULL DEFAULT 'V2', `isSignUpHlp` INTEGER NOT NULL, `showEnergyLabelCartList` INTEGER NOT NULL, `deliveryCalculationDisclaimers` TEXT NOT NULL, `privacyConsentRequired` INTEGER NOT NULL, `mapServiceData` TEXT, `legalInformationFooter` TEXT, `ikeaBusiness` INTEGER NOT NULL, `postalCodePickerConfig` TEXT NOT NULL, `symbol` TEXT NOT NULL, `decimalSymbol` TEXT NOT NULL, `code` TEXT NOT NULL, `negativeFormat` TEXT NOT NULL, `positiveFormat` TEXT NOT NULL, `digitGroupSymbol` TEXT NOT NULL, `integerSymbol` TEXT NOT NULL, `nbrFractionDigits` INTEGER NOT NULL, `showFractionDigitsOnInteger` INTEGER NOT NULL, `detailedUnitPrice` INTEGER NOT NULL, `perPiecePrice` INTEGER NOT NULL, `showFoodComparisionPrice` INTEGER NOT NULL, `formerPriceCrossOutNLP` INTEGER NOT NULL, `formerPriceCrossOutTRO` INTEGER NOT NULL, `showNLPDateInterval` INTEGER NOT NULL, `showVATInformation` INTEGER NOT NULL, `enablePrf` INTEGER NOT NULL, `showPricesInclVat` INTEGER NOT NULL, `domain` TEXT NOT NULL, `clientId` TEXT NOT NULL, `parameters` TEXT NOT NULL, `signUp_domain` TEXT NOT NULL, `signUp_clientId` TEXT NOT NULL, `signUp_parameters` TEXT NOT NULL, PRIMARY KEY(`marketCode`, `languageCode`))");
            gVar.T("INSERT INTO MarketConfig_New (marketCode, languageCode, calendar, catalogBase, dateFormat,emptyListCarouselData, popularCategoryId, measurementSystem, urls, mCommerceVersion, shoppingListVersion, isSignUpHlp, showEnergyLabelCartList, deliveryCalculationDisclaimers, privacyConsentRequired, mapServiceData, legalInformationFooter, ikeaBusiness, postalCodePickerConfig, symbol, decimalSymbol, code, negativeFormat, positiveFormat, digitGroupSymbol, integerSymbol, nbrFractionDigits, showFractionDigitsOnInteger, detailedUnitPrice, perPiecePrice, showFoodComparisionPrice, formerPriceCrossOutNLP, formerPriceCrossOutTRO, showNLPDateInterval, showVATInformation, enablePrf, showPricesInclVat, domain, clientId, parameters, signUp_domain, signUp_clientId, signUp_parameters ) SELECT marketCode, languageCode, calendar, catalogBase, dateFormat,emptyListCarouselData, popularCategoryId, measurementSystem, urls, mCommerceVersion, shoppingListVersion, isSignUpHlp, showEnergyLabelCartList, deliveryCalculationDisclaimers, privacyConsentRequired, mapServiceData, legalInformationFooter, ikeaBusiness, '', symbol, decimalSymbol, code, negativeFormat, positiveFormat, digitGroupSymbol, integerSymbol, nbrFractionDigits, showFractionDigitsOnInteger, detailedUnitPrice, perPiecePrice, showFoodComparisionPrice, formerPriceCrossOutNLP, formerPriceCrossOutTRO, showNLPDateInterval, showVATInformation, enablePrf, showPricesInclVat, domain, clientId, parameters, signUp_domain, signUp_clientId, signUp_parameters  FROM MarketConfig");
            gVar.T("DROP TABLE MarketConfig");
            gVar.T("ALTER TABLE MarketConfig_New RENAME TO MarketConfig");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/ingka/ikea/appconfig/impl/config/MarketConfigDatabase$g", "LN4/b;", "LQ4/g;", "database", "LXH/N;", "migrate", "(LQ4/g;)V", "appconfig-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class g extends N4.b {
        g() {
            super(16, 17);
        }

        public void migrate(Q4.g gVar) {
            C17542s.j(gVar, "database");
            gVar.T("ALTER TABLE `MarketConfig` ADD COLUMN `searchHints` TEXT NOT NULL DEFAULT ''");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/ingka/ikea/appconfig/impl/config/MarketConfigDatabase$h", "LN4/b;", "LQ4/g;", "database", "LXH/N;", "migrate", "(LQ4/g;)V", "appconfig-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class h extends N4.b {
        h() {
            super(17, 18);
        }

        public void migrate(Q4.g gVar) {
            C17542s.j(gVar, "database");
            gVar.T("ALTER TABLE `MarketConfig` ADD COLUMN `trackIcm` INTEGER NOT NULL DEFAULT 0");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/ingka/ikea/appconfig/impl/config/MarketConfigDatabase$i", "LN4/b;", "LQ4/g;", "database", "LXH/N;", "migrate", "(LQ4/g;)V", "appconfig-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class i extends N4.b {
        i() {
            super(18, 19);
        }

        public void migrate(Q4.g gVar) {
            C17542s.j(gVar, "database");
            gVar.T("ALTER TABLE `MarketConfig` ADD COLUMN `giftCardConfiguration` TEXT DEFAULT NULL");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/ingka/ikea/appconfig/impl/config/MarketConfigDatabase$j", "LN4/b;", "LQ4/g;", "database", "LXH/N;", "migrate", "(LQ4/g;)V", "appconfig-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class j extends N4.b {
        j() {
            super(1, 2);
        }

        public void migrate(Q4.g gVar) {
            C17542s.j(gVar, "database");
            gVar.T("ALTER TABLE `MarketConfig` ADD COLUMN `mCommerceVersion` TEXT NOT NULL DEFAULT 'V1'");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/ingka/ikea/appconfig/impl/config/MarketConfigDatabase$k", "LN4/b;", "LQ4/g;", "database", "LXH/N;", "migrate", "(LQ4/g;)V", "appconfig-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class k extends N4.b {
        k() {
            super(2, 3);
        }

        public void migrate(Q4.g gVar) {
            C17542s.j(gVar, "database");
            String a10 = new Ll.f().a(X.j());
            gVar.T("ALTER TABLE `MarketConfig` ADD COLUMN `domain` TEXT NOT NULL DEFAULT ''");
            gVar.T("ALTER TABLE `MarketConfig` ADD COLUMN `clientId` TEXT NOT NULL DEFAULT ''");
            gVar.T("ALTER TABLE `MarketConfig` ADD COLUMN `parameters` TEXT NOT NULL DEFAULT '" + a10 + "'");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/ingka/ikea/appconfig/impl/config/MarketConfigDatabase$l", "LN4/b;", "LQ4/g;", "database", "LXH/N;", "migrate", "(LQ4/g;)V", "appconfig-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class l extends N4.b {
        l() {
            super(3, 4);
        }

        public void migrate(Q4.g gVar) {
            C17542s.j(gVar, "database");
            gVar.T("ALTER TABLE `MarketConfig` ADD COLUMN `showEnergyLabelCartList` INTEGER NOT NULL DEFAULT 0");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/ingka/ikea/appconfig/impl/config/MarketConfigDatabase$m", "LN4/b;", "LQ4/g;", "database", "LXH/N;", "migrate", "(LQ4/g;)V", "appconfig-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class m extends N4.b {
        m() {
            super(4, 5);
        }

        public void migrate(Q4.g gVar) {
            C17542s.j(gVar, "database");
            gVar.T("ALTER TABLE `MarketConfig` ADD COLUMN `deliveryCalculationDisclaimers` TEXT NOT NULL DEFAULT ''");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/ingka/ikea/appconfig/impl/config/MarketConfigDatabase$n", "LN4/b;", "LQ4/g;", "database", "LXH/N;", "migrate", "(LQ4/g;)V", "appconfig-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class n extends N4.b {
        n() {
            super(5, 6);
        }

        public void migrate(Q4.g gVar) {
            C17542s.j(gVar, "database");
            gVar.T("ALTER TABLE `MarketConfig` ADD COLUMN `privacyConsentRequired` INTEGER NOT NULL DEFAULT 1");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/ingka/ikea/appconfig/impl/config/MarketConfigDatabase$o", "LN4/b;", "LQ4/g;", "database", "LXH/N;", "migrate", "(LQ4/g;)V", "appconfig-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class o extends N4.b {
        o() {
            super(6, 7);
        }

        public void migrate(Q4.g gVar) {
            C17542s.j(gVar, "database");
            gVar.T("ALTER TABLE `MarketConfig` ADD COLUMN `shoppingListVersion` TEXT NOT NULL DEFAULT 'V1'");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/ingka/ikea/appconfig/impl/config/MarketConfigDatabase$p", "LN4/b;", "LQ4/g;", "database", "LXH/N;", "migrate", "(LQ4/g;)V", "appconfig-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class p extends N4.b {
        p() {
            super(7, 8);
        }

        public void migrate(Q4.g gVar) {
            C17542s.j(gVar, "database");
            gVar.T("UPDATE `MarketConfig` SET `mCommerceVersion` = 'V2'");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/ingka/ikea/appconfig/impl/config/MarketConfigDatabase$q", "LN4/b;", "LQ4/g;", "database", "LXH/N;", "migrate", "(LQ4/g;)V", "appconfig-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class q extends N4.b {
        q() {
            super(8, 9);
        }

        public void migrate(Q4.g gVar) {
            C17542s.j(gVar, "database");
            gVar.T("ALTER TABLE `MarketConfig` ADD COLUMN `popularCategoryId` TEXT NOT NULL DEFAULT 'home-popular'");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/ingka/ikea/appconfig/impl/config/MarketConfigDatabase$r", "LN4/b;", "LQ4/g;", "database", "LXH/N;", "migrate", "(LQ4/g;)V", "appconfig-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class r extends N4.b {
        r() {
            super(9, 10);
        }

        public void migrate(Q4.g gVar) {
            C17542s.j(gVar, "database");
            gVar.T("ALTER TABLE `MarketConfig` ADD COLUMN `mapServiceData` TEXT");
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b;\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR \u0010\n\u001a\u00020\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u000e\u0010\u0003\u001a\u0004\b\f\u0010\rR \u0010\u000f\u001a\u00020\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u000b\u0012\u0004\b\u0011\u0010\u0003\u001a\u0004\b\u0010\u0010\rR \u0010\u0012\u001a\u00020\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u000b\u0012\u0004\b\u0014\u0010\u0003\u001a\u0004\b\u0013\u0010\rR \u0010\u0015\u001a\u00020\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u000b\u0012\u0004\b\u0017\u0010\u0003\u001a\u0004\b\u0016\u0010\rR \u0010\u0018\u001a\u00020\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u000b\u0012\u0004\b\u001a\u0010\u0003\u001a\u0004\b\u0019\u0010\rR \u0010\u001b\u001a\u00020\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u000b\u0012\u0004\b\u001d\u0010\u0003\u001a\u0004\b\u001c\u0010\rR \u0010\u001e\u001a\u00020\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u000b\u0012\u0004\b \u0010\u0003\u001a\u0004\b\u001f\u0010\rR \u0010!\u001a\u00020\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b!\u0010\u000b\u0012\u0004\b#\u0010\u0003\u001a\u0004\b\"\u0010\rR \u0010$\u001a\u00020\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b$\u0010\u000b\u0012\u0004\b&\u0010\u0003\u001a\u0004\b%\u0010\rR \u0010'\u001a\u00020\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b'\u0010\u000b\u0012\u0004\b)\u0010\u0003\u001a\u0004\b(\u0010\rR \u0010*\u001a\u00020\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b*\u0010\u000b\u0012\u0004\b,\u0010\u0003\u001a\u0004\b+\u0010\rR \u0010-\u001a\u00020\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b-\u0010\u000b\u0012\u0004\b/\u0010\u0003\u001a\u0004\b.\u0010\rR \u00100\u001a\u00020\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b0\u0010\u000b\u0012\u0004\b2\u0010\u0003\u001a\u0004\b1\u0010\rR \u00103\u001a\u00020\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b3\u0010\u000b\u0012\u0004\b5\u0010\u0003\u001a\u0004\b4\u0010\rR \u00106\u001a\u00020\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b6\u0010\u000b\u0012\u0004\b8\u0010\u0003\u001a\u0004\b7\u0010\rR \u00109\u001a\u00020\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b9\u0010\u000b\u0012\u0004\b;\u0010\u0003\u001a\u0004\b:\u0010\rR \u0010<\u001a\u00020\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b<\u0010\u000b\u0012\u0004\b>\u0010\u0003\u001a\u0004\b=\u0010\rR \u0010?\u001a\u00020\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b?\u0010\u000b\u0012\u0004\bA\u0010\u0003\u001a\u0004\b@\u0010\rR\u0018\u0010B\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bB\u0010C¨\u0006D"}, d2 = {"Lcom/ingka/ikea/appconfig/impl/config/MarketConfigDatabase$s;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/ingka/ikea/appconfig/impl/config/MarketConfigDatabase;", "a", "(Landroid/content/Context;)Lcom/ingka/ikea/appconfig/impl/config/MarketConfigDatabase;", "LN4/b;", "MIGRATION_1_2", "LN4/b;", "k", "()LN4/b;", "getMIGRATION_1_2$annotations", "MIGRATION_2_3", "l", "getMIGRATION_2_3$annotations", "MIGRATION_3_4", "m", "getMIGRATION_3_4$annotations", "MIGRATION_4_5", "n", "getMIGRATION_4_5$annotations", "MIGRATION_5_6", "o", "getMIGRATION_5_6$annotations", "MIGRATION_6_7", "p", "getMIGRATION_6_7$annotations", "MIGRATION_7_8", "q", "getMIGRATION_7_8$annotations", "MIGRATION_8_9", "r", "getMIGRATION_8_9$annotations", "MIGRATION_9_10", "s", "getMIGRATION_9_10$annotations", "MIGRATION_10_11", "b", "getMIGRATION_10_11$annotations", "MIGRATION_11_12", "c", "getMIGRATION_11_12$annotations", "MIGRATION_12_13", "d", "getMIGRATION_12_13$annotations", "MIGRATION_13_14", "e", "getMIGRATION_13_14$annotations", "MIGRATION_14_15", "f", "getMIGRATION_14_15$annotations", "MIGRATION_15_16", "g", "getMIGRATION_15_16$annotations", "MIGRATION_16_17", "h", "getMIGRATION_16_17$annotations", "MIGRATION_17_18", "i", "getMIGRATION_17_18$annotations", "MIGRATION_18_19", "j", "getMIGRATION_18_19$annotations", "INSTANCE", "Lcom/ingka/ikea/appconfig/impl/config/MarketConfigDatabase;", "appconfig-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class s {
        public /* synthetic */ s(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final MarketConfigDatabase a(Context context) {
            C17542s.j(context, "context");
            MarketConfigDatabase a10 = MarketConfigDatabase.f92870b;
            if (a10 == null) {
                synchronized (this) {
                    Context applicationContext = context.getApplicationContext();
                    C17542s.i(applicationContext, "getApplicationContext(...)");
                    x.a<MarketConfigDatabase> a11 = androidx.room.w.a(applicationContext, MarketConfigDatabase.class, "global_config_database");
                    s sVar = MarketConfigDatabase.f92869a;
                    a10 = a11.b(sVar.k()).b(sVar.l()).b(sVar.m()).b(sVar.n()).b(sVar.o()).b(sVar.p()).b(sVar.q()).b(sVar.r()).b(sVar.s()).b(sVar.b()).b(sVar.c()).b(sVar.d()).b(sVar.e()).b(sVar.f()).b(sVar.g()).b(sVar.h()).b(sVar.i()).b(sVar.j()).e();
                    MarketConfigDatabase.f92870b = a10;
                }
            }
            return a10;
        }

        public final N4.b b() {
            return MarketConfigDatabase.f92880l;
        }

        public final N4.b c() {
            return MarketConfigDatabase.f92881m;
        }

        public final N4.b d() {
            return MarketConfigDatabase.f92882n;
        }

        public final N4.b e() {
            return MarketConfigDatabase.f92883o;
        }

        public final N4.b f() {
            return MarketConfigDatabase.f92884p;
        }

        public final N4.b g() {
            return MarketConfigDatabase.f92885q;
        }

        public final N4.b h() {
            return MarketConfigDatabase.f92886r;
        }

        public final N4.b i() {
            return MarketConfigDatabase.f92887s;
        }

        public final N4.b j() {
            return MarketConfigDatabase.f92888t;
        }

        public final N4.b k() {
            return MarketConfigDatabase.f92871c;
        }

        public final N4.b l() {
            return MarketConfigDatabase.f92872d;
        }

        public final N4.b m() {
            return MarketConfigDatabase.f92873e;
        }

        public final N4.b n() {
            return MarketConfigDatabase.f92874f;
        }

        public final N4.b o() {
            return MarketConfigDatabase.f92875g;
        }

        public final N4.b p() {
            return MarketConfigDatabase.f92876h;
        }

        public final N4.b q() {
            return MarketConfigDatabase.f92877i;
        }

        public final N4.b r() {
            return MarketConfigDatabase.f92878j;
        }

        public final N4.b s() {
            return MarketConfigDatabase.f92879k;
        }

        private s() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ingka/ikea/appconfig/impl/config/MarketConfigDatabase$t;", "LN4/a;", "<init>", "()V", "appconfig-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class t implements N4.a {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ingka/ikea/appconfig/impl/config/MarketConfigDatabase$u;", "LN4/a;", "<init>", "()V", "appconfig-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class u implements N4.a {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ingka/ikea/appconfig/impl/config/MarketConfigDatabase$v;", "LN4/a;", "<init>", "()V", "appconfig-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class v implements N4.a {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ingka/ikea/appconfig/impl/config/MarketConfigDatabase$w;", "LN4/a;", "<init>", "()V", "appconfig-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class w implements N4.a {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ingka/ikea/appconfig/impl/config/MarketConfigDatabase$x;", "LN4/a;", "<init>", "()V", "appconfig-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class x implements N4.a {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ingka/ikea/appconfig/impl/config/MarketConfigDatabase$y;", "LN4/a;", "<init>", "()V", "appconfig-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class y implements N4.a {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ingka/ikea/appconfig/impl/config/MarketConfigDatabase$z;", "LN4/a;", "<init>", "()V", "appconfig-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class z implements N4.a {
    }

    public abstract Kl.a u();
}
