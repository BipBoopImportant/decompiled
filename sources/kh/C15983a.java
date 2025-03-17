package KH;

import YH.X;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0006\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LKH/a;", "", "K", "V", "<init>", "()V", "key", "a", "(Ljava/lang/Object;)Ljava/lang/Object;", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: KH.a  reason: case insensitive filesystem */
public final class C15983a<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f135910a = AtomicReferenceFieldUpdater.newUpdater(C15983a.class, Object.class, "current");
    private volatile /* synthetic */ Object current = X.j();

    public final V a(K k10) {
        C17542s.j(k10, "key");
        return ((Map) this.current).get(k10);
    }
}
