package com.ingka.ikea.core.remotemodel.product;

import YH.C16877v;
import com.ingka.ikea.core.model.Image;
import com.ingka.ikea.core.model.product.AvailabilityType;
import com.ingka.ikea.core.model.product.Badge;
import com.ingka.ikea.core.model.product.ProductItem;
import com.ingka.ikea.core.remotemodel.ImageRemote;
import com.ingka.ikea.core.remotemodel.ImageRemote$$serializer;
import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.C17457i;
import jK.E0;
import jK.T0;
import jK.Y0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import op.C11703n;
import rp.C11840b;

@p
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b;\b\b\u0018\u0000 g2\u00020\u0001:\u0002h8BÃ\u0001\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0013\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0018\u0012\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0013\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\u0004\u0018\u00010#*\u00020\u0014H\u0002¢\u0006\u0004\b$\u0010%J'\u0010,\u001a\u00020+2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0001¢\u0006\u0004\b,\u0010-J\r\u0010/\u001a\u00020.¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b3\u00104J\u001a\u00106\u001a\u00020\u000b2\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b6\u00107R \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b8\u00109\u0012\u0004\b;\u0010<\u001a\u0004\b:\u00102R \u0010\u0006\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b=\u00109\u0012\u0004\b?\u0010<\u001a\u0004\b>\u00102R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b@\u00109\u0012\u0004\bB\u0010<\u001a\u0004\bA\u00102R\"\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\bC\u00109\u0012\u0004\bE\u0010<\u001a\u0004\bD\u00102R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\bD\u0010F\u0012\u0004\bI\u0010<\u001a\u0004\bG\u0010HR\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\bJ\u0010K\u0012\u0004\bN\u0010<\u001a\u0004\bL\u0010MR\"\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\bO\u00109\u0012\u0004\bP\u0010<\u001a\u0004\b@\u00102R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0004¢\u0006\u0012\n\u0004\b!\u0010Q\u0012\u0004\bS\u0010<\u001a\u0004\bO\u0010RR\"\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006X\u0004¢\u0006\u0012\n\u0004\b:\u0010Q\u0012\u0004\bT\u0010<\u001a\u0004\bC\u0010RR\"\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0004¢\u0006\u0012\n\u0004\b>\u0010U\u0012\u0004\bX\u0010<\u001a\u0004\bV\u0010WR(\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0006X\u0004¢\u0006\u0012\n\u0004\bY\u0010Z\u0012\u0004\b\\\u0010<\u001a\u0004\b=\u0010[R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0004¢\u0006\u0012\n\u0004\bV\u0010]\u0012\u0004\b`\u0010<\u001a\u0004\b^\u0010_R(\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00138\u0006X\u0004¢\u0006\u0012\n\u0004\bG\u0010Z\u0012\u0004\ba\u0010<\u001a\u0004\bY\u0010[R\"\u0010\u001a\u001a\u0004\u0018\u00010\u00188\u0006X\u0004¢\u0006\u0012\n\u0004\bb\u0010c\u0012\u0004\be\u0010<\u001a\u0004\bJ\u0010dR(\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00138\u0006X\u0004¢\u0006\u0012\n\u0004\b^\u0010Z\u0012\u0004\bf\u0010<\u001a\u0004\bb\u0010[¨\u0006i"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/product/ProductLiteRemote;", "", "", "seen0", "", "itemNo", "itemType", "title", "description", "Lcom/ingka/ikea/core/remotemodel/product/BadgeRemote;", "productBadge", "", "isOnlineSellable", "availabilityDisclaimer", "Lcom/ingka/ikea/core/remotemodel/ImageRemote;", "image", "contextualImage", "Lcom/ingka/ikea/core/remotemodel/product/PricePackageRemote;", "pricePackage", "", "Lcom/ingka/ikea/core/remotemodel/product/AvailabilityRemote;", "availability", "Lcom/ingka/ikea/core/remotemodel/product/HighlightRemote;", "productHighlight", "Lcom/ingka/ikea/core/remotemodel/product/DisclaimerRemote;", "priceDescriptions", "energyClassDisclaimer", "productDisclaimers", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/core/remotemodel/product/BadgeRemote;Ljava/lang/Boolean;Ljava/lang/String;Lcom/ingka/ikea/core/remotemodel/ImageRemote;Lcom/ingka/ikea/core/remotemodel/ImageRemote;Lcom/ingka/ikea/core/remotemodel/product/PricePackageRemote;Ljava/util/List;Lcom/ingka/ikea/core/remotemodel/product/HighlightRemote;Ljava/util/List;Lcom/ingka/ikea/core/remotemodel/product/DisclaimerRemote;Ljava/util/List;LjK/T0;)V", "Lcom/ingka/ikea/core/model/product/ProductItem$ProductInfo;", "h", "()Lcom/ingka/ikea/core/model/product/ProductItem$ProductInfo;", "Lcom/ingka/ikea/core/model/product/ProductItem$Availability;", "r", "(Lcom/ingka/ikea/core/remotemodel/product/AvailabilityRemote;)Lcom/ingka/ikea/core/model/product/ProductItem$Availability;", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "t", "(Lcom/ingka/ikea/core/remotemodel/product/ProductLiteRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/ingka/ikea/core/model/product/ProductItem;", "s", "()Lcom/ingka/ikea/core/model/product/ProductItem;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "i", "getItemNo$annotations", "()V", "b", "j", "getItemType$annotations", "c", "p", "getTitle$annotations", "d", "e", "getDescription$annotations", "Lcom/ingka/ikea/core/remotemodel/product/BadgeRemote;", "m", "()Lcom/ingka/ikea/core/remotemodel/product/BadgeRemote;", "getProductBadge$annotations", "f", "Ljava/lang/Boolean;", "q", "()Ljava/lang/Boolean;", "isOnlineSellable$annotations", "g", "getAvailabilityDisclaimer$annotations", "Lcom/ingka/ikea/core/remotemodel/ImageRemote;", "()Lcom/ingka/ikea/core/remotemodel/ImageRemote;", "getImage$annotations", "getContextualImage$annotations", "Lcom/ingka/ikea/core/remotemodel/product/PricePackageRemote;", "l", "()Lcom/ingka/ikea/core/remotemodel/product/PricePackageRemote;", "getPricePackage$annotations", "k", "Ljava/util/List;", "()Ljava/util/List;", "getAvailability$annotations", "Lcom/ingka/ikea/core/remotemodel/product/HighlightRemote;", "o", "()Lcom/ingka/ikea/core/remotemodel/product/HighlightRemote;", "getProductHighlight$annotations", "getPriceDescriptions$annotations", "n", "Lcom/ingka/ikea/core/remotemodel/product/DisclaimerRemote;", "()Lcom/ingka/ikea/core/remotemodel/product/DisclaimerRemote;", "getEnergyClassDisclaimer$annotations", "getProductDisclaimers$annotations", "Companion", "$serializer", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ProductLiteRemote {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public static final KSerializer<Object>[] f95395p;

    /* renamed from: a  reason: collision with root package name */
    private final String f95396a;

    /* renamed from: b  reason: collision with root package name */
    private final String f95397b;

    /* renamed from: c  reason: collision with root package name */
    private final String f95398c;

    /* renamed from: d  reason: collision with root package name */
    private final String f95399d;

    /* renamed from: e  reason: collision with root package name */
    private final BadgeRemote f95400e;

    /* renamed from: f  reason: collision with root package name */
    private final Boolean f95401f;

    /* renamed from: g  reason: collision with root package name */
    private final String f95402g;

    /* renamed from: h  reason: collision with root package name */
    private final ImageRemote f95403h;

    /* renamed from: i  reason: collision with root package name */
    private final ImageRemote f95404i;

    /* renamed from: j  reason: collision with root package name */
    private final PricePackageRemote f95405j;

    /* renamed from: k  reason: collision with root package name */
    private final List<AvailabilityRemote> f95406k;

    /* renamed from: l  reason: collision with root package name */
    private final HighlightRemote f95407l;

    /* renamed from: m  reason: collision with root package name */
    private final List<DisclaimerRemote> f95408m;

    /* renamed from: n  reason: collision with root package name */
    private final DisclaimerRemote f95409n;

    /* renamed from: o  reason: collision with root package name */
    private final List<DisclaimerRemote> f95410o;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/product/ProductLiteRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/remotemodel/product/ProductLiteRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<ProductLiteRemote> serializer() {
            return ProductLiteRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        C17451f fVar = new C17451f(AvailabilityRemote$$serializer.INSTANCE);
        DisclaimerRemote$$serializer disclaimerRemote$$serializer = DisclaimerRemote$$serializer.INSTANCE;
        f95395p = new KSerializer[]{null, null, null, null, null, null, null, null, null, null, fVar, null, new C17451f(disclaimerRemote$$serializer), null, new C17451f(disclaimerRemote$$serializer)};
    }

    public /* synthetic */ ProductLiteRemote(int i10, String str, String str2, String str3, String str4, BadgeRemote badgeRemote, Boolean bool, String str5, ImageRemote imageRemote, ImageRemote imageRemote2, PricePackageRemote pricePackageRemote, List list, HighlightRemote highlightRemote, List list2, DisclaimerRemote disclaimerRemote, List list3, T0 t02) {
        if (32767 != (i10 & 32767)) {
            E0.b(i10, 32767, ProductLiteRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f95396a = str;
        this.f95397b = str2;
        this.f95398c = str3;
        this.f95399d = str4;
        this.f95400e = badgeRemote;
        this.f95401f = bool;
        this.f95402g = str5;
        this.f95403h = imageRemote;
        this.f95404i = imageRemote2;
        this.f95405j = pricePackageRemote;
        this.f95406k = list;
        this.f95407l = highlightRemote;
        this.f95408m = list2;
        this.f95409n = disclaimerRemote;
        this.f95410o = list3;
    }

    private final ProductItem.ProductInfo h() {
        HighlightRemote highlightRemote = this.f95407l;
        ProductItem.ProductItemHighlight b10 = highlightRemote != null ? highlightRemote.b() : null;
        String str = this.f95398c;
        if (str != null) {
            String str2 = this.f95399d;
            if (str2 != null) {
                PricePackageRemote pricePackageRemote = this.f95405j;
                if (pricePackageRemote != null) {
                    ProductItem.Price g10 = pricePackageRemote.g();
                    ProductItem.EnergyClassDisclaimer a10 = C11840b.a(this.f95409n);
                    List<String> b11 = this.f95405j.b();
                    if (b11 == null) {
                        b11 = C16877v.n();
                    }
                    return new ProductItem.ProductInfo(b10, this.f95405j.d(), str, str2, g10, a10, b11, this.f95402g);
                }
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final ProductItem.Availability r(AvailabilityRemote availabilityRemote) {
        T t10;
        Iterator<T> it = AvailabilityType.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                t10 = null;
                break;
            }
            t10 = it.next();
            if (C17542s.e(((AvailabilityType) t10).name(), availabilityRemote.g())) {
                break;
            }
        }
        AvailabilityType availabilityType = (AvailabilityType) t10;
        if (availabilityType == null) {
            return null;
        }
        String b10 = availabilityRemote.b();
        C11703n c10 = availabilityRemote.c();
        if (c10 != null) {
            return new ProductItem.Availability(b10, c10, availabilityRemote.d(), availabilityRemote.e(), availabilityRemote.f(), availabilityType);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final /* synthetic */ void t(ProductLiteRemote productLiteRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f95395p;
        dVar.y(serialDescriptor, 0, productLiteRemote.f95396a);
        dVar.y(serialDescriptor, 1, productLiteRemote.f95397b);
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 2, y02, productLiteRemote.f95398c);
        dVar.B(serialDescriptor, 3, y02, productLiteRemote.f95399d);
        dVar.B(serialDescriptor, 4, BadgeRemote$$serializer.INSTANCE, productLiteRemote.f95400e);
        dVar.B(serialDescriptor, 5, C17457i.f144111a, productLiteRemote.f95401f);
        dVar.B(serialDescriptor, 6, y02, productLiteRemote.f95402g);
        ImageRemote$$serializer imageRemote$$serializer = ImageRemote$$serializer.INSTANCE;
        dVar.B(serialDescriptor, 7, imageRemote$$serializer, productLiteRemote.f95403h);
        dVar.B(serialDescriptor, 8, imageRemote$$serializer, productLiteRemote.f95404i);
        dVar.B(serialDescriptor, 9, PricePackageRemote$$serializer.INSTANCE, productLiteRemote.f95405j);
        dVar.B(serialDescriptor, 10, kSerializerArr[10], productLiteRemote.f95406k);
        dVar.B(serialDescriptor, 11, HighlightRemote$$serializer.INSTANCE, productLiteRemote.f95407l);
        dVar.B(serialDescriptor, 12, kSerializerArr[12], productLiteRemote.f95408m);
        dVar.B(serialDescriptor, 13, DisclaimerRemote$$serializer.INSTANCE, productLiteRemote.f95409n);
        dVar.B(serialDescriptor, 14, kSerializerArr[14], productLiteRemote.f95410o);
    }

    public final List<AvailabilityRemote> b() {
        return this.f95406k;
    }

    public final String c() {
        return this.f95402g;
    }

    public final ImageRemote d() {
        return this.f95404i;
    }

    public final String e() {
        return this.f95399d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductLiteRemote)) {
            return false;
        }
        ProductLiteRemote productLiteRemote = (ProductLiteRemote) obj;
        return C17542s.e(this.f95396a, productLiteRemote.f95396a) && C17542s.e(this.f95397b, productLiteRemote.f95397b) && C17542s.e(this.f95398c, productLiteRemote.f95398c) && C17542s.e(this.f95399d, productLiteRemote.f95399d) && C17542s.e(this.f95400e, productLiteRemote.f95400e) && C17542s.e(this.f95401f, productLiteRemote.f95401f) && C17542s.e(this.f95402g, productLiteRemote.f95402g) && C17542s.e(this.f95403h, productLiteRemote.f95403h) && C17542s.e(this.f95404i, productLiteRemote.f95404i) && C17542s.e(this.f95405j, productLiteRemote.f95405j) && C17542s.e(this.f95406k, productLiteRemote.f95406k) && C17542s.e(this.f95407l, productLiteRemote.f95407l) && C17542s.e(this.f95408m, productLiteRemote.f95408m) && C17542s.e(this.f95409n, productLiteRemote.f95409n) && C17542s.e(this.f95410o, productLiteRemote.f95410o);
    }

    public final DisclaimerRemote f() {
        return this.f95409n;
    }

    public final ImageRemote g() {
        return this.f95403h;
    }

    public int hashCode() {
        int hashCode = ((this.f95396a.hashCode() * 31) + this.f95397b.hashCode()) * 31;
        String str = this.f95398c;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f95399d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BadgeRemote badgeRemote = this.f95400e;
        int hashCode4 = (hashCode3 + (badgeRemote == null ? 0 : badgeRemote.hashCode())) * 31;
        Boolean bool = this.f95401f;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.f95402g;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ImageRemote imageRemote = this.f95403h;
        int hashCode7 = (hashCode6 + (imageRemote == null ? 0 : imageRemote.hashCode())) * 31;
        ImageRemote imageRemote2 = this.f95404i;
        int hashCode8 = (hashCode7 + (imageRemote2 == null ? 0 : imageRemote2.hashCode())) * 31;
        PricePackageRemote pricePackageRemote = this.f95405j;
        int hashCode9 = (hashCode8 + (pricePackageRemote == null ? 0 : pricePackageRemote.hashCode())) * 31;
        List<AvailabilityRemote> list = this.f95406k;
        int hashCode10 = (hashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        HighlightRemote highlightRemote = this.f95407l;
        int hashCode11 = (hashCode10 + (highlightRemote == null ? 0 : highlightRemote.hashCode())) * 31;
        List<DisclaimerRemote> list2 = this.f95408m;
        int hashCode12 = (hashCode11 + (list2 == null ? 0 : list2.hashCode())) * 31;
        DisclaimerRemote disclaimerRemote = this.f95409n;
        int hashCode13 = (hashCode12 + (disclaimerRemote == null ? 0 : disclaimerRemote.hashCode())) * 31;
        List<DisclaimerRemote> list3 = this.f95410o;
        if (list3 != null) {
            i10 = list3.hashCode();
        }
        return hashCode13 + i10;
    }

    public final String i() {
        return this.f95396a;
    }

    public final String j() {
        return this.f95397b;
    }

    public final List<DisclaimerRemote> k() {
        return this.f95408m;
    }

    public final PricePackageRemote l() {
        return this.f95405j;
    }

    public final BadgeRemote m() {
        return this.f95400e;
    }

    public final List<DisclaimerRemote> n() {
        return this.f95410o;
    }

    public final HighlightRemote o() {
        return this.f95407l;
    }

    public final String p() {
        return this.f95398c;
    }

    public final Boolean q() {
        return this.f95401f;
    }

    public final ProductItem s() {
        ArrayList arrayList;
        String str = this.f95396a;
        String str2 = this.f95397b;
        BadgeRemote badgeRemote = this.f95400e;
        Badge a10 = badgeRemote != null ? badgeRemote.a() : null;
        ImageRemote imageRemote = this.f95403h;
        if (imageRemote != null) {
            Image c10 = imageRemote.c();
            ImageRemote imageRemote2 = this.f95404i;
            Image c11 = imageRemote2 != null ? imageRemote2.c() : null;
            ProductItem.ProductInfo h10 = h();
            List<ProductItem.ProductDisclaimer> b10 = C11840b.b(this.f95410o);
            List<AvailabilityRemote> list = this.f95406k;
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                for (AvailabilityRemote r10 : list) {
                    ProductItem.Availability r11 = r(r10);
                    if (r11 != null) {
                        arrayList2.add(r11);
                    }
                }
                arrayList = arrayList2;
            } else {
                arrayList = C16877v.n();
            }
            Boolean bool = this.f95401f;
            if (bool != null) {
                return new ProductItem(str, str2, a10, c10, c11, h10, b10, arrayList, bool.booleanValue());
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public String toString() {
        String str = this.f95396a;
        String str2 = this.f95397b;
        String str3 = this.f95398c;
        String str4 = this.f95399d;
        BadgeRemote badgeRemote = this.f95400e;
        Boolean bool = this.f95401f;
        String str5 = this.f95402g;
        ImageRemote imageRemote = this.f95403h;
        ImageRemote imageRemote2 = this.f95404i;
        PricePackageRemote pricePackageRemote = this.f95405j;
        List<AvailabilityRemote> list = this.f95406k;
        HighlightRemote highlightRemote = this.f95407l;
        List<DisclaimerRemote> list2 = this.f95408m;
        DisclaimerRemote disclaimerRemote = this.f95409n;
        List<DisclaimerRemote> list3 = this.f95410o;
        return "ProductLiteRemote(itemNo=" + str + ", itemType=" + str2 + ", title=" + str3 + ", description=" + str4 + ", productBadge=" + badgeRemote + ", isOnlineSellable=" + bool + ", availabilityDisclaimer=" + str5 + ", image=" + imageRemote + ", contextualImage=" + imageRemote2 + ", pricePackage=" + pricePackageRemote + ", availability=" + list + ", productHighlight=" + highlightRemote + ", priceDescriptions=" + list2 + ", energyClassDisclaimer=" + disclaimerRemote + ", productDisclaimers=" + list3 + ")";
    }
}
