package SJ;

import QJ.C16320n;
import QJ.C16324p;
import QJ.q1;
import QJ.r;
import WJ.C16732A;
import WJ.C16733B;
import WJ.C16734C;
import WJ.C16735D;
import WJ.C16740a;
import WJ.C16741b;
import WJ.C16749j;
import WJ.S;
import WJ.w;
import XH.C16807N;
import XH.C16816g;
import XH.x;
import XH.y;
import ZJ.C17012g;
import ZJ.C17013h;
import ZJ.C17015j;
import ZJ.C17016k;
import ZJ.C17018m;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.W;
import nI.C17642l;
import nI.p;
import nI.q;
import uI.C18059h;

@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b5\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0003:\u0001B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\"\b\u0002\u0010\b\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00028\u0000H@¢\u0006\u0004\b\f\u0010\rJ6\u0010\u0013\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u0011H@¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0016\u001a\u00020\u0006*\u00020\u00152\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00028\u00002\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJG\u0010 \u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!JG\u0010\"\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\"\u0010!J\u0017\u0010$\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u0011H\u0003¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\u0011H\u0002¢\u0006\u0004\b'\u0010%J\u001b\u0010(\u001a\u00020\u001e*\u00020\u001c2\u0006\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b(\u0010)J.\u0010+\u001a\u00028\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u0011H@¢\u0006\u0004\b+\u0010,J)\u0010-\u001a\u00020\u0006*\u00020\u00152\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b-\u0010\u0017J\u001d\u0010.\u001a\u00020\u00062\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0002¢\u0006\u0004\b.\u0010/J4\u00101\u001a\b\u0012\u0004\u0012\u00028\u0000002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u0011H@¢\u0006\u0004\b1\u0010,J#\u00102\u001a\u00020\u00062\u0012\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u0000000\u0018H\u0002¢\u0006\u0004\b2\u0010/J9\u00103\u001a\u0004\u0018\u00010\u001c2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b3\u00104J9\u00105\u001a\u0004\u0018\u00010\u001c2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b5\u00104J)\u00106\u001a\u00020\u001e*\u00020\u001c2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0006H\u0002¢\u0006\u0004\b8\u00109J-\u0010;\u001a\u00020\u001e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\u0011H\u0002¢\u0006\u0004\b;\u0010<J-\u0010=\u001a\u00020\u001e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\u0011H\u0002¢\u0006\u0004\b=\u0010<J\u0019\u0010?\u001a\u00020\u00062\b\b\u0002\u0010>\u001a\u00020\u0011H\u0002¢\u0006\u0004\b?\u0010@J%\u0010D\u001a\u00020\u00062\n\u0010B\u001a\u0006\u0012\u0002\b\u00030A2\b\u0010C\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\bD\u0010EJ\u001b\u0010F\u001a\u00020\u00062\n\u0010B\u001a\u0006\u0012\u0002\b\u00030AH\u0002¢\u0006\u0004\bF\u0010GJ%\u0010I\u001a\u0004\u0018\u00010\u001c2\b\u0010C\u001a\u0004\u0018\u00010\u001c2\b\u0010H\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020\u0006H\u0002¢\u0006\u0004\bK\u00109J\u000f\u0010L\u001a\u00020\u0006H\u0002¢\u0006\u0004\bL\u00109J\u000f\u0010M\u001a\u00020\u0006H\u0002¢\u0006\u0004\bM\u00109J\u000f\u0010N\u001a\u00020\u0006H\u0002¢\u0006\u0004\bN\u00109J\u000f\u0010O\u001a\u00020\u0006H\u0002¢\u0006\u0004\bO\u00109J\u001d\u0010Q\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010P\u001a\u00020\u0011H\u0002¢\u0006\u0004\bQ\u0010RJ\u0017\u0010S\u001a\u00020\u00062\u0006\u0010P\u001a\u00020\u0011H\u0002¢\u0006\u0004\bS\u0010@J\u0015\u0010T\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\bT\u0010UJ\u001d\u0010W\u001a\u00020\u00112\f\u0010V\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\bW\u0010XJ\u001d\u0010Y\u001a\u00020\u00062\f\u0010V\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\bY\u0010ZJ%\u0010\\\u001a\u00020\u00062\f\u0010V\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010[\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\\\u0010]J\u0013\u0010^\u001a\u00020\u0006*\u00020\u0015H\u0002¢\u0006\u0004\b^\u0010_J\u0013\u0010`\u001a\u00020\u0006*\u00020\u0015H\u0002¢\u0006\u0004\b`\u0010_J\u001b\u0010b\u001a\u00020\u0006*\u00020\u00152\u0006\u0010a\u001a\u00020\u001eH\u0002¢\u0006\u0004\bb\u0010cJ\u001f\u0010f\u001a\u00020\u001e2\u0006\u0010d\u001a\u00020\u00112\u0006\u0010e\u001a\u00020\u001eH\u0002¢\u0006\u0004\bf\u0010gJ-\u0010i\u001a\u00020\u001e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010h\u001a\u00020\u0011H\u0002¢\u0006\u0004\bi\u0010<J-\u0010l\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e2\u0006\u0010j\u001a\u00020\u00112\f\u0010k\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\bl\u0010mJ-\u0010n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e2\u0006\u0010j\u001a\u00020\u00112\f\u0010k\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\bn\u0010mJ5\u0010p\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e2\u0006\u0010j\u001a\u00020\u00112\f\u0010k\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010o\u001a\u00020\u0011H\u0002¢\u0006\u0004\bp\u0010qJ%\u0010r\u001a\u00020\u00062\u0006\u0010j\u001a\u00020\u00112\f\u0010k\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\br\u0010sJ\u0017\u0010u\u001a\u00020\u00062\u0006\u0010t\u001a\u00020\u0011H\u0002¢\u0006\u0004\bu\u0010@J\u0017\u0010v\u001a\u00020\u00062\u0006\u0010t\u001a\u00020\u0011H\u0002¢\u0006\u0004\bv\u0010@JG\u0010z\u001a \u0012\u0004\u0012\u00020x\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u000000\u0012\u0004\u0012\u00020y\u0012\u0004\u0012\u00020\u00060w*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00028\u0000`\u0007H\u0002¢\u0006\u0004\bz\u0010{J-\u0010~\u001a\u00020\u00062\u0006\u0010|\u001a\u00020x2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u0000002\u0006\u0010}\u001a\u00020yH\u0002¢\u0006\u0004\b~\u0010JO\u0010\u0001\u001a\u001d\u0012\u0004\u0012\u00020x\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0004\u0012\u00020y\u0012\u0004\u0012\u00020\u00060\u0001*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00028\u0000`\u00072\u0006\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0006\b\u0001\u0010\u0001JC\u0010\u0001\u001a\u001a\u0012\u0004\u0012\u00020x\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020y\u0012\u0004\u0012\u00020\u00060w*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00028\u0000`\u0007H\u0002¢\u0006\u0005\b\u0001\u0010{J)\u0010\u0001\u001a\u00020\u00062\u0006\u0010|\u001a\u00020x2\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010}\u001a\u00020yH\u0002¢\u0006\u0005\b\u0001\u0010J\u001a\u0010\u0001\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00028\u0000H@¢\u0006\u0005\b\u0001\u0010\rJ \u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u0006002\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0006\b\u0001\u0010\u0001J \u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u0006002\u0006\u0010\u000b\u001a\u00028\u0000H\u0004¢\u0006\u0006\b\u0001\u0010\u0001J\u0011\u0010\u0001\u001a\u00020\u0006H\u0014¢\u0006\u0005\b\u0001\u00109J\u0011\u0010\u0001\u001a\u00020\u0006H\u0014¢\u0006\u0005\b\u0001\u00109J\u0013\u0010\u0001\u001a\u00028\u0000H@¢\u0006\u0006\b\u0001\u0010\u0001J\u0019\u0010\u0001\u001a\b\u0012\u0004\u0012\u00028\u000000H@¢\u0006\u0006\b\u0001\u0010\u0001J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00028\u000000H\u0016¢\u0006\u0005\b*\u0010\u0001J\u001a\u0010\u0001\u001a\u00020\u00062\u0007\u0010\u0001\u001a\u00020\u0011H\u0004¢\u0006\u0005\b\u0001\u0010@J\u0019\u0010\u0001\u001a\u00020\u00062\u0006\u0010h\u001a\u00020\u0011H\u0000¢\u0006\u0005\b\u0001\u0010@J\u001a\u0010\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0001H\u0002¢\u0006\u0006\b\u0001\u0010\u0001J\u0011\u0010\u0001\u001a\u00020\u0006H\u0014¢\u0006\u0005\b\u0001\u00109J\u001c\u0010\u0001\u001a\u00020\u001e2\b\u0010|\u001a\u0004\u0018\u00010xH\u0016¢\u0006\u0006\b\u0001\u0010\u0001J\"\u0010\u0001\u001a\u00020\u00062\u0010\u0010|\u001a\f\u0018\u00010\u0001j\u0005\u0018\u0001`\u0001¢\u0006\u0006\b\u0001\u0010\u0001J\u001c\u0010\u0001\u001a\u00020\u001e2\b\u0010|\u001a\u0004\u0018\u00010xH\u0010¢\u0006\u0006\b\u0001\u0010\u0001J%\u0010\u0001\u001a\u00020\u001e2\b\u0010|\u001a\u0004\u0018\u00010x2\u0007\u0010\u0001\u001a\u00020\u001eH\u0014¢\u0006\u0006\b\u0001\u0010\u0001J'\u0010:\u001a\u00020\u00062\u0015\u0010 \u0001\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010x\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¢\u0006\u0005\b:\u0010¡\u0001J\u0012\u0010¢\u0001\u001a\u00020\u001eH\u0000¢\u0006\u0006\b¢\u0001\u0010£\u0001J\u0013\u0010¥\u0001\u001a\u00030¤\u0001H\u0016¢\u0006\u0006\b¥\u0001\u0010¦\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010§\u0001R/\u0010\b\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u00078\u0000X\u0004¢\u0006\u0007\n\u0005\b:\u0010¨\u0001Rc\u0010­\u0001\u001aG\u0012\b\u0012\u0006\u0012\u0002\b\u00030A\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020x\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0004\u0012\u00020y\u0012\u0004\u0012\u00020\u00060\u0001\u0018\u00010\u0001j\u0005\u0018\u0001`©\u00018\u0002X\u0004¢\u0006\u000f\n\u0006\bª\u0001\u0010«\u0001\u0012\u0005\b¬\u0001\u00109R\u0017\u0010°\u0001\u001a\u00020\u00118BX\u0004¢\u0006\b\u001a\u0006\b®\u0001\u0010¯\u0001R\u0017\u0010²\u0001\u001a\u00020\u001e8BX\u0004¢\u0006\b\u001a\u0006\b±\u0001\u0010£\u0001R\u0017\u0010µ\u0001\u001a\u00020x8BX\u0004¢\u0006\b\u001a\u0006\b³\u0001\u0010´\u0001R\u001a\u0010·\u0001\u001a\u00020\u001e*\u00020\u00118BX\u0004¢\u0006\u0007\u001a\u0005\b¶\u0001\u0010%R\u001a\u0010¹\u0001\u001a\u00020\u001e*\u00020\u00118BX\u0004¢\u0006\u0007\u001a\u0005\b¸\u0001\u0010%R\u0016\u0010[\u001a\u00020\u00118@X\u0004¢\u0006\b\u001a\u0006\bº\u0001\u0010¯\u0001R\u0017\u0010¼\u0001\u001a\u00020\u00118@X\u0004¢\u0006\b\u001a\u0006\b»\u0001\u0010¯\u0001R+\u0010Á\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u0000000½\u00018VX\u0004¢\u0006\u000f\u0012\u0005\bÀ\u0001\u00109\u001a\u0006\b¾\u0001\u0010¿\u0001R\u0019\u0010Ã\u0001\u001a\u0004\u0018\u00010x8DX\u0004¢\u0006\b\u001a\u0006\bÂ\u0001\u0010´\u0001R\u0017\u0010Å\u0001\u001a\u00020x8DX\u0004¢\u0006\b\u001a\u0006\bÄ\u0001\u0010´\u0001R\u0017\u0010Ç\u0001\u001a\u00020\u001e8TX\u0004¢\u0006\b\u001a\u0006\bÆ\u0001\u0010£\u0001R\u001e\u0010Ê\u0001\u001a\u00020\u001e8VX\u0004¢\u0006\u000f\u0012\u0005\bÉ\u0001\u00109\u001a\u0006\bÈ\u0001\u0010£\u0001R\u001d\u0010e\u001a\u00020\u001e8VX\u0004¢\u0006\u000f\u0012\u0005\bÌ\u0001\u00109\u001a\u0006\bË\u0001\u0010£\u0001R\f\u0010Í\u0001\u001a\u00020\u001c8\u0002X\u0004R\f\u0010Î\u0001\u001a\u00020\u001c8\u0002X\u0004R\f\u0010Ï\u0001\u001a\u00020\u001c8\u0002X\u0004R\f\u0010Ð\u0001\u001a\u00020\u001c8\u0002X\u0004R\u0018\u0010Ñ\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\u001c8\u0002X\u0004R\u0018\u0010Ò\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\u001c8\u0002X\u0004R\u0018\u0010Ó\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\u001c8\u0002X\u0004R\u0014\u0010Ô\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001c8\u0002X\u0004R\u0014\u0010Õ\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001c8\u0002X\u0004¨\u0006Ö\u0001"}, d2 = {"LSJ/h;", "E", "LSJ/j;", "", "capacity", "Lkotlin/Function1;", "LXH/N;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(ILnI/l;)V", "element", "O0", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "LSJ/o;", "segment", "index", "", "s", "h1", "(LSJ/o;ILjava/lang/Object;JLdI/e;)Ljava/lang/Object;", "LQJ/q1;", "V0", "(LQJ/q1;LSJ/o;I)V", "LQJ/n;", "cont", "P0", "(Ljava/lang/Object;LQJ/n;)V", "", "waiter", "", "closed", "q1", "(LSJ/o;ILjava/lang/Object;JLjava/lang/Object;Z)I", "r1", "curSendersAndCloseStatus", "i1", "(J)Z", "curSenders", "Q", "j1", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "r", "a1", "(LSJ/o;IJLdI/e;)Ljava/lang/Object;", "U0", "M0", "(LQJ/n;)V", "LSJ/n;", "Z0", "L0", "o1", "(LSJ/o;IJLjava/lang/Object;)Ljava/lang/Object;", "p1", "k1", "(Ljava/lang/Object;LSJ/o;I)Z", "Z", "()V", "b", "m1", "(LSJ/o;IJ)Z", "n1", "nAttempts", "t0", "(J)V", "LZJ/k;", "select", "ignoredParam", "b1", "(LZJ/k;Ljava/lang/Object;)V", "N0", "(LZJ/k;)V", "selectResult", "W0", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "v0", "G0", "F0", "E0", "X", "sendersCur", "W", "(J)LSJ/o;", "V", "T", "()LSJ/o;", "lastSegment", "D0", "(LSJ/o;)J", "c1", "(LSJ/o;)V", "sendersCounter", "S", "(LSJ/o;J)V", "d1", "(LQJ/q1;)V", "e1", "receiver", "f1", "(LQJ/q1;Z)V", "sendersAndCloseStatusCur", "isClosedForReceive", "x0", "(JZ)Z", "globalIndex", "w0", "id", "startFrom", "c0", "(JLSJ/o;)LSJ/o;", "b0", "currentBufferEndCounter", "a0", "(JLSJ/o;J)LSJ/o;", "H0", "(JLSJ/o;)V", "value", "t1", "s1", "Lkotlin/reflect/KFunction3;", "", "LdI/i;", "P", "(LnI/l;)LuI/h;", "cause", "context", "I0", "(Ljava/lang/Throwable;Ljava/lang/Object;LdI/i;)V", "Lkotlin/Function3;", "M", "(LnI/l;Ljava/lang/Object;)LnI/q;", "N", "J0", "y", "k", "(Ljava/lang/Object;)Ljava/lang/Object;", "l1", "R0", "Q0", "j", "(LdI/e;)Ljava/lang/Object;", "n", "()Ljava/lang/Object;", "globalCellIndex", "Y", "u1", "LSJ/l;", "iterator", "()LSJ/l;", "K0", "a", "(Ljava/lang/Throwable;)Z", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "i", "(Ljava/util/concurrent/CancellationException;)V", "R", "cancel", "U", "(Ljava/lang/Throwable;Z)Z", "handler", "(LnI/l;)V", "s0", "()Z", "", "toString", "()Ljava/lang/String;", "I", "LnI/l;", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "c", "LnI/q;", "getOnUndeliveredElementReceiveCancellationConstructor$annotations", "onUndeliveredElementReceiveCancellationConstructor", "e0", "()J", "bufferEndCounter", "C0", "isRendezvousOrUnlimited", "j0", "()Ljava/lang/Throwable;", "receiveException", "A0", "isClosedForSend0", "z0", "isClosedForReceive0", "q0", "m0", "receiversCounter", "LZJ/g;", "m", "()LZJ/g;", "getOnReceiveCatching$annotations", "onReceiveCatching", "g0", "closeCause", "n0", "sendException", "B0", "isConflatedDropOldest", "A", "isClosedForSend$annotations", "isClosedForSend", "y0", "isClosedForReceive$annotations", "sendersAndCloseStatus", "receivers", "bufferEnd", "completedExpandBuffersAndPauseFlag", "sendSegment", "receiveSegment", "bufferEndSegment", "_closeCause", "closeHandler", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: SJ.h  reason: case insensitive filesystem */
public class C16432h<E> implements C16434j<E> {
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f138277d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f138278e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f138279f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f138280g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f138281h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f138282i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f138283j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f138284k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f138285l;
    private volatile /* synthetic */ Object _closeCause$volatile;

    /* renamed from: a  reason: collision with root package name */
    private final int f138286a;

    /* renamed from: b  reason: collision with root package name */
    public final C17642l<E, C16807N> f138287b;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;

    /* renamed from: c  reason: collision with root package name */
    private final q<C17016k<?>, Object, Object, q<Throwable, Object, C17168i, C16807N>> f138288c;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\u000e\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH@¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HB¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0016\u001a\u00020\u00102\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00028\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0010¢\u0006\u0004\b\u001d\u0010\u0012R\u0018\u0010 \u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001fR\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010!8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, d2 = {"LSJ/h$a;", "LSJ/l;", "LQJ/q1;", "<init>", "(LSJ/h;)V", "", "g", "()Z", "LSJ/o;", "segment", "", "index", "", "r", "f", "(LSJ/o;IJLdI/e;)Ljava/lang/Object;", "LXH/N;", "h", "()V", "a", "(LdI/e;)Ljava/lang/Object;", "LWJ/A;", "d", "(LWJ/A;I)V", "next", "()Ljava/lang/Object;", "element", "i", "(Ljava/lang/Object;)Z", "j", "", "Ljava/lang/Object;", "receiveResult", "LQJ/p;", "b", "LQJ/p;", "continuation", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: SJ.h$a */
    private final class a implements C16436l<E>, q1 {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public Object f138289a = C16433i.f138321p;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public C16324p<? super Boolean> f138290b;

        public a() {
        }

        private final Object f(C16439o<E> oVar, int i10, long j10, C17164e<? super Boolean> eVar) {
            Boolean a10;
            C16432h<E> hVar = C16432h.this;
            C16324p<? super Boolean> b10 = r.b(C17187b.c(eVar));
            try {
                this.f138290b = b10;
                Object K10 = hVar.o1(oVar, i10, j10, this);
                if (K10 == C16433i.f138318m) {
                    hVar.U0(this, oVar, i10);
                } else {
                    q qVar = null;
                    if (K10 == C16433i.f138320o) {
                        if (j10 < hVar.q0()) {
                            oVar.c();
                        }
                        C16439o oVar2 = (C16439o) C16432h.f138282i.get(hVar);
                        while (true) {
                            if (hVar.y0()) {
                                h();
                                break;
                            }
                            long andIncrement = C16432h.f138278e.getAndIncrement(hVar);
                            int i11 = C16433i.f138307b;
                            long j11 = andIncrement / ((long) i11);
                            int i12 = (int) (andIncrement % ((long) i11));
                            if (oVar2.f139524c != j11) {
                                C16439o o10 = hVar.b0(j11, oVar2);
                                if (o10 != null) {
                                    oVar2 = o10;
                                }
                            }
                            Object K11 = hVar.o1(oVar2, i12, andIncrement, this);
                            if (K11 == C16433i.f138318m) {
                                hVar.U0(this, oVar2, i12);
                                break;
                            } else if (K11 == C16433i.f138320o) {
                                if (andIncrement < hVar.q0()) {
                                    oVar2.c();
                                }
                            } else if (K11 != C16433i.f138319n) {
                                oVar2.c();
                                this.f138289a = K11;
                                this.f138290b = null;
                                a10 = kotlin.coroutines.jvm.internal.b.a(true);
                                C17642l<E, C16807N> lVar = hVar.f138287b;
                                if (lVar != null) {
                                    qVar = hVar.M(lVar, K11);
                                }
                            } else {
                                throw new IllegalStateException("unexpected");
                            }
                        }
                    } else {
                        oVar.c();
                        this.f138289a = K10;
                        this.f138290b = null;
                        a10 = kotlin.coroutines.jvm.internal.b.a(true);
                        C17642l<E, C16807N> lVar2 = hVar.f138287b;
                        if (lVar2 != null) {
                            qVar = hVar.M(lVar2, K10);
                        }
                    }
                    b10.P(a10, qVar);
                }
                Object w10 = b10.w();
                if (w10 == C17187b.f()) {
                    h.c(eVar);
                }
                return w10;
            } catch (Throwable th2) {
                b10.O();
                throw th2;
            }
        }

        private final boolean g() {
            this.f138289a = C16433i.z();
            Throwable g02 = C16432h.this.g0();
            if (g02 == null) {
                return false;
            }
            throw C16734C.a(g02);
        }

        /* access modifiers changed from: private */
        public final void h() {
            C16324p<? super Boolean> pVar = this.f138290b;
            C17542s.g(pVar);
            this.f138290b = null;
            this.f138289a = C16433i.z();
            Throwable g02 = C16432h.this.g0();
            if (g02 == null) {
                x.a aVar = x.f139812b;
                pVar.resumeWith(x.b(Boolean.FALSE));
                return;
            }
            x.a aVar2 = x.f139812b;
            pVar.resumeWith(x.b(y.a(g02)));
        }

        public Object a(C17164e<? super Boolean> eVar) {
            boolean z10 = true;
            if (this.f138289a == C16433i.f138321p || this.f138289a == C16433i.z()) {
                C16432h<E> hVar = C16432h.this;
                C16439o oVar = (C16439o) C16432h.f138282i.get(hVar);
                while (true) {
                    if (hVar.y0()) {
                        z10 = g();
                        break;
                    }
                    long andIncrement = C16432h.f138278e.getAndIncrement(hVar);
                    int i10 = C16433i.f138307b;
                    long j10 = andIncrement / ((long) i10);
                    int i11 = (int) (andIncrement % ((long) i10));
                    if (oVar.f139524c != j10) {
                        C16439o o10 = hVar.b0(j10, oVar);
                        if (o10 == null) {
                            continue;
                        } else {
                            oVar = o10;
                        }
                    }
                    Object K10 = hVar.o1(oVar, i11, andIncrement, (Object) null);
                    if (K10 == C16433i.f138318m) {
                        throw new IllegalStateException("unreachable");
                    } else if (K10 == C16433i.f138320o) {
                        if (andIncrement < hVar.q0()) {
                            oVar.c();
                        }
                    } else if (K10 == C16433i.f138319n) {
                        return f(oVar, i11, andIncrement, eVar);
                    } else {
                        oVar.c();
                        this.f138289a = K10;
                    }
                }
            }
            return kotlin.coroutines.jvm.internal.b.a(z10);
        }

        public void d(C16732A<?> a10, int i10) {
            C16324p<? super Boolean> pVar = this.f138290b;
            if (pVar != null) {
                pVar.d(a10, i10);
            }
        }

        public final boolean i(E e10) {
            C16324p<? super Boolean> pVar = this.f138290b;
            C17542s.g(pVar);
            q qVar = null;
            this.f138290b = null;
            this.f138289a = e10;
            Boolean bool = Boolean.TRUE;
            C16432h<E> hVar = C16432h.this;
            C17642l<E, C16807N> lVar = hVar.f138287b;
            if (lVar != null) {
                qVar = hVar.M(lVar, e10);
            }
            return C16433i.B(pVar, bool, qVar);
        }

        public final void j() {
            C16324p<? super Boolean> pVar = this.f138290b;
            C17542s.g(pVar);
            this.f138290b = null;
            this.f138289a = C16433i.z();
            Throwable g02 = C16432h.this.g0();
            if (g02 == null) {
                x.a aVar = x.f139812b;
                pVar.resumeWith(x.b(Boolean.FALSE));
                return;
            }
            x.a aVar2 = x.f139812b;
            pVar.resumeWith(x.b(y.a(g02)));
        }

        public E next() {
            E e10 = this.f138289a;
            if (e10 != C16433i.f138321p) {
                this.f138289a = C16433i.f138321p;
                if (e10 != C16433i.z()) {
                    return e10;
                }
                throw C16734C.a(C16432h.this.j0());
            }
            throw new IllegalStateException("`hasNext()` has not been invoked");
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"LSJ/h$b;", "LQJ/q1;", "LWJ/A;", "segment", "", "index", "LXH/N;", "d", "(LWJ/A;I)V", "LQJ/n;", "", "b", "LQJ/n;", "a", "()LQJ/n;", "cont", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: SJ.h$b */
    private static final class b implements q1 {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ C16324p<Boolean> f138292a;

        /* renamed from: b  reason: collision with root package name */
        private final C16320n<Boolean> f138293b;

        public final C16320n<Boolean> a() {
            return this.f138293b;
        }

        public void d(C16732A<?> a10, int i10) {
            this.f138292a.d(a10, i10);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: SJ.h$c */
    /* synthetic */ class c extends C17540p implements q<Throwable, E, C17168i, C16807N> {
        c(Object obj) {
            super(3, obj, C16432h.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            t((Throwable) obj, obj2, (C17168i) obj3);
            return C16807N.f139792a;
        }

        public final void t(Throwable th2, E e10, C17168i iVar) {
            ((C16432h) this.receiver).J0(th2, e10, iVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: SJ.h$d */
    /* synthetic */ class d extends C17540p implements q<Throwable, C16438n<? extends E>, C17168i, C16807N> {
        d(Object obj) {
            super(3, obj, C16432h.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            t((Throwable) obj, ((C16438n) obj2).l(), (C17168i) obj3);
            return C16807N.f139792a;
        }

        public final void t(Throwable th2, Object obj, C17168i iVar) {
            ((C16432h) this.receiver).I0(th2, obj, iVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: SJ.h$e */
    /* synthetic */ class e extends C17540p implements q<C16432h<?>, C17016k<?>, Object, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f138294a = new e();

        e() {
            super(3, C16432h.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            t((C16432h) obj, (C17016k) obj2, obj3);
            return C16807N.f139792a;
        }

        public final void t(C16432h<?> hVar, C17016k<?> kVar, Object obj) {
            hVar.b1(kVar, obj);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: SJ.h$f */
    /* synthetic */ class f extends C17540p implements q<C16432h<?>, Object, Object, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f138295a = new f();

        f() {
            super(3, C16432h.class, "processResultSelectReceiveCatching", "processResultSelectReceiveCatching(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        /* renamed from: t */
        public final Object invoke(C16432h<?> hVar, Object obj, Object obj2) {
            return hVar.W0(obj, obj2);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", l = {759}, m = "receiveCatching-JP2dKIU$suspendImpl")
    /* renamed from: SJ.h$g */
    static final class g<E> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f138296c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16432h<E> f138297d;

        /* renamed from: e  reason: collision with root package name */
        int f138298e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(C16432h<E> hVar, C17164e<? super g> eVar) {
            super(eVar);
            this.f138297d = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f138296c = obj;
            this.f138298e |= Integer.MIN_VALUE;
            Object Y02 = C16432h.Y0(this.f138297d, this);
            return Y02 == C17187b.f() ? Y02 : C16438n.b(Y02);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", l = {3117}, m = "receiveCatchingOnNoWaiterSuspend-GKJJFZk")
    /* renamed from: SJ.h$h  reason: collision with other inner class name */
    static final class C3380h extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f138299c;

        /* renamed from: d  reason: collision with root package name */
        Object f138300d;

        /* renamed from: e  reason: collision with root package name */
        int f138301e;

        /* renamed from: f  reason: collision with root package name */
        long f138302f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f138303g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C16432h<E> f138304h;

        /* renamed from: i  reason: collision with root package name */
        int f138305i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3380h(C16432h<E> hVar, C17164e<? super C3380h> eVar) {
            super(eVar);
            this.f138304h = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f138303g = obj;
            this.f138305i |= Integer.MIN_VALUE;
            Object I10 = this.f138304h.Z0((C16439o) null, 0, 0, this);
            return I10 == C17187b.f() ? I10 : C16438n.b(I10);
        }
    }

    static {
        Class<C16432h> cls = C16432h.class;
        f138277d = AtomicLongFieldUpdater.newUpdater(cls, "sendersAndCloseStatus$volatile");
        f138278e = AtomicLongFieldUpdater.newUpdater(cls, "receivers$volatile");
        f138279f = AtomicLongFieldUpdater.newUpdater(cls, "bufferEnd$volatile");
        f138280g = AtomicLongFieldUpdater.newUpdater(cls, "completedExpandBuffersAndPauseFlag$volatile");
        Class<Object> cls2 = Object.class;
        f138281h = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "sendSegment$volatile");
        f138282i = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "receiveSegment$volatile");
        f138283j = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "bufferEndSegment$volatile");
        f138284k = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_closeCause$volatile");
        f138285l = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "closeHandler$volatile");
    }

    public C16432h(int i10, C17642l<? super E, C16807N> lVar) {
        this.f138286a = i10;
        this.f138287b = lVar;
        if (i10 >= 0) {
            this.bufferEnd$volatile = C16433i.A(i10);
            this.completedExpandBuffersAndPauseFlag$volatile = e0();
            C16439o oVar = new C16439o(0, (C16439o) null, this, 3);
            this.sendSegment$volatile = oVar;
            this.receiveSegment$volatile = oVar;
            if (C0()) {
                oVar = C16433i.f138306a;
                C17542s.h(oVar, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
            }
            this.bufferEndSegment$volatile = oVar;
            this.f138288c = lVar != null ? new C16429e(this) : null;
            this._closeCause$volatile = C16433i.f138324s;
            return;
        }
        throw new IllegalArgumentException(("Invalid channel capacity: " + i10 + ", should be >=0").toString());
    }

    /* access modifiers changed from: private */
    public final boolean A0(long j10) {
        return x0(j10, false);
    }

    private final boolean C0() {
        long e02 = e0();
        return e02 == 0 || e02 == Long.MAX_VALUE;
    }

    private final long D0(C16439o<E> oVar) {
        do {
            int i10 = C16433i.f138307b;
            while (true) {
                i10--;
                if (-1 < i10) {
                    long j10 = (oVar.f139524c * ((long) C16433i.f138307b)) + ((long) i10);
                    if (j10 < m0()) {
                        return -1;
                    }
                    while (true) {
                        Object B10 = oVar.B(i10);
                        if (B10 == null || B10 == C16433i.f138310e) {
                            if (oVar.v(i10, B10, C16433i.z())) {
                                oVar.t();
                                break;
                            }
                        } else if (B10 == C16433i.f138309d) {
                            return j10;
                        }
                    }
                } else {
                    oVar = (C16439o) oVar.h();
                }
            }
        } while (oVar != null);
        return -1;
    }

    private final void E0() {
        long j10;
        AtomicLongFieldUpdater p02 = f138277d;
        do {
            j10 = p02.get(this);
            if (((int) (j10 >> 60)) == 0) {
            } else {
                return;
            }
        } while (!p02.compareAndSet(this, j10, C16433i.w(1152921504606846975L & j10, 1)));
    }

    private final void F0() {
        long j10;
        AtomicLongFieldUpdater p02 = f138277d;
        do {
            j10 = p02.get(this);
        } while (!p02.compareAndSet(this, j10, C16433i.w(1152921504606846975L & j10, 3)));
    }

    private final void G0() {
        long j10;
        long b10;
        AtomicLongFieldUpdater p02 = f138277d;
        do {
            j10 = p02.get(this);
            int i10 = (int) (j10 >> 60);
            if (i10 == 0) {
                b10 = C16433i.w(j10 & 1152921504606846975L, 2);
            } else if (i10 == 1) {
                b10 = C16433i.w(j10 & 1152921504606846975L, 3);
            } else {
                return;
            }
        } while (!p02.compareAndSet(this, j10, b10));
    }

    private final void H0(long j10, C16439o<E> oVar) {
        C16439o<E> oVar2;
        C16439o<E> oVar3;
        while (oVar.f139524c < j10 && (oVar3 = (C16439o) oVar.f()) != null) {
            oVar = oVar3;
        }
        while (true) {
            if (!oVar.k() || (oVar2 = (C16439o) oVar.f()) == null) {
                AtomicReferenceFieldUpdater f02 = f138283j;
                while (true) {
                    C16732A a10 = (C16732A) f02.get(this);
                    if (a10.f139524c < oVar.f139524c) {
                        if (!oVar.u()) {
                            continue;
                            break;
                        } else if (androidx.concurrent.futures.b.a(f02, this, a10, oVar)) {
                            if (a10.p()) {
                                a10.n();
                                return;
                            }
                            return;
                        } else if (oVar.p()) {
                            oVar.n();
                        }
                    } else {
                        return;
                    }
                }
            } else {
                oVar = oVar2;
            }
        }
    }

    /* access modifiers changed from: private */
    public final void I0(Throwable th2, Object obj, C17168i iVar) {
        C17642l<E, C16807N> lVar = this.f138287b;
        C17542s.g(lVar);
        Object f10 = C16438n.f(obj);
        C17542s.g(f10);
        w.a(lVar, f10, iVar);
    }

    /* access modifiers changed from: private */
    public final void J0(Throwable th2, E e10, C17168i iVar) {
        C17642l<E, C16807N> lVar = this.f138287b;
        C17542s.g(lVar);
        w.a(lVar, e10, iVar);
    }

    /* access modifiers changed from: private */
    public final void L0(C16320n<? super C16438n<? extends E>> nVar) {
        x.a aVar = x.f139812b;
        nVar.resumeWith(x.b(C16438n.b(C16438n.f138330b.a(g0()))));
    }

    /* access modifiers changed from: private */
    public final q<Throwable, Object, C17168i, C16807N> M(C17642l<? super E, C16807N> lVar, E e10) {
        return new C16430f(lVar, e10);
    }

    /* access modifiers changed from: private */
    public final void M0(C16320n<? super E> nVar) {
        x.a aVar = x.f139812b;
        nVar.resumeWith(x.b(y.a(j0())));
    }

    /* access modifiers changed from: private */
    public final C18059h<C16807N> N(C17642l<? super E, C16807N> lVar) {
        return new c(this);
    }

    private final void N0(C17016k<?> kVar) {
        kVar.c(C16433i.z());
    }

    /* access modifiers changed from: private */
    public static final C16807N O(C17642l lVar, Object obj, Throwable th2, Object obj2, C17168i iVar) {
        w.a(lVar, obj, iVar);
        return C16807N.f139792a;
    }

    private final Object O0(E e10, C17164e<? super C16807N> eVar) {
        S c10;
        C16324p pVar = new C16324p(C17187b.c(eVar), 1);
        pVar.C();
        C17642l<E, C16807N> lVar = this.f138287b;
        if (lVar == null || (c10 = w.c(lVar, e10, (S) null, 2, (Object) null)) == null) {
            Throwable n02 = n0();
            x.a aVar = x.f139812b;
            pVar.resumeWith(x.b(y.a(n02)));
        } else {
            C16816g.a(c10, n0());
            x.a aVar2 = x.f139812b;
            pVar.resumeWith(x.b(y.a(c10)));
        }
        Object w10 = pVar.w();
        if (w10 == C17187b.f()) {
            h.c(eVar);
        }
        return w10 == C17187b.f() ? w10 : C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public final C18059h<C16807N> P(C17642l<? super E, C16807N> lVar) {
        return new d(this);
    }

    /* access modifiers changed from: private */
    public final void P0(E e10, C16320n<? super C16807N> nVar) {
        C17642l<E, C16807N> lVar = this.f138287b;
        if (lVar != null) {
            w.a(lVar, e10, nVar.getContext());
        }
        Throwable n02 = n0();
        x.a aVar = x.f139812b;
        nVar.resumeWith(x.b(y.a(n02)));
    }

    private final boolean Q(long j10) {
        return j10 < e0() || j10 < m0() + ((long) this.f138286a);
    }

    private final void S(C16439o<E> oVar, long j10) {
        Object b10 = C16749j.b((Object) null, 1, (DefaultConstructorMarker) null);
        loop0:
        while (oVar != null) {
            for (int i10 = C16433i.f138307b - 1; -1 < i10; i10--) {
                if ((oVar.f139524c * ((long) C16433i.f138307b)) + ((long) i10) < j10) {
                    break loop0;
                }
                while (true) {
                    Object B10 = oVar.B(i10);
                    if (B10 == null || B10 == C16433i.f138310e) {
                        if (oVar.v(i10, B10, C16433i.z())) {
                            oVar.t();
                            break;
                        }
                    } else if (B10 instanceof C16424C) {
                        if (oVar.v(i10, B10, C16433i.z())) {
                            b10 = C16749j.c(b10, ((C16424C) B10).f138270a);
                            oVar.C(i10, true);
                            break;
                        }
                    } else if (!(B10 instanceof q1)) {
                        break;
                    } else if (oVar.v(i10, B10, C16433i.z())) {
                        b10 = C16749j.c(b10, B10);
                        oVar.C(i10, true);
                        break;
                    }
                }
            }
            oVar = (C16439o) oVar.h();
        }
        if (b10 == null) {
            return;
        }
        if (!(b10 instanceof ArrayList)) {
            d1((q1) b10);
            return;
        }
        C17542s.h(b10, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
        ArrayList arrayList = (ArrayList) b10;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            d1((q1) arrayList.get(size));
        }
    }

    /* access modifiers changed from: private */
    public static final q S0(C16432h hVar, C17016k kVar, Object obj, Object obj2) {
        return new C16431g(obj2, hVar, kVar);
    }

    private final C16439o<E> T() {
        C16439o oVar = f138283j.get(this);
        C16439o oVar2 = (C16439o) f138281h.get(this);
        if (oVar2.f139524c > ((C16439o) oVar).f139524c) {
            oVar = oVar2;
        }
        C16439o oVar3 = (C16439o) f138282i.get(this);
        if (oVar3.f139524c > ((C16439o) oVar).f139524c) {
            oVar = oVar3;
        }
        return (C16439o) C16740a.b((C16741b) oVar);
    }

    /* access modifiers changed from: private */
    public static final C16807N T0(Object obj, C16432h hVar, C17016k kVar, Throwable th2, Object obj2, C17168i iVar) {
        if (obj != C16433i.z()) {
            w.a(hVar.f138287b, obj, kVar.getContext());
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public final void U0(q1 q1Var, C16439o<E> oVar, int i10) {
        R0();
        q1Var.d(oVar, i10);
    }

    private final void V(long j10) {
        c1(W(j10));
    }

    /* access modifiers changed from: private */
    public final void V0(q1 q1Var, C16439o<E> oVar, int i10) {
        q1Var.d(oVar, i10 + C16433i.f138307b);
    }

    private final C16439o<E> W(long j10) {
        C16439o<E> T10 = T();
        if (B0()) {
            long D02 = D0(T10);
            if (D02 != -1) {
                Y(D02);
            }
        }
        S(T10, j10);
        return T10;
    }

    /* access modifiers changed from: private */
    public final Object W0(Object obj, Object obj2) {
        return C16438n.b(obj2 == C16433i.z() ? C16438n.f138330b.a(g0()) : C16438n.f138330b.c(obj2));
    }

    private final void X() {
        A();
    }

    static /* synthetic */ <E> Object X0(C16432h<E> hVar, C17164e<? super E> eVar) {
        C16439o oVar = (C16439o) f138282i.get(hVar);
        while (!hVar.y0()) {
            long andIncrement = f138278e.getAndIncrement(hVar);
            int i10 = C16433i.f138307b;
            long j10 = andIncrement / ((long) i10);
            int i11 = (int) (andIncrement % ((long) i10));
            if (oVar.f139524c != j10) {
                C16439o o10 = hVar.b0(j10, oVar);
                if (o10 == null) {
                    continue;
                } else {
                    oVar = o10;
                }
            }
            Object K10 = hVar.o1(oVar, i11, andIncrement, (Object) null);
            if (K10 == C16433i.f138318m) {
                throw new IllegalStateException("unexpected");
            } else if (K10 == C16433i.f138320o) {
                if (andIncrement < hVar.q0()) {
                    oVar.c();
                }
            } else if (K10 == C16433i.f138319n) {
                return hVar.a1(oVar, i11, andIncrement, eVar);
            } else {
                oVar.c();
                return K10;
            }
        }
        throw C16734C.a(hVar.j0());
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ <E> java.lang.Object Y0(SJ.C16432h<E> r13, dI.C17164e<? super SJ.C16438n<? extends E>> r14) {
        /*
            boolean r0 = r14 instanceof SJ.C16432h.g
            if (r0 == 0) goto L_0x0014
            r0 = r14
            SJ.h$g r0 = (SJ.C16432h.g) r0
            int r1 = r0.f138298e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.f138298e = r1
        L_0x0012:
            r6 = r0
            goto L_0x001a
        L_0x0014:
            SJ.h$g r0 = new SJ.h$g
            r0.<init>(r13, r14)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r14 = r6.f138296c
            java.lang.Object r0 = eI.C17187b.f()
            int r1 = r6.f138298e
            r2 = 1
            if (r1 == 0) goto L_0x003a
            if (r1 != r2) goto L_0x0032
            XH.y.b(r14)
            SJ.n r14 = (SJ.C16438n) r14
            java.lang.Object r13 = r14.l()
            goto L_0x00b2
        L_0x0032:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x003a:
            XH.y.b(r14)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = f138282i
            java.lang.Object r14 = r14.get(r13)
            SJ.o r14 = (SJ.C16439o) r14
        L_0x0047:
            boolean r1 = r13.y0()
            if (r1 == 0) goto L_0x0058
            SJ.n$b r14 = SJ.C16438n.f138330b
            java.lang.Throwable r13 = r13.g0()
            java.lang.Object r13 = r14.a(r13)
            goto L_0x00b2
        L_0x0058:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = f138278e
            long r4 = r1.getAndIncrement(r13)
            int r1 = SJ.C16433i.f138307b
            long r7 = (long) r1
            long r7 = r4 / r7
            long r9 = (long) r1
            long r9 = r4 % r9
            int r3 = (int) r9
            long r9 = r14.f139524c
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x0077
            SJ.o r1 = r13.b0(r7, r14)
            if (r1 != 0) goto L_0x0076
            goto L_0x0047
        L_0x0076:
            r14 = r1
        L_0x0077:
            r12 = 0
            r7 = r13
            r8 = r14
            r9 = r3
            r10 = r4
            java.lang.Object r1 = r7.o1(r8, r9, r10, r12)
            WJ.D r7 = SJ.C16433i.f138318m
            if (r1 == r7) goto L_0x00b3
            WJ.D r7 = SJ.C16433i.f138320o
            if (r1 != r7) goto L_0x0098
            long r7 = r13.q0()
            int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r1 >= 0) goto L_0x0047
            r14.c()
            goto L_0x0047
        L_0x0098:
            WJ.D r7 = SJ.C16433i.f138319n
            if (r1 != r7) goto L_0x00a9
            r6.f138298e = r2
            r1 = r13
            r2 = r14
            java.lang.Object r13 = r1.Z0(r2, r3, r4, r6)
            if (r13 != r0) goto L_0x00b2
            return r0
        L_0x00a9:
            r14.c()
            SJ.n$b r13 = SJ.C16438n.f138330b
            java.lang.Object r13 = r13.c(r1)
        L_0x00b2:
            return r13
        L_0x00b3:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "unexpected"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: SJ.C16432h.Y0(SJ.h, dI.e):java.lang.Object");
    }

    private final void Z() {
        if (!C0()) {
            C16439o oVar = (C16439o) f138283j.get(this);
            while (true) {
                long andIncrement = f138279f.getAndIncrement(this);
                int i10 = C16433i.f138307b;
                long j10 = andIncrement / ((long) i10);
                if (q0() <= andIncrement) {
                    if (oVar.f139524c < j10 && oVar.f() != null) {
                        H0(j10, oVar);
                    }
                    u0(this, 0, 1, (Object) null);
                    return;
                }
                if (oVar.f139524c != j10) {
                    C16439o a02 = a0(j10, oVar, andIncrement);
                    if (a02 == null) {
                        continue;
                    } else {
                        oVar = a02;
                    }
                }
                if (m1(oVar, (int) (andIncrement % ((long) i10)), andIncrement)) {
                    u0(this, 0, 1, (Object) null);
                    return;
                }
                u0(this, 0, 1, (Object) null);
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object Z0(SJ.C16439o<E> r11, int r12, long r13, dI.C17164e<? super SJ.C16438n<? extends E>> r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof SJ.C16432h.C3380h
            if (r0 == 0) goto L_0x0013
            r0 = r15
            SJ.h$h r0 = (SJ.C16432h.C3380h) r0
            int r1 = r0.f138305i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f138305i = r1
            goto L_0x0018
        L_0x0013:
            SJ.h$h r0 = new SJ.h$h
            r0.<init>(r10, r15)
        L_0x0018:
            java.lang.Object r15 = r0.f138303g
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f138305i
            r3 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r11 = r0.f138300d
            SJ.o r11 = (SJ.C16439o) r11
            java.lang.Object r11 = r0.f138299c
            SJ.h r11 = (SJ.C16432h) r11
            XH.y.b(r15)
            goto L_0x012c
        L_0x0032:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x003a:
            XH.y.b(r15)
            r0.f138299c = r10
            r0.f138300d = r11
            r0.f138301e = r12
            r0.f138302f = r13
            r0.f138305i = r3
            dI.e r15 = eI.C17187b.c(r0)
            QJ.p r15 = QJ.r.b(r15)
            SJ.z r8 = new SJ.z     // Catch:{ all -> 0x006d }
            java.lang.String r2 = "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuationImpl<kotlinx.coroutines.channels.ChannelResult<E of kotlinx.coroutines.channels.BufferedChannel>>"
            kotlin.jvm.internal.C17542s.h(r15, r2)     // Catch:{ all -> 0x006d }
            r8.<init>(r15)     // Catch:{ all -> 0x006d }
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r7 = r8
            java.lang.Object r2 = r2.o1(r3, r4, r5, r7)     // Catch:{ all -> 0x006d }
            WJ.D r3 = SJ.C16433i.f138318m     // Catch:{ all -> 0x006d }
            if (r2 != r3) goto L_0x0070
            r10.U0(r8, r11, r12)     // Catch:{ all -> 0x006d }
            goto L_0x011c
        L_0x006d:
            r11 = move-exception
            goto L_0x0133
        L_0x0070:
            WJ.D r12 = SJ.C16433i.f138320o     // Catch:{ all -> 0x006d }
            r9 = 0
            if (r2 != r12) goto L_0x0104
            long r2 = r10.q0()     // Catch:{ all -> 0x006d }
            int r12 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r12 >= 0) goto L_0x0082
            r11.c()     // Catch:{ all -> 0x006d }
        L_0x0082:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r11 = f138282i     // Catch:{ all -> 0x006d }
            java.lang.Object r11 = r11.get(r10)     // Catch:{ all -> 0x006d }
            SJ.o r11 = (SJ.C16439o) r11     // Catch:{ all -> 0x006d }
        L_0x008c:
            boolean r12 = r10.y0()     // Catch:{ all -> 0x006d }
            if (r12 == 0) goto L_0x0097
            r10.L0(r15)     // Catch:{ all -> 0x006d }
            goto L_0x011c
        L_0x0097:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r12 = f138278e     // Catch:{ all -> 0x006d }
            long r12 = r12.getAndIncrement(r10)     // Catch:{ all -> 0x006d }
            int r14 = SJ.C16433i.f138307b     // Catch:{ all -> 0x006d }
            long r2 = (long) r14     // Catch:{ all -> 0x006d }
            long r2 = r12 / r2
            long r4 = (long) r14     // Catch:{ all -> 0x006d }
            long r4 = r12 % r4
            int r14 = (int) r4     // Catch:{ all -> 0x006d }
            long r4 = r11.f139524c     // Catch:{ all -> 0x006d }
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00b6
            SJ.o r2 = r10.b0(r2, r11)     // Catch:{ all -> 0x006d }
            if (r2 != 0) goto L_0x00b5
            goto L_0x008c
        L_0x00b5:
            r11 = r2
        L_0x00b6:
            r2 = r10
            r3 = r11
            r4 = r14
            r5 = r12
            r7 = r8
            java.lang.Object r2 = r2.o1(r3, r4, r5, r7)     // Catch:{ all -> 0x006d }
            WJ.D r3 = SJ.C16433i.f138318m     // Catch:{ all -> 0x006d }
            if (r2 != r3) goto L_0x00c9
            r10.U0(r8, r11, r14)     // Catch:{ all -> 0x006d }
            goto L_0x011c
        L_0x00c9:
            WJ.D r14 = SJ.C16433i.f138320o     // Catch:{ all -> 0x006d }
            if (r2 != r14) goto L_0x00db
            long r2 = r10.q0()     // Catch:{ all -> 0x006d }
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 >= 0) goto L_0x008c
            r11.c()     // Catch:{ all -> 0x006d }
            goto L_0x008c
        L_0x00db:
            WJ.D r12 = SJ.C16433i.f138319n     // Catch:{ all -> 0x006d }
            if (r2 == r12) goto L_0x00fc
            r11.c()     // Catch:{ all -> 0x006d }
            SJ.n$b r11 = SJ.C16438n.f138330b     // Catch:{ all -> 0x006d }
            java.lang.Object r11 = r11.c(r2)     // Catch:{ all -> 0x006d }
            SJ.n r11 = SJ.C16438n.b(r11)     // Catch:{ all -> 0x006d }
            nI.l<E, XH.N> r12 = r10.f138287b     // Catch:{ all -> 0x006d }
            if (r12 == 0) goto L_0x00f6
            uI.h r9 = r10.P(r12)     // Catch:{ all -> 0x006d }
        L_0x00f6:
            nI.q r9 = (nI.q) r9     // Catch:{ all -> 0x006d }
        L_0x00f8:
            r15.P(r11, r9)     // Catch:{ all -> 0x006d }
            goto L_0x011c
        L_0x00fc:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch:{ all -> 0x006d }
            java.lang.String r12 = "unexpected"
            r11.<init>(r12)     // Catch:{ all -> 0x006d }
            throw r11     // Catch:{ all -> 0x006d }
        L_0x0104:
            r11.c()     // Catch:{ all -> 0x006d }
            SJ.n$b r11 = SJ.C16438n.f138330b     // Catch:{ all -> 0x006d }
            java.lang.Object r11 = r11.c(r2)     // Catch:{ all -> 0x006d }
            SJ.n r11 = SJ.C16438n.b(r11)     // Catch:{ all -> 0x006d }
            nI.l<E, XH.N> r12 = r10.f138287b     // Catch:{ all -> 0x006d }
            if (r12 == 0) goto L_0x0119
            uI.h r9 = r10.P(r12)     // Catch:{ all -> 0x006d }
        L_0x0119:
            nI.q r9 = (nI.q) r9     // Catch:{ all -> 0x006d }
            goto L_0x00f8
        L_0x011c:
            java.lang.Object r15 = r15.w()
            java.lang.Object r11 = eI.C17187b.f()
            if (r15 != r11) goto L_0x0129
            kotlin.coroutines.jvm.internal.h.c(r0)
        L_0x0129:
            if (r15 != r1) goto L_0x012c
            return r1
        L_0x012c:
            SJ.n r15 = (SJ.C16438n) r15
            java.lang.Object r11 = r15.l()
            return r11
        L_0x0133:
            r15.O()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: SJ.C16432h.Z0(SJ.o, int, long, dI.e):java.lang.Object");
    }

    private final C16439o<E> a0(long j10, C16439o<E> oVar, long j11) {
        Object c10;
        long j12 = j10;
        AtomicReferenceFieldUpdater f02 = f138283j;
        p pVar = (p) C16433i.y();
        C16439o<E> oVar2 = oVar;
        loop0:
        while (true) {
            c10 = C16740a.c(oVar2, j12, pVar);
            if (C16733B.c(c10)) {
                break;
            }
            C16732A b10 = C16733B.b(c10);
            while (true) {
                C16732A a10 = (C16732A) f02.get(this);
                if (a10.f139524c >= b10.f139524c) {
                    break loop0;
                } else if (b10.u()) {
                    if (androidx.concurrent.futures.b.a(f02, this, a10, b10)) {
                        if (a10.p()) {
                            a10.n();
                        }
                    } else if (b10.p()) {
                        b10.n();
                    }
                }
            }
        }
        if (C16733B.c(c10)) {
            X();
            H0(j10, oVar);
            u0(this, 0, 1, (Object) null);
            return null;
        }
        C16439o<E> oVar3 = (C16439o) C16733B.b(c10);
        if (oVar3.f139524c <= j12) {
            return oVar3;
        }
        long j13 = oVar3.f139524c;
        int i10 = C16433i.f138307b;
        if (f138279f.compareAndSet(this, j11 + 1, j13 * ((long) i10))) {
            t0((oVar3.f139524c * ((long) i10)) - j11);
            return null;
        }
        u0(this, 0, 1, (Object) null);
        return null;
    }

    /* JADX WARNING: type inference failed for: r7v3, types: [uI.h] */
    /* JADX WARNING: type inference failed for: r7v9, types: [uI.h] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object a1(SJ.C16439o<E> r9, int r10, long r11, dI.C17164e<? super E> r13) {
        /*
            r8 = this;
            dI.e r0 = eI.C17187b.c(r13)
            QJ.p r0 = QJ.r.b(r0)
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r0
            java.lang.Object r1 = r1.o1(r2, r3, r4, r6)     // Catch:{ all -> 0x001c }
            WJ.D r2 = SJ.C16433i.f138318m     // Catch:{ all -> 0x001c }
            if (r1 != r2) goto L_0x001f
            r8.U0(r0, r9, r10)     // Catch:{ all -> 0x001c }
            goto L_0x00bc
        L_0x001c:
            r9 = move-exception
            goto L_0x00ca
        L_0x001f:
            WJ.D r10 = SJ.C16433i.f138320o     // Catch:{ all -> 0x001c }
            r7 = 0
            if (r1 != r10) goto L_0x00ae
            long r1 = r8.q0()     // Catch:{ all -> 0x001c }
            int r10 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r10 >= 0) goto L_0x0031
            r9.c()     // Catch:{ all -> 0x001c }
        L_0x0031:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r9 = f138282i     // Catch:{ all -> 0x001c }
            java.lang.Object r9 = r9.get(r8)     // Catch:{ all -> 0x001c }
            SJ.o r9 = (SJ.C16439o) r9     // Catch:{ all -> 0x001c }
        L_0x003b:
            boolean r10 = r8.y0()     // Catch:{ all -> 0x001c }
            if (r10 == 0) goto L_0x0046
            r8.M0(r0)     // Catch:{ all -> 0x001c }
            goto L_0x00bc
        L_0x0046:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r10 = f138278e     // Catch:{ all -> 0x001c }
            long r10 = r10.getAndIncrement(r8)     // Catch:{ all -> 0x001c }
            int r12 = SJ.C16433i.f138307b     // Catch:{ all -> 0x001c }
            long r1 = (long) r12     // Catch:{ all -> 0x001c }
            long r1 = r10 / r1
            long r3 = (long) r12     // Catch:{ all -> 0x001c }
            long r3 = r10 % r3
            int r12 = (int) r3     // Catch:{ all -> 0x001c }
            long r3 = r9.f139524c     // Catch:{ all -> 0x001c }
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x0065
            SJ.o r1 = r8.b0(r1, r9)     // Catch:{ all -> 0x001c }
            if (r1 != 0) goto L_0x0064
            goto L_0x003b
        L_0x0064:
            r9 = r1
        L_0x0065:
            r1 = r8
            r2 = r9
            r3 = r12
            r4 = r10
            r6 = r0
            java.lang.Object r1 = r1.o1(r2, r3, r4, r6)     // Catch:{ all -> 0x001c }
            WJ.D r2 = SJ.C16433i.f138318m     // Catch:{ all -> 0x001c }
            if (r1 != r2) goto L_0x007d
            if (r0 == 0) goto L_0x0077
            r7 = r0
        L_0x0077:
            if (r7 == 0) goto L_0x00bc
            r8.U0(r7, r9, r12)     // Catch:{ all -> 0x001c }
            goto L_0x00bc
        L_0x007d:
            WJ.D r12 = SJ.C16433i.f138320o     // Catch:{ all -> 0x001c }
            if (r1 != r12) goto L_0x008f
            long r1 = r8.q0()     // Catch:{ all -> 0x001c }
            int r10 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r10 >= 0) goto L_0x003b
            r9.c()     // Catch:{ all -> 0x001c }
            goto L_0x003b
        L_0x008f:
            WJ.D r10 = SJ.C16433i.f138319n     // Catch:{ all -> 0x001c }
            if (r1 == r10) goto L_0x00a6
            r9.c()     // Catch:{ all -> 0x001c }
            nI.l<E, XH.N> r9 = r8.f138287b     // Catch:{ all -> 0x001c }
            if (r9 == 0) goto L_0x00a0
            uI.h r7 = r8.N(r9)     // Catch:{ all -> 0x001c }
        L_0x00a0:
            nI.q r7 = (nI.q) r7     // Catch:{ all -> 0x001c }
        L_0x00a2:
            r0.P(r1, r7)     // Catch:{ all -> 0x001c }
            goto L_0x00bc
        L_0x00a6:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x001c }
            java.lang.String r10 = "unexpected"
            r9.<init>(r10)     // Catch:{ all -> 0x001c }
            throw r9     // Catch:{ all -> 0x001c }
        L_0x00ae:
            r9.c()     // Catch:{ all -> 0x001c }
            nI.l<E, XH.N> r9 = r8.f138287b     // Catch:{ all -> 0x001c }
            if (r9 == 0) goto L_0x00b9
            uI.h r7 = r8.N(r9)     // Catch:{ all -> 0x001c }
        L_0x00b9:
            nI.q r7 = (nI.q) r7     // Catch:{ all -> 0x001c }
            goto L_0x00a2
        L_0x00bc:
            java.lang.Object r9 = r0.w()
            java.lang.Object r10 = eI.C17187b.f()
            if (r9 != r10) goto L_0x00c9
            kotlin.coroutines.jvm.internal.h.c(r13)
        L_0x00c9:
            return r9
        L_0x00ca:
            r0.O()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: SJ.C16432h.a1(SJ.o, int, long, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final C16439o<E> b0(long j10, C16439o<E> oVar) {
        Object c10;
        AtomicReferenceFieldUpdater k02 = f138282i;
        p pVar = (p) C16433i.y();
        loop0:
        while (true) {
            c10 = C16740a.c(oVar, j10, pVar);
            if (C16733B.c(c10)) {
                break;
            }
            C16732A b10 = C16733B.b(c10);
            while (true) {
                C16732A a10 = (C16732A) k02.get(this);
                if (a10.f139524c >= b10.f139524c) {
                    break loop0;
                } else if (b10.u()) {
                    if (androidx.concurrent.futures.b.a(k02, this, a10, b10)) {
                        if (a10.p()) {
                            a10.n();
                        }
                    } else if (b10.p()) {
                        b10.n();
                    }
                }
            }
        }
        if (C16733B.c(c10)) {
            X();
            if (oVar.f139524c * ((long) C16433i.f138307b) >= q0()) {
                return null;
            }
            oVar.c();
            return null;
        }
        C16439o<E> oVar2 = (C16439o) C16733B.b(c10);
        if (!C0() && j10 <= e0() / ((long) C16433i.f138307b)) {
            AtomicReferenceFieldUpdater f02 = f138283j;
            while (true) {
                C16732A a11 = (C16732A) f02.get(this);
                if (a11.f139524c >= oVar2.f139524c || !oVar2.u()) {
                    break;
                } else if (androidx.concurrent.futures.b.a(f02, this, a11, oVar2)) {
                    if (a11.p()) {
                        a11.n();
                    }
                } else if (oVar2.p()) {
                    oVar2.n();
                }
            }
        }
        long j11 = oVar2.f139524c;
        if (j11 <= j10) {
            return oVar2;
        }
        int i10 = C16433i.f138307b;
        s1(j11 * ((long) i10));
        if (oVar2.f139524c * ((long) i10) >= q0()) {
            return null;
        }
        oVar2.c();
        return null;
    }

    /* access modifiers changed from: private */
    public final void b1(C17016k<?> kVar, Object obj) {
        C16439o oVar = (C16439o) f138282i.get(this);
        while (!y0()) {
            long andIncrement = f138278e.getAndIncrement(this);
            int i10 = C16433i.f138307b;
            long j10 = andIncrement / ((long) i10);
            int i11 = (int) (andIncrement % ((long) i10));
            if (oVar.f139524c != j10) {
                C16439o o10 = b0(j10, oVar);
                if (o10 == null) {
                    continue;
                } else {
                    oVar = o10;
                }
            }
            Object K10 = o1(oVar, i11, andIncrement, kVar);
            if (K10 == C16433i.f138318m) {
                q1 q1Var = kVar instanceof q1 ? (q1) kVar : null;
                if (q1Var != null) {
                    U0(q1Var, oVar, i11);
                    return;
                }
                return;
            } else if (K10 == C16433i.f138320o) {
                if (andIncrement < q0()) {
                    oVar.c();
                }
            } else if (K10 != C16433i.f138319n) {
                oVar.c();
                kVar.c(K10);
                return;
            } else {
                throw new IllegalStateException("unexpected");
            }
        }
        N0(kVar);
    }

    /* access modifiers changed from: private */
    public final C16439o<E> c0(long j10, C16439o<E> oVar) {
        Object c10;
        AtomicReferenceFieldUpdater o02 = f138281h;
        p pVar = (p) C16433i.y();
        loop0:
        while (true) {
            c10 = C16740a.c(oVar, j10, pVar);
            if (C16733B.c(c10)) {
                break;
            }
            C16732A b10 = C16733B.b(c10);
            while (true) {
                C16732A a10 = (C16732A) o02.get(this);
                if (a10.f139524c >= b10.f139524c) {
                    break loop0;
                } else if (b10.u()) {
                    if (androidx.concurrent.futures.b.a(o02, this, a10, b10)) {
                        if (a10.p()) {
                            a10.n();
                        }
                    } else if (b10.p()) {
                        b10.n();
                    }
                }
            }
        }
        if (C16733B.c(c10)) {
            X();
            if (oVar.f139524c * ((long) C16433i.f138307b) >= m0()) {
                return null;
            }
            oVar.c();
            return null;
        }
        C16439o<E> oVar2 = (C16439o) C16733B.b(c10);
        long j11 = oVar2.f139524c;
        if (j11 <= j10) {
            return oVar2;
        }
        int i10 = C16433i.f138307b;
        t1(j11 * ((long) i10));
        if (oVar2.f139524c * ((long) i10) >= m0()) {
            return null;
        }
        oVar2.c();
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b3, code lost:
        r12 = (SJ.C16439o) r12.h();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void c1(SJ.C16439o<E> r12) {
        /*
            r11 = this;
            nI.l<E, XH.N> r0 = r11.f138287b
            r1 = 0
            r2 = 1
            java.lang.Object r3 = WJ.C16749j.b(r1, r2, r1)
        L_0x0008:
            int r4 = SJ.C16433i.f138307b
            int r4 = r4 - r2
        L_0x000b:
            r5 = -1
            if (r5 >= r4) goto L_0x00b3
            long r6 = r12.f139524c
            int r8 = SJ.C16433i.f138307b
            long r8 = (long) r8
            long r6 = r6 * r8
            long r8 = (long) r4
            long r6 = r6 + r8
        L_0x0016:
            java.lang.Object r8 = r12.B(r4)
            WJ.D r9 = SJ.C16433i.f138314i
            if (r8 == r9) goto L_0x00bb
            WJ.D r9 = SJ.C16433i.f138309d
            if (r8 != r9) goto L_0x0048
            long r9 = r11.m0()
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 < 0) goto L_0x00bb
            WJ.D r9 = SJ.C16433i.z()
            boolean r8 = r12.v(r4, r8, r9)
            if (r8 == 0) goto L_0x0016
            if (r0 == 0) goto L_0x0040
            java.lang.Object r5 = r12.A(r4)
            WJ.S r1 = WJ.w.b(r0, r5, r1)
        L_0x0040:
            r12.w(r4)
            r12.t()
            goto L_0x00af
        L_0x0048:
            WJ.D r9 = SJ.C16433i.f138310e
            if (r8 == r9) goto L_0x00a2
            if (r8 != 0) goto L_0x0051
            goto L_0x00a2
        L_0x0051:
            boolean r9 = r8 instanceof QJ.q1
            if (r9 != 0) goto L_0x006e
            boolean r9 = r8 instanceof SJ.C16424C
            if (r9 == 0) goto L_0x005a
            goto L_0x006e
        L_0x005a:
            WJ.D r9 = SJ.C16433i.f138312g
            if (r8 == r9) goto L_0x00bb
            WJ.D r9 = SJ.C16433i.f138311f
            if (r8 != r9) goto L_0x0067
            goto L_0x00bb
        L_0x0067:
            WJ.D r9 = SJ.C16433i.f138312g
            if (r8 == r9) goto L_0x0016
            goto L_0x00af
        L_0x006e:
            long r9 = r11.m0()
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 < 0) goto L_0x00bb
            boolean r9 = r8 instanceof SJ.C16424C
            if (r9 == 0) goto L_0x0080
            r9 = r8
            SJ.C r9 = (SJ.C16424C) r9
            QJ.q1 r9 = r9.f138270a
            goto L_0x0083
        L_0x0080:
            r9 = r8
            QJ.q1 r9 = (QJ.q1) r9
        L_0x0083:
            WJ.D r10 = SJ.C16433i.z()
            boolean r8 = r12.v(r4, r8, r10)
            if (r8 == 0) goto L_0x0016
            if (r0 == 0) goto L_0x0097
            java.lang.Object r5 = r12.A(r4)
            WJ.S r1 = WJ.w.b(r0, r5, r1)
        L_0x0097:
            java.lang.Object r3 = WJ.C16749j.c(r3, r9)
            r12.w(r4)
            r12.t()
            goto L_0x00af
        L_0x00a2:
            WJ.D r9 = SJ.C16433i.z()
            boolean r8 = r12.v(r4, r8, r9)
            if (r8 == 0) goto L_0x0016
            r12.t()
        L_0x00af:
            int r4 = r4 + -1
            goto L_0x000b
        L_0x00b3:
            WJ.b r12 = r12.h()
            SJ.o r12 = (SJ.C16439o) r12
            if (r12 != 0) goto L_0x0008
        L_0x00bb:
            if (r3 == 0) goto L_0x00e1
            boolean r12 = r3 instanceof java.util.ArrayList
            if (r12 != 0) goto L_0x00c7
            QJ.q1 r3 = (QJ.q1) r3
            r11.e1(r3)
            goto L_0x00e1
        L_0x00c7:
            java.lang.String r12 = "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>"
            kotlin.jvm.internal.C17542s.h(r3, r12)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r12 = r3.size()
            int r12 = r12 - r2
        L_0x00d3:
            if (r5 >= r12) goto L_0x00e1
            java.lang.Object r0 = r3.get(r12)
            QJ.q1 r0 = (QJ.q1) r0
            r11.e1(r0)
            int r12 = r12 + -1
            goto L_0x00d3
        L_0x00e1:
            if (r1 != 0) goto L_0x00e4
            return
        L_0x00e4:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: SJ.C16432h.c1(SJ.o):void");
    }

    private final void d1(q1 q1Var) {
        f1(q1Var, true);
    }

    private final long e0() {
        return f138279f.get(this);
    }

    private final void e1(q1 q1Var) {
        f1(q1Var, false);
    }

    private final void f1(q1 q1Var, boolean z10) {
        if (q1Var instanceof b) {
            C16320n<Boolean> a10 = ((b) q1Var).a();
            x.a aVar = x.f139812b;
            a10.resumeWith(x.b(Boolean.FALSE));
        } else if (q1Var instanceof C16320n) {
            C17164e eVar = (C17164e) q1Var;
            x.a aVar2 = x.f139812b;
            eVar.resumeWith(x.b(y.a(z10 ? j0() : n0())));
        } else if (q1Var instanceof C16450z) {
            C16324p<C16438n<? extends E>> pVar = ((C16450z) q1Var).f138348a;
            x.a aVar3 = x.f139812b;
            pVar.resumeWith(x.b(C16438n.b(C16438n.f138330b.a(g0()))));
        } else if (q1Var instanceof a) {
            ((a) q1Var).j();
        } else if (q1Var instanceof C17016k) {
            ((C17016k) q1Var).f(this, C16433i.z());
        } else {
            throw new IllegalStateException(("Unexpected waiter: " + q1Var).toString());
        }
    }

    static /* synthetic */ <E> Object g1(C16432h<E> hVar, E e10, C17164e<? super C16807N> eVar) {
        C16439o oVar = (C16439o) f138281h.get(hVar);
        while (true) {
            long andIncrement = f138277d.getAndIncrement(hVar);
            long j10 = 1152921504606846975L & andIncrement;
            boolean x10 = hVar.A0(andIncrement);
            int i10 = C16433i.f138307b;
            long j11 = j10 / ((long) i10);
            int i11 = (int) (j10 % ((long) i10));
            if (oVar.f139524c != j11) {
                C16439o p10 = hVar.c0(j11, oVar);
                if (p10 != null) {
                    oVar = p10;
                } else if (x10) {
                    Object O02 = hVar.O0(e10, eVar);
                    if (O02 == C17187b.f()) {
                        return O02;
                    }
                }
            }
            int L10 = hVar.q1(oVar, i11, e10, j10, (Object) null, x10);
            if (L10 == 0) {
                oVar.c();
                break;
            } else if (L10 == 1) {
                break;
            } else if (L10 != 2) {
                if (L10 == 3) {
                    Object h12 = hVar.h1(oVar, i11, e10, j10, eVar);
                    if (h12 == C17187b.f()) {
                        return h12;
                    }
                } else if (L10 == 4) {
                    if (j10 < hVar.m0()) {
                        oVar.c();
                    }
                    Object O03 = hVar.O0(e10, eVar);
                    if (O03 == C17187b.f()) {
                        return O03;
                    }
                } else if (L10 == 5) {
                    oVar.c();
                }
            } else if (x10) {
                oVar.t();
                Object O04 = hVar.O0(e10, eVar);
                if (O04 == C17187b.f()) {
                    return O04;
                }
            }
        }
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x011b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x011c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object h1(SJ.C16439o<E> r21, int r22, E r23, long r24, dI.C17164e<? super XH.C16807N> r26) {
        /*
            r20 = this;
            r9 = r20
            r0 = r23
            dI.e r1 = eI.C17187b.c(r26)
            QJ.p r10 = QJ.r.b(r1)
            r8 = 0
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r24
            r7 = r10
            int r1 = r1.q1(r2, r3, r4, r5, r7, r8)     // Catch:{ all -> 0x0068 }
            if (r1 == 0) goto L_0x00fa
            r11 = 1
            if (r1 == r11) goto L_0x00f1
            r12 = 2
            if (r1 == r12) goto L_0x00e9
            r13 = 4
            if (r1 == r13) goto L_0x00dc
            java.lang.String r14 = "unexpected"
            r15 = 5
            if (r1 != r15) goto L_0x00d6
            r21.c()     // Catch:{ all -> 0x0068 }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f138281h     // Catch:{ all -> 0x0068 }
            java.lang.Object r1 = r1.get(r9)     // Catch:{ all -> 0x0068 }
            SJ.o r1 = (SJ.C16439o) r1     // Catch:{ all -> 0x0068 }
        L_0x0039:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = f138277d     // Catch:{ all -> 0x0068 }
            long r2 = r2.getAndIncrement(r9)     // Catch:{ all -> 0x0068 }
            r4 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r16 = r2 & r4
            boolean r18 = r9.A0(r2)     // Catch:{ all -> 0x0068 }
            int r2 = SJ.C16433i.f138307b     // Catch:{ all -> 0x0068 }
            long r3 = (long) r2     // Catch:{ all -> 0x0068 }
            long r3 = r16 / r3
            long r5 = (long) r2     // Catch:{ all -> 0x0068 }
            long r5 = r16 % r5
            int r8 = (int) r5     // Catch:{ all -> 0x0068 }
            long r5 = r1.f139524c     // Catch:{ all -> 0x0068 }
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x006d
            SJ.o r2 = r9.c0(r3, r1)     // Catch:{ all -> 0x0068 }
            if (r2 != 0) goto L_0x006b
            if (r18 == 0) goto L_0x0039
        L_0x0063:
            r9.P0(r0, r10)     // Catch:{ all -> 0x0068 }
            goto L_0x0108
        L_0x0068:
            r0 = move-exception
            goto L_0x011f
        L_0x006b:
            r7 = r2
            goto L_0x006e
        L_0x006d:
            r7 = r1
        L_0x006e:
            r1 = r20
            r2 = r7
            r3 = r8
            r4 = r23
            r5 = r16
            r21 = r7
            r7 = r10
            r19 = r8
            r8 = r18
            int r1 = r1.q1(r2, r3, r4, r5, r7, r8)     // Catch:{ all -> 0x0068 }
            if (r1 == 0) goto L_0x00c8
            if (r1 == r11) goto L_0x00bc
            if (r1 == r12) goto L_0x00a7
            r2 = 3
            if (r1 == r2) goto L_0x00a1
            if (r1 == r13) goto L_0x0095
            if (r1 == r15) goto L_0x008f
            goto L_0x0092
        L_0x008f:
            r21.c()     // Catch:{ all -> 0x0068 }
        L_0x0092:
            r1 = r21
            goto L_0x0039
        L_0x0095:
            long r1 = r20.m0()     // Catch:{ all -> 0x0068 }
            int r1 = (r16 > r1 ? 1 : (r16 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x0063
            r21.c()     // Catch:{ all -> 0x0068 }
            goto L_0x0063
        L_0x00a1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0068 }
            r0.<init>(r14)     // Catch:{ all -> 0x0068 }
            throw r0     // Catch:{ all -> 0x0068 }
        L_0x00a7:
            if (r18 == 0) goto L_0x00ad
            r21.t()     // Catch:{ all -> 0x0068 }
            goto L_0x0063
        L_0x00ad:
            if (r10 == 0) goto L_0x00b1
            r0 = r10
            goto L_0x00b2
        L_0x00b1:
            r0 = 0
        L_0x00b2:
            if (r0 == 0) goto L_0x0108
            r2 = r21
            r1 = r19
            r9.V0(r0, r2, r1)     // Catch:{ all -> 0x0068 }
            goto L_0x0108
        L_0x00bc:
            XH.x$a r0 = XH.x.f139812b     // Catch:{ all -> 0x0068 }
            XH.N r0 = XH.C16807N.f139792a     // Catch:{ all -> 0x0068 }
            java.lang.Object r0 = XH.x.b(r0)     // Catch:{ all -> 0x0068 }
        L_0x00c4:
            r10.resumeWith(r0)     // Catch:{ all -> 0x0068 }
            goto L_0x0108
        L_0x00c8:
            r2 = r21
            r2.c()     // Catch:{ all -> 0x0068 }
            XH.x$a r0 = XH.x.f139812b     // Catch:{ all -> 0x0068 }
            XH.N r0 = XH.C16807N.f139792a     // Catch:{ all -> 0x0068 }
            java.lang.Object r0 = XH.x.b(r0)     // Catch:{ all -> 0x0068 }
            goto L_0x00c4
        L_0x00d6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0068 }
            r0.<init>(r14)     // Catch:{ all -> 0x0068 }
            throw r0     // Catch:{ all -> 0x0068 }
        L_0x00dc:
            long r1 = r20.m0()     // Catch:{ all -> 0x0068 }
            int r1 = (r24 > r1 ? 1 : (r24 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x0063
            r21.c()     // Catch:{ all -> 0x0068 }
            goto L_0x0063
        L_0x00e9:
            r0 = r21
            r1 = r22
            r9.V0(r10, r0, r1)     // Catch:{ all -> 0x0068 }
            goto L_0x0108
        L_0x00f1:
            XH.x$a r0 = XH.x.f139812b     // Catch:{ all -> 0x0068 }
            XH.N r0 = XH.C16807N.f139792a     // Catch:{ all -> 0x0068 }
            java.lang.Object r0 = XH.x.b(r0)     // Catch:{ all -> 0x0068 }
            goto L_0x00c4
        L_0x00fa:
            r0 = r21
            r21.c()     // Catch:{ all -> 0x0068 }
            XH.x$a r0 = XH.x.f139812b     // Catch:{ all -> 0x0068 }
            XH.N r0 = XH.C16807N.f139792a     // Catch:{ all -> 0x0068 }
            java.lang.Object r0 = XH.x.b(r0)     // Catch:{ all -> 0x0068 }
            goto L_0x00c4
        L_0x0108:
            java.lang.Object r0 = r10.w()
            java.lang.Object r1 = eI.C17187b.f()
            if (r0 != r1) goto L_0x0115
            kotlin.coroutines.jvm.internal.h.c(r26)
        L_0x0115:
            java.lang.Object r1 = eI.C17187b.f()
            if (r0 != r1) goto L_0x011c
            return r0
        L_0x011c:
            XH.N r0 = XH.C16807N.f139792a
            return r0
        L_0x011f:
            r10.O()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: SJ.C16432h.h1(SJ.o, int, java.lang.Object, long, dI.e):java.lang.Object");
    }

    private final boolean i1(long j10) {
        if (A0(j10)) {
            return false;
        }
        return !Q(j10 & 1152921504606846975L);
    }

    /* access modifiers changed from: private */
    public final Throwable j0() {
        Throwable g02 = g0();
        return g02 == null ? new C16443s("Channel was closed") : g02;
    }

    private final boolean j1(Object obj, E e10) {
        if (obj instanceof C17016k) {
            return ((C17016k) obj).f(this, e10);
        }
        C18059h<C16807N> hVar = null;
        if (obj instanceof C16450z) {
            C17542s.h(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            C16324p<C16438n<? extends E>> pVar = ((C16450z) obj).f138348a;
            C16438n b10 = C16438n.b(C16438n.f138330b.c(e10));
            C17642l<E, C16807N> lVar = this.f138287b;
            if (lVar != null) {
                hVar = P(lVar);
            }
            return C16433i.B(pVar, b10, (q) hVar);
        } else if (obj instanceof a) {
            C17542s.h(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((a) obj).i(e10);
        } else if (obj instanceof C16320n) {
            C17542s.h(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            C16320n nVar = (C16320n) obj;
            C17642l<E, C16807N> lVar2 = this.f138287b;
            if (lVar2 != null) {
                hVar = N(lVar2);
            }
            return C16433i.B(nVar, e10, (q) hVar);
        } else {
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
    }

    private final boolean k1(Object obj, C16439o<E> oVar, int i10) {
        if (obj instanceof C16320n) {
            C17542s.h(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return C16433i.C((C16320n) obj, C16807N.f139792a, (q) null, 2, (Object) null);
        } else if (obj instanceof C17016k) {
            C17542s.h(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            C17018m x10 = ((C17015j) obj).x(this, C16807N.f139792a);
            if (x10 == C17018m.REREGISTER) {
                oVar.w(i10);
            }
            return x10 == C17018m.SUCCESSFUL;
        } else if (obj instanceof b) {
            return C16433i.C(((b) obj).a(), Boolean.TRUE, (q) null, 2, (Object) null);
        } else {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
    }

    private final boolean m1(C16439o<E> oVar, int i10, long j10) {
        Object B10 = oVar.B(i10);
        if (!(B10 instanceof q1) || j10 < f138278e.get(this) || !oVar.v(i10, B10, C16433i.f138312g)) {
            return n1(oVar, i10, j10);
        }
        if (k1(B10, oVar, i10)) {
            oVar.F(i10, C16433i.f138309d);
            return true;
        }
        oVar.F(i10, C16433i.f138315j);
        oVar.C(i10, false);
        return false;
    }

    private final boolean n1(C16439o<E> oVar, int i10, long j10) {
        while (true) {
            Object B10 = oVar.B(i10);
            if (B10 instanceof q1) {
                if (j10 < f138278e.get(this)) {
                    if (oVar.v(i10, B10, new C16424C((q1) B10))) {
                        return true;
                    }
                } else if (oVar.v(i10, B10, C16433i.f138312g)) {
                    if (k1(B10, oVar, i10)) {
                        oVar.F(i10, C16433i.f138309d);
                        return true;
                    }
                    oVar.F(i10, C16433i.f138315j);
                    oVar.C(i10, false);
                    return false;
                }
            } else if (B10 == C16433i.f138315j) {
                return false;
            } else {
                if (B10 == null) {
                    if (oVar.v(i10, B10, C16433i.f138310e)) {
                        return true;
                    }
                } else if (B10 == C16433i.f138309d || B10 == C16433i.f138313h || B10 == C16433i.f138314i || B10 == C16433i.f138316k || B10 == C16433i.z()) {
                    return true;
                } else {
                    if (B10 != C16433i.f138311f) {
                        throw new IllegalStateException(("Unexpected cell state: " + B10).toString());
                    }
                }
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    public final Object o1(C16439o<E> oVar, int i10, long j10, Object obj) {
        Object B10 = oVar.B(i10);
        if (B10 == null) {
            if (j10 >= (f138277d.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return C16433i.f138319n;
                }
                if (oVar.v(i10, B10, obj)) {
                    Z();
                    return C16433i.f138318m;
                }
            }
        } else if (B10 == C16433i.f138309d && oVar.v(i10, B10, C16433i.f138314i)) {
            Z();
            return oVar.D(i10);
        }
        return p1(oVar, i10, j10, obj);
    }

    private final Object p1(C16439o<E> oVar, int i10, long j10, Object obj) {
        while (true) {
            Object B10 = oVar.B(i10);
            if (B10 == null || B10 == C16433i.f138310e) {
                if (j10 < (f138277d.get(this) & 1152921504606846975L)) {
                    if (oVar.v(i10, B10, C16433i.f138313h)) {
                        Z();
                        return C16433i.f138320o;
                    }
                } else if (obj == null) {
                    return C16433i.f138319n;
                } else {
                    if (oVar.v(i10, B10, obj)) {
                        Z();
                        return C16433i.f138318m;
                    }
                }
            } else if (B10 == C16433i.f138309d) {
                if (oVar.v(i10, B10, C16433i.f138314i)) {
                    Z();
                    return oVar.D(i10);
                }
            } else if (B10 == C16433i.f138315j) {
                return C16433i.f138320o;
            } else {
                if (B10 == C16433i.f138313h) {
                    return C16433i.f138320o;
                }
                if (B10 == C16433i.z()) {
                    Z();
                    return C16433i.f138320o;
                } else if (B10 != C16433i.f138312g && oVar.v(i10, B10, C16433i.f138311f)) {
                    boolean z10 = B10 instanceof C16424C;
                    if (z10) {
                        B10 = ((C16424C) B10).f138270a;
                    }
                    if (k1(B10, oVar, i10)) {
                        oVar.F(i10, C16433i.f138314i);
                        Z();
                        return oVar.D(i10);
                    }
                    oVar.F(i10, C16433i.f138315j);
                    oVar.C(i10, false);
                    if (z10) {
                        Z();
                    }
                    return C16433i.f138320o;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public final int q1(C16439o<E> oVar, int i10, E e10, long j10, Object obj, boolean z10) {
        oVar.G(i10, e10);
        if (z10) {
            return r1(oVar, i10, e10, j10, obj, z10);
        }
        Object B10 = oVar.B(i10);
        if (B10 == null) {
            if (Q(j10)) {
                if (oVar.v(i10, (Object) null, C16433i.f138309d)) {
                    return 1;
                }
            } else if (obj == null) {
                return 3;
            } else {
                if (oVar.v(i10, (Object) null, obj)) {
                    return 2;
                }
            }
        } else if (B10 instanceof q1) {
            oVar.w(i10);
            if (j1(B10, e10)) {
                oVar.F(i10, C16433i.f138314i);
                Q0();
                return 0;
            }
            if (oVar.x(i10, C16433i.f138316k) != C16433i.f138316k) {
                oVar.C(i10, true);
            }
            return 5;
        }
        return r1(oVar, i10, e10, j10, obj, z10);
    }

    private final int r1(C16439o<E> oVar, int i10, E e10, long j10, Object obj, boolean z10) {
        while (true) {
            Object B10 = oVar.B(i10);
            if (B10 == null) {
                if (!Q(j10) || z10) {
                    if (z10) {
                        if (oVar.v(i10, (Object) null, C16433i.f138315j)) {
                            oVar.C(i10, false);
                            return 4;
                        }
                    } else if (obj == null) {
                        return 3;
                    } else {
                        if (oVar.v(i10, (Object) null, obj)) {
                            return 2;
                        }
                    }
                } else if (oVar.v(i10, (Object) null, C16433i.f138309d)) {
                    return 1;
                }
            } else if (B10 == C16433i.f138310e) {
                if (oVar.v(i10, B10, C16433i.f138309d)) {
                    return 1;
                }
            } else if (B10 == C16433i.f138316k) {
                oVar.w(i10);
                return 5;
            } else if (B10 == C16433i.f138313h) {
                oVar.w(i10);
                return 5;
            } else if (B10 == C16433i.z()) {
                oVar.w(i10);
                X();
                return 4;
            } else {
                oVar.w(i10);
                if (B10 instanceof C16424C) {
                    B10 = ((C16424C) B10).f138270a;
                }
                if (j1(B10, e10)) {
                    oVar.F(i10, C16433i.f138314i);
                    Q0();
                    return 0;
                }
                if (oVar.x(i10, C16433i.f138316k) != C16433i.f138316k) {
                    oVar.C(i10, true);
                }
                return 5;
            }
        }
    }

    private final void s1(long j10) {
        long j11;
        AtomicLongFieldUpdater l02 = f138278e;
        do {
            j11 = l02.get(this);
            if (j11 >= j10 || f138278e.compareAndSet(this, j11, j10)) {
            }
            j11 = l02.get(this);
            return;
        } while (f138278e.compareAndSet(this, j11, j10));
    }

    private final void t0(long j10) {
        if ((f138280g.addAndGet(this, j10) & 4611686018427387904L) != 0) {
            do {
            } while ((f138280g.get(this) & 4611686018427387904L) != 0);
        }
    }

    private final void t1(long j10) {
        long j11;
        long j12;
        AtomicLongFieldUpdater p02 = f138277d;
        do {
            j11 = p02.get(this);
            j12 = 1152921504606846975L & j11;
            if (j12 < j10) {
            } else {
                return;
            }
        } while (!f138277d.compareAndSet(this, j11, C16433i.w(j12, (int) (j11 >> 60))));
    }

    static /* synthetic */ void u0(C16432h hVar, long j10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                j10 = 1;
            }
            hVar.t0(j10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
    }

    private final void v0() {
        Object obj;
        AtomicReferenceFieldUpdater h02 = f138285l;
        do {
            obj = h02.get(this);
        } while (!androidx.concurrent.futures.b.a(h02, this, obj, obj == null ? C16433i.f138322q : C16433i.f138323r));
        if (obj != null) {
            C17642l lVar = (C17642l) W.g(obj, 1);
            ((C17642l) obj).invoke(g0());
        }
    }

    private final boolean w0(C16439o<E> oVar, int i10, long j10) {
        Object B10;
        do {
            B10 = oVar.B(i10);
            if (B10 != null && B10 != C16433i.f138310e) {
                if (B10 == C16433i.f138309d) {
                    return true;
                }
                if (B10 == C16433i.f138315j || B10 == C16433i.z() || B10 == C16433i.f138314i || B10 == C16433i.f138313h) {
                    return false;
                }
                if (B10 == C16433i.f138312g) {
                    return true;
                }
                return B10 != C16433i.f138311f && j10 == m0();
            }
        } while (!oVar.v(i10, B10, C16433i.f138313h));
        Z();
        return false;
    }

    private final boolean x0(long j10, boolean z10) {
        int i10 = (int) (j10 >> 60);
        if (i10 == 0 || i10 == 1) {
            return false;
        }
        if (i10 == 2) {
            W(j10 & 1152921504606846975L);
            if (z10 && s0()) {
                return false;
            }
        } else if (i10 == 3) {
            V(j10 & 1152921504606846975L);
        } else {
            throw new IllegalStateException(("unexpected close status: " + i10).toString());
        }
        return true;
    }

    private final boolean z0(long j10) {
        return x0(j10, true);
    }

    public boolean A() {
        return A0(f138277d.get(this));
    }

    /* access modifiers changed from: protected */
    public boolean B0() {
        return false;
    }

    /* access modifiers changed from: protected */
    public void K0() {
    }

    /* access modifiers changed from: protected */
    public void Q0() {
    }

    public boolean R(Throwable th2) {
        if (th2 == null) {
            th2 = new CancellationException("Channel was cancelled");
        }
        return U(th2, true);
    }

    /* access modifiers changed from: protected */
    public void R0() {
    }

    /* access modifiers changed from: protected */
    public boolean U(Throwable th2, boolean z10) {
        if (z10) {
            E0();
        }
        boolean a10 = androidx.concurrent.futures.b.a(f138284k, this, C16433i.f138324s, th2);
        if (z10) {
            F0();
        } else {
            G0();
        }
        X();
        K0();
        if (a10) {
            v0();
        }
        return a10;
    }

    /* access modifiers changed from: protected */
    public final void Y(long j10) {
        S c10;
        C16439o oVar = (C16439o) f138282i.get(this);
        while (true) {
            long j11 = f138278e.get(this);
            if (j10 >= Math.max(((long) this.f138286a) + j11, e0())) {
                if (f138278e.compareAndSet(this, j11, j11 + 1)) {
                    int i10 = C16433i.f138307b;
                    long j12 = j11 / ((long) i10);
                    int i11 = (int) (j11 % ((long) i10));
                    if (oVar.f139524c != j12) {
                        C16439o b02 = b0(j12, oVar);
                        if (b02 == null) {
                            continue;
                        } else {
                            oVar = b02;
                        }
                    }
                    Object o12 = o1(oVar, i11, j11, (Object) null);
                    if (o12 != C16433i.f138320o) {
                        oVar.c();
                        C17642l<E, C16807N> lVar = this.f138287b;
                        if (!(lVar == null || (c10 = w.c(lVar, o12, (S) null, 2, (Object) null)) == null)) {
                            throw c10;
                        }
                    } else if (j11 < q0()) {
                        oVar.c();
                    }
                }
            } else {
                return;
            }
        }
    }

    public boolean a(Throwable th2) {
        return U(th2, false);
    }

    public void b(C17642l<? super Throwable, C16807N> lVar) {
        if (!androidx.concurrent.futures.b.a(f138285l, this, (Object) null, lVar)) {
            AtomicReferenceFieldUpdater h02 = f138285l;
            do {
                Object obj = h02.get(this);
                if (obj != C16433i.f138322q) {
                    if (obj == C16433i.f138323r) {
                        throw new IllegalStateException("Another handler was already registered and successfully invoked");
                    }
                    throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
                }
            } while (!androidx.concurrent.futures.b.a(f138285l, this, C16433i.f138322q, C16433i.f138323r));
            lVar.invoke(g0());
        }
    }

    /* access modifiers changed from: protected */
    public final Throwable g0() {
        return (Throwable) f138284k.get(this);
    }

    public final void i(CancellationException cancellationException) {
        R(cancellationException);
    }

    public C16436l<E> iterator() {
        return new a();
    }

    public Object j(C17164e<? super E> eVar) {
        return X0(this, eVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        return SJ.C16438n.f138330b.c(XH.C16807N.f139792a);
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b8 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object k(E r15) {
        /*
            r14 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = f138277d
            long r0 = r0.get(r14)
            boolean r0 = r14.i1(r0)
            if (r0 == 0) goto L_0x0015
            SJ.n$b r15 = SJ.C16438n.f138330b
            java.lang.Object r15 = r15.b()
            return r15
        L_0x0015:
            WJ.D r8 = SJ.C16433i.f138315j
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f138281h
            java.lang.Object r0 = r0.get(r14)
            SJ.o r0 = (SJ.C16439o) r0
        L_0x0023:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = f138277d
            long r1 = r1.getAndIncrement(r14)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r9 = r1 & r3
            boolean r11 = r14.A0(r1)
            int r1 = SJ.C16433i.f138307b
            long r2 = (long) r1
            long r2 = r9 / r2
            long r4 = (long) r1
            long r4 = r9 % r4
            int r12 = (int) r4
            long r4 = r0.f139524c
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x005b
            SJ.o r1 = r14.c0(r2, r0)
            if (r1 != 0) goto L_0x0059
            if (r11 == 0) goto L_0x0023
        L_0x004d:
            SJ.n$b r15 = SJ.C16438n.f138330b
            java.lang.Throwable r0 = r14.n0()
            java.lang.Object r15 = r15.a(r0)
            goto L_0x00bc
        L_0x0059:
            r13 = r1
            goto L_0x005c
        L_0x005b:
            r13 = r0
        L_0x005c:
            r0 = r14
            r1 = r13
            r2 = r12
            r3 = r15
            r4 = r9
            r6 = r8
            r7 = r11
            int r0 = r0.q1(r1, r2, r3, r4, r6, r7)
            if (r0 == 0) goto L_0x00b8
            r1 = 1
            if (r0 == r1) goto L_0x00af
            r1 = 2
            if (r0 == r1) goto L_0x0092
            r1 = 3
            if (r0 == r1) goto L_0x008a
            r1 = 4
            if (r0 == r1) goto L_0x007e
            r1 = 5
            if (r0 == r1) goto L_0x0079
            goto L_0x007c
        L_0x0079:
            r13.c()
        L_0x007c:
            r0 = r13
            goto L_0x0023
        L_0x007e:
            long r0 = r14.m0()
            int r15 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r15 >= 0) goto L_0x004d
            r13.c()
            goto L_0x004d
        L_0x008a:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected"
            r15.<init>(r0)
            throw r15
        L_0x0092:
            if (r11 == 0) goto L_0x0098
            r13.t()
            goto L_0x004d
        L_0x0098:
            boolean r15 = r8 instanceof QJ.q1
            if (r15 == 0) goto L_0x009f
            QJ.q1 r8 = (QJ.q1) r8
            goto L_0x00a0
        L_0x009f:
            r8 = 0
        L_0x00a0:
            if (r8 == 0) goto L_0x00a5
            r14.V0(r8, r13, r12)
        L_0x00a5:
            r13.t()
            SJ.n$b r15 = SJ.C16438n.f138330b
            java.lang.Object r15 = r15.b()
            goto L_0x00bc
        L_0x00af:
            SJ.n$b r15 = SJ.C16438n.f138330b
            XH.N r0 = XH.C16807N.f139792a
            java.lang.Object r15 = r15.c(r0)
            goto L_0x00bc
        L_0x00b8:
            r13.c()
            goto L_0x00af
        L_0x00bc:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: SJ.C16432h.k(java.lang.Object):java.lang.Object");
    }

    /* access modifiers changed from: protected */
    public final Object l1(E e10) {
        C16439o oVar;
        C16735D d10 = C16433i.f138309d;
        C16439o oVar2 = (C16439o) f138281h.get(this);
        while (true) {
            long andIncrement = f138277d.getAndIncrement(this);
            long j10 = andIncrement & 1152921504606846975L;
            boolean x10 = A0(andIncrement);
            int i10 = C16433i.f138307b;
            long j11 = j10 / ((long) i10);
            int i11 = (int) (j10 % ((long) i10));
            if (oVar2.f139524c != j11) {
                C16439o p10 = c0(j11, oVar2);
                if (p10 != null) {
                    oVar = p10;
                } else if (x10) {
                    return C16438n.f138330b.a(n0());
                }
            } else {
                oVar = oVar2;
            }
            int L10 = q1(oVar, i11, e10, j10, d10, x10);
            if (L10 == 0) {
                oVar.c();
                return C16438n.f138330b.c(C16807N.f139792a);
            } else if (L10 == 1) {
                return C16438n.f138330b.c(C16807N.f139792a);
            } else {
                if (L10 != 2) {
                    if (L10 == 3) {
                        throw new IllegalStateException("unexpected");
                    } else if (L10 != 4) {
                        if (L10 == 5) {
                            oVar.c();
                        }
                        oVar2 = oVar;
                    } else {
                        if (j10 < m0()) {
                            oVar.c();
                        }
                        return C16438n.f138330b.a(n0());
                    }
                } else if (x10) {
                    oVar.t();
                    return C16438n.f138330b.a(n0());
                } else {
                    q1 q1Var = d10 instanceof q1 ? (q1) d10 : null;
                    if (q1Var != null) {
                        V0(q1Var, oVar, i11);
                    }
                    Y((oVar.f139524c * ((long) i10)) + ((long) i11));
                    return C16438n.f138330b.c(C16807N.f139792a);
                }
            }
        }
    }

    public C17012g<C16438n<E>> m() {
        e eVar = e.f138294a;
        C17542s.h(eVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        f fVar = f.f138295a;
        C17542s.h(fVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new C17013h(this, (q) W.g(eVar, 3), (q) W.g(fVar, 3), this.f138288c);
    }

    public final long m0() {
        return f138278e.get(this);
    }

    public Object n(C17164e<? super C16438n<? extends E>> eVar) {
        return Y0(this, eVar);
    }

    /* access modifiers changed from: protected */
    public final Throwable n0() {
        Throwable g02 = g0();
        return g02 == null ? new C16444t("Channel was closed") : g02;
    }

    public final long q0() {
        return f138277d.get(this) & 1152921504606846975L;
    }

    public Object r() {
        C16439o oVar;
        long j10 = f138278e.get(this);
        long j11 = f138277d.get(this);
        if (z0(j11)) {
            return C16438n.f138330b.a(g0());
        }
        if (j10 >= (j11 & 1152921504606846975L)) {
            return C16438n.f138330b.b();
        }
        C16735D i10 = C16433i.f138316k;
        C16439o oVar2 = (C16439o) f138282i.get(this);
        while (!y0()) {
            long andIncrement = f138278e.getAndIncrement(this);
            int i11 = C16433i.f138307b;
            long j12 = andIncrement / ((long) i11);
            int i12 = (int) (andIncrement % ((long) i11));
            if (oVar2.f139524c != j12) {
                C16439o o10 = b0(j12, oVar2);
                if (o10 == null) {
                    continue;
                } else {
                    oVar = o10;
                }
            } else {
                oVar = oVar2;
            }
            Object K10 = o1(oVar, i12, andIncrement, i10);
            if (K10 == C16433i.f138318m) {
                q1 q1Var = i10 instanceof q1 ? (q1) i10 : null;
                if (q1Var != null) {
                    U0(q1Var, oVar, i12);
                }
                u1(andIncrement);
                oVar.t();
                return C16438n.f138330b.b();
            } else if (K10 == C16433i.f138320o) {
                if (andIncrement < q0()) {
                    oVar.c();
                }
                oVar2 = oVar;
            } else if (K10 != C16433i.f138319n) {
                oVar.c();
                return C16438n.f138330b.c(K10);
            } else {
                throw new IllegalStateException("unexpected");
            }
        }
        return C16438n.f138330b.a(g0());
    }

    public final boolean s0() {
        while (true) {
            C16439o oVar = (C16439o) f138282i.get(this);
            long m02 = m0();
            if (q0() <= m02) {
                return false;
            }
            int i10 = C16433i.f138307b;
            long j10 = m02 / ((long) i10);
            if (oVar.f139524c == j10 || (oVar = b0(j10, oVar)) != null) {
                oVar.c();
                if (w0(oVar, (int) (m02 % ((long) i10)), m02)) {
                    return true;
                }
                f138278e.compareAndSet(this, m02, 1 + m02);
            } else if (((C16439o) f138282i.get(this)).f139524c < j10) {
                return false;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v13, types: [WJ.b] */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01d7, code lost:
        r3 = r3.f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01de, code lost:
        if (r3 != null) goto L_0x01ff;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r16 = this;
            r0 = r16
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = f138277d
            long r2 = r2.get(r0)
            r4 = 60
            long r2 = r2 >> r4
            int r2 = (int) r2
            r3 = 3
            r4 = 2
            if (r2 == r4) goto L_0x0020
            if (r2 == r3) goto L_0x001a
            goto L_0x0025
        L_0x001a:
            java.lang.String r2 = "cancelled,"
            r1.append(r2)
            goto L_0x0025
        L_0x0020:
            java.lang.String r2 = "closed,"
            r1.append(r2)
        L_0x0025:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "capacity="
            r2.append(r5)
            int r5 = r0.f138286a
            r2.append(r5)
            r5 = 44
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            java.lang.String r2 = "data=["
            r1.append(r2)
            SJ.o[] r2 = new SJ.C16439o[r3]
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f138282i
            java.lang.Object r3 = r3.get(r0)
            r6 = 0
            r2[r6] = r3
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f138281h
            java.lang.Object r3 = r3.get(r0)
            r7 = 1
            r2[r7] = r3
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f138283j
            java.lang.Object r3 = r3.get(r0)
            r2[r4] = r3
            java.util.List r2 = YH.C16877v.q(r2)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0076:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x008d
            java.lang.Object r4 = r2.next()
            r8 = r4
            SJ.o r8 = (SJ.C16439o) r8
            SJ.o r9 = SJ.C16433i.f138306a
            if (r8 == r9) goto L_0x0076
            r3.add(r4)
            goto L_0x0076
        L_0x008d:
            java.util.Iterator r2 = r3.iterator()
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0203
            java.lang.Object r3 = r2.next()
            boolean r4 = r2.hasNext()
            if (r4 != 0) goto L_0x00a2
            goto L_0x00bc
        L_0x00a2:
            r4 = r3
            SJ.o r4 = (SJ.C16439o) r4
            long r8 = r4.f139524c
        L_0x00a7:
            java.lang.Object r4 = r2.next()
            r10 = r4
            SJ.o r10 = (SJ.C16439o) r10
            long r10 = r10.f139524c
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 <= 0) goto L_0x00b6
            r3 = r4
            r8 = r10
        L_0x00b6:
            boolean r4 = r2.hasNext()
            if (r4 != 0) goto L_0x00a7
        L_0x00bc:
            SJ.o r3 = (SJ.C16439o) r3
            long r10 = r16.m0()
            long r12 = r16.q0()
        L_0x00c6:
            int r2 = SJ.C16433i.f138307b
            r4 = r6
        L_0x00c9:
            if (r4 >= r2) goto L_0x01d7
            long r8 = r3.f139524c
            int r14 = SJ.C16433i.f138307b
            long r14 = (long) r14
            long r8 = r8 * r14
            long r14 = (long) r4
            long r8 = r8 + r14
            int r14 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r14 < 0) goto L_0x00db
            int r15 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r15 >= 0) goto L_0x01e0
        L_0x00db:
            java.lang.Object r15 = r3.B(r4)
            java.lang.Object r6 = r3.A(r4)
            boolean r7 = r15 instanceof QJ.C16320n
            if (r7 == 0) goto L_0x00fd
            int r7 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r7 >= 0) goto L_0x00f1
            if (r14 < 0) goto L_0x00f1
            java.lang.String r7 = "receive"
            goto L_0x019d
        L_0x00f1:
            if (r14 >= 0) goto L_0x00f9
            if (r7 < 0) goto L_0x00f9
            java.lang.String r7 = "send"
            goto L_0x019d
        L_0x00f9:
            java.lang.String r7 = "cont"
            goto L_0x019d
        L_0x00fd:
            boolean r7 = r15 instanceof ZJ.C17016k
            if (r7 == 0) goto L_0x0117
            int r7 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r7 >= 0) goto L_0x010b
            if (r14 < 0) goto L_0x010b
            java.lang.String r7 = "onReceive"
            goto L_0x019d
        L_0x010b:
            if (r14 >= 0) goto L_0x0113
            if (r7 < 0) goto L_0x0113
            java.lang.String r7 = "onSend"
            goto L_0x019d
        L_0x0113:
            java.lang.String r7 = "select"
            goto L_0x019d
        L_0x0117:
            boolean r7 = r15 instanceof SJ.C16450z
            if (r7 == 0) goto L_0x011f
            java.lang.String r7 = "receiveCatching"
            goto L_0x019d
        L_0x011f:
            boolean r7 = r15 instanceof SJ.C16432h.b
            if (r7 == 0) goto L_0x0127
            java.lang.String r7 = "sendBroadcast"
            goto L_0x019d
        L_0x0127:
            boolean r7 = r15 instanceof SJ.C16424C
            if (r7 == 0) goto L_0x0142
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "EB("
            r7.append(r8)
            r7.append(r15)
            r8 = 41
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            goto L_0x019d
        L_0x0142:
            WJ.D r7 = SJ.C16433i.f138311f
            boolean r7 = kotlin.jvm.internal.C17542s.e(r15, r7)
            if (r7 != 0) goto L_0x019b
            WJ.D r7 = SJ.C16433i.f138312g
            boolean r7 = kotlin.jvm.internal.C17542s.e(r15, r7)
            if (r7 == 0) goto L_0x0157
            goto L_0x019b
        L_0x0157:
            if (r15 == 0) goto L_0x01d1
            WJ.D r7 = SJ.C16433i.f138310e
            boolean r7 = kotlin.jvm.internal.C17542s.e(r15, r7)
            if (r7 != 0) goto L_0x01d1
            WJ.D r7 = SJ.C16433i.f138314i
            boolean r7 = kotlin.jvm.internal.C17542s.e(r15, r7)
            if (r7 != 0) goto L_0x01d1
            WJ.D r7 = SJ.C16433i.f138313h
            boolean r7 = kotlin.jvm.internal.C17542s.e(r15, r7)
            if (r7 != 0) goto L_0x01d1
            WJ.D r7 = SJ.C16433i.f138316k
            boolean r7 = kotlin.jvm.internal.C17542s.e(r15, r7)
            if (r7 != 0) goto L_0x01d1
            WJ.D r7 = SJ.C16433i.f138315j
            boolean r7 = kotlin.jvm.internal.C17542s.e(r15, r7)
            if (r7 != 0) goto L_0x01d1
            WJ.D r7 = SJ.C16433i.z()
            boolean r7 = kotlin.jvm.internal.C17542s.e(r15, r7)
            if (r7 == 0) goto L_0x0196
            goto L_0x01d1
        L_0x0196:
            java.lang.String r7 = r15.toString()
            goto L_0x019d
        L_0x019b:
            java.lang.String r7 = "resuming_sender"
        L_0x019d:
            if (r6 == 0) goto L_0x01bf
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r9 = 40
            r8.append(r9)
            r8.append(r7)
            r8.append(r5)
            r8.append(r6)
            java.lang.String r6 = "),"
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r1.append(r6)
            goto L_0x01d1
        L_0x01bf:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r7)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            r1.append(r6)
        L_0x01d1:
            int r4 = r4 + 1
            r6 = 0
            r7 = 1
            goto L_0x00c9
        L_0x01d7:
            WJ.b r2 = r3.f()
            r3 = r2
            SJ.o r3 = (SJ.C16439o) r3
            if (r3 != 0) goto L_0x01ff
        L_0x01e0:
            char r2 = HJ.C15854t.H1(r1)
            if (r2 != r5) goto L_0x01f5
            int r2 = r1.length()
            r4 = 1
            int r2 = r2 - r4
            java.lang.StringBuilder r2 = r1.deleteCharAt(r2)
            java.lang.String r3 = "deleteCharAt(...)"
            kotlin.jvm.internal.C17542s.i(r2, r3)
        L_0x01f5:
            java.lang.String r2 = "]"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            return r1
        L_0x01ff:
            r6 = 0
            r7 = 1
            goto L_0x00c6
        L_0x0203:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: SJ.C16432h.toString():java.lang.String");
    }

    public final void u1(long j10) {
        long j11;
        long j12;
        if (!C0()) {
            do {
            } while (e0() <= j10);
            int g10 = C16433i.f138308c;
            int i10 = 0;
            while (i10 < g10) {
                long e02 = e0();
                if (e02 != (f138280g.get(this) & 4611686018427387903L) || e02 != e0()) {
                    i10++;
                } else {
                    return;
                }
            }
            AtomicLongFieldUpdater i02 = f138280g;
            do {
                j11 = i02.get(this);
            } while (!i02.compareAndSet(this, j11, C16433i.v(j11 & 4611686018427387903L, true)));
            while (true) {
                long e03 = e0();
                long j13 = f138280g.get(this);
                long j14 = j13 & 4611686018427387903L;
                boolean z10 = (4611686018427387904L & j13) != 0;
                if (e03 == j14 && e03 == e0()) {
                    break;
                } else if (!z10) {
                    f138280g.compareAndSet(this, j13, C16433i.v(j14, true));
                }
            }
            AtomicLongFieldUpdater i03 = f138280g;
            do {
                j12 = i03.get(this);
            } while (!i03.compareAndSet(this, j12, C16433i.v(j12 & 4611686018427387903L, false)));
        }
    }

    public Object y(E e10, C17164e<? super C16807N> eVar) {
        return g1(this, e10, eVar);
    }

    public boolean y0() {
        return z0(f138277d.get(this));
    }
}
