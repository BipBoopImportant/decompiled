package com.ingka.ikea.shoppinglist.listpicker.navigation;

import Ae.k;
import XH.C16814e;
import com.ingka.ikea.analytics.Interaction$Component;
import com.ingka.ikea.shoppinglist.listpicker.navigation.ListPickerNavigation;
import fK.C17247E;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation.Operation.Analytics.$serializer", "LjK/N;", "Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$Operation$Analytics;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$Operation$Analytics;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$Operation$Analytics;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "listpicker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class ListPickerNavigation$Operation$Analytics$$serializer implements N<ListPickerNavigation.Operation.Analytics> {
    public static final ListPickerNavigation$Operation$Analytics$$serializer INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    public static final int f120361a = 8;
    private static final SerialDescriptor descriptor;

    static {
        ListPickerNavigation$Operation$Analytics$$serializer listPickerNavigation$Operation$Analytics$$serializer = new ListPickerNavigation$Operation$Analytics$$serializer();
        INSTANCE = listPickerNavigation$Operation$Analytics$$serializer;
        J0 j02 = new J0("com.ingka.ikea.shoppinglist.listpicker.navigation.ListPickerNavigation.Operation.Analytics", listPickerNavigation$Operation$Analytics$$serializer, 2);
        j02.p("component", false);
        j02.p("action_type", false);
        descriptor = j02;
    }

    private ListPickerNavigation$Operation$Analytics$$serializer() {
    }

    /* renamed from: b */
    public final ListPickerNavigation.Operation.Analytics deserialize(Decoder decoder) {
        int i10;
        Interaction$Component interaction$Component;
        k kVar;
        C17542s.j(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        C17394c b10 = decoder.b(serialDescriptor);
        KSerializer[] a10 = ListPickerNavigation.Operation.Analytics.f120372c;
        if (b10.q()) {
            interaction$Component = (Interaction$Component) b10.o(serialDescriptor, 0, a10[0], null);
            kVar = (k) b10.o(serialDescriptor, 1, a10[1], null);
            i10 = 3;
        } else {
            boolean z10 = true;
            int i11 = 0;
            k kVar2 = null;
            Interaction$Component interaction$Component2 = null;
            while (z10) {
                int p10 = b10.p(serialDescriptor);
                if (p10 == -1) {
                    z10 = false;
                } else if (p10 == 0) {
                    interaction$Component2 = (Interaction$Component) b10.o(serialDescriptor, 0, a10[0], interaction$Component2);
                    i11 |= 1;
                } else if (p10 == 1) {
                    kVar2 = (k) b10.o(serialDescriptor, 1, a10[1], kVar2);
                    i11 |= 2;
                } else {
                    throw new C17247E(p10);
                }
            }
            kVar = kVar2;
            interaction$Component = interaction$Component2;
            i10 = i11;
        }
        b10.c(serialDescriptor);
        return new ListPickerNavigation.Operation.Analytics(i10, interaction$Component, kVar, (T0) null);
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, ListPickerNavigation.Operation.Analytics analytics) {
        C17542s.j(encoder, "encoder");
        C17542s.j(analytics, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        ListPickerNavigation.Operation.Analytics.d(analytics, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] a10 = ListPickerNavigation.Operation.Analytics.f120372c;
        return new KSerializer[]{a10[0], a10[1]};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
