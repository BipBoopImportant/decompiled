package com.contentsquare.android.sdk;

import D8.c;
import HJ.C15854t;
import com.contentsquare.android.sdk.C7162y0;
import kotlin.jvm.internal.C17542s;

public final class T extends C7162y0 {

    /* renamed from: m  reason: collision with root package name */
    public final String f47154m;

    public static final class a extends C7162y0.a<T> {

        /* renamed from: k  reason: collision with root package name */
        public String f47155k = "";

        public a() {
            super(8);
        }

        public final C7162y0 a() {
            return new T(this);
        }
    }

    public T(a aVar) {
        super(aVar);
        this.f47154m = aVar.f47155k;
    }

    public final void a() {
        c cVar = C7162y0.f47731l;
        StringBuilder sb2 = new StringBuilder("Long press - Target: {Last view info: ");
        String str = this.f47154m;
        C17542s.j(str, "path");
        String substring = str.substring(C15854t.z0(str, ">", 0, false, 6, (Object) null) + 1);
        C17542s.i(substring, "this as java.lang.String).substring(startIndex)");
        sb2.append(substring);
        sb2.append('}');
        cVar.j(sb2.toString());
    }
}
