package qb;

import Cb.y;
import com.google.crypto.tink.internal.d;
import com.google.crypto.tink.shaded.protobuf.B;
import com.google.crypto.tink.shaded.protobuf.C9525h;
import com.google.crypto.tink.shaded.protobuf.S;
import java.security.GeneralSecurityException;

/* renamed from: qb.i  reason: case insensitive filesystem */
class C10164i<PrimitiveT, KeyProtoT extends S> implements C10163h<PrimitiveT> {

    /* renamed from: a  reason: collision with root package name */
    private final d<KeyProtoT> f75967a;

    /* renamed from: b  reason: collision with root package name */
    private final Class<PrimitiveT> f75968b;

    /* renamed from: qb.i$a */
    private static class a<KeyFormatProtoT extends S, KeyProtoT extends S> {

        /* renamed from: a  reason: collision with root package name */
        final d.a<KeyFormatProtoT, KeyProtoT> f75969a;

        a(d.a<KeyFormatProtoT, KeyProtoT> aVar) {
            this.f75969a = aVar;
        }

        private KeyProtoT b(KeyFormatProtoT keyformatprotot) {
            this.f75969a.e(keyformatprotot);
            return this.f75969a.a(keyformatprotot);
        }

        /* access modifiers changed from: package-private */
        public KeyProtoT a(C9525h hVar) {
            return b(this.f75969a.d(hVar));
        }
    }

    public C10164i(d<KeyProtoT> dVar, Class<PrimitiveT> cls) {
        if (dVar.i().contains(cls) || Void.class.equals(cls)) {
            this.f75967a = dVar;
            this.f75968b = cls;
            return;
        }
        throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", new Object[]{dVar.toString(), cls.getName()}));
    }

    private a<?, KeyProtoT> e() {
        return new a<>(this.f75967a.f());
    }

    private PrimitiveT f(KeyProtoT keyprotot) {
        if (!Void.class.equals(this.f75968b)) {
            this.f75967a.j(keyprotot);
            return this.f75967a.e(keyprotot, this.f75968b);
        }
        throw new GeneralSecurityException("Cannot create a primitive for Void");
    }

    public final y a(C9525h hVar) {
        try {
            return (y) y.Y().y(b()).z(e().a(hVar).toByteString()).w(this.f75967a.g()).g();
        } catch (B e10) {
            throw new GeneralSecurityException("Unexpected proto", e10);
        }
    }

    public final String b() {
        return this.f75967a.d();
    }

    public final PrimitiveT c(C9525h hVar) {
        try {
            return f(this.f75967a.h(hVar));
        } catch (B e10) {
            throw new GeneralSecurityException("Failures parsing proto of type " + this.f75967a.c().getName(), e10);
        }
    }

    public final S d(C9525h hVar) {
        try {
            return e().a(hVar);
        } catch (B e10) {
            throw new GeneralSecurityException("Failures parsing proto of type " + this.f75967a.f().b().getName(), e10);
        }
    }
}
