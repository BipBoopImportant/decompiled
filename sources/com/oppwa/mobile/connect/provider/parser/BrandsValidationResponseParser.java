package com.oppwa.mobile.connect.provider.parser;

import com.oppwa.mobile.connect.payment.BrandInfo;
import com.oppwa.mobile.connect.payment.CVVMode;
import com.oppwa.mobile.connect.payment.CardBrandInfo;
import com.oppwa.mobile.connect.payment.k;
import com.oppwa.mobile.connect.payment.l;
import com.oppwa.mobile.connect.provider.model.response.BrandValidation;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class BrandsValidationResponseParser extends AbstractResponseParser<Map<String, BrandInfo>, Map<String, BrandValidation>> {
    /* access modifiers changed from: private */
    public static /* synthetic */ BrandInfo a(BrandInfo brandInfo) {
        return brandInfo;
    }

    private CardBrandInfo b(BrandValidation brandValidation) {
        CardBrandInfo cardBrandInfo = new CardBrandInfo();
        Optional.ofNullable(brandValidation.getNumber()).map(new r(this)).ifPresent(new C14178t(cardBrandInfo));
        Optional.ofNullable(brandValidation.getDetection()).map(new r(this)).ifPresent(new C14184u(cardBrandInfo));
        Optional.ofNullable(brandValidation.getLuhn()).ifPresent(new C14185v(cardBrandInfo));
        Optional.ofNullable(brandValidation.getPattern()).map(new C14168i(this)).ifPresent(new C14169j(cardBrandInfo));
        Optional.ofNullable(brandValidation.getCvvLength()).ifPresent(new C14170k(cardBrandInfo));
        Optional.ofNullable(brandValidation.getExpiryDate()).map(new C14171l()).ifPresent(new C14172m(cardBrandInfo));
        Optional.ofNullable(brandValidation.getMobilePhone()).ifPresent(new C14177s(cardBrandInfo));
        Optional ofNullable = Optional.ofNullable(brandValidation.getNoCvv());
        Optional ofNullable2 = Optional.ofNullable(brandValidation.getOptionalCvv());
        if (ofNullable.isPresent() && ((Boolean) ofNullable.get()).booleanValue()) {
            cardBrandInfo.setCvvMode(CVVMode.NONE);
        } else if (!ofNullable2.isPresent() || !((Boolean) ofNullable2.get()).booleanValue()) {
            cardBrandInfo.setCvvMode(CVVMode.REQUIRED);
        } else {
            cardBrandInfo.setCvvMode(CVVMode.OPTIONAL);
        }
        return cardBrandInfo;
    }

    /* access modifiers changed from: protected */
    public Map<String, BrandInfo> a(Map<String, BrandValidation> map) {
        return (Map) map.values().stream().filter(new C14167h()).map(new C14173n(this)).filter(new k()).collect(Collectors.toMap(new l(), new C14174o()));
    }

    /* access modifiers changed from: private */
    public BrandInfo a(BrandValidation brandValidation) {
        String brand = brandValidation.getBrand();
        String render = brandValidation.getRender();
        if (brand == null || render == null) {
            return null;
        }
        BrandInfo brandInfo = new BrandInfo(brand, render);
        Optional.ofNullable(brandValidation.getCustomView()).ifPresent(new C14175p(brandInfo));
        Optional.ofNullable(brandValidation.getLabel()).ifPresent(new C14176q(brandInfo));
        if (brandInfo.isCardBrand()) {
            brandInfo.setCardBrandInfo(b(brandValidation));
        }
        return brandInfo;
    }

    /* access modifiers changed from: private */
    public String a(String str) {
        return str.replace("{", "").replace("}", "").replace("9", "#");
    }

    /* access modifiers changed from: private */
    public String b(String str) {
        return str.replace("/", "");
    }
}
