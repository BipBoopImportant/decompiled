package r1;

import android.graphics.Shader;
import c2.d;
import c2.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o1.C5661a;
import o1.C5667g;
import o1.C5673m;
import p1.C5712d0;
import p1.C5728l0;
import p1.C5732n0;
import p1.C5747v0;
import p1.C5749w0;
import p1.E0;
import p1.J0;
import p1.S;
import p1.S0;
import p1.T0;
import p1.U0;
import p1.V0;
import p1.k1;
import p1.l1;
import s1.C5905c;

@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001^B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJJ\u0010\u0017\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\b2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018JH\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\b2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJj\u0010%\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0002ø\u0001\u0000¢\u0006\u0004\b%\u0010&Jl\u0010'\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0002ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u001e\u0010)\u001a\u00020\u0019*\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b)\u0010*J`\u0010/\u001a\u00020.2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010#2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\b/\u00100J`\u00101\u001a\u00020.2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010#2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\b1\u00102JN\u00106\u001a\u00020.2\u0006\u0010\r\u001a\u00020\f2\u0006\u00103\u001a\u00020+2\u0006\u00105\u001a\u0002042\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\b6\u00107JN\u00108\u001a\u00020.2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u00103\u001a\u00020+2\u0006\u00105\u001a\u0002042\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\b8\u00109JF\u0010<\u001a\u00020.2\u0006\u0010;\u001a\u00020:2\u0006\u00103\u001a\u00020+2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\b<\u0010=Jf\u0010D\u001a\u00020.2\u0006\u0010;\u001a\u00020:2\u0006\u0010?\u001a\u00020>2\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020>2\u0006\u0010C\u001a\u00020@2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016ø\u0001\u0000¢\u0006\u0004\bD\u0010EJV\u0010H\u001a\u00020.2\u0006\u0010\r\u001a\u00020\f2\u0006\u00103\u001a\u00020+2\u0006\u00105\u001a\u0002042\u0006\u0010G\u001a\u00020F2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\bH\u0010IJV\u0010J\u001a\u00020.2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u00103\u001a\u00020+2\u0006\u00105\u001a\u0002042\u0006\u0010G\u001a\u00020F2\u0006\u0010\u000e\u001a\u00020\b2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\bJ\u0010KJN\u0010N\u001a\u00020.2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010L\u001a\u00020\u000f2\u0006\u0010M\u001a\u00020+2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\bN\u0010OJN\u0010P\u001a\u00020.2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u00103\u001a\u00020+2\u0006\u00105\u001a\u0002042\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\bP\u00109Jf\u0010U\u001a\u00020.2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010Q\u001a\u00020\u000f2\u0006\u0010R\u001a\u00020\u000f2\u0006\u0010T\u001a\u00020S2\u0006\u00103\u001a\u00020+2\u0006\u00105\u001a\u0002042\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\bU\u0010VJF\u0010Y\u001a\u00020.2\u0006\u0010X\u001a\u00020W2\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\bY\u0010ZJF\u0010[\u001a\u00020.2\u0006\u0010X\u001a\u00020W2\u0006\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\b[\u0010\\R \u0010c\u001a\u00020]8\u0000X\u0004¢\u0006\u0012\n\u0004\b^\u0010_\u0012\u0004\bb\u0010\u0003\u001a\u0004\b`\u0010aR\u001a\u0010i\u001a\u00020d8\u0016X\u0004¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010hR\u0018\u0010k\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010jR\u0018\u0010m\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bl\u0010jR\u0014\u0010q\u001a\u00020n8VX\u0004¢\u0006\u0006\u001a\u0004\bo\u0010pR\u0014\u0010t\u001a\u00020\u000f8VX\u0004¢\u0006\u0006\u001a\u0004\br\u0010sR\u0014\u0010v\u001a\u00020\u000f8VX\u0004¢\u0006\u0006\u001a\u0004\bu\u0010s\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006w"}, d2 = {"Lr1/a;", "Lr1/f;", "<init>", "()V", "Lp1/S0;", "J", "()Lp1/S0;", "K", "Lr1/g;", "drawStyle", "P", "(Lr1/g;)Lp1/S0;", "Lp1/l0;", "brush", "style", "", "alpha", "Lp1/w0;", "colorFilter", "Lp1/d0;", "blendMode", "Lp1/E0;", "filterQuality", "p", "(Lp1/l0;Lr1/g;FLp1/w0;II)Lp1/S0;", "Lp1/v0;", "color", "c", "(JLr1/g;FLp1/w0;II)Lp1/S0;", "strokeWidth", "miter", "Lp1/k1;", "cap", "Lp1/l1;", "join", "Lp1/V0;", "pathEffect", "w", "(JFFIILp1/V0;FLp1/w0;II)Lp1/S0;", "z", "(Lp1/l0;FFIILp1/V0;FLp1/w0;II)Lp1/S0;", "I", "(JF)J", "Lo1/g;", "start", "end", "LXH/N;", "g1", "(Lp1/l0;JJFILp1/V0;FLp1/w0;I)V", "W1", "(JJJFILp1/V0;FLp1/w0;I)V", "topLeft", "Lo1/m;", "size", "M1", "(Lp1/l0;JJFLr1/g;Lp1/w0;I)V", "F1", "(JJJFLr1/g;Lp1/w0;I)V", "Lp1/J0;", "image", "n1", "(Lp1/J0;JFLr1/g;Lp1/w0;I)V", "Lc2/n;", "srcOffset", "Lc2/r;", "srcSize", "dstOffset", "dstSize", "k1", "(Lp1/J0;JJJJFLr1/g;Lp1/w0;II)V", "Lo1/a;", "cornerRadius", "Q1", "(Lp1/l0;JJJFLr1/g;Lp1/w0;I)V", "j0", "(JJJJLr1/g;FLp1/w0;I)V", "radius", "center", "A1", "(JFJFLr1/g;Lp1/w0;I)V", "R0", "startAngle", "sweepAngle", "", "useCenter", "J0", "(JFFZJJFLr1/g;Lp1/w0;I)V", "Lp1/U0;", "path", "l1", "(Lp1/U0;JFLr1/g;Lp1/w0;I)V", "a1", "(Lp1/U0;Lp1/l0;FLr1/g;Lp1/w0;I)V", "Lr1/a$a;", "a", "Lr1/a$a;", "E", "()Lr1/a$a;", "getDrawParams$annotations", "drawParams", "Lr1/d;", "b", "Lr1/d;", "I1", "()Lr1/d;", "drawContext", "Lp1/S0;", "fillPaint", "d", "strokePaint", "Lc2/t;", "getLayoutDirection", "()Lc2/t;", "layoutDirection", "getDensity", "()F", "density", "D1", "fontScale", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: r1.a  reason: case insensitive filesystem */
public final class C5815a implements f {

