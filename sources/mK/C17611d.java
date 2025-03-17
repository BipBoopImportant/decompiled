package mK;

import YH.C16877v;
import fK.C17251d;
import fK.r;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import uI.C18055d;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b\"\b\b\u0000\u0010\u0004*\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0012\b\u0002\u0010\t\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0007H'¢\u0006\u0004\b\n\u0010\u000bJ9\u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e\"\b\b\u0000\u0010\u0004*\u00020\u00012\u000e\u0010\f\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00052\u0006\u0010\r\u001a\u00028\u0000H'¢\u0006\u0004\b\u000f\u0010\u0010J;\u0010\u0014\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0013\"\b\b\u0000\u0010\u0004*\u00020\u00012\u000e\u0010\f\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H'¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H'¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001f\u001a\u00020\u001b8 X¡\u0004¢\u0006\f\u0012\u0004\b\u001e\u0010\u0003\u001a\u0004\b\u001c\u0010\u001d\u0001\u0001 ¨\u0006!"}, d2 = {"LmK/d;", "", "<init>", "()V", "T", "LuI/d;", "kClass", "", "Lkotlinx/serialization/KSerializer;", "typeArgumentsSerializers", "b", "(LuI/d;Ljava/util/List;)Lkotlinx/serialization/KSerializer;", "baseClass", "value", "LfK/r;", "f", "(LuI/d;Ljava/lang/Object;)LfK/r;", "", "serializedClassName", "LfK/d;", "e", "(LuI/d;Ljava/lang/String;)LfK/d;", "LmK/h;", "collector", "LXH/N;", "a", "(LmK/h;)V", "", "d", "()Z", "getHasInterfaceContextualSerializers$kotlinx_serialization_core$annotations", "hasInterfaceContextualSerializers", "LmK/b;", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: mK.d  reason: case insensitive filesystem */
public abstract class C17611d {
    public /* synthetic */ C17611d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ KSerializer c(C17611d dVar, C18055d dVar2, List list, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                list = C16877v.n();
            }
            return dVar.b(dVar2, list);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContextual");
    }

    public abstract void a(C17615h hVar);

    public abstract <T> KSerializer<T> b(C18055d<T> dVar, List<? extends KSerializer<?>> list);

    public abstract boolean d();

    public abstract <T> C17251d<T> e(C18055d<? super T> dVar, String str);

    public abstract <T> r<T> f(C18055d<? super T> dVar, T t10);

    private C17611d() {
    }
}
