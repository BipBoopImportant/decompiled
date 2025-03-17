package QL;

import QL.C16362e;
import android.annotation.TargetApi;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@TargetApi(24)
@IgnoreJRERequirement
final class g extends C16362e.a {

    @IgnoreJRERequirement
    private static final class a<R> implements C16362e<R, CompletableFuture<R>> {

        /* renamed from: a  reason: collision with root package name */
        private final Type f137738a;

        @IgnoreJRERequirement
        /* renamed from: QL.g$a$a  reason: collision with other inner class name */
        private class C3375a implements f<R> {

            /* renamed from: a  reason: collision with root package name */
            private final CompletableFuture<R> f137739a;

            public C3375a(CompletableFuture<R> completableFuture) {
                this.f137739a = completableFuture;
            }

            public void a(C16361d<R> dVar, Throwable th2) {
                this.f137739a.completeExceptionally(th2);
            }

            public void b(C16361d<R> dVar, x<R> xVar) {
                if (xVar.e()) {
                    this.f137739a.complete(xVar.a());
                } else {
                    this.f137739a.completeExceptionally(new m(xVar));
                }
            }
        }

        a(Type type) {
            this.f137738a = type;
        }

        public Type a() {
            return this.f137738a;
        }

        /* renamed from: c */
        public CompletableFuture<R> b(C16361d<R> dVar) {
            b bVar = new b(dVar);
            dVar.E0(new C3375a(bVar));
            return bVar;
        }
    }

    @IgnoreJRERequirement
    private static final class b<T> extends CompletableFuture<T> {

        /* renamed from: a  reason: collision with root package name */
        private final C16361d<?> f137741a;

        b(C16361d<?> dVar) {
            this.f137741a = dVar;
        }

        public boolean cancel(boolean z10) {
            if (z10) {
                this.f137741a.cancel();
            }
            return super.cancel(z10);
        }
    }

    @IgnoreJRERequirement
    private static final class c<R> implements C16362e<R, CompletableFuture<x<R>>> {

        /* renamed from: a  reason: collision with root package name */
        private final Type f137742a;

        @IgnoreJRERequirement
        private class a implements f<R> {

            /* renamed from: a  reason: collision with root package name */
            private final CompletableFuture<x<R>> f137743a;

            public a(CompletableFuture<x<R>> completableFuture) {
                this.f137743a = completableFuture;
            }

            public void a(C16361d<R> dVar, Throwable th2) {
                this.f137743a.completeExceptionally(th2);
            }

            public void b(C16361d<R> dVar, x<R> xVar) {
                this.f137743a.complete(xVar);
            }
        }

        c(Type type) {
            this.f137742a = type;
        }

        public Type a() {
            return this.f137742a;
        }

        /* renamed from: c */
        public CompletableFuture<x<R>> b(C16361d<R> dVar) {
            b bVar = new b(dVar);
            dVar.E0(new a(bVar));
            return bVar;
        }
    }

    g() {
    }

    public C16362e<?, ?> a(Type type, Annotation[] annotationArr, y yVar) {
        if (C16362e.a.c(type) != CompletableFuture.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type b10 = C16362e.a.b(0, (ParameterizedType) type);
            if (C16362e.a.c(b10) != x.class) {
                return new a(b10);
            }
            if (b10 instanceof ParameterizedType) {
                return new c(C16362e.a.b(0, (ParameterizedType) b10));
            }
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
    }
}