    /* renamed from: a  reason: collision with root package name */
    private final C0452a f28610a = new C0452a((d) null, (t) null, (C5732n0) null, 0, 15, (DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    private final d f28611b = new b(this);

    /* renamed from: c  reason: collision with root package name */
    private S0 f28612c;

    /* renamed from: d  reason: collision with root package name */
    private S0 f28613d;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0012\u001a\u00020\bHÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001e\u001a\u0004\b\u001f\u0010\r\"\u0004\b \u0010!R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\"\u001a\u0004\b#\u0010\u000f\"\u0004\b$\u0010%R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010&\u001a\u0004\b'\u0010\u0011\"\u0004\b(\u0010)R(\u0010\t\u001a\u00020\b8\u0006@\u0006X\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b\u0012\u0010*\u001a\u0004\b+\u0010\u0013\"\u0004\b,\u0010-\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006."}, d2 = {"Lr1/a$a;", "", "Lc2/d;", "density", "Lc2/t;", "layoutDirection", "Lp1/n0;", "canvas", "Lo1/m;", "size", "<init>", "(Lc2/d;Lc2/t;Lp1/n0;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "()Lc2/d;", "b", "()Lc2/t;", "c", "()Lp1/n0;", "d", "()J", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lc2/d;", "f", "j", "(Lc2/d;)V", "Lc2/t;", "g", "k", "(Lc2/t;)V", "Lp1/n0;", "e", "i", "(Lp1/n0;)V", "J", "h", "l", "(J)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: r1.a$a  reason: collision with other inner class name */
    public static final class C0452a {

        /* renamed from: a  reason: collision with root package name */
        private d f28614a;

        /* renamed from: b  reason: collision with root package name */
        private t f28615b;

        /* renamed from: c  reason: collision with root package name */
        private C5732n0 f28616c;

        /* renamed from: d  reason: collision with root package name */
        private long f28617d;

        public /* synthetic */ C0452a(d dVar, t tVar, C5732n0 n0Var, long j10, DefaultConstructorMarker defaultConstructorMarker) {
            this(dVar, tVar, n0Var, j10);
        }

        public final d a() {
            return this.f28614a;
        }

        public final t b() {
            return this.f28615b;
        }

        public final C5732n0 c() {
            return this.f28616c;
        }

        public final long d() {
            return this.f28617d;
        }

        public final C5732n0 e() {
            return this.f28616c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0452a)) {
                return false;
            }
            C0452a aVar = (C0452a) obj;
            return C17542s.e(this.f28614a, aVar.f28614a) && this.f28615b == aVar.f28615b && C17542s.e(this.f28616c, aVar.f28616c) && C5673m.h(this.f28617d, aVar.f28617d);
        }

        public final d f() {
            return this.f28614a;
        }

        public final t g() {
            return this.f28615b;
        }

        public final long h() {
            return this.f28617d;
        }

        public int hashCode() {
            return (((((this.f28614a.hashCode() * 31) + this.f28615b.hashCode()) * 31) + this.f28616c.hashCode()) * 31) + C5673m.m(this.f28617d);
        }

        public final void i(C5732n0 n0Var) {
            this.f28616c = n0Var;
        }

        public final void j(d dVar) {
            this.f28614a = dVar;
        }

        public final void k(t tVar) {
            this.f28615b = tVar;
        }

        public final void l(long j10) {
            this.f28617d = j10;
        }

        public String toString() {
            return "DrawParams(density=" + this.f28614a + ", layoutDirection=" + this.f28615b + ", canvas=" + this.f28616c + ", size=" + C5673m.p(this.f28617d) + ')';
        }

        private C0452a(d dVar, t tVar, C5732n0 n0Var, long j10) {
            this.f28614a = dVar;
            this.f28615b = tVar;
            this.f28616c = n0Var;
            this.f28617d = j10;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C0452a(d dVar, t tVar, C5732n0 n0Var, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? e.a() : dVar, (i10 & 2) != 0 ? t.Ltr : tVar, (i10 & 4) != 0 ? new i() : n0Var, (i10 & 8) != 0 ? C5673m.f26722b.b() : j10, (DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R$\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108V@VX\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R*\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00178V@VX\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b\t\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010!\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u001c8V@VX\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010&\u001a\u00020\"2\u0006\u0010\u0011\u001a\u00020\"8V@VX\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b\u0003\u0010%\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006'"}, d2 = {"r1/a$b", "Lr1/d;", "Lr1/h;", "a", "Lr1/h;", "c", "()Lr1/h;", "transform", "Ls1/c;", "b", "Ls1/c;", "h", "()Ls1/c;", "i", "(Ls1/c;)V", "graphicsLayer", "Lp1/n0;", "value", "e", "()Lp1/n0;", "f", "(Lp1/n0;)V", "canvas", "Lo1/m;", "()J", "g", "(J)V", "size", "Lc2/t;", "getLayoutDirection", "()Lc2/t;", "d", "(Lc2/t;)V", "layoutDirection", "Lc2/d;", "getDensity", "()Lc2/d;", "(Lc2/d;)V", "density", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: r1.a$b */
    public static final class b implements d {

        /* renamed from: a  reason: collision with root package name */
        private final h f28618a = C5816b.b(this);

        /* renamed from: b  reason: collision with root package name */
        private C5905c f28619b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5815a f28620c;

        b(C5815a aVar) {
            this.f28620c = aVar;
        }

        public void a(d dVar) {
            this.f28620c.E().j(dVar);
        }

        public long b() {
            return this.f28620c.E().h();
        }

        public h c() {
            return this.f28618a;
        }

        public void d(t tVar) {
            this.f28620c.E().k(tVar);
        }

        public C5732n0 e() {
            return this.f28620c.E().e();
        }

        public void f(C5732n0 n0Var) {
            this.f28620c.E().i(n0Var);
        }

        public void g(long j10) {
            this.f28620c.E().l(j10);
        }

        public d getDensity() {
            return this.f28620c.E().f();
        }

        public t getLayoutDirection() {
            return this.f28620c.E().g();
        }

        public C5905c h() {
            return this.f28619b;
        }

        public void i(C5905c cVar) {
            this.f28619b = cVar;
        }
    }

    static /* synthetic */ S0 D(C5815a aVar, C5728l0 l0Var, float f10, float f11, int i10, int i11, V0 v02, float f12, C5749w0 w0Var, int i12, int i13, int i14, Object obj) {
        return aVar.z(l0Var, f10, f11, i10, i11, v02, f12, w0Var, i12, (i14 & 512) != 0 ? f.f28623w0.b() : i13);
    }

    private final long I(long j10, float f10) {
        if (f10 == 1.0f) {
            return j10;
        }
        return C5747v0.o(j10, C5747v0.r(j10) * f10, 0.0f, 0.0f, 0.0f, 14, (Object) null);
    }

    private final S0 J() {
        S0 s02 = this.f28612c;
        if (s02 != null) {
            return s02;
        }
        S0 a10 = S.a();
        a10.v(T0.f27248a.a());
        this.f28612c = a10;
        return a10;
    }

    private final S0 K() {
        S0 s02 = this.f28613d;
        if (s02 != null) {
            return s02;
        }
        S0 a10 = S.a();
        a10.v(T0.f27248a.b());
        this.f28613d = a10;
        return a10;
    }

    private final S0 P(g gVar) {
        if (C17542s.e(gVar, j.f28627a)) {
            return J();
        }
        if (gVar instanceof k) {
            S0 K10 = K();
            k kVar = (k) gVar;
            if (K10.x() != kVar.f()) {
                K10.w(kVar.f());
            }
            if (!k1.g(K10.g(), kVar.b())) {
                K10.c(kVar.b());
            }
            if (K10.m() != kVar.d()) {
                K10.s(kVar.d());
            }
            if (!l1.g(K10.l(), kVar.c())) {
                K10.i(kVar.c());
            }
            if (!C17542s.e(K10.k(), kVar.e())) {
                K10.u(kVar.e());
            }
            return K10;
        }
        throw new XH.t();
    }

    private final S0 c(long j10, g gVar, float f10, C5749w0 w0Var, int i10, int i11) {
        S0 P10 = P(gVar);
        long I10 = I(j10, f10);
        if (!C5747v0.q(P10.b(), I10)) {
            P10.j(I10);
        }
        if (P10.r() != null) {
            P10.p((Shader) null);
        }
        if (!C17542s.e(P10.h(), w0Var)) {
            P10.n(w0Var);
        }
        if (!C5712d0.E(P10.q(), i10)) {
            P10.e(i10);
        }
        if (!E0.d(P10.t(), i11)) {
            P10.f(i11);
        }
        return P10;
    }

    static /* synthetic */ S0 h(C5815a aVar, long j10, g gVar, float f10, C5749w0 w0Var, int i10, int i11, int i12, Object obj) {
        return aVar.c(j10, gVar, f10, w0Var, i10, (i12 & 32) != 0 ? f.f28623w0.b() : i11);
    }

    private final S0 p(C5728l0 l0Var, g gVar, float f10, C5749w0 w0Var, int i10, int i11) {
        S0 P10 = P(gVar);
        if (l0Var != null) {
            l0Var.a(b(), P10, f10);
        } else {
            if (P10.r() != null) {
                P10.p((Shader) null);
            }
            long b10 = P10.b();
            C5747v0.a aVar = C5747v0.f27350b;
            if (!C5747v0.q(b10, aVar.a())) {
                P10.j(aVar.a());
            }
            if (P10.a() != f10) {
                P10.d(f10);
            }
        }
        if (!C17542s.e(P10.h(), w0Var)) {
            P10.n(w0Var);
        }
        if (!C5712d0.E(P10.q(), i10)) {
            P10.e(i10);
        }
        if (!E0.d(P10.t(), i11)) {
            P10.f(i11);
        }
        return P10;
    }

    static /* synthetic */ S0 u(C5815a aVar, C5728l0 l0Var, g gVar, float f10, C5749w0 w0Var, int i10, int i11, int i12, Object obj) {
        if ((i12 & 32) != 0) {
            i11 = f.f28623w0.b();
        }
        return aVar.p(l0Var, gVar, f10, w0Var, i10, i11);
    }

    private final S0 w(long j10, float f10, float f11, int i10, int i11, V0 v02, float f12, C5749w0 w0Var, int i12, int i13) {
        S0 K10 = K();
        long I10 = I(j10, f12);
        if (!C5747v0.q(K10.b(), I10)) {
            K10.j(I10);
        }
        if (K10.r() != null) {
            K10.p((Shader) null);
        }
        if (!C17542s.e(K10.h(), w0Var)) {
            K10.n(w0Var);
        }
        if (!C5712d0.E(K10.q(), i12)) {
            K10.e(i12);
        }
        if (K10.x() != f10) {
            K10.w(f10);
        }
        if (K10.m() != f11) {
            K10.s(f11);
        }
        if (!k1.g(K10.g(), i10)) {
            K10.c(i10);
        }
        if (!l1.g(K10.l(), i11)) {
            K10.i(i11);
        }
        if (!C17542s.e(K10.k(), v02)) {
            K10.u(v02);
        }
        if (!E0.d(K10.t(), i13)) {
            K10.f(i13);
        }
        return K10;
    }

    static /* synthetic */ S0 x(C5815a aVar, long j10, float f10, float f11, int i10, int i11, V0 v02, float f12, C5749w0 w0Var, int i12, int i13, int i14, Object obj) {
        return aVar.w(j10, f10, f11, i10, i11, v02, f12, w0Var, i12, (i14 & 512) != 0 ? f.f28623w0.b() : i13);
    }

    private final S0 z(C5728l0 l0Var, float f10, float f11, int i10, int i11, V0 v02, float f12, C5749w0 w0Var, int i12, int i13) {
        S0 K10 = K();
        if (l0Var != null) {
            l0Var.a(b(), K10, f12);
        } else if (K10.a() != f12) {
            K10.d(f12);
        }
        if (!C17542s.e(K10.h(), w0Var)) {
            K10.n(w0Var);
        }
        if (!C5712d0.E(K10.q(), i12)) {
            K10.e(i12);
        }
        if (K10.x() != f10) {
            K10.w(f10);
        }
        if (K10.m() != f11) {
            K10.s(f11);
        }
        if (!k1.g(K10.g(), i10)) {
            K10.c(i10);
        }
        if (!l1.g(K10.l(), i11)) {
            K10.i(i11);
        }
        if (!C17542s.e(K10.k(), v02)) {
            K10.u(v02);
        }
        if (!E0.d(K10.t(), i13)) {
            K10.f(i13);
        }
        return K10;
    }

    public void A1(long j10, float f10, long j11, float f11, g gVar, C5749w0 w0Var, int i10) {
        float f12 = f10;
        this.f28610a.e().m(j11, f10, h(this, j10, gVar, f11, w0Var, i10, 0, 32, (Object) null));
    }

    public float D1() {
        return this.f28610a.f().D1();
    }

    public final C0452a E() {
        return this.f28610a;
    }

    public void F1(long j10, long j11, long j12, float f10, g gVar, C5749w0 w0Var, int i10) {
        this.f28610a.e().k(C5667g.m(j11), C5667g.n(j11), C5667g.m(j11) + C5673m.l(j12), C5667g.n(j11) + C5673m.i(j12), h(this, j10, gVar, f10, w0Var, i10, 0, 32, (Object) null));
    }

    public d I1() {
        return this.f28611b;
    }

    public void J0(long j10, float f10, float f11, boolean z10, long j11, long j12, float f12, g gVar, C5749w0 w0Var, int i10) {
        this.f28610a.e().y(C5667g.m(j11), C5667g.n(j11), C5667g.m(j11) + C5673m.l(j12), C5667g.n(j11) + C5673m.i(j12), f10, f11, z10, h(this, j10, gVar, f12, w0Var, i10, 0, 32, (Object) null));
    }

    public void M1(C5728l0 l0Var, long j10, long j11, float f10, g gVar, C5749w0 w0Var, int i10) {
        this.f28610a.e().k(C5667g.m(j10), C5667g.n(j10), C5667g.m(j10) + C5673m.l(j11), C5667g.n(j10) + C5673m.i(j11), u(this, l0Var, gVar, f10, w0Var, i10, 0, 32, (Object) null));
    }

    public void Q1(C5728l0 l0Var, long j10, long j11, long j12, float f10, g gVar, C5749w0 w0Var, int i10) {
        this.f28610a.e().l(C5667g.m(j10), C5667g.n(j10), C5667g.m(j10) + C5673m.l(j11), C5667g.n(j10) + C5673m.i(j11), C5661a.d(j12), C5661a.e(j12), u(this, l0Var, gVar, f10, w0Var, i10, 0, 32, (Object) null));
    }

    public void R0(long j10, long j11, long j12, float f10, g gVar, C5749w0 w0Var, int i10) {
        this.f28610a.e().x(C5667g.m(j11), C5667g.n(j11), C5667g.m(j11) + C5673m.l(j12), C5667g.n(j11) + C5673m.i(j12), h(this, j10, gVar, f10, w0Var, i10, 0, 32, (Object) null));
    }

    public void W1(long j10, long j11, long j12, float f10, int i10, V0 v02, float f11, C5749w0 w0Var, int i11) {
        this.f28610a.e().q(j11, j12, x(this, j10, f10, 4.0f, i10, l1.f27327b.b(), v02, f11, w0Var, i11, 0, 512, (Object) null));
    }

    public void a1(U0 u02, C5728l0 l0Var, float f10, g gVar, C5749w0 w0Var, int i10) {
        U0 u03 = u02;
        this.f28610a.e().h(u02, u(this, l0Var, gVar, f10, w0Var, i10, 0, 32, (Object) null));
    }

    public void g1(C5728l0 l0Var, long j10, long j11, float f10, int i10, V0 v02, float f11, C5749w0 w0Var, int i11) {
        this.f28610a.e().q(j10, j11, D(this, l0Var, f10, 4.0f, i10, l1.f27327b.b(), v02, f11, w0Var, i11, 0, 512, (Object) null));
    }

    public float getDensity() {
        return this.f28610a.f().getDensity();
    }

    public t getLayoutDirection() {
        return this.f28610a.g();
    }

    public void j0(long j10, long j11, long j12, long j13, g gVar, float f10, C5749w0 w0Var, int i10) {
        this.f28610a.e().l(C5667g.m(j11), C5667g.n(j11), C5667g.m(j11) + C5673m.l(j12), C5667g.n(j11) + C5673m.i(j12), C5661a.d(j13), C5661a.e(j13), h(this, j10, gVar, f10, w0Var, i10, 0, 32, (Object) null));
    }

    public void k1(J0 j02, long j10, long j11, long j12, long j13, float f10, g gVar, C5749w0 w0Var, int i10, int i11) {
        this.f28610a.e().w(j02, j10, j11, j12, j13, p((C5728l0) null, gVar, f10, w0Var, i10, i11));
    }

    public void l1(U0 u02, long j10, float f10, g gVar, C5749w0 w0Var, int i10) {
        U0 u03 = u02;
        this.f28610a.e().h(u02, h(this, j10, gVar, f10, w0Var, i10, 0, 32, (Object) null));
    }

    public void n1(J0 j02, long j10, float f10, g gVar, C5749w0 w0Var, int i10) {
        J0 j03 = j02;
        long j11 = j10;
        this.f28610a.e().j(j02, j10, u(this, (C5728l0) null, gVar, f10, w0Var, i10, 0, 32, (Object) null));
    }
}
