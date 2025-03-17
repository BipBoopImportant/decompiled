package com.ingka.ikea.mcomsettings.impl.network;

import XH.C16814e;
import com.ingka.ikea.mcomsettings.impl.network.SurveyConfigRemote;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/mcomsettings/impl/network/SurveyConfigRemote.SurveyQuestionRemote.$serializer", "LjK/N;", "Lcom/ingka/ikea/mcomsettings/impl/network/SurveyConfigRemote$SurveyQuestionRemote;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/mcomsettings/impl/network/SurveyConfigRemote$SurveyQuestionRemote;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/mcomsettings/impl/network/SurveyConfigRemote$SurveyQuestionRemote;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "mcomsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class SurveyConfigRemote$SurveyQuestionRemote$$serializer implements N<SurveyConfigRemote.SurveyQuestionRemote> {
    public static final SurveyConfigRemote$SurveyQuestionRemote$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SurveyConfigRemote$SurveyQuestionRemote$$serializer surveyConfigRemote$SurveyQuestionRemote$$serializer = new SurveyConfigRemote$SurveyQuestionRemote$$serializer();
        INSTANCE = surveyConfigRemote$SurveyQuestionRemote$$serializer;
        J0 j02 = new J0("com.ingka.ikea.mcomsettings.impl.network.SurveyConfigRemote.SurveyQuestionRemote", surveyConfigRemote$SurveyQuestionRemote$$serializer, 4);
        j02.p("id", false);
        j02.p("title", false);
        j02.p("minRating", false);
        j02.p("maxRating", false);
        descriptor = j02;
    }

    private SurveyConfigRemote$SurveyQuestionRemote$$serializer() {
    }

    /* renamed from: b */
    public final SurveyConfigRemote.SurveyQuestionRemote deserialize(Decoder decoder) {
        Integer num;
        Integer num2;
        String str;
        String str2;
        int i10;
        Decoder decoder2 = decoder;
        C17542s.j(decoder2, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        C17394c b10 = decoder2.b(serialDescriptor);
        String str3 = null;
        if (b10.q()) {
            Y0 y02 = Y0.f144077a;
            X x10 = X.f144073a;
            str = (String) b10.A(serialDescriptor, 1, y02, null);
            num = (Integer) b10.A(serialDescriptor, 3, x10, null);
            num2 = (Integer) b10.A(serialDescriptor, 2, x10, null);
            i10 = 15;
            str2 = (String) b10.A(serialDescriptor, 0, y02, null);
        } else {
            boolean z10 = true;
            int i11 = 0;
            String str4 = null;
            Integer num3 = null;
            Integer num4 = null;
            while (z10) {
                int p10 = b10.p(serialDescriptor);
                if (p10 == -1) {
                    z10 = false;
                } else if (p10 == 0) {
                    str3 = (String) b10.A(serialDescriptor, 0, Y0.f144077a, str3);
                    i11 |= 1;
                } else if (p10 == 1) {
                    str4 = (String) b10.A(serialDescriptor, 1, Y0.f144077a, str4);
                    i11 |= 2;
                } else if (p10 == 2) {
                    num3 = (Integer) b10.A(serialDescriptor, 2, X.f144073a, num3);
                    i11 |= 4;
                } else if (p10 == 3) {
                    num4 = (Integer) b10.A(serialDescriptor, 3, X.f144073a, num4);
                    i11 |= 8;
                } else {
                    throw new C17247E(p10);
                }
            }
            i10 = i11;
            str2 = str3;
            str = str4;
            num2 = num3;
            num = num4;
        }
        b10.c(serialDescriptor);
        return new SurveyConfigRemote.SurveyQuestionRemote(i10, str2, str, num2, num, (T0) null);
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, SurveyConfigRemote.SurveyQuestionRemote surveyQuestionRemote) {
        C17542s.j(encoder, "encoder");
        C17542s.j(surveyQuestionRemote, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        SurveyConfigRemote.SurveyQuestionRemote.b(surveyQuestionRemote, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        Y0 y02 = Y0.f144077a;
        KSerializer<?> u10 = C17294a.u(y02);
        KSerializer<?> u11 = C17294a.u(y02);
        X x10 = X.f144073a;
        return new KSerializer[]{u10, u11, C17294a.u(x10), C17294a.u(x10)};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
