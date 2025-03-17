package SL;

import GK.C15775C;
import GK.C15777E;
import GK.C15805x;
import QL.h;
import QL.y;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J;\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0002\b\u0003\u0018\u00010\u000f2\u0006\u0010\t\u001a\u00020\b2\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012JK\u0010\u0016\u001a\u000e\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000f2\u0006\u0010\t\u001a\u00020\b2\u000e\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n2\u000e\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"LSL/b;", "LQL/h$a;", "LGK/x;", "contentType", "LSL/e;", "serializer", "<init>", "(LGK/x;LSL/e;)V", "Ljava/lang/reflect/Type;", "type", "", "", "annotations", "LQL/y;", "retrofit", "LQL/h;", "LGK/E;", "d", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;LQL/y;)LQL/h;", "parameterAnnotations", "methodAnnotations", "LGK/C;", "c", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;LQL/y;)LQL/h;", "a", "LGK/x;", "b", "LSL/e;", "kotlinx-serialization"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: SL.b  reason: case insensitive filesystem */
public final class C16453b extends h.a {

    /* renamed from: a  reason: collision with root package name */
    private final C15805x f138352a;

    /* renamed from: b  reason: collision with root package name */
    private final C16456e f138353b;

    public C16453b(C15805x xVar, C16456e eVar) {
        C17542s.j(xVar, "contentType");
        C17542s.j(eVar, "serializer");
        this.f138352a = xVar;
        this.f138353b = eVar;
    }

    public h<?, C15775C> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, y yVar) {
        C17542s.j(type, "type");
        C17542s.j(annotationArr, "parameterAnnotations");
        C17542s.j(annotationArr2, "methodAnnotations");
        C17542s.j(yVar, "retrofit");
        return new C16455d(this.f138352a, this.f138353b.c(type), this.f138353b);
    }

    public h<C15777E, ?> d(Type type, Annotation[] annotationArr, y yVar) {
        C17542s.j(type, "type");
        C17542s.j(annotationArr, "annotations");
        C17542s.j(yVar, "retrofit");
        return new C16452a(this.f138353b.c(type), this.f138353b);
    }
}
