package com.ingka.ikea.core.remotemodel.product;

import XH.t;
import YH.C16877v;
import com.ingka.ikea.core.model.product.BtiPrice;
import com.ingka.ikea.core.model.product.FamilyPrice;
import com.ingka.ikea.core.model.product.NewLowerPrice;
import com.ingka.ikea.core.model.product.Price;
import com.ingka.ikea.core.model.product.ProductItem;
import com.ingka.ikea.core.model.product.RegularPrice;
import com.ingka.ikea.core.model.product.TimeRestrictedPrice;
import fI.C17220a;
import fI.C17221b;
import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.E0;
import jK.T0;
import jK.Y0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import op.C11696g;
import pp.C11768b;

@p
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u0000 I2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00033J.Bq\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0002H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0000¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b.\u0010/\u0012\u0004\b1\u00102\u001a\u0004\b0\u0010&R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b3\u0010/\u0012\u0004\b5\u00102\u001a\u0004\b4\u0010&R\"\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b6\u0010/\u0012\u0004\b8\u00102\u001a\u0004\b7\u0010&R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b9\u0010:\u0012\u0004\b=\u00102\u001a\u0004\b;\u0010<R\"\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010:\u0012\u0004\b?\u00102\u001a\u0004\b>\u0010<R\"\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b \u0010/\u0012\u0004\bA\u00102\u001a\u0004\b@\u0010&R(\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\r8\u0006X\u0004¢\u0006\u0012\n\u0004\b#\u0010B\u0012\u0004\bD\u00102\u001a\u0004\b3\u0010CR\"\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010/\u0012\u0004\bE\u00102\u001a\u0004\b9\u0010&R\u0014\u0010H\u001a\u00020F8BX\u0004¢\u0006\u0006\u001a\u0004\b6\u0010G¨\u0006K"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/product/PricePackageRemote;", "Lpp/b;", "Lcom/ingka/ikea/core/model/product/a;", "", "seen0", "", "type", "offerValidity", "indicativeDiscount", "Lcom/ingka/ikea/core/remotemodel/product/ProductPriceRemote;", "includingVat", "excludingVat", "lowestPreviousPrice", "", "priceAddons", "validTo", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/core/remotemodel/product/ProductPriceRemote;Lcom/ingka/ikea/core/remotemodel/product/ProductPriceRemote;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;LjK/T0;)V", "Lcom/ingka/ikea/core/remotemodel/product/FeeRemote;", "Lcom/ingka/ikea/core/model/product/ProductItem$Price$PriceTag$Fee;", "e", "(Lcom/ingka/ikea/core/remotemodel/product/FeeRemote;)Lcom/ingka/ikea/core/model/product/ProductItem$Price$PriceTag$Fee;", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "h", "(Lcom/ingka/ikea/core/remotemodel/product/PricePackageRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "f", "()Lcom/ingka/ikea/core/model/product/a;", "Lcom/ingka/ikea/core/model/product/ProductItem$Price;", "g", "()Lcom/ingka/ikea/core/model/product/ProductItem$Price;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getType", "getType$annotations", "()V", "b", "getOfferValidity", "getOfferValidity$annotations", "c", "getIndicativeDiscount", "getIndicativeDiscount$annotations", "d", "Lcom/ingka/ikea/core/remotemodel/product/ProductPriceRemote;", "getIncludingVat", "()Lcom/ingka/ikea/core/remotemodel/product/ProductPriceRemote;", "getIncludingVat$annotations", "getExcludingVat", "getExcludingVat$annotations", "getLowestPreviousPrice", "getLowestPreviousPrice$annotations", "Ljava/util/List;", "()Ljava/util/List;", "getPriceAddons$annotations", "getValidTo$annotations", "Lcom/ingka/ikea/core/remotemodel/product/PricePackageRemote$b;", "()Lcom/ingka/ikea/core/remotemodel/product/PricePackageRemote$b;", "priceType", "Companion", "$serializer", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PricePackageRemote implements C11768b<com.ingka.ikea.core.model.product.a> {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final KSerializer<Object>[] f95346i = {null, null, null, null, null, null, new C17451f(Y0.f144077a), null};

    /* renamed from: a  reason: collision with root package name */
    private final String f95347a;

    /* renamed from: b  reason: collision with root package name */
    private final String f95348b;

    /* renamed from: c  reason: collision with root package name */
    private final String f95349c;

    /* renamed from: d  reason: collision with root package name */
    private final ProductPriceRemote f95350d;

    /* renamed from: e  reason: collision with root package name */
    private final ProductPriceRemote f95351e;

    /* renamed from: f  reason: collision with root package name */
    private final String f95352f;

    /* renamed from: g  reason: collision with root package name */
    private final List<String> f95353g;

    /* renamed from: h  reason: collision with root package name */
    private final String f95354h;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/product/PricePackageRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/remotemodel/product/PricePackageRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<PricePackageRemote> serializer() {
            return PricePackageRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/product/PricePackageRemote$b;", "", "", "priceType", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getPriceType", "()Ljava/lang/String;", "Companion", "a", "REGULAR", "NEW_LOWER_PRICE", "TIME_RESTRICTED", "BREATH_TAKING_ITEM", "FAMILY", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum b {
        REGULAR("REG"),
        NEW_LOWER_PRICE("NLP"),
        TIME_RESTRICTED("TRO"),
        BREATH_TAKING_ITEM("BTI"),
        FAMILY("FAM");
        
        public static final a Companion = null;
        /* access modifiers changed from: private */
        public static final HashMap<String, b> map = null;
        private final String priceType;

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR0\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\tj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006`\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/product/PricePackageRemote$b$a;", "", "<init>", "()V", "", "value", "Lcom/ingka/ikea/core/remotemodel/product/PricePackageRemote$b;", "a", "(Ljava/lang/String;)Lcom/ingka/ikea/core/remotemodel/product/PricePackageRemote$b;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "map", "Ljava/util/HashMap;", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final b a(String str) {
                return (b) b.map.get(str);
            }

            private a() {
            }
        }

        static {
            b[] a10;
            $ENTRIES = C17221b.a(a10);
            Companion = new a((DefaultConstructorMarker) null);
            HashMap<String, b> hashMap = new HashMap<>();
            for (b bVar : j()) {
                hashMap.put(bVar.priceType, bVar);
            }
            map = hashMap;
        }

        private b(String str) {
            this.priceType = str;
        }

        public static C17220a<b> j() {
            return $ENTRIES;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f95355a;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                com.ingka.ikea.core.remotemodel.product.PricePackageRemote$b[] r0 = com.ingka.ikea.core.remotemodel.product.PricePackageRemote.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ingka.ikea.core.remotemodel.product.PricePackageRemote$b r1 = com.ingka.ikea.core.remotemodel.product.PricePackageRemote.b.REGULAR     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.ingka.ikea.core.remotemodel.product.PricePackageRemote$b r1 = com.ingka.ikea.core.remotemodel.product.PricePackageRemote.b.NEW_LOWER_PRICE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.ingka.ikea.core.remotemodel.product.PricePackageRemote$b r1 = com.ingka.ikea.core.remotemodel.product.PricePackageRemote.b.TIME_RESTRICTED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.ingka.ikea.core.remotemodel.product.PricePackageRemote$b r1 = com.ingka.ikea.core.remotemodel.product.PricePackageRemote.b.BREATH_TAKING_ITEM     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                com.ingka.ikea.core.remotemodel.product.PricePackageRemote$b r1 = com.ingka.ikea.core.remotemodel.product.PricePackageRemote.b.FAMILY     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                f95355a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.core.remotemodel.product.PricePackageRemote.c.<clinit>():void");
        }
    }

    public /* synthetic */ PricePackageRemote(int i10, String str, String str2, String str3, ProductPriceRemote productPriceRemote, ProductPriceRemote productPriceRemote2, String str4, List list, String str5, T0 t02) {
        if (255 != (i10 & 255)) {
            E0.b(i10, 255, PricePackageRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f95347a = str;
        this.f95348b = str2;
        this.f95349c = str3;
        this.f95350d = productPriceRemote;
        this.f95351e = productPriceRemote2;
        this.f95352f = str4;
        this.f95353g = list;
        this.f95354h = str5;
    }

    private final b c() {
        b a10 = b.Companion.a(this.f95347a);
        if (a10 != null) {
            return a10;
        }
        String str = this.f95347a;
        throw new IllegalArgumentException(("PriceType " + str + " is not available").toString());
    }

    private final ProductItem.Price.PriceTag.Fee e(FeeRemote feeRemote) {
        String d10 = feeRemote.d();
        if (d10 != null) {
            ProductItem.Price.PriceTag.Fee.c valueOf = ProductItem.Price.PriceTag.Fee.c.valueOf(d10);
            String a10 = feeRemote.a();
            if (a10 != null) {
                String b10 = feeRemote.b();
                if (b10 != null) {
                    String e10 = feeRemote.e();
                    if (e10 != null) {
                        String c10 = feeRemote.c();
                        if (c10 != null) {
                            return new ProductItem.Price.PriceTag.Fee(valueOf, a10, b10, e10, c10);
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    throw new IllegalArgumentException("Required value was null.");
                }
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final /* synthetic */ void h(PricePackageRemote pricePackageRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f95346i;
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 0, y02, pricePackageRemote.f95347a);
        dVar.B(serialDescriptor, 1, y02, pricePackageRemote.f95348b);
        dVar.B(serialDescriptor, 2, y02, pricePackageRemote.f95349c);
        ProductPriceRemote$$serializer productPriceRemote$$serializer = ProductPriceRemote$$serializer.INSTANCE;
        dVar.B(serialDescriptor, 3, productPriceRemote$$serializer, pricePackageRemote.f95350d);
        dVar.B(serialDescriptor, 4, productPriceRemote$$serializer, pricePackageRemote.f95351e);
        dVar.B(serialDescriptor, 5, y02, pricePackageRemote.f95352f);
        dVar.B(serialDescriptor, 6, kSerializerArr[6], pricePackageRemote.f95353g);
        dVar.B(serialDescriptor, 7, y02, pricePackageRemote.f95354h);
    }

    public final List<String> b() {
        return this.f95353g;
    }

    public final String d() {
        return this.f95354h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PricePackageRemote)) {
            return false;
        }
        PricePackageRemote pricePackageRemote = (PricePackageRemote) obj;
        return C17542s.e(this.f95347a, pricePackageRemote.f95347a) && C17542s.e(this.f95348b, pricePackageRemote.f95348b) && C17542s.e(this.f95349c, pricePackageRemote.f95349c) && C17542s.e(this.f95350d, pricePackageRemote.f95350d) && C17542s.e(this.f95351e, pricePackageRemote.f95351e) && C17542s.e(this.f95352f, pricePackageRemote.f95352f) && C17542s.e(this.f95353g, pricePackageRemote.f95353g) && C17542s.e(this.f95354h, pricePackageRemote.f95354h);
    }

    public com.ingka.ikea.core.model.product.a f() {
        ProductPriceRemote productPriceRemote = this.f95350d;
        if (productPriceRemote != null) {
            Price b10 = productPriceRemote.b();
            ProductPriceRemote productPriceRemote2 = this.f95351e;
            Price b11 = productPriceRemote2 != null ? productPriceRemote2.b() : null;
            int i10 = c.f95355a[c().ordinal()];
            if (i10 == 1) {
                return new RegularPrice((C11696g) null, b10, b11, this.f95349c, this.f95348b, this.f95352f, 1, (DefaultConstructorMarker) null);
            }
            if (i10 == 2) {
                return new NewLowerPrice((C11696g) null, b10, b11, this.f95349c, this.f95348b, this.f95352f, 1, (DefaultConstructorMarker) null);
            }
            if (i10 == 3) {
                return new TimeRestrictedPrice((C11696g) null, b10, b11, this.f95349c, this.f95348b, this.f95352f, 1, (DefaultConstructorMarker) null);
            }
            if (i10 == 4) {
                return new BtiPrice((C11696g) null, b10, b11, this.f95349c, this.f95348b, this.f95352f, 1, (DefaultConstructorMarker) null);
            }
            if (i10 == 5) {
                return new FamilyPrice((C11696g) null, b10, b11, this.f95349c, this.f95348b, this.f95352f, 1, (DefaultConstructorMarker) null);
            }
            throw new t();
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final ProductItem.Price g() {
        ArrayList arrayList;
        String str;
        ArrayList arrayList2;
        ProductPriceRemote productPriceRemote = this.f95350d;
        if (productPriceRemote != null) {
            Double d10 = productPriceRemote.d();
            if (d10 != null) {
                double doubleValue = d10.doubleValue();
                Double e10 = productPriceRemote.e();
                List<FeeRemote> c10 = productPriceRemote.c();
                if (c10 != null) {
                    Iterable<FeeRemote> iterable = c10;
                    ArrayList arrayList3 = new ArrayList(C16877v.y(iterable, 10));
                    for (FeeRemote e11 : iterable) {
                        arrayList3.add(e(e11));
                    }
                    arrayList = arrayList3;
                } else {
                    arrayList = C16877v.n();
                }
                String f10 = productPriceRemote.f();
                ProductItem.Price.PriceTag priceTag = null;
                if (f10 != null) {
                    str = "/" + f10;
                } else {
                    str = null;
                }
                ProductItem.Price.PriceTag priceTag2 = new ProductItem.Price.PriceTag(e10, doubleValue, arrayList, str);
                ProductPriceRemote productPriceRemote2 = this.f95351e;
                if (productPriceRemote2 != null) {
                    Double e12 = productPriceRemote2.e();
                    Double d11 = productPriceRemote2.d();
                    if (d11 != null) {
                        double doubleValue2 = d11.doubleValue();
                        List<FeeRemote> c11 = productPriceRemote.c();
                        if (c11 != null) {
                            Iterable<FeeRemote> iterable2 = c11;
                            ArrayList arrayList4 = new ArrayList(C16877v.y(iterable2, 10));
                            for (FeeRemote e13 : iterable2) {
                                arrayList4.add(e(e13));
                            }
                            arrayList2 = arrayList4;
                        } else {
                            arrayList2 = C16877v.n();
                        }
                        priceTag = new ProductItem.Price.PriceTag(e12, doubleValue2, arrayList2, productPriceRemote.f());
                    } else {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
                int i10 = c.f95355a[c().ordinal()];
                if (i10 == 1) {
                    return new ProductItem.Price.RegularPrice(priceTag2, priceTag);
                }
                if (i10 == 2) {
                    return new ProductItem.Price.NewLowerPrice(priceTag2, priceTag);
                }
                if (i10 == 3) {
                    return new ProductItem.Price.TimeRestrictedPrice(priceTag2, priceTag);
                }
                if (i10 == 4) {
                    return new ProductItem.Price.BtiPrice(priceTag2, priceTag);
                }
                if (i10 == 5) {
                    return new ProductItem.Price.FamilyPrice(priceTag2, priceTag);
                }
                throw new t();
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public int hashCode() {
        String str = this.f95347a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f95348b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f95349c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ProductPriceRemote productPriceRemote = this.f95350d;
        int hashCode4 = (hashCode3 + (productPriceRemote == null ? 0 : productPriceRemote.hashCode())) * 31;
        ProductPriceRemote productPriceRemote2 = this.f95351e;
        int hashCode5 = (hashCode4 + (productPriceRemote2 == null ? 0 : productPriceRemote2.hashCode())) * 31;
        String str4 = this.f95352f;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<String> list = this.f95353g;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.f95354h;
        if (str5 != null) {
            i10 = str5.hashCode();
        }
        return hashCode7 + i10;
    }

    public String toString() {
        String str = this.f95347a;
        String str2 = this.f95348b;
        String str3 = this.f95349c;
        ProductPriceRemote productPriceRemote = this.f95350d;
        ProductPriceRemote productPriceRemote2 = this.f95351e;
        String str4 = this.f95352f;
        List<String> list = this.f95353g;
        String str5 = this.f95354h;
        return "PricePackageRemote(type=" + str + ", offerValidity=" + str2 + ", indicativeDiscount=" + str3 + ", includingVat=" + productPriceRemote + ", excludingVat=" + productPriceRemote2 + ", lowestPreviousPrice=" + str4 + ", priceAddons=" + list + ", validTo=" + str5 + ")";
    }
}
