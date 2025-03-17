package com.contentsquare.android.internal.core.telemetry.event;

import fK.C17261n;
import fK.p;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.P;
import kotlinx.serialization.KSerializer;
import org.json.JSONObject;
import uI.C18055d;

@p
public interface a {
    public static final C0816a Companion = C0816a.f46829a;

    /* renamed from: com.contentsquare.android.internal.core.telemetry.event.a$a  reason: collision with other inner class name */
    public static final class C0816a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ C0816a f46829a = new C0816a();

        public final KSerializer<a> serializer() {
            return new C17261n("com.contentsquare.android.internal.core.telemetry.event.TelemetryEvent", P.b(a.class), new C18055d[]{P.b(ApiUsageEvent.class), P.b(AppLifeCycleEvent.class), P.b(CustomEvent.class)}, new KSerializer[]{ApiUsageEvent$$serializer.INSTANCE, AppLifeCycleEvent$$serializer.INSTANCE, CustomEvent$$serializer.INSTANCE}, new Annotation[0]);
        }
    }

    void a(JSONObject jSONObject);

    a b(a aVar);

    String getKey();
}
