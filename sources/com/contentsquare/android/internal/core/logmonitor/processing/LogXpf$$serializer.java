package com.contentsquare.android.internal.core.logmonitor.processing;

import XH.C16814e;
import com.contentsquare.android.internal.core.logmonitor.processing.LogXpf;
import fK.C17247E;
import gK.C17294a;
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

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/contentsquare/android/internal/core/logmonitor/processing/LogXpf.$serializer", "LjK/N;", "Lcom/contentsquare/android/internal/core/logmonitor/processing/LogXpf;", "<init>", "()V", "library_release"}, k = 1, mv = {1, 8, 0})
@C16814e
public final class LogXpf$$serializer implements N<LogXpf> {
    public static final LogXpf$$serializer INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ J0 f46805a;

    static {
        LogXpf$$serializer logXpf$$serializer = new LogXpf$$serializer();
        INSTANCE = logXpf$$serializer;
        J0 j02 = new J0("com.contentsquare.android.internal.core.logmonitor.processing.LogXpf", logXpf$$serializer, 3);
        j02.p("type", true);
        j02.p("version", true);
        j02.p("bridge_version", true);
        f46805a = j02;
    }

    public final KSerializer<?>[] childSerializers() {
        Y0 y02 = Y0.f144077a;
        return new KSerializer[]{C17294a.u(y02), C17294a.u(y02), C17294a.u(y02)};
    }

    public final Object deserialize(Decoder decoder) {
        Object obj;
        Object obj2;
        int i10;
        Object obj3;
        C17542s.j(decoder, "decoder");
        J0 j02 = f46805a;
        C17394c b10 = decoder.b(j02);
        Object obj4 = null;
        if (b10.q()) {
            Y0 y02 = Y0.f144077a;
            obj = b10.A(j02, 0, y02, null);
            obj2 = b10.A(j02, 1, y02, null);
            obj3 = b10.A(j02, 2, y02, null);
            i10 = 7;
        } else {
            boolean z10 = true;
            int i11 = 0;
            Object obj5 = null;
            Object obj6 = null;
            while (z10) {
                int p10 = b10.p(j02);
                if (p10 == -1) {
                    z10 = false;
                } else if (p10 == 0) {
                    obj4 = b10.A(j02, 0, Y0.f144077a, obj4);
                    i11 |= 1;
                } else if (p10 == 1) {
                    obj5 = b10.A(j02, 1, Y0.f144077a, obj5);
                    i11 |= 2;
                } else if (p10 == 2) {
                    obj6 = b10.A(j02, 2, Y0.f144077a, obj6);
                    i11 |= 4;
                } else {
                    throw new C17247E(p10);
                }
            }
            i10 = i11;
            obj = obj4;
            obj2 = obj5;
            obj3 = obj6;
        }
        b10.c(j02);
        return new LogXpf(i10, (String) obj, (String) obj2, (String) obj3);
    }

    public final SerialDescriptor getDescriptor() {
        return f46805a;
    }

    public final void serialize(Encoder encoder, Object obj) {
        LogXpf logXpf = (LogXpf) obj;
        C17542s.j(encoder, "encoder");
        C17542s.j(logXpf, "value");
        J0 j02 = f46805a;
        C17395d b10 = encoder.b(j02);
        LogXpf.a aVar = LogXpf.Companion;
        if (b10.z(j02, 0) || logXpf.f46802a != null) {
            b10.B(j02, 0, Y0.f144077a, logXpf.f46802a);
        }
        if (b10.z(j02, 1) || logXpf.f46803b != null) {
            b10.B(j02, 1, Y0.f144077a, logXpf.f46803b);
        }
        if (b10.z(j02, 2) || logXpf.f46804c != null) {
            b10.B(j02, 2, Y0.f144077a, logXpf.f46804c);
        }
        b10.c(j02);
    }

    public final KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
