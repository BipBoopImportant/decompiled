package com.ingka.ikea.core.model.product;

import androidx.annotation.Keep;
import fI.C17220a;
import fI.C17221b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0011\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/ingka/ikea/core/model/product/DisclaimerType;", "", "<init>", "(Ljava/lang/String;I)V", "ENERGY_SHEET_URL", "ENERGY_SHEET_DEEPLINK", "PRICE_DELIVERY", "LAST_CHANCE", "COLOR_INFO", "OFFER_VALIDITY", "INDICATIVE_DISCOUNT", "REGULAR_PRICE", "ENERGY_SYMBOL_URL", "WARNING_CHOKING_HAZARD", "REPAIRABILITY_INDEX", "LOWEST_PREVIOUS_PRICE", "SDM_ADVERTISEMENT", "UNKNOWN", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Keep
public enum DisclaimerType {
    ENERGY_SHEET_URL,
    ENERGY_SHEET_DEEPLINK,
    PRICE_DELIVERY,
    LAST_CHANCE,
    COLOR_INFO,
    OFFER_VALIDITY,
    INDICATIVE_DISCOUNT,
    REGULAR_PRICE,
    ENERGY_SYMBOL_URL,
    WARNING_CHOKING_HAZARD,
    REPAIRABILITY_INDEX,
    LOWEST_PREVIOUS_PRICE,
    SDM_ADVERTISEMENT,
    UNKNOWN;

    static {
        DisclaimerType[] $values;
        $ENTRIES = C17221b.a($values);
    }

    public static C17220a<DisclaimerType> getEntries() {
        return $ENTRIES;
    }
}
