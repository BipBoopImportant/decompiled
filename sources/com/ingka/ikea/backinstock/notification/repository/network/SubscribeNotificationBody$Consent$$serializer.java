package com.ingka.ikea.backinstock.notification.repository.network;

import XH.C16814e;
import com.ingka.ikea.backinstock.notification.repository.network.SubscribeNotificationBody;
import fK.C17247E;
import iK.C17394c;
import iK.C17395d;
import jK.C17457i;
import jK.J0;
import jK.N;
import jK.T0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/backinstock/notification/repository/network/SubscribeNotificationBody.Consent.$serializer", "LjK/N;", "Lcom/ingka/ikea/backinstock/notification/repository/network/SubscribeNotificationBody$Consent;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/backinstock/notification/repository/network/SubscribeNotificationBody$Consent;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/backinstock/notification/repository/network/SubscribeNotificationBody$Consent;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "backinstock-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class SubscribeNotificationBody$Consent$$serializer implements N<SubscribeNotificationBody.Consent> {
    public static final SubscribeNotificationBody$Consent$$serializer INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    public static final int f93109a = 8;
    private static final SerialDescriptor descriptor;

    static {
        SubscribeNotificationBody$Consent$$serializer subscribeNotificationBody$Consent$$serializer = new SubscribeNotificationBody$Consent$$serializer();
        INSTANCE = subscribeNotificationBody$Consent$$serializer;
        J0 j02 = new J0("com.ingka.ikea.backinstock.notification.repository.network.SubscribeNotificationBody.Consent", subscribeNotificationBody$Consent$$serializer, 2);
        j02.p("notification", false);
        j02.p("marketing", false);
        descriptor = j02;
    }

    private SubscribeNotificationBody$Consent$$serializer() {
    }

    /* renamed from: b */
    public final SubscribeNotificationBody.Consent deserialize(Decoder decoder) {
        int i10;
        boolean z10;
        boolean z11;
        C17542s.j(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        C17394c b10 = decoder.b(serialDescriptor);
        if (b10.q()) {
            z11 = b10.D(serialDescriptor, 0);
            z10 = b10.D(serialDescriptor, 1);
            i10 = 3;
        } else {
            boolean z12 = true;
            z11 = false;
            boolean z13 = false;
            int i11 = 0;
            while (z12) {
                int p10 = b10.p(serialDescriptor);
                if (p10 == -1) {
                    z12 = false;
                } else if (p10 == 0) {
                    z11 = b10.D(serialDescriptor, 0);
                    i11 |= 1;
                } else if (p10 == 1) {
                    z13 = b10.D(serialDescriptor, 1);
                    i11 |= 2;
                } else {
                    throw new C17247E(p10);
                }
            }
            z10 = z13;
            i10 = i11;
        }
        b10.c(serialDescriptor);
        return new SubscribeNotificationBody.Consent(i10, z11, z10, (T0) null);
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, SubscribeNotificationBody.Consent consent) {
        C17542s.j(encoder, "encoder");
        C17542s.j(consent, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        SubscribeNotificationBody.Consent.a(consent, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        C17457i iVar = C17457i.f144111a;
        return new KSerializer[]{iVar, iVar};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
