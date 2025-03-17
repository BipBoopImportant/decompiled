package n0;

import E1.C4488v;
import G1.B0;
import G1.C0;
import G1.C4516t;
import androidx.compose.ui.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0000\u0018\u0000 \"2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001#B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\u00020\b8\u0016XD¢\u0006\f\n\u0004\b\u0013\u0010\u0011\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001a8BX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Ln0/C;", "Landroidx/compose/ui/d$c;", "LG1/B0;", "LG1/t;", "<init>", "()V", "LXH/N;", "D2", "", "focused", "E2", "(Z)V", "LE1/v;", "coordinates", "u", "(LE1/v;)V", "n", "Z", "isFocused", "o", "h2", "()Z", "shouldAutoInvalidate", "p", "LE1/v;", "layoutCoordinates", "Ln0/D;", "C2", "()Ln0/D;", "observer", "", "T", "()Ljava/lang/Object;", "traverseKey", "q", "a", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: n0.C  reason: case insensitive filesystem */
public final class C5580C extends d.c implements B0, C4516t {

    /* renamed from: q  reason: collision with root package name */
    public static final a f26308q = new a((DefaultConstructorMarker) null);

    /* renamed from: r  reason: collision with root package name */
    public static final int f26309r = 8;

    /* renamed from: n  reason: collision with root package name */
    private boolean f26310n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f26311o;

    /* renamed from: p  reason: collision with root package name */
    private C4488v f26312p;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ln0/C$a;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: n0.C$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final C5581D C2() {
        if (!j2()) {
            return null;
        }
        B0 a10 = C0.a(this, C5581D.f26313p);
        if (a10 instanceof C5581D) {
            return (C5581D) a10;
        }
        return null;
    }

    private final void D2() {
        C5581D C22;
        C4488v vVar = this.f26312p;
        if (vVar != null) {
            C17542s.g(vVar);
            if (vVar.c() && (C22 = C2()) != null) {
                C22.C2(this.f26312p);
            }
        }
    }

    public final void E2(boolean z10) {
        if (z10 != this.f26310n) {
            if (!z10) {
                C5581D C22 = C2();
                if (C22 != null) {
                    C22.C2((C4488v) null);
                }
            } else {
                D2();
            }
            this.f26310n = z10;
        }
    }

    public Object T() {
        return f26308q;
    }

    public boolean h2() {
        return this.f26311o;
    }

    public void u(C4488v vVar) {
        this.f26312p = vVar;
        if (this.f26310n) {
            if (vVar.c()) {
                D2();
                return;
            }
            C5581D C22 = C2();
            if (C22 != null) {
                C22.C2((C4488v) null);
            }
        }
    }
}
