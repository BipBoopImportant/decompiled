package androidx.compose.ui.input.pointer;

import A1.K;
import A1.X;
import G1.V;
import XH.C16807N;
import dI.C17164e;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BY\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0006\u0012\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR#\u0010\u0007\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010!\u001a\u0004\b\"\u0010#R3\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Landroidx/compose/ui/input/pointer/SuspendPointerInputElement;", "LG1/V;", "LA1/X;", "", "key1", "key2", "", "keys", "Lkotlin/Function2;", "LA1/K;", "LdI/e;", "LXH/N;", "pointerInputHandler", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;LnI/p;)V", "c", "()LA1/X;", "node", "f", "(LA1/X;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "d", "Ljava/lang/Object;", "getKey1", "()Ljava/lang/Object;", "e", "getKey2", "[Ljava/lang/Object;", "getKeys", "()[Ljava/lang/Object;", "g", "LnI/p;", "getPointerInputHandler", "()LnI/p;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SuspendPointerInputElement extends V<X> {

    /* renamed from: d  reason: collision with root package name */
    private final Object f18976d;

    /* renamed from: e  reason: collision with root package name */
    private final Object f18977e;

    /* renamed from: f  reason: collision with root package name */
    private final Object[] f18978f;

    /* renamed from: g  reason: collision with root package name */
    private final p<K, C17164e<? super C16807N>, Object> f18979g;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SuspendPointerInputElement(Object obj, Object obj2, Object[] objArr, p pVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : obj, (i10 & 2) != 0 ? null : obj2, (i10 & 4) != 0 ? null : objArr, pVar);
    }

    /* renamed from: c */
    public X a() {
        return new X(this.f18976d, this.f18977e, this.f18978f, this.f18979g);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuspendPointerInputElement)) {
            return false;
        }
        SuspendPointerInputElement suspendPointerInputElement = (SuspendPointerInputElement) obj;
        if (!C17542s.e(this.f18976d, suspendPointerInputElement.f18976d) || !C17542s.e(this.f18977e, suspendPointerInputElement.f18977e)) {
            return false;
        }
        Object[] objArr = this.f18978f;
        if (objArr != null) {
            Object[] objArr2 = suspendPointerInputElement.f18978f;
            if (objArr2 == null || !Arrays.equals(objArr, objArr2)) {
                return false;
            }
        } else if (suspendPointerInputElement.f18978f != null) {
            return false;
        }
        return this.f18979g == suspendPointerInputElement.f18979g;
    }

    /* renamed from: f */
    public void b(X x10) {
        x10.H2(this.f18976d, this.f18977e, this.f18978f, this.f18979g);
    }

    public int hashCode() {
        Object obj = this.f18976d;
        int i10 = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f18977e;
        int hashCode2 = (hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Object[] objArr = this.f18978f;
        if (objArr != null) {
            i10 = Arrays.hashCode(objArr);
        }
        return ((hashCode2 + i10) * 31) + this.f18979g.hashCode();
    }

    public SuspendPointerInputElement(Object obj, Object obj2, Object[] objArr, p<? super K, ? super C17164e<? super C16807N>, ? extends Object> pVar) {
        this.f18976d = obj;
        this.f18977e = obj2;
        this.f18978f = objArr;
        this.f18979g = pVar;
    }
}
