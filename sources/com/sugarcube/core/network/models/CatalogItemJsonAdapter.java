package com.sugarcube.core.network.models;

import ME.c;
import YH.g0;
import android.net.Uri;
import com.google.ar.core.ImageFormat;
import com.oppwa.mobile.connect.BuildConfig;
import com.squareup.moshi.f;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import d9.M;
import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.time.Instant;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\"\u0010\u001e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001d0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\"\u0010%\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001d0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\"\u0010&\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001d0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019R\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0019R\u001c\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0019R\u001c\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010\u0019R\u001e\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010-8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, d2 = {"Lcom/sugarcube/core/network/models/CatalogItemJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/sugarcube/core/network/models/CatalogItem;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "fromJson", "(Lcom/squareup/moshi/k;)Lcom/sugarcube/core/network/models/CatalogItem;", "Lcom/squareup/moshi/q;", "writer", "value_", "LXH/N;", "toJson", "(Lcom/squareup/moshi/q;Lcom/sugarcube/core/network/models/CatalogItem;)V", "Lcom/squareup/moshi/k$a;", "options", "Lcom/squareup/moshi/k$a;", "", "nullableIntAdapter", "Lcom/squareup/moshi/f;", "nullableStringAdapter", "Landroid/net/Uri;", "nullableUriAdapter", "", "nullableListOfUriAdapter", "Ljava/time/Instant;", "nullableInstantAdapter", "", "nullableDoubleAdapter", "", "nullableBooleanAdapter", "nullableListOfStringAdapter", "nullableListOfIntAdapter", "Lcom/sugarcube/core/network/models/Stackables;", "nullableStackablesAdapter", "Lcom/sugarcube/core/network/models/CatalogItemMetadata;", "nullableCatalogItemMetadataAdapter", "Lcom/sugarcube/core/network/models/ProductBuyingOption;", "nullableProductBuyingOptionAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CatalogItemJsonAdapter extends f<CatalogItem> {
    private volatile Constructor<CatalogItem> constructorRef;
    private final f<Boolean> nullableBooleanAdapter;
    private final f<CatalogItemMetadata> nullableCatalogItemMetadataAdapter;
    private final f<Double> nullableDoubleAdapter;
    private final f<Instant> nullableInstantAdapter;
    private final f<Integer> nullableIntAdapter;
    private final f<List<Integer>> nullableListOfIntAdapter;
    private final f<List<String>> nullableListOfStringAdapter;
    private final f<List<Uri>> nullableListOfUriAdapter;
    private final f<ProductBuyingOption> nullableProductBuyingOptionAdapter;
    private final f<Stackables> nullableStackablesAdapter;
    private final f<String> nullableStringAdapter;
    private final f<Uri> nullableUriAdapter;
    private final k.a options;

    public CatalogItemJsonAdapter(t tVar) {
        t tVar2 = tVar;
        C17542s.j(tVar2, "moshi");
        k.a a10 = k.a.a("id", "region", "name", "description", "price", "priceNumeral", "thumbUrl", "ecommerceUrl", "imageUrls", "modelUrl", "createdAt", "lastModifiedTs", "qaStatus", "maxX", "maxY", "maxZ", "minX", "minY", "minZ", "uncompressedModelSize", "availableInRegion", "nest", "stacks", "businessName", "globalProductId", "localItemNumber", "subCatalogs", "categories", "subCategories", "rootCategories", "collections", "features", "swappableItems", "alternatives", "geometryType", "geometryTypes", "configurabilityType", "wallartImageUrls", "displayWidthCm", "displayHeightCm", "stackables", "hidden", "metadata", "availableForHomeDelivery", "availableForCashCarry", "availableForClickCollect", "buyingOption", "hasGoesWell", "isSupportedAutodecorate");
        C17542s.i(a10, "of(...)");
        this.options = a10;
        Class<Integer> cls = Integer.class;
        f<Integer> f10 = tVar2.f(cls, g0.d(), "id");
        C17542s.i(f10, "adapter(...)");
        this.nullableIntAdapter = f10;
        Class<String> cls2 = String.class;
        f<String> f11 = tVar2.f(cls2, g0.d(), "region");
        C17542s.i(f11, "adapter(...)");
        this.nullableStringAdapter = f11;
        Class<Uri> cls3 = Uri.class;
        f<Uri> f12 = tVar2.f(cls3, g0.d(), "thumbUrl");
        C17542s.i(f12, "adapter(...)");
        this.nullableUriAdapter = f12;
        Type[] typeArr = {cls3};
        Class<List> cls4 = List.class;
        f<List<Uri>> f13 = tVar2.f(w.j(cls4, typeArr), g0.d(), "imageUrls");
        C17542s.i(f13, "adapter(...)");
        this.nullableListOfUriAdapter = f13;
        f<Instant> f14 = tVar2.f(Instant.class, g0.d(), "createdAt");
        C17542s.i(f14, "adapter(...)");
        this.nullableInstantAdapter = f14;
        f<Double> f15 = tVar2.f(Double.class, g0.d(), "maxX");
        C17542s.i(f15, "adapter(...)");
        this.nullableDoubleAdapter = f15;
        f<Boolean> f16 = tVar2.f(Boolean.class, g0.d(), "availableInRegion");
        C17542s.i(f16, "adapter(...)");
        this.nullableBooleanAdapter = f16;
        f<List<String>> f17 = tVar2.f(w.j(cls4, cls2), g0.d(), "subCatalogs");
        C17542s.i(f17, "adapter(...)");
        this.nullableListOfStringAdapter = f17;
        f<List<Integer>> f18 = tVar2.f(w.j(cls4, cls), g0.d(), "swappableItems");
        C17542s.i(f18, "adapter(...)");
        this.nullableListOfIntAdapter = f18;
        f<Stackables> f19 = tVar2.f(Stackables.class, g0.d(), "stackables");
        C17542s.i(f19, "adapter(...)");
        this.nullableStackablesAdapter = f19;
        f<CatalogItemMetadata> f20 = tVar2.f(CatalogItemMetadata.class, g0.d(), "metadata");
        C17542s.i(f20, "adapter(...)");
        this.nullableCatalogItemMetadataAdapter = f20;
        f<ProductBuyingOption> f21 = tVar2.f(ProductBuyingOption.class, g0.d(), "buyingOption");
        C17542s.i(f21, "adapter(...)");
        this.nullableProductBuyingOptionAdapter = f21;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(33);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("CatalogItem");
        sb2.append(')');
        return sb2.toString();
    }

    public CatalogItem fromJson(k kVar) {
        int i10;
        k kVar2 = kVar;
        C17542s.j(kVar2, "reader");
        kVar.d();
        Integer num = null;
        int i11 = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Uri uri = null;
        Uri uri2 = null;
        List list = null;
        Uri uri3 = null;
        Instant instant = null;
        Instant instant2 = null;
        String str6 = null;
        Double d10 = null;
        Double d11 = null;
        Double d12 = null;
        Double d13 = null;
        Double d14 = null;
        Double d15 = null;
        Integer num2 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        List list5 = null;
        List list6 = null;
        List list7 = null;
        List list8 = null;
        List list9 = null;
        String str10 = null;
        List list10 = null;
        String str11 = null;
        List list11 = null;
        Double d16 = null;
        Double d17 = null;
        Stackables stackables = null;
        Boolean bool4 = null;
        CatalogItemMetadata catalogItemMetadata = null;
        Boolean bool5 = null;
        Boolean bool6 = null;
        Boolean bool7 = null;
        ProductBuyingOption productBuyingOption = null;
        Boolean bool8 = null;
        Boolean bool9 = null;
        int i12 = -1;
        while (kVar.hasNext()) {
            switch (kVar2.s(this.options)) {
                case -1:
                    kVar.w();
                    kVar.a0();
                    continue;
                case 0:
                    num = this.nullableIntAdapter.fromJson(kVar2);
                    i11 &= -2;
                    continue;
                case 1:
                    str = this.nullableStringAdapter.fromJson(kVar2);
                    i11 &= -3;
                    continue;
                case 2:
                    str2 = this.nullableStringAdapter.fromJson(kVar2);
                    i11 &= -5;
                    continue;
                case 3:
                    str3 = this.nullableStringAdapter.fromJson(kVar2);
                    i11 &= -9;
                    continue;
                case 4:
                    str4 = this.nullableStringAdapter.fromJson(kVar2);
                    i11 &= -17;
                    continue;
                case 5:
                    str5 = this.nullableStringAdapter.fromJson(kVar2);
                    i11 &= -33;
                    continue;
                case 6:
                    uri = this.nullableUriAdapter.fromJson(kVar2);
                    i11 &= -65;
                    continue;
                case 7:
                    uri2 = this.nullableUriAdapter.fromJson(kVar2);
                    i11 &= -129;
                    continue;
                case 8:
                    list = this.nullableListOfUriAdapter.fromJson(kVar2);
                    i11 &= -257;
                    continue;
                case 9:
                    uri3 = this.nullableUriAdapter.fromJson(kVar2);
                    i11 &= -513;
                    continue;
                case 10:
                    instant = this.nullableInstantAdapter.fromJson(kVar2);
                    i11 &= -1025;
                    continue;
                case 11:
                    instant2 = this.nullableInstantAdapter.fromJson(kVar2);
                    i11 &= -2049;
                    continue;
                case 12:
                    str6 = this.nullableStringAdapter.fromJson(kVar2);
                    i11 &= -4097;
                    continue;
                case 13:
                    d10 = this.nullableDoubleAdapter.fromJson(kVar2);
                    i11 &= -8193;
                    continue;
                case 14:
                    d11 = this.nullableDoubleAdapter.fromJson(kVar2);
                    i11 &= -16385;
                    continue;
                case 15:
                    d12 = this.nullableDoubleAdapter.fromJson(kVar2);
                    i11 &= -32769;
                    continue;
                case 16:
                    d13 = this.nullableDoubleAdapter.fromJson(kVar2);
                    i11 &= -65537;
                    continue;
                case 17:
                    d14 = this.nullableDoubleAdapter.fromJson(kVar2);
                    i10 = -131073;
                    break;
                case 18:
                    d15 = this.nullableDoubleAdapter.fromJson(kVar2);
                    i10 = -262145;
                    break;
                case 19:
                    num2 = this.nullableIntAdapter.fromJson(kVar2);
                    i10 = -524289;
                    break;
                case 20:
                    bool = this.nullableBooleanAdapter.fromJson(kVar2);
                    i10 = -1048577;
                    break;
                case 21:
                    bool2 = this.nullableBooleanAdapter.fromJson(kVar2);
                    i10 = -2097153;
                    break;
                case 22:
                    bool3 = this.nullableBooleanAdapter.fromJson(kVar2);
                    i10 = -4194305;
                    break;
                case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER:
                    str7 = this.nullableStringAdapter.fromJson(kVar2);
                    i10 = -8388609;
                    break;
                case BuildConfig.MIN_SDK_VERSION:
                    str8 = this.nullableStringAdapter.fromJson(kVar2);
                    i10 = -16777217;
                    break;
                case 25:
                    str9 = this.nullableStringAdapter.fromJson(kVar2);
                    i10 = -33554433;
                    break;
                case 26:
                    list2 = this.nullableListOfStringAdapter.fromJson(kVar2);
                    i10 = -67108865;
                    break;
                case 27:
                    list3 = this.nullableListOfStringAdapter.fromJson(kVar2);
                    i10 = -134217729;
                    break;
                case 28:
                    list4 = this.nullableListOfStringAdapter.fromJson(kVar2);
                    i10 = -268435457;
                    break;
                case 29:
                    list5 = this.nullableListOfStringAdapter.fromJson(kVar2);
                    i10 = -536870913;
                    break;
                case 30:
                    list6 = this.nullableListOfStringAdapter.fromJson(kVar2);
                    i10 = -1073741825;
                    break;
                case 31:
                    list7 = this.nullableListOfStringAdapter.fromJson(kVar2);
                    i10 = Integer.MAX_VALUE;
                    break;
                case 32:
                    list8 = this.nullableListOfIntAdapter.fromJson(kVar2);
                    i12 &= -2;
                    continue;
                case BuildConfig.TARGET_SDK_VERSION:
                    list9 = this.nullableListOfIntAdapter.fromJson(kVar2);
                    i12 &= -3;
                    continue;
                case 34:
                    str10 = this.nullableStringAdapter.fromJson(kVar2);
                    i12 &= -5;
                    continue;
                case ImageFormat.YUV_420_888:
                    list10 = this.nullableListOfStringAdapter.fromJson(kVar2);
                    i12 &= -9;
                    continue;
                case 36:
                    str11 = this.nullableStringAdapter.fromJson(kVar2);
                    i12 &= -17;
                    continue;
                case 37:
                    list11 = this.nullableListOfUriAdapter.fromJson(kVar2);
                    i12 &= -33;
                    continue;
                case 38:
                    d16 = this.nullableDoubleAdapter.fromJson(kVar2);
                    i12 &= -65;
                    continue;
                case 39:
                    d17 = this.nullableDoubleAdapter.fromJson(kVar2);
                    i12 &= -129;
                    continue;
                case 40:
                    stackables = this.nullableStackablesAdapter.fromJson(kVar2);
                    i12 &= -257;
                    continue;
                case 41:
                    bool4 = this.nullableBooleanAdapter.fromJson(kVar2);
                    i12 &= -513;
                    continue;
                case 42:
                    catalogItemMetadata = this.nullableCatalogItemMetadataAdapter.fromJson(kVar2);
                    i12 &= -1025;
                    continue;
                case 43:
                    bool5 = this.nullableBooleanAdapter.fromJson(kVar2);
                    i12 &= -2049;
                    continue;
                case 44:
                    bool6 = this.nullableBooleanAdapter.fromJson(kVar2);
                    i12 &= -4097;
                    continue;
                case 45:
                    bool7 = this.nullableBooleanAdapter.fromJson(kVar2);
                    i12 &= -8193;
                    continue;
                case 46:
                    productBuyingOption = this.nullableProductBuyingOptionAdapter.fromJson(kVar2);
                    i12 &= -16385;
                    continue;
                case 47:
                    bool8 = this.nullableBooleanAdapter.fromJson(kVar2);
                    i12 &= -32769;
                    continue;
                case 48:
                    bool9 = this.nullableBooleanAdapter.fromJson(kVar2);
                    i12 &= -65537;
                    continue;
            }
            i11 &= i10;
        }
        kVar.f();
        if (i11 == 0 && i12 == -131072) {
            return new CatalogItem(num, str, str2, str3, str4, str5, uri, uri2, list, uri3, instant, instant2, str6, d10, d11, d12, d13, d14, d15, num2, bool, bool2, bool3, str7, str8, str9, list2, list3, list4, list5, list6, list7, list8, list9, str10, list10, str11, list11, d16, d17, stackables, bool4, catalogItemMetadata, bool5, bool6, bool7, productBuyingOption, bool8, bool9);
        }
        Constructor<CatalogItem> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            constructor = CatalogItem.class.getDeclaredConstructor(new Class[]{Integer.class, String.class, String.class, String.class, String.class, String.class, Uri.class, Uri.class, List.class, Uri.class, Instant.class, Instant.class, String.class, Double.class, Double.class, Double.class, Double.class, Double.class, Double.class, Integer.class, Boolean.class, Boolean.class, Boolean.class, String.class, String.class, String.class, List.class, List.class, List.class, List.class, List.class, List.class, List.class, List.class, String.class, List.class, String.class, List.class, Double.class, Double.class, Stackables.class, Boolean.class, CatalogItemMetadata.class, Boolean.class, Boolean.class, Boolean.class, ProductBuyingOption.class, Boolean.class, Boolean.class, cls, cls, c.f112014c});
            this.constructorRef = constructor;
            C17542s.i(constructor, "also(...)");
        }
        CatalogItem newInstance = constructor.newInstance(new Object[]{num, str, str2, str3, str4, str5, uri, uri2, list, uri3, instant, instant2, str6, d10, d11, d12, d13, d14, d15, num2, bool, bool2, bool3, str7, str8, str9, list2, list3, list4, list5, list6, list7, list8, list9, str10, list10, str11, list11, d16, d17, stackables, bool4, catalogItemMetadata, bool5, bool6, bool7, productBuyingOption, bool8, bool9, Integer.valueOf(i11), Integer.valueOf(i12), null});
        C17542s.i(newInstance, "newInstance(...)");
        return newInstance;
    }

    public void toJson(q qVar, CatalogItem catalogItem) {
        C17542s.j(qVar, "writer");
        if (catalogItem != null) {
            qVar.d();
            qVar.n("id");
            this.nullableIntAdapter.toJson(qVar, catalogItem.getId());
            qVar.n("region");
            this.nullableStringAdapter.toJson(qVar, catalogItem.getRegion());
            qVar.n("name");
            this.nullableStringAdapter.toJson(qVar, catalogItem.getName());
            qVar.n("description");
            this.nullableStringAdapter.toJson(qVar, catalogItem.getDescription());
            qVar.n("price");
            this.nullableStringAdapter.toJson(qVar, catalogItem.getPrice());
            qVar.n("priceNumeral");
            this.nullableStringAdapter.toJson(qVar, catalogItem.getPriceNumeral());
            qVar.n("thumbUrl");
            this.nullableUriAdapter.toJson(qVar, catalogItem.getThumbUrl());
            qVar.n("ecommerceUrl");
            this.nullableUriAdapter.toJson(qVar, catalogItem.getEcommerceUrl());
            qVar.n("imageUrls");
            this.nullableListOfUriAdapter.toJson(qVar, catalogItem.getImageUrls());
            qVar.n("modelUrl");
            this.nullableUriAdapter.toJson(qVar, catalogItem.getModelUrl());
            qVar.n("createdAt");
            this.nullableInstantAdapter.toJson(qVar, catalogItem.getCreatedAt());
            qVar.n("lastModifiedTs");
            this.nullableInstantAdapter.toJson(qVar, catalogItem.getLastModifiedTs());
            qVar.n("qaStatus");
            this.nullableStringAdapter.toJson(qVar, catalogItem.getQaStatus());
            qVar.n("maxX");
            this.nullableDoubleAdapter.toJson(qVar, catalogItem.getMaxX());
            qVar.n("maxY");
            this.nullableDoubleAdapter.toJson(qVar, catalogItem.getMaxY());
            qVar.n("maxZ");
            this.nullableDoubleAdapter.toJson(qVar, catalogItem.getMaxZ());
            qVar.n("minX");
            this.nullableDoubleAdapter.toJson(qVar, catalogItem.getMinX());
            qVar.n("minY");
            this.nullableDoubleAdapter.toJson(qVar, catalogItem.getMinY());
            qVar.n("minZ");
            this.nullableDoubleAdapter.toJson(qVar, catalogItem.getMinZ());
            qVar.n("uncompressedModelSize");
            this.nullableIntAdapter.toJson(qVar, catalogItem.getUncompressedModelSize());
            qVar.n("availableInRegion");
            this.nullableBooleanAdapter.toJson(qVar, catalogItem.getAvailableInRegion());
            qVar.n("nest");
            this.nullableBooleanAdapter.toJson(qVar, catalogItem.getNest());
            qVar.n("stacks");
            this.nullableBooleanAdapter.toJson(qVar, catalogItem.getStacks());
            qVar.n("businessName");
            this.nullableStringAdapter.toJson(qVar, catalogItem.getBusinessName());
            qVar.n("globalProductId");
            this.nullableStringAdapter.toJson(qVar, catalogItem.getGlobalProductId());
            qVar.n("localItemNumber");
            this.nullableStringAdapter.toJson(qVar, catalogItem.getLocalItemNumber());
            qVar.n("subCatalogs");
            this.nullableListOfStringAdapter.toJson(qVar, catalogItem.getSubCatalogs());
            qVar.n("categories");
            this.nullableListOfStringAdapter.toJson(qVar, catalogItem.getCategories());
            qVar.n("subCategories");
            this.nullableListOfStringAdapter.toJson(qVar, catalogItem.getSubCategories());
            qVar.n("rootCategories");
            this.nullableListOfStringAdapter.toJson(qVar, catalogItem.getRootCategories());
            qVar.n("collections");
            this.nullableListOfStringAdapter.toJson(qVar, catalogItem.getCollections());
            qVar.n("features");
            this.nullableListOfStringAdapter.toJson(qVar, catalogItem.getFeatures());
            qVar.n("swappableItems");
            this.nullableListOfIntAdapter.toJson(qVar, catalogItem.getSwappableItems());
            qVar.n("alternatives");
            this.nullableListOfIntAdapter.toJson(qVar, catalogItem.getAlternatives());
            qVar.n("geometryType");
            this.nullableStringAdapter.toJson(qVar, catalogItem.getGeometryType());
            qVar.n("geometryTypes");
            this.nullableListOfStringAdapter.toJson(qVar, catalogItem.getGeometryTypes());
            qVar.n("configurabilityType");
            this.nullableStringAdapter.toJson(qVar, catalogItem.getConfigurabilityType());
            qVar.n("wallartImageUrls");
            this.nullableListOfUriAdapter.toJson(qVar, catalogItem.getWallartImageUrls());
            qVar.n("displayWidthCm");
            this.nullableDoubleAdapter.toJson(qVar, catalogItem.getDisplayWidthCm());
            qVar.n("displayHeightCm");
            this.nullableDoubleAdapter.toJson(qVar, catalogItem.getDisplayHeightCm());
            qVar.n("stackables");
            this.nullableStackablesAdapter.toJson(qVar, catalogItem.getStackables());
            qVar.n("hidden");
            this.nullableBooleanAdapter.toJson(qVar, catalogItem.getHidden());
            qVar.n("metadata");
            this.nullableCatalogItemMetadataAdapter.toJson(qVar, catalogItem.getMetadata());
            qVar.n("availableForHomeDelivery");
            this.nullableBooleanAdapter.toJson(qVar, catalogItem.getAvailableForHomeDelivery());
            qVar.n("availableForCashCarry");
            this.nullableBooleanAdapter.toJson(qVar, catalogItem.getAvailableForCashCarry());
            qVar.n("availableForClickCollect");
            this.nullableBooleanAdapter.toJson(qVar, catalogItem.getAvailableForClickCollect());
            qVar.n("buyingOption");
            this.nullableProductBuyingOptionAdapter.toJson(qVar, catalogItem.getBuyingOption());
            qVar.n("hasGoesWell");
            this.nullableBooleanAdapter.toJson(qVar, catalogItem.getHasGoesWell());
            qVar.n("isSupportedAutodecorate");
            this.nullableBooleanAdapter.toJson(qVar, catalogItem.isSupportedAutodecorate());
            qVar.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
