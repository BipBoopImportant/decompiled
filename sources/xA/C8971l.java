package xa;

import java.util.concurrent.Executor;

/* renamed from: xa.l  reason: case insensitive filesystem */
public abstract class C8971l<TResult> {
    public C8971l<TResult> a(Executor executor, C8964e eVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    public C8971l<TResult> b(Executor executor, C8965f<TResult> fVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public C8971l<TResult> c(C8965f<TResult> fVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public abstract C8971l<TResult> d(Executor executor, C8966g gVar);

    public abstract C8971l<TResult> e(C8966g gVar);

    public abstract C8971l<TResult> f(Executor executor, C8967h<? super TResult> hVar);

    public abstract C8971l<TResult> g(C8967h<? super TResult> hVar);

    public <TContinuationResult> C8971l<TContinuationResult> h(Executor executor, C8962c<TResult, TContinuationResult> cVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> C8971l<TContinuationResult> i(C8962c<TResult, TContinuationResult> cVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> C8971l<TContinuationResult> j(Executor executor, C8962c<TResult, C8971l<TContinuationResult>> cVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public <TContinuationResult> C8971l<TContinuationResult> k(C8962c<TResult, C8971l<TContinuationResult>> cVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public abstract Exception l();

    public abstract TResult m();

    public abstract <X extends Throwable> TResult n(Class<X> cls);

    public abstract boolean o();

    public abstract boolean p();

    public abstract boolean q();

    public <TContinuationResult> C8971l<TContinuationResult> r(Executor executor, C8970k<TResult, TContinuationResult> kVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    public <TContinuationResult> C8971l<TContinuationResult> s(C8970k<TResult, TContinuationResult> kVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
