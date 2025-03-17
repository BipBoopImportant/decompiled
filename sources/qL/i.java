package QL;

import GK.C15774B;
import QL.C16362e;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.concurrent.Executor;

final class i extends C16362e.a {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f137745a;

    class a implements C16362e<Object, C16361d<?>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Type f137746a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Executor f137747b;

        a(Type type, Executor executor) {
            this.f137746a = type;
            this.f137747b = executor;
        }

        public Type a() {
            return this.f137746a;
        }

        /* renamed from: c */
        public C16361d<Object> b(C16361d<Object> dVar) {
            Executor executor = this.f137747b;
            return executor == null ? dVar : new b(executor, dVar);
        }
    }

    static final class b<T> implements C16361d<T> {

        /* renamed from: a  reason: collision with root package name */
        final Executor f137749a;

        /* renamed from: b  reason: collision with root package name */
        final C16361d<T> f137750b;

        class a implements f<T> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f f137751a;

            a(f fVar) {
                this.f137751a = fVar;
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void e(f fVar, Throwable th2) {
                fVar.a(b.this, th2);
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void f(f fVar, x xVar) {
                if (b.this.f137750b.J()) {
                    fVar.a(b.this, new IOException("Canceled"));
                } else {
                    fVar.b(b.this, xVar);
                }
            }

            public void a(C16361d<T> dVar, Throwable th2) {
                b.this.f137749a.execute(new k(this, this.f137751a, th2));
            }

            public void b(C16361d<T> dVar, x<T> xVar) {
                b.this.f137749a.execute(new j(this, this.f137751a, xVar));
            }
        }

        b(Executor executor, C16361d<T> dVar) {
            this.f137749a = executor;
            this.f137750b = dVar;
        }

        public void E0(f<T> fVar) {
            Objects.requireNonNull(fVar, "callback == null");
            this.f137750b.E0(new a(fVar));
        }

        public boolean J() {
            return this.f137750b.J();
        }

        public void cancel() {
            this.f137750b.cancel();
        }

        public C15774B t() {
            return this.f137750b.t();
        }

        public C16361d<T> clone() {
            return new b(this.f137749a, this.f137750b.clone());
        }
    }

    i(Executor executor) {
        this.f137745a = executor;
    }

    public C16362e<?, ?> a(Type type, Annotation[] annotationArr, y yVar) {
        Executor executor = null;
        if (C16362e.a.c(type) != C16361d.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type g10 = C16357C.g(0, (ParameterizedType) type);
            if (!C16357C.l(annotationArr, C16355A.class)) {
                executor = this.f137745a;
            }
            return new a(g10, executor);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
