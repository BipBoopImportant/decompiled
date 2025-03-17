package lK;

import YH.X;
import YH.g0;
import com.optimizely.ab.config.FeatureVariable;
import hK.C17338d;
import hK.l;
import iK.C17394c;
import jK.Y;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kK.C17514c;
import kK.F;
import kK.j;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0012\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020!2\u0006\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010,\u001a\u00020\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010/\u001a\u00020\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, d2 = {"LlK/O;", "LlK/c;", "LkK/c;", "json", "Lkotlinx/serialization/json/JsonObject;", "value", "", "polymorphicDiscriminator", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "polyDescriptor", "<init>", "(LkK/c;Lkotlinx/serialization/json/JsonObject;Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "descriptor", "", "index", "tag", "", "E0", "(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)Z", "D0", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", "p", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)I", "F", "()Z", "g0", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String;", "Lkotlinx/serialization/json/JsonElement;", "m0", "(Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;", "LiK/c;", "b", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)LiK/c;", "LXH/N;", "c", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "h", "Lkotlinx/serialization/json/JsonObject;", "F0", "()Lkotlinx/serialization/json/JsonObject;", "i", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "j", "I", "position", "k", "Z", "forceNull", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
class O extends C17572c {

    /* renamed from: h  reason: collision with root package name */
    private final JsonObject f144437h;

    /* renamed from: i  reason: collision with root package name */
    private final SerialDescriptor f144438i;

    /* renamed from: j  reason: collision with root package name */
    private int f144439j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f144440k;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ O(C17514c cVar, JsonObject jsonObject, String str, SerialDescriptor serialDescriptor, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, jsonObject, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : serialDescriptor);
    }

    private final boolean D0(SerialDescriptor serialDescriptor, int i10) {
        boolean z10 = !d().g().j() && !serialDescriptor.j(i10) && serialDescriptor.g(i10).b();
        this.f144440k = z10;
        return z10;
    }

    private final boolean E0(SerialDescriptor serialDescriptor, int i10, String str) {
        C17514c d10 = d();
        boolean j10 = serialDescriptor.j(i10);
        SerialDescriptor g10 = serialDescriptor.g(i10);
        if (j10 && !g10.b() && (m0(str) instanceof JsonNull)) {
            return true;
        }
        if (C17542s.e(g10.h(), l.b.f143469a) && (!g10.b() || !(m0(str) instanceof JsonNull))) {
            JsonElement m02 = m0(str);
            String str2 = null;
            JsonPrimitive jsonPrimitive = m02 instanceof JsonPrimitive ? (JsonPrimitive) m02 : null;
            if (jsonPrimitive != null) {
                str2 = j.f(jsonPrimitive);
            }
            if (str2 != null) {
                int i11 = C17567H.i(g10, d10, str2);
                boolean z10 = !d10.g().j() && g10.b();
                if (i11 == -3 && (j10 || z10)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean F() {
        return !this.f144440k && super.F();
    }

    /* renamed from: F0 */
    public JsonObject A0() {
        return this.f144437h;
    }

    public C17394c b(SerialDescriptor serialDescriptor) {
        C17542s.j(serialDescriptor, "descriptor");
        if (serialDescriptor != this.f144438i) {
            return super.b(serialDescriptor);
        }
        C17514c d10 = d();
        JsonElement n02 = n0();
        String i10 = this.f144438i.i();
        if (n02 instanceof JsonObject) {
            return new O(d10, (JsonObject) n02, z0(), this.f144438i);
        }
        throw C17562C.f(-1, "Expected " + P.b(JsonObject.class).f() + ", but had " + P.b(n02.getClass()).f() + " as the serialized body of " + i10 + " at element: " + j0(), n02.toString());
    }

    public void c(SerialDescriptor serialDescriptor) {
        Set<String> set;
        C17542s.j(serialDescriptor, "descriptor");
        if (!C17567H.m(serialDescriptor, d()) && !(serialDescriptor.h() instanceof C17338d)) {
            C17567H.n(serialDescriptor, d());
            if (!this.f144498g.o()) {
                set = Y.a(serialDescriptor);
            } else {
                Set a10 = Y.a(serialDescriptor);
                Map map = (Map) F.a(d()).a(serialDescriptor, C17567H.g());
                Set keySet = map != null ? map.keySet() : null;
                if (keySet == null) {
                    keySet = g0.d();
                }
                set = g0.k(a10, keySet);
            }
            for (String next : A0().keySet()) {
                if (!set.contains(next) && !C17542s.e(next, z0())) {
                    throw C17562C.e(-1, "Encountered an unknown key '" + next + "' at element: " + j0() + "\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: " + C17562C.j(A0().toString(), 0, 1, (Object) null));
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public String g0(SerialDescriptor serialDescriptor, int i10) {
        Object obj;
        C17542s.j(serialDescriptor, "descriptor");
        C17567H.n(serialDescriptor, d());
        String e10 = serialDescriptor.e(i10);
        if (!this.f144498g.o() || A0().keySet().contains(e10)) {
            return e10;
        }
        Map<String, Integer> e11 = C17567H.e(d(), serialDescriptor);
        Iterator it = A0().keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Integer num = e11.get((String) obj);
            if (num != null && num.intValue() == i10) {
                break;
            }
        }
        String str = (String) obj;
        return str != null ? str : e10;
    }

    /* access modifiers changed from: protected */
    public JsonElement m0(String str) {
        C17542s.j(str, "tag");
        return (JsonElement) X.k(A0(), str);
    }

    public int p(SerialDescriptor serialDescriptor) {
        C17542s.j(serialDescriptor, "descriptor");
        while (this.f144439j < serialDescriptor.d()) {
            int i10 = this.f144439j;
            this.f144439j = i10 + 1;
            String h02 = a0(serialDescriptor, i10);
            int i11 = this.f144439j - 1;
            this.f144440k = false;
            if ((A0().containsKey(h02) || D0(serialDescriptor, i11)) && (!this.f144498g.g() || !E0(serialDescriptor, i11, h02))) {
                return i11;
            }
        }
        return -1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public O(C17514c cVar, JsonObject jsonObject, String str, SerialDescriptor serialDescriptor) {
        super(cVar, jsonObject, str, (DefaultConstructorMarker) null);
        C17542s.j(cVar, FeatureVariable.JSON_TYPE);
        C17542s.j(jsonObject, "value");
        this.f144437h = jsonObject;
        this.f144438i = serialDescriptor;
    }
}
