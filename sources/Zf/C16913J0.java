package ZF;

import RF.k;
import com.sugarcube.app.base.data.model.DecorateViewMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ0\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u0007\u0010\u001dR\u0017\u0010 \u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010!\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u001e\u0010\u001d¨\u0006\""}, d2 = {"LZF/J0;", "", "LRF/k;", "selectedInstance", "Lcom/sugarcube/app/base/data/model/DecorateViewMode;", "decorateViewMode", "", "isPoiFeatureEnabled", "<init>", "(LRF/k;Lcom/sugarcube/app/base/data/model/DecorateViewMode;Z)V", "a", "(LRF/k;Lcom/sugarcube/app/base/data/model/DecorateViewMode;Z)LZF/J0;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "LRF/k;", "getSelectedInstance", "()LRF/k;", "b", "Lcom/sugarcube/app/base/data/model/DecorateViewMode;", "c", "()Lcom/sugarcube/app/base/data/model/DecorateViewMode;", "Z", "()Z", "d", "e", "showRoomViewIcon", "showFocusViewIcon", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ZF.J0  reason: case insensitive filesystem */
public final class C16913J0 {

    /* renamed from: a  reason: collision with root package name */
    private final k f140549a;

    /* renamed from: b  reason: collision with root package name */
    private final DecorateViewMode f140550b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f140551c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f140552d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f140553e;

    public C16913J0(k kVar, DecorateViewMode decorateViewMode, boolean z10) {
        C17542s.j(decorateViewMode, "decorateViewMode");
        this.f140549a = kVar;
        this.f140550b = decorateViewMode;
        this.f140551c = z10;
        boolean z11 = false;
        this.f140552d = decorateViewMode == DecorateViewMode.FocusMode;
        if (decorateViewMode == DecorateViewMode.RoomMode && kVar != null && z10) {
            z11 = true;
        }
        this.f140553e = z11;
    }

    public static /* synthetic */ C16913J0 b(C16913J0 j02, k kVar, DecorateViewMode decorateViewMode, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            kVar = j02.f140549a;
        }
        if ((i10 & 2) != 0) {
            decorateViewMode = j02.f140550b;
        }
        if ((i10 & 4) != 0) {
            z10 = j02.f140551c;
        }
        return j02.a(kVar, decorateViewMode, z10);
    }

    public final C16913J0 a(k kVar, DecorateViewMode decorateViewMode, boolean z10) {
        C17542s.j(decorateViewMode, "decorateViewMode");
        return new C16913J0(kVar, decorateViewMode, z10);
    }

    public final DecorateViewMode c() {
        return this.f140550b;
    }

    public final boolean d() {
        return this.f140553e;
    }

    public final boolean e() {
        return this.f140552d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16913J0)) {
            return false;
        }
        C16913J0 j02 = (C16913J0) obj;
        return C17542s.e(this.f140549a, j02.f140549a) && this.f140550b == j02.f140550b && this.f140551c == j02.f140551c;
    }

    public int hashCode() {
        k kVar = this.f140549a;
        return ((((kVar == null ? 0 : kVar.hashCode()) * 31) + this.f140550b.hashCode()) * 31) + Boolean.hashCode(this.f140551c);
    }

    public String toString() {
        k kVar = this.f140549a;
        DecorateViewMode decorateViewMode = this.f140550b;
        boolean z10 = this.f140551c;
        return "DecorateViewState(selectedInstance=" + kVar + ", decorateViewMode=" + decorateViewMode + ", isPoiFeatureEnabled=" + z10 + ")";
    }
}
