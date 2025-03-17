package com.ingka.ikea.purchasehistorydata.impl.data.remote;

import XH.C16814e;
import com.ingka.ikea.purchasehistorydata.impl.data.remote.OrderActionRemote;
import fK.C17247E;
import gK.C17294a;
import iK.C17394c;
import iK.C17395d;
import jK.C17457i;
import jK.J0;
import jK.N;
import jK.T0;
import jK.Y0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/purchasehistorydata/impl/data/remote/OrderActionRemote.Action.$serializer", "LjK/N;", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/OrderActionRemote$Action;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/OrderActionRemote$Action;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/OrderActionRemote$Action;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "purchasehistorydata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class OrderActionRemote$Action$$serializer implements N<OrderActionRemote.Action> {
    public static final OrderActionRemote$Action$$serializer INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    public static final int f119521a = 8;
    private static final SerialDescriptor descriptor;

    static {
        OrderActionRemote$Action$$serializer orderActionRemote$Action$$serializer = new OrderActionRemote$Action$$serializer();
        INSTANCE = orderActionRemote$Action$$serializer;
        J0 j02 = new J0("com.ingka.ikea.purchasehistorydata.impl.data.remote.OrderActionRemote.Action", orderActionRemote$Action$$serializer, 4);
        j02.p("enabled", false);
        j02.p("doable", false);
        j02.p("token", false);
        j02.p("reasonCodes", false);
        descriptor = j02;
    }

    private OrderActionRemote$Action$$serializer() {
    }

    /* renamed from: b */
    public final OrderActionRemote.Action deserialize(Decoder decoder) {
        List list;
        String str;
        Boolean bool;
        Boolean bool2;
        int i10;
        Decoder decoder2 = decoder;
        C17542s.j(decoder2, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        C17394c b10 = decoder2.b(serialDescriptor);
        KSerializer[] a10 = OrderActionRemote.Action.f119524f;
        Boolean bool3 = null;
        if (b10.q()) {
            C17457i iVar = C17457i.f144111a;
            list = (List) b10.A(serialDescriptor, 3, a10[3], null);
            bool = (Boolean) b10.A(serialDescriptor, 1, iVar, null);
            str = (String) b10.A(serialDescriptor, 2, Y0.f144077a, null);
            i10 = 15;
            bool2 = (Boolean) b10.A(serialDescriptor, 0, iVar, null);
        } else {
            boolean z10 = true;
            int i11 = 0;
            Boolean bool4 = null;
            String str2 = null;
            List list2 = null;
            while (z10) {
                int p10 = b10.p(serialDescriptor);
                if (p10 == -1) {
                    z10 = false;
                } else if (p10 == 0) {
                    bool3 = (Boolean) b10.A(serialDescriptor, 0, C17457i.f144111a, bool3);
                    i11 |= 1;
                } else if (p10 == 1) {
                    bool4 = (Boolean) b10.A(serialDescriptor, 1, C17457i.f144111a, bool4);
                    i11 |= 2;
                } else if (p10 == 2) {
                    str2 = (String) b10.A(serialDescriptor, 2, Y0.f144077a, str2);
                    i11 |= 4;
                } else if (p10 == 3) {
                    list2 = (List) b10.A(serialDescriptor, 3, a10[3], list2);
                    i11 |= 8;
                } else {
                    throw new C17247E(p10);
                }
            }
            i10 = i11;
            bool2 = bool3;
            bool = bool4;
            str = str2;
            list = list2;
        }
        b10.c(serialDescriptor);
        return new OrderActionRemote.Action(i10, bool2, bool, str, list, (T0) null);
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, OrderActionRemote.Action action) {
        C17542s.j(encoder, "encoder");
        C17542s.j(action, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        OrderActionRemote.Action.d(action, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer[] a10 = OrderActionRemote.Action.f119524f;
        C17457i iVar = C17457i.f144111a;
        return new KSerializer[]{C17294a.u(iVar), C17294a.u(iVar), C17294a.u(Y0.f144077a), C17294a.u(a10[3])};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
