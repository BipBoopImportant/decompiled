package com.contentsquare.android.sdk;

import D8.c;
import android.os.IBinder;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C17542s;

public final class E0 {

    /* renamed from: a  reason: collision with root package name */
    public final c f46958a = new c("GestureStorage");

    /* renamed from: b  reason: collision with root package name */
    public a f46959b;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f46960a;

        /* renamed from: b  reason: collision with root package name */
        public final int f46961b;

        /* renamed from: c  reason: collision with root package name */
        public final WeakReference<IBinder> f46962c;

        public a(IBinder iBinder, int i10, int i11) {
            C17542s.j(iBinder, "windowToken");
            this.f46960a = i10;
            this.f46961b = i11;
            this.f46962c = new WeakReference<>(iBinder);
        }
    }
}
