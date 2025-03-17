package yI;

import YH.C16877v;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import yI.C18724h;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\b\u001a\u0004\u0018\u00010\u00072\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0016¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\f\u001a\u0004\u0018\u00010\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u000e8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"LyI/l;", "LyI/h;", "", "<init>", "()V", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "d", "()Ljava/lang/Void;", "member", "", "Ljava/lang/reflect/Type;", "a", "()Ljava/util/List;", "parameterTypes", "getReturnType", "()Ljava/lang/reflect/Type;", "returnType", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: yI.l  reason: case insensitive filesystem */
public final class C18728l implements C18724h {

    /* renamed from: a  reason: collision with root package name */
    public static final C18728l f152741a = new C18728l();

    private C18728l() {
    }

    public List<Type> a() {
        return C16877v.n();
    }

    public /* bridge */ /* synthetic */ Member b() {
        return (Member) d();
    }

    public boolean c() {
        return C18724h.a.b(this);
    }

    public Object call(Object[] objArr) {
        C17542s.j(objArr, "args");
        throw new UnsupportedOperationException("call/callBy are not supported for this declaration.");
    }

    public Void d() {
        return null;
    }

    public Type getReturnType() {
        Class cls = Void.TYPE;
        C17542s.i(cls, "TYPE");
        return cls;
    }
}
