package SL;

import GK.C15777E;
import QL.h;
import fK.C17251d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000f¨\u0006\u0010"}, d2 = {"LSL/a;", "T", "LQL/h;", "LGK/E;", "LfK/d;", "loader", "LSL/e;", "serializer", "<init>", "(LfK/d;LSL/e;)V", "value", "b", "(LGK/E;)Ljava/lang/Object;", "a", "LfK/d;", "LSL/e;", "kotlinx-serialization"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: SL.a  reason: case insensitive filesystem */
public final class C16452a<T> implements h<C15777E, T> {

    /* renamed from: a  reason: collision with root package name */
    private final C17251d<T> f138350a;

    /* renamed from: b  reason: collision with root package name */
    private final C16456e f138351b;

    public C16452a(C17251d<? extends T> dVar, C16456e eVar) {
        C17542s.j(dVar, "loader");
        C17542s.j(eVar, "serializer");
        this.f138350a = dVar;
        this.f138351b = eVar;
    }

    /* renamed from: b */
    public T a(C15777E e10) {
        C17542s.j(e10, "value");
        return this.f138351b.a(this.f138350a, e10);
    }
}
