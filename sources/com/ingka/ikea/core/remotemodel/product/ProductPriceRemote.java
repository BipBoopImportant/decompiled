package com.ingka.ikea.core.remotemodel.product;

import YH.C16877v;
import com.ingka.ikea.core.model.product.Price;
import fK.p;
import iK.C17395d;
import jK.C17438C;
import jK.C17451f;
import jK.E0;
import jK.T0;
import jK.Y0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0007\u0018\u0000 82\u00020\u0001:\u00029\u001fBq\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010 \u0012\u0004\b&\u0010$\u001a\u0004\b%\u0010\"R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b'\u0010 \u0012\u0004\b)\u0010$\u001a\u0004\b(\u0010\"R\"\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b*\u0010 \u0012\u0004\b,\u0010$\u001a\u0004\b+\u0010\"R(\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b-\u0010.\u0012\u0004\b0\u0010$\u001a\u0004\b'\u0010/R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b1\u00102\u0012\u0004\b4\u0010$\u001a\u0004\b*\u00103R\"\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001a\u00102\u0012\u0004\b5\u0010$\u001a\u0004\b-\u00103R\"\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b6\u0010 \u0012\u0004\b7\u0010$\u001a\u0004\b1\u0010\"¨\u0006:"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/product/ProductPriceRemote;", "", "", "seen0", "", "sellingPrice", "priceLabel", "unitPrice", "regularPrice", "", "Lcom/ingka/ikea/core/remotemodel/product/FeeRemote;", "fees", "", "rawPrice", "rawRegularPrice", "unit", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "g", "(Lcom/ingka/ikea/core/remotemodel/product/ProductPriceRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/ingka/ikea/core/model/product/Price;", "b", "()Lcom/ingka/ikea/core/model/product/Price;", "a", "Ljava/lang/String;", "getSellingPrice", "()Ljava/lang/String;", "getSellingPrice$annotations", "()V", "getPriceLabel", "getPriceLabel$annotations", "c", "getUnitPrice", "getUnitPrice$annotations", "d", "getRegularPrice", "getRegularPrice$annotations", "e", "Ljava/util/List;", "()Ljava/util/List;", "getFees$annotations", "f", "Ljava/lang/Double;", "()Ljava/lang/Double;", "getRawPrice$annotations", "getRawRegularPrice$annotations", "h", "getUnit$annotations", "Companion", "$serializer", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ProductPriceRemote {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final KSerializer<Object>[] f95415i = {null, null, null, null, new C17451f(FeeRemote$$serializer.INSTANCE), null, null, null};

    /* renamed from: a  reason: collision with root package name */
    private final String f95416a;

    /* renamed from: b  reason: collision with root package name */
    private final String f95417b;

    /* renamed from: c  reason: collision with root package name */
    private final String f95418c;

    /* renamed from: d  reason: collision with root package name */
    private final String f95419d;

    /* renamed from: e  reason: collision with root package name */
    private final List<FeeRemote> f95420e;

    /* renamed from: f  reason: collision with root package name */
    private final Double f95421f;

    /* renamed from: g  reason: collision with root package name */
    private final Double f95422g;

    /* renamed from: h  reason: collision with root package name */
    private final String f95423h;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/product/ProductPriceRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/remotemodel/product/ProductPriceRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<ProductPriceRemote> serializer() {
            return ProductPriceRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ProductPriceRemote(int i10, String str, String str2, String str3, String str4, List list, Double d10, Double d11, String str5, T0 t02) {
        if (255 != (i10 & 255)) {
            E0.b(i10, 255, ProductPriceRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f95416a = str;
        this.f95417b = str2;
        this.f95418c = str3;
        this.f95419d = str4;
        this.f95420e = list;
        this.f95421f = d10;
        this.f95422g = d11;
        this.f95423h = str5;
    }

    public static final /* synthetic */ void g(ProductPriceRemote productPriceRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f95415i;
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 0, y02, productPriceRemote.f95416a);
        dVar.B(serialDescriptor, 1, y02, productPriceRemote.f95417b);
        dVar.B(serialDescriptor, 2, y02, productPriceRemote.f95418c);
        dVar.B(serialDescriptor, 3, y02, productPriceRemote.f95419d);
        dVar.B(serialDescriptor, 4, kSerializerArr[4], productPriceRemote.f95420e);
        C17438C c10 = C17438C.f144010a;
        dVar.B(serialDescriptor, 5, c10, productPriceRemote.f95421f);
        dVar.B(serialDescriptor, 6, c10, productPriceRemote.f95422g);
        dVar.B(serialDescriptor, 7, y02, productPriceRemote.f95423h);
    }

    public final Price b() {
        List n10;
        String str;
        List<FeeRemote> list = this.f95420e;
        if (list != null) {
            Iterable<FeeRemote> iterable = list;
            n10 = new ArrayList(C16877v.y(iterable, 10));
            for (FeeRemote f10 : iterable) {
                n10.add(f10.f());
            }
        } else {
            n10 = C16877v.n();
        }
        List list2 = n10;
        String str2 = this.f95416a;
        if (str2 != null) {
            String str3 = this.f95417b;
            if (str3 != null) {
                String str4 = this.f95418c;
                String str5 = this.f95419d;
                Double d10 = this.f95421f;
                if (d10 != null) {
                    double doubleValue = d10.doubleValue();
                    String str6 = this.f95423h;
                    if (str6 != null) {
                        str = "/" + str6;
                    } else {
                        str = null;
                    }
                    return new Price(str2, str3, str4, str5, doubleValue, list2, str);
                }
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final List<FeeRemote> c() {
        return this.f95420e;
    }

    public final Double d() {
        return this.f95421f;
    }

    public final Double e() {
        return this.f95422g;
    }

    public final String f() {
        return this.f95423h;
    }
}
