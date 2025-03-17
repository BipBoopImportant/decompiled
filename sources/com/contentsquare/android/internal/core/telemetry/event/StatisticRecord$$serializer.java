package com.contentsquare.android.internal.core.telemetry.event;

import XH.C16814e;
import com.contentsquare.android.internal.core.telemetry.event.StatisticRecord;
import fK.C17247E;
import iK.C17394c;
import iK.C17395d;
import jK.C17438C;
import jK.J0;
import jK.M;
import jK.N;
import jK.X;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/contentsquare/android/internal/core/telemetry/event/StatisticRecord.$serializer", "LjK/N;", "Lcom/contentsquare/android/internal/core/telemetry/event/StatisticRecord;", "<init>", "()V", "library_release"}, k = 1, mv = {1, 8, 0})
@C16814e
public final class StatisticRecord$$serializer implements N<StatisticRecord> {
    public static final StatisticRecord$$serializer INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ J0 f46828a;

    static {
        StatisticRecord$$serializer statisticRecord$$serializer = new StatisticRecord$$serializer();
        INSTANCE = statisticRecord$$serializer;
        J0 j02 = new J0("com.contentsquare.android.internal.core.telemetry.event.StatisticRecord", statisticRecord$$serializer, 7);
        j02.p("median", true);
        j02.p("min", true);
        j02.p("p10", true);
        j02.p("count", true);
        j02.p("avg", true);
        j02.p("p90", true);
        j02.p("max", true);
        f46828a = j02;
    }

    public final KSerializer<?>[] childSerializers() {
        C17438C c10 = C17438C.f144010a;
        M m10 = M.f144051a;
        return new KSerializer[]{c10, m10, m10, X.f144073a, c10, m10, m10};
    }

    public final Object deserialize(Decoder decoder) {
        float f10;
        float f11;
        double d10;
        int i10;
        float f12;
        float f13;
        double d11;
        int i11;
        Decoder decoder2 = decoder;
        C17542s.j(decoder2, "decoder");
        J0 j02 = f46828a;
        C17394c b10 = decoder2.b(j02);
        if (b10.q()) {
            double H10 = b10.H(j02, 0);
            float v10 = b10.v(j02, 1);
            float v11 = b10.v(j02, 2);
            int j10 = b10.j(j02, 3);
            double H11 = b10.H(j02, 4);
            float v12 = b10.v(j02, 5);
            f13 = v10;
            f10 = b10.v(j02, 6);
            f11 = v12;
            i10 = j10;
            i11 = 127;
            f12 = v11;
            d11 = H10;
            d10 = H11;
        } else {
            float f14 = 0.0f;
            float f15 = 0.0f;
            boolean z10 = true;
            int i12 = 0;
            int i13 = 0;
            double d12 = 0.0d;
            double d13 = 0.0d;
            float f16 = 0.0f;
            float f17 = 0.0f;
            while (z10) {
                int p10 = b10.p(j02);
                switch (p10) {
                    case -1:
                        z10 = false;
                        continue;
                    case 0:
                        d12 = b10.H(j02, 0);
                        i13 |= 1;
                        continue;
                    case 1:
                        f14 = b10.v(j02, 1);
                        i13 |= 2;
                        break;
                    case 2:
                        f15 = b10.v(j02, 2);
                        i13 |= 4;
                        break;
                    case 3:
                        i12 = b10.j(j02, 3);
                        i13 |= 8;
                        break;
                    case 4:
                        d13 = b10.H(j02, 4);
                        i13 |= 16;
                        break;
                    case 5:
                        f17 = b10.v(j02, 5);
                        i13 |= 32;
                        break;
                    case 6:
                        f16 = b10.v(j02, 6);
                        i13 |= 64;
                        break;
                    default:
                        throw new C17247E(p10);
                }
            }
            f13 = f14;
            f10 = f16;
            f11 = f17;
            i10 = i12;
            i11 = i13;
            f12 = f15;
            d11 = d12;
            d10 = d13;
        }
        b10.c(j02);
        return new StatisticRecord(i11, d11, f13, f12, i10, d10, f11, f10);
    }

    public final SerialDescriptor getDescriptor() {
        return f46828a;
    }

    public final void serialize(Encoder encoder, Object obj) {
        StatisticRecord statisticRecord = (StatisticRecord) obj;
        C17542s.j(encoder, "encoder");
        C17542s.j(statisticRecord, "value");
        J0 j02 = f46828a;
        C17395d b10 = encoder.b(j02);
        StatisticRecord.a aVar = StatisticRecord.Companion;
        if (b10.z(j02, 0) || Double.compare(statisticRecord.f46821a, 0.0d) != 0) {
            b10.E(j02, 0, statisticRecord.f46821a);
        }
        if (b10.z(j02, 1) || Float.compare(statisticRecord.f46822b, 0.0f) != 0) {
            b10.s(j02, 1, statisticRecord.f46822b);
        }
        if (b10.z(j02, 2) || Float.compare(statisticRecord.f46823c, 0.0f) != 0) {
            b10.s(j02, 2, statisticRecord.f46823c);
        }
        if (b10.z(j02, 3) || statisticRecord.f46824d != 0) {
            b10.w(j02, 3, statisticRecord.f46824d);
        }
        if (b10.z(j02, 4) || Double.compare(statisticRecord.f46825e, 0.0d) != 0) {
            b10.E(j02, 4, statisticRecord.f46825e);
        }
        if (b10.z(j02, 5) || Float.compare(statisticRecord.f46826f, 0.0f) != 0) {
            b10.s(j02, 5, statisticRecord.f46826f);
        }
        if (b10.z(j02, 6) || Float.compare(statisticRecord.f46827g, 0.0f) != 0) {
            b10.s(j02, 6, statisticRecord.f46827g);
        }
        b10.c(j02);
    }

    public final KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
