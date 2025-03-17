package com.google.android.gms.internal.clearcut;

import android.net.Uri;

/* renamed from: com.google.android.gms.internal.clearcut.p  reason: case insensitive filesystem */
public final class C7212p {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final String f48470a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Uri f48471b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final String f48472c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final String f48473d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final boolean f48474e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final boolean f48475f;

    public C7212p(Uri uri) {
        this((String) null, uri, "", "", false, false);
    }

    public final <T> C7182f<T> a(String str, T t10, C7209o<T> oVar) {
        return C7182f.c(this, str, t10, oVar);
    }

    public final C7182f<String> b(String str, String str2) {
        return C7182f.d(this, str, (String) null);
    }

    public final C7182f<Boolean> e(String str, boolean z10) {
        return C7182f.e(this, str, false);
    }

    public final C7212p f(String str) {
        boolean z10 = this.f48474e;
        if (!z10) {
            return new C7212p(this.f48470a, this.f48471b, str, this.f48473d, z10, this.f48475f);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public final C7212p h(String str) {
        return new C7212p(this.f48470a, this.f48471b, this.f48472c, str, this.f48474e, this.f48475f);
    }

    private C7212p(String str, Uri uri, String str2, String str3, boolean z10, boolean z11) {
        this.f48470a = str;
        this.f48471b = uri;
        this.f48472c = str2;
        this.f48473d = str3;
        this.f48474e = z10;
        this.f48475f = z11;
    }
}
