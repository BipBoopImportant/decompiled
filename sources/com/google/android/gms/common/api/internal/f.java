package com.google.android.gms.common.api.internal;

import H9.C6534h;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import ca.C7112f;
import j0.C5445a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Map;

final class f {

    /* renamed from: a  reason: collision with root package name */
    private final Map f48037a = Collections.synchronizedMap(new C5445a());
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public int f48038b = 0;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public Bundle f48039c;

    f() {
    }

    /* access modifiers changed from: package-private */
    public final C6534h c(String str, Class cls) {
        return (C6534h) cls.cast(this.f48037a.get(str));
    }

    /* access modifiers changed from: package-private */
    public final void d(String str, C6534h hVar) {
        if (!this.f48037a.containsKey(str)) {
            this.f48037a.put(str, hVar);
            if (this.f48038b > 0) {
                new C7112f(Looper.getMainLooper()).post(new e(this, hVar, str));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
    }

    /* access modifiers changed from: package-private */
    public final void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (C6534h a10 : this.f48037a.values()) {
            a10.a(str, fileDescriptor, printWriter, strArr);
        }
    }

    /* access modifiers changed from: package-private */
    public final void f(int i10, int i11, Intent intent) {
        for (C6534h e10 : this.f48037a.values()) {
            e10.e(i10, i11, intent);
        }
    }

    /* access modifiers changed from: package-private */
    public final void g(Bundle bundle) {
        this.f48038b = 1;
        this.f48039c = bundle;
        for (Map.Entry entry : this.f48037a.entrySet()) {
            ((C6534h) entry.getValue()).f(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    /* access modifiers changed from: package-private */
    public final void h() {
        this.f48038b = 5;
        for (C6534h g10 : this.f48037a.values()) {
            g10.g();
        }
    }

    /* access modifiers changed from: package-private */
    public final void i() {
        this.f48038b = 3;
        for (C6534h h10 : this.f48037a.values()) {
            h10.h();
        }
    }

    /* access modifiers changed from: package-private */
    public final void j(Bundle bundle) {
        if (bundle != null) {
            for (Map.Entry entry : this.f48037a.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((C6534h) entry.getValue()).i(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void k() {
        this.f48038b = 2;
        for (C6534h j10 : this.f48037a.values()) {
            j10.j();
        }
    }

    /* access modifiers changed from: package-private */
    public final void l() {
        this.f48038b = 4;
        for (C6534h k10 : this.f48037a.values()) {
            k10.k();
        }
    }
}
