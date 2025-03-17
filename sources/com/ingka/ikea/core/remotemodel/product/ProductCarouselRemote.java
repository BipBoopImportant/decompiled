package com.ingka.ikea.core.remotemodel.product;

import HJ.C15854t;
import YH.C16877v;
import com.ingka.ikea.core.model.product.ProductCarousel;
import com.sugarcube.core.logger.DslKt;
import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.E0;
import jK.T0;
import jK.Y0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import pp.C11768b;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@p
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u0000 )2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002*\u001aBI\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u001b\u0012\u0004\b!\u0010\u001f\u001a\u0004\b \u0010\u001dR\"\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u001b\u0012\u0004\b#\u0010\u001f\u001a\u0004\b\"\u0010\u001dR(\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b(\u0010\u001f\u001a\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/product/ProductCarouselRemote;", "Lpp/b;", "Lcom/ingka/ikea/core/model/product/ProductCarousel;", "", "seen0", "", "id", "purpose", "title", "", "Lcom/ingka/ikea/core/remotemodel/product/ProductLiteRemote;", "productsRemote", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/core/remotemodel/product/ProductCarouselRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "b", "()Lcom/ingka/ikea/core/model/product/ProductCarousel;", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getId$annotations", "()V", "getPurpose", "getPurpose$annotations", "getTitle", "getTitle$annotations", "d", "Ljava/util/List;", "getProductsRemote", "()Ljava/util/List;", "getProductsRemote$annotations", "Companion", "$serializer", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ProductCarouselRemote implements C11768b<ProductCarousel> {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final KSerializer<Object>[] f95356e = {null, null, null, new C17451f(ProductLiteRemote$$serializer.INSTANCE)};

    /* renamed from: a  reason: collision with root package name */
    private final String f95357a;

    /* renamed from: b  reason: collision with root package name */
    private final String f95358b;

    /* renamed from: c  reason: collision with root package name */
    private final String f95359c;

    /* renamed from: d  reason: collision with root package name */
    private final List<ProductLiteRemote> f95360d;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/product/ProductCarouselRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/remotemodel/product/ProductCarouselRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<ProductCarouselRemote> serializer() {
            return ProductCarouselRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ProductCarouselRemote(int i10, String str, String str2, String str3, List list, T0 t02) {
        if (15 != (i10 & 15)) {
            E0.b(i10, 15, ProductCarouselRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f95357a = str;
        this.f95358b = str2;
        this.f95359c = str3;
        this.f95360d = list;
    }

    public static final /* synthetic */ void c(ProductCarouselRemote productCarouselRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f95356e;
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 0, y02, productCarouselRemote.f95357a);
        dVar.B(serialDescriptor, 1, y02, productCarouselRemote.f95358b);
        dVar.B(serialDescriptor, 2, y02, productCarouselRemote.f95359c);
        dVar.B(serialDescriptor, 3, kSerializerArr[3], productCarouselRemote.f95360d);
    }

    public ProductCarousel b() {
        List list;
        List<ProductLiteRemote> list2 = this.f95360d;
        if (list2 != null) {
            Iterable<ProductLiteRemote> iterable = list2;
            list = new ArrayList(C16877v.y(iterable, 10));
            for (ProductLiteRemote s10 : iterable) {
                list.add(s10.s());
            }
        } else {
            list = C16877v.n();
        }
        if (list.isEmpty()) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Products are null or empty");
            e eVar = e.WARN;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a((String) null, illegalArgumentException);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = ProductCarouselRemote.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, illegalArgumentException, str3);
                str = str3;
                str2 = str4;
            }
            return null;
        }
        String str5 = this.f95357a;
        if (str5 != null) {
            String str6 = this.f95358b;
            String str7 = this.f95359c;
            if (str7 == null) {
                str7 = "";
            }
            return new ProductCarousel(str5, str6, str7, list);
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
