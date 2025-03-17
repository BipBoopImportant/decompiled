package G1;

import E1.C4484q;
import E1.C4488v;
import E1.C4492z;
import E1.D;
import E1.H;
import E1.I;
import E1.J;
import E1.K;
import E1.N;
import E1.a0;
import E1.c0;
import E1.r;
import G1.L;
import G1.m0;
import L1.l;
import L1.o;
import U0.C4885k;
import U0.C4912y;
import XH.C16807N;
import XH.C16820k;
import android.view.View;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5100f0;
import androidx.compose.ui.platform.C5143y0;
import androidx.compose.ui.platform.w1;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import c2.C5267b;
import c2.k;
import c2.t;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import nI.C17631a;
import nI.C17642l;
import p1.C5732n0;
import s1.C5905c;

@Metadata(d1 = {"\u0000Æ\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 ¼\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0006\u0001\u0001{B\u001b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0015\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001c\u0010\u0010J\u0017\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000eH\u0002¢\u0006\u0004\b!\u0010\u0010J\u000f\u0010\"\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\"\u0010\u0010J\u000f\u0010#\u001a\u00020\u000eH\u0002¢\u0006\u0004\b#\u0010\u0010J\u000f\u0010$\u001a\u00020\u000eH\u0000¢\u0006\u0004\b$\u0010\u0010J\u0017\u0010'\u001a\n\u0018\u00010%j\u0004\u0018\u0001`&H\u0017¢\u0006\u0004\b'\u0010(J\u001f\u0010+\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\n2\u0006\u0010*\u001a\u00020\u0000H\u0000¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u000eH\u0000¢\u0006\u0004\b-\u0010\u0010J\u001f\u0010/\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\n2\u0006\u0010.\u001a\u00020\nH\u0000¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u000eH\u0000¢\u0006\u0004\b1\u0010\u0010J'\u00104\u001a\u00020\u000e2\u0006\u00102\u001a\u00020\n2\u0006\u00103\u001a\u00020\n2\u0006\u0010.\u001a\u00020\nH\u0000¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u000eH\u0000¢\u0006\u0004\b6\u0010\u0010J\u0017\u00109\u001a\u00020\u000e2\u0006\u00108\u001a\u000207H\u0000¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u000eH\u0000¢\u0006\u0004\b;\u0010\u0010J\u000f\u0010<\u001a\u00020\u0016H\u0016¢\u0006\u0004\b<\u0010=J\u0015\u0010?\u001a\u00020\n2\u0006\u0010>\u001a\u00020\n¢\u0006\u0004\b?\u0010@J\u0015\u0010B\u001a\u00020\n2\u0006\u0010A\u001a\u00020\n¢\u0006\u0004\bB\u0010@J\u0015\u0010C\u001a\u00020\n2\u0006\u0010>\u001a\u00020\n¢\u0006\u0004\bC\u0010@J\u0015\u0010D\u001a\u00020\n2\u0006\u0010A\u001a\u00020\n¢\u0006\u0004\bD\u0010@J\u0015\u0010E\u001a\u00020\n2\u0006\u0010>\u001a\u00020\n¢\u0006\u0004\bE\u0010@J\u0015\u0010F\u001a\u00020\n2\u0006\u0010A\u001a\u00020\n¢\u0006\u0004\bF\u0010@J\u0015\u0010G\u001a\u00020\n2\u0006\u0010>\u001a\u00020\n¢\u0006\u0004\bG\u0010@J\u0015\u0010H\u001a\u00020\n2\u0006\u0010A\u001a\u00020\n¢\u0006\u0004\bH\u0010@J\u000f\u0010I\u001a\u00020\u000eH\u0000¢\u0006\u0004\bI\u0010\u0010J\u000f\u0010J\u001a\u00020\u000eH\u0000¢\u0006\u0004\bJ\u0010\u0010J\u001f\u0010L\u001a\u00020\u000e2\u0006\u00109\u001a\u00020\n2\u0006\u0010K\u001a\u00020\nH\u0000¢\u0006\u0004\bL\u00100J\u000f\u0010M\u001a\u00020\u000eH\u0000¢\u0006\u0004\bM\u0010\u0010J\u000f\u0010N\u001a\u00020\u000eH\u0000¢\u0006\u0004\bN\u0010\u0010J!\u0010S\u001a\u00020\u000e2\u0006\u0010P\u001a\u00020O2\b\u0010R\u001a\u0004\u0018\u00010QH\u0000¢\u0006\u0004\bS\u0010TJ6\u0010[\u001a\u00020\u000e2\u0006\u0010V\u001a\u00020U2\u0006\u0010X\u001a\u00020W2\b\b\u0002\u0010Y\u001a\u00020\b2\b\b\u0002\u0010Z\u001a\u00020\bH\u0000ø\u0001\u0000¢\u0006\u0004\b[\u0010\\J6\u0010^\u001a\u00020\u000e2\u0006\u0010V\u001a\u00020U2\u0006\u0010]\u001a\u00020W2\b\b\u0002\u0010Y\u001a\u00020\b2\b\b\u0002\u0010Z\u001a\u00020\bH\u0000ø\u0001\u0000¢\u0006\u0004\b^\u0010\\J\u0017\u0010`\u001a\u00020\u000e2\u0006\u0010_\u001a\u00020\u0000H\u0000¢\u0006\u0004\b`\u0010\u0014J-\u0010d\u001a\u00020\u000e2\b\b\u0002\u0010a\u001a\u00020\b2\b\b\u0002\u0010b\u001a\u00020\b2\b\b\u0002\u0010c\u001a\u00020\bH\u0000¢\u0006\u0004\bd\u0010eJ-\u0010f\u001a\u00020\u000e2\b\b\u0002\u0010a\u001a\u00020\b2\b\b\u0002\u0010b\u001a\u00020\b2\b\b\u0002\u0010c\u001a\u00020\bH\u0000¢\u0006\u0004\bf\u0010eJ\u000f\u0010g\u001a\u00020\u000eH\u0000¢\u0006\u0004\bg\u0010\u0010J\u000f\u0010h\u001a\u00020\u000eH\u0000¢\u0006\u0004\bh\u0010\u0010J\u0019\u0010i\u001a\u00020\u000e2\b\b\u0002\u0010a\u001a\u00020\bH\u0000¢\u0006\u0004\bi\u0010jJ\u0019\u0010k\u001a\u00020\u000e2\b\b\u0002\u0010a\u001a\u00020\bH\u0000¢\u0006\u0004\bk\u0010jJ\u000f\u0010l\u001a\u00020\u000eH\u0000¢\u0006\u0004\bl\u0010\u0010J\u0015\u0010o\u001a\b\u0012\u0004\u0012\u00020n0mH\u0016¢\u0006\u0004\bo\u0010pJ\u000f\u0010q\u001a\u00020\u000eH\u0000¢\u0006\u0004\bq\u0010\u0010J\u001e\u0010t\u001a\u00020\b2\n\b\u0002\u0010s\u001a\u0004\u0018\u00010rH\u0000ø\u0001\u0000¢\u0006\u0004\bt\u0010uJ\u001e\u0010v\u001a\u00020\b2\n\b\u0002\u0010s\u001a\u0004\u0018\u00010rH\u0000ø\u0001\u0000¢\u0006\u0004\bv\u0010uJ\u000f\u0010w\u001a\u00020\u000eH\u0000¢\u0006\u0004\bw\u0010\u0010J\u000f\u0010x\u001a\u00020\u000eH\u0000¢\u0006\u0004\bx\u0010\u0010J\u000f\u0010y\u001a\u00020\u000eH\u0000¢\u0006\u0004\by\u0010\u0010J\u000f\u0010z\u001a\u00020\u000eH\u0000¢\u0006\u0004\bz\u0010\u0010J\u000f\u0010{\u001a\u00020\u000eH\u0016¢\u0006\u0004\b{\u0010\u0010J\u000f\u0010|\u001a\u00020\u000eH\u0016¢\u0006\u0004\b|\u0010\u0010J\u000f\u0010K\u001a\u00020\u000eH\u0000¢\u0006\u0004\bK\u0010\u0010J\u000f\u0010}\u001a\u00020\u000eH\u0000¢\u0006\u0004\b}\u0010\u0010J\u000f\u0010~\u001a\u00020\u000eH\u0016¢\u0006\u0004\b~\u0010\u0010J\u000f\u0010\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010J\u0011\u0010\u0001\u001a\u00020\u000eH\u0016¢\u0006\u0005\b\u0001\u0010\u0010R\u0016\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R(\u0010\u000b\u001a\u00020\n8\u0016@\u0016X\u000e¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R9\u0010\u0001\u001a\u00020\n2\u0007\u0010\u0001\u001a\u00020\n8W@WX\u000e¢\u0006\u001f\n\u0006\b\u0001\u0010\u0001\u0012\u0005\b\u0001\u0010\u0010\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R(\u0010\u0001\u001a\u00020\b8\u0000@\u0000X\u000e¢\u0006\u0017\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0005\b\u0001\u0010jR5\u0010\u0001\u001a\u0004\u0018\u00010\u00002\t\u0010\u0001\u001a\u0004\u0018\u00010\u00008\u0000@BX\u000e¢\u0006\u0017\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0005\b\u0001\u0010\u0014R\u0018\u0010\u0001\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0010\u0001R\u001d\u0010\u0001\u001a\t\u0012\u0004\u0012\u00020\u00000\u00018\u0002X\u0004¢\u0006\u0007\n\u0005\b{\u0010\u0001R\"\u0010 \u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0018\u0010¡\u0001\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b|\u0010\u0001R\u001b\u0010£\u0001\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b¢\u0001\u0010\u0001R-\u00108\u001a\u0004\u0018\u0001072\t\u0010\u0001\u001a\u0004\u0018\u0001078\u0000@BX\u000e¢\u0006\u0010\n\u0006\b¤\u0001\u0010¥\u0001\u001a\u0006\b¦\u0001\u0010§\u0001R2\u0010¯\u0001\u001a\f\u0018\u00010¨\u0001j\u0005\u0018\u0001`©\u00018\u0000@\u0000X\u000e¢\u0006\u0017\n\u0005\b~\u0010ª\u0001\u001a\u0006\b«\u0001\u0010¬\u0001\"\u0006\b­\u0001\u0010®\u0001R(\u0010\u0015\u001a\u00020\n8\u0000@\u0000X\u000e¢\u0006\u0018\n\u0006\b°\u0001\u0010\u0001\u001a\u0006\b±\u0001\u0010\u0001\"\u0006\b²\u0001\u0010\u0001R\u0019\u0010´\u0001\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b³\u0001\u0010\u0001R\u001c\u0010¸\u0001\u001a\u0005\u0018\u00010µ\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b¶\u0001\u0010·\u0001R\u001e\u0010º\u0001\u001a\t\u0012\u0004\u0012\u00020\u00000\u00018\u0002X\u0004¢\u0006\b\n\u0006\b¹\u0001\u0010\u0001R\u0019\u0010»\u0001\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R3\u0010Â\u0001\u001a\u00030¼\u00012\b\u0010½\u0001\u001a\u00030¼\u00018\u0016@VX\u000e¢\u0006\u0017\n\u0005\bo\u0010¾\u0001\u001a\u0006\b¿\u0001\u0010À\u0001\"\u0006\b°\u0001\u0010Á\u0001R\u001b\u0010Å\u0001\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÃ\u0001\u0010Ä\u0001R4\u0010Ì\u0001\u001a\u00030Æ\u00012\b\u0010½\u0001\u001a\u00030Æ\u00018\u0016@VX\u000e¢\u0006\u0018\n\u0006\bÇ\u0001\u0010È\u0001\u001a\u0006\bÉ\u0001\u0010Ê\u0001\"\u0006\b\u0001\u0010Ë\u0001R4\u0010Ó\u0001\u001a\u00030Í\u00012\b\u0010½\u0001\u001a\u00030Í\u00018\u0016@VX\u000e¢\u0006\u0018\n\u0006\bÎ\u0001\u0010Ï\u0001\u001a\u0006\bÐ\u0001\u0010Ñ\u0001\"\u0006\b\u0001\u0010Ò\u0001R4\u0010Ú\u0001\u001a\u00030Ô\u00012\b\u0010½\u0001\u001a\u00030Ô\u00018\u0016@VX\u000e¢\u0006\u0018\n\u0006\bÕ\u0001\u0010Ö\u0001\u001a\u0006\b×\u0001\u0010Ø\u0001\"\u0006\b\u0001\u0010Ù\u0001R3\u0010à\u0001\u001a\u00030Û\u00012\b\u0010½\u0001\u001a\u00030Û\u00018\u0016@VX\u000e¢\u0006\u0017\n\u0005\b\u001f\u0010Ü\u0001\u001a\u0006\bÝ\u0001\u0010Þ\u0001\"\u0006\b¤\u0001\u0010ß\u0001R)\u0010ç\u0001\u001a\u00030á\u00018\u0000@\u0000X\u000e¢\u0006\u0017\n\u0005\b9\u0010â\u0001\u001a\u0006\bã\u0001\u0010ä\u0001\"\u0006\bå\u0001\u0010æ\u0001R\u0019\u0010è\u0001\u001a\u00030á\u00018\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\bK\u0010â\u0001R.\u0010ì\u0001\u001a\u00020\b8\u0000@\u0000X\u000e¢\u0006\u001d\n\u0005\b#\u0010\u0001\u0012\u0005\bë\u0001\u0010\u0010\u001a\u0006\bé\u0001\u0010\u0001\"\u0005\bê\u0001\u0010jR\u001f\u0010ñ\u0001\u001a\u00030í\u00018\u0000X\u0004¢\u0006\u000f\n\u0005\b\u0017\u0010î\u0001\u001a\u0006\bï\u0001\u0010ð\u0001R \u0010÷\u0001\u001a\u00030ò\u00018\u0000X\u0004¢\u0006\u0010\n\u0006\bó\u0001\u0010ô\u0001\u001a\u0006\bõ\u0001\u0010ö\u0001R+\u0010þ\u0001\u001a\u0005\u0018\u00010ø\u00018\u0000@\u0000X\u000e¢\u0006\u0017\n\u0005\b;\u0010ù\u0001\u001a\u0006\bú\u0001\u0010û\u0001\"\u0006\bü\u0001\u0010ý\u0001R\u001b\u0010\u0002\u001a\u0005\u0018\u00010ÿ\u00018\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\bl\u0010\u0002R'\u0010\u0002\u001a\u00020\b8\u0000@\u0000X\u000e¢\u0006\u0016\n\u0005\bS\u0010\u0001\u001a\u0006\b\u0002\u0010\u0001\"\u0005\b\u0002\u0010jR\u0019\u0010\u0002\u001a\u00020\u001d8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0002\u0010\u0002R\u001b\u0010\u0002\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0002\u0010\u0002R8\u0010\u0002\u001a\u0011\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00028\u0000@\u0000X\u000e¢\u0006\u0018\n\u0006\bé\u0001\u0010\u0002\u001a\u0006\b\u0002\u0010\u0002\"\u0006\b\u0002\u0010\u0002R8\u0010\u0002\u001a\u0011\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00028\u0000@\u0000X\u000e¢\u0006\u0018\n\u0006\b\u0001\u0010\u0002\u001a\u0006\b\u0002\u0010\u0002\"\u0006\b\u0002\u0010\u0002R(\u0010\u0002\u001a\u00020\b8\u0000@\u0000X\u000e¢\u0006\u0017\n\u0006\b\u0002\u0010\u0001\u001a\u0006\b\u0002\u0010\u0001\"\u0005\b\u0002\u0010jR*\u0010\u0002\u001a\u00020\b2\u0007\u0010\u0001\u001a\u00020\b8\u0016@RX\u000e¢\u0006\u0010\n\u0006\b\u0002\u0010\u0001\u001a\u0006\b\u0002\u0010\u0001R\u0018\u0010\u0002\u001a\u00030\u00028BX\u0004¢\u0006\b\u001a\u0006\b\u0002\u0010\u0002R\u001a\u0010¡\u0002\u001a\u0005\u0018\u00010ÿ\u00018BX\u0004¢\u0006\b\u001a\u0006\b\u0002\u0010 \u0002R\u0016\u0010¤\u0002\u001a\u0004\u0018\u00010\b8F¢\u0006\b\u001a\u0006\b¢\u0002\u0010£\u0002R\u001c\u0010¦\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000m8@X\u0004¢\u0006\u0007\u001a\u0005\b¥\u0002\u0010pR\u001d\u0010¨\u0002\u001a\t\u0012\u0005\u0012\u00030§\u00020m8@X\u0004¢\u0006\u0007\u001a\u0005\b\u0002\u0010pR\u001d\u0010©\u0002\u001a\t\u0012\u0005\u0012\u00030§\u00020m8@X\u0004¢\u0006\u0007\u001a\u0005\b\u0001\u0010pR\u001e\u0010¬\u0002\u001a\t\u0012\u0004\u0012\u00020\u00000\u00018@X\u0004¢\u0006\b\u001a\u0006\bª\u0002\u0010«\u0002R\u001c\u0010­\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000m8@X\u0004¢\u0006\u0007\u001a\u0005\b\u0002\u0010pR\u0019\u0010¯\u0002\u001a\u0004\u0018\u00010\u00008@X\u0004¢\u0006\b\u001a\u0006\b®\u0002\u0010\u0001R\u0017\u0010°\u0002\u001a\u00020\b8VX\u0004¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001R\u0018\u0010³\u0002\u001a\u00030±\u00028@X\u0004¢\u0006\b\u001a\u0006\b\u0001\u0010²\u0002R\u001f\u0010·\u0002\u001a\n\u0018\u00010´\u0002R\u00030ò\u00018@X\u0004¢\u0006\b\u001a\u0006\bµ\u0002\u0010¶\u0002R\u001d\u0010»\u0002\u001a\b0¸\u0002R\u00030ò\u00018@X\u0004¢\u0006\b\u001a\u0006\b¹\u0002\u0010º\u0002R\u001a\u0010¾\u0002\u001a\u0005\u0018\u00010µ\u00018@X\u0004¢\u0006\b\u001a\u0006\b¼\u0002\u0010½\u0002R%\u0010Á\u0002\u001a\t\u0012\u0004\u0012\u00020\u00000\u00018@X\u0004¢\u0006\u000f\u0012\u0005\bÀ\u0002\u0010\u0010\u001a\u0006\b¿\u0002\u0010«\u0002R\u0017\u0010Ã\u0002\u001a\u00020\b8VX\u0004¢\u0006\b\u001a\u0006\bÂ\u0002\u0010\u0001R\u0017\u0010Å\u0002\u001a\u00020\b8@X\u0004¢\u0006\b\u001a\u0006\bÄ\u0002\u0010\u0001R\u0016\u0010A\u001a\u00020\n8VX\u0004¢\u0006\b\u001a\u0006\bÆ\u0002\u0010\u0001R\u0016\u0010>\u001a\u00020\n8VX\u0004¢\u0006\b\u001a\u0006\bÇ\u0002\u0010\u0001R\u0017\u0010È\u0002\u001a\u00020\b8@X\u0004¢\u0006\b\u001a\u0006\b\u0002\u0010\u0001R\u0018\u0010Ì\u0002\u001a\u00030É\u00028@X\u0004¢\u0006\b\u001a\u0006\bÊ\u0002\u0010Ë\u0002R\u0017\u0010Í\u0002\u001a\u00020\b8VX\u0004¢\u0006\b\u001a\u0006\b¹\u0001\u0010\u0001R\u0014\u0010Ï\u0002\u001a\u00020\b8F¢\u0006\b\u001a\u0006\bÎ\u0002\u0010\u0001R\u0017\u0010Ñ\u0002\u001a\u00020\n8@X\u0004¢\u0006\b\u001a\u0006\bÐ\u0002\u0010\u0001R\u0018\u0010Ó\u0002\u001a\u00030á\u00018@X\u0004¢\u0006\b\u001a\u0006\bÒ\u0002\u0010ä\u0001R\u0018\u0010Õ\u0002\u001a\u00030á\u00018@X\u0004¢\u0006\b\u001a\u0006\bÔ\u0002\u0010ä\u0001R\u0018\u0010×\u0002\u001a\u00030ÿ\u00018@X\u0004¢\u0006\b\u001a\u0006\bÖ\u0002\u0010 \u0002R\u0018\u0010Ù\u0002\u001a\u00030ÿ\u00018@X\u0004¢\u0006\b\u001a\u0006\bØ\u0002\u0010 \u0002R\u0017\u0010Ú\u0002\u001a\u00020\b8@X\u0004¢\u0006\b\u001a\u0006\b\u0002\u0010\u0001R(\u0010\u001e\u001a\u00020\u001d2\u0007\u0010½\u0001\u001a\u00020\u001d8V@VX\u000e¢\u0006\u000f\u001a\u0006\bÛ\u0002\u0010Ü\u0002\"\u0005\b¢\u0001\u0010 R\u0018\u0010ß\u0002\u001a\u00030Ý\u00028VX\u0004¢\u0006\b\u001a\u0006\bÃ\u0001\u0010Þ\u0002R\u0017\u0010á\u0002\u001a\u00020\b8@X\u0004¢\u0006\b\u001a\u0006\bà\u0002\u0010\u0001R\u0017\u0010ã\u0002\u001a\u00020\b8@X\u0004¢\u0006\b\u001a\u0006\bâ\u0002\u0010\u0001R\u0017\u0010å\u0002\u001a\u00020\b8@X\u0004¢\u0006\b\u001a\u0006\bä\u0002\u0010\u0001R\u0017\u0010ç\u0002\u001a\u00020\b8@X\u0004¢\u0006\b\u001a\u0006\bæ\u0002\u0010\u0001\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006è\u0002"}, d2 = {"LG1/G;", "LU0/k;", "LE1/c0;", "LG1/n0;", "LE1/z;", "LG1/g;", "", "LG1/m0$b;", "", "isVirtual", "", "semanticsId", "<init>", "(ZI)V", "LXH/N;", "k1", "()V", "K0", "child", "g1", "(LG1/G;)V", "depth", "", "A", "(I)Ljava/lang/String;", "LG1/y;", "n0", "()LG1/y;", "h1", "Landroidx/compose/ui/d;", "modifier", "w", "(Landroidx/compose/ui/d;)V", "z1", "D0", "z", "L1", "Landroid/view/View;", "Landroidx/compose/ui/viewinterop/InteropView;", "U", "()Landroid/view/View;", "index", "instance", "C0", "(ILG1/G;)V", "i1", "count", "o1", "(II)V", "n1", "from", "to", "e1", "(III)V", "J0", "LG1/m0;", "owner", "x", "(LG1/m0;)V", "C", "toString", "()Ljava/lang/String;", "height", "d1", "(I)I", "width", "c1", "Z0", "Y0", "b1", "a1", "X0", "W0", "E0", "I0", "y", "j1", "p1", "R0", "Lp1/n0;", "canvas", "Ls1/c;", "graphicsLayer", "E", "(Lp1/n0;Ls1/c;)V", "Lo1/g;", "pointerPosition", "LG1/u;", "hitTestResult", "isTouchEvent", "isInLayer", "y0", "(JLG1/u;ZZ)V", "hitSemanticsEntities", "A0", "it", "y1", "forceRequest", "scheduleMeasureAndLayout", "invalidateIntrinsics", "w1", "(ZZZ)V", "s1", "G0", "H0", "u1", "(Z)V", "q1", "D", "", "LE1/N;", "r", "()Ljava/util/List;", "F0", "Lc2/b;", "constraints", "P0", "(Lc2/b;)Z", "l1", "S0", "V0", "T0", "U0", "g", "i", "A1", "l", "f", "b", "a", "Z", "I", "q", "()I", "J1", "(I)V", "<set-?>", "c", "getCompositeKeyHash", "e", "getCompositeKeyHash$annotations", "compositeKeyHash", "d", "O0", "()Z", "setVirtualLookaheadRoot$ui_release", "isVirtualLookaheadRoot", "newRoot", "LG1/G;", "d0", "()LG1/G;", "F1", "lookaheadRoot", "virtualChildrenCount", "LG1/X;", "LG1/X;", "_foldedChildren", "LW0/b;", "h", "LW0/b;", "_unfoldedChildren", "unfoldedVirtualChildrenListDirty", "j", "_foldedParent", "k", "LG1/m0;", "p0", "()LG1/m0;", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "Landroidx/compose/ui/viewinterop/InteropViewFactoryHolder;", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "V", "()Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "D1", "(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)V", "interopViewFactoryHolder", "m", "O", "setDepth$ui_release", "n", "ignoreRemeasureRequests", "LL1/l;", "o", "LL1/l;", "_collapsedSemantics", "p", "_zSortedChildren", "zSortedChildrenInvalidated", "LE1/I;", "value", "LE1/I;", "h0", "()LE1/I;", "(LE1/I;)V", "measurePolicy", "s", "LG1/y;", "intrinsicsPolicy", "Lc2/d;", "t", "Lc2/d;", "N", "()Lc2/d;", "(Lc2/d;)V", "density", "Lc2/t;", "u", "Lc2/t;", "getLayoutDirection", "()Lc2/t;", "(Lc2/t;)V", "layoutDirection", "Landroidx/compose/ui/platform/w1;", "v", "Landroidx/compose/ui/platform/w1;", "t0", "()Landroidx/compose/ui/platform/w1;", "(Landroidx/compose/ui/platform/w1;)V", "viewConfiguration", "LU0/y;", "LU0/y;", "M", "()LU0/y;", "(LU0/y;)V", "compositionLocalMap", "LG1/G$g;", "LG1/G$g;", "W", "()LG1/G$g;", "E1", "(LG1/G$g;)V", "intrinsicsUsageByParent", "previousIntrinsicsUsageByParent", "H", "B1", "getCanMultiMeasure$ui_release$annotations", "canMultiMeasure", "LG1/a0;", "LG1/a0;", "m0", "()LG1/a0;", "nodes", "LG1/L;", "B", "LG1/L;", "X", "()LG1/L;", "layoutDelegate", "LE1/D;", "LE1/D;", "s0", "()LE1/D;", "K1", "(LE1/D;)V", "subcompositionsState", "LG1/c0;", "LG1/c0;", "_innerLayerCoordinator", "getInnerLayerCoordinatorIsDirty$ui_release", "C1", "innerLayerCoordinatorIsDirty", "F", "Landroidx/compose/ui/d;", "_modifier", "G", "pendingModifier", "Lkotlin/Function1;", "LnI/l;", "getOnAttach$ui_release", "()LnI/l;", "H1", "(LnI/l;)V", "onAttach", "getOnDetach$ui_release", "I1", "onDetach", "J", "l0", "G1", "needsOnPositionedDispatch", "K", "L0", "isDeactivated", "", "v0", "()F", "zIndex", "T", "()LG1/c0;", "innerLayerCoordinator", "N0", "()Ljava/lang/Boolean;", "isPlacedInLookahead", "P", "foldedChildren", "LE1/H;", "childMeasurables", "childLookaheadMeasurables", "x0", "()LW0/b;", "_children", "children", "q0", "parent", "isAttached", "LG1/G$e;", "()LG1/G$e;", "layoutState", "LG1/L$a;", "c0", "()LG1/L$a;", "lookaheadPassDelegate", "LG1/L$b;", "f0", "()LG1/L$b;", "measurePassDelegate", "L", "()LL1/l;", "collapsedSemantics", "w0", "getZSortedChildren$annotations", "zSortedChildren", "f1", "isValidOwnerScope", "Q", "hasFixedInnerContentConstraints", "u0", "R", "alignmentLinesRequired", "LG1/I;", "e0", "()LG1/I;", "mDrawScope", "isPlaced", "M0", "isPlacedByParent", "r0", "placeOrder", "i0", "measuredByParent", "j0", "measuredByParentInLookahead", "S", "innerCoordinator", "o0", "outerCoordinator", "applyingModifierOnAttach", "k0", "()Landroidx/compose/ui/d;", "LE1/v;", "()LE1/v;", "coordinates", "g0", "measurePending", "Y", "layoutPending", "b0", "lookaheadMeasurePending", "a0", "lookaheadLayoutPending", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class G implements C4885k, c0, n0, C4492z, C4504g, m0.b {

    /* renamed from: L  reason: collision with root package name */
    public static final d f6213L = new d((DefaultConstructorMarker) null);

    /* renamed from: M  reason: collision with root package name */
    public static final int f6214M = 8;

    /* renamed from: N  reason: collision with root package name */
    private static final f f6215N = new c();
    /* access modifiers changed from: private */

    /* renamed from: O  reason: collision with root package name */
    public static final C17631a<G> f6216O = a.f6256c;

    /* renamed from: P  reason: collision with root package name */
    private static final w1 f6217P = new b();
    /* access modifiers changed from: private */

    /* renamed from: Q  reason: collision with root package name */
    public static final Comparator<G> f6218Q = new F();

    /* renamed from: A  reason: collision with root package name */
    private final C4494a0 f6219A;

    /* renamed from: B  reason: collision with root package name */
    private final L f6220B;

    /* renamed from: C  reason: collision with root package name */
    private D f6221C;

    /* renamed from: D  reason: collision with root package name */
    private C4498c0 f6222D;

    /* renamed from: E  reason: collision with root package name */
    private boolean f6223E;

    /* renamed from: F  reason: collision with root package name */
    private androidx.compose.ui.d f6224F;

    /* renamed from: G  reason: collision with root package name */
    private androidx.compose.ui.d f6225G;

    /* renamed from: H  reason: collision with root package name */
    private C17642l<? super m0, C16807N> f6226H;

    /* renamed from: I  reason: collision with root package name */
    private C17642l<? super m0, C16807N> f6227I;

    /* renamed from: J  reason: collision with root package name */
    private boolean f6228J;

    /* renamed from: K  reason: collision with root package name */
    private boolean f6229K;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f6230a;

    /* renamed from: b  reason: collision with root package name */
    private int f6231b;

    /* renamed from: c  reason: collision with root package name */
    private int f6232c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f6233d;

    /* renamed from: e  reason: collision with root package name */
    private G f6234e;

    /* renamed from: f  reason: collision with root package name */
    private int f6235f;

    /* renamed from: g  reason: collision with root package name */
    private final X<G> f6236g;

    /* renamed from: h  reason: collision with root package name */
    private W0.b<G> f6237h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f6238i;

    /* renamed from: j  reason: collision with root package name */
    private G f6239j;

    /* renamed from: k  reason: collision with root package name */
    private m0 f6240k;

    /* renamed from: l  reason: collision with root package name */
    private AndroidViewHolder f6241l;

    /* renamed from: m  reason: collision with root package name */
    private int f6242m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public boolean f6243n;

    /* renamed from: o  reason: collision with root package name */
    private l f6244o;

    /* renamed from: p  reason: collision with root package name */
    private final W0.b<G> f6245p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f6246q;

    /* renamed from: r  reason: collision with root package name */
    private I f6247r;

    /* renamed from: s  reason: collision with root package name */
    private C4521y f6248s;

    /* renamed from: t  reason: collision with root package name */
    private c2.d f6249t;

    /* renamed from: u  reason: collision with root package name */
    private t f6250u;

    /* renamed from: v  reason: collision with root package name */
    private w1 f6251v;

    /* renamed from: w  reason: collision with root package name */
    private C4912y f6252w;

    /* renamed from: x  reason: collision with root package name */
    private g f6253x;

    /* renamed from: y  reason: collision with root package name */
    private g f6254y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f6255z;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LG1/G;", "b", "()LG1/G;"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17631a<G> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f6256c = new a();

        a() {
            super(0);
        }

        /* renamed from: b */
        public final G invoke() {
            return new G(false, 0, 3, (DefaultConstructorMarker) null);
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004R\u0014\u0010\r\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\u000e8VX\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0004\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0011"}, d2 = {"G1/G$b", "Landroidx/compose/ui/platform/w1;", "", "c", "()J", "longPressTimeoutMillis", "a", "doubleTapTimeoutMillis", "b", "doubleTapMinTimeMillis", "", "g", "()F", "touchSlop", "Lc2/k;", "e", "minimumTouchTargetSize", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements w1 {
        b() {
        }

        public long a() {
            return 300;
        }

        public long b() {
            return 40;
        }

        public long c() {
            return 400;
        }

        public long e() {
            return k.f23040b.b();
        }

        public float g() {
            return 16.0f;
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\t\u001a\u00020\b*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"G1/G$c", "LG1/G$f;", "LE1/K;", "", "LE1/H;", "measurables", "Lc2/b;", "constraints", "", "g", "(LE1/K;Ljava/util/List;J)Ljava/lang/Void;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c extends f {
        c() {
            super("Undefined intrinsics block and it is required");
        }

        public Void g(K k10, List<? extends H> list, long j10) {
            throw new IllegalStateException("Undefined measure and it is required");
        }

        public /* bridge */ /* synthetic */ J i(K k10, List list, long j10) {
            return (J) g(k10, list, j10);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n8\u0000X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LG1/G$d;", "", "<init>", "()V", "Lkotlin/Function0;", "LG1/G;", "Constructor", "LnI/a;", "a", "()LnI/a;", "Ljava/util/Comparator;", "ZComparator", "Ljava/util/Comparator;", "b", "()Ljava/util/Comparator;", "LG1/G$f;", "ErrorMeasurePolicy", "LG1/G$f;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d {
        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C17631a<G> a() {
            return G.f6216O;
        }

        public final Comparator<G> b() {
            return G.f6218Q;
        }

        private d() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"LG1/G$e;", "", "<init>", "(Ljava/lang/String;I)V", "Measuring", "LookaheadMeasuring", "LayingOut", "LookaheadLayingOut", "Idle", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum e {
        Measuring,
        LookaheadMeasuring,
        LayingOut,
        LookaheadLayingOut,
        Idle
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\t\b \u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\r\u001a\u00020\f*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0010\u001a\u00020\f*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ)\u0010\u0011\u001a\u00020\f*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ)\u0010\u0012\u001a\u00020\f*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LG1/G$f;", "LE1/I;", "", "error", "<init>", "(Ljava/lang/String;)V", "LE1/r;", "", "LE1/q;", "measurables", "", "height", "", "f", "(LE1/r;Ljava/util/List;I)Ljava/lang/Void;", "width", "e", "c", "b", "a", "Ljava/lang/String;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class f implements I {

        /* renamed from: a  reason: collision with root package name */
        private final String f6257a;

        public f(String str) {
            this.f6257a = str;
        }

        public /* bridge */ /* synthetic */ int a(r rVar, List list, int i10) {
            return ((Number) f(rVar, list, i10)).intValue();
        }

        public Void b(r rVar, List<? extends C4484q> list, int i10) {
            throw new IllegalStateException(this.f6257a.toString());
        }

        public Void c(r rVar, List<? extends C4484q> list, int i10) {
            throw new IllegalStateException(this.f6257a.toString());
        }

        public /* bridge */ /* synthetic */ int d(r rVar, List list, int i10) {
            return ((Number) c(rVar, list, i10)).intValue();
        }

        public Void e(r rVar, List<? extends C4484q> list, int i10) {
            throw new IllegalStateException(this.f6257a.toString());
        }

        public Void f(r rVar, List<? extends C4484q> list, int i10) {
            throw new IllegalStateException(this.f6257a.toString());
        }

        public /* bridge */ /* synthetic */ int h(r rVar, List list, int i10) {
            return ((Number) b(rVar, list, i10)).intValue();
        }

        public /* bridge */ /* synthetic */ int j(r rVar, List list, int i10) {
            return ((Number) e(rVar, list, i10)).intValue();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"LG1/G$g;", "", "<init>", "(Ljava/lang/String;I)V", "InMeasureBlock", "InLayoutBlock", "NotUsed", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum g {
        InMeasureBlock,
        InLayoutBlock,
        NotUsed
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class h {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f6258a;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.Idle.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f6258a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class i extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ G f6259c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(G g10) {
            super(0);
            this.f6259c = g10;
        }

        public final void invoke() {
            this.f6259c.X().N();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class j extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ G f6260c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ O<l> f6261d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(G g10, O<l> o10) {
            super(0);
            this.f6260c = g10;
            this.f6261d = o10;
        }

        public final void invoke() {
            C4494a0 m02 = this.f6260c.m0();
            int a10 = C4502e0.a(8);
            O<l> o10 = this.f6261d;
            if ((m02.i() & a10) != 0) {
                for (d.c p10 = m02.p(); p10 != null; p10 = p10.g2()) {
                    if ((p10.e2() & a10) != 0) {
                        d.c cVar = p10;
                        W0.b bVar = null;
                        while (cVar != null) {
                            if (cVar instanceof w0) {
                                w0 w0Var = (w0) cVar;
                                if (w0Var.k0()) {
                                    T lVar = new l();
                                    o10.f144348a = lVar;
                                    lVar.C(true);
                                }
                                if (w0Var.U1()) {
                                    ((l) o10.f144348a).D(true);
                                }
                                w0Var.m0((l) o10.f144348a);
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
            }
        }
    }

    public G() {
        this(false, 0, 3, (DefaultConstructorMarker) null);
    }

    private final String A(int i10) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("  ");
        }
        sb2.append("|-");
        sb2.append(toString());
        sb2.append(10);
        W0.b<G> x02 = x0();
        int r10 = x02.r();
        if (r10 > 0) {
            Object[] q10 = x02.q();
            int i12 = 0;
            do {
                sb2.append(((G) q10[i12]).A(i10 + 1));
                i12++;
            } while (i12 < r10);
        }
        String sb3 = sb2.toString();
        if (i10 != 0) {
            return sb3;
        }
        String substring = sb3.substring(0, sb3.length() - 1);
        C17542s.i(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    static /* synthetic */ String B(G g10, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return g10.A(i10);
    }

    public static /* synthetic */ void B0(G g10, long j10, C4517u uVar, boolean z10, boolean z11, int i10, Object obj) {
        g10.A0(j10, uVar, (i10 & 4) != 0 ? true : z10, (i10 & 8) != 0 ? true : z11);
    }

    private final void D0() {
        if (this.f6219A.q(C4502e0.a(1024) | C4502e0.a(RecyclerView.n.FLAG_MOVED) | C4502e0.a(RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT))) {
            for (d.c k10 = this.f6219A.k(); k10 != null; k10 = k10.a2()) {
                boolean z10 = false;
                boolean z11 = ((C4502e0.a(1024) & k10.e2()) != 0) | ((C4502e0.a(RecyclerView.n.FLAG_MOVED) & k10.e2()) != 0);
                if ((C4502e0.a(RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) & k10.e2()) != 0) {
                    z10 = true;
                }
                if (z11 || z10) {
                    f0.a(k10);
                }
            }
        }
    }

    private final void F1(G g10) {
        if (!C17542s.e(g10, this.f6234e)) {
            this.f6234e = g10;
            if (g10 != null) {
                this.f6220B.q();
                C4498c0 o02 = o0();
                C4498c0 J22 = S().J2();
                while (!C17542s.e(o02, J22) && o02 != null) {
                    o02.u2();
                    o02 = o02.J2();
                }
            }
            G0();
        }
    }

    private final void K0() {
        G g10;
        if (this.f6235f > 0) {
            this.f6238i = true;
        }
        if (this.f6230a && (g10 = this.f6239j) != null) {
            g10.K0();
        }
    }

    public static /* synthetic */ boolean Q0(G g10, C5267b bVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bVar = g10.f6220B.z();
        }
        return g10.P0(bVar);
    }

    private final C4498c0 T() {
        if (this.f6223E) {
            C4498c0 S10 = S();
            C4498c0 K22 = o0().K2();
            this.f6222D = null;
            while (true) {
                if (C17542s.e(S10, K22)) {
                    break;
                }
                if ((S10 != null ? S10.D2() : null) != null) {
                    this.f6222D = S10;
                    break;
                }
                S10 = S10 != null ? S10.K2() : null;
            }
        }
        C4498c0 c0Var = this.f6222D;
        if (c0Var == null || c0Var.D2() != null) {
            return c0Var;
        }
        D1.a.c("layer was not set");
        throw new C16820k();
    }

    private final void g1(G g10) {
        if (g10.f6220B.s() > 0) {
            L l10 = this.f6220B;
            l10.W(l10.s() - 1);
        }
        if (this.f6240k != null) {
            g10.C();
        }
        g10.f6239j = null;
        g10.o0().p3((C4498c0) null);
        if (g10.f6230a) {
            this.f6235f--;
            W0.b<G> f10 = g10.f6236g.f();
            int r10 = f10.r();
            if (r10 > 0) {
                Object[] q10 = f10.q();
                int i10 = 0;
                do {
                    ((G) q10[i10]).o0().p3((C4498c0) null);
                    i10++;
                } while (i10 < r10);
            }
        }
        K0();
        i1();
    }

    private final void h1() {
        G0();
        G q02 = q0();
        if (q02 != null) {
            q02.E0();
        }
        F0();
    }

    private final void k1() {
        if (this.f6238i) {
            int i10 = 0;
            this.f6238i = false;
            W0.b<G> bVar = this.f6237h;
            if (bVar == null) {
                bVar = new W0.b<>(new G[16], 0);
                this.f6237h = bVar;
            }
            bVar.k();
            W0.b<G> f10 = this.f6236g.f();
            int r10 = f10.r();
            if (r10 > 0) {
                Object[] q10 = f10.q();
                do {
                    G g10 = (G) q10[i10];
                    if (g10.f6230a) {
                        bVar.e(bVar.r(), g10.x0());
                    } else {
                        bVar.b(g10);
                    }
                    i10++;
                } while (i10 < r10);
            }
            this.f6220B.N();
        }
    }

    public static /* synthetic */ boolean m1(G g10, C5267b bVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bVar = g10.f6220B.y();
        }
        return g10.l1(bVar);
    }

    private final C4521y n0() {
        C4521y yVar = this.f6248s;
        if (yVar != null) {
            return yVar;
        }
        C4521y yVar2 = new C4521y(this, h0());
        this.f6248s = yVar2;
        return yVar2;
    }

    /* access modifiers changed from: private */
    public static final int o(G g10, G g11) {
        return g10.v0() == g11.v0() ? C17542s.l(g10.r0(), g11.r0()) : Float.compare(g10.v0(), g11.v0());
    }

    public static /* synthetic */ void r1(G g10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        g10.q1(z10);
    }

    public static /* synthetic */ void t1(G g10, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        if ((i10 & 4) != 0) {
            z12 = true;
        }
        g10.s1(z10, z11, z12);
    }

    private final float v0() {
        return f0().C1();
    }

    public static /* synthetic */ void v1(G g10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        g10.u1(z10);
    }

    private final void w(androidx.compose.ui.d dVar) {
        this.f6224F = dVar;
        this.f6219A.F(dVar);
        this.f6220B.c0();
        if (this.f6234e == null && this.f6219A.r(C4502e0.a(512))) {
            F1(this);
        }
    }

    public static /* synthetic */ void x1(G g10, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        if ((i10 & 4) != 0) {
            z12 = true;
        }
        g10.w1(z10, z11, z12);
    }

    private final void z() {
        this.f6254y = this.f6253x;
        this.f6253x = g.NotUsed;
        W0.b<G> x02 = x0();
        int r10 = x02.r();
        if (r10 > 0) {
            Object[] q10 = x02.q();
            int i10 = 0;
            do {
                G g10 = (G) q10[i10];
                if (g10.f6253x == g.InLayoutBlock) {
                    g10.z();
                }
                i10++;
            } while (i10 < r10);
        }
    }

    public static /* synthetic */ void z0(G g10, long j10, C4517u uVar, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        boolean z12 = z10;
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        g10.y0(j10, uVar, z12, z11);
    }

    private final void z1() {
        this.f6219A.y();
    }

    public final void A0(long j10, C4517u uVar, boolean z10, boolean z11) {
        o0().R2(C4498c0.f6446L.b(), C4498c0.x2(o0(), j10, false, 2, (Object) null), uVar, true, z11);
    }

    public final void A1() {
        W0.b<G> x02 = x0();
        int r10 = x02.r();
        if (r10 > 0) {
            Object[] q10 = x02.q();
            int i10 = 0;
            do {
                G g10 = (G) q10[i10];
                g gVar = g10.f6254y;
                g10.f6253x = gVar;
                if (gVar != g.NotUsed) {
                    g10.A1();
                }
                i10++;
            } while (i10 < r10);
        }
    }

    public final void B1(boolean z10) {
        this.f6255z = z10;
    }

    public final void C() {
        m0 m0Var = this.f6240k;
        String str = null;
        if (m0Var == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot detach node that is already detached!  Tree: ");
            G q02 = q0();
            if (q02 != null) {
                str = B(q02, 0, 1, (Object) null);
            }
            sb2.append(str);
            D1.a.c(sb2.toString());
            throw new C16820k();
        }
        G q03 = q0();
        if (q03 != null) {
            q03.E0();
            q03.G0();
            L.b f02 = f0();
            g gVar = g.NotUsed;
            f02.h2(gVar);
            L.a c02 = c0();
            if (c02 != null) {
                c02.a2(gVar);
            }
        }
        this.f6220B.V();
        C17642l<? super m0, C16807N> lVar = this.f6227I;
        if (lVar != null) {
            lVar.invoke(m0Var);
        }
        if (this.f6219A.r(C4502e0.a(8))) {
            J0();
        }
        this.f6219A.A();
        this.f6243n = true;
        W0.b<G> f10 = this.f6236g.f();
        int r10 = f10.r();
        if (r10 > 0) {
            Object[] q10 = f10.q();
            int i10 = 0;
            do {
                ((G) q10[i10]).C();
                i10++;
            } while (i10 < r10);
        }
        this.f6243n = false;
        this.f6219A.u();
        m0Var.x(this);
        this.f6240k = null;
        F1((G) null);
        this.f6242m = 0;
        f0().a2();
        L.a c03 = c0();
        if (c03 != null) {
            c03.S1();
        }
    }

    public final void C0(int i10, G g10) {
        if (!(g10.f6239j == null)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot insert ");
            sb2.append(g10);
            sb2.append(" because it already has a parent. This tree: ");
            sb2.append(B(this, 0, 1, (Object) null));
            sb2.append(" Other tree: ");
            G g11 = g10.f6239j;
            sb2.append(g11 != null ? B(g11, 0, 1, (Object) null) : null);
            D1.a.b(sb2.toString());
        }
        if (!(g10.f6240k == null)) {
            D1.a.b("Cannot insert " + g10 + " because it already has an owner. This tree: " + B(this, 0, 1, (Object) null) + " Other tree: " + B(g10, 0, 1, (Object) null));
        }
        g10.f6239j = this;
        this.f6236g.a(i10, g10);
        i1();
        if (g10.f6230a) {
            this.f6235f++;
        }
        K0();
        m0 m0Var = this.f6240k;
        if (m0Var != null) {
            g10.x(m0Var);
        }
        if (g10.f6220B.s() > 0) {
            L l10 = this.f6220B;
            l10.W(l10.s() + 1);
        }
    }

    public final void C1(boolean z10) {
        this.f6223E = z10;
    }

    public final void D() {
        if (Z() == e.Idle && !Y() && !g0() && !L0() && p()) {
            C4494a0 a0Var = this.f6219A;
            int a10 = C4502e0.a(256);
            if ((a0Var.i() & a10) != 0) {
                d.c k10 = a0Var.k();
                while (k10 != null) {
                    if ((k10.e2() & a10) != 0) {
                        d.c cVar = k10;
                        W0.b bVar = null;
                        while (cVar != null) {
                            if (cVar instanceof C4516t) {
                                C4516t tVar = (C4516t) cVar;
                                tVar.u(C4508k.h(tVar, C4502e0.a(256)));
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
                    if ((k10.Z1() & a10) != 0) {
                        k10 = k10.a2();
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void D1(AndroidViewHolder androidViewHolder) {
        this.f6241l = androidViewHolder;
    }

    public final void E(C5732n0 n0Var, C5905c cVar) {
        o0().r2(n0Var, cVar);
    }

    public final void E0() {
        C4498c0 T10 = T();
        if (T10 != null) {
            T10.T2();
            return;
        }
        G q02 = q0();
        if (q02 != null) {
            q02.E0();
        }
    }

    public final void E1(g gVar) {
        this.f6253x = gVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0017, code lost:
        r0 = r0.w();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean F() {
        /*
            r3 = this;
            G1.L r0 = r3.f6220B
            G1.b r1 = r0.r()
            G1.a r1 = r1.w()
            boolean r1 = r1.k()
            r2 = 1
            if (r1 != 0) goto L_0x0025
            G1.b r0 = r0.C()
            if (r0 == 0) goto L_0x0024
            G1.a r0 = r0.w()
            if (r0 == 0) goto L_0x0024
            boolean r0 = r0.k()
            if (r0 != r2) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            r2 = 0
        L_0x0025:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: G1.G.F():boolean");
    }

    public final void F0() {
        C4498c0 o02 = o0();
        C4498c0 S10 = S();
        while (o02 != S10) {
            C17542s.h(o02, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            C c10 = (C) o02;
            l0 D22 = c10.D2();
            if (D22 != null) {
                D22.invalidate();
            }
            o02 = c10.J2();
        }
        l0 D23 = S().D2();
        if (D23 != null) {
            D23.invalidate();
        }
    }

    public final boolean G() {
        return this.f6225G != null;
    }

    public final void G0() {
        if (this.f6234e != null) {
            t1(this, false, false, false, 7, (Object) null);
        } else {
            x1(this, false, false, false, 7, (Object) null);
        }
    }

    public final void G1(boolean z10) {
        this.f6228J = z10;
    }

    public final boolean H() {
        return this.f6255z;
    }

    public final void H0() {
        if (!Y() && !g0() && !this.f6228J) {
            K.b(this).p(this);
        }
    }

    public final void H1(C17642l<? super m0, C16807N> lVar) {
        this.f6226H = lVar;
    }

    public final List<H> I() {
        L.a c02 = c0();
        C17542s.g(c02);
        return c02.e1();
    }

    public final void I0() {
        this.f6220B.M();
    }

    public final void I1(C17642l<? super m0, C16807N> lVar) {
        this.f6227I = lVar;
    }

    public final List<H> J() {
        return f0().r1();
    }

    public final void J0() {
        this.f6244o = null;
        K.b(this).B();
    }

    public void J1(int i10) {
        this.f6231b = i10;
    }

    public final List<G> K() {
        return x0().j();
    }

    public final void K1(D d10) {
        this.f6221C = d10;
    }

    public final l L() {
        if (!c() || L0()) {
            return null;
        }
        if (!this.f6219A.r(C4502e0.a(8)) || this.f6244o != null) {
            return this.f6244o;
        }
        O o10 = new O();
        o10.f144348a = new l();
        K.b(this).getSnapshotObserver().j(this, new j(this, o10));
        T t10 = o10.f144348a;
        this.f6244o = (l) t10;
        return (l) t10;
    }

    public boolean L0() {
        return this.f6229K;
    }

    public final void L1() {
        if (this.f6235f > 0) {
            k1();
        }
    }

    public C4912y M() {
        return this.f6252w;
    }

    public final boolean M0() {
        return f0().R1();
    }

    public c2.d N() {
        return this.f6249t;
    }

    public final Boolean N0() {
        L.a c02 = c0();
        if (c02 != null) {
            return Boolean.valueOf(c02.p());
        }
        return null;
    }

    public final int O() {
        return this.f6242m;
    }

    public final boolean O0() {
        return this.f6233d;
    }

    public final List<G> P() {
        return this.f6236g.b();
    }

    public final boolean P0(C5267b bVar) {
        if (bVar == null || this.f6234e == null) {
            return false;
        }
        L.a c02 = c0();
        C17542s.g(c02);
        return c02.X1(bVar.r());
    }

    public final boolean Q() {
        long C22 = S().C2();
        return C5267b.j(C22) && C5267b.i(C22);
    }

    public int R() {
        return this.f6220B.x();
    }

    public final void R0() {
        if (this.f6253x == g.NotUsed) {
            z();
        }
        L.a c02 = c0();
        C17542s.g(c02);
        c02.Y1();
    }

    public final C4498c0 S() {
        return this.f6219A.l();
    }

    public final void S0() {
        this.f6220B.O();
    }

    public final void T0() {
        this.f6220B.P();
    }

    public View U() {
        AndroidViewHolder androidViewHolder = this.f6241l;
        if (androidViewHolder != null) {
            return androidViewHolder.getInteropView();
        }
        return null;
    }

    public final void U0() {
        this.f6220B.Q();
    }

    public final AndroidViewHolder V() {
        return this.f6241l;
    }

    public final void V0() {
        this.f6220B.R();
    }

    public final g W() {
        return this.f6253x;
    }

    public final int W0(int i10) {
        return n0().b(i10);
    }

    public final L X() {
        return this.f6220B;
    }

    public final int X0(int i10) {
        return n0().c(i10);
    }

    public final boolean Y() {
        return this.f6220B.A();
    }

    public final int Y0(int i10) {
        return n0().d(i10);
    }

    public final e Z() {
        return this.f6220B.B();
    }

    public final int Z0(int i10) {
        return n0().e(i10);
    }

    public void a(c2.d dVar) {
        if (!C17542s.e(this.f6249t, dVar)) {
            this.f6249t = dVar;
            h1();
            for (d.c k10 = this.f6219A.k(); k10 != null; k10 = k10.a2()) {
                if ((C4502e0.a(16) & k10.e2()) != 0) {
                    ((s0) k10).z1();
                } else if (k10 instanceof m1.c) {
                    ((m1.c) k10).d1();
                }
            }
        }
    }

    public final boolean a0() {
        return this.f6220B.F();
    }

    public final int a1(int i10) {
        return n0().f(i10);
    }

    public void b() {
        AndroidViewHolder androidViewHolder = this.f6241l;
        if (androidViewHolder != null) {
            androidViewHolder.b();
        }
        D d10 = this.f6221C;
        if (d10 != null) {
            d10.b();
        }
        C4498c0 o02 = o0();
        C4498c0 J22 = S().J2();
        while (!C17542s.e(o02, J22) && o02 != null) {
            o02.d3();
            o02 = o02.J2();
        }
    }

    public final boolean b0() {
        return this.f6220B.G();
    }

    public final int b1(int i10) {
        return n0().g(i10);
    }

    public boolean c() {
        return this.f6240k != null;
    }

    public final L.a c0() {
        return this.f6220B.H();
    }

    public final int c1(int i10) {
        return n0().h(i10);
    }

    public void d(t tVar) {
        if (this.f6250u != tVar) {
            this.f6250u = tVar;
            h1();
            C4494a0 a0Var = this.f6219A;
            int a10 = C4502e0.a(4);
            if ((a0Var.i() & a10) != 0) {
                d.c k10 = a0Var.k();
                while (k10 != null) {
                    if ((k10.e2() & a10) != 0) {
                        d.c cVar = k10;
                        W0.b bVar = null;
                        while (cVar != null) {
                            if (cVar instanceof r) {
                                r rVar = (r) cVar;
                                if (rVar instanceof m1.c) {
                                    ((m1.c) rVar).d1();
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
                    }
                    if ((k10.Z1() & a10) != 0) {
                        k10 = k10.a2();
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final G d0() {
        return this.f6234e;
    }

    public final int d1(int i10) {
        return n0().i(i10);
    }

    public void e(int i10) {
        this.f6232c = i10;
    }

    public final I e0() {
        return K.b(this).getSharedDrawScope();
    }

    public final void e1(int i10, int i11, int i12) {
        if (i10 != i11) {
            for (int i13 = 0; i13 < i12; i13++) {
                this.f6236g.a(i10 > i11 ? i11 + i13 : (i11 + i12) - 2, this.f6236g.g(i10 > i11 ? i10 + i13 : i10));
            }
            i1();
            K0();
            G0();
        }
    }

    public void f() {
        AndroidViewHolder androidViewHolder = this.f6241l;
        if (androidViewHolder != null) {
            androidViewHolder.f();
        }
        D d10 = this.f6221C;
        if (d10 != null) {
            d10.f();
        }
        this.f6229K = true;
        z1();
        if (c()) {
            J0();
        }
    }

    public final L.b f0() {
        return this.f6220B.I();
    }

    public boolean f1() {
        return c();
    }

    public void g() {
        if (this.f6234e != null) {
            t1(this, false, false, false, 5, (Object) null);
        } else {
            x1(this, false, false, false, 5, (Object) null);
        }
        C5267b y10 = this.f6220B.y();
        if (y10 != null) {
            m0 m0Var = this.f6240k;
            if (m0Var != null) {
                m0Var.D(this, y10.r());
                return;
            }
            return;
        }
        m0 m0Var2 = this.f6240k;
        if (m0Var2 != null) {
            m0.k(m0Var2, false, 1, (Object) null);
        }
    }

    public final boolean g0() {
        return this.f6220B.J();
    }

    public t getLayoutDirection() {
        return this.f6250u;
    }

    public void h(w1 w1Var) {
        if (!C17542s.e(this.f6251v, w1Var)) {
            this.f6251v = w1Var;
            C4494a0 a0Var = this.f6219A;
            int a10 = C4502e0.a(16);
            if ((a0Var.i() & a10) != 0) {
                d.c k10 = a0Var.k();
                while (k10 != null) {
                    if ((k10.e2() & a10) != 0) {
                        d.c cVar = k10;
                        W0.b bVar = null;
                        while (cVar != null) {
                            if (cVar instanceof s0) {
                                ((s0) cVar).R1();
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
                    if ((k10.Z1() & a10) != 0) {
                        k10 = k10.a2();
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public I h0() {
        return this.f6247r;
    }

    public void i() {
        C4498c0 S10 = S();
        int a10 = C4502e0.a(128);
        boolean i10 = f0.i(a10);
        d.c I22 = S10.I2();
        if (i10 || (I22 = I22.g2()) != null) {
            d.c h22 = S10.O2(i10);
            while (h22 != null && (h22.Z1() & a10) != 0) {
                if ((h22.e2() & a10) != 0) {
                    d.c cVar = h22;
                    W0.b bVar = null;
                    while (cVar != null) {
                        if (cVar instanceof A) {
                            ((A) cVar).D(S());
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

    public final g i0() {
        return f0().v1();
    }

    public final void i1() {
        if (this.f6230a) {
            G q02 = q0();
            if (q02 != null) {
                q02.i1();
                return;
            }
            return;
        }
        this.f6246q = true;
    }

    public void j(androidx.compose.ui.d dVar) {
        if (!(!this.f6230a || k0() == androidx.compose.ui.d.f18749a)) {
            D1.a.a("Modifiers are not supported on virtual LayoutNodes");
        }
        if (L0()) {
            D1.a.a("modifier is updated when deactivated");
        }
        if (c()) {
            w(dVar);
        } else {
            this.f6225G = dVar;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.r1();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final G1.G.g j0() {
        /*
            r1 = this;
            G1.L$a r0 = r1.c0()
            if (r0 == 0) goto L_0x000c
            G1.G$g r0 = r0.r1()
            if (r0 != 0) goto L_0x000e
        L_0x000c:
            G1.G$g r0 = G1.G.g.NotUsed
        L_0x000e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: G1.G.j0():G1.G$g");
    }

    public final void j1(int i10, int i11) {
        a0.a placementScope;
        C4498c0 S10;
        if (this.f6253x == g.NotUsed) {
            z();
        }
        G q02 = q0();
        if (q02 == null || (S10 = q02.S()) == null || (placementScope = S10.u1()) == null) {
            placementScope = K.b(this).getPlacementScope();
        }
        a0.a.m(placementScope, f0(), i10, i11, 0.0f, 4, (Object) null);
    }

    public void k(C4912y yVar) {
        this.f6252w = yVar;
        a((c2.d) yVar.b(C5100f0.e()));
        d((t) yVar.b(C5100f0.k()));
        h((w1) yVar.b(C5100f0.r()));
        C4494a0 a0Var = this.f6219A;
        int a10 = C4502e0.a(32768);
        if ((a0Var.i() & a10) != 0) {
            d.c k10 = a0Var.k();
            while (k10 != null) {
                if ((k10.e2() & a10) != 0) {
                    d.c cVar = k10;
                    W0.b bVar = null;
                    while (cVar != null) {
                        if (cVar instanceof C4505h) {
                            d.c E02 = ((C4505h) cVar).E0();
                            if (E02.j2()) {
                                f0.e(E02);
                            } else {
                                E02.z2(true);
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
                }
                if ((k10.Z1() & a10) != 0) {
                    k10 = k10.a2();
                } else {
                    return;
                }
            }
        }
    }

    public androidx.compose.ui.d k0() {
        return this.f6224F;
    }

    public void l() {
        if (!c()) {
            D1.a.a("onReuse is only expected on attached node");
        }
        AndroidViewHolder androidViewHolder = this.f6241l;
        if (androidViewHolder != null) {
            androidViewHolder.l();
        }
        D d10 = this.f6221C;
        if (d10 != null) {
            d10.l();
        }
        if (L0()) {
            this.f6229K = false;
            J0();
        } else {
            z1();
        }
        J1(o.b());
        this.f6219A.t();
        this.f6219A.z();
        y1(this);
    }

    public final boolean l0() {
        return this.f6228J;
    }

    public final boolean l1(C5267b bVar) {
        if (bVar == null) {
            return false;
        }
        if (this.f6253x == g.NotUsed) {
            y();
        }
        return f0().e2(bVar.r());
    }

    public void m(I i10) {
        if (!C17542s.e(this.f6247r, i10)) {
            this.f6247r = i10;
            C4521y yVar = this.f6248s;
            if (yVar != null) {
                yVar.k(h0());
            }
            G0();
        }
    }

    public final C4494a0 m0() {
        return this.f6219A;
    }

    public final void n1() {
        int e10 = this.f6236g.e();
        while (true) {
            e10--;
            if (-1 < e10) {
                g1(this.f6236g.d(e10));
            } else {
                this.f6236g.c();
                return;
            }
        }
    }

    public final C4498c0 o0() {
        return this.f6219A.o();
    }

    public final void o1(int i10, int i11) {
        if (!(i11 >= 0)) {
            D1.a.a("count (" + i11 + ") must be greater than 0");
        }
        int i12 = (i11 + i10) - 1;
        if (i10 <= i12) {
            while (true) {
                g1(this.f6236g.d(i12));
                G g10 = this.f6236g.g(i12);
                if (i12 != i10) {
                    i12--;
                } else {
                    return;
                }
            }
        }
    }

    public boolean p() {
        return f0().p();
    }

    public final m0 p0() {
        return this.f6240k;
    }

    public final void p1() {
        if (this.f6253x == g.NotUsed) {
            z();
        }
        f0().f2();
    }

    public int q() {
        return this.f6231b;
    }

    public final G q0() {
        G g10 = this.f6239j;
        while (g10 != null && g10.f6230a) {
            g10 = g10.f6239j;
        }
        return g10;
    }

    public final void q1(boolean z10) {
        m0 m0Var;
        if (!this.f6230a && (m0Var = this.f6240k) != null) {
            m0Var.t(this, true, z10);
        }
    }

    public List<N> r() {
        return this.f6219A.n();
    }

    public final int r0() {
        return f0().z1();
    }

    public C4488v s() {
        return S();
    }

    public final D s0() {
        return this.f6221C;
    }

    public final void s1(boolean z10, boolean z11, boolean z12) {
        if (!(this.f6234e != null)) {
            D1.a.b("Lookahead measure cannot be requested on a node that is not a part of theLookaheadScope");
        }
        m0 m0Var = this.f6240k;
        if (m0Var != null && !this.f6243n && !this.f6230a) {
            m0Var.j(this, true, z10, z11);
            if (z12) {
                L.a c02 = c0();
                C17542s.g(c02);
                c02.u1(z10);
            }
        }
    }

    public w1 t0() {
        return this.f6251v;
    }

    public String toString() {
        return C5143y0.a(this, (String) null) + " children: " + K().size() + " measurePolicy: " + h0();
    }

    public int u0() {
        return this.f6220B.L();
    }

    public final void u1(boolean z10) {
        m0 m0Var;
        if (!this.f6230a && (m0Var = this.f6240k) != null) {
            m0.o(m0Var, this, false, z10, 2, (Object) null);
        }
    }

    public final W0.b<G> w0() {
        if (this.f6246q) {
            this.f6245p.k();
            W0.b<G> bVar = this.f6245p;
            bVar.e(bVar.r(), x0());
            this.f6245p.G(f6218Q);
            this.f6246q = false;
        }
        return this.f6245p;
    }

    public final void w1(boolean z10, boolean z11, boolean z12) {
        m0 m0Var;
        if (!this.f6243n && !this.f6230a && (m0Var = this.f6240k) != null) {
            m0.f(m0Var, this, false, z10, z11, 2, (Object) null);
            if (z12) {
                f0().E1(z10);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void x(G1.m0 r7) {
        /*
            r6 = this;
            G1.m0 r0 = r6.f6240k
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0008
            r0 = r2
            goto L_0x0009
        L_0x0008:
            r0 = r1
        L_0x0009:
            r3 = 0
            if (r0 != 0) goto L_0x002c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "Cannot attach "
            r0.append(r4)
            r0.append(r6)
            java.lang.String r4 = " as it already is attached.  Tree: "
            r0.append(r4)
            java.lang.String r4 = B(r6, r1, r2, r3)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            D1.a.b(r0)
        L_0x002c:
            G1.G r0 = r6.f6239j
            if (r0 == 0) goto L_0x003f
            if (r0 == 0) goto L_0x0035
            G1.m0 r0 = r0.f6240k
            goto L_0x0036
        L_0x0035:
            r0 = r3
        L_0x0036:
            boolean r0 = kotlin.jvm.internal.C17542s.e(r0, r7)
            if (r0 == 0) goto L_0x003d
            goto L_0x003f
        L_0x003d:
            r0 = r1
            goto L_0x0040
        L_0x003f:
            r0 = r2
        L_0x0040:
            if (r0 != 0) goto L_0x0086
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "Attaching to a different owner("
            r0.append(r4)
            r0.append(r7)
            java.lang.String r4 = ") than the parent's owner("
            r0.append(r4)
            G1.G r4 = r6.q0()
            if (r4 == 0) goto L_0x005d
            G1.m0 r4 = r4.f6240k
            goto L_0x005e
        L_0x005d:
            r4 = r3
        L_0x005e:
            r0.append(r4)
            java.lang.String r4 = "). This tree: "
            r0.append(r4)
            java.lang.String r4 = B(r6, r1, r2, r3)
            r0.append(r4)
            java.lang.String r4 = " Parent tree: "
            r0.append(r4)
            G1.G r4 = r6.f6239j
            if (r4 == 0) goto L_0x007b
            java.lang.String r4 = B(r4, r1, r2, r3)
            goto L_0x007c
        L_0x007b:
            r4 = r3
        L_0x007c:
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            D1.a.b(r0)
        L_0x0086:
            G1.G r0 = r6.q0()
            if (r0 != 0) goto L_0x009c
            G1.L$b r4 = r6.f0()
            r4.i2(r2)
            G1.L$a r4 = r6.c0()
            if (r4 == 0) goto L_0x009c
            r4.c2(r2)
        L_0x009c:
            G1.c0 r4 = r6.o0()
            if (r0 == 0) goto L_0x00a7
            G1.c0 r5 = r0.S()
            goto L_0x00a8
        L_0x00a7:
            r5 = r3
        L_0x00a8:
            r4.p3(r5)
            r6.f6240k = r7
            if (r0 == 0) goto L_0x00b2
            int r4 = r0.f6242m
            goto L_0x00b3
        L_0x00b2:
            r4 = -1
        L_0x00b3:
            int r4 = r4 + r2
            r6.f6242m = r4
            androidx.compose.ui.d r4 = r6.f6225G
            if (r4 == 0) goto L_0x00bd
            r6.w(r4)
        L_0x00bd:
            r6.f6225G = r3
            G1.a0 r3 = r6.f6219A
            r4 = 8
            int r4 = G1.C4502e0.a(r4)
            boolean r3 = r3.r(r4)
            if (r3 == 0) goto L_0x00d0
            r6.J0()
        L_0x00d0:
            r7.C(r6)
            boolean r3 = r6.f6233d
            if (r3 == 0) goto L_0x00db
            r6.F1(r6)
            goto L_0x00fd
        L_0x00db:
            G1.G r3 = r6.f6239j
            if (r3 == 0) goto L_0x00e3
            G1.G r3 = r3.f6234e
            if (r3 != 0) goto L_0x00e5
        L_0x00e3:
            G1.G r3 = r6.f6234e
        L_0x00e5:
            r6.F1(r3)
            G1.G r3 = r6.f6234e
            if (r3 != 0) goto L_0x00fd
            G1.a0 r3 = r6.f6219A
            r4 = 512(0x200, float:7.175E-43)
            int r4 = G1.C4502e0.a(r4)
            boolean r3 = r3.r(r4)
            if (r3 == 0) goto L_0x00fd
            r6.F1(r6)
        L_0x00fd:
            boolean r3 = r6.L0()
            if (r3 != 0) goto L_0x0108
            G1.a0 r3 = r6.f6219A
            r3.t()
        L_0x0108:
            G1.X<G1.G> r3 = r6.f6236g
            W0.b r3 = r3.f()
            int r4 = r3.r()
            if (r4 <= 0) goto L_0x0122
            java.lang.Object[] r3 = r3.q()
        L_0x0118:
            r5 = r3[r1]
            G1.G r5 = (G1.G) r5
            r5.x(r7)
            int r1 = r1 + r2
            if (r1 < r4) goto L_0x0118
        L_0x0122:
            boolean r1 = r6.L0()
            if (r1 != 0) goto L_0x012d
            G1.a0 r1 = r6.f6219A
            r1.z()
        L_0x012d:
            r6.G0()
            if (r0 == 0) goto L_0x0135
            r0.G0()
        L_0x0135:
            G1.c0 r0 = r6.o0()
            G1.c0 r1 = r6.S()
            G1.c0 r1 = r1.J2()
        L_0x0141:
            boolean r2 = kotlin.jvm.internal.C17542s.e(r0, r1)
            if (r2 != 0) goto L_0x0151
            if (r0 == 0) goto L_0x0151
            r0.Z2()
            G1.c0 r0 = r0.J2()
            goto L_0x0141
        L_0x0151:
            nI.l<? super G1.m0, XH.N> r0 = r6.f6226H
            if (r0 == 0) goto L_0x0158
            r0.invoke(r7)
        L_0x0158:
            G1.L r7 = r6.f6220B
            r7.c0()
            boolean r7 = r6.L0()
            if (r7 != 0) goto L_0x0166
            r6.D0()
        L_0x0166:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: G1.G.x(G1.m0):void");
    }

    public final W0.b<G> x0() {
        L1();
        if (this.f6235f == 0) {
            return this.f6236g.f();
        }
        W0.b<G> bVar = this.f6237h;
        C17542s.g(bVar);
        return bVar;
    }

    public final void y() {
        this.f6254y = this.f6253x;
        this.f6253x = g.NotUsed;
        W0.b<G> x02 = x0();
        int r10 = x02.r();
        if (r10 > 0) {
            Object[] q10 = x02.q();
            int i10 = 0;
            do {
                G g10 = (G) q10[i10];
                if (g10.f6253x != g.NotUsed) {
                    g10.y();
                }
                i10++;
            } while (i10 < r10);
        }
    }

    public final void y0(long j10, C4517u uVar, boolean z10, boolean z11) {
        o0().R2(C4498c0.f6446L.a(), C4498c0.x2(o0(), j10, false, 2, (Object) null), uVar, z10, z11);
    }

    public final void y1(G g10) {
        if (h.f6258a[g10.Z().ordinal()] != 1) {
            throw new IllegalStateException("Unexpected state " + g10.Z());
        } else if (g10.b0()) {
            t1(g10, true, false, false, 6, (Object) null);
        } else {
            if (g10.a0()) {
                g10.q1(true);
            }
            if (g10.g0()) {
                x1(g10, true, false, false, 6, (Object) null);
            } else if (g10.Y()) {
                g10.u1(true);
            }
        }
    }

    public G(boolean z10, int i10) {
        this.f6230a = z10;
        this.f6231b = i10;
        this.f6236g = new X<>(new W0.b(new G[16], 0), new i(this));
        this.f6245p = new W0.b<>(new G[16], 0);
        this.f6246q = true;
        this.f6247r = f6215N;
        this.f6249t = K.f6264a;
        this.f6250u = t.Ltr;
        this.f6251v = f6217P;
        this.f6252w = C4912y.f14190f0.a();
        g gVar = g.NotUsed;
        this.f6253x = gVar;
        this.f6254y = gVar;
        this.f6219A = new C4494a0(this);
        this.f6220B = new L(this);
        this.f6223E = true;
        this.f6224F = androidx.compose.ui.d.f18749a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ G(boolean z10, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z10, (i11 & 2) != 0 ? o.b() : i10);
    }
}
