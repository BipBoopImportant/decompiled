package m0;

import YH.U;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import m0.C5562q;
import tI.C17978n;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0013\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ/\u0010\u0010\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0012\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J'\u0010\u0013\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u00028\u00008\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00028\u00008\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0015\u0010\u001aR\u0016\u0010\u001d\u001a\u00028\u00008\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0010\u0010\u001a¨\u0006\u001e"}, d2 = {"Lm0/H0;", "Lm0/q;", "V", "Lm0/G0;", "Lm0/s;", "anims", "<init>", "(Lm0/s;)V", "Lm0/O;", "anim", "(Lm0/O;)V", "", "playTimeNanos", "initialValue", "targetValue", "initialVelocity", "d", "(JLm0/q;Lm0/q;Lm0/q;)Lm0/q;", "e", "g", "(Lm0/q;Lm0/q;Lm0/q;)Lm0/q;", "c", "(Lm0/q;Lm0/q;Lm0/q;)J", "a", "Lm0/s;", "b", "Lm0/q;", "valueVector", "velocityVector", "endVelocityVector", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class H0<V extends C5562q> implements G0<V> {

    /* renamed from: a  reason: collision with root package name */
    private final C5563s f25534a;

    /* renamed from: b  reason: collision with root package name */
    private V f25535b;

    /* renamed from: c  reason: collision with root package name */
    private V f25536c;

    /* renamed from: d  reason: collision with root package name */
    private V f25537d;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"m0/H0$a", "Lm0/s;", "", "index", "Lm0/O;", "get", "(I)Lm0/O;", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements C5563s {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ O f25538a;

        a(O o10) {
            this.f25538a = o10;
        }

        public O get(int i10) {
            return this.f25538a;
        }
    }

    public H0(C5563s sVar) {
        this.f25534a = sVar;
    }

    public long c(V v10, V v11, V v12) {
        Iterator it = C17978n.w(0, v10.b()).iterator();
        long j10 = 0;
        while (it.hasNext()) {
            int c10 = ((U) it).c();
            j10 = Math.max(j10, this.f25534a.get(c10).e(v10.a(c10), v11.a(c10), v12.a(c10)));
        }
        return j10;
    }

    public V d(long j10, V v10, V v11, V v12) {
        if (this.f25535b == null) {
            this.f25535b = r.g(v10);
        }
        V v13 = this.f25535b;
        if (v13 == null) {
            C17542s.z("valueVector");
            v13 = null;
        }
        int b10 = v13.b();
        for (int i10 = 0; i10 < b10; i10++) {
            V v14 = this.f25535b;
            if (v14 == null) {
                C17542s.z("valueVector");
                v14 = null;
            }
            v14.e(i10, this.f25534a.get(i10).c(j10, v10.a(i10), v11.a(i10), v12.a(i10)));
        }
        V v15 = this.f25535b;
        if (v15 != null) {
            return v15;
        }
        C17542s.z("valueVector");
        return null;
    }

    public V e(long j10, V v10, V v11, V v12) {
        if (this.f25536c == null) {
            this.f25536c = r.g(v12);
        }
        V v13 = this.f25536c;
        if (v13 == null) {
            C17542s.z("velocityVector");
            v13 = null;
        }
        int b10 = v13.b();
        for (int i10 = 0; i10 < b10; i10++) {
            V v14 = this.f25536c;
            if (v14 == null) {
                C17542s.z("velocityVector");
                v14 = null;
            }
            v14.e(i10, this.f25534a.get(i10).d(j10, v10.a(i10), v11.a(i10), v12.a(i10)));
        }
        V v15 = this.f25536c;
        if (v15 != null) {
            return v15;
        }
        C17542s.z("velocityVector");
        return null;
    }

    public V g(V v10, V v11, V v12) {
        if (this.f25537d == null) {
            this.f25537d = r.g(v12);
        }
        V v13 = this.f25537d;
        if (v13 == null) {
            C17542s.z("endVelocityVector");
            v13 = null;
        }
        int b10 = v13.b();
        for (int i10 = 0; i10 < b10; i10++) {
            V v14 = this.f25537d;
            if (v14 == null) {
                C17542s.z("endVelocityVector");
                v14 = null;
            }
            v14.e(i10, this.f25534a.get(i10).b(v10.a(i10), v11.a(i10), v12.a(i10)));
        }
        V v15 = this.f25537d;
        if (v15 != null) {
            return v15;
        }
        C17542s.z("endVelocityVector");
        return null;
    }

    public H0(O o10) {
        this((C5563s) new a(o10));
    }
}
