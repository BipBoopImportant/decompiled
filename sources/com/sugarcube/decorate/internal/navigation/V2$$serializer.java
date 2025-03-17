package com.sugarcube.decorate.internal.navigation;

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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sugarcube/decorate/internal/navigation/V2.$serializer", "LjK/N;", "Lcom/sugarcube/decorate/internal/navigation/V2;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sugarcube/decorate/internal/navigation/V2;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sugarcube/decorate/internal/navigation/V2;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "shared_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class V2$$serializer implements N<V2> {
    public static final V2$$serializer INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    public static final int f126143a = 8;
    private static final SerialDescriptor descriptor;

    static {
        V2$$serializer v2$$serializer = new V2$$serializer();
        INSTANCE = v2$$serializer;
        J0 j02 = new J0("com.sugarcube.decorate.internal.navigation.V2", v2$$serializer, 3);
        j02.p("sceneUuid", false);
        j02.p("compositionUuid", true);
        j02.p("furniture", true);
        descriptor = j02;
    }

    private V2$$serializer() {
    }

    /* renamed from: b */
    public final V2 deserialize(Decoder decoder) {
        List list;
        String str;
        String str2;
        int i10;
        Decoder decoder2 = decoder;
        C17542s.j(decoder2, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        C17394c b10 = decoder2.b(serialDescriptor);
        KSerializer[] a10 = V2.f126139e;
        String str3 = null;
        if (b10.q()) {
            String n10 = b10.n(serialDescriptor, 0);
            list = (List) b10.A(serialDescriptor, 2, a10[2], null);
            str2 = n10;
            i10 = 7;
            str = (String) b10.A(serialDescriptor, 1, Y0.f144077a, null);
        } else {
            boolean z10 = true;
            int i11 = 0;
            String str4 = null;
            List list2 = null;
            while (z10) {
                int p10 = b10.p(serialDescriptor);
                if (p10 == -1) {
                    z10 = false;
                } else if (p10 == 0) {
                    str3 = b10.n(serialDescriptor, 0);
                    i11 |= 1;
                } else if (p10 == 1) {
                    str4 = (String) b10.A(serialDescriptor, 1, Y0.f144077a, str4);
                    i11 |= 2;
                } else if (p10 == 2) {
                    list2 = (List) b10.A(serialDescriptor, 2, a10[2], list2);
                    i11 |= 4;
                } else {
                    throw new C17247E(p10);
                }
            }
            i10 = i11;
            str2 = str3;
            str = str4;
            list = list2;
        }
        b10.c(serialDescriptor);
        return new V2(i10, str2, str, list, (T0) null);
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, V2 v22) {
        C17542s.j(encoder, "encoder");
        C17542s.j(v22, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        V2.e(v22, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer[] a10 = V2.f126139e;
        Y0 y02 = Y0.f144077a;
        return new KSerializer[]{y02, C17294a.u(y02), C17294a.u(a10[2])};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
