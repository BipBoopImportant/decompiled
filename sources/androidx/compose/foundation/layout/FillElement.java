package androidx.compose.foundation.layout;

import G1.V;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s0.C5866l;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0002\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001d¨\u0006 "}, d2 = {"Landroidx/compose/foundation/layout/FillElement;", "LG1/V;", "Landroidx/compose/foundation/layout/n;", "Ls0/l;", "direction", "", "fraction", "", "inspectorName", "<init>", "(Ls0/l;FLjava/lang/String;)V", "c", "()Landroidx/compose/foundation/layout/n;", "node", "LXH/N;", "f", "(Landroidx/compose/foundation/layout/n;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "d", "Ls0/l;", "e", "F", "Ljava/lang/String;", "g", "a", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class FillElement extends V<C5083n> {

    /* renamed from: g  reason: collision with root package name */
    public static final a f17944g = new a((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    private final C5866l f17945d;

    /* renamed from: e  reason: collision with root package name */
    private final float f17946e;

    /* renamed from: f  reason: collision with root package name */
    private final String f17947f;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Landroidx/compose/foundation/layout/FillElement$a;", "", "<init>", "()V", "", "fraction", "Landroidx/compose/foundation/layout/FillElement;", "c", "(F)Landroidx/compose/foundation/layout/FillElement;", "a", "b", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FillElement a(float f10) {
            return new FillElement(C5866l.Vertical, f10, "fillMaxHeight");
        }

        public final FillElement b(float f10) {
            return new FillElement(C5866l.Both, f10, "fillMaxSize");
        }

        public final FillElement c(float f10) {
            return new FillElement(C5866l.Horizontal, f10, "fillMaxWidth");
        }

        private a() {
        }
    }

    public FillElement(C5866l lVar, float f10, String str) {
        this.f17945d = lVar;
        this.f17946e = f10;
        this.f17947f = str;
    }

    /* renamed from: c */
    public C5083n a() {
        return new C5083n(this.f17945d, this.f17946e);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FillElement)) {
            return false;
        }
        FillElement fillElement = (FillElement) obj;
        return this.f17945d == fillElement.f17945d && this.f17946e == fillElement.f17946e;
    }

    /* renamed from: f */
    public void b(C5083n nVar) {
        nVar.C2(this.f17945d);
        nVar.D2(this.f17946e);
    }

    public int hashCode() {
        return (this.f17945d.hashCode() * 31) + Float.hashCode(this.f17946e);
    }
}
