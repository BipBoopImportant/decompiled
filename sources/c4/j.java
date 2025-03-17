package C4;

import XH.C16807N;
import YH.X;
import com.google.android.libraries.places.api.model.PlaceTypes;
import fK.C17256i;
import fK.z;
import hK.C17336b;
import hK.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.P;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import nI.C17631a;
import nI.C17642l;
import nI.q;
import uI.C18055d;
import uI.C18068q;
import x4.C8942f;
import x4.C8943g;
import x4.C8946j;
import x4.F;

@Metadata(d1 = {"\u0000\\\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\u001aE\u0010\b\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\b\u0010\t\u001a?\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0002H\u0007¢\u0006\u0004\b\f\u0010\r\u001a=\u0010\u0010\u001a\u00020\u0006\"\b\b\u0000\u0010\u0000*\u00020\u000e2\u0006\u0010\u000f\u001a\u00028\u00002\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00040\u0002H\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a-\u0010\u0015\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a5\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\u0004*\u00020\u00172\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001f\u0010\u001b\u001a\u00020\u001a\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001aa\u0010\u001f\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00022&\u0010\u001e\u001a\"\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0004\u0012\u0004\u0012\u00020\u00130\u001dH\u0003¢\u0006\u0004\b\u001f\u0010 \u001ac\u0010!\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00040\u00022&\u0010\u001e\u001a\"\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0004\u0012\u0004\u0012\u00020\u00130\u001dH\u0003¢\u0006\u0004\b!\u0010 \u001a/\u0010%\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¢\u0006\u0004\b%\u0010&\u001a\u0013\u0010(\u001a\u00020'*\u00020\u0017H\u0000¢\u0006\u0004\b(\u0010)¨\u0006*"}, d2 = {"T", "Lkotlinx/serialization/KSerializer;", "", "LuI/q;", "Lx4/F;", "typeMap", "", "path", "i", "(Lkotlinx/serialization/KSerializer;Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;", "", "Lx4/f;", "h", "(Lkotlinx/serialization/KSerializer;Ljava/util/Map;)Ljava/util/List;", "", "route", "k", "(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/String;", "Lkotlin/Function0;", "LXH/N;", "handler", "c", "(Lkotlinx/serialization/KSerializer;LnI/a;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "d", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Ljava/util/Map;)Lx4/F;", "", "g", "(Lkotlinx/serialization/KSerializer;)I", "Lkotlin/Function3;", "operation", "e", "(Lkotlinx/serialization/KSerializer;Ljava/util/Map;LnI/q;)V", "f", "fieldName", "fieldType", "className", "m", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "l", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Z", "navigation-common_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class j {

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ KSerializer<T> f33717c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(KSerializer<T> kSerializer) {
            super(0);
            this.f33717c = kSerializer;
        }

        public final void invoke() {
            throw new IllegalArgumentException("Cannot generate NavArguments for polymorphic serializer " + this.f33717c + ". Arguments can only be generated from concrete classes or objects.");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lx4/j;", "LXH/N;", "a", "(Lx4/j;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17642l<C8946j, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ KSerializer<T> f33718c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f33719d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Map<C18068q, F<?>> f33720e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f33721f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(KSerializer<T> kSerializer, int i10, Map<C18068q, ? extends F<?>> map, String str) {
            super(1);
            this.f33718c = kSerializer;
            this.f33719d = i10;
            this.f33720e = map;
            this.f33721f = str;
        }

        public final void a(C8946j jVar) {
            C17542s.j(jVar, "$this$navArgument");
            SerialDescriptor g10 = this.f33718c.getDescriptor().g(this.f33719d);
            boolean b10 = g10.b();
            F a10 = j.d(g10, this.f33720e);
            if (a10 != null) {
                jVar.d(a10);
                jVar.c(b10);
                if (this.f33718c.getDescriptor().j(this.f33719d)) {
                    jVar.e(true);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException(j.m(this.f33721f, g10.i(), this.f33718c.getDescriptor().i(), this.f33720e.toString()));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C8946j) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class c extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ KSerializer<T> f33722c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(KSerializer<T> kSerializer) {
            super(0);
            this.f33722c = kSerializer;
        }

        public final void invoke() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot generate route pattern from polymorphic class ");
            C18055d<?> a10 = C17336b.a(this.f33722c.getDescriptor());
            sb2.append(a10 != null ? a10.f() : null);
            sb2.append(". Routes can only be generated from concrete classes or objects.");
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"T", "", "index", "", "argName", "Lx4/F;", "", "navType", "LXH/N;", "a", "(ILjava/lang/String;Lx4/F;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends C17544u implements q<Integer, String, F<Object>, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f<T> f33723c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(f<T> fVar) {
            super(3);
            this.f33723c = fVar;
        }

        public final void a(int i10, String str, F<Object> f10) {
            C17542s.j(str, "argName");
            C17542s.j(f10, "navType");
            this.f33723c.d(i10, str, f10);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a(((Number) obj).intValue(), (String) obj2, (F) obj3);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "T", "", "index", "", "argName", "Lx4/F;", "navType", "LXH/N;", "a", "(ILjava/lang/String;Lx4/F;)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends C17544u implements q<Integer, String, F<Object>, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Map<String, List<String>> f33724c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ f<? extends T> f33725d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(Map<String, ? extends List<String>> map, f<? extends T> fVar) {
            super(3);
            this.f33724c = map;
            this.f33725d = fVar;
        }

        public final void a(int i10, String str, F<Object> f10) {
            C17542s.j(str, "argName");
            C17542s.j(f10, "navType");
            List<String> list = this.f33724c.get(str);
            C17542s.g(list);
            this.f33725d.c(i10, str, f10, list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a(((Number) obj).intValue(), (String) obj2, (F) obj3);
            return C16807N.f139792a;
        }
    }

    private static final <T> void c(KSerializer<T> kSerializer, C17631a<C16807N> aVar) {
        if (kSerializer instanceof C17256i) {
            aVar.invoke();
        }
    }

    /* access modifiers changed from: private */
    public static final F<Object> d(SerialDescriptor serialDescriptor, Map<C18068q, ? extends F<?>> map) {
        Object obj;
        Iterator it = map.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (e.c(serialDescriptor, (C18068q) obj)) {
                break;
            }
        }
        C18068q qVar = (C18068q) obj;
        F<?> f10 = qVar != null ? (F) map.get(qVar) : null;
        if (f10 == null) {
            f10 = null;
        }
        if (f10 == null) {
            f10 = e.b(serialDescriptor);
        }
        if (C17542s.e(f10, l.f33728t)) {
            return null;
        }
        C17542s.h(f10, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any?>");
        return f10;
    }

    private static final <T> void e(KSerializer<T> kSerializer, Map<C18068q, ? extends F<?>> map, q<? super Integer, ? super String, ? super F<Object>, C16807N> qVar) {
        int d10 = kSerializer.getDescriptor().d();
        int i10 = 0;
        while (i10 < d10) {
            String e10 = kSerializer.getDescriptor().e(i10);
            F<Object> d11 = d(kSerializer.getDescriptor().g(i10), map);
            if (d11 != null) {
                qVar.invoke(Integer.valueOf(i10), e10, d11);
                i10++;
            } else {
                throw new IllegalArgumentException(m(e10, kSerializer.getDescriptor().g(i10).i(), kSerializer.getDescriptor().i(), map.toString()));
            }
        }
    }

    private static final <T> void f(KSerializer<T> kSerializer, Map<String, ? extends F<Object>> map, q<? super Integer, ? super String, ? super F<Object>, C16807N> qVar) {
        int d10 = kSerializer.getDescriptor().d();
        int i10 = 0;
        while (i10 < d10) {
            String e10 = kSerializer.getDescriptor().e(i10);
            F f10 = (F) map.get(e10);
            if (f10 != null) {
                qVar.invoke(Integer.valueOf(i10), e10, f10);
                i10++;
            } else {
                throw new IllegalStateException(("Cannot locate NavType for argument [" + e10 + ']').toString());
            }
        }
    }

    public static final <T> int g(KSerializer<T> kSerializer) {
        C17542s.j(kSerializer, "<this>");
        int hashCode = kSerializer.getDescriptor().i().hashCode();
        int d10 = kSerializer.getDescriptor().d();
        for (int i10 = 0; i10 < d10; i10++) {
            hashCode = (hashCode * 31) + kSerializer.getDescriptor().e(i10).hashCode();
        }
        return hashCode;
    }

    public static final <T> List<C8942f> h(KSerializer<T> kSerializer, Map<C18068q, ? extends F<?>> map) {
        C17542s.j(kSerializer, "<this>");
        C17542s.j(map, "typeMap");
        c(kSerializer, new a(kSerializer));
        int d10 = kSerializer.getDescriptor().d();
        ArrayList arrayList = new ArrayList(d10);
        for (int i10 = 0; i10 < d10; i10++) {
            String e10 = kSerializer.getDescriptor().e(i10);
            arrayList.add(C8943g.a(e10, new b(kSerializer, i10, map, e10)));
        }
        return arrayList;
    }

    public static final <T> String i(KSerializer<T> kSerializer, Map<C18068q, ? extends F<?>> map, String str) {
        C17542s.j(kSerializer, "<this>");
        C17542s.j(map, "typeMap");
        c(kSerializer, new c(kSerializer));
        f fVar = str != null ? new f(str, kSerializer) : new f(kSerializer);
        e(kSerializer, map, new d(fVar));
        return fVar.e();
    }

    public static /* synthetic */ String j(KSerializer kSerializer, Map map, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = X.j();
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        return i(kSerializer, map, str);
    }

    public static final <T> String k(T t10, Map<String, ? extends F<Object>> map) {
        C17542s.j(t10, PlaceTypes.ROUTE);
        C17542s.j(map, "typeMap");
        KSerializer e10 = z.e(P.b(t10.getClass()));
        Map<String, List<String>> K10 = new i(e10, map).K(t10);
        f fVar = new f(e10);
        f(e10, map, new e(K10, fVar));
        return fVar.e();
    }

    public static final boolean l(SerialDescriptor serialDescriptor) {
        C17542s.j(serialDescriptor, "<this>");
        return C17542s.e(serialDescriptor.h(), m.a.f143470a) && serialDescriptor.isInline() && serialDescriptor.d() == 1;
    }

    /* access modifiers changed from: private */
    public static final String m(String str, String str2, String str3, String str4) {
        return "Route " + str3 + " could not find any NavType for argument " + str + " of type " + str2 + " - typeMap received was " + str4;
    }
}
