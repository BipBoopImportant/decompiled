package com.contentsquare.android.internal.core.telemetry.event;

import XH.C16814e;
import fK.C17247E;
import iK.C17394c;
import iK.C17395d;
import jK.C17458i0;
import jK.J0;
import jK.N;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/contentsquare/android/internal/core/telemetry/event/ApiUsageEvent.$serializer", "LjK/N;", "Lcom/contentsquare/android/internal/core/telemetry/event/ApiUsageEvent;", "<init>", "()V", "library_release"}, k = 1, mv = {1, 8, 0})
@C16814e
public final class ApiUsageEvent$$serializer implements N<ApiUsageEvent> {
    public static final ApiUsageEvent$$serializer INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ J0 f46814a;

    static {
        ApiUsageEvent$$serializer apiUsageEvent$$serializer = new ApiUsageEvent$$serializer();
        INSTANCE = apiUsageEvent$$serializer;
        J0 j02 = new J0("com.contentsquare.android.internal.core.telemetry.event.ApiUsageEvent", apiUsageEvent$$serializer, 2);
        j02.p("key", false);
        j02.p("value", false);
        f46814a = j02;
    }

    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{Y0.f144077a, C17458i0.f144113a};
    }

    public final Object deserialize(Decoder decoder) {
        int i10;
        long j10;
        String str;
        C17542s.j(decoder, "decoder");
        J0 j02 = f46814a;
        C17394c b10 = decoder.b(j02);
        if (b10.q()) {
            str = b10.n(j02, 0);
            j10 = b10.g(j02, 1);
            i10 = 3;
        } else {
            str = null;
            long j11 = 0;
            boolean z10 = true;
            int i11 = 0;
            while (z10) {
                int p10 = b10.p(j02);
                if (p10 == -1) {
                    z10 = false;
                } else if (p10 == 0) {
                    str = b10.n(j02, 0);
                    i11 |= 1;
                } else if (p10 == 1) {
                    j11 = b10.g(j02, 1);
                    i11 |= 2;
                } else {
                    throw new C17247E(p10);
                }
            }
            j10 = j11;
            i10 = i11;
        }
        b10.c(j02);
        return new ApiUsageEvent(i10, str, j10);
    }

    public final SerialDescriptor getDescriptor() {
        return f46814a;
    }

    public final void serialize(Encoder encoder, Object obj) {
        ApiUsageEvent apiUsageEvent = (ApiUsageEvent) obj;
        C17542s.j(encoder, "encoder");
        C17542s.j(apiUsageEvent, "value");
        J0 j02 = f46814a;
        C17395d b10 = encoder.b(j02);
        b10.y(j02, 0, apiUsageEvent.f46812a);
        b10.F(j02, 1, apiUsageEvent.f46813b);
        b10.c(j02);
    }

    public final KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
