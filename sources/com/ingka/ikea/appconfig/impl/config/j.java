package com.ingka.ikea.appconfig.impl.config;

import N4.a;
import N4.b;
import Q4.g;
import com.ingka.ikea.appconfig.impl.config.MarketConfigDatabase;

final class j extends b {

    /* renamed from: a  reason: collision with root package name */
    private final a f92895a = new MarketConfigDatabase.x();

    public j() {
        super(28, 29);
    }

    public void migrate(g gVar) {
        gVar.T("CREATE TABLE IF NOT EXISTS `_new_MarketConfig` (`marketCode` TEXT NOT NULL, `languageCode` TEXT NOT NULL, `calendar` TEXT NOT NULL, `catalogBase` TEXT NOT NULL, `dateFormat` TEXT NOT NULL, `emptyListCarouselData` TEXT NOT NULL, `popularCategoryId` TEXT NOT NULL, `measurementSystem` TEXT NOT NULL, `urls` TEXT NOT NULL, `isSignUpHlp` INTEGER NOT NULL, `showEnergyLabelCartList` INTEGER NOT NULL, `deliveryCalculationDisclaimers` TEXT NOT NULL, `mapServiceData` TEXT, `legalInformationFooter` TEXT, `ikeaBusiness` INTEGER NOT NULL, `postalCodePickerConfig` TEXT NOT NULL, `searchHints` TEXT NOT NULL, `giftCardConfiguration` TEXT, `trackIcm` INTEGER NOT NULL, `familyAndRegularPriceSameSize` INTEGER NOT NULL DEFAULT false, `symbol` TEXT NOT NULL, `decimalSymbol` TEXT NOT NULL, `code` TEXT NOT NULL, `negativeFormat` TEXT NOT NULL, `positiveFormat` TEXT NOT NULL, `digitGroupSymbol` TEXT NOT NULL, `integerSymbol` TEXT NOT NULL, `nbrFractionDigits` INTEGER NOT NULL, `showFractionDigitsOnInteger` INTEGER NOT NULL, `conversionRate` REAL, `decimalVerticalAlignment` TEXT, `decimalSign` TEXT, `currencyVerticalAlignment` TEXT, `currencyPosition` TEXT, `analyticsConversionRate` REAL, `detailedUnitPrice` INTEGER NOT NULL, `perPiecePrice` INTEGER NOT NULL, `showFoodComparisionPrice` INTEGER NOT NULL, `formerPriceCrossOutNLP` INTEGER NOT NULL, `formerPriceCrossOutTRO` INTEGER NOT NULL, `showNLPDateInterval` INTEGER NOT NULL, `showVATInformation` INTEGER NOT NULL, `enablePrf` INTEGER NOT NULL, `showPricesInclVat` INTEGER NOT NULL, `domain` TEXT NOT NULL, `clientId` TEXT NOT NULL, `parameters` TEXT NOT NULL, `signUp_domain` TEXT NOT NULL, `signUp_clientId` TEXT NOT NULL, `signUp_parameters` TEXT NOT NULL, PRIMARY KEY(`marketCode`, `languageCode`))");
        gVar.T("INSERT INTO `_new_MarketConfig` (`marketCode`,`languageCode`,`calendar`,`catalogBase`,`dateFormat`,`emptyListCarouselData`,`popularCategoryId`,`measurementSystem`,`urls`,`isSignUpHlp`,`showEnergyLabelCartList`,`deliveryCalculationDisclaimers`,`mapServiceData`,`legalInformationFooter`,`ikeaBusiness`,`postalCodePickerConfig`,`searchHints`,`giftCardConfiguration`,`trackIcm`,`familyAndRegularPriceSameSize`,`symbol`,`decimalSymbol`,`code`,`negativeFormat`,`positiveFormat`,`digitGroupSymbol`,`integerSymbol`,`nbrFractionDigits`,`showFractionDigitsOnInteger`,`conversionRate`,`decimalVerticalAlignment`,`decimalSign`,`currencyVerticalAlignment`,`currencyPosition`,`analyticsConversionRate`,`detailedUnitPrice`,`perPiecePrice`,`showFoodComparisionPrice`,`formerPriceCrossOutNLP`,`formerPriceCrossOutTRO`,`showNLPDateInterval`,`showVATInformation`,`enablePrf`,`showPricesInclVat`,`domain`,`clientId`,`parameters`,`signUp_domain`,`signUp_clientId`,`signUp_parameters`) SELECT `marketCode`,`languageCode`,`calendar`,`catalogBase`,`dateFormat`,`emptyListCarouselData`,`popularCategoryId`,`measurementSystem`,`urls`,`isSignUpHlp`,`showEnergyLabelCartList`,`deliveryCalculationDisclaimers`,`mapServiceData`,`legalInformationFooter`,`ikeaBusiness`,`postalCodePickerConfig`,`searchHints`,`giftCardConfiguration`,`trackIcm`,`familyAndRegularPriceSameSize`,`symbol`,`decimalSymbol`,`code`,`negativeFormat`,`positiveFormat`,`digitGroupSymbol`,`integerSymbol`,`nbrFractionDigits`,`showFractionDigitsOnInteger`,`conversionRate`,`decimalVerticalAlignment`,`decimalSign`,`currencyVerticalAlignment`,`currencyPosition`,`analyticsConversionRate`,`detailedUnitPrice`,`perPiecePrice`,`showFoodComparisionPrice`,`formerPriceCrossOutNLP`,`formerPriceCrossOutTRO`,`showNLPDateInterval`,`showVATInformation`,`enablePrf`,`showPricesInclVat`,`domain`,`clientId`,`parameters`,`signUp_domain`,`signUp_clientId`,`signUp_parameters` FROM `MarketConfig`");
        gVar.T("DROP TABLE `MarketConfig`");
        gVar.T("ALTER TABLE `_new_MarketConfig` RENAME TO `MarketConfig`");
        this.f92895a.a(gVar);
    }
}
