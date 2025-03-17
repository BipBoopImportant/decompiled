package com.sugarcube.app.base.navigation;

import XH.C16814e;
import com.sugarcube.app.base.navigation.Kreativ;
import fK.C17247E;
import gK.C17294a;
import iK.C17394c;
import iK.C17395d;
import jK.C17457i;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sugarcube/app/base/navigation/Kreativ.Decorate.$serializer", "LjK/N;", "Lcom/sugarcube/app/base/navigation/Kreativ$Decorate;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sugarcube/app/base/navigation/Kreativ$Decorate;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sugarcube/app/base/navigation/Kreativ$Decorate;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class Kreativ$Decorate$$serializer implements N<Kreativ.Decorate> {
    public static final Kreativ$Decorate$$serializer INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    public static final int f123107a = 8;
    private static final SerialDescriptor descriptor;

    static {
        Kreativ$Decorate$$serializer kreativ$Decorate$$serializer = new Kreativ$Decorate$$serializer();
        INSTANCE = kreativ$Decorate$$serializer;
        J0 j02 = new J0("com.sugarcube.app.base.navigation.Kreativ.Decorate", kreativ$Decorate$$serializer, 5);
        j02.p("sceneUuid", false);
        j02.p("compositionUuid", true);
        j02.p("sceneDeprecatedId", true);
        j02.p("sceneIsNewDesign", true);
        j02.p("furniture", true);
        descriptor = j02;
    }

    private Kreativ$Decorate$$serializer() {
    }

    /* renamed from: b */
    public final Kreativ.Decorate deserialize(Decoder decoder) {
        String str;
        boolean z10;
        int i10;
        String str2;
        String str3;
        int i11;
        Decoder decoder2 = decoder;
        C17542s.j(decoder2, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        C17394c b10 = decoder2.b(serialDescriptor);
        if (b10.q()) {
            String n10 = b10.n(serialDescriptor, 0);
            Y0 y02 = Y0.f144077a;
            int j10 = b10.j(serialDescriptor, 2);
            str3 = n10;
            z10 = b10.D(serialDescriptor, 3);
            str = (String) b10.A(serialDescriptor, 4, y02, null);
            i10 = j10;
            str2 = (String) b10.A(serialDescriptor, 1, y02, null);
            i11 = 31;
        } else {
            boolean z11 = true;
            boolean z12 = false;
            int i12 = 0;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            int i13 = 0;
            while (z11) {
                int p10 = b10.p(serialDescriptor);
                if (p10 == -1) {
                    z11 = false;
                } else if (p10 == 0) {
                    str4 = b10.n(serialDescriptor, 0);
                    i12 |= 1;
                } else if (p10 == 1) {
                    str5 = (String) b10.A(serialDescriptor, 1, Y0.f144077a, str5);
                    i12 |= 2;
                } else if (p10 == 2) {
                    i13 = b10.j(serialDescriptor, 2);
                    i12 |= 4;
                } else if (p10 == 3) {
                    z12 = b10.D(serialDescriptor, 3);
                    i12 |= 8;
                } else if (p10 == 4) {
                    str6 = (String) b10.A(serialDescriptor, 4, Y0.f144077a, str6);
                    i12 |= 16;
                } else {
                    throw new C17247E(p10);
                }
            }
            z10 = z12;
            i10 = i13;
            i11 = i12;
            str3 = str4;
            str2 = str5;
            str = str6;
        }
        b10.c(serialDescriptor);
        return new Kreativ.Decorate(i11, str3, str2, i10, z10, str, (T0) null);
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, Kreativ.Decorate decorate) {
        C17542s.j(encoder, "encoder");
        C17542s.j(decorate, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        Kreativ.Decorate.f(decorate, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        Y0 y02 = Y0.f144077a;
        return new KSerializer[]{y02, C17294a.u(y02), X.f144073a, C17457i.f144111a, C17294a.u(y02)};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
