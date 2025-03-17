package com.ingka.ikea.shoppinglist.listpicker.navigation;

import XH.C16814e;
import com.ingka.ikea.shoppinglist.listpicker.navigation.ListPickerNavigation;
import fK.C17247E;
import gK.C17294a;
import iK.C17394c;
import iK.C17395d;
import jK.J0;
import jK.N;
import jK.T0;
import jK.X;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation.Operation.AddOrRemove.$serializer", "LjK/N;", "Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$Operation$AddOrRemove;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$Operation$AddOrRemove;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$Operation$AddOrRemove;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "listpicker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class ListPickerNavigation$Operation$AddOrRemove$$serializer implements N<ListPickerNavigation.Operation.AddOrRemove> {
    public static final ListPickerNavigation$Operation$AddOrRemove$$serializer INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    public static final int f120360a = 8;
    private static final SerialDescriptor descriptor;

    static {
        ListPickerNavigation$Operation$AddOrRemove$$serializer listPickerNavigation$Operation$AddOrRemove$$serializer = new ListPickerNavigation$Operation$AddOrRemove$$serializer();
        INSTANCE = listPickerNavigation$Operation$AddOrRemove$$serializer;
        J0 j02 = new J0("com.ingka.ikea.shoppinglist.listpicker.navigation.ListPickerNavigation.Operation.AddOrRemove", listPickerNavigation$Operation$AddOrRemove$$serializer, 4);
        j02.p("product_name", false);
        j02.p("item_no", false);
        j02.p("quantity", true);
        j02.p("analytics", false);
        descriptor = j02;
    }

    private ListPickerNavigation$Operation$AddOrRemove$$serializer() {
    }

    /* renamed from: b */
    public final ListPickerNavigation.Operation.AddOrRemove deserialize(Decoder decoder) {
        ListPickerNavigation.Operation.Analytics analytics;
        int i10;
        String str;
        String str2;
        int i11;
        Decoder decoder2 = decoder;
        C17542s.j(decoder2, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        C17394c b10 = decoder2.b(serialDescriptor);
        if (b10.q()) {
            String n10 = b10.n(serialDescriptor, 1);
            int j10 = b10.j(serialDescriptor, 2);
            str2 = (String) b10.A(serialDescriptor, 0, Y0.f144077a, null);
            analytics = (ListPickerNavigation.Operation.Analytics) b10.o(serialDescriptor, 3, ListPickerNavigation$Operation$Analytics$$serializer.INSTANCE, null);
            i10 = j10;
            str = n10;
            i11 = 15;
        } else {
            boolean z10 = true;
            int i12 = 0;
            String str3 = null;
            String str4 = null;
            ListPickerNavigation.Operation.Analytics analytics2 = null;
            int i13 = 0;
            while (z10) {
                int p10 = b10.p(serialDescriptor);
                if (p10 == -1) {
                    z10 = false;
                } else if (p10 == 0) {
                    str3 = (String) b10.A(serialDescriptor, 0, Y0.f144077a, str3);
                    i13 |= 1;
                } else if (p10 == 1) {
                    str4 = b10.n(serialDescriptor, 1);
                    i13 |= 2;
                } else if (p10 == 2) {
                    i12 = b10.j(serialDescriptor, 2);
                    i13 |= 4;
                } else if (p10 == 3) {
                    analytics2 = (ListPickerNavigation.Operation.Analytics) b10.o(serialDescriptor, 3, ListPickerNavigation$Operation$Analytics$$serializer.INSTANCE, analytics2);
                    i13 |= 8;
                } else {
                    throw new C17247E(p10);
                }
            }
            i10 = i12;
            i11 = i13;
            str2 = str3;
            str = str4;
            analytics = analytics2;
        }
        b10.c(serialDescriptor);
        return new ListPickerNavigation.Operation.AddOrRemove(i11, str2, str, i10, analytics, (T0) null);
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, ListPickerNavigation.Operation.AddOrRemove addOrRemove) {
        C17542s.j(encoder, "encoder");
        C17542s.j(addOrRemove, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        ListPickerNavigation.Operation.AddOrRemove.e(addOrRemove, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        Y0 y02 = Y0.f144077a;
        return new KSerializer[]{C17294a.u(y02), y02, X.f144073a, ListPickerNavigation$Operation$Analytics$$serializer.INSTANCE};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
