package com.ingka.ikea.shoppinglist.datalayer.impl.recommendations.remote.model;

import XH.C16814e;
import fK.C17247E;
import iK.C17394c;
import iK.C17395d;
import jK.J0;
import jK.N;
import jK.T0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/shoppinglist/datalayer/impl/recommendations/remote/model/ShoppingListRecommendationsRemote.$serializer", "LjK/N;", "Lcom/ingka/ikea/shoppinglist/datalayer/impl/recommendations/remote/model/ShoppingListRecommendationsRemote;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/shoppinglist/datalayer/impl/recommendations/remote/model/ShoppingListRecommendationsRemote;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/shoppinglist/datalayer/impl/recommendations/remote/model/ShoppingListRecommendationsRemote;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "shoppinglist-datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class ShoppingListRecommendationsRemote$$serializer implements N<ShoppingListRecommendationsRemote> {
    public static final ShoppingListRecommendationsRemote$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ShoppingListRecommendationsRemote$$serializer shoppingListRecommendationsRemote$$serializer = new ShoppingListRecommendationsRemote$$serializer();
        INSTANCE = shoppingListRecommendationsRemote$$serializer;
        J0 j02 = new J0("com.ingka.ikea.shoppinglist.datalayer.impl.recommendations.remote.model.ShoppingListRecommendationsRemote", shoppingListRecommendationsRemote$$serializer, 3);
        j02.p("category", false);
        j02.p("products", false);
        j02.p("inspirationFeed", false);
        descriptor = j02;
    }

    private ShoppingListRecommendationsRemote$$serializer() {
    }

    /* renamed from: b */
    public final ShoppingListRecommendationsRemote deserialize(Decoder decoder) {
        List list;
        List list2;
        CategoryHeaderRemote categoryHeaderRemote;
        int i10;
        Decoder decoder2 = decoder;
        C17542s.j(decoder2, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        C17394c b10 = decoder2.b(serialDescriptor);
        KSerializer[] a10 = ShoppingListRecommendationsRemote.f120305d;
        CategoryHeaderRemote categoryHeaderRemote2 = null;
        if (b10.q()) {
            list = (List) b10.o(serialDescriptor, 2, a10[2], null);
            categoryHeaderRemote = (CategoryHeaderRemote) b10.o(serialDescriptor, 0, CategoryHeaderRemote$$serializer.INSTANCE, null);
            i10 = 7;
            list2 = (List) b10.o(serialDescriptor, 1, a10[1], null);
        } else {
            boolean z10 = true;
            int i11 = 0;
            List list3 = null;
            List list4 = null;
            while (z10) {
                int p10 = b10.p(serialDescriptor);
                if (p10 == -1) {
                    z10 = false;
                } else if (p10 == 0) {
                    categoryHeaderRemote2 = (CategoryHeaderRemote) b10.o(serialDescriptor, 0, CategoryHeaderRemote$$serializer.INSTANCE, categoryHeaderRemote2);
                    i11 |= 1;
                } else if (p10 == 1) {
                    list3 = (List) b10.o(serialDescriptor, 1, a10[1], list3);
                    i11 |= 2;
                } else if (p10 == 2) {
                    list4 = (List) b10.o(serialDescriptor, 2, a10[2], list4);
                    i11 |= 4;
                } else {
                    throw new C17247E(p10);
                }
            }
            i10 = i11;
            categoryHeaderRemote = categoryHeaderRemote2;
            list2 = list3;
            list = list4;
        }
        b10.c(serialDescriptor);
        return new ShoppingListRecommendationsRemote(i10, categoryHeaderRemote, list2, list, (T0) null);
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, ShoppingListRecommendationsRemote shoppingListRecommendationsRemote) {
        C17542s.j(encoder, "encoder");
        C17542s.j(shoppingListRecommendationsRemote, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        ShoppingListRecommendationsRemote.e(shoppingListRecommendationsRemote, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] a10 = ShoppingListRecommendationsRemote.f120305d;
        return new KSerializer[]{CategoryHeaderRemote$$serializer.INSTANCE, a10[1], a10[2]};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
