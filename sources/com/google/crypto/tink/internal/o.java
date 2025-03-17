package com.google.crypto.tink.internal;

import Cb.I;
import Cb.y;
import Eb.a;
import com.google.crypto.tink.shaded.protobuf.C9525h;
import java.security.GeneralSecurityException;

public final class o implements q {

    /* renamed from: a  reason: collision with root package name */
    private final String f67886a;

    /* renamed from: b  reason: collision with root package name */
    private final a f67887b;

    /* renamed from: c  reason: collision with root package name */
    private final C9525h f67888c;

    /* renamed from: d  reason: collision with root package name */
    private final y.c f67889d;

    /* renamed from: e  reason: collision with root package name */
    private final I f67890e;

    /* renamed from: f  reason: collision with root package name */
    private final Integer f67891f;

    private o(String str, C9525h hVar, y.c cVar, I i10, Integer num) {
        this.f67886a = str;
        this.f67887b = t.e(str);
        this.f67888c = hVar;
        this.f67889d = cVar;
        this.f67890e = i10;
        this.f67891f = num;
    }

    public static o b(String str, C9525h hVar, y.c cVar, I i10, Integer num) {
        if (i10 == I.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new o(str, hVar, cVar, i10, num);
    }

    public a a() {
        return this.f67887b;
    }

    public Integer c() {
        return this.f67891f;
    }

    public y.c d() {
        return this.f67889d;
    }

    public I e() {
        return this.f67890e;
    }

    public String f() {
        return this.f67886a;
    }

    public C9525h g() {
        return this.f67888c;
    }
}
