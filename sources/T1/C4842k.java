package T1;

import N1.C4669d;
import N1.C4670e;
import N1.W;
import N1.X;
import YH.C16877v;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import nI.C17642l;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\b*\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\r2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010\u0017R$\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r8\u0000@BX\u000e¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0017R$\u0010!\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u001d8\u0000@BX\u000e¢\u0006\f\n\u0004\b\u0014\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"LT1/k;", "", "<init>", "()V", "", "LT1/i;", "editCommands", "failedCommand", "", "c", "(Ljava/util/List;LT1/i;)Ljava/lang/String;", "e", "(LT1/i;)Ljava/lang/String;", "LT1/P;", "value", "LT1/Y;", "textInputSession", "LXH/N;", "d", "(LT1/P;LT1/Y;)V", "b", "(Ljava/util/List;)LT1/P;", "f", "()LT1/P;", "<set-?>", "a", "LT1/P;", "getMBufferState$ui_text_release", "mBufferState", "LT1/l;", "LT1/l;", "getMBuffer$ui_text_release", "()LT1/l;", "mBuffer", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: T1.k  reason: case insensitive filesystem */
public final class C4842k {

    /* renamed from: a  reason: collision with root package name */
    private P f13605a = new P(C4670e.i(), W.f9419b.a(), (W) null, (DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    private C4843l f13606b = new C4843l(this.f13605a.f(), this.f13605a.h(), (DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LT1/i;", "it", "", "a", "(LT1/i;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: T1.k$a */
    static final class a extends C17544u implements C17642l<C4840i, CharSequence> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C4840i f13607c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C4842k f13608d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C4840i iVar, C4842k kVar) {
            super(1);
            this.f13607c = iVar;
            this.f13608d = kVar;
        }

        /* renamed from: a */
        public final CharSequence invoke(C4840i iVar) {
            String str = this.f13607c == iVar ? " > " : "   ";
            return str + this.f13608d.e(iVar);
        }
    }

    private final String c(List<? extends C4840i> list, C4840i iVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Error while applying EditCommand batch to buffer (length=" + this.f13606b.h() + ", composition=" + this.f13606b.d() + ", selection=" + W.q(this.f13606b.i()) + "):");
        C17542s.i(sb2, "append(value)");
        sb2.append(10);
        C17542s.i(sb2, "append('\\n')");
        C16877v.E0(list, sb2, "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new a(iVar, this), 60, (Object) null);
        String sb3 = sb2.toString();
        C17542s.i(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    /* access modifiers changed from: private */
    public final String e(C4840i iVar) {
        if (iVar instanceof C4832a) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("CommitTextCommand(text.length=");
            C4832a aVar = (C4832a) iVar;
            sb2.append(aVar.c().length());
            sb2.append(", newCursorPosition=");
            sb2.append(aVar.b());
            sb2.append(')');
            return sb2.toString();
        } else if (iVar instanceof N) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("SetComposingTextCommand(text.length=");
            N n10 = (N) iVar;
            sb3.append(n10.c().length());
            sb3.append(", newCursorPosition=");
            sb3.append(n10.b());
            sb3.append(')');
            return sb3.toString();
        } else if (iVar instanceof M) {
            return iVar.toString();
        } else {
            if (iVar instanceof C4838g) {
                return iVar.toString();
            }
            if (iVar instanceof C4839h) {
                return iVar.toString();
            }
            if (iVar instanceof O) {
                return iVar.toString();
            }
            if (iVar instanceof C4845n) {
                return iVar.toString();
            }
            if (iVar instanceof C4837f) {
                return iVar.toString();
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Unknown EditCommand: ");
            String f10 = P.b(iVar.getClass()).f();
            if (f10 == null) {
                f10 = "{anonymous EditCommand}";
            }
            sb4.append(f10);
            return sb4.toString();
        }
    }

    public final P b(List<? extends C4840i> list) {
        C4840i iVar;
        Exception e10;
        W w10 = null;
        try {
            int size = list.size();
            int i10 = 0;
            iVar = null;
            while (i10 < size) {
                try {
                    C4840i iVar2 = (C4840i) list.get(i10);
                    try {
                        iVar2.a(this.f13606b);
                        i10++;
                        iVar = iVar2;
                    } catch (Exception e11) {
                        e10 = e11;
                        iVar = iVar2;
                        throw new RuntimeException(c(list, iVar), e10);
                    }
                } catch (Exception e12) {
                    e10 = e12;
                    throw new RuntimeException(c(list, iVar), e10);
                }
            }
            C4669d s10 = this.f13606b.s();
            long i11 = this.f13606b.i();
            W b10 = W.b(i11);
            b10.r();
            if (!W.m(this.f13605a.h())) {
                w10 = b10;
            }
            P p10 = new P(s10, w10 != null ? w10.r() : X.b(W.k(i11), W.l(i11)), this.f13606b.d(), (DefaultConstructorMarker) null);
            this.f13605a = p10;
            return p10;
        } catch (Exception e13) {
            iVar = null;
            e10 = e13;
            throw new RuntimeException(c(list, iVar), e10);
        }
    }

    public final void d(P p10, Y y10) {
        boolean e10 = C17542s.e(p10.g(), this.f13606b.d());
        boolean z10 = true;
        boolean z11 = false;
        if (!C17542s.e(this.f13605a.f(), p10.f())) {
            this.f13606b = new C4843l(p10.f(), p10.h(), (DefaultConstructorMarker) null);
        } else if (!W.g(this.f13605a.h(), p10.h())) {
            this.f13606b.p(W.l(p10.h()), W.k(p10.h()));
            z11 = true;
            z10 = false;
        } else {
            z10 = false;
        }
        if (p10.g() == null) {
            this.f13606b.a();
        } else if (!W.h(p10.g().r())) {
            this.f13606b.n(W.l(p10.g().r()), W.k(p10.g().r()));
        }
        if (z10 || (!z11 && !e10)) {
            this.f13606b.a();
            p10 = P.d(p10, (C4669d) null, 0, (W) null, 3, (Object) null);
        }
        P p11 = this.f13605a;
        this.f13605a = p10;
        if (y10 != null) {
            y10.d(p11, p10);
        }
    }

    public final P f() {
        return this.f13605a;
    }
}
