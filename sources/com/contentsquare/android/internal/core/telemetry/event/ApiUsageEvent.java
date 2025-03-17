package com.contentsquare.android.internal.core.telemetry.event;

import XH.C16814e;
import fK.p;
import jK.E0;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import org.json.JSONObject;

@p
public final class ApiUsageEvent implements a {
    public static final a Companion = new a();

    /* renamed from: a  reason: collision with root package name */
    public final String f46812a;

    /* renamed from: b  reason: collision with root package name */
    public final long f46813b;

    public static final class a {
        public final KSerializer<ApiUsageEvent> serializer() {
            return ApiUsageEvent$$serializer.INSTANCE;
        }
    }

    @C16814e
    public ApiUsageEvent(int i10, String str, long j10) {
        if (3 != (i10 & 3)) {
            ApiUsageEvent$$serializer.INSTANCE.getClass();
            E0.b(i10, 3, ApiUsageEvent$$serializer.f46814a);
        }
        this.f46812a = str;
        this.f46813b = j10;
    }

    public final void a(JSONObject jSONObject) {
        C17542s.j(jSONObject, "jsonObject");
        jSONObject.put(this.f46812a, this.f46813b);
    }

    public final a b(a aVar) {
        C17542s.j(aVar, "other");
        return aVar instanceof ApiUsageEvent ? new ApiUsageEvent(this.f46812a, this.f46813b + ((ApiUsageEvent) aVar).f46813b) : this;
    }

    public final String getKey() {
        return this.f46812a;
    }

    public ApiUsageEvent(String str, long j10) {
        C17542s.j(str, "key");
        this.f46812a = str;
        this.f46813b = j10;
    }
}
