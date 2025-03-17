package com.ingka.ikea.core.remotemodel.product;

import YH.C16877v;
import com.ingka.ikea.core.model.KeyBenefits;
import com.ingka.ikea.core.model.Media;
import com.ingka.ikea.core.model.product.Badge;
import com.ingka.ikea.core.model.product.Disclaimer;
import com.ingka.ikea.core.model.product.GuaranteeInfo;
import com.ingka.ikea.core.model.product.Measurements;
import com.ingka.ikea.core.model.product.MoreInfo;
import com.ingka.ikea.core.model.product.PackageInfoData;
import com.ingka.ikea.core.model.product.ProductItem;
import com.ingka.ikea.core.model.product.ProductLarge;
import com.ingka.ikea.core.model.product.Warning;
import com.ingka.ikea.core.remotemodel.ImageRemoteLegacy;
import com.ingka.ikea.core.remotemodel.ImageRemoteLegacy$$serializer;
import com.ingka.ikea.core.remotemodel.KeyBenefitsRemote;
import com.ingka.ikea.core.remotemodel.KeyBenefitsRemote$$serializer;
import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.E0;
import jK.M;
import jK.T0;
import jK.X;
import jK.Y0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import pp.C11768b;
import rp.C11840b;

@p
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\bk\b\b\u0018\u0000 ¬\u00012\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003­\u0001GB±\u0002\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0011\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0011\u0012\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0011\u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\b\u0010%\u001a\u0004\u0018\u00010$\u0012\b\u0010'\u001a\u0004\u0018\u00010&\u0012\b\u0010)\u001a\u0004\u0018\u00010(\u0012\b\u0010+\u001a\u0004\u0018\u00010*\u0012\b\u0010,\u001a\u0004\u0018\u00010(\u0012\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\u0011\u0012\b\u0010/\u001a\u0004\u0018\u00010.¢\u0006\u0004\b0\u00101J\u000f\u00103\u001a\u000202H\u0002¢\u0006\u0004\b3\u00104J'\u0010;\u001a\u00020:2\u0006\u00105\u001a\u00020\u00002\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u000208H\u0001¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u0002H\u0016¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b?\u0010@J\u0010\u0010A\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\bA\u0010BJ\u001a\u0010E\u001a\u00020\f2\b\u0010D\u001a\u0004\u0018\u00010CHÖ\u0003¢\u0006\u0004\bE\u0010FR \u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\bG\u0010H\u0012\u0004\bJ\u0010K\u001a\u0004\bI\u0010@R \u0010\u0007\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b3\u0010H\u0012\u0004\bM\u0010K\u001a\u0004\bL\u0010@R\"\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b=\u0010H\u0012\u0004\bO\u0010K\u001a\u0004\bN\u0010@R\"\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b;\u0010H\u0012\u0004\bQ\u0010K\u001a\u0004\bP\u0010@R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0004¢\u0006\u0012\n\u0004\bR\u0010S\u0012\u0004\bV\u0010K\u001a\u0004\bT\u0010UR \u0010\r\u001a\u00020\f8\u0006X\u0004¢\u0006\u0012\n\u0004\bW\u0010X\u0012\u0004\bZ\u0010K\u001a\u0004\b\r\u0010YR\"\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b[\u0010H\u0012\u0004\b]\u0010K\u001a\u0004\b\\\u0010@R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0004¢\u0006\u0012\n\u0004\b^\u0010_\u0012\u0004\bb\u0010K\u001a\u0004\b`\u0010aR&\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0000X\u0004¢\u0006\u0012\n\u0004\bc\u0010d\u0012\u0004\bg\u0010K\u001a\u0004\be\u0010fR\"\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0000X\u0004¢\u0006\u0012\n\u0004\bh\u0010i\u0012\u0004\bl\u0010K\u001a\u0004\bj\u0010kR \u0010\u0017\u001a\u00020\u00168\u0000X\u0004¢\u0006\u0012\n\u0004\bm\u0010n\u0012\u0004\bq\u0010K\u001a\u0004\bo\u0010pR \u0010\u0019\u001a\u00020\u00188\u0000X\u0004¢\u0006\u0012\n\u0004\br\u0010s\u0012\u0004\bv\u0010K\u001a\u0004\bt\u0010uR\"\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0000X\u0004¢\u0006\u0012\n\u0004\bw\u0010x\u0012\u0004\b{\u0010K\u001a\u0004\by\u0010zR!\u0010\u001c\u001a\u00020\u001b8\u0000X\u0004¢\u0006\u0013\n\u0004\b|\u0010}\u0012\u0005\b\u0001\u0010K\u001a\u0004\b~\u0010R)\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00118\u0000X\u0004¢\u0006\u0015\n\u0005\b\u0001\u0010d\u0012\u0005\b\u0001\u0010K\u001a\u0005\b\u0001\u0010fR%\u0010\u001f\u001a\u0004\u0018\u00010\u00058\u0000X\u0004¢\u0006\u0015\n\u0005\b\u0001\u0010H\u0012\u0005\b\u0001\u0010K\u001a\u0005\b\u0001\u0010@R+\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00118\u0006X\u0004¢\u0006\u0015\n\u0005\b\u0001\u0010d\u0012\u0005\b\u0001\u0010K\u001a\u0005\b\u0001\u0010fR+\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00118\u0006X\u0004¢\u0006\u0015\n\u0005\b\u0001\u0010d\u0012\u0005\b\u0001\u0010K\u001a\u0005\b\u0001\u0010fR'\u0010#\u001a\u0004\u0018\u00010\"8\u0000X\u0004¢\u0006\u0017\n\u0006\b\u0001\u0010\u0001\u0012\u0005\b\u0001\u0010K\u001a\u0006\b\u0001\u0010\u0001R'\u0010%\u001a\u0004\u0018\u00010$8\u0000X\u0004¢\u0006\u0017\n\u0006\b\u0001\u0010\u0001\u0012\u0005\b\u0001\u0010K\u001a\u0006\b\u0001\u0010\u0001R'\u0010'\u001a\u0004\u0018\u00010&8\u0000X\u0004¢\u0006\u0017\n\u0006\b\u0001\u0010\u0001\u0012\u0005\b\u0001\u0010K\u001a\u0006\b\u0001\u0010\u0001R'\u0010)\u001a\u0004\u0018\u00010(8\u0000X\u0004¢\u0006\u0017\n\u0006\b\u0001\u0010\u0001\u0012\u0005\b \u0001\u0010K\u001a\u0006\b\u0001\u0010\u0001R'\u0010+\u001a\u0004\u0018\u00010*8\u0006X\u0004¢\u0006\u0017\n\u0006\b¡\u0001\u0010¢\u0001\u0012\u0005\b¥\u0001\u0010K\u001a\u0006\b£\u0001\u0010¤\u0001R'\u0010,\u001a\u0004\u0018\u00010(8\u0006X\u0004¢\u0006\u0017\n\u0006\b¦\u0001\u0010\u0001\u0012\u0005\b¨\u0001\u0010K\u001a\u0006\b§\u0001\u0010\u0001R+\u0010-\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\u00118\u0006X\u0004¢\u0006\u0015\n\u0005\b©\u0001\u0010d\u0012\u0005\b«\u0001\u0010K\u001a\u0005\bª\u0001\u0010f¨\u0006®\u0001"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/product/ProductDetailsRemote;", "Lpp/b;", "Lcom/ingka/ikea/core/model/product/ProductLarge;", "", "seen0", "", "itemNo", "itemType", "title", "description", "Lcom/ingka/ikea/core/remotemodel/product/BadgeRemote;", "productBadge", "", "isOnlineSellable", "availabilityDisclaimer", "Lcom/ingka/ikea/core/remotemodel/product/PricePackageRemote;", "pricePackage", "", "Lcom/ingka/ikea/core/remotemodel/ImageRemoteLegacy;", "images", "", "avgRating", "Lcom/ingka/ikea/core/remotemodel/product/PackageInfoRemote;", "packageInfoData", "Lcom/ingka/ikea/core/remotemodel/product/MeasurementsRemote;", "measurements", "reviewCount", "Lcom/ingka/ikea/core/remotemodel/product/MoreInfoRemote;", "moreInfo", "Lcom/ingka/ikea/core/remotemodel/product/WarningRemote;", "warnings", "lastChanceLabel", "headerTexts", "footerTexts", "Lcom/ingka/ikea/core/remotemodel/product/GuaranteeInfoRemote;", "guaranteeInfo", "Lcom/ingka/ikea/core/remotemodel/KeyBenefitsRemote;", "keyBenefits", "Lcom/ingka/ikea/core/remotemodel/product/ArModelRemote;", "arModel", "Lcom/ingka/ikea/core/remotemodel/product/DisclaimerRemote;", "repairability", "Lcom/ingka/ikea/core/remotemodel/product/HighlightRemote;", "productHighlight", "energyClassDisclaimer", "productDisclaimers", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/core/remotemodel/product/BadgeRemote;ZLjava/lang/String;Lcom/ingka/ikea/core/remotemodel/product/PricePackageRemote;Ljava/util/List;Ljava/lang/Float;Lcom/ingka/ikea/core/remotemodel/product/PackageInfoRemote;Lcom/ingka/ikea/core/remotemodel/product/MeasurementsRemote;Ljava/lang/Integer;Lcom/ingka/ikea/core/remotemodel/product/MoreInfoRemote;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/ingka/ikea/core/remotemodel/product/GuaranteeInfoRemote;Lcom/ingka/ikea/core/remotemodel/KeyBenefitsRemote;Lcom/ingka/ikea/core/remotemodel/product/ArModelRemote;Lcom/ingka/ikea/core/remotemodel/product/DisclaimerRemote;Lcom/ingka/ikea/core/remotemodel/product/HighlightRemote;Lcom/ingka/ikea/core/remotemodel/product/DisclaimerRemote;Ljava/util/List;LjK/T0;)V", "Lcom/ingka/ikea/core/model/product/ProductItem$ProductInfo;", "b", "()Lcom/ingka/ikea/core/model/product/ProductItem$ProductInfo;", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "d", "(Lcom/ingka/ikea/core/remotemodel/product/ProductDetailsRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "c", "()Lcom/ingka/ikea/core/model/product/ProductLarge;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getItemNo", "getItemNo$annotations", "()V", "getItemType", "getItemType$annotations", "getTitle", "getTitle$annotations", "getDescription", "getDescription$annotations", "e", "Lcom/ingka/ikea/core/remotemodel/product/BadgeRemote;", "getProductBadge", "()Lcom/ingka/ikea/core/remotemodel/product/BadgeRemote;", "getProductBadge$annotations", "f", "Z", "()Z", "isOnlineSellable$annotations", "g", "getAvailabilityDisclaimer", "getAvailabilityDisclaimer$annotations", "h", "Lcom/ingka/ikea/core/remotemodel/product/PricePackageRemote;", "getPricePackage", "()Lcom/ingka/ikea/core/remotemodel/product/PricePackageRemote;", "getPricePackage$annotations", "i", "Ljava/util/List;", "getImages$remote_model_release", "()Ljava/util/List;", "getImages$remote_model_release$annotations", "j", "Ljava/lang/Float;", "getAvgRating$remote_model_release", "()Ljava/lang/Float;", "getAvgRating$remote_model_release$annotations", "k", "Lcom/ingka/ikea/core/remotemodel/product/PackageInfoRemote;", "getPackageInfoData$remote_model_release", "()Lcom/ingka/ikea/core/remotemodel/product/PackageInfoRemote;", "getPackageInfoData$remote_model_release$annotations", "l", "Lcom/ingka/ikea/core/remotemodel/product/MeasurementsRemote;", "getMeasurements$remote_model_release", "()Lcom/ingka/ikea/core/remotemodel/product/MeasurementsRemote;", "getMeasurements$remote_model_release$annotations", "m", "Ljava/lang/Integer;", "getReviewCount$remote_model_release", "()Ljava/lang/Integer;", "getReviewCount$remote_model_release$annotations", "n", "Lcom/ingka/ikea/core/remotemodel/product/MoreInfoRemote;", "getMoreInfo$remote_model_release", "()Lcom/ingka/ikea/core/remotemodel/product/MoreInfoRemote;", "getMoreInfo$remote_model_release$annotations", "o", "getWarnings$remote_model_release", "getWarnings$remote_model_release$annotations", "p", "getLastChanceLabel$remote_model_release", "getLastChanceLabel$remote_model_release$annotations", "q", "getHeaderTexts", "getHeaderTexts$annotations", "r", "getFooterTexts", "getFooterTexts$annotations", "s", "Lcom/ingka/ikea/core/remotemodel/product/GuaranteeInfoRemote;", "getGuaranteeInfo$remote_model_release", "()Lcom/ingka/ikea/core/remotemodel/product/GuaranteeInfoRemote;", "getGuaranteeInfo$remote_model_release$annotations", "t", "Lcom/ingka/ikea/core/remotemodel/KeyBenefitsRemote;", "getKeyBenefits$remote_model_release", "()Lcom/ingka/ikea/core/remotemodel/KeyBenefitsRemote;", "getKeyBenefits$remote_model_release$annotations", "u", "Lcom/ingka/ikea/core/remotemodel/product/ArModelRemote;", "getArModel$remote_model_release", "()Lcom/ingka/ikea/core/remotemodel/product/ArModelRemote;", "getArModel$remote_model_release$annotations", "v", "Lcom/ingka/ikea/core/remotemodel/product/DisclaimerRemote;", "getRepairability$remote_model_release", "()Lcom/ingka/ikea/core/remotemodel/product/DisclaimerRemote;", "getRepairability$remote_model_release$annotations", "w", "Lcom/ingka/ikea/core/remotemodel/product/HighlightRemote;", "getProductHighlight", "()Lcom/ingka/ikea/core/remotemodel/product/HighlightRemote;", "getProductHighlight$annotations", "x", "getEnergyClassDisclaimer", "getEnergyClassDisclaimer$annotations", "y", "getProductDisclaimers", "getProductDisclaimers$annotations", "Companion", "$serializer", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ProductDetailsRemote implements C11768b<ProductLarge> {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: z  reason: collision with root package name */
    public static final KSerializer<Object>[] f95361z;

    /* renamed from: a  reason: collision with root package name */
    private final String f95362a;

    /* renamed from: b  reason: collision with root package name */
    private final String f95363b;

    /* renamed from: c  reason: collision with root package name */
    private final String f95364c;

    /* renamed from: d  reason: collision with root package name */
    private final String f95365d;

    /* renamed from: e  reason: collision with root package name */
    private final BadgeRemote f95366e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f95367f;

    /* renamed from: g  reason: collision with root package name */
    private final String f95368g;

    /* renamed from: h  reason: collision with root package name */
    private final PricePackageRemote f95369h;

    /* renamed from: i  reason: collision with root package name */
    private final List<ImageRemoteLegacy> f95370i;

    /* renamed from: j  reason: collision with root package name */
    private final Float f95371j;

    /* renamed from: k  reason: collision with root package name */
    private final PackageInfoRemote f95372k;

    /* renamed from: l  reason: collision with root package name */
    private final MeasurementsRemote f95373l;

    /* renamed from: m  reason: collision with root package name */
    private final Integer f95374m;

    /* renamed from: n  reason: collision with root package name */
    private final MoreInfoRemote f95375n;

    /* renamed from: o  reason: collision with root package name */
    private final List<WarningRemote> f95376o;

    /* renamed from: p  reason: collision with root package name */
    private final String f95377p;

    /* renamed from: q  reason: collision with root package name */
    private final List<String> f95378q;

    /* renamed from: r  reason: collision with root package name */
    private final List<String> f95379r;

    /* renamed from: s  reason: collision with root package name */
    private final GuaranteeInfoRemote f95380s;

    /* renamed from: t  reason: collision with root package name */
    private final KeyBenefitsRemote f95381t;

    /* renamed from: u  reason: collision with root package name */
    private final ArModelRemote f95382u;

    /* renamed from: v  reason: collision with root package name */
    private final DisclaimerRemote f95383v;

    /* renamed from: w  reason: collision with root package name */
    private final HighlightRemote f95384w;

    /* renamed from: x  reason: collision with root package name */
    private final DisclaimerRemote f95385x;

    /* renamed from: y  reason: collision with root package name */
    private final List<DisclaimerRemote> f95386y;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/product/ProductDetailsRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/remotemodel/product/ProductDetailsRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<ProductDetailsRemote> serializer() {
            return ProductDetailsRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        C17451f fVar = new C17451f(ImageRemoteLegacy$$serializer.INSTANCE);
        C17451f fVar2 = new C17451f(WarningRemote$$serializer.INSTANCE);
        Y0 y02 = Y0.f144077a;
        f95361z = new KSerializer[]{null, null, null, null, null, null, null, null, fVar, null, null, null, null, null, fVar2, null, new C17451f(y02), new C17451f(y02), null, null, null, null, null, null, new C17451f(DisclaimerRemote$$serializer.INSTANCE)};
    }

    public /* synthetic */ ProductDetailsRemote(int i10, String str, String str2, String str3, String str4, BadgeRemote badgeRemote, boolean z10, String str5, PricePackageRemote pricePackageRemote, List list, Float f10, PackageInfoRemote packageInfoRemote, MeasurementsRemote measurementsRemote, Integer num, MoreInfoRemote moreInfoRemote, List list2, String str6, List list3, List list4, GuaranteeInfoRemote guaranteeInfoRemote, KeyBenefitsRemote keyBenefitsRemote, ArModelRemote arModelRemote, DisclaimerRemote disclaimerRemote, HighlightRemote highlightRemote, DisclaimerRemote disclaimerRemote2, List list5, T0 t02) {
        if (33554431 != (i10 & 33554431)) {
            E0.b(i10, 33554431, ProductDetailsRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f95362a = str;
        this.f95363b = str2;
        this.f95364c = str3;
        this.f95365d = str4;
        this.f95366e = badgeRemote;
        this.f95367f = z10;
        this.f95368g = str5;
        this.f95369h = pricePackageRemote;
        this.f95370i = list;
        this.f95371j = f10;
        this.f95372k = packageInfoRemote;
        this.f95373l = measurementsRemote;
        this.f95374m = num;
        this.f95375n = moreInfoRemote;
        this.f95376o = list2;
        this.f95377p = str6;
        this.f95378q = list3;
        this.f95379r = list4;
        this.f95380s = guaranteeInfoRemote;
        this.f95381t = keyBenefitsRemote;
        this.f95382u = arModelRemote;
        this.f95383v = disclaimerRemote;
        this.f95384w = highlightRemote;
        this.f95385x = disclaimerRemote2;
        this.f95386y = list5;
    }

    private final ProductItem.ProductInfo b() {
        PricePackageRemote pricePackageRemote = this.f95369h;
        if (pricePackageRemote != null) {
            ProductItem.Price g10 = pricePackageRemote.g();
            HighlightRemote highlightRemote = this.f95384w;
            ProductItem.ProductItemHighlight b10 = highlightRemote != null ? highlightRemote.b() : null;
            String str = this.f95364c;
            if (str != null) {
                String str2 = this.f95365d;
                if (str2 != null) {
                    ProductItem.EnergyClassDisclaimer a10 = C11840b.a(this.f95385x);
                    List<String> b11 = this.f95369h.b();
                    if (b11 == null) {
                        b11 = C16877v.n();
                    }
                    return new ProductItem.ProductInfo(b10, this.f95369h.d(), str, str2, g10, a10, b11, this.f95368g);
                }
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final /* synthetic */ void d(ProductDetailsRemote productDetailsRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f95361z;
        dVar.y(serialDescriptor, 0, productDetailsRemote.f95362a);
        dVar.y(serialDescriptor, 1, productDetailsRemote.f95363b);
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 2, y02, productDetailsRemote.f95364c);
        dVar.B(serialDescriptor, 3, y02, productDetailsRemote.f95365d);
        dVar.B(serialDescriptor, 4, BadgeRemote$$serializer.INSTANCE, productDetailsRemote.f95366e);
        dVar.x(serialDescriptor, 5, productDetailsRemote.f95367f);
        dVar.B(serialDescriptor, 6, y02, productDetailsRemote.f95368g);
        dVar.B(serialDescriptor, 7, PricePackageRemote$$serializer.INSTANCE, productDetailsRemote.f95369h);
        dVar.i(serialDescriptor, 8, kSerializerArr[8], productDetailsRemote.f95370i);
        dVar.B(serialDescriptor, 9, M.f144051a, productDetailsRemote.f95371j);
        dVar.i(serialDescriptor, 10, PackageInfoRemote$$serializer.INSTANCE, productDetailsRemote.f95372k);
        dVar.i(serialDescriptor, 11, MeasurementsRemote$$serializer.INSTANCE, productDetailsRemote.f95373l);
        dVar.B(serialDescriptor, 12, X.f144073a, productDetailsRemote.f95374m);
        dVar.i(serialDescriptor, 13, MoreInfoRemote$$serializer.INSTANCE, productDetailsRemote.f95375n);
        dVar.i(serialDescriptor, 14, kSerializerArr[14], productDetailsRemote.f95376o);
        dVar.B(serialDescriptor, 15, y02, productDetailsRemote.f95377p);
        dVar.B(serialDescriptor, 16, kSerializerArr[16], productDetailsRemote.f95378q);
        dVar.B(serialDescriptor, 17, kSerializerArr[17], productDetailsRemote.f95379r);
        dVar.B(serialDescriptor, 18, GuaranteeInfoRemote$$serializer.INSTANCE, productDetailsRemote.f95380s);
        dVar.B(serialDescriptor, 19, KeyBenefitsRemote$$serializer.INSTANCE, productDetailsRemote.f95381t);
        dVar.B(serialDescriptor, 20, ArModelRemote$$serializer.INSTANCE, productDetailsRemote.f95382u);
        DisclaimerRemote$$serializer disclaimerRemote$$serializer = DisclaimerRemote$$serializer.INSTANCE;
        dVar.B(serialDescriptor, 21, disclaimerRemote$$serializer, productDetailsRemote.f95383v);
        dVar.B(serialDescriptor, 22, HighlightRemote$$serializer.INSTANCE, productDetailsRemote.f95384w);
        dVar.B(serialDescriptor, 23, disclaimerRemote$$serializer, productDetailsRemote.f95385x);
        dVar.B(serialDescriptor, 24, kSerializerArr[24], productDetailsRemote.f95386y);
    }

    public ProductLarge c() {
        String str = this.f95362a;
        String str2 = this.f95363b;
        ProductItem.ProductInfo b10 = b();
        BadgeRemote badgeRemote = this.f95366e;
        Badge a10 = badgeRemote != null ? badgeRemote.a() : null;
        boolean z10 = this.f95367f;
        ArrayList arrayList = new ArrayList();
        for (ImageRemoteLegacy c10 : this.f95370i) {
            Media c11 = c10.c();
            if (c11 != null) {
                arrayList.add(c11);
            }
        }
        Float f10 = this.f95371j;
        PackageInfoData a11 = this.f95372k.a();
        Integer num = this.f95374m;
        int intValue = num != null ? num.intValue() : 0;
        Measurements a12 = this.f95373l.a();
        MoreInfo b11 = this.f95375n.b();
        ArrayList arrayList2 = new ArrayList();
        for (WarningRemote a13 : this.f95376o) {
            Warning a14 = a13.a();
            if (a14 != null) {
                arrayList2.add(a14);
            }
        }
        List<String> list = this.f95378q;
        List<String> list2 = this.f95379r;
        GuaranteeInfoRemote guaranteeInfoRemote = this.f95380s;
        GuaranteeInfo a15 = guaranteeInfoRemote != null ? guaranteeInfoRemote.a() : null;
        KeyBenefitsRemote keyBenefitsRemote = this.f95381t;
        KeyBenefits b12 = keyBenefitsRemote != null ? keyBenefitsRemote.b() : null;
        ArModelRemote arModelRemote = this.f95382u;
        String a16 = arModelRemote != null ? arModelRemote.a() : null;
        DisclaimerRemote disclaimerRemote = this.f95383v;
        Disclaimer d10 = disclaimerRemote != null ? disclaimerRemote.d() : null;
        DisclaimerRemote disclaimerRemote2 = this.f95385x;
        return new ProductLarge(str, str2, b10, a10, z10, arrayList, f10, a11, intValue, a12, b11, arrayList2, list, list2, a15, b12, a16, d10, disclaimerRemote2 != null ? disclaimerRemote2.d() : null, C11840b.b(this.f95386y));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductDetailsRemote)) {
            return false;
        }
        ProductDetailsRemote productDetailsRemote = (ProductDetailsRemote) obj;
        return C17542s.e(this.f95362a, productDetailsRemote.f95362a) && C17542s.e(this.f95363b, productDetailsRemote.f95363b) && C17542s.e(this.f95364c, productDetailsRemote.f95364c) && C17542s.e(this.f95365d, productDetailsRemote.f95365d) && C17542s.e(this.f95366e, productDetailsRemote.f95366e) && this.f95367f == productDetailsRemote.f95367f && C17542s.e(this.f95368g, productDetailsRemote.f95368g) && C17542s.e(this.f95369h, productDetailsRemote.f95369h) && C17542s.e(this.f95370i, productDetailsRemote.f95370i) && C17542s.e(this.f95371j, productDetailsRemote.f95371j) && C17542s.e(this.f95372k, productDetailsRemote.f95372k) && C17542s.e(this.f95373l, productDetailsRemote.f95373l) && C17542s.e(this.f95374m, productDetailsRemote.f95374m) && C17542s.e(this.f95375n, productDetailsRemote.f95375n) && C17542s.e(this.f95376o, productDetailsRemote.f95376o) && C17542s.e(this.f95377p, productDetailsRemote.f95377p) && C17542s.e(this.f95378q, productDetailsRemote.f95378q) && C17542s.e(this.f95379r, productDetailsRemote.f95379r) && C17542s.e(this.f95380s, productDetailsRemote.f95380s) && C17542s.e(this.f95381t, productDetailsRemote.f95381t) && C17542s.e(this.f95382u, productDetailsRemote.f95382u) && C17542s.e(this.f95383v, productDetailsRemote.f95383v) && C17542s.e(this.f95384w, productDetailsRemote.f95384w) && C17542s.e(this.f95385x, productDetailsRemote.f95385x) && C17542s.e(this.f95386y, productDetailsRemote.f95386y);
    }

    public int hashCode() {
        int hashCode = ((this.f95362a.hashCode() * 31) + this.f95363b.hashCode()) * 31;
        String str = this.f95364c;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f95365d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BadgeRemote badgeRemote = this.f95366e;
        int hashCode4 = (((hashCode3 + (badgeRemote == null ? 0 : badgeRemote.hashCode())) * 31) + Boolean.hashCode(this.f95367f)) * 31;
        String str3 = this.f95368g;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        PricePackageRemote pricePackageRemote = this.f95369h;
        int hashCode6 = (((hashCode5 + (pricePackageRemote == null ? 0 : pricePackageRemote.hashCode())) * 31) + this.f95370i.hashCode()) * 31;
        Float f10 = this.f95371j;
        int hashCode7 = (((((hashCode6 + (f10 == null ? 0 : f10.hashCode())) * 31) + this.f95372k.hashCode()) * 31) + this.f95373l.hashCode()) * 31;
        Integer num = this.f95374m;
        int hashCode8 = (((((hashCode7 + (num == null ? 0 : num.hashCode())) * 31) + this.f95375n.hashCode()) * 31) + this.f95376o.hashCode()) * 31;
        String str4 = this.f95377p;
        int hashCode9 = (hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<String> list = this.f95378q;
        int hashCode10 = (hashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.f95379r;
        int hashCode11 = (hashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31;
        GuaranteeInfoRemote guaranteeInfoRemote = this.f95380s;
        int hashCode12 = (hashCode11 + (guaranteeInfoRemote == null ? 0 : guaranteeInfoRemote.hashCode())) * 31;
        KeyBenefitsRemote keyBenefitsRemote = this.f95381t;
        int hashCode13 = (hashCode12 + (keyBenefitsRemote == null ? 0 : keyBenefitsRemote.hashCode())) * 31;
        ArModelRemote arModelRemote = this.f95382u;
        int hashCode14 = (hashCode13 + (arModelRemote == null ? 0 : arModelRemote.hashCode())) * 31;
        DisclaimerRemote disclaimerRemote = this.f95383v;
        int hashCode15 = (hashCode14 + (disclaimerRemote == null ? 0 : disclaimerRemote.hashCode())) * 31;
        HighlightRemote highlightRemote = this.f95384w;
        int hashCode16 = (hashCode15 + (highlightRemote == null ? 0 : highlightRemote.hashCode())) * 31;
        DisclaimerRemote disclaimerRemote2 = this.f95385x;
        int hashCode17 = (hashCode16 + (disclaimerRemote2 == null ? 0 : disclaimerRemote2.hashCode())) * 31;
        List<DisclaimerRemote> list3 = this.f95386y;
        if (list3 != null) {
            i10 = list3.hashCode();
        }
        return hashCode17 + i10;
    }

    public String toString() {
        String str = this.f95362a;
        String str2 = this.f95363b;
        String str3 = this.f95364c;
        String str4 = this.f95365d;
        BadgeRemote badgeRemote = this.f95366e;
        boolean z10 = this.f95367f;
        String str5 = this.f95368g;
        PricePackageRemote pricePackageRemote = this.f95369h;
        List<ImageRemoteLegacy> list = this.f95370i;
        Float f10 = this.f95371j;
        PackageInfoRemote packageInfoRemote = this.f95372k;
        MeasurementsRemote measurementsRemote = this.f95373l;
        Integer num = this.f95374m;
        MoreInfoRemote moreInfoRemote = this.f95375n;
        List<WarningRemote> list2 = this.f95376o;
        String str6 = this.f95377p;
        List<String> list3 = this.f95378q;
        List<String> list4 = this.f95379r;
        GuaranteeInfoRemote guaranteeInfoRemote = this.f95380s;
        KeyBenefitsRemote keyBenefitsRemote = this.f95381t;
        ArModelRemote arModelRemote = this.f95382u;
        DisclaimerRemote disclaimerRemote = this.f95383v;
        HighlightRemote highlightRemote = this.f95384w;
        DisclaimerRemote disclaimerRemote2 = this.f95385x;
        List<DisclaimerRemote> list5 = this.f95386y;
        return "ProductDetailsRemote(itemNo=" + str + ", itemType=" + str2 + ", title=" + str3 + ", description=" + str4 + ", productBadge=" + badgeRemote + ", isOnlineSellable=" + z10 + ", availabilityDisclaimer=" + str5 + ", pricePackage=" + pricePackageRemote + ", images=" + list + ", avgRating=" + f10 + ", packageInfoData=" + packageInfoRemote + ", measurements=" + measurementsRemote + ", reviewCount=" + num + ", moreInfo=" + moreInfoRemote + ", warnings=" + list2 + ", lastChanceLabel=" + str6 + ", headerTexts=" + list3 + ", footerTexts=" + list4 + ", guaranteeInfo=" + guaranteeInfoRemote + ", keyBenefits=" + keyBenefitsRemote + ", arModel=" + arModelRemote + ", repairability=" + disclaimerRemote + ", productHighlight=" + highlightRemote + ", energyClassDisclaimer=" + disclaimerRemote2 + ", productDisclaimers=" + list5 + ")";
    }
}
