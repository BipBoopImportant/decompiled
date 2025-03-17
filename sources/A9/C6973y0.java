package a9;

import D8.c;
import F8.g;
import android.app.Application;
import android.content.Context;
import com.contentsquare.android.core.features.config.model.JsonConfig;
import java.util.HashMap;
import kotlin.jvm.internal.C17542s;

/* renamed from: a9.y0  reason: case insensitive filesystem */
public final class C6973y0 {

    /* renamed from: a  reason: collision with root package name */
    public final g f42961a;

    /* renamed from: b  reason: collision with root package name */
    public final JsonConfig.ProjectConfiguration f42962b;

    /* renamed from: c  reason: collision with root package name */
    public final C6881m3 f42963c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f42964d;

    /* renamed from: e  reason: collision with root package name */
    public final HashMap<String, Object> f42965e = new HashMap<>();

    /* renamed from: f  reason: collision with root package name */
    public final c f42966f = new c("StaticCollector");

    public C6973y0(g gVar, JsonConfig.ProjectConfiguration projectConfiguration, C6881m3 m3Var, Application application) {
        C17542s.j(gVar, "deviceInfo");
        C17542s.j(m3Var, "dependenciesScanner");
        C17542s.j(application, "context");
        this.f42961a = gVar;
        this.f42962b = projectConfiguration;
        this.f42963c = m3Var;
        this.f42964d = application;
    }
}
