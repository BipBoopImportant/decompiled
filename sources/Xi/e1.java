package xI;

import DI.C15554a;
import DI.C15579z;
import DI.a0;
import DI.d0;
import DI.u0;
import XH.t;
import YH.C16877v;
import cJ.C17069f;
import fJ.n;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import uJ.C18096U;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b*\u00060\u0004j\u0002`\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b*\u00060\u0004j\u0002`\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u0018J\u0015\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020#8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, d2 = {"LxI/e1;", "", "<init>", "()V", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "LDI/d0;", "receiver", "LXH/N;", "c", "(Ljava/lang/StringBuilder;LDI/d0;)V", "LDI/a;", "callable", "d", "(Ljava/lang/StringBuilder;LDI/a;)V", "descriptor", "", "e", "(LDI/a;)Ljava/lang/String;", "LDI/a0;", "k", "(LDI/a0;)Ljava/lang/String;", "LDI/z;", "f", "(LDI/z;)Ljava/lang/String;", "invoke", "h", "LxI/y0;", "parameter", "j", "(LxI/y0;)Ljava/lang/String;", "LuJ/U;", "type", "l", "(LuJ/U;)Ljava/lang/String;", "LfJ/n;", "b", "LfJ/n;", "renderer", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e1 {

    /* renamed from: a  reason: collision with root package name */
    public static final e1 f152401a = new e1();

    /* renamed from: b  reason: collision with root package name */
    private static final n f152402b = n.f143180h;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f152403a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                uI.l$a[] r0 = uI.C18063l.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                uI.l$a r1 = uI.C18063l.a.EXTENSION_RECEIVER     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                uI.l$a r1 = uI.C18063l.a.INSTANCE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                uI.l$a r1 = uI.C18063l.a.VALUE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f152403a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: xI.e1.a.<clinit>():void");
        }
    }

    private e1() {
    }

    private final void c(StringBuilder sb2, d0 d0Var) {
        if (d0Var != null) {
            C18096U type = d0Var.getType();
            C17542s.i(type, "getType(...)");
            sb2.append(l(type));
            sb2.append(".");
        }
    }

    private final void d(StringBuilder sb2, C15554a aVar) {
        d0 i10 = j1.i(aVar);
        d0 O10 = aVar.O();
        c(sb2, i10);
        boolean z10 = (i10 == null || O10 == null) ? false : true;
        if (z10) {
            sb2.append("(");
        }
        c(sb2, O10);
        if (z10) {
            sb2.append(")");
        }
    }

    private final String e(C15554a aVar) {
        if (aVar instanceof a0) {
            return k((a0) aVar);
        }
        if (aVar instanceof C15579z) {
            return f((C15579z) aVar);
        }
        throw new IllegalStateException(("Illegal callable: " + aVar).toString());
    }

    /* access modifiers changed from: private */
    public static final CharSequence g(u0 u0Var) {
        e1 e1Var = f152401a;
        C18096U type = u0Var.getType();
        C17542s.i(type, "getType(...)");
        return e1Var.l(type);
    }

    /* access modifiers changed from: private */
    public static final CharSequence i(u0 u0Var) {
        e1 e1Var = f152401a;
        C18096U type = u0Var.getType();
        C17542s.i(type, "getType(...)");
        return e1Var.l(type);
    }

    public final String f(C15579z zVar) {
        C17542s.j(zVar, "descriptor");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("fun ");
        e1 e1Var = f152401a;
        e1Var.d(sb2, zVar);
        n nVar = f152402b;
        C17069f name = zVar.getName();
        C17542s.i(name, "getName(...)");
        sb2.append(nVar.R(name, true));
        List<u0> j10 = zVar.j();
        C17542s.i(j10, "getValueParameters(...)");
        C16877v.E0(j10, sb2, ", ", "(", ")", 0, (CharSequence) null, c1.f152388a, 48, (Object) null);
        sb2.append(": ");
        C18096U returnType = zVar.getReturnType();
        C17542s.g(returnType);
        sb2.append(e1Var.l(returnType));
        return sb2.toString();
    }

    public final String h(C15579z zVar) {
        C17542s.j(zVar, "invoke");
        StringBuilder sb2 = new StringBuilder();
        e1 e1Var = f152401a;
        e1Var.d(sb2, zVar);
        List<u0> j10 = zVar.j();
        C17542s.i(j10, "getValueParameters(...)");
        C16877v.E0(j10, sb2, ", ", "(", ")", 0, (CharSequence) null, d1.f152398a, 48, (Object) null);
        sb2.append(" -> ");
        C18096U returnType = zVar.getReturnType();
        C17542s.g(returnType);
        sb2.append(e1Var.l(returnType));
        return sb2.toString();
    }

    public final String j(C18671y0 y0Var) {
        C17542s.j(y0Var, "parameter");
        StringBuilder sb2 = new StringBuilder();
        int i10 = a.f152403a[y0Var.h().ordinal()];
        if (i10 == 1) {
            sb2.append("extension receiver parameter");
        } else if (i10 == 2) {
            sb2.append("instance parameter");
        } else if (i10 == 3) {
            sb2.append("parameter #" + y0Var.getIndex() + ' ' + y0Var.getName());
        } else {
            throw new t();
        }
        sb2.append(" of ");
        sb2.append(f152401a.e(y0Var.y().d0()));
        return sb2.toString();
    }

    public final String k(a0 a0Var) {
        C17542s.j(a0Var, "descriptor");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(a0Var.N() ? "var " : "val ");
        e1 e1Var = f152401a;
        e1Var.d(sb2, a0Var);
        n nVar = f152402b;
        C17069f name = a0Var.getName();
        C17542s.i(name, "getName(...)");
        sb2.append(nVar.R(name, true));
        sb2.append(": ");
        C18096U type = a0Var.getType();
        C17542s.i(type, "getType(...)");
        sb2.append(e1Var.l(type));
        return sb2.toString();
    }

    public final String l(C18096U u10) {
        C17542s.j(u10, "type");
        return f152402b.S(u10);
    }
}
