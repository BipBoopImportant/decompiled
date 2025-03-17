package com.squareup.moshi;

import ME.C13205a;
import ME.C13206b;
import WK.C16770e;
import WK.C16771f;
import WK.C16772g;
import com.squareup.moshi.k;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Set;

public abstract class f<T> {

    class a extends f<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f122348a;

        a(f fVar) {
            this.f122348a = fVar;
        }

        public T fromJson(k kVar) {
            return this.f122348a.fromJson(kVar);
        }

        /* access modifiers changed from: package-private */
        public boolean isLenient() {
            return this.f122348a.isLenient();
        }

        public void toJson(q qVar, T t10) {
            boolean i10 = qVar.i();
            qVar.z(true);
            try {
                this.f122348a.toJson(qVar, t10);
            } finally {
                qVar.z(i10);
            }
        }

        public String toString() {
            return this.f122348a + ".serializeNulls()";
        }
    }

    class b extends f<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f122350a;

        b(f fVar) {
            this.f122350a = fVar;
        }

        public T fromJson(k kVar) {
            boolean h10 = kVar.h();
            kVar.v(true);
            try {
                return this.f122350a.fromJson(kVar);
            } finally {
                kVar.v(h10);
            }
        }

        /* access modifiers changed from: package-private */
        public boolean isLenient() {
            return true;
        }

        public void toJson(q qVar, T t10) {
            boolean l10 = qVar.l();
            qVar.x(true);
            try {
                this.f122350a.toJson(qVar, t10);
            } finally {
                qVar.x(l10);
            }
        }

        public String toString() {
            return this.f122350a + ".lenient()";
        }
    }

    class c extends f<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f122352a;

        c(f fVar) {
            this.f122352a = fVar;
        }

        public T fromJson(k kVar) {
            boolean g10 = kVar.g();
            kVar.u(true);
            try {
                return this.f122352a.fromJson(kVar);
            } finally {
                kVar.u(g10);
            }
        }

        /* access modifiers changed from: package-private */
        public boolean isLenient() {
            return this.f122352a.isLenient();
        }

        public void toJson(q qVar, T t10) {
            this.f122352a.toJson(qVar, t10);
        }

        public String toString() {
            return this.f122352a + ".failOnUnknown()";
        }
    }

    class d extends f<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f122354a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f122355b;

        d(f fVar, String str) {
            this.f122354a = fVar;
            this.f122355b = str;
        }

        public T fromJson(k kVar) {
            return this.f122354a.fromJson(kVar);
        }

        /* access modifiers changed from: package-private */
        public boolean isLenient() {
            return this.f122354a.isLenient();
        }

        public void toJson(q qVar, T t10) {
            String h10 = qVar.h();
            qVar.w(this.f122355b);
            try {
                this.f122354a.toJson(qVar, t10);
            } finally {
                qVar.w(h10);
            }
        }

        public String toString() {
            return this.f122354a + ".indent(\"" + this.f122355b + "\")";
        }
    }

    public interface e {
        f<?> a(Type type, Set<? extends Annotation> set, t tVar);
    }

    public final f<T> failOnUnknown() {
        return new c(this);
    }

    public final T fromJson(C16772g gVar) {
        return fromJson(k.l(gVar));
    }

    public abstract T fromJson(k kVar);

    public final T fromJsonValue(Object obj) {
        try {
            return fromJson((k) new o(obj));
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public f<T> indent(String str) {
        if (str != null) {
            return new d(this, str);
        }
        throw new NullPointerException("indent == null");
    }

    /* access modifiers changed from: package-private */
    public boolean isLenient() {
        return false;
    }

    public final f<T> lenient() {
        return new b(this);
    }

    public final f<T> nonNull() {
        return this instanceof C13205a ? this : new C13205a(this);
    }

    public final f<T> nullSafe() {
        return this instanceof C13206b ? this : new C13206b(this);
    }

    public final f<T> serializeNulls() {
        return new a(this);
    }

    public final void toJson(C16771f fVar, T t10) {
        toJson(q.q(fVar), t10);
    }

    public abstract void toJson(q qVar, T t10);

    public final Object toJsonValue(T t10) {
        p pVar = new p();
        try {
            toJson((q) pVar, t10);
            return pVar.f0();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public final T fromJson(String str) {
        k l10 = k.l(new C16770e().D0(str));
        T fromJson = fromJson(l10);
        if (isLenient() || l10.n() == k.b.END_DOCUMENT) {
            return fromJson;
        }
        throw new h("JSON document was not fully consumed.");
    }

    public final String toJson(T t10) {
        C16770e eVar = new C16770e();
        try {
            toJson((C16771f) eVar, t10);
            return eVar.l0();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
