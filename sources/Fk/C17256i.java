package fK;

import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import YH.C16877v;
import gK.C17294a;
import hK.C17335a;
import hK.C17336b;
import hK.C17338d;
import hK.k;
import hK.l;
import jK.C17443b;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.V;
import kotlinx.serialization.descriptors.SerialDescriptor;
import nI.C17642l;
import uI.C18055d;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0019\u001a\u00020\u00148VX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"LfK/i;", "", "T", "LjK/b;", "LuI/d;", "baseClass", "<init>", "(LuI/d;)V", "", "toString", "()Ljava/lang/String;", "a", "LuI/d;", "f", "()LuI/d;", "", "", "b", "Ljava/util/List;", "_annotations", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "c", "LXH/o;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: fK.i  reason: case insensitive filesystem */
public final class C17256i<T> extends C17443b<T> {

    /* renamed from: a  reason: collision with root package name */
    private final C18055d<T> f143263a;

    /* renamed from: b  reason: collision with root package name */
    private List<? extends Annotation> f143264b = C16877v.n();

    /* renamed from: c  reason: collision with root package name */
    private final C16824o f143265c = C16825p.a(s.PUBLICATION, new C17254g(this));

    public C17256i(C18055d<T> dVar) {
        C17542s.j(dVar, "baseClass");
        this.f143263a = dVar;
    }

    /* access modifiers changed from: private */
    public static final SerialDescriptor i(C17256i iVar) {
        return C17336b.c(k.e("kotlinx.serialization.Polymorphic", C17338d.a.f143437a, new SerialDescriptor[0], new C17255h(iVar)), iVar.f());
    }

    /* access modifiers changed from: private */
    public static final C16807N j(C17256i iVar, C17335a aVar) {
        C17542s.j(aVar, "$this$buildSerialDescriptor");
        C17335a.b(aVar, "type", C17294a.K(V.f144353a).getDescriptor(), (List) null, false, 12, (Object) null);
        C17335a.b(aVar, "value", k.f("kotlinx.serialization.Polymorphic<" + iVar.f().f() + '>', l.a.f143468a, new SerialDescriptor[0], (C17642l) null, 8, (Object) null), (List) null, false, 12, (Object) null);
        aVar.h(iVar.f143264b);
        return C16807N.f139792a;
    }

    public C18055d<T> f() {
        return this.f143263a;
    }

    public SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.f143265c.getValue();
    }

    public String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + f() + ')';
    }
}
