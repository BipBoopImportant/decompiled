package com.ingka.ikea.app.shoppinglist.navigation;

import XH.C16814e;
import fK.C17247E;
import iK.C17394c;
import iK.C17395d;
import jK.C17457i;
import jK.J0;
import jK.N;
import jK.T0;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/app/shoppinglist/navigation/ShoppingListsRoutes.ListDetails.$serializer", "LjK/N;", "Lcom/ingka/ikea/app/shoppinglist/navigation/ShoppingListsRoutes$ListDetails;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/app/shoppinglist/navigation/ShoppingListsRoutes$ListDetails;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/app/shoppinglist/navigation/ShoppingListsRoutes$ListDetails;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class ShoppingListsRoutes$ListDetails$$serializer implements N<ShoppingListsRoutes$ListDetails> {
    public static final ShoppingListsRoutes$ListDetails$$serializer INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    public static final int f92364a = 8;
    private static final SerialDescriptor descriptor;

    static {
        ShoppingListsRoutes$ListDetails$$serializer shoppingListsRoutes$ListDetails$$serializer = new ShoppingListsRoutes$ListDetails$$serializer();
        INSTANCE = shoppingListsRoutes$ListDetails$$serializer;
        J0 j02 = new J0("com.ingka.ikea.app.shoppinglist.navigation.ShoppingListsRoutes.ListDetails", shoppingListsRoutes$ListDetails$$serializer, 2);
        j02.p("listId", false);
        j02.p("selectInStoreMode", false);
        descriptor = j02;
    }

    private ShoppingListsRoutes$ListDetails$$serializer() {
    }

    /* renamed from: b */
    public final ShoppingListsRoutes$ListDetails deserialize(Decoder decoder) {
        int i10;
        boolean z10;
        String str;
        C17542s.j(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        C17394c b10 = decoder.b(serialDescriptor);
        if (b10.q()) {
            str = b10.n(serialDescriptor, 0);
            z10 = b10.D(serialDescriptor, 1);
            i10 = 3;
        } else {
            boolean z11 = true;
            boolean z12 = false;
            int i11 = 0;
            str = null;
            while (z11) {
                int p10 = b10.p(serialDescriptor);
                if (p10 == -1) {
                    z11 = false;
                } else if (p10 == 0) {
                    str = b10.n(serialDescriptor, 0);
                    i11 |= 1;
                } else if (p10 == 1) {
                    z12 = b10.D(serialDescriptor, 1);
                    i11 |= 2;
                } else {
                    throw new C17247E(p10);
                }
            }
            z10 = z12;
            i10 = i11;
        }
        b10.c(serialDescriptor);
        return new ShoppingListsRoutes$ListDetails(i10, str, z10, (T0) null);
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, ShoppingListsRoutes$ListDetails shoppingListsRoutes$ListDetails) {
        C17542s.j(encoder, "encoder");
        C17542s.j(shoppingListsRoutes$ListDetails, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        ShoppingListsRoutes$ListDetails.c(shoppingListsRoutes$ListDetails, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{Y0.f144077a, C17457i.f144111a};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
