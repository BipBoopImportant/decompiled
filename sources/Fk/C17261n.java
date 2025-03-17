package fK;

import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import YH.C16856M;
import YH.C16870n;
import YH.C16877v;
import YH.X;
import gK.C17294a;
import hK.C17335a;
import hK.C17338d;
import hK.k;
import hK.l;
import iK.C17394c;
import jK.C17443b;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.V;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import uI.C18055d;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0004\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003BI\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0014\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00060\b\u0012\u0014\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\n0\b¢\u0006\u0004\b\f\u0010\rBY\b\u0011\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0014\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00060\b\u0012\u0014\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\n0\b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\b¢\u0006\u0004\b\f\u0010\u0010J)\u0010\u0015\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00142\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0016X\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000e0!8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u001b\u0010*\u001a\u00020%8VX\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R0\u0010-\u001a\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0006\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\n0+8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010,R(\u0010.\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\n0+8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010,¨\u0006/"}, d2 = {"LfK/n;", "", "T", "LjK/b;", "", "serialName", "LuI/d;", "baseClass", "", "subclasses", "Lkotlinx/serialization/KSerializer;", "subclassSerializers", "<init>", "(Ljava/lang/String;LuI/d;[LuI/d;[Lkotlinx/serialization/KSerializer;)V", "", "classAnnotations", "(Ljava/lang/String;LuI/d;[LuI/d;[Lkotlinx/serialization/KSerializer;[Ljava/lang/annotation/Annotation;)V", "LiK/c;", "decoder", "klassName", "LfK/d;", "d", "(LiK/c;Ljava/lang/String;)LfK/d;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LfK/r;", "e", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)LfK/r;", "a", "LuI/d;", "f", "()LuI/d;", "", "b", "Ljava/util/List;", "_annotations", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "c", "LXH/o;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "Ljava/util/Map;", "class2Serializer", "serialName2Serializer", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: fK.n  reason: case insensitive filesystem */
public final class C17261n<T> extends C17443b<T> {

    /* renamed from: a  reason: collision with root package name */
    private final C18055d<T> f143270a;

    /* renamed from: b  reason: collision with root package name */
    private List<? extends Annotation> f143271b;

    /* renamed from: c  reason: collision with root package name */
    private final C16824o f143272c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<C18055d<? extends T>, KSerializer<? extends T>> f143273d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, KSerializer<? extends T>> f143274e;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u0015\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"fK/n$a", "LYH/M;", "", "b", "()Ljava/util/Iterator;", "element", "a", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: fK.n$a */
    public static final class a implements C16856M<Map.Entry<? extends C18055d<? extends T>, ? extends KSerializer<? extends T>>, String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Iterable f143275a;

        public a(Iterable iterable) {
            this.f143275a = iterable;
        }

        public String a(Map.Entry<? extends C18055d<? extends T>, ? extends KSerializer<? extends T>> entry) {
            return ((KSerializer) entry.getValue()).getDescriptor().i();
        }

        public Iterator<Map.Entry<? extends C18055d<? extends T>, ? extends KSerializer<? extends T>>> b() {
            return this.f143275a.iterator();
        }
    }

    public C17261n(String str, C18055d<T> dVar, C18055d<? extends T>[] dVarArr, KSerializer<? extends T>[] kSerializerArr) {
        C17542s.j(str, "serialName");
        C17542s.j(dVar, "baseClass");
        C17542s.j(dVarArr, "subclasses");
        C17542s.j(kSerializerArr, "subclassSerializers");
        this.f143270a = dVar;
        this.f143271b = C16877v.n();
        this.f143272c = C16825p.a(s.PUBLICATION, new C17258k(str, this));
        if (dVarArr.length == kSerializerArr.length) {
            Map<C18055d<? extends T>, KSerializer<? extends T>> v10 = X.v(C16870n.s1(dVarArr, kSerializerArr));
            this.f143273d = v10;
            a aVar = new a(v10.entrySet());
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator b10 = aVar.b();
            while (b10.hasNext()) {
                Object next = b10.next();
                Object a10 = aVar.a(next);
                Object obj = linkedHashMap.get(a10);
                if (obj == null) {
                    linkedHashMap.containsKey(a10);
                }
                Map.Entry entry = (Map.Entry) next;
                Map.Entry entry2 = (Map.Entry) obj;
                String str2 = (String) a10;
                if (entry2 == null) {
                    linkedHashMap.put(a10, entry);
                } else {
                    throw new IllegalStateException(("Multiple sealed subclasses of '" + f() + "' have the same serial name '" + str2 + "': '" + entry2.getKey() + "', '" + entry.getKey() + '\'').toString());
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(X.e(linkedHashMap.size()));
            for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                linkedHashMap2.put(entry3.getKey(), (KSerializer) ((Map.Entry) entry3.getValue()).getValue());
            }
            this.f143274e = linkedHashMap2;
            return;
        }
        throw new IllegalArgumentException("All subclasses of sealed class " + f().f() + " should be marked @Serializable");
    }

    /* access modifiers changed from: private */
    public static final SerialDescriptor j(String str, C17261n nVar) {
        return k.e(str, C17338d.b.f143438a, new SerialDescriptor[0], new C17259l(nVar));
    }

    /* access modifiers changed from: private */
    public static final C16807N k(C17261n nVar, C17335a aVar) {
        C17542s.j(aVar, "$this$buildSerialDescriptor");
        C17335a.b(aVar, "type", C17294a.K(V.f144353a).getDescriptor(), (List) null, false, 12, (Object) null);
        C17335a.b(aVar, "value", k.e("kotlinx.serialization.Sealed<" + nVar.f().f() + '>', l.a.f143468a, new SerialDescriptor[0], new C17260m(nVar)), (List) null, false, 12, (Object) null);
        aVar.h(nVar.f143271b);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N l(C17261n nVar, C17335a aVar) {
        C17542s.j(aVar, "$this$buildSerialDescriptor");
        for (Map.Entry next : nVar.f143274e.entrySet()) {
            C17335a.b(aVar, (String) next.getKey(), ((KSerializer) next.getValue()).getDescriptor(), (List) null, false, 12, (Object) null);
        }
        return C16807N.f139792a;
    }

    public C17251d<T> d(C17394c cVar, String str) {
        C17542s.j(cVar, "decoder");
        KSerializer kSerializer = this.f143274e.get(str);
        return kSerializer != null ? kSerializer : super.d(cVar, str);
    }

    public r<T> e(Encoder encoder, T t10) {
        C17542s.j(encoder, "encoder");
        C17542s.j(t10, "value");
        r<T> rVar = this.f143273d.get(P.b(t10.getClass()));
        if (rVar == null) {
            rVar = super.e(encoder, t10);
        }
        if (rVar != null) {
            return rVar;
        }
        return null;
    }

    public C18055d<T> f() {
        return this.f143270a;
    }

    public SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.f143272c.getValue();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C17261n(String str, C18055d<T> dVar, C18055d<? extends T>[] dVarArr, KSerializer<? extends T>[] kSerializerArr, Annotation[] annotationArr) {
        this(str, dVar, dVarArr, kSerializerArr);
        C17542s.j(str, "serialName");
        C17542s.j(dVar, "baseClass");
        C17542s.j(dVarArr, "subclasses");
        C17542s.j(kSerializerArr, "subclassSerializers");
        C17542s.j(annotationArr, "classAnnotations");
        this.f143271b = C16870n.f(annotationArr);
    }
}
