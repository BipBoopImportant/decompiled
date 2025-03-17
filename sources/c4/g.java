package C4;

import android.os.Bundle;
import androidx.lifecycle.U;
import fK.C17251d;
import iK.C17392a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import mK.C17611d;
import mK.C17616i;
import x4.F;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B)\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0004¢\u0006\u0004\b\b\u0010\tB)\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0004¢\u0006\u0004\b\b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0015\u0010\u000fJ\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010\"\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 H\u0000¢\u0006\u0004\b\"\u0010#J#\u0010$\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 H\u0016¢\u0006\u0004\b$\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010+\u001a\u00020\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010.\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b,\u0010-R \u00106\u001a\u00020/8\u0016X\u0004¢\u0006\u0012\n\u0004\b0\u00101\u0012\u0004\b4\u00105\u001a\u0004\b2\u00103¨\u00067"}, d2 = {"LC4/g;", "LiK/a;", "Landroid/os/Bundle;", "bundle", "", "", "Lx4/F;", "typeMap", "<init>", "(Landroid/os/Bundle;Ljava/util/Map;)V", "Landroidx/lifecycle/U;", "handle", "(Landroidx/lifecycle/U;Ljava/util/Map;)V", "", "M", "()Ljava/lang/Object;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "p", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)I", "K", "", "k", "()Ljava/lang/Void;", "", "F", "()Z", "Lkotlinx/serialization/encoding/Decoder;", "r", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/Decoder;", "T", "LfK/d;", "deserializer", "L", "(LfK/d;)Ljava/lang/Object;", "E", "LC4/a;", "b", "LC4/a;", "store", "c", "I", "elementIndex", "d", "Ljava/lang/String;", "elementName", "LmK/d;", "e", "LmK/d;", "a", "()LmK/d;", "getSerializersModule$annotations", "()V", "serializersModule", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class g extends C17392a {

    /* renamed from: b  reason: collision with root package name */
    private final a f33708b;

    /* renamed from: c  reason: collision with root package name */
    private int f33709c = -1;

    /* renamed from: d  reason: collision with root package name */
    private String f33710d = "";

    /* renamed from: e  reason: collision with root package name */
    private final C17611d f33711e = C17616i.a();

    public g(Bundle bundle, Map<String, ? extends F<?>> map) {
        C17542s.j(bundle, "bundle");
        C17542s.j(map, "typeMap");
        this.f33708b = new b(bundle, map);
    }

    private final Object M() {
        Object b10 = this.f33708b.b(this.f33710d);
        if (b10 != null) {
            return b10;
        }
        throw new IllegalStateException(("Unexpected null value for non-nullable argument " + this.f33710d).toString());
    }

    public <T> T E(C17251d<? extends T> dVar) {
        C17542s.j(dVar, "deserializer");
        return M();
    }

    public boolean F() {
        return this.f33708b.b(this.f33710d) != null;
    }

    public Object K() {
        return M();
    }

    public final <T> T L(C17251d<? extends T> dVar) {
        C17542s.j(dVar, "deserializer");
        return super.E(dVar);
    }

    public C17611d a() {
        return this.f33711e;
    }

    public Void k() {
        return null;
    }

    public int p(SerialDescriptor serialDescriptor) {
        String e10;
        C17542s.j(serialDescriptor, "descriptor");
        int i10 = this.f33709c;
        do {
            i10++;
            if (i10 >= serialDescriptor.d()) {
                return -1;
            }
            e10 = serialDescriptor.e(i10);
        } while (!this.f33708b.a(e10));
        this.f33709c = i10;
        this.f33710d = e10;
        return i10;
    }

    public Decoder r(SerialDescriptor serialDescriptor) {
        C17542s.j(serialDescriptor, "descriptor");
        if (j.l(serialDescriptor)) {
            this.f33710d = serialDescriptor.e(0);
            this.f33709c = 0;
        }
        return super.r(serialDescriptor);
    }

    public g(U u10, Map<String, ? extends F<?>> map) {
        C17542s.j(u10, "handle");
        C17542s.j(map, "typeMap");
        this.f33708b = new k(u10, map);
    }
}
