package com.contentsquare.android.internal.core.telemetry.event;

import XH.C16814e;
import fK.p;
import jK.E0;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import org.json.JSONObject;

@p
public final class CustomEvent implements a {
    public static final a Companion = new a();

    /* renamed from: a  reason: collision with root package name */
    public final String f46818a;

    /* renamed from: b  reason: collision with root package name */
    public final String f46819b;

    public static final class a {
        public final KSerializer<CustomEvent> serializer() {
            return CustomEvent$$serializer.INSTANCE;
        }
    }

    @C16814e
    public CustomEvent(int i10, String str, String str2) {
        if (3 != (i10 & 3)) {
            CustomEvent$$serializer.INSTANCE.getClass();
            E0.b(i10, 3, CustomEvent$$serializer.f46820a);
        }
        this.f46818a = str;
        this.f46819b = str2;
    }

    public final void a(JSONObject jSONObject) {
        C17542s.j(jSONObject, "jsonObject");
        jSONObject.put(this.f46818a, this.f46819b);
    }

    public final a b(a aVar) {
        C17542s.j(aVar, "other");
        return this;
    }

    public final String getKey() {
        return this.f46818a;
    }

    public CustomEvent(String str, String str2) {
        C17542s.j(str, "key");
        C17542s.j(str2, "value");
        this.f46818a = str;
        this.f46819b = str2;
    }
}
