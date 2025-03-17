package com.contentsquare.android.internal.features.srm;

import XH.C16814e;
import fK.p;
import jK.C17451f;
import jK.E0;
import jK.Y0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;

@p
public final class SrmJson$Payload {
    public static final a Companion = new a();

    /* renamed from: d  reason: collision with root package name */
    public static final KSerializer<Object>[] f46838d = {null, null, new C17451f(Y0.f144077a)};

    /* renamed from: a  reason: collision with root package name */
    public final int f46839a;

    /* renamed from: b  reason: collision with root package name */
    public final int f46840b;

    /* renamed from: c  reason: collision with root package name */
    public final List<String> f46841c;

    public static final class a {
        public final KSerializer<SrmJson$Payload> serializer() {
            return SrmJson$Payload$$serializer.INSTANCE;
        }
    }

    @C16814e
    public SrmJson$Payload(int i10, int i11, int i12, List list) {
        if (7 != (i10 & 7)) {
            SrmJson$Payload$$serializer.INSTANCE.getClass();
            E0.b(i10, 7, SrmJson$Payload$$serializer.f46837a);
        }
        this.f46839a = i11;
        this.f46840b = i12;
        this.f46841c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SrmJson$Payload)) {
            return false;
        }
        SrmJson$Payload srmJson$Payload = (SrmJson$Payload) obj;
        return this.f46839a == srmJson$Payload.f46839a && this.f46840b == srmJson$Payload.f46840b && C17542s.e(this.f46841c, srmJson$Payload.f46841c);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f46840b);
        return this.f46841c.hashCode() + ((hashCode + (Integer.hashCode(this.f46839a) * 31)) * 31);
    }

    public final String toString() {
        return "Payload(projectId=" + this.f46839a + ", filter=" + this.f46840b + ", hashes=" + this.f46841c + ')';
    }

    public SrmJson$Payload(int i10, ArrayList arrayList) {
        C17542s.j(arrayList, "hashes");
        this.f46839a = i10;
        this.f46840b = 2;
        this.f46841c = arrayList;
    }
}
