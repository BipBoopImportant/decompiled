package com.bumptech.glide;

import W7.c;
import W7.e;
import Y7.k;
import Y7.l;
import com.bumptech.glide.m;

public abstract class m<CHILD extends m<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private e<? super TranscodeType> f46601a = c.c();

    private CHILD d() {
        return this;
    }

    /* renamed from: a */
    public final CHILD clone() {
        try {
            return (m) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final CHILD b() {
        return e(c.c());
    }

    /* access modifiers changed from: package-private */
    public final e<? super TranscodeType> c() {
        return this.f46601a;
    }

    public final CHILD e(e<? super TranscodeType> eVar) {
        this.f46601a = (e) k.d(eVar);
        return d();
    }

    public boolean equals(Object obj) {
        if (obj instanceof m) {
            return l.d(this.f46601a, ((m) obj).f46601a);
        }
        return false;
    }

    public int hashCode() {
        e<? super TranscodeType> eVar = this.f46601a;
        if (eVar != null) {
            return eVar.hashCode();
        }
        return 0;
    }
}
