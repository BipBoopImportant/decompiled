package com.ingka.ikea.familyrewards.datalayer.impl.remote;

import XH.C16814e;
import fK.C17247E;
import gK.C17294a;
import iK.C17394c;
import iK.C17395d;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/familyrewards/datalayer/impl/remote/FamilyCustomerRewardRemote.$serializer", "LjK/N;", "Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/FamilyCustomerRewardRemote;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/FamilyCustomerRewardRemote;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/FamilyCustomerRewardRemote;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "familyrewards-datalayer-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class FamilyCustomerRewardRemote$$serializer implements N<FamilyCustomerRewardRemote> {
    public static final FamilyCustomerRewardRemote$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        FamilyCustomerRewardRemote$$serializer familyCustomerRewardRemote$$serializer = new FamilyCustomerRewardRemote$$serializer();
        INSTANCE = familyCustomerRewardRemote$$serializer;
        J0 j02 = new J0("com.ingka.ikea.familyrewards.datalayer.impl.remote.FamilyCustomerRewardRemote", familyCustomerRewardRemote$$serializer, 3);
        j02.p("title", false);
        j02.p("balance", false);
        j02.p("rewards", false);
        descriptor = j02;
    }

    private FamilyCustomerRewardRemote$$serializer() {
    }

    /* renamed from: b */
    public final FamilyCustomerRewardRemote deserialize(Decoder decoder) {
        List list;
        FamilyCustomerRewardBalanceRemote familyCustomerRewardBalanceRemote;
        String str;
        int i10;
        Decoder decoder2 = decoder;
        C17542s.j(decoder2, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        C17394c b10 = decoder2.b(serialDescriptor);
        KSerializer[] a10 = FamilyCustomerRewardRemote.f95810d;
        String str2 = null;
        if (b10.q()) {
            list = (List) b10.A(serialDescriptor, 2, a10[2], null);
            str = (String) b10.A(serialDescriptor, 0, Y0.f144077a, null);
            i10 = 7;
            familyCustomerRewardBalanceRemote = (FamilyCustomerRewardBalanceRemote) b10.A(serialDescriptor, 1, FamilyCustomerRewardBalanceRemote$$serializer.INSTANCE, null);
        } else {
            boolean z10 = true;
            int i11 = 0;
            FamilyCustomerRewardBalanceRemote familyCustomerRewardBalanceRemote2 = null;
            List list2 = null;
            while (z10) {
                int p10 = b10.p(serialDescriptor);
                if (p10 == -1) {
                    z10 = false;
                } else if (p10 == 0) {
                    str2 = (String) b10.A(serialDescriptor, 0, Y0.f144077a, str2);
                    i11 |= 1;
                } else if (p10 == 1) {
                    familyCustomerRewardBalanceRemote2 = (FamilyCustomerRewardBalanceRemote) b10.A(serialDescriptor, 1, FamilyCustomerRewardBalanceRemote$$serializer.INSTANCE, familyCustomerRewardBalanceRemote2);
                    i11 |= 2;
                } else if (p10 == 2) {
                    list2 = (List) b10.A(serialDescriptor, 2, a10[2], list2);
                    i11 |= 4;
                } else {
                    throw new C17247E(p10);
                }
            }
            i10 = i11;
            str = str2;
            familyCustomerRewardBalanceRemote = familyCustomerRewardBalanceRemote2;
            list = list2;
        }
        b10.c(serialDescriptor);
        return new FamilyCustomerRewardRemote(i10, str, familyCustomerRewardBalanceRemote, list, (T0) null);
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, FamilyCustomerRewardRemote familyCustomerRewardRemote) {
        C17542s.j(encoder, "encoder");
        C17542s.j(familyCustomerRewardRemote, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        FamilyCustomerRewardRemote.d(familyCustomerRewardRemote, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer[] a10 = FamilyCustomerRewardRemote.f95810d;
        return new KSerializer[]{C17294a.u(Y0.f144077a), C17294a.u(FamilyCustomerRewardBalanceRemote$$serializer.INSTANCE), C17294a.u(a10[2])};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
