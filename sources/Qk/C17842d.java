package qK;

import D5.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LqK/d;", "", "model", "LD5/a;", "equalityDelegate", "<init>", "(Ljava/lang/Object;LD5/a;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "b", "LD5/a;", "coil_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: qK.d  reason: case insensitive filesystem */
final class C17842d {

    /* renamed from: a  reason: collision with root package name */
    private final Object f146653a;

    /* renamed from: b  reason: collision with root package name */
    private final a f146654b;

    public C17842d(Object obj, a aVar) {
        C17542s.j(aVar, "equalityDelegate");
        this.f146653a = obj;
        this.f146654b = aVar;
    }

    public final Object a() {
        return this.f146653a;
    }

    public boolean equals(Object obj) {
        a aVar = this.f146654b;
        Object obj2 = this.f146653a;
        Object obj3 = null;
        C17842d dVar = obj instanceof C17842d ? (C17842d) obj : null;
        if (dVar != null) {
            obj3 = dVar.f146653a;
        }
        return aVar.c(obj2, obj3);
    }

    public int hashCode() {
        return this.f146654b.b(this.f146653a);
    }
}
