package com.ingka.ikea.browseandsearch.browse.datalayer.impl.remote.models;

import XH.C16814e;
import com.ingka.ikea.core.remotemodel.CategoriesRemote;
import com.ingka.ikea.core.remotemodel.CategoriesRemote$$serializer;
import com.ingka.ikea.core.remotemodel.product.ProductCarouselRemote;
import com.ingka.ikea.core.remotemodel.product.ProductCarouselRemote$$serializer;
import fK.C17247E;
import gK.C17294a;
import iK.C17394c;
import iK.C17395d;
import jK.J0;
import jK.N;
import jK.T0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/browseandsearch/browse/datalayer/impl/remote/models/BrowseContentRemote.$serializer", "LjK/N;", "Lcom/ingka/ikea/browseandsearch/browse/datalayer/impl/remote/models/BrowseContentRemote;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/browseandsearch/browse/datalayer/impl/remote/models/BrowseContentRemote;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/browseandsearch/browse/datalayer/impl/remote/models/BrowseContentRemote;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class BrowseContentRemote$$serializer implements N<BrowseContentRemote> {
    public static final BrowseContentRemote$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        BrowseContentRemote$$serializer browseContentRemote$$serializer = new BrowseContentRemote$$serializer();
        INSTANCE = browseContentRemote$$serializer;
        J0 j02 = new J0("com.ingka.ikea.browseandsearch.browse.datalayer.impl.remote.models.BrowseContentRemote", browseContentRemote$$serializer, 3);
        j02.p("categories", false);
        j02.p("rooms", false);
        j02.p("promotion", false);
        descriptor = j02;
    }

    private BrowseContentRemote$$serializer() {
    }

    /* renamed from: b */
    public final BrowseContentRemote deserialize(Decoder decoder) {
        ProductCarouselRemote productCarouselRemote;
        CategoriesRemote categoriesRemote;
        CategoriesRemote categoriesRemote2;
        int i10;
        Decoder decoder2 = decoder;
        C17542s.j(decoder2, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        C17394c b10 = decoder2.b(serialDescriptor);
        CategoriesRemote categoriesRemote3 = null;
        if (b10.q()) {
            CategoriesRemote$$serializer categoriesRemote$$serializer = CategoriesRemote$$serializer.INSTANCE;
            categoriesRemote = (CategoriesRemote) b10.A(serialDescriptor, 1, categoriesRemote$$serializer, null);
            productCarouselRemote = (ProductCarouselRemote) b10.A(serialDescriptor, 2, ProductCarouselRemote$$serializer.INSTANCE, null);
            i10 = 7;
            categoriesRemote2 = (CategoriesRemote) b10.A(serialDescriptor, 0, categoriesRemote$$serializer, null);
        } else {
            boolean z10 = true;
            int i11 = 0;
            CategoriesRemote categoriesRemote4 = null;
            ProductCarouselRemote productCarouselRemote2 = null;
            while (z10) {
                int p10 = b10.p(serialDescriptor);
                if (p10 == -1) {
                    z10 = false;
                } else if (p10 == 0) {
                    categoriesRemote3 = (CategoriesRemote) b10.A(serialDescriptor, 0, CategoriesRemote$$serializer.INSTANCE, categoriesRemote3);
                    i11 |= 1;
                } else if (p10 == 1) {
                    categoriesRemote4 = (CategoriesRemote) b10.A(serialDescriptor, 1, CategoriesRemote$$serializer.INSTANCE, categoriesRemote4);
                    i11 |= 2;
                } else if (p10 == 2) {
                    productCarouselRemote2 = (ProductCarouselRemote) b10.A(serialDescriptor, 2, ProductCarouselRemote$$serializer.INSTANCE, productCarouselRemote2);
                    i11 |= 4;
                } else {
                    throw new C17247E(p10);
                }
            }
            i10 = i11;
            categoriesRemote2 = categoriesRemote3;
            categoriesRemote = categoriesRemote4;
            productCarouselRemote = productCarouselRemote2;
        }
        b10.c(serialDescriptor);
        return new BrowseContentRemote(i10, categoriesRemote2, categoriesRemote, productCarouselRemote, (T0) null);
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, BrowseContentRemote browseContentRemote) {
        C17542s.j(encoder, "encoder");
        C17542s.j(browseContentRemote, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        BrowseContentRemote.b(browseContentRemote, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        CategoriesRemote$$serializer categoriesRemote$$serializer = CategoriesRemote$$serializer.INSTANCE;
        return new KSerializer[]{C17294a.u(categoriesRemote$$serializer), C17294a.u(categoriesRemote$$serializer), C17294a.u(ProductCarouselRemote$$serializer.INSTANCE)};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
