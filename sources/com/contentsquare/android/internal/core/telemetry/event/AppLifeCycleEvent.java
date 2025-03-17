package com.contentsquare.android.internal.core.telemetry.event;

import XH.C16814e;
import fK.p;
import jK.E0;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import org.json.JSONObject;

@p
public final class AppLifeCycleEvent implements a {
    public static final a Companion = new a();

    /* renamed from: a  reason: collision with root package name */
    public final String f46815a;

    /* renamed from: b  reason: collision with root package name */
    public final long f46816b;

    public static final class a {
        public final KSerializer<AppLifeCycleEvent> serializer() {
            return AppLifeCycleEvent$$serializer.INSTANCE;
        }
    }

    @C16814e
    public AppLifeCycleEvent(int i10, String str, long j10) {
        if (3 != (i10 & 3)) {
            AppLifeCycleEvent$$serializer.INSTANCE.getClass();
            E0.b(i10, 3, AppLifeCycleEvent$$serializer.f46817a);
        }
        this.f46815a = str;
        this.f46816b = j10;
    }

    public final void a(JSONObject jSONObject) {
        C17542s.j(jSONObject, "jsonObject");
        jSONObject.put(this.f46815a, this.f46816b);
    }

    public final a b(a aVar) {
        C17542s.j(aVar, "other");
        return aVar instanceof AppLifeCycleEvent ? new AppLifeCycleEvent(this.f46815a, this.f46816b + ((AppLifeCycleEvent) aVar).f46816b) : this;
    }

    public final String getKey() {
        return this.f46815a;
    }

    public AppLifeCycleEvent(String str, long j10) {
        C17542s.j(str, "key");
        this.f46815a = str;
        this.f46816b = j10;
    }
}
