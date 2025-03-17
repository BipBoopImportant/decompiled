package com.contentsquare.android.internal.features.srm;

import XH.C16814e;
import com.contentsquare.android.internal.features.srm.SrmKeysCache;
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

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/contentsquare/android/internal/features/srm/SrmKeysCache.Key.$serializer", "LjK/N;", "Lcom/contentsquare/android/internal/features/srm/SrmKeysCache$Key;", "<init>", "()V", "library_release"}, k = 1, mv = {1, 8, 0})
@C16814e
public final class SrmKeysCache$Key$$serializer implements N<SrmKeysCache.Key> {
    public static final SrmKeysCache$Key$$serializer INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ J0 f46851a;

    static {
        SrmKeysCache$Key$$serializer srmKeysCache$Key$$serializer = new SrmKeysCache$Key$$serializer();
        INSTANCE = srmKeysCache$Key$$serializer;
        J0 j02 = new J0("com.contentsquare.android.internal.features.srm.SrmKeysCache.Key", srmKeysCache$Key$$serializer, 2);
        j02.p("key", false);
        j02.p("additionTime", false);
        f46851a = j02;
    }

    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{Y0.f144077a, C17458i0.f144113a};
    }

    public final Object deserialize(Decoder decoder) {
        int i10;
        long j10;
        String str;
        C17542s.j(decoder, "decoder");
        J0 j02 = f46851a;
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
        return new SrmKeysCache.Key(i10, str, j10);
    }

    public final SerialDescriptor getDescriptor() {
        return f46851a;
    }

    public final void serialize(Encoder encoder, Object obj) {
        SrmKeysCache.Key key = (SrmKeysCache.Key) obj;
        C17542s.j(encoder, "encoder");
        C17542s.j(key, "value");
        J0 j02 = f46851a;
        C17395d b10 = encoder.b(j02);
        b10.y(j02, 0, key.f46852a);
        b10.F(j02, 1, key.f46853b);
        b10.c(j02);
    }

    public final KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
