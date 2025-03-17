package com.ingka.ikea.liveshopping.impl.data.network.model;

import XH.C16814e;
import fK.C17247E;
import iK.C17394c;
import iK.C17395d;
import jK.J0;
import jK.N;
import jK.T0;
import jK.X;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/liveshopping/impl/data/network/model/StatisticsRemote.$serializer", "LjK/N;", "Lcom/ingka/ikea/liveshopping/impl/data/network/model/StatisticsRemote;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/liveshopping/impl/data/network/model/StatisticsRemote;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/liveshopping/impl/data/network/model/StatisticsRemote;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "liveshopping-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class StatisticsRemote$$serializer implements N<StatisticsRemote> {
    public static final StatisticsRemote$$serializer INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    public static final int f96532a = 8;
    private static final SerialDescriptor descriptor;

    static {
        StatisticsRemote$$serializer statisticsRemote$$serializer = new StatisticsRemote$$serializer();
        INSTANCE = statisticsRemote$$serializer;
        J0 j02 = new J0("com.ingka.ikea.liveshopping.impl.data.network.model.StatisticsRemote", statisticsRemote$$serializer, 4);
        j02.p("averageViewingTime", false);
        j02.p("totalLikes", false);
        j02.p("totalViewers", false);
        j02.p("totalViews", false);
        descriptor = j02;
    }

    private StatisticsRemote$$serializer() {
    }

    /* renamed from: b */
    public final StatisticsRemote deserialize(Decoder decoder) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Decoder decoder2 = decoder;
        C17542s.j(decoder2, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        C17394c b10 = decoder2.b(serialDescriptor);
        if (b10.q()) {
            int j10 = b10.j(serialDescriptor, 0);
            int j11 = b10.j(serialDescriptor, 1);
            int j12 = b10.j(serialDescriptor, 2);
            i13 = j10;
            i10 = b10.j(serialDescriptor, 3);
            i11 = j12;
            i12 = j11;
            i14 = 15;
        } else {
            boolean z10 = true;
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            while (z10) {
                int p10 = b10.p(serialDescriptor);
                if (p10 == -1) {
                    z10 = false;
                } else if (p10 == 0) {
                    i15 = b10.j(serialDescriptor, 0);
                    i19 |= 1;
                } else if (p10 == 1) {
                    i18 = b10.j(serialDescriptor, 1);
                    i19 |= 2;
                } else if (p10 == 2) {
                    i17 = b10.j(serialDescriptor, 2);
                    i19 |= 4;
                } else if (p10 == 3) {
                    i16 = b10.j(serialDescriptor, 3);
                    i19 |= 8;
                } else {
                    throw new C17247E(p10);
                }
            }
            i13 = i15;
            i10 = i16;
            i11 = i17;
            i12 = i18;
            i14 = i19;
        }
        b10.c(serialDescriptor);
        return new StatisticsRemote(i14, i13, i12, i11, i10, (T0) null);
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, StatisticsRemote statisticsRemote) {
        C17542s.j(encoder, "encoder");
        C17542s.j(statisticsRemote, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        StatisticsRemote.b(statisticsRemote, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        X x10 = X.f144073a;
        return new KSerializer[]{x10, x10, x10, x10};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
