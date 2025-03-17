package com.contentsquare.android.sdk;

import D8.c;
import com.contentsquare.android.sdk.C7162y0;

public final class J extends C7162y0 {

    /* renamed from: m  reason: collision with root package name */
    public final String f47012m;

    public static final class a extends C7162y0.a<J> {

        /* renamed from: k  reason: collision with root package name */
        public String f47013k = "";

        public a() {
            super(22);
        }

        public final C7162y0 a() {
            return new J(this);
        }
    }

    public J(a aVar) {
        super(aVar);
        this.f47012m = aVar.f47013k;
    }

    public final void a() {
        c cVar = C7162y0.f47731l;
        cVar.j("User identifier hashed sent " + this.f47012m);
    }
}
