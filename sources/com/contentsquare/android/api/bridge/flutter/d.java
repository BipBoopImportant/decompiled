package com.contentsquare.android.api.bridge.flutter;

import android.app.Application;
import b9.C7081c;
import b9.C7082d;
import b9.g;
import b9.h;
import b9.j;
import b9.l;
import b9.n;
import b9.p;
import com.contentsquare.android.core.features.config.model.JsonConfig;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import u8.C8886a;
import v8.b;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/contentsquare/android/api/bridge/flutter/d;", "", "Lv8/b;", "screenViewTracker", "LX8/b;", "csApplicationModule", "<init>", "(Lv8/b;LX8/b;)V", "Lb9/g;", "b", "()Lb9/g;", "Lb9/j;", "report", "Lb9/h;", "a", "(Lb9/j;)Lb9/h;", "Lv8/b;", "LX8/b;", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final b f46684a;

    /* renamed from: b  reason: collision with root package name */
    private final X8.b f46685b;

    public d(b bVar, X8.b bVar2) {
        C17542s.j(bVar, "screenViewTracker");
        C17542s.j(bVar2, "csApplicationModule");
        this.f46684a = bVar;
        this.f46685b = bVar2;
    }

    private final g b() {
        C8886a.C0914a aVar = C8886a.f56874d;
        Application b10 = this.f46685b.b();
        C17542s.i(b10, "csApplicationModule.application");
        A8.b c10 = aVar.b(b10).c();
        C7081c.a aVar2 = C7081c.f45637b;
        g.a t10 = g.t();
        C17542s.i(t10, "newBuilder()");
        C7081c a10 = aVar2.a(t10);
        JsonConfig.ProjectConfiguration b11 = c10.b();
        a10.c(b11 != null ? b11.g() : 0);
        a10.d(this.f46685b.m().f47324k);
        a10.f(this.f46684a.a());
        String a11 = this.f46685b.r().a();
        if (a11 == null) {
            a11 = "";
        }
        a10.e(a11);
        a10.b("flutter");
        return a10.a();
    }

    public final h a(j jVar) {
        C17542s.j(jVar, "report");
        C7082d.a aVar = C7082d.f45639b;
        h.a r10 = h.r();
        C17542s.i(r10, "newBuilder()");
        C7082d a10 = aVar.a(r10);
        a10.b(b());
        a10.d(l.OS_ANDROID);
        a10.c(UUID.randomUUID().getMostSignificantBits() & Long.MAX_VALUE);
        a10.e(jVar.i() - this.f46684a.b());
        p.a aVar2 = p.f45643b;
        n.a k10 = n.k();
        C17542s.i(k10, "newBuilder()");
        p a11 = aVar2.a(k10);
        a11.b(jVar);
        a10.f(a11.a());
        return a10.a();
    }
}
