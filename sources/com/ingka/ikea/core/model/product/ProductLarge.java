package com.ingka.ikea.core.model.product;

import android.os.Parcel;
import android.os.Parcelable;
import com.ingka.ikea.core.model.KeyBenefits;
import com.ingka.ikea.core.model.KeyBenefits$$serializer;
import com.ingka.ikea.core.model.Media;
import com.ingka.ikea.core.model.Media$Image$$serializer;
import com.ingka.ikea.core.model.Media$InfoImage$$serializer;
import com.ingka.ikea.core.model.Media$Video$$serializer;
import com.ingka.ikea.core.model.product.ProductItem;
import fK.C17261n;
import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.E0;
import jK.M;
import jK.T0;
import jK.Y0;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import uI.C18055d;

@p
@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b3\b\b\u0018\u0000 o2\u00020\u0001:\u0002pBB×\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u000b\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b\u0012\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\b\u0010#\u001a\u0004\u0018\u00010!\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u000b¢\u0006\u0004\b&\u0010'Bý\u0001\b\u0010\u0012\u0006\u0010(\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u000b\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b\u0012\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\b\u0010#\u001a\u0004\u0018\u00010!\u0012\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u000b\u0012\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b&\u0010+J'\u00102\u001a\u0002012\u0006\u0010,\u001a\u00020\u00002\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H\u0001¢\u0006\u0004\b2\u00103J\u001d\u00107\u001a\u0002012\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u00020\u0012¢\u0006\u0004\b7\u00108J\r\u00109\u001a\u00020\u0012¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b=\u0010:J\u001a\u0010@\u001a\u00020\t2\b\u0010?\u001a\u0004\u0018\u00010>HÖ\u0003¢\u0006\u0004\b@\u0010AR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010<R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bE\u0010C\u001a\u0004\bF\u0010<R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\bU\u0010W\u001a\u0004\bG\u0010XR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bI\u0010Y\u001a\u0004\bZ\u0010[R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bD\u0010\\\u001a\u0004\b]\u0010:R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bF\u0010^\u001a\u0004\b_\u0010`R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u000b8\u0006¢\u0006\f\n\u0004\b_\u0010T\u001a\u0004\be\u0010VR\u001f\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\bc\u0010T\u001a\u0004\bS\u0010VR\u001f\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\bZ\u0010T\u001a\u0004\bK\u0010VR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\bM\u0010f\u001a\u0004\bO\u0010gR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\ba\u0010jR\u0019\u0010 \u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bk\u0010C\u001a\u0004\bE\u0010<R\u0019\u0010\"\u001a\u0004\u0018\u00010!8\u0006¢\u0006\f\n\u0004\b]\u0010l\u001a\u0004\bk\u0010mR\u0019\u0010#\u001a\u0004\u0018\u00010!8\u0006¢\u0006\f\n\u0004\be\u0010l\u001a\u0004\bn\u0010mR\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u000b8\u0006¢\u0006\f\n\u0004\bQ\u0010T\u001a\u0004\bh\u0010V¨\u0006q"}, d2 = {"Lcom/ingka/ikea/core/model/product/ProductLarge;", "Landroid/os/Parcelable;", "", "itemNo", "itemType", "Lcom/ingka/ikea/core/model/product/ProductItem$ProductInfo;", "info", "Lcom/ingka/ikea/core/model/product/Badge;", "productBadge", "", "isOnlineSellable", "", "Lcom/ingka/ikea/core/model/Media;", "images", "", "avgRating", "Lcom/ingka/ikea/core/model/product/PackageInfoData;", "packageInfo", "", "reviewCount", "Lcom/ingka/ikea/core/model/product/Measurements;", "measurements", "Lcom/ingka/ikea/core/model/product/MoreInfo;", "moreInfo", "Lcom/ingka/ikea/core/model/product/Warning;", "warnings", "headerTexts", "footerTexts", "Lcom/ingka/ikea/core/model/product/GuaranteeInfo;", "guaranteeInfo", "Lcom/ingka/ikea/core/model/KeyBenefits;", "keyBenefits", "arModelUrl", "Lcom/ingka/ikea/core/model/product/Disclaimer;", "repairabilityIndex", "energyClassDisclaimer", "Lcom/ingka/ikea/core/model/product/ProductItem$ProductDisclaimer;", "productDisclaimers", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/core/model/product/ProductItem$ProductInfo;Lcom/ingka/ikea/core/model/product/Badge;ZLjava/util/List;Ljava/lang/Float;Lcom/ingka/ikea/core/model/product/PackageInfoData;ILcom/ingka/ikea/core/model/product/Measurements;Lcom/ingka/ikea/core/model/product/MoreInfo;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/ingka/ikea/core/model/product/GuaranteeInfo;Lcom/ingka/ikea/core/model/KeyBenefits;Ljava/lang/String;Lcom/ingka/ikea/core/model/product/Disclaimer;Lcom/ingka/ikea/core/model/product/Disclaimer;Ljava/util/List;)V", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/core/model/product/ProductItem$ProductInfo;Lcom/ingka/ikea/core/model/product/Badge;ZLjava/util/List;Ljava/lang/Float;Lcom/ingka/ikea/core/model/product/PackageInfoData;ILcom/ingka/ikea/core/model/product/Measurements;Lcom/ingka/ikea/core/model/product/MoreInfo;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/ingka/ikea/core/model/product/GuaranteeInfo;Lcom/ingka/ikea/core/model/KeyBenefits;Ljava/lang/String;Lcom/ingka/ikea/core/model/product/Disclaimer;Lcom/ingka/ikea/core/model/product/Disclaimer;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "u", "(Lcom/ingka/ikea/core/model/product/ProductLarge;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "i", "b", "j", "c", "Lcom/ingka/ikea/core/model/product/ProductItem$ProductInfo;", "h", "()Lcom/ingka/ikea/core/model/product/ProductItem$ProductInfo;", "d", "Lcom/ingka/ikea/core/model/product/Badge;", "o", "()Lcom/ingka/ikea/core/model/product/Badge;", "e", "Z", "t", "()Z", "f", "Ljava/util/List;", "g", "()Ljava/util/List;", "Ljava/lang/Float;", "()Ljava/lang/Float;", "Lcom/ingka/ikea/core/model/product/PackageInfoData;", "n", "()Lcom/ingka/ikea/core/model/product/PackageInfoData;", "I", "r", "Lcom/ingka/ikea/core/model/product/Measurements;", "l", "()Lcom/ingka/ikea/core/model/product/Measurements;", "k", "Lcom/ingka/ikea/core/model/product/MoreInfo;", "m", "()Lcom/ingka/ikea/core/model/product/MoreInfo;", "s", "Lcom/ingka/ikea/core/model/product/GuaranteeInfo;", "()Lcom/ingka/ikea/core/model/product/GuaranteeInfo;", "p", "Lcom/ingka/ikea/core/model/KeyBenefits;", "()Lcom/ingka/ikea/core/model/KeyBenefits;", "q", "Lcom/ingka/ikea/core/model/product/Disclaimer;", "()Lcom/ingka/ikea/core/model/product/Disclaimer;", "getEnergyClassDisclaimer", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ProductLarge implements Parcelable {
    public static final Parcelable.Creator<ProductLarge> CREATOR = new b();
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public static final KSerializer<Object>[] f95120u;

    /* renamed from: a  reason: collision with root package name */
    private final String f95121a;

    /* renamed from: b  reason: collision with root package name */
    private final String f95122b;

    /* renamed from: c  reason: collision with root package name */
    private final ProductItem.ProductInfo f95123c;

    /* renamed from: d  reason: collision with root package name */
    private final Badge f95124d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f95125e;

    /* renamed from: f  reason: collision with root package name */
    private final List<Media> f95126f;

    /* renamed from: g  reason: collision with root package name */
    private final Float f95127g;

    /* renamed from: h  reason: collision with root package name */
    private final PackageInfoData f95128h;

    /* renamed from: i  reason: collision with root package name */
    private final int f95129i;

    /* renamed from: j  reason: collision with root package name */
    private final Measurements f95130j;

    /* renamed from: k  reason: collision with root package name */
    private final MoreInfo f95131k;

    /* renamed from: l  reason: collision with root package name */
    private final List<Warning> f95132l;

    /* renamed from: m  reason: collision with root package name */
    private final List<String> f95133m;

    /* renamed from: n  reason: collision with root package name */
    private final List<String> f95134n;

    /* renamed from: o  reason: collision with root package name */
    private final GuaranteeInfo f95135o;

    /* renamed from: p  reason: collision with root package name */
    private final KeyBenefits f95136p;

    /* renamed from: q  reason: collision with root package name */
    private final String f95137q;

    /* renamed from: r  reason: collision with root package name */
    private final Disclaimer f95138r;

    /* renamed from: s  reason: collision with root package name */
    private final Disclaimer f95139s;

    /* renamed from: t  reason: collision with root package name */
    private final List<ProductItem.ProductDisclaimer> f95140t;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/model/product/ProductLarge$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/model/product/ProductLarge;", "serializer", "()Lkotlinx/serialization/KSerializer;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<ProductLarge> serializer() {
            return ProductLarge$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<ProductLarge> {
        /* renamed from: a */
        public final ProductLarge createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            C17542s.j(parcel2, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            ProductItem.ProductInfo createFromParcel = ProductItem.ProductInfo.CREATOR.createFromParcel(parcel2);
            Badge createFromParcel2 = parcel.readInt() == 0 ? null : Badge.CREATOR.createFromParcel(parcel2);
            boolean z10 = parcel.readInt() != 0;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i10 = 0; i10 != readInt; i10++) {
                arrayList.add(parcel2.readParcelable(ProductLarge.class.getClassLoader()));
            }
            Float valueOf = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            PackageInfoData createFromParcel3 = PackageInfoData.CREATOR.createFromParcel(parcel2);
            int readInt2 = parcel.readInt();
            Measurements createFromParcel4 = Measurements.CREATOR.createFromParcel(parcel2);
            MoreInfo createFromParcel5 = MoreInfo.CREATOR.createFromParcel(parcel2);
            int readInt3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt3);
            for (int i11 = 0; i11 != readInt3; i11++) {
                arrayList2.add(Warning.CREATOR.createFromParcel(parcel2));
            }
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
            GuaranteeInfo createFromParcel6 = parcel.readInt() == 0 ? null : GuaranteeInfo.CREATOR.createFromParcel(parcel2);
            KeyBenefits createFromParcel7 = parcel.readInt() == 0 ? null : KeyBenefits.CREATOR.createFromParcel(parcel2);
            String readString3 = parcel.readString();
            Disclaimer createFromParcel8 = parcel.readInt() == 0 ? null : Disclaimer.CREATOR.createFromParcel(parcel2);
            Disclaimer createFromParcel9 = parcel.readInt() == 0 ? null : Disclaimer.CREATOR.createFromParcel(parcel2);
            int readInt4 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt4);
            int i12 = 0;
            while (i12 != readInt4) {
                arrayList3.add(ProductItem.ProductDisclaimer.CREATOR.createFromParcel(parcel2));
                i12++;
                readInt4 = readInt4;
            }
            return new ProductLarge(readString, readString2, createFromParcel, createFromParcel2, z10, arrayList, valueOf, createFromParcel3, readInt2, createFromParcel4, createFromParcel5, arrayList2, createStringArrayList, createStringArrayList2, createFromParcel6, createFromParcel7, readString3, createFromParcel8, createFromParcel9, arrayList3);
        }

        /* renamed from: b */
        public final ProductLarge[] newArray(int i10) {
            return new ProductLarge[i10];
        }
    }

    static {
        C17451f fVar = new C17451f(new C17261n("com.ingka.ikea.core.model.Media", P.b(Media.class), new C18055d[]{P.b(Media.Image.class), P.b(Media.InfoImage.class), P.b(Media.Video.class)}, new KSerializer[]{Media$Image$$serializer.INSTANCE, Media$InfoImage$$serializer.INSTANCE, Media$Video$$serializer.INSTANCE}, new Annotation[0]));
        C17451f fVar2 = new C17451f(Warning$$serializer.INSTANCE);
        Y0 y02 = Y0.f144077a;
        f95120u = new KSerializer[]{null, null, null, null, null, fVar, null, null, null, null, null, fVar2, new C17451f(y02), new C17451f(y02), null, null, null, null, null, new C17451f(ProductItem$ProductDisclaimer$$serializer.INSTANCE)};
    }

    public /* synthetic */ ProductLarge(int i10, String str, String str2, ProductItem.ProductInfo productInfo, Badge badge, boolean z10, List list, Float f10, PackageInfoData packageInfoData, int i11, Measurements measurements, MoreInfo moreInfo, List list2, List list3, List list4, GuaranteeInfo guaranteeInfo, KeyBenefits keyBenefits, String str3, Disclaimer disclaimer, Disclaimer disclaimer2, List list5, T0 t02) {
        if (1048575 != (i10 & 1048575)) {
            E0.b(i10, 1048575, ProductLarge$$serializer.INSTANCE.getDescriptor());
        }
        this.f95121a = str;
        this.f95122b = str2;
        this.f95123c = productInfo;
        this.f95124d = badge;
        this.f95125e = z10;
        this.f95126f = list;
        this.f95127g = f10;
        this.f95128h = packageInfoData;
        this.f95129i = i11;
        this.f95130j = measurements;
        this.f95131k = moreInfo;
        this.f95132l = list2;
        this.f95133m = list3;
        this.f95134n = list4;
        this.f95135o = guaranteeInfo;
        this.f95136p = keyBenefits;
        this.f95137q = str3;
        this.f95138r = disclaimer;
        this.f95139s = disclaimer2;
        this.f95140t = list5;
    }

    public static final /* synthetic */ void u(ProductLarge productLarge, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f95120u;
        dVar.y(serialDescriptor, 0, productLarge.f95121a);
        dVar.y(serialDescriptor, 1, productLarge.f95122b);
        dVar.i(serialDescriptor, 2, ProductItem$ProductInfo$$serializer.INSTANCE, productLarge.f95123c);
        dVar.B(serialDescriptor, 3, Badge$$serializer.INSTANCE, productLarge.f95124d);
        dVar.x(serialDescriptor, 4, productLarge.f95125e);
        dVar.i(serialDescriptor, 5, kSerializerArr[5], productLarge.f95126f);
        dVar.B(serialDescriptor, 6, M.f144051a, productLarge.f95127g);
        dVar.i(serialDescriptor, 7, PackageInfoData$$serializer.INSTANCE, productLarge.f95128h);
        dVar.w(serialDescriptor, 8, productLarge.f95129i);
        dVar.i(serialDescriptor, 9, Measurements$$serializer.INSTANCE, productLarge.f95130j);
        dVar.i(serialDescriptor, 10, MoreInfo$$serializer.INSTANCE, productLarge.f95131k);
        dVar.i(serialDescriptor, 11, kSerializerArr[11], productLarge.f95132l);
        dVar.B(serialDescriptor, 12, kSerializerArr[12], productLarge.f95133m);
        dVar.B(serialDescriptor, 13, kSerializerArr[13], productLarge.f95134n);
        dVar.B(serialDescriptor, 14, GuaranteeInfo$$serializer.INSTANCE, productLarge.f95135o);
        dVar.B(serialDescriptor, 15, KeyBenefits$$serializer.INSTANCE, productLarge.f95136p);
        dVar.B(serialDescriptor, 16, Y0.f144077a, productLarge.f95137q);
        Disclaimer$$serializer disclaimer$$serializer = Disclaimer$$serializer.INSTANCE;
        dVar.B(serialDescriptor, 17, disclaimer$$serializer, productLarge.f95138r);
        dVar.B(serialDescriptor, 18, disclaimer$$serializer, productLarge.f95139s);
        dVar.i(serialDescriptor, 19, kSerializerArr[19], productLarge.f95140t);
    }

    public final String b() {
        return this.f95137q;
    }

    public final Float c() {
        return this.f95127g;
    }

    public final List<String> d() {
        return this.f95134n;
    }

    public final int describeContents() {
        return 0;
    }

    public final GuaranteeInfo e() {
        return this.f95135o;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductLarge)) {
            return false;
        }
        ProductLarge productLarge = (ProductLarge) obj;
        return C17542s.e(this.f95121a, productLarge.f95121a) && C17542s.e(this.f95122b, productLarge.f95122b) && C17542s.e(this.f95123c, productLarge.f95123c) && C17542s.e(this.f95124d, productLarge.f95124d) && this.f95125e == productLarge.f95125e && C17542s.e(this.f95126f, productLarge.f95126f) && C17542s.e(this.f95127g, productLarge.f95127g) && C17542s.e(this.f95128h, productLarge.f95128h) && this.f95129i == productLarge.f95129i && C17542s.e(this.f95130j, productLarge.f95130j) && C17542s.e(this.f95131k, productLarge.f95131k) && C17542s.e(this.f95132l, productLarge.f95132l) && C17542s.e(this.f95133m, productLarge.f95133m) && C17542s.e(this.f95134n, productLarge.f95134n) && C17542s.e(this.f95135o, productLarge.f95135o) && C17542s.e(this.f95136p, productLarge.f95136p) && C17542s.e(this.f95137q, productLarge.f95137q) && C17542s.e(this.f95138r, productLarge.f95138r) && C17542s.e(this.f95139s, productLarge.f95139s) && C17542s.e(this.f95140t, productLarge.f95140t);
    }

    public final List<String> f() {
        return this.f95133m;
    }

    public final List<Media> g() {
        return this.f95126f;
    }

    public final ProductItem.ProductInfo h() {
        return this.f95123c;
    }

    public int hashCode() {
        int hashCode = ((((this.f95121a.hashCode() * 31) + this.f95122b.hashCode()) * 31) + this.f95123c.hashCode()) * 31;
        Badge badge = this.f95124d;
        int i10 = 0;
        int hashCode2 = (((((hashCode + (badge == null ? 0 : badge.hashCode())) * 31) + Boolean.hashCode(this.f95125e)) * 31) + this.f95126f.hashCode()) * 31;
        Float f10 = this.f95127g;
        int hashCode3 = (((((((((((hashCode2 + (f10 == null ? 0 : f10.hashCode())) * 31) + this.f95128h.hashCode()) * 31) + Integer.hashCode(this.f95129i)) * 31) + this.f95130j.hashCode()) * 31) + this.f95131k.hashCode()) * 31) + this.f95132l.hashCode()) * 31;
        List<String> list = this.f95133m;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.f95134n;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        GuaranteeInfo guaranteeInfo = this.f95135o;
        int hashCode6 = (hashCode5 + (guaranteeInfo == null ? 0 : guaranteeInfo.hashCode())) * 31;
        KeyBenefits keyBenefits = this.f95136p;
        int hashCode7 = (hashCode6 + (keyBenefits == null ? 0 : keyBenefits.hashCode())) * 31;
        String str = this.f95137q;
        int hashCode8 = (hashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        Disclaimer disclaimer = this.f95138r;
        int hashCode9 = (hashCode8 + (disclaimer == null ? 0 : disclaimer.hashCode())) * 31;
        Disclaimer disclaimer2 = this.f95139s;
        if (disclaimer2 != null) {
            i10 = disclaimer2.hashCode();
        }
        return ((hashCode9 + i10) * 31) + this.f95140t.hashCode();
    }

    public final String i() {
        return this.f95121a;
    }

    public final String j() {
        return this.f95122b;
    }

    public final KeyBenefits k() {
        return this.f95136p;
    }

    public final Measurements l() {
        return this.f95130j;
    }

    public final MoreInfo m() {
        return this.f95131k;
    }

    public final PackageInfoData n() {
        return this.f95128h;
    }

    public final Badge o() {
        return this.f95124d;
    }

    public final List<ProductItem.ProductDisclaimer> p() {
        return this.f95140t;
    }

    public final Disclaimer q() {
        return this.f95138r;
    }

    public final int r() {
        return this.f95129i;
    }

    public final List<Warning> s() {
        return this.f95132l;
    }

    public final boolean t() {
        return this.f95125e;
    }

    public String toString() {
        String str = this.f95121a;
        String str2 = this.f95122b;
        ProductItem.ProductInfo productInfo = this.f95123c;
        Badge badge = this.f95124d;
        boolean z10 = this.f95125e;
        List<Media> list = this.f95126f;
        Float f10 = this.f95127g;
        PackageInfoData packageInfoData = this.f95128h;
        int i10 = this.f95129i;
        Measurements measurements = this.f95130j;
        MoreInfo moreInfo = this.f95131k;
        List<Warning> list2 = this.f95132l;
        List<String> list3 = this.f95133m;
        List<String> list4 = this.f95134n;
        GuaranteeInfo guaranteeInfo = this.f95135o;
        KeyBenefits keyBenefits = this.f95136p;
        String str3 = this.f95137q;
        Disclaimer disclaimer = this.f95138r;
        Disclaimer disclaimer2 = this.f95139s;
        List<ProductItem.ProductDisclaimer> list5 = this.f95140t;
        return "ProductLarge(itemNo=" + str + ", itemType=" + str2 + ", info=" + productInfo + ", productBadge=" + badge + ", isOnlineSellable=" + z10 + ", images=" + list + ", avgRating=" + f10 + ", packageInfo=" + packageInfoData + ", reviewCount=" + i10 + ", measurements=" + measurements + ", moreInfo=" + moreInfo + ", warnings=" + list2 + ", headerTexts=" + list3 + ", footerTexts=" + list4 + ", guaranteeInfo=" + guaranteeInfo + ", keyBenefits=" + keyBenefits + ", arModelUrl=" + str3 + ", repairabilityIndex=" + disclaimer + ", energyClassDisclaimer=" + disclaimer2 + ", productDisclaimers=" + list5 + ")";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "dest");
        parcel.writeString(this.f95121a);
        parcel.writeString(this.f95122b);
        this.f95123c.writeToParcel(parcel, i10);
        Badge badge = this.f95124d;
        if (badge == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            badge.writeToParcel(parcel, i10);
        }
        parcel.writeInt(this.f95125e ? 1 : 0);
        List<Media> list = this.f95126f;
        parcel.writeInt(list.size());
        for (Media writeParcelable : list) {
            parcel.writeParcelable(writeParcelable, i10);
        }
        Float f10 = this.f95127g;
        if (f10 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f10.floatValue());
        }
        this.f95128h.writeToParcel(parcel, i10);
        parcel.writeInt(this.f95129i);
        this.f95130j.writeToParcel(parcel, i10);
        this.f95131k.writeToParcel(parcel, i10);
        List<Warning> list2 = this.f95132l;
        parcel.writeInt(list2.size());
        for (Warning writeToParcel : list2) {
            writeToParcel.writeToParcel(parcel, i10);
        }
        parcel.writeStringList(this.f95133m);
        parcel.writeStringList(this.f95134n);
        GuaranteeInfo guaranteeInfo = this.f95135o;
        if (guaranteeInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            guaranteeInfo.writeToParcel(parcel, i10);
        }
        KeyBenefits keyBenefits = this.f95136p;
        if (keyBenefits == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            keyBenefits.writeToParcel(parcel, i10);
        }
        parcel.writeString(this.f95137q);
        Disclaimer disclaimer = this.f95138r;
        if (disclaimer == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            disclaimer.writeToParcel(parcel, i10);
        }
        Disclaimer disclaimer2 = this.f95139s;
        if (disclaimer2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            disclaimer2.writeToParcel(parcel, i10);
        }
        List<ProductItem.ProductDisclaimer> list3 = this.f95140t;
        parcel.writeInt(list3.size());
        for (ProductItem.ProductDisclaimer writeToParcel2 : list3) {
            writeToParcel2.writeToParcel(parcel, i10);
        }
    }

    public ProductLarge(String str, String str2, ProductItem.ProductInfo productInfo, Badge badge, boolean z10, List<? extends Media> list, Float f10, PackageInfoData packageInfoData, int i10, Measurements measurements, MoreInfo moreInfo, List<Warning> list2, List<String> list3, List<String> list4, GuaranteeInfo guaranteeInfo, KeyBenefits keyBenefits, String str3, Disclaimer disclaimer, Disclaimer disclaimer2, List<ProductItem.ProductDisclaimer> list5) {
        List<? extends Media> list6 = list;
        PackageInfoData packageInfoData2 = packageInfoData;
        Measurements measurements2 = measurements;
        MoreInfo moreInfo2 = moreInfo;
        List<Warning> list7 = list2;
        List<ProductItem.ProductDisclaimer> list8 = list5;
        C17542s.j(str, "itemNo");
        C17542s.j(str2, "itemType");
        C17542s.j(productInfo, "info");
        C17542s.j(list6, "images");
        C17542s.j(packageInfoData2, "packageInfo");
        C17542s.j(measurements2, "measurements");
        C17542s.j(moreInfo2, "moreInfo");
        C17542s.j(list7, "warnings");
        C17542s.j(list8, "productDisclaimers");
        this.f95121a = str;
        this.f95122b = str2;
        this.f95123c = productInfo;
        this.f95124d = badge;
        this.f95125e = z10;
        this.f95126f = list6;
        this.f95127g = f10;
        this.f95128h = packageInfoData2;
        this.f95129i = i10;
        this.f95130j = measurements2;
        this.f95131k = moreInfo2;
        this.f95132l = list7;
        this.f95133m = list3;
        this.f95134n = list4;
        this.f95135o = guaranteeInfo;
        this.f95136p = keyBenefits;
        this.f95137q = str3;
        this.f95138r = disclaimer;
        this.f95139s = disclaimer2;
        this.f95140t = list8;
    }
}
