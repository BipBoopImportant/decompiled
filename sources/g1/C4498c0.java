package G1;

import E1.C4468a;
import E1.C4488v;
import E1.C4489w;
import E1.F;
import E1.H;
import E1.J;
import XH.C16807N;
import XH.C16820k;
import androidx.compose.ui.d;
import c2.n;
import c2.o;
import c2.r;
import c2.s;
import c2.t;
import g1.C5342k;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import o1.C5665e;
import o1.C5666f;
import o1.C5667g;
import o1.C5668h;
import o1.C5669i;
import o1.C5673m;
import o1.C5674n;
import p1.C5732n0;
import p1.O0;
import p1.S0;
import s1.C5905c;

@Metadata(d1 = {"\u0000\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\b \u0018\u0000 ª\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0004«\u0002¬\u0002B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0010\u001a\u00020\t2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011JB\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010!\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b!\u0010\"J\u0019\u0010$\u001a\u00020\u00182\b\b\u0002\u0010#\u001a\u00020\tH\u0002¢\u0006\u0004\b$\u0010%J@\u0010.\u001a\u00020\u0018*\u0004\u0018\u00010\u000b2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\t2\u0006\u0010-\u001a\u00020\tH\u0002ø\u0001\u0000¢\u0006\u0004\b.\u0010/JH\u00101\u001a\u00020\u0018*\u0004\u0018\u00010\u000b2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\t2\u0006\u0010-\u001a\u00020\t2\u0006\u00100\u001a\u00020\u0014H\u0002ø\u0001\u0000¢\u0006\u0004\b1\u00102JH\u00103\u001a\u00020\u0018*\u0004\u0018\u00010\u000b2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\t2\u0006\u0010-\u001a\u00020\t2\u0006\u00100\u001a\u00020\u0014H\u0002ø\u0001\u0000¢\u0006\u0004\b3\u00102J\u0013\u00104\u001a\u00020\u0000*\u00020\u0003H\u0002¢\u0006\u0004\b4\u00105J\"\u00109\u001a\u00020\u00182\u0006\u00106\u001a\u00020\u00002\u0006\u00108\u001a\u000207H\u0002ø\u0001\u0000¢\u0006\u0004\b9\u0010:J\"\u0010;\u001a\u00020\u00182\u0006\u00106\u001a\u00020\u00002\u0006\u00108\u001a\u000207H\u0002ø\u0001\u0000¢\u0006\u0004\b;\u0010:J*\u0010>\u001a\u00020(2\u0006\u00106\u001a\u00020\u00002\u0006\u0010<\u001a\u00020(2\u0006\u0010=\u001a\u00020\tH\u0002ø\u0001\u0000¢\u0006\u0004\b>\u0010?J'\u0010C\u001a\u00020\u00182\u0006\u00106\u001a\u00020\u00002\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020\tH\u0002¢\u0006\u0004\bC\u0010DJ\u001f\u0010F\u001a\u00020\u00182\u0006\u0010E\u001a\u00020@2\u0006\u0010B\u001a\u00020\tH\u0002¢\u0006\u0004\bF\u0010GJ\u001a\u0010H\u001a\u00020(2\u0006\u0010)\u001a\u00020(H\u0002ø\u0001\u0000¢\u0006\u0004\bH\u0010IJ\u001e\u0010J\u001a\u0004\u0018\u00010\u000b2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000eø\u0001\u0000¢\u0006\u0004\bJ\u0010KJ\r\u0010L\u001a\u00020\t¢\u0006\u0004\bL\u0010MJ\u000f\u0010N\u001a\u00020\u0018H\u0010¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020\u0018H&¢\u0006\u0004\bP\u0010OJ\u001f\u0010T\u001a\u00020\u00182\u0006\u0010R\u001a\u00020Q2\u0006\u0010S\u001a\u00020QH\u0014¢\u0006\u0004\bT\u0010UJ\u000f\u0010V\u001a\u00020\u0018H\u0000¢\u0006\u0004\bV\u0010OJ\r\u0010W\u001a\u00020\u0018¢\u0006\u0004\bW\u0010OJ8\u0010X\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0016H\u0014ø\u0001\u0000¢\u0006\u0004\bX\u0010YJ*\u0010[\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010Z\u001a\u00020\u001aH\u0014ø\u0001\u0000¢\u0006\u0004\b[\u0010\\J\r\u0010]\u001a\u00020\u0018¢\u0006\u0004\b]\u0010OJ@\u0010^\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00162\b\u0010Z\u001a\u0004\u0018\u00010\u001aø\u0001\u0000¢\u0006\u0004\b^\u0010\u001dJ\u001f\u0010_\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b_\u0010\"J!\u0010`\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b`\u0010\"J\r\u0010a\u001a\u00020\u0018¢\u0006\u0004\ba\u0010OJ-\u0010c\u001a\u00020\u00182\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00162\b\b\u0002\u0010b\u001a\u00020\t¢\u0006\u0004\bc\u0010dJ8\u0010e\u001a\u00020\u00182\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\t2\u0006\u0010-\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\be\u0010fJ:\u0010g\u001a\u00020\u00182\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\t2\u0006\u0010-\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\bg\u0010fJ\r\u0010i\u001a\u00020h¢\u0006\u0004\bi\u0010jJ\u001a\u0010l\u001a\u00020(2\u0006\u0010k\u001a\u00020(H\u0016ø\u0001\u0000¢\u0006\u0004\bl\u0010IJ\u001a\u0010n\u001a\u00020(2\u0006\u0010m\u001a\u00020(H\u0016ø\u0001\u0000¢\u0006\u0004\bn\u0010IJ\u001a\u0010p\u001a\u00020(2\u0006\u0010o\u001a\u00020(H\u0016ø\u0001\u0000¢\u0006\u0004\bp\u0010IJ\"\u0010s\u001a\u00020(2\u0006\u0010q\u001a\u00020\u00032\u0006\u0010r\u001a\u00020(H\u0016ø\u0001\u0000¢\u0006\u0004\bs\u0010tJ*\u0010u\u001a\u00020(2\u0006\u0010q\u001a\u00020\u00032\u0006\u0010r\u001a\u00020(2\u0006\u0010=\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\bu\u0010vJ\"\u0010w\u001a\u00020\u00182\u0006\u0010q\u001a\u00020\u00032\u0006\u00108\u001a\u000207H\u0016ø\u0001\u0000¢\u0006\u0004\bw\u0010xJ\u001a\u0010y\u001a\u00020\u00182\u0006\u00108\u001a\u000207H\u0016ø\u0001\u0000¢\u0006\u0004\by\u0010zJ\u001f\u0010{\u001a\u00020h2\u0006\u0010q\u001a\u00020\u00032\u0006\u0010B\u001a\u00020\tH\u0016¢\u0006\u0004\b{\u0010|J\u001a\u0010}\u001a\u00020(2\u0006\u0010o\u001a\u00020(H\u0016ø\u0001\u0000¢\u0006\u0004\b}\u0010IJ$\u0010~\u001a\u00020(2\u0006\u0010\u0013\u001a\u00020(2\b\b\u0002\u0010=\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b~\u0010J&\u0010\u0001\u001a\u00020(2\u0006\u0010\u0013\u001a\u00020(2\b\b\u0002\u0010=\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0005\b\u0001\u0010J$\u0010\u0001\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010\u0001\u001a\u00030\u0001H\u0004¢\u0006\u0006\b\u0001\u0010\u0001J\u000f\u0010\u0001\u001a\u00020\u0018¢\u0006\u0005\b\u0001\u0010OJ\u000f\u0010\u0001\u001a\u00020\u0018¢\u0006\u0005\b\u0001\u0010OJ-\u0010\u0001\u001a\u00020\u00182\u0006\u0010E\u001a\u00020@2\u0006\u0010B\u001a\u00020\t2\t\b\u0002\u0010\u0001\u001a\u00020\tH\u0000¢\u0006\u0006\b\u0001\u0010\u0001J\u001d\u0010\u0001\u001a\u00020\t2\u0006\u0010)\u001a\u00020(H\u0004ø\u0001\u0000¢\u0006\u0006\b\u0001\u0010\u0001J\u001d\u0010\u0001\u001a\u00020\t2\u0006\u0010)\u001a\u00020(H\u0004ø\u0001\u0000¢\u0006\u0006\b\u0001\u0010\u0001J\u0011\u0010\u0001\u001a\u00020\u0018H\u0016¢\u0006\u0005\b\u0001\u0010OJ\u0011\u0010\u0001\u001a\u00020\u0018H\u0016¢\u0006\u0005\b\u0001\u0010OJ\u001b\u0010\u0001\u001a\u00020\u00002\u0007\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0006\b\u0001\u0010\u0001J\u000f\u0010\u0001\u001a\u00020\t¢\u0006\u0005\b\u0001\u0010MJ\u001f\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001H\u0004ø\u0001\u0000¢\u0006\u0005\b\u0001\u0010IJ'\u0010\u0001\u001a\u00020\u00142\u0006\u0010)\u001a\u00020(2\b\u0010\u0001\u001a\u00030\u0001H\u0004ø\u0001\u0000¢\u0006\u0006\b\u0001\u0010\u0001R\u001e\u0010\u0006\u001a\u00020\u00058\u0016X\u0004¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R'\u0010 \u0001\u001a\u00020\t8\u0000@\u0000X\u000e¢\u0006\u0016\n\u0006\b\u0001\u0010\u0001\u001a\u0005\b\u0001\u0010M\"\u0005\b\u0001\u0010%R'\u0010¤\u0001\u001a\u00020\t8\u0000@\u0000X\u000e¢\u0006\u0016\n\u0006\b¡\u0001\u0010\u0001\u001a\u0005\b¢\u0001\u0010M\"\u0005\b£\u0001\u0010%R+\u0010«\u0001\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u000e¢\u0006\u0018\n\u0006\b¥\u0001\u0010¦\u0001\u001a\u0006\b§\u0001\u0010¨\u0001\"\u0006\b©\u0001\u0010ª\u0001R+\u0010¯\u0001\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u000e¢\u0006\u0018\n\u0006\b¬\u0001\u0010¦\u0001\u001a\u0006\b­\u0001\u0010¨\u0001\"\u0006\b®\u0001\u0010ª\u0001R\u0018\u0010°\u0001\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\bl\u0010\u0001R\u0019\u0010²\u0001\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b±\u0001\u0010\u0001RE\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00162\u0015\u0010³\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00168\u0004@BX\u000e¢\u0006\u0010\n\u0006\b´\u0001\u0010µ\u0001\u001a\u0006\b¶\u0001\u0010·\u0001R\u001a\u0010»\u0001\u001a\u00030¸\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b¹\u0001\u0010º\u0001R\u001a\u0010¿\u0001\u001a\u00030¼\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b½\u0001\u0010¾\u0001R\u0019\u0010Â\u0001\u001a\u00020\u00148\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÀ\u0001\u0010Á\u0001R\u001c\u0010Æ\u0001\u001a\u0005\u0018\u00010Ã\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÄ\u0001\u0010Å\u0001R)\u0010Ë\u0001\u001a\u0012\u0012\u0005\u0012\u00030È\u0001\u0012\u0004\u0012\u00020Q\u0018\u00010Ç\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÉ\u0001\u0010Ê\u0001R7\u0010\u0013\u001a\u00020\u00122\u0007\u0010³\u0001\u001a\u00020\u00128\u0016@TX\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0018\n\u0006\bÌ\u0001\u0010Í\u0001\u001a\u0006\bÎ\u0001\u0010Ï\u0001\"\u0006\bÐ\u0001\u0010Ñ\u0001R1\u0010\u0015\u001a\u00020\u00142\u0007\u0010³\u0001\u001a\u00020\u00148\u0006@DX\u000e¢\u0006\u0018\n\u0006\bÒ\u0001\u0010Á\u0001\u001a\u0006\bÓ\u0001\u0010Ô\u0001\"\u0006\bÕ\u0001\u0010Ö\u0001R\u001a\u0010Ø\u0001\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\bs\u0010×\u0001R\u001c\u0010Û\u0001\u001a\u0005\u0018\u00010Ù\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÁ\u0001\u0010Ú\u0001R3\u0010à\u0001\u001a\u0017\u0012\u0004\u0012\u00020\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\u00180Ü\u00018\u0002X\u0004¢\u0006\u000f\n\u0006\bÝ\u0001\u0010Þ\u0001\u0012\u0005\bß\u0001\u0010OR\u001e\u0010ä\u0001\u001a\t\u0012\u0004\u0012\u00020\u00180á\u00018\u0002X\u0004¢\u0006\b\n\u0006\bâ\u0001\u0010ã\u0001R)\u0010ç\u0001\u001a\u00020\t2\u0007\u0010³\u0001\u001a\u00020\t8\u0000@BX\u000e¢\u0006\u000f\n\u0006\bå\u0001\u0010\u0001\u001a\u0005\bæ\u0001\u0010MR/\u0010Z\u001a\u0005\u0018\u00010è\u00012\n\u0010³\u0001\u001a\u0005\u0018\u00010è\u00018\u0006@BX\u000e¢\u0006\u0010\n\u0006\bÍ\u0001\u0010é\u0001\u001a\u0006\bê\u0001\u0010ë\u0001R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\bn\u0010ì\u0001R\u0018\u0010ð\u0001\u001a\u00030í\u00018BX\u0004¢\u0006\b\u001a\u0006\bî\u0001\u0010ï\u0001R\u0017\u0010ó\u0001\u001a\u00020\u000b8&X¦\u0004¢\u0006\b\u001a\u0006\bñ\u0001\u0010ò\u0001R\u0018\u0010ö\u0001\u001a\u00030¼\u00018VX\u0004¢\u0006\b\u001a\u0006\bô\u0001\u0010õ\u0001R\u0017\u0010ø\u0001\u001a\u00020\u00148VX\u0004¢\u0006\b\u001a\u0006\b÷\u0001\u0010Ô\u0001R\u0017\u0010ú\u0001\u001a\u00020\u00148VX\u0004¢\u0006\b\u001a\u0006\bù\u0001\u0010Ô\u0001R\u0019\u0010ý\u0001\u001a\u0004\u0018\u00010\u00018VX\u0004¢\u0006\b\u001a\u0006\bû\u0001\u0010ü\u0001R\u0017\u0010\u0002\u001a\u00020\u00038VX\u0004¢\u0006\b\u001a\u0006\bþ\u0001\u0010ÿ\u0001R\u001b\u0010\u0002\u001a\u00030\u00028Fø\u0001\u0000ø\u0001\u0001¢\u0006\b\u001a\u0006\b\u0002\u0010Ï\u0001R\u0018\u0010\u0002\u001a\u00030\u00028VX\u0004¢\u0006\b\u001a\u0006\b\u0002\u0010\u0002R\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018VX\u0004¢\u0006\b\u001a\u0006\b\u0002\u0010ü\u0001R\u0016\u0010\u0002\u001a\u00020\t8VX\u0004¢\u0006\u0007\u001a\u0005\b\u0002\u0010MR\u0016\u0010\u0002\u001a\u00020\t8VX\u0004¢\u0006\u0007\u001a\u0005\b\u0002\u0010MR,\u0010\u0002\u001a\u00030Ã\u00012\b\u0010\u0002\u001a\u00030Ã\u00018P@PX\u000e¢\u0006\u0010\u001a\u0006\b\u0002\u0010\u0002\"\u0006\b\u0002\u0010\u0002R0\u0010\u0002\u001a\u0005\u0018\u00010\u00022\n\u0010³\u0001\u001a\u0005\u0018\u00010\u00028&@dX¦\u000e¢\u0006\u0010\u001a\u0006\b\u0002\u0010\u0002\"\u0006\b\u0002\u0010\u0002R\u001a\u0010\u0002\u001a\u0005\u0018\u00010\u00028VX\u0004¢\u0006\b\u001a\u0006\b\u0002\u0010\u0002R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00038F¢\u0006\b\u001a\u0006\b\u0002\u0010ÿ\u0001R\u0016\u0010 \u0002\u001a\u0004\u0018\u00010\u00038F¢\u0006\b\u001a\u0006\bå\u0001\u0010ÿ\u0001R\u0017\u0010£\u0002\u001a\u00020@8DX\u0004¢\u0006\b\u001a\u0006\b¡\u0002\u0010¢\u0002R\u001e\u0010¦\u0002\u001a\u00030¤\u00028@X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\b\u001a\u0006\b¥\u0002\u0010Ï\u0001R\u0016\u0010¨\u0002\u001a\u00020\t8VX\u0004¢\u0006\u0007\u001a\u0005\b§\u0002\u0010MR\u001b\u0010\u0001\u001a\u00030\u00018Fø\u0001\u0000ø\u0001\u0001¢\u0006\b\u001a\u0006\b©\u0002\u0010Ï\u0001\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006­\u0002"}, d2 = {"LG1/c0;", "LG1/P;", "LE1/H;", "LE1/v;", "LG1/n0;", "LG1/G;", "layoutNode", "<init>", "(LG1/G;)V", "", "includeTail", "Landroidx/compose/ui/d$c;", "O2", "(Z)Landroidx/compose/ui/d$c;", "LG1/e0;", "type", "M2", "(I)Z", "Lc2/n;", "position", "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/c;", "LXH/N;", "layerBlock", "Ls1/c;", "explicitLayer", "f3", "(JFLnI/l;Ls1/c;)V", "Lp1/n0;", "canvas", "graphicsLayer", "t2", "(Lp1/n0;Ls1/c;)V", "invokeOnLayoutChange", "A3", "(Z)V", "LG1/c0$f;", "hitTestSource", "Lo1/g;", "pointerPosition", "LG1/u;", "hitTestResult", "isTouchEvent", "isInLayer", "P2", "(Landroidx/compose/ui/d$c;LG1/c0$f;JLG1/u;ZZ)V", "distanceFromEdge", "Q2", "(Landroidx/compose/ui/d$c;LG1/c0$f;JLG1/u;ZZF)V", "r3", "s3", "(LE1/v;)LG1/c0;", "ancestor", "Lp1/O0;", "matrix", "x3", "(LG1/c0;[F)V", "w3", "offset", "includeMotionFrameOfReference", "o2", "(LG1/c0;JZ)J", "Lo1/e;", "rect", "clipBounds", "n2", "(LG1/c0;Lo1/e;Z)V", "bounds", "y2", "(Lo1/e;Z)V", "W2", "(J)J", "N2", "(I)Landroidx/compose/ui/d$c;", "V2", "()Z", "U1", "()V", "u2", "", "width", "height", "a3", "(II)V", "X2", "b3", "N0", "(JFLnI/l;)V", "layer", "T0", "(JFLs1/c;)V", "j3", "g3", "r2", "e3", "c3", "forceUpdateLayerParameters", "y3", "(LnI/l;Z)V", "R2", "(LG1/c0$f;JLG1/u;ZZ)V", "S2", "Lo1/i;", "v3", "()Lo1/i;", "relativeToScreen", "u", "relativeToWindow", "K", "relativeToLocal", "Y", "sourceCoordinates", "relativeToSource", "E", "(LE1/v;J)J", "e0", "(LE1/v;JZ)J", "r0", "(LE1/v;[F)V", "c0", "([F)V", "m0", "(LE1/v;Z)Lo1/i;", "p0", "t3", "(JZ)J", "w2", "Lp1/S0;", "paint", "s2", "(Lp1/n0;Lp1/S0;)V", "Z2", "d3", "clipToMinimumTouchTargetSize", "h3", "(Lo1/e;ZZ)V", "C3", "(J)Z", "U2", "T2", "Y2", "other", "v2", "(LG1/c0;)LG1/c0;", "q3", "Lo1/m;", "minimumTouchTargetSize", "p2", "q2", "(JJ)F", "p", "LG1/G;", "P1", "()LG1/G;", "q", "Z", "getForcePlaceWithLookaheadOffset$ui_release", "l3", "forcePlaceWithLookaheadOffset", "r", "A2", "k3", "forceMeasureWithLookaheadConstraints", "s", "LG1/c0;", "J2", "()LG1/c0;", "o3", "(LG1/c0;)V", "wrapped", "t", "K2", "p3", "wrappedBy", "released", "v", "isClipping", "<set-?>", "w", "LnI/l;", "getLayerBlock", "()LnI/l;", "Lc2/d;", "x", "Lc2/d;", "layerDensity", "Lc2/t;", "y", "Lc2/t;", "layerLayoutDirection", "z", "F", "lastLayerAlpha", "LE1/J;", "A", "LE1/J;", "_measureResult", "", "LE1/a;", "B", "Ljava/util/Map;", "oldAlignmentLines", "C", "J", "v1", "()J", "n3", "(J)V", "D", "L2", "()F", "setZIndex", "(F)V", "Lo1/e;", "_rectCache", "LG1/z;", "LG1/z;", "layerPositionalProperties", "Lkotlin/Function2;", "G", "LnI/p;", "getDrawBlock$annotations", "drawBlock", "Lkotlin/Function0;", "H", "LnI/a;", "invalidateParentLayer", "I", "B2", "lastLayerDrawingWasSkipped", "LG1/l0;", "LG1/l0;", "D2", "()LG1/l0;", "Ls1/c;", "LG1/o0;", "H2", "()LG1/o0;", "snapshotObserver", "I2", "()Landroidx/compose/ui/d$c;", "tail", "getLayoutDirection", "()Lc2/t;", "layoutDirection", "getDensity", "density", "D1", "fontScale", "s1", "()LG1/P;", "parent", "o1", "()LE1/v;", "coordinates", "Lc2/r;", "a", "size", "LG1/b;", "z2", "()LG1/b;", "alignmentLinesOwner", "m1", "child", "p1", "hasMeasureResult", "c", "isAttached", "value", "r1", "()LE1/J;", "m3", "(LE1/J;)V", "measureResult", "LG1/Q;", "E2", "()LG1/Q;", "setLookaheadDelegate", "(LG1/Q;)V", "lookaheadDelegate", "", "h", "()Ljava/lang/Object;", "parentData", "k0", "parentLayoutCoordinates", "parentCoordinates", "G2", "()Lo1/e;", "rectCache", "Lc2/b;", "C2", "lastMeasurementConstraints", "f1", "isValidOwnerScope", "F2", "L", "e", "f", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: G1.c0  reason: case insensitive filesystem */
public abstract class C4498c0 extends P implements H, C4488v, n0 {

    /* renamed from: L  reason: collision with root package name */
    public static final e f6446L = new e((DefaultConstructorMarker) null);

    /* renamed from: M  reason: collision with root package name */
    private static final C17642l<C4498c0, C16807N> f6447M = d.f6477c;
    /* access modifiers changed from: private */

    /* renamed from: N  reason: collision with root package name */
    public static final C17642l<C4498c0, C16807N> f6448N = c.f6476c;
    /* access modifiers changed from: private */

    /* renamed from: O  reason: collision with root package name */
    public static final androidx.compose.ui.graphics.d f6449O = new androidx.compose.ui.graphics.d();
    /* access modifiers changed from: private */

    /* renamed from: P  reason: collision with root package name */
    public static final C4522z f6450P = new C4522z();

    /* renamed from: Q  reason: collision with root package name */
    private static final float[] f6451Q = O0.c((float[]) null, 1, (DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: R  reason: collision with root package name */
    public static final f f6452R = new a();
    /* access modifiers changed from: private */

    /* renamed from: S  reason: collision with root package name */
    public static final f f6453S = new b();

    /* renamed from: A  reason: collision with root package name */
    private J f6454A;

    /* renamed from: B  reason: collision with root package name */
    private Map<C4468a, Integer> f6455B;

    /* renamed from: C  reason: collision with root package name */
    private long f6456C = n.f23044b.a();

    /* renamed from: D  reason: collision with root package name */
    private float f6457D;

    /* renamed from: E  reason: collision with root package name */
    private C5665e f6458E;
    /* access modifiers changed from: private */

    /* renamed from: F  reason: collision with root package name */
    public C4522z f6459F;

    /* renamed from: G  reason: collision with root package name */
    private final p<C5732n0, C5905c, C16807N> f6460G = new g(this);

    /* renamed from: H  reason: collision with root package name */
    private final C17631a<C16807N> f6461H = new j(this);
    /* access modifiers changed from: private */

    /* renamed from: I  reason: collision with root package name */
    public boolean f6462I;

    /* renamed from: J  reason: collision with root package name */
    private l0 f6463J;

    /* renamed from: K  reason: collision with root package name */
    private C5905c f6464K;

    /* renamed from: p  reason: collision with root package name */
    private final G f6465p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f6466q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f6467r;

    /* renamed from: s  reason: collision with root package name */
    private C4498c0 f6468s;

    /* renamed from: t  reason: collision with root package name */
    private C4498c0 f6469t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f6470u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f6471v;

    /* renamed from: w  reason: collision with root package name */
    private C17642l<? super androidx.compose.ui.graphics.c, C16807N> f6472w;

    /* renamed from: x  reason: collision with root package name */
    private c2.d f6473x = P1().N();

    /* renamed from: y  reason: collision with root package name */
    private t f6474y = P1().getLayoutDirection();

    /* renamed from: z  reason: collision with root package name */
    private float f6475z = 0.8f;

    @Metadata(d1 = {"\u0000A\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ:\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\bH\u0016ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"G1/c0$a", "LG1/c0$f;", "LG1/e0;", "LG1/s0;", "a", "()I", "Landroidx/compose/ui/d$c;", "node", "", "c", "(Landroidx/compose/ui/d$c;)Z", "LG1/G;", "parentLayoutNode", "d", "(LG1/G;)Z", "layoutNode", "Lo1/g;", "pointerPosition", "LG1/u;", "hitTestResult", "isTouchEvent", "isInLayer", "LXH/N;", "b", "(LG1/G;JLG1/u;ZZ)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: G1.c0$a */
    public static final class a implements f {
        a() {
        }

        public int a() {
            return C4502e0.a(16);
        }

        public void b(G g10, long j10, C4517u uVar, boolean z10, boolean z11) {
            g10.y0(j10, uVar, z10, z11);
        }

        public boolean c(d.c cVar) {
            int a10 = C4502e0.a(16);
            W0.b bVar = null;
            while (cVar != null) {
                if (cVar instanceof s0) {
                    if (((s0) cVar).o0()) {
                        return true;
                    }
                } else if ((cVar.e2() & a10) != 0 && (cVar instanceof C4510m)) {
                    int i10 = 0;
                    for (d.c D22 = ((C4510m) cVar).D2(); D22 != null; D22 = D22.a2()) {
                        if ((D22.e2() & a10) != 0) {
                            i10++;
                            if (i10 == 1) {
                                cVar = D22;
                            } else {
                                if (bVar == null) {
                                    bVar = new W0.b(new d.c[16], 0);
                                }
                                if (cVar != null) {
                                    bVar.b(cVar);
                                    cVar = null;
                                }
                                bVar.b(D22);
                            }
                        }
                    }
                    if (i10 == 1) {
                    }
                }
                cVar = C4508k.g(bVar);
            }
            return false;
        }

        public boolean d(G g10) {
            return true;
        }
    }

    @Metadata(d1 = {"\u0000A\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ:\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\bH\u0016ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"G1/c0$b", "LG1/c0$f;", "LG1/e0;", "LG1/w0;", "a", "()I", "Landroidx/compose/ui/d$c;", "node", "", "c", "(Landroidx/compose/ui/d$c;)Z", "LG1/G;", "parentLayoutNode", "d", "(LG1/G;)Z", "layoutNode", "Lo1/g;", "pointerPosition", "LG1/u;", "hitTestResult", "isTouchEvent", "isInLayer", "LXH/N;", "b", "(LG1/G;JLG1/u;ZZ)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: G1.c0$b */
    public static final class b implements f {
        b() {
        }

        public int a() {
            return C4502e0.a(8);
        }

        public void b(G g10, long j10, C4517u uVar, boolean z10, boolean z11) {
            g10.A0(j10, uVar, z10, z11);
        }

        public boolean c(d.c cVar) {
            return false;
        }

        public boolean d(G g10) {
            L1.l L10 = g10.L();
            boolean z10 = false;
            if (L10 != null && L10.x()) {
                z10 = true;
            }
            return !z10;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LG1/c0;", "coordinator", "LXH/N;", "a", "(LG1/c0;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: G1.c0$c */
    static final class c extends C17544u implements C17642l<C4498c0, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final c f6476c = new c();

        c() {
            super(1);
        }

        public final void a(C4498c0 c0Var) {
            l0 D22 = c0Var.D2();
            if (D22 != null) {
                D22.invalidate();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C4498c0) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LG1/c0;", "coordinator", "LXH/N;", "a", "(LG1/c0;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: G1.c0$d */
    static final class d extends C17544u implements C17642l<C4498c0, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final d f6477c = new d();

        d() {
            super(1);
        }

        public final void a(C4498c0 c0Var) {
            if (c0Var.f1()) {
                C4522z b22 = c0Var.f6459F;
                if (b22 == null) {
                    C4498c0.B3(c0Var, false, 1, (Object) null);
                    return;
                }
                C4498c0.f6450P.a(b22);
                C4498c0.B3(c0Var, false, 1, (Object) null);
                if (!C4498c0.f6450P.c(b22)) {
                    G P12 = c0Var.P1();
                    L X10 = P12.X();
                    if (X10.s() > 0) {
                        if (X10.u() || X10.v()) {
                            G.v1(P12, false, 1, (Object) null);
                        }
                        X10.I().X1();
                    }
                    m0 p02 = P12.p0();
                    if (p02 != null) {
                        p02.p(P12);
                    }
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C4498c0) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\f\u001a\u00020\u000b8\u0006XT¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0006XT¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\u00020\u001b8\u0002X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"LG1/c0$e;", "", "<init>", "()V", "LG1/c0$f;", "PointerInputSource", "LG1/c0$f;", "a", "()LG1/c0$f;", "SemanticsSource", "b", "", "ExpectAttachedLayoutCoordinates", "Ljava/lang/String;", "UnmeasuredError", "Landroidx/compose/ui/graphics/d;", "graphicsLayerScope", "Landroidx/compose/ui/graphics/d;", "Lkotlin/Function1;", "LG1/c0;", "LXH/N;", "onCommitAffectingLayer", "LnI/l;", "onCommitAffectingLayerParams", "LG1/z;", "tmpLayerPositionalProperties", "LG1/z;", "Lp1/O0;", "tmpMatrix", "[F", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: G1.c0$e */
    public static final class e {
        public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a() {
            return C4498c0.f6452R;
        }

        public final f b() {
            return C4498c0.f6453S;
        }

        private e() {
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0019\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\rJ:\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007H&ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017ø\u0001\u0002\u0002\u0011\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0001"}, d2 = {"LG1/c0$f;", "", "LG1/e0;", "a", "()I", "Landroidx/compose/ui/d$c;", "node", "", "c", "(Landroidx/compose/ui/d$c;)Z", "LG1/G;", "parentLayoutNode", "d", "(LG1/G;)Z", "layoutNode", "Lo1/g;", "pointerPosition", "LG1/u;", "hitTestResult", "isTouchEvent", "isInLayer", "LXH/N;", "b", "(LG1/G;JLG1/u;ZZ)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: G1.c0$f */
    public interface f {
        int a();

        void b(G g10, long j10, C4517u uVar, boolean z10, boolean z11);

        boolean c(d.c cVar);

        boolean d(G g10);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lp1/n0;", "canvas", "Ls1/c;", "parentLayer", "LXH/N;", "a", "(Lp1/n0;Ls1/c;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: G1.c0$g */
    static final class g extends C17544u implements p<C5732n0, C5905c, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C4498c0 f6478c;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: G1.c0$g$a */
        static final class a extends C17544u implements C17631a<C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C4498c0 f6479c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C5732n0 f6480d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ C5905c f6481e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C4498c0 c0Var, C5732n0 n0Var, C5905c cVar) {
                super(0);
                this.f6479c = c0Var;
                this.f6480d = n0Var;
                this.f6481e = cVar;
            }

            public final void invoke() {
                this.f6479c.t2(this.f6480d, this.f6481e);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(C4498c0 c0Var) {
            super(2);
            this.f6478c = c0Var;
        }

        public final void a(C5732n0 n0Var, C5905c cVar) {
            if (this.f6478c.P1().p()) {
                this.f6478c.H2().i(this.f6478c, C4498c0.f6448N, new a(this.f6478c, n0Var, cVar));
                this.f6478c.f6462I = false;
                return;
            }
            this.f6478c.f6462I = true;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C5732n0) obj, (C5905c) obj2);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: G1.c0$h */
    static final class h extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C4498c0 f6482c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ d.c f6483d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ f f6484e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f6485f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C4517u f6486g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ boolean f6487h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ boolean f6488i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(C4498c0 c0Var, d.c cVar, f fVar, long j10, C4517u uVar, boolean z10, boolean z11) {
            super(0);
            this.f6482c = c0Var;
            this.f6483d = cVar;
            this.f6484e = fVar;
            this.f6485f = j10;
            this.f6486g = uVar;
            this.f6487h = z10;
            this.f6488i = z11;
        }

        public final void invoke() {
            this.f6482c.P2(C4500d0.b(this.f6483d, this.f6484e.a(), C4502e0.a(2)), this.f6484e, this.f6485f, this.f6486g, this.f6487h, this.f6488i);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: G1.c0$i */
    static final class i extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C4498c0 f6489c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ d.c f6490d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ f f6491e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f6492f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C4517u f6493g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ boolean f6494h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ boolean f6495i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ float f6496j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(C4498c0 c0Var, d.c cVar, f fVar, long j10, C4517u uVar, boolean z10, boolean z11, float f10) {
            super(0);
            this.f6489c = c0Var;
            this.f6490d = cVar;
            this.f6491e = fVar;
            this.f6492f = j10;
            this.f6493g = uVar;
            this.f6494h = z10;
            this.f6495i = z11;
            this.f6496j = f10;
        }

        public final void invoke() {
            this.f6489c.Q2(C4500d0.b(this.f6490d, this.f6491e.a(), C4502e0.a(2)), this.f6491e, this.f6492f, this.f6493g, this.f6494h, this.f6495i, this.f6496j);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: G1.c0$j */
    static final class j extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C4498c0 f6497c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(C4498c0 c0Var) {
            super(0);
            this.f6497c = c0Var;
        }

        public final void invoke() {
            C4498c0 K22 = this.f6497c.K2();
            if (K22 != null) {
                K22.T2();
            }
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: G1.c0$k */
    static final class k extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C4498c0 f6498c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ d.c f6499d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ f f6500e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f6501f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C4517u f6502g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ boolean f6503h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ boolean f6504i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ float f6505j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(C4498c0 c0Var, d.c cVar, f fVar, long j10, C4517u uVar, boolean z10, boolean z11, float f10) {
            super(0);
            this.f6498c = c0Var;
            this.f6499d = cVar;
            this.f6500e = fVar;
            this.f6501f = j10;
            this.f6502g = uVar;
            this.f6503h = z10;
            this.f6504i = z11;
            this.f6505j = f10;
        }

        public final void invoke() {
            this.f6498c.r3(C4500d0.b(this.f6499d, this.f6500e.a(), C4502e0.a(2)), this.f6500e, this.f6501f, this.f6502g, this.f6503h, this.f6504i, this.f6505j);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: G1.c0$l */
    static final class l extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<androidx.compose.ui.graphics.c, C16807N> f6506c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(C17642l<? super androidx.compose.ui.graphics.c, C16807N> lVar) {
            super(0);
            this.f6506c = lVar;
        }

        public final void invoke() {
            this.f6506c.invoke(C4498c0.f6449O);
            C4498c0.f6449O.b0();
        }
    }

    public C4498c0(G g10) {
        this.f6465p = g10;
    }

    private final void A3(boolean z10) {
        m0 p02;
        if (this.f6464K == null) {
            l0 l0Var = this.f6463J;
            if (l0Var != null) {
                C17642l<? super androidx.compose.ui.graphics.c, C16807N> lVar = this.f6472w;
                if (lVar != null) {
                    androidx.compose.ui.graphics.d dVar = f6449O;
                    dVar.P();
                    dVar.T(P1().N());
                    dVar.V(P1().getLayoutDirection());
                    dVar.Y(s.d(a()));
                    H2().i(this, f6447M, new l(lVar));
                    C4522z zVar = this.f6459F;
                    if (zVar == null) {
                        zVar = new C4522z();
                        this.f6459F = zVar;
                    }
                    zVar.b(dVar);
                    l0Var.f(dVar);
                    this.f6471v = dVar.p();
                    this.f6475z = dVar.c();
                    if (z10 && (p02 = P1().p0()) != null) {
                        p02.m(P1());
                        return;
                    }
                    return;
                }
                D1.a.c("updateLayerParameters requires a non-null layerBlock");
                throw new C16820k();
            }
            if (!(this.f6472w == null)) {
                D1.a.b("null layer with a non-null layerBlock");
            }
        }
    }

    static /* synthetic */ void B3(C4498c0 c0Var, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                z10 = true;
            }
            c0Var.A3(z10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerParameters");
    }

    /* access modifiers changed from: private */
    public final o0 H2() {
        return K.b(P1()).getSnapshotObserver();
    }

    private final boolean M2(int i10) {
        d.c O22 = O2(f0.i(i10));
        return O22 != null && C4508k.e(O22, i10);
    }

    /* access modifiers changed from: private */
    public final d.c O2(boolean z10) {
        d.c I22;
        if (P1().o0() == this) {
            return P1().m0().k();
        }
        if (z10) {
            C4498c0 c0Var = this.f6469t;
            if (!(c0Var == null || (I22 = c0Var.I2()) == null)) {
                return I22.a2();
            }
        } else {
            C4498c0 c0Var2 = this.f6469t;
            if (c0Var2 != null) {
                return c0Var2.I2();
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    public final void P2(d.c cVar, f fVar, long j10, C4517u uVar, boolean z10, boolean z11) {
        if (cVar == null) {
            S2(fVar, j10, uVar, z10, z11);
            return;
        }
        uVar.B(cVar, z11, new h(this, cVar, fVar, j10, uVar, z10, z11));
    }

    /* access modifiers changed from: private */
    public final void Q2(d.c cVar, f fVar, long j10, C4517u uVar, boolean z10, boolean z11, float f10) {
        if (cVar == null) {
            S2(fVar, j10, uVar, z10, z11);
            return;
        }
        float f11 = f10;
        uVar.C(cVar, f11, z11, new i(this, cVar, fVar, j10, uVar, z10, z11, f10));
    }

    private final long W2(long j10) {
        float m10 = C5667g.m(j10);
        float max = Math.max(0.0f, m10 < 0.0f ? -m10 : m10 - ((float) C0()));
        float n10 = C5667g.n(j10);
        return C5668h.a(max, Math.max(0.0f, n10 < 0.0f ? -n10 : n10 - ((float) z())));
    }

    private final void f3(long j10, float f10, C17642l<? super androidx.compose.ui.graphics.c, C16807N> lVar, C5905c cVar) {
        if (cVar != null) {
            if (!(lVar == null)) {
                D1.a.a("both ways to create layers shouldn't be used together");
            }
            if (this.f6464K != cVar) {
                this.f6464K = null;
                z3(this, (C17642l) null, false, 2, (Object) null);
                this.f6464K = cVar;
            }
            if (this.f6463J == null) {
                l0 d10 = K.b(P1()).d(this.f6460G, this.f6461H, cVar);
                d10.c(B0());
                d10.i(j10);
                this.f6463J = d10;
                P1().C1(true);
                this.f6461H.invoke();
            }
        } else {
            if (this.f6464K != null) {
                this.f6464K = null;
                z3(this, (C17642l) null, false, 2, (Object) null);
            }
            z3(this, lVar, false, 2, (Object) null);
        }
        if (!n.g(v1(), j10)) {
            n3(j10);
            P1().X().I().X1();
            l0 l0Var = this.f6463J;
            if (l0Var != null) {
                l0Var.i(j10);
            } else {
                C4498c0 c0Var = this.f6469t;
                if (c0Var != null) {
                    c0Var.T2();
                }
            }
            C1(this);
            m0 p02 = P1().p0();
            if (p02 != null) {
                p02.m(P1());
            }
        }
        this.f6457D = f10;
        if (!R1()) {
            d1(r1());
        }
    }

    public static /* synthetic */ void i3(C4498c0 c0Var, C5665e eVar, boolean z10, boolean z11, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 4) != 0) {
                z11 = false;
            }
            c0Var.h3(eVar, z10, z11);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rectInParent");
    }

    private final void n2(C4498c0 c0Var, C5665e eVar, boolean z10) {
        if (c0Var != this) {
            C4498c0 c0Var2 = this.f6469t;
            if (c0Var2 != null) {
                c0Var2.n2(c0Var, eVar, z10);
            }
            y2(eVar, z10);
        }
    }

    private final long o2(C4498c0 c0Var, long j10, boolean z10) {
        if (c0Var == this) {
            return j10;
        }
        C4498c0 c0Var2 = this.f6469t;
        return (c0Var2 == null || C17542s.e(c0Var, c0Var2)) ? w2(j10, z10) : w2(c0Var2.o2(c0Var, j10, z10), z10);
    }

    /* access modifiers changed from: private */
    public final void r3(d.c cVar, f fVar, long j10, C4517u uVar, boolean z10, boolean z11, float f10) {
        if (cVar == null) {
            S2(fVar, j10, uVar, z10, z11);
            return;
        }
        f fVar2 = fVar;
        if (fVar.c(cVar)) {
            boolean z12 = z11;
            float f11 = f10;
            uVar.H(cVar, f11, z12, new k(this, cVar, fVar, j10, uVar, z10, z12, f11));
            return;
        }
        C4517u uVar2 = uVar;
        r3(C4500d0.b(cVar, fVar.a(), C4502e0.a(2)), fVar, j10, uVar, z10, z11, f10);
    }

    private final C4498c0 s3(C4488v vVar) {
        C4498c0 b10;
        F f10 = vVar instanceof F ? (F) vVar : null;
        if (f10 != null && (b10 = f10.b()) != null) {
            return b10;
        }
        C17542s.h(vVar, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        return (C4498c0) vVar;
    }

    /* access modifiers changed from: private */
    public final void t2(C5732n0 n0Var, C5905c cVar) {
        d.c N22 = N2(C4502e0.a(4));
        if (N22 == null) {
            e3(n0Var, cVar);
            return;
        }
        P1().e0().c(n0Var, s.d(a()), this, N22, cVar);
    }

    public static /* synthetic */ long u3(C4498c0 c0Var, long j10, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                z10 = true;
            }
            return c0Var.t3(j10, z10);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toParentPosition-8S9VItk");
    }

    private final void w3(C4498c0 c0Var, float[] fArr) {
        if (!C17542s.e(c0Var, this)) {
            C4498c0 c0Var2 = this.f6469t;
            C17542s.g(c0Var2);
            c0Var2.w3(c0Var, fArr);
            if (!n.g(v1(), n.f23044b.a())) {
                float[] fArr2 = f6451Q;
                O0.h(fArr2);
                O0.q(fArr2, -((float) n.h(v1())), -((float) n.i(v1())), 0.0f, 4, (Object) null);
                O0.n(fArr, fArr2);
            }
            l0 l0Var = this.f6463J;
            if (l0Var != null) {
                l0Var.h(fArr);
            }
        }
    }

    public static /* synthetic */ long x2(C4498c0 c0Var, long j10, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                z10 = true;
            }
            return c0Var.w2(j10, z10);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fromParentPosition-8S9VItk");
    }

    private final void x3(C4498c0 c0Var, float[] fArr) {
        C4498c0 c0Var2 = this;
        while (!C17542s.e(c0Var2, c0Var)) {
            l0 l0Var = c0Var2.f6463J;
            if (l0Var != null) {
                l0Var.a(fArr);
            }
            long v12 = c0Var2.v1();
            if (!n.g(v12, n.f23044b.a())) {
                float[] fArr2 = f6451Q;
                O0.h(fArr2);
                O0.q(fArr2, (float) n.h(v12), (float) n.i(v12), 0.0f, 4, (Object) null);
                O0.n(fArr, fArr2);
            }
            c0Var2 = c0Var2.f6469t;
            C17542s.g(c0Var2);
        }
    }

    private final void y2(C5665e eVar, boolean z10) {
        float h10 = (float) n.h(v1());
        eVar.i(eVar.b() - h10);
        eVar.j(eVar.c() - h10);
        float i10 = (float) n.i(v1());
        eVar.k(eVar.d() - i10);
        eVar.h(eVar.a() - i10);
        l0 l0Var = this.f6463J;
        if (l0Var != null) {
            l0Var.e(eVar, true);
            if (this.f6471v && z10) {
                eVar.e(0.0f, 0.0f, (float) r.h(a()), (float) r.g(a()));
                eVar.f();
            }
        }
    }

    public static /* synthetic */ void z3(C4498c0 c0Var, C17642l lVar, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            c0Var.y3(lVar, z10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerBlock");
    }

    public final boolean A2() {
        return this.f6467r;
    }

    public final boolean B2() {
        return this.f6462I;
    }

    public final long C2() {
        return D0();
    }

    /* access modifiers changed from: protected */
    public final boolean C3(long j10) {
        if (!C5668h.b(j10)) {
            return false;
        }
        l0 l0Var = this.f6463J;
        return l0Var == null || !this.f6471v || l0Var.d(j10);
    }

    public float D1() {
        return P1().N().D1();
    }

    public final l0 D2() {
        return this.f6463J;
    }

    public long E(C4488v vVar, long j10) {
        return e0(vVar, j10, true);
    }

    public abstract Q E2();

    public final long F2() {
        return this.f6473x.O(P1().t0().e());
    }

    /* access modifiers changed from: protected */
    public final C5665e G2() {
        C5665e eVar = this.f6458E;
        if (eVar != null) {
            return eVar;
        }
        C5665e eVar2 = new C5665e(0.0f, 0.0f, 0.0f, 0.0f);
        this.f6458E = eVar2;
        return eVar2;
    }

    public final C4488v I() {
        if (!c()) {
            D1.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        X2();
        return this.f6469t;
    }

    public abstract d.c I2();

    public final C4498c0 J2() {
        return this.f6468s;
    }

    public long K(long j10) {
        if (!c()) {
            D1.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        C4488v d10 = C4489w.d(this);
        return E(d10, C5667g.q(K.b(P1()).w(j10), C4489w.f(d10)));
    }

    public final C4498c0 K2() {
        return this.f6469t;
    }

    public final float L2() {
        return this.f6457D;
    }

    /* access modifiers changed from: protected */
    public void N0(long j10, float f10, C17642l<? super androidx.compose.ui.graphics.c, C16807N> lVar) {
        if (this.f6466q) {
            Q E22 = E2();
            C17542s.g(E22);
            f3(E22.v1(), f10, lVar, (C5905c) null);
            return;
        }
        f3(j10, f10, lVar, (C5905c) null);
    }

    public final d.c N2(int i10) {
        boolean i11 = f0.i(i10);
        d.c I22 = I2();
        if (!i11 && (I22 = I22.g2()) == null) {
            return null;
        }
        d.c h22 = O2(i11);
        while (h22 != null && (h22.Z1() & i10) != 0) {
            if ((h22.e2() & i10) != 0) {
                return h22;
            }
            if (h22 == I22) {
                return null;
            }
            h22 = h22.a2();
        }
        return null;
    }

    public G P1() {
        return this.f6465p;
    }

    public final void R2(f fVar, long j10, C4517u uVar, boolean z10, boolean z11) {
        long j11 = j10;
        C4517u uVar2 = uVar;
        d.c N22 = N2(fVar.a());
        if (!C3(j10)) {
            if (z10) {
                float q22 = q2(j10, F2());
                if (!Float.isInfinite(q22) && !Float.isNaN(q22) && uVar.E(q22, false)) {
                    Q2(N22, fVar, j10, uVar, z10, false, q22);
                }
            }
        } else if (N22 == null) {
            S2(fVar, j10, uVar, z10, z11);
        } else if (U2(j10)) {
            P2(N22, fVar, j10, uVar, z10, z11);
        } else {
            float q23 = !z10 ? Float.POSITIVE_INFINITY : q2(j10, F2());
            if (Float.isInfinite(q23) || Float.isNaN(q23)) {
                boolean z12 = z11;
            } else if (uVar.E(q23, z11)) {
                Q2(N22, fVar, j10, uVar, z10, z11, q23);
                return;
            }
            r3(N22, fVar, j10, uVar, z10, z11, q23);
        }
    }

    public void S2(f fVar, long j10, C4517u uVar, boolean z10, boolean z11) {
        C4498c0 c0Var = this.f6468s;
        if (c0Var != null) {
            C4498c0 c0Var2 = c0Var;
            c0Var2.R2(fVar, x2(c0Var2, j10, false, 2, (Object) null), uVar, z10, z11);
        }
    }

    /* access modifiers changed from: protected */
    public void T0(long j10, float f10, C5905c cVar) {
        if (this.f6466q) {
            Q E22 = E2();
            C17542s.g(E22);
            f3(E22.v1(), f10, (C17642l<? super androidx.compose.ui.graphics.c, C16807N>) null, cVar);
            return;
        }
        f3(j10, f10, (C17642l<? super androidx.compose.ui.graphics.c, C16807N>) null, cVar);
    }

    public void T2() {
        l0 l0Var = this.f6463J;
        if (l0Var != null) {
            l0Var.invalidate();
            return;
        }
        C4498c0 c0Var = this.f6469t;
        if (c0Var != null) {
            c0Var.T2();
        }
    }

    public void U1() {
        C5905c cVar = this.f6464K;
        if (cVar != null) {
            T0(v1(), this.f6457D, cVar);
        } else {
            N0(v1(), this.f6457D, this.f6472w);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean U2(long j10) {
        float m10 = C5667g.m(j10);
        float n10 = C5667g.n(j10);
        return m10 >= 0.0f && n10 >= 0.0f && m10 < ((float) C0()) && n10 < ((float) z());
    }

    public final boolean V2() {
        if (this.f6463J != null && this.f6475z <= 0.0f) {
            return true;
        }
        C4498c0 c0Var = this.f6469t;
        if (c0Var != null) {
            return c0Var.V2();
        }
        return false;
    }

    public final void X2() {
        P1().X().S();
    }

    public long Y(long j10) {
        return K.b(P1()).b(p0(j10));
    }

    public void Y2() {
        l0 l0Var = this.f6463J;
        if (l0Var != null) {
            l0Var.invalidate();
        }
    }

    public final void Z2() {
        y3(this.f6472w, true);
        l0 l0Var = this.f6463J;
        if (l0Var != null) {
            l0Var.invalidate();
        }
    }

    public final long a() {
        return B0();
    }

    /* access modifiers changed from: protected */
    public void a3(int i10, int i11) {
        C4498c0 c0Var;
        l0 l0Var = this.f6463J;
        if (l0Var != null) {
            l0Var.c(s.a(i10, i11));
        } else if (P1().p() && (c0Var = this.f6469t) != null) {
            c0Var.T2();
        }
        W0(s.a(i10, i11));
        if (this.f6472w != null) {
            A3(false);
        }
        int a10 = C4502e0.a(4);
        boolean i12 = f0.i(a10);
        d.c I22 = I2();
        if (i12 || (I22 = I22.g2()) != null) {
            d.c h22 = O2(i12);
            while (h22 != null && (h22.Z1() & a10) != 0) {
                if ((h22.e2() & a10) != 0) {
                    d.c cVar = h22;
                    W0.b bVar = null;
                    while (cVar != null) {
                        if (cVar instanceof r) {
                            ((r) cVar).v1();
                        } else if ((cVar.e2() & a10) != 0 && (cVar instanceof C4510m)) {
                            int i13 = 0;
                            for (d.c D22 = ((C4510m) cVar).D2(); D22 != null; D22 = D22.a2()) {
                                if ((D22.e2() & a10) != 0) {
                                    i13++;
                                    if (i13 == 1) {
                                        cVar = D22;
                                    } else {
                                        if (bVar == null) {
                                            bVar = new W0.b(new d.c[16], 0);
                                        }
                                        if (cVar != null) {
                                            bVar.b(cVar);
                                            cVar = null;
                                        }
                                        bVar.b(D22);
                                    }
                                }
                            }
                            if (i13 == 1) {
                            }
                        }
                        cVar = C4508k.g(bVar);
                    }
                }
                if (h22 == I22) {
                    break;
                }
                h22 = h22.a2();
            }
        }
        m0 p02 = P1().p0();
        if (p02 != null) {
            p02.m(P1());
        }
    }

    public final void b3() {
        d.c cVar;
        if (M2(C4502e0.a(128))) {
            C5342k.a aVar = C5342k.f23395e;
            C5342k d10 = aVar.d();
            C17642l<Object, C16807N> h10 = d10 != null ? d10.h() : null;
            C5342k f10 = aVar.f(d10);
            try {
                int a10 = C4502e0.a(128);
                boolean i10 = f0.i(a10);
                if (i10) {
                    cVar = I2();
                } else {
                    cVar = I2().g2();
                    if (cVar == null) {
                        C16807N n10 = C16807N.f139792a;
                        aVar.n(d10, f10, h10);
                    }
                }
                d.c h22 = O2(i10);
                while (h22 != null && (h22.Z1() & a10) != 0) {
                    if ((h22.e2() & a10) != 0) {
                        W0.b bVar = null;
                        d.c cVar2 = h22;
                        while (cVar2 != null) {
                            if (cVar2 instanceof A) {
                                ((A) cVar2).p(B0());
                            } else if ((cVar2.e2() & a10) != 0 && (cVar2 instanceof C4510m)) {
                                int i11 = 0;
                                for (d.c D22 = ((C4510m) cVar2).D2(); D22 != null; D22 = D22.a2()) {
                                    if ((D22.e2() & a10) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            cVar2 = D22;
                                        } else {
                                            if (bVar == null) {
                                                bVar = new W0.b(new d.c[16], 0);
                                            }
                                            if (cVar2 != null) {
                                                bVar.b(cVar2);
                                                cVar2 = null;
                                            }
                                            bVar.b(D22);
                                        }
                                    }
                                }
                                if (i11 == 1) {
                                }
                            }
                            cVar2 = C4508k.g(bVar);
                        }
                    }
                    if (h22 == cVar) {
                        break;
                    }
                    h22 = h22.a2();
                }
                C16807N n102 = C16807N.f139792a;
                aVar.n(d10, f10, h10);
            } catch (Throwable th2) {
                aVar.n(d10, f10, h10);
                throw th2;
            }
        }
    }

    public boolean c() {
        return I2().j2();
    }

    public void c0(float[] fArr) {
        m0 b10 = K.b(P1());
        x3(s3(C4489w.d(this)), fArr);
        b10.v(fArr);
    }

    public final void c3() {
        int a10 = C4502e0.a(128);
        boolean i10 = f0.i(a10);
        d.c I22 = I2();
        if (i10 || (I22 = I22.g2()) != null) {
            d.c h22 = O2(i10);
            while (h22 != null && (h22.Z1() & a10) != 0) {
                if ((h22.e2() & a10) != 0) {
                    d.c cVar = h22;
                    W0.b bVar = null;
                    while (cVar != null) {
                        if (cVar instanceof A) {
                            ((A) cVar).D(this);
                        } else if ((cVar.e2() & a10) != 0 && (cVar instanceof C4510m)) {
                            int i11 = 0;
                            for (d.c D22 = ((C4510m) cVar).D2(); D22 != null; D22 = D22.a2()) {
                                if ((D22.e2() & a10) != 0) {
                                    i11++;
                                    if (i11 == 1) {
                                        cVar = D22;
                                    } else {
                                        if (bVar == null) {
                                            bVar = new W0.b(new d.c[16], 0);
                                        }
                                        if (cVar != null) {
                                            bVar.b(cVar);
                                            cVar = null;
                                        }
                                        bVar.b(D22);
                                    }
                                }
                            }
                            if (i11 == 1) {
                            }
                        }
                        cVar = C4508k.g(bVar);
                    }
                }
                if (h22 != I22) {
                    h22 = h22.a2();
                } else {
                    return;
                }
            }
        }
    }

    public final void d3() {
        this.f6470u = true;
        this.f6461H.invoke();
        j3();
    }

    public long e0(C4488v vVar, long j10, boolean z10) {
        if (vVar instanceof F) {
            ((F) vVar).b().X2();
            return C5667g.u(vVar.e0(this, C5667g.u(j10), z10));
        }
        C4498c0 s32 = s3(vVar);
        s32.X2();
        C4498c0 v22 = v2(s32);
        while (s32 != v22) {
            j10 = s32.t3(j10, z10);
            s32 = s32.f6469t;
            C17542s.g(s32);
        }
        return o2(v22, j10, z10);
    }

    public void e3(C5732n0 n0Var, C5905c cVar) {
        C4498c0 c0Var = this.f6468s;
        if (c0Var != null) {
            c0Var.r2(n0Var, cVar);
        }
    }

    public boolean f1() {
        return this.f6463J != null && !this.f6470u && P1().c();
    }

    public final void g3(long j10, float f10, C17642l<? super androidx.compose.ui.graphics.c, C16807N> lVar, C5905c cVar) {
        f3(n.l(j10, y0()), f10, lVar, cVar);
    }

    public float getDensity() {
        return P1().N().getDensity();
    }

    public t getLayoutDirection() {
        return P1().getLayoutDirection();
    }

    public Object h() {
        if (!P1().m0().r(C4502e0.a(64))) {
            return null;
        }
        I2();
        O o10 = new O();
        for (d.c p10 = P1().m0().p(); p10 != null; p10 = p10.g2()) {
            if ((C4502e0.a(64) & p10.e2()) != 0) {
                int a10 = C4502e0.a(64);
                W0.b bVar = null;
                d.c cVar = p10;
                while (cVar != null) {
                    if (cVar instanceof p0) {
                        o10.f144348a = ((p0) cVar).K(P1().N(), o10.f144348a);
                    } else if ((cVar.e2() & a10) != 0 && (cVar instanceof C4510m)) {
                        int i10 = 0;
                        for (d.c D22 = ((C4510m) cVar).D2(); D22 != null; D22 = D22.a2()) {
                            if ((D22.e2() & a10) != 0) {
                                i10++;
                                if (i10 == 1) {
                                    cVar = D22;
                                } else {
                                    if (bVar == null) {
                                        bVar = new W0.b(new d.c[16], 0);
                                    }
                                    if (cVar != null) {
                                        bVar.b(cVar);
                                        cVar = null;
                                    }
                                    bVar.b(D22);
                                }
                            }
                        }
                        if (i10 == 1) {
                        }
                    }
                    cVar = C4508k.g(bVar);
                }
            }
        }
        return o10.f144348a;
    }

    public final void h3(C5665e eVar, boolean z10, boolean z11) {
        l0 l0Var = this.f6463J;
        if (l0Var != null) {
            if (this.f6471v) {
                if (z11) {
                    long F22 = F2();
                    float l10 = C5673m.l(F22) / 2.0f;
                    float i10 = C5673m.i(F22) / 2.0f;
                    eVar.e(-l10, -i10, ((float) r.h(a())) + l10, ((float) r.g(a())) + i10);
                } else if (z10) {
                    eVar.e(0.0f, 0.0f, (float) r.h(a()), (float) r.g(a()));
                }
                if (eVar.f()) {
                    return;
                }
            }
            l0Var.e(eVar, false);
        }
        float h10 = (float) n.h(v1());
        eVar.i(eVar.b() + h10);
        eVar.j(eVar.c() + h10);
        float i11 = (float) n.i(v1());
        eVar.k(eVar.d() + i11);
        eVar.h(eVar.a() + i11);
    }

    public final void j3() {
        if (this.f6463J != null) {
            if (this.f6464K != null) {
                this.f6464K = null;
            }
            z3(this, (C17642l) null, false, 2, (Object) null);
            G.v1(P1(), false, 1, (Object) null);
        }
    }

    public final C4488v k0() {
        if (!c()) {
            D1.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        X2();
        return P1().o0().f6469t;
    }

    public final void k3(boolean z10) {
        this.f6467r = z10;
    }

    public final void l3(boolean z10) {
        this.f6466q = z10;
    }

    public C5669i m0(C4488v vVar, boolean z10) {
        if (!c()) {
            D1.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!vVar.c()) {
            D1.a.b("LayoutCoordinates " + vVar + " is not attached!");
        }
        C4498c0 s32 = s3(vVar);
        s32.X2();
        C4498c0 v22 = v2(s32);
        C5665e G22 = G2();
        G22.i(0.0f);
        G22.k(0.0f);
        G22.j((float) r.h(vVar.a()));
        G22.h((float) r.g(vVar.a()));
        while (s32 != v22) {
            i3(s32, G22, z10, false, 4, (Object) null);
            if (G22.f()) {
                return C5669i.f26706e.a();
            }
            s32 = s32.f6469t;
            C17542s.g(s32);
        }
        n2(v22, G22, z10);
        return C5666f.a(G22);
    }

    public P m1() {
        return this.f6468s;
    }

    public void m3(J j10) {
        J j11 = this.f6454A;
        if (j10 != j11) {
            this.f6454A = j10;
            if (!(j11 != null && j10.getWidth() == j11.getWidth() && j10.getHeight() == j11.getHeight())) {
                a3(j10.getWidth(), j10.getHeight());
            }
            Map<C4468a, Integer> map = this.f6455B;
            if (((map != null && !map.isEmpty()) || !j10.w().isEmpty()) && !C17542s.e(j10.w(), this.f6455B)) {
                z2().w().m();
                Map map2 = this.f6455B;
                if (map2 == null) {
                    map2 = new LinkedHashMap();
                    this.f6455B = map2;
                }
                map2.clear();
                map2.putAll(j10.w());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void n3(long j10) {
        this.f6456C = j10;
    }

    public C4488v o1() {
        return this;
    }

    public final void o3(C4498c0 c0Var) {
        this.f6468s = c0Var;
    }

    public long p0(long j10) {
        if (!c()) {
            D1.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        X2();
        long j11 = j10;
        for (C4498c0 c0Var = this; c0Var != null; c0Var = c0Var.f6469t) {
            j11 = u3(c0Var, j11, false, 2, (Object) null);
        }
        return j11;
    }

    public boolean p1() {
        return this.f6454A != null;
    }

    /* access modifiers changed from: protected */
    public final long p2(long j10) {
        return C5674n.a(Math.max(0.0f, (C5673m.l(j10) - ((float) C0())) / 2.0f), Math.max(0.0f, (C5673m.i(j10) - ((float) z())) / 2.0f));
    }

    public final void p3(C4498c0 c0Var) {
        this.f6469t = c0Var;
    }

    /* access modifiers changed from: protected */
    public final float q2(long j10, long j11) {
        if (((float) C0()) >= C5673m.l(j11) && ((float) z()) >= C5673m.i(j11)) {
            return Float.POSITIVE_INFINITY;
        }
        long p22 = p2(j11);
        float l10 = C5673m.l(p22);
        float i10 = C5673m.i(p22);
        long W22 = W2(j10);
        if ((l10 > 0.0f || i10 > 0.0f) && C5667g.m(W22) <= l10 && C5667g.n(W22) <= i10) {
            return C5667g.l(W22);
        }
        return Float.POSITIVE_INFINITY;
    }

    public final boolean q3() {
        d.c O22 = O2(f0.i(C4502e0.a(16)));
        if (O22 != null && O22.j2()) {
            int a10 = C4502e0.a(16);
            if (!O22.E0().j2()) {
                D1.a.b("visitLocalDescendants called on an unattached node");
            }
            d.c E02 = O22.E0();
            if ((E02.Z1() & a10) != 0) {
                while (E02 != null) {
                    if ((E02.e2() & a10) != 0) {
                        d.c cVar = E02;
                        W0.b bVar = null;
                        while (cVar != null) {
                            if (cVar instanceof s0) {
                                if (((s0) cVar).O1()) {
                                    return true;
                                }
                            } else if ((cVar.e2() & a10) != 0 && (cVar instanceof C4510m)) {
                                int i10 = 0;
                                for (d.c D22 = ((C4510m) cVar).D2(); D22 != null; D22 = D22.a2()) {
                                    if ((D22.e2() & a10) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            cVar = D22;
                                        } else {
                                            if (bVar == null) {
                                                bVar = new W0.b(new d.c[16], 0);
                                            }
                                            if (cVar != null) {
                                                bVar.b(cVar);
                                                cVar = null;
                                            }
                                            bVar.b(D22);
                                        }
                                    }
                                }
                                if (i10 == 1) {
                                }
                            }
                            cVar = C4508k.g(bVar);
                        }
                        continue;
                    }
                    E02 = E02.a2();
                }
            }
        }
        return false;
    }

    public void r0(C4488v vVar, float[] fArr) {
        C4498c0 s32 = s3(vVar);
        s32.X2();
        C4498c0 v22 = v2(s32);
        O0.h(fArr);
        s32.x3(v22, fArr);
        w3(v22, fArr);
    }

    public J r1() {
        J j10 = this.f6454A;
        if (j10 != null) {
            return j10;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    public final void r2(C5732n0 n0Var, C5905c cVar) {
        l0 l0Var = this.f6463J;
        if (l0Var != null) {
            l0Var.k(n0Var, cVar);
            return;
        }
        float h10 = (float) n.h(v1());
        float i10 = (float) n.i(v1());
        n0Var.d(h10, i10);
        t2(n0Var, cVar);
        n0Var.d(-h10, -i10);
    }

    public P s1() {
        return this.f6469t;
    }

    /* access modifiers changed from: protected */
    public final void s2(C5732n0 n0Var, S0 s02) {
        n0Var.p(new C5669i(0.5f, 0.5f, ((float) r.h(B0())) - 0.5f, ((float) r.g(B0())) - 0.5f), s02);
    }

    public long t3(long j10, boolean z10) {
        l0 l0Var = this.f6463J;
        if (l0Var != null) {
            j10 = l0Var.b(j10, false);
        }
        return (z10 || !O1()) ? o.c(j10, v1()) : j10;
    }

    public long u(long j10) {
        if (!c()) {
            D1.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return E(C4489w.d(this), K.b(P1()).u(j10));
    }

    public abstract void u2();

    public long v1() {
        return this.f6456C;
    }

    public final C4498c0 v2(C4498c0 c0Var) {
        G P12 = c0Var.P1();
        G P13 = P1();
        if (P12 == P13) {
            d.c I22 = c0Var.I2();
            d.c I23 = I2();
            int a10 = C4502e0.a(2);
            if (!I23.E0().j2()) {
                D1.a.b("visitLocalAncestors called on an unattached node");
            }
            for (d.c g22 = I23.E0().g2(); g22 != null; g22 = g22.g2()) {
                if ((g22.e2() & a10) != 0 && g22 == I22) {
                    return c0Var;
                }
            }
            return this;
        }
        while (P12.O() > P13.O()) {
            P12 = P12.q0();
            C17542s.g(P12);
        }
        while (P13.O() > P12.O()) {
            P13 = P13.q0();
            C17542s.g(P13);
        }
        while (P12 != P13) {
            P12 = P12.q0();
            P13 = P13.q0();
            if (P12 != null) {
                if (P13 == null) {
                }
            }
            throw new IllegalArgumentException("layouts are not part of the same hierarchy");
        }
        return P13 == P1() ? this : P12 == c0Var.P1() ? c0Var : P12.S();
    }

    public final C5669i v3() {
        if (!c()) {
            return C5669i.f26706e.a();
        }
        C4488v d10 = C4489w.d(this);
        C5665e G22 = G2();
        long p22 = p2(F2());
        G22.i(-C5673m.l(p22));
        G22.k(-C5673m.i(p22));
        G22.j(((float) C0()) + C5673m.l(p22));
        G22.h(((float) z()) + C5673m.i(p22));
        C4498c0 c0Var = this;
        while (c0Var != d10) {
            c0Var.h3(G22, false, true);
            if (G22.f()) {
                return C5669i.f26706e.a();
            }
            c0Var = c0Var.f6469t;
            C17542s.g(c0Var);
        }
        return C5666f.a(G22);
    }

    public long w2(long j10, boolean z10) {
        if (z10 || !O1()) {
            j10 = o.b(j10, v1());
        }
        l0 l0Var = this.f6463J;
        return l0Var != null ? l0Var.b(j10, true) : j10;
    }

    public final void y3(C17642l<? super androidx.compose.ui.graphics.c, C16807N> lVar, boolean z10) {
        m0 p02;
        if (!(lVar == null || this.f6464K == null)) {
            D1.a.a("layerBlock can't be provided when explicitLayer is provided");
        }
        G P12 = P1();
        boolean z11 = z10 || this.f6472w != lVar || !C17542s.e(this.f6473x, P12.N()) || this.f6474y != P12.getLayoutDirection();
        this.f6473x = P12.N();
        this.f6474y = P12.getLayoutDirection();
        if (!P12.c() || lVar == null) {
            this.f6472w = null;
            l0 l0Var = this.f6463J;
            if (l0Var != null) {
                l0Var.destroy();
                P12.C1(true);
                this.f6461H.invoke();
                if (c() && (p02 = P12.p0()) != null) {
                    p02.m(P12);
                }
            }
            this.f6463J = null;
            this.f6462I = false;
            return;
        }
        this.f6472w = lVar;
        if (this.f6463J == null) {
            l0 s10 = m0.s(K.b(P12), this.f6460G, this.f6461H, (C5905c) null, 4, (Object) null);
            s10.c(B0());
            s10.i(v1());
            this.f6463J = s10;
            B3(this, false, 1, (Object) null);
            P12.C1(true);
            this.f6461H.invoke();
        } else if (z11) {
            B3(this, false, 1, (Object) null);
        }
    }

    public C4495b z2() {
        return P1().X().r();
    }
}
