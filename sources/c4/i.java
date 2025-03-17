package C4;

import YH.C16877v;
import YH.X;
import fK.r;
import iK.C17393b;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import mK.C17611d;
import mK.C17613f;
import x4.C8940d;
import x4.F;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0005\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B1\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00100\u00062\u0006\u0010\f\u001a\u00020\u0001¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0014\u001a\u00020\r\"\u0004\b\u0001\u0010\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00132\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u001d\u0010\u000fJ\u000f\u0010\u001e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R(\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b0\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010+\u001a\u00020'8\u0016X\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b#\u0010*R&\u0010.\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00100,8\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010&R\u0016\u00100\u001a\u00020\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b/\u0010\u001b¨\u00061"}, d2 = {"LC4/i;", "", "T", "LiK/b;", "Lkotlinx/serialization/KSerializer;", "serializer", "", "", "Lx4/F;", "typeMap", "<init>", "(Lkotlinx/serialization/KSerializer;Ljava/util/Map;)V", "value", "LXH/N;", "L", "(Ljava/lang/Object;)V", "", "K", "(Ljava/lang/Object;)Ljava/util/Map;", "LfK/r;", "n", "(LfK/r;Ljava/lang/Object;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "index", "", "I", "(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", "J", "o", "()V", "Lkotlinx/serialization/encoding/Encoder;", "k", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Encoder;", "a", "Lkotlinx/serialization/KSerializer;", "b", "Ljava/util/Map;", "LmK/d;", "c", "LmK/d;", "()LmK/d;", "serializersModule", "", "d", "map", "e", "elementIndex", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class i<T> extends C17393b {

    /* renamed from: a  reason: collision with root package name */
    private final KSerializer<T> f33712a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, F<Object>> f33713b;

    /* renamed from: c  reason: collision with root package name */
    private final C17611d f33714c = C17613f.a();

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, List<String>> f33715d = new LinkedHashMap();

    /* renamed from: e  reason: collision with root package name */
    private int f33716e = -1;

    public i(KSerializer<T> kSerializer, Map<String, ? extends F<Object>> map) {
        C17542s.j(kSerializer, "serializer");
        C17542s.j(map, "typeMap");
        this.f33712a = kSerializer;
        this.f33713b = map;
    }

    private final void L(Object obj) {
        String e10 = this.f33712a.getDescriptor().e(this.f33716e);
        F f10 = this.f33713b.get(e10);
        if (f10 != null) {
            this.f33715d.put(e10, f10 instanceof C8940d ? ((C8940d) f10).l(obj) : C16877v.e(f10.i(obj)));
            return;
        }
        throw new IllegalStateException(("Cannot find NavType for argument " + e10 + ". Please provide NavType through typeMap.").toString());
    }

    public boolean I(SerialDescriptor serialDescriptor, int i10) {
        C17542s.j(serialDescriptor, "descriptor");
        this.f33716e = i10;
        return true;
    }

    public void J(Object obj) {
        C17542s.j(obj, "value");
        L(obj);
    }

    public final Map<String, List<String>> K(Object obj) {
        C17542s.j(obj, "value");
        super.n(this.f33712a, obj);
        return X.x(this.f33715d);
    }

    public C17611d a() {
        return this.f33714c;
    }

    public Encoder k(SerialDescriptor serialDescriptor) {
        C17542s.j(serialDescriptor, "descriptor");
        if (j.l(serialDescriptor)) {
            this.f33716e = 0;
        }
        return super.k(serialDescriptor);
    }

    public <T> void n(r<? super T> rVar, T t10) {
        C17542s.j(rVar, "serializer");
        L(t10);
    }

    public void o() {
        L((Object) null);
    }
}
