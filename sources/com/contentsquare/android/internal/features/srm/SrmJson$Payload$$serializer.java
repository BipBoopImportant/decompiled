package com.contentsquare.android.internal.features.srm;

import XH.C16814e;
import fK.C17247E;
import iK.C17394c;
import iK.C17395d;
import jK.J0;
import jK.N;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/contentsquare/android/internal/features/srm/SrmJson.Payload.$serializer", "LjK/N;", "Lcom/contentsquare/android/internal/features/srm/SrmJson$Payload;", "<init>", "()V", "library_release"}, k = 1, mv = {1, 8, 0})
@C16814e
public final class SrmJson$Payload$$serializer implements N<SrmJson$Payload> {
    public static final SrmJson$Payload$$serializer INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ J0 f46837a;

    static {
        SrmJson$Payload$$serializer srmJson$Payload$$serializer = new SrmJson$Payload$$serializer();
        INSTANCE = srmJson$Payload$$serializer;
        J0 j02 = new J0("com.contentsquare.android.internal.features.srm.SrmJson.Payload", srmJson$Payload$$serializer, 3);
        j02.p("projectId", false);
        j02.p("filter", false);
        j02.p("hashes", false);
        f46837a = j02;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: kotlinx.serialization.KSerializer<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
        /*
            r5 = this;
            kotlinx.serialization.KSerializer<java.lang.Object>[] r0 = com.contentsquare.android.internal.features.srm.SrmJson$Payload.f46838d
            r1 = 2
            r0 = r0[r1]
            r2 = 3
            kotlinx.serialization.KSerializer[] r2 = new kotlinx.serialization.KSerializer[r2]
            jK.X r3 = jK.X.f144073a
            r4 = 0
            r2[r4] = r3
            r4 = 1
            r2[r4] = r3
            r2[r1] = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.internal.features.srm.SrmJson$Payload$$serializer.childSerializers():kotlinx.serialization.KSerializer[]");
    }

    public final Object deserialize(Decoder decoder) {
        int i10;
        int i11;
        int i12;
        Object obj;
        C17542s.j(decoder, "decoder");
        J0 j02 = f46837a;
        C17394c b10 = decoder.b(j02);
        KSerializer<Object>[] kSerializerArr = SrmJson$Payload.f46838d;
        if (b10.q()) {
            i12 = b10.j(j02, 0);
            i10 = b10.j(j02, 1);
            obj = b10.o(j02, 2, kSerializerArr[2], null);
            i11 = 7;
        } else {
            boolean z10 = true;
            i12 = 0;
            int i13 = 0;
            Object obj2 = null;
            int i14 = 0;
            while (z10) {
                int p10 = b10.p(j02);
                if (p10 == -1) {
                    z10 = false;
                } else if (p10 == 0) {
                    i12 = b10.j(j02, 0);
                    i14 |= 1;
                } else if (p10 == 1) {
                    i13 = b10.j(j02, 1);
                    i14 |= 2;
                } else if (p10 == 2) {
                    obj2 = b10.o(j02, 2, kSerializerArr[2], obj2);
                    i14 |= 4;
                } else {
                    throw new C17247E(p10);
                }
            }
            i11 = i14;
            i10 = i13;
            obj = obj2;
        }
        b10.c(j02);
        return new SrmJson$Payload(i11, i12, i10, (List) obj);
    }

    public final SerialDescriptor getDescriptor() {
        return f46837a;
    }

    public final void serialize(Encoder encoder, Object obj) {
        SrmJson$Payload srmJson$Payload = (SrmJson$Payload) obj;
        C17542s.j(encoder, "encoder");
        C17542s.j(srmJson$Payload, "value");
        J0 j02 = f46837a;
        C17395d b10 = encoder.b(j02);
        KSerializer<Object>[] kSerializerArr = SrmJson$Payload.f46838d;
        b10.w(j02, 0, srmJson$Payload.f46839a);
        b10.w(j02, 1, srmJson$Payload.f46840b);
        b10.i(j02, 2, kSerializerArr[2], srmJson$Payload.f46841c);
        b10.c(j02);
    }

    public final KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
