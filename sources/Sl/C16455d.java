package SL;

import GK.C15775C;
import GK.C15805x;
import QL.h;
import fK.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002B%\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0011R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LSL/d;", "T", "LQL/h;", "LGK/C;", "LGK/x;", "contentType", "LfK/r;", "saver", "LSL/e;", "serializer", "<init>", "(LGK/x;LfK/r;LSL/e;)V", "value", "b", "(Ljava/lang/Object;)LGK/C;", "a", "LGK/x;", "LfK/r;", "c", "LSL/e;", "kotlinx-serialization"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: SL.d  reason: case insensitive filesystem */
public final class C16455d<T> implements h<T, C15775C> {

    /* renamed from: a  reason: collision with root package name */
    private final C15805x f138354a;

    /* renamed from: b  reason: collision with root package name */
    private final r<T> f138355b;

    /* renamed from: c  reason: collision with root package name */
    private final C16456e f138356c;

    public C16455d(C15805x xVar, r<? super T> rVar, C16456e eVar) {
        C17542s.j(xVar, "contentType");
        C17542s.j(rVar, "saver");
        C17542s.j(eVar, "serializer");
        this.f138354a = xVar;
        this.f138355b = rVar;
        this.f138356c = eVar;
    }

    /* renamed from: b */
    public C15775C a(T t10) {
        return this.f138356c.d(this.f138354a, this.f138355b, t10);
    }
}
