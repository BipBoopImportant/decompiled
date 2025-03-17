package com.contentsquare.android.internal.core.telemetry.event;

import XH.C16814e;
import fK.C17247E;
import iK.C17394c;
import iK.C17395d;
import jK.J0;
import jK.N;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/contentsquare/android/internal/core/telemetry/event/CustomEvent.$serializer", "LjK/N;", "Lcom/contentsquare/android/internal/core/telemetry/event/CustomEvent;", "<init>", "()V", "library_release"}, k = 1, mv = {1, 8, 0})
@C16814e
public final class CustomEvent$$serializer implements N<CustomEvent> {
    public static final CustomEvent$$serializer INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ J0 f46820a;

    static {
        CustomEvent$$serializer customEvent$$serializer = new CustomEvent$$serializer();
        INSTANCE = customEvent$$serializer;
        J0 j02 = new J0("com.contentsquare.android.internal.core.telemetry.event.CustomEvent", customEvent$$serializer, 2);
        j02.p("key", false);
        j02.p("value", false);
        f46820a = j02;
    }

    public final KSerializer<?>[] childSerializers() {
        Y0 y02 = Y0.f144077a;
        return new KSerializer[]{y02, y02};
    }

    public final Object deserialize(Decoder decoder) {
        int i10;
        String str;
        String str2;
        C17542s.j(decoder, "decoder");
        J0 j02 = f46820a;
        C17394c b10 = decoder.b(j02);
        if (b10.q()) {
            str2 = b10.n(j02, 0);
            str = b10.n(j02, 1);
            i10 = 3;
        } else {
            str2 = null;
            String str3 = null;
            boolean z10 = true;
            int i11 = 0;
            while (z10) {
                int p10 = b10.p(j02);
                if (p10 == -1) {
                    z10 = false;
                } else if (p10 == 0) {
                    str2 = b10.n(j02, 0);
                    i11 |= 1;
                } else if (p10 == 1) {
                    str3 = b10.n(j02, 1);
                    i11 |= 2;
                } else {
                    throw new C17247E(p10);
                }
            }
            str = str3;
            i10 = i11;
        }
        b10.c(j02);
        return new CustomEvent(i10, str2, str);
    }

    public final SerialDescriptor getDescriptor() {
        return f46820a;
    }

    public final void serialize(Encoder encoder, Object obj) {
        CustomEvent customEvent = (CustomEvent) obj;
        C17542s.j(encoder, "encoder");
        C17542s.j(customEvent, "value");
        J0 j02 = f46820a;
        C17395d b10 = encoder.b(j02);
        b10.y(j02, 0, customEvent.f46818a);
        b10.y(j02, 1, customEvent.f46819b);
        b10.c(j02);
    }

    public final KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
