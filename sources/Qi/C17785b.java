package qI;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import uI.C18064m;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\f\u001a\u00020\u000b2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\f\u0010\rJ+\u0010\u000f\u001a\u00020\u000e2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010\u0012\u001a\u00028\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J.\u0010\u0015\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\u0014\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0014\u001a\u00028\u00008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001a¨\u0006\u001b"}, d2 = {"LqI/b;", "V", "LqI/d;", "", "initialValue", "<init>", "(Ljava/lang/Object;)V", "LuI/m;", "property", "oldValue", "newValue", "", "d", "(LuI/m;Ljava/lang/Object;Ljava/lang/Object;)Z", "LXH/N;", "c", "(LuI/m;Ljava/lang/Object;Ljava/lang/Object;)V", "thisRef", "a", "(Ljava/lang/Object;LuI/m;)Ljava/lang/Object;", "value", "b", "(Ljava/lang/Object;LuI/m;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: qI.b  reason: case insensitive filesystem */
public abstract class C17785b<V> implements C17787d<Object, V> {

    /* renamed from: a  reason: collision with root package name */
    private V f146468a;

    public C17785b(V v10) {
        this.f146468a = v10;
    }

    public V a(Object obj, C18064m<?> mVar) {
        C17542s.j(mVar, "property");
        return this.f146468a;
    }

    public void b(Object obj, C18064m<?> mVar, V v10) {
        C17542s.j(mVar, "property");
        V v11 = this.f146468a;
        if (d(mVar, v11, v10)) {
            this.f146468a = v10;
            c(mVar, v11, v10);
        }
    }

    /* access modifiers changed from: protected */
    public void c(C18064m<?> mVar, V v10, V v11) {
        C17542s.j(mVar, "property");
    }

    /* access modifiers changed from: protected */
    public boolean d(C18064m<?> mVar, V v10, V v11) {
        C17542s.j(mVar, "property");
        return true;
    }

    public String toString() {
        return "ObservableProperty(value=" + this.f146468a + ')';
    }
}
