package com.google.crypto.tink.internal;

import com.google.crypto.tink.shaded.protobuf.S;

public abstract class m<PrimitiveT, KeyProtoT extends S> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<PrimitiveT> f67879a;

    public m(Class<PrimitiveT> cls) {
        this.f67879a = cls;
    }

    public abstract PrimitiveT a(KeyProtoT keyprotot);

    /* access modifiers changed from: package-private */
    public final Class<PrimitiveT> b() {
        return this.f67879a;
    }
}
