package com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response;

import XH.C16814e;
import com.oppwa.mobile.connect.checkout.uicomponent.UiComponentContainer;
import fK.C17247E;
import gK.C17294a;
import iK.C17394c;
import iK.C17395d;
import jK.J0;
import jK.N;
import jK.T0;
import jK.X;
import jK.Y0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ApiErrorDataModelEnhanced.$serializer", "LjK/N;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ApiErrorDataModelEnhanced;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ApiErrorDataModelEnhanced;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ApiErrorDataModelEnhanced;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class ApiErrorDataModelEnhanced$$serializer implements N<ApiErrorDataModelEnhanced> {
    public static final ApiErrorDataModelEnhanced$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ApiErrorDataModelEnhanced$$serializer apiErrorDataModelEnhanced$$serializer = new ApiErrorDataModelEnhanced$$serializer();
        INSTANCE = apiErrorDataModelEnhanced$$serializer;
        J0 j02 = new J0("com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ApiErrorDataModelEnhanced", apiErrorDataModelEnhanced$$serializer, 3);
        j02.p("code", false);
        j02.p(UiComponentContainer.RESULT_ERROR, false);
        j02.p("message", false);
        descriptor = j02;
    }

    private ApiErrorDataModelEnhanced$$serializer() {
    }

    /* renamed from: b */
    public final ApiErrorDataModelEnhanced deserialize(Decoder decoder) {
        List list;
        String str;
        int i10;
        int i11;
        Decoder decoder2 = decoder;
        C17542s.j(decoder2, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        C17394c b10 = decoder2.b(serialDescriptor);
        KSerializer[] a10 = ApiErrorDataModelEnhanced.f119949d;
        if (b10.q()) {
            int j10 = b10.j(serialDescriptor, 0);
            list = (List) b10.A(serialDescriptor, 2, a10[2], null);
            i10 = j10;
            i11 = 7;
            str = (String) b10.A(serialDescriptor, 1, Y0.f144077a, null);
        } else {
            boolean z10 = true;
            int i12 = 0;
            String str2 = null;
            List list2 = null;
            int i13 = 0;
            while (z10) {
                int p10 = b10.p(serialDescriptor);
                if (p10 == -1) {
                    z10 = false;
                } else if (p10 == 0) {
                    i12 = b10.j(serialDescriptor, 0);
                    i13 |= 1;
                } else if (p10 == 1) {
                    str2 = (String) b10.A(serialDescriptor, 1, Y0.f144077a, str2);
                    i13 |= 2;
                } else if (p10 == 2) {
                    list2 = (List) b10.A(serialDescriptor, 2, a10[2], list2);
                    i13 |= 4;
                } else {
                    throw new C17247E(p10);
                }
            }
            i10 = i12;
            i11 = i13;
            str = str2;
            list = list2;
        }
        b10.c(serialDescriptor);
        return new ApiErrorDataModelEnhanced(i11, i10, str, list, (T0) null);
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, ApiErrorDataModelEnhanced apiErrorDataModelEnhanced) {
        C17542s.j(encoder, "encoder");
        C17542s.j(apiErrorDataModelEnhanced, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        ApiErrorDataModelEnhanced.e(apiErrorDataModelEnhanced, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer[] a10 = ApiErrorDataModelEnhanced.f119949d;
        return new KSerializer[]{X.f144073a, C17294a.u(Y0.f144077a), C17294a.u(a10[2])};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
