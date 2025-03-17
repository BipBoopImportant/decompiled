package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C9518a;
import com.google.crypto.tink.shaded.protobuf.C9518a.C1175a;
import com.google.crypto.tink.shaded.protobuf.C9525h;
import com.google.crypto.tink.shaded.protobuf.S;
import java.io.IOException;

/* renamed from: com.google.crypto.tink.shaded.protobuf.a  reason: case insensitive filesystem */
public abstract class C9518a<MessageType extends C9518a<MessageType, BuilderType>, BuilderType extends C1175a<MessageType, BuilderType>> implements S {
    protected int memoizedHashCode = 0;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.a$a  reason: collision with other inner class name */
    public static abstract class C1175a<MessageType extends C9518a<MessageType, BuilderType>, BuilderType extends C1175a<MessageType, BuilderType>> implements S.a {
        protected static n0 e(S s10) {
            return new n0(s10);
        }

        /* access modifiers changed from: protected */
        public abstract BuilderType c(MessageType messagetype);

        /* renamed from: d */
        public BuilderType z2(S s10) {
            if (getDefaultInstanceForType().getClass().isInstance(s10)) {
                return c((C9518a) s10);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    private String e(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public byte[] a() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            C9528k c02 = C9528k.c0(bArr);
            b(c02);
            c02.c();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException(e("byte array"), e10);
        }
    }

    /* access modifiers changed from: package-private */
    public int c() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public int d(h0 h0Var) {
        int c10 = c();
        if (c10 != -1) {
            return c10;
        }
        int h10 = h0Var.h(this);
        h(h10);
        return h10;
    }

    /* access modifiers changed from: package-private */
    public n0 f() {
        return new n0(this);
    }

    /* access modifiers changed from: package-private */
    public void h(int i10) {
        throw new UnsupportedOperationException();
    }

    public C9525h toByteString() {
        try {
            C9525h.C1176h y10 = C9525h.y(getSerializedSize());
            b(y10.b());
            return y10.a();
        } catch (IOException e10) {
            throw new RuntimeException(e("ByteString"), e10);
        }
    }
}
