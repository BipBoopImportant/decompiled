package jK;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import mI.C17603a;
import nI.C17631a;
import nI.C17642l;
import uI.C18055d;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B'\u0012\u001e\u0010\u0006\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fR/\u0010\u0006\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00050\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00110\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012¨\u0006\u0014"}, d2 = {"LjK/t;", "T", "LjK/U0;", "Lkotlin/Function1;", "LuI/d;", "Lkotlinx/serialization/KSerializer;", "compute", "<init>", "(LnI/l;)V", "", "key", "a", "(LuI/d;)Lkotlinx/serialization/KSerializer;", "LnI/l;", "b", "()LnI/l;", "LjK/v;", "LjK/m;", "LjK/v;", "classValue", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: jK.t  reason: case insensitive filesystem */
final class C17478t<T> implements U0<T> {

    /* renamed from: a  reason: collision with root package name */
    private final C17642l<C18055d<?>, KSerializer<T>> f144163a;

    /* renamed from: b  reason: collision with root package name */
    private final C17482v<C17465m<T>> f144164b = new C17482v<>();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: jK.t$a */
    public static final class a implements C17631a<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17478t f144165a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C18055d f144166b;

        public a(C17478t tVar, C18055d dVar) {
            this.f144165a = tVar;
            this.f144166b = dVar;
        }

        public final T invoke() {
            return new C17465m((KSerializer) this.f144165a.b().invoke(this.f144166b));
        }
    }

    public C17478t(C17642l<? super C18055d<?>, ? extends KSerializer<T>> lVar) {
        C17542s.j(lVar, "compute");
        this.f144163a = lVar;
    }

    public KSerializer<T> a(C18055d<Object> dVar) {
        C17542s.j(dVar, "key");
        Object a10 = this.f144164b.get(C17603a.b(dVar));
        C17542s.i(a10, "get(...)");
        C17468n0 n0Var = (C17468n0) a10;
        T t10 = n0Var.f144141a.get();
        if (t10 == null) {
            t10 = n0Var.a(new a(this, dVar));
        }
        return ((C17465m) t10).f144136a;
    }

    public final C17642l<C18055d<?>, KSerializer<T>> b() {
        return this.f144163a;
    }
}
