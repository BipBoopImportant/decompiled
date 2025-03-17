package androidx.compose.foundation.text.modifiers;

import E1.C4484q;
import E1.C4488v;
import E1.H;
import E1.J;
import E1.K;
import G0.g;
import G1.B;
import G1.C4510m;
import G1.C4516t;
import G1.E;
import G1.r;
import N1.A;
import N1.C4669d;
import N1.P;
import N1.Y;
import S1.C4820m;
import XH.C16807N;
import androidx.compose.foundation.text.modifiers.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import o1.C5669i;
import p1.C5753y0;
import r1.C5817c;

@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004BÇ\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013\u0012\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u0016\u0012\u001e\b\u0002\u0010\u001b\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\u0016\b\u0002\u0010!\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\r2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u0013\u0010)\u001a\u00020\r*\u00020(H\u0016¢\u0006\u0004\b)\u0010*J&\u00101\u001a\u000200*\u00020+2\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.H\u0016ø\u0001\u0000¢\u0006\u0004\b1\u00102J#\u00106\u001a\u00020\u0013*\u0002032\u0006\u0010-\u001a\u0002042\u0006\u00105\u001a\u00020\u0013H\u0016¢\u0006\u0004\b6\u00107J#\u00109\u001a\u00020\u0013*\u0002032\u0006\u0010-\u001a\u0002042\u0006\u00108\u001a\u00020\u0013H\u0016¢\u0006\u0004\b9\u00107J#\u0010:\u001a\u00020\u0013*\u0002032\u0006\u0010-\u001a\u0002042\u0006\u00105\u001a\u00020\u0013H\u0016¢\u0006\u0004\b:\u00107J#\u0010;\u001a\u00020\u0013*\u0002032\u0006\u0010-\u001a\u0002042\u0006\u00108\u001a\u00020\u0013H\u0016¢\u0006\u0004\b;\u00107J¦\u0001\u0010=\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0014\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u00162\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\u001c\u0010\u001b\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010<\u001a\u0004\u0018\u00010\u001eø\u0001\u0000¢\u0006\u0004\b=\u0010>R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b?\u0010@R$\u0010!\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\r\u0018\u00010\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010F\u001a\u00020C8\u0002X\u0004¢\u0006\u0006\n\u0004\bD\u0010E\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006G"}, d2 = {"Landroidx/compose/foundation/text/modifiers/a;", "LG1/m;", "LG1/B;", "LG1/r;", "LG1/t;", "LN1/d;", "text", "LN1/Y;", "style", "LS1/m$b;", "fontFamilyResolver", "Lkotlin/Function1;", "LN1/P;", "LXH/N;", "onTextLayout", "LY1/t;", "overflow", "", "softWrap", "", "maxLines", "minLines", "", "LN1/d$c;", "LN1/A;", "placeholders", "Lo1/i;", "onPlaceholderLayout", "LG0/g;", "selectionController", "Lp1/y0;", "overrideColor", "Landroidx/compose/foundation/text/modifiers/b$a;", "onShowTranslation", "<init>", "(LN1/d;LN1/Y;LS1/m$b;LnI/l;IZIILjava/util/List;LnI/l;LG0/g;Lp1/y0;LnI/l;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "LE1/v;", "coordinates", "u", "(LE1/v;)V", "Lr1/c;", "z", "(Lr1/c;)V", "LE1/K;", "LE1/H;", "measurable", "Lc2/b;", "constraints", "LE1/J;", "h", "(LE1/K;LE1/H;J)LE1/J;", "LE1/r;", "LE1/q;", "height", "E", "(LE1/r;LE1/q;I)I", "width", "I", "P", "w", "color", "I2", "(LN1/d;LN1/Y;Ljava/util/List;IIZLS1/m$b;ILnI/l;LnI/l;LG0/g;Lp1/y0;)V", "p", "LG0/g;", "q", "LnI/l;", "Landroidx/compose/foundation/text/modifiers/b;", "r", "Landroidx/compose/foundation/text/modifiers/b;", "delegate", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a extends C4510m implements B, r, C4516t {

    /* renamed from: p  reason: collision with root package name */
    private g f18545p;

    /* renamed from: q  reason: collision with root package name */
    private C17642l<? super b.a, C16807N> f18546q;

    /* renamed from: r  reason: collision with root package name */
    private final b f18547r;

    public /* synthetic */ a(C4669d dVar, Y y10, C4820m.b bVar, C17642l lVar, int i10, boolean z10, int i11, int i12, List list, C17642l lVar2, g gVar, C5753y0 y0Var, C17642l lVar3, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, y10, bVar, lVar, i10, z10, i11, i12, list, lVar2, gVar, y0Var, lVar3);
    }

    public int E(E1.r rVar, C4484q qVar, int i10) {
        return this.f18547r.T2(rVar, qVar, i10);
    }

    public int I(E1.r rVar, C4484q qVar, int i10) {
        return this.f18547r.S2(rVar, qVar, i10);
    }

    public final void I2(C4669d dVar, Y y10, List<C4669d.c<A>> list, int i10, int i11, boolean z10, C4820m.b bVar, int i12, C17642l<? super P, C16807N> lVar, C17642l<? super List<C5669i>, C16807N> lVar2, g gVar, C5753y0 y0Var) {
        g gVar2 = gVar;
        b bVar2 = this.f18547r;
        C4669d dVar2 = dVar;
        bVar2.J2(bVar2.W2(y0Var, y10), this.f18547r.Y2(dVar), this.f18547r.X2(y10, list, i10, i11, z10, bVar, i12), this.f18547r.V2(lVar, lVar2, gVar2, this.f18546q));
        this.f18545p = gVar2;
        E.b(this);
    }

    public int P(E1.r rVar, C4484q qVar, int i10) {
        return this.f18547r.Q2(rVar, qVar, i10);
    }

    public J h(K k10, H h10, long j10) {
        return this.f18547r.R2(k10, h10, j10);
    }

    public void u(C4488v vVar) {
        g gVar = this.f18545p;
        if (gVar != null) {
            gVar.d(vVar);
        }
    }

    public int w(E1.r rVar, C4484q qVar, int i10) {
        return this.f18547r.P2(rVar, qVar, i10);
    }

    public void z(C5817c cVar) {
        this.f18547r.K2(cVar);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ a(N1.C4669d r19, N1.Y r20, S1.C4820m.b r21, nI.C17642l r22, int r23, boolean r24, int r25, int r26, java.util.List r27, nI.C17642l r28, G0.g r29, p1.C5753y0 r30, nI.C17642l r31, int r32, kotlin.jvm.internal.DefaultConstructorMarker r33) {
        /*
            r18 = this;
            r0 = r32
            r1 = r0 & 8
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r7 = r2
            goto L_0x000b
        L_0x0009:
            r7 = r22
        L_0x000b:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0017
            Y1.t$a r1 = Y1.t.f14827a
            int r1 = r1.a()
            r8 = r1
            goto L_0x0019
        L_0x0017:
            r8 = r23
        L_0x0019:
            r1 = r0 & 32
            r3 = 1
            if (r1 == 0) goto L_0x0020
            r9 = r3
            goto L_0x0022
        L_0x0020:
            r9 = r24
        L_0x0022:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x002b
            r1 = 2147483647(0x7fffffff, float:NaN)
            r10 = r1
            goto L_0x002d
        L_0x002b:
            r10 = r25
        L_0x002d:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0033
            r11 = r3
            goto L_0x0035
        L_0x0033:
            r11 = r26
        L_0x0035:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x003b
            r12 = r2
            goto L_0x003d
        L_0x003b:
            r12 = r27
        L_0x003d:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0043
            r13 = r2
            goto L_0x0045
        L_0x0043:
            r13 = r28
        L_0x0045:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x004b
            r14 = r2
            goto L_0x004d
        L_0x004b:
            r14 = r29
        L_0x004d:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0053
            r15 = r2
            goto L_0x0055
        L_0x0053:
            r15 = r30
        L_0x0055:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x005c
            r16 = r2
            goto L_0x005e
        L_0x005c:
            r16 = r31
        L_0x005e:
            r17 = 0
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.a.<init>(N1.d, N1.Y, S1.m$b, nI.l, int, boolean, int, int, java.util.List, nI.l, G0.g, p1.y0, nI.l, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    private a(C4669d dVar, Y y10, C4820m.b bVar, C17642l<? super P, C16807N> lVar, int i10, boolean z10, int i11, int i12, List<C4669d.c<A>> list, C17642l<? super List<C5669i>, C16807N> lVar2, g gVar, C5753y0 y0Var, C17642l<? super b.a, C16807N> lVar3) {
        this.f18545p = gVar;
        this.f18546q = lVar3;
        b bVar2 = r1;
        b bVar3 = new b(dVar, y10, bVar, lVar, i10, z10, i11, i12, list, lVar2, this.f18545p, y0Var, this.f18546q, (DefaultConstructorMarker) null);
        this.f18547r = (b) C2(bVar2);
        if (this.f18545p == null) {
            throw new IllegalArgumentException("Do not use SelectionCapableStaticTextModifier unless selectionController != null");
        }
    }
}
