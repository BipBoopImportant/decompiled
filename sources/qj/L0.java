package QJ;

import GJ.C15765h;
import GJ.C15767j;
import GJ.C15768k;
import QJ.F0;
import WJ.C16754o;
import XH.C16807N;
import XH.C16814e;
import XH.C16816g;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\f\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0006\u0001©\u0001ª\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\t\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0019\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001b\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u000fH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\"\u0010#J\u001d\u0010$\u001a\u00020\u0014*\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b$\u0010!J\u0019\u0010&\u001a\u00020%2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020(H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020+H\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0004H\u0002¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0014H@¢\u0006\u0004\b0\u00101J\u001b\u00102\u001a\u0004\u0018\u00010\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b2\u00103J\u0019\u00104\u001a\u00020\u000f2\b\u0010\u001f\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b4\u00105J\u001b\u00106\u001a\u0004\u0018\u00010\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b6\u00103J\u0019\u00107\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\t\u001a\u00020\u0017H\u0002¢\u0006\u0004\b7\u00108J\u001f\u00109\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u000fH\u0002¢\u0006\u0004\b9\u0010:J%\u0010;\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b;\u0010<J#\u0010=\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\u00172\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b=\u0010>J*\u0010A\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010@\u001a\u00020?2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0010¢\u0006\u0004\bA\u0010BJ)\u0010D\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b2\u0006\u0010C\u001a\u00020?2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\bD\u0010EJ\u0015\u0010G\u001a\u0004\u0018\u00010?*\u00020FH\u0002¢\u0006\u0004\bG\u0010HJ\u0019\u0010J\u001a\u00020I2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\bJ\u0010KJ\u0012\u0010L\u001a\u0004\u0018\u00010\nH@¢\u0006\u0004\bL\u00101J\u0019\u0010N\u001a\u00020\u00142\b\u0010M\u001a\u0004\u0018\u00010\u0001H\u0004¢\u0006\u0004\bN\u0010OJ\r\u0010P\u001a\u00020\u0004¢\u0006\u0004\bP\u0010/J\u000f\u0010Q\u001a\u00020\u0014H\u0014¢\u0006\u0004\bQ\u0010RJ\u0011\u0010U\u001a\u00060Sj\u0002`T¢\u0006\u0004\bU\u0010VJ#\u0010X\u001a\u00060Sj\u0002`T*\u00020\u000f2\n\b\u0002\u0010W\u001a\u0004\u0018\u00010IH\u0004¢\u0006\u0004\bX\u0010YJ'\u0010^\u001a\u00020]2\u0018\u0010\\\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00140Zj\u0002`[¢\u0006\u0004\b^\u0010_J7\u0010b\u001a\u00020]2\u0006\u0010`\u001a\u00020\u00042\u0006\u0010a\u001a\u00020\u00042\u0018\u0010\\\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00140Zj\u0002`[¢\u0006\u0004\bb\u0010cJ\u001f\u0010e\u001a\u00020]2\u0006\u0010a\u001a\u00020\u00042\u0006\u0010d\u001a\u00020+H\u0000¢\u0006\u0004\be\u0010fJ\u0010\u0010g\u001a\u00020\u0014H@¢\u0006\u0004\bg\u00101J\u0017\u0010h\u001a\u00020\u00142\u0006\u0010d\u001a\u00020+H\u0000¢\u0006\u0004\bh\u0010-J\u001f\u0010i\u001a\u00020\u00142\u000e\u0010\u001f\u001a\n\u0018\u00010Sj\u0004\u0018\u0001`TH\u0016¢\u0006\u0004\bi\u0010jJ\u000f\u0010k\u001a\u00020IH\u0014¢\u0006\u0004\bk\u0010lJ\u0017\u0010m\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u000fH\u0016¢\u0006\u0004\bm\u0010nJ\u0015\u0010p\u001a\u00020\u00142\u0006\u0010o\u001a\u00020\u0003¢\u0006\u0004\bp\u0010qJ\u0017\u0010r\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u000fH\u0016¢\u0006\u0004\br\u0010#J\u0017\u0010s\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\bs\u0010#J\u0019\u0010t\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0004\bt\u0010uJ\u0013\u0010v\u001a\u00060Sj\u0002`TH\u0016¢\u0006\u0004\bv\u0010VJ\u0019\u0010w\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0004\bw\u0010uJ\u001b\u0010x\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0004\bx\u00103J\u0015\u0010z\u001a\u00020y2\u0006\u0010@\u001a\u00020\u0002¢\u0006\u0004\bz\u0010{J\u0017\u0010}\u001a\u00020\u00142\u0006\u0010|\u001a\u00020\u000fH\u0010¢\u0006\u0004\b}\u0010nJ\u0019\u0010~\u001a\u00020\u00142\b\u0010\u001f\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b~\u0010nJ\u0017\u0010\u001a\u00020\u00042\u0006\u0010|\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010#J\u001c\u0010\u0001\u001a\u00020\u00142\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0006\b\u0001\u0010\u0001J\u001c\u0010\u0001\u001a\u00020\u00142\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0006\b\u0001\u0010\u0001J\u0011\u0010\u0001\u001a\u00020IH\u0016¢\u0006\u0005\b\u0001\u0010lJ\u0011\u0010\u0001\u001a\u00020IH\u0007¢\u0006\u0005\b\u0001\u0010lJ\u0011\u0010\u0001\u001a\u00020IH\u0010¢\u0006\u0005\b\u0001\u0010lJ\u0014\u0010\u0001\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0006\b\u0001\u0010\u0001J\u0014\u0010\u0001\u001a\u0004\u0018\u00010\nH@¢\u0006\u0005\b\u0001\u00101R\u001e\u0010\u0001\u001a\u0004\u0018\u00010\u000f*\u0004\u0018\u00010\n8BX\u0004¢\u0006\u0007\u001a\u0005\b\u0001\u00105R\u0019\u0010\u0001\u001a\u0007\u0012\u0002\b\u00030\u00018F¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001R.\u0010\u0001\u001a\u0004\u0018\u00010y2\t\u0010\u0001\u001a\u0004\u0018\u00010y8@@@X\u000e¢\u0006\u0010\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R\u0018\u0010M\u001a\u0004\u0018\u00010\u00018VX\u0004¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8@X\u0004¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001R\u0016\u0010\u0001\u001a\u00020\u00048VX\u0004¢\u0006\u0007\u001a\u0005\b\u0001\u0010/R\u0013\u0010\u0001\u001a\u00020\u00048F¢\u0006\u0007\u001a\u0005\b\u0001\u0010/R\u0013\u0010\u0001\u001a\u00020\u00048F¢\u0006\u0007\u001a\u0005\b\u0001\u0010/R\u0016\u0010\u0001\u001a\u00020\u00048PX\u0004¢\u0006\u0007\u001a\u0005\b\u0001\u0010/R\u001b\u0010¢\u0001\u001a\t\u0012\u0004\u0012\u00020\u00010\u00018F¢\u0006\b\u001a\u0006\b \u0001\u0010¡\u0001R\u0016\u0010¤\u0001\u001a\u00020\u00048TX\u0004¢\u0006\u0007\u001a\u0005\b£\u0001\u0010/R\u0016\u0010¦\u0001\u001a\u00020\u00048PX\u0004¢\u0006\u0007\u001a\u0005\b¥\u0001\u0010/R\u0014\u0010§\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\n8\u0002X\u0004R\u0014\u0010¨\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010y0\n8\u0002X\u0004¨\u0006«\u0001"}, d2 = {"LQJ/L0;", "LQJ/F0;", "LQJ/w;", "LQJ/U0;", "", "active", "<init>", "(Z)V", "LQJ/L0$c;", "state", "", "proposedUpdate", "c0", "(LQJ/L0$c;Ljava/lang/Object;)Ljava/lang/Object;", "", "", "exceptions", "k0", "(LQJ/L0$c;Ljava/util/List;)Ljava/lang/Throwable;", "rootCause", "LXH/N;", "H", "(Ljava/lang/Throwable;Ljava/util/List;)V", "LQJ/A0;", "update", "W0", "(LQJ/A0;Ljava/lang/Object;)Z", "Z", "(LQJ/A0;Ljava/lang/Object;)V", "LQJ/Q0;", "list", "cause", "I0", "(LQJ/Q0;Ljava/lang/Throwable;)V", "W", "(Ljava/lang/Throwable;)Z", "J0", "", "R0", "(Ljava/lang/Object;)I", "LQJ/n0;", "N0", "(LQJ/n0;)V", "LQJ/K0;", "O0", "(LQJ/K0;)V", "B0", "()Z", "C0", "(LdI/e;)Ljava/lang/Object;", "V", "(Ljava/lang/Object;)Ljava/lang/Object;", "b0", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "D0", "n0", "(LQJ/A0;)LQJ/Q0;", "X0", "(LQJ/A0;Ljava/lang/Throwable;)Z", "Y0", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Z0", "(LQJ/A0;Ljava/lang/Object;)Ljava/lang/Object;", "LQJ/v;", "child", "a1", "(LQJ/L0$c;LQJ/v;Ljava/lang/Object;)Z", "lastChild", "a0", "(LQJ/L0$c;LQJ/v;Ljava/lang/Object;)V", "LWJ/o;", "H0", "(LWJ/o;)LQJ/v;", "", "S0", "(Ljava/lang/Object;)Ljava/lang/String;", "O", "parent", "x0", "(LQJ/F0;)V", "start", "M0", "()V", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "x", "()Ljava/util/concurrent/CancellationException;", "message", "T0", "(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;", "Lkotlin/Function1;", "Lkotlinx/coroutines/CompletionHandler;", "handler", "LQJ/k0;", "s", "(LnI/l;)LQJ/k0;", "onCancelling", "invokeImmediately", "A0", "(ZZLnI/l;)LQJ/k0;", "node", "y0", "(ZLQJ/K0;)LQJ/k0;", "j0", "P0", "i", "(Ljava/util/concurrent/CancellationException;)V", "X", "()Ljava/lang/String;", "S", "(Ljava/lang/Throwable;)V", "parentJob", "p0", "(LQJ/U0;)V", "Y", "Q", "R", "(Ljava/lang/Object;)Z", "e0", "E0", "F0", "LQJ/u;", "q", "(LQJ/w;)LQJ/u;", "exception", "w0", "K0", "v0", "L0", "(Ljava/lang/Object;)V", "L", "toString", "V0", "G0", "d0", "()Ljava/lang/Object;", "M", "g0", "exceptionOrNull", "LdI/i$c;", "getKey", "()LdI/i$c;", "key", "value", "q0", "()LQJ/u;", "Q0", "(LQJ/u;)V", "parentHandle", "o0", "()LQJ/F0;", "r0", "c", "isActive", "h", "isCompleted", "isCancelled", "m0", "onCancelComplete", "LGJ/h;", "e", "()LGJ/h;", "children", "z0", "isScopedCoroutine", "l0", "handlesException", "_state", "_parentHandle", "b", "a", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public class L0 implements F0, C16337w, U0 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f137569a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f137570b;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LQJ/L0$a;", "T", "LQJ/p;", "LdI/e;", "delegate", "LQJ/L0;", "job", "<init>", "(LdI/e;LQJ/L0;)V", "LQJ/F0;", "parent", "", "t", "(LQJ/F0;)Ljava/lang/Throwable;", "", "M", "()Ljava/lang/String;", "i", "LQJ/L0;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a<T> extends C16324p<T> {

        /* renamed from: i  reason: collision with root package name */
        private final L0 f137571i;

        public a(C17164e<? super T> eVar, L0 l02) {
            super(eVar, 1);
            this.f137571i = l02;
        }

        /* access modifiers changed from: protected */
        public String M() {
            return "AwaitContinuation";
        }

        public Throwable t(F0 f02) {
            Throwable f10;
            Object r02 = this.f137571i.r0();
            return (!(r02 instanceof c) || (f10 = ((c) r02).f()) == null) ? r02 instanceof C16285C ? ((C16285C) r02).f137555a : f02.x() : f10;
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198VX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"LQJ/L0$b;", "LQJ/K0;", "LQJ/L0;", "parent", "LQJ/L0$c;", "state", "LQJ/v;", "child", "", "proposedUpdate", "<init>", "(LQJ/L0;LQJ/L0$c;LQJ/v;Ljava/lang/Object;)V", "", "cause", "LXH/N;", "x", "(Ljava/lang/Throwable;)V", "e", "LQJ/L0;", "f", "LQJ/L0$c;", "g", "LQJ/v;", "h", "Ljava/lang/Object;", "", "w", "()Z", "onCancelling", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class b extends K0 {

        /* renamed from: e  reason: collision with root package name */
        private final L0 f137572e;

        /* renamed from: f  reason: collision with root package name */
        private final c f137573f;

        /* renamed from: g  reason: collision with root package name */
        private final C16335v f137574g;

        /* renamed from: h  reason: collision with root package name */
        private final Object f137575h;

        public b(L0 l02, c cVar, C16335v vVar, Object obj) {
            this.f137572e = l02;
            this.f137573f = cVar;
            this.f137574g = vVar;
            this.f137575h = obj;
        }

        public boolean w() {
            return false;
        }

        public void x(Throwable th2) {
            this.f137572e.a0(this.f137573f, this.f137574g, this.f137575h);
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001c\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\b0\fj\b\u0012\u0004\u0012\u00020\b`\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR(\u0010#\u001a\u0004\u0018\u00010\u00012\b\u0010\u001e\u001a\u0004\u0018\u00010\u00018B@BX\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00068F@FX\u000e¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R(\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\b8F@FX\u000e¢\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010\u0017R\u0011\u0010,\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b+\u0010%R\u0011\u0010.\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b-\u0010%R\u0014\u00100\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b/\u0010%R\u000b\u00101\u001a\u00020\u00018\u0002X\u0004R\u0013\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00018\u0002X\u0004R\u0013\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00018\u0002X\u0004¨\u00064"}, d2 = {"LQJ/L0$c;", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "LQJ/A0;", "LQJ/Q0;", "list", "", "isCompleting", "", "rootCause", "<init>", "(LQJ/Q0;ZLjava/lang/Throwable;)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "d", "()Ljava/util/ArrayList;", "proposedException", "", "m", "(Ljava/lang/Throwable;)Ljava/util/List;", "exception", "LXH/N;", "b", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "a", "LQJ/Q0;", "()LQJ/Q0;", "value", "e", "()Ljava/lang/Object;", "o", "(Ljava/lang/Object;)V", "exceptionsHolder", "k", "()Z", "n", "(Z)V", "f", "()Ljava/lang/Throwable;", "p", "l", "isSealed", "j", "isCancelling", "c", "isActive", "_isCompleting", "_rootCause", "_exceptionsHolder", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class c implements A0 {
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f137576b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f137577c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f137578d;
        private volatile /* synthetic */ Object _exceptionsHolder$volatile;
        private volatile /* synthetic */ int _isCompleting$volatile;
        private volatile /* synthetic */ Object _rootCause$volatile;

        /* renamed from: a  reason: collision with root package name */
        private final Q0 f137579a;

        static {
            Class<c> cls = c.class;
            f137576b = AtomicIntegerFieldUpdater.newUpdater(cls, "_isCompleting$volatile");
            Class<Object> cls2 = Object.class;
            f137577c = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_rootCause$volatile");
            f137578d = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_exceptionsHolder$volatile");
        }

        public c(Q0 q02, boolean z10, Throwable th2) {
            this.f137579a = q02;
            this._isCompleting$volatile = z10 ? 1 : 0;
            this._rootCause$volatile = th2;
        }

        private final ArrayList<Throwable> d() {
            return new ArrayList<>(4);
        }

        private final Object e() {
            return f137578d.get(this);
        }

        private final void o(Object obj) {
            f137578d.set(this, obj);
        }

        public Q0 a() {
            return this.f137579a;
        }

        public final void b(Throwable th2) {
            Throwable f10 = f();
            if (f10 == null) {
                p(th2);
            } else if (th2 != f10) {
                Object e10 = e();
                if (e10 == null) {
                    o(th2);
                } else if (e10 instanceof Throwable) {
                    if (th2 != e10) {
                        ArrayList<Throwable> d10 = d();
                        d10.add(e10);
                        d10.add(th2);
                        o(d10);
                    }
                } else if (e10 instanceof ArrayList) {
                    ((ArrayList) e10).add(th2);
                } else {
                    throw new IllegalStateException(("State is " + e10).toString());
                }
            }
        }

        public boolean c() {
            return f() == null;
        }

        public final Throwable f() {
            return (Throwable) f137577c.get(this);
        }

        public final boolean j() {
            return f() != null;
        }

        public final boolean k() {
            return f137576b.get(this) == 1;
        }

        public final boolean l() {
            return e() == M0.f137590e;
        }

        public final List<Throwable> m(Throwable th2) {
            ArrayList<Throwable> arrayList;
            Object e10 = e();
            if (e10 == null) {
                arrayList = d();
            } else if (e10 instanceof Throwable) {
                ArrayList<Throwable> d10 = d();
                d10.add(e10);
                arrayList = d10;
            } else if (e10 instanceof ArrayList) {
                arrayList = (ArrayList) e10;
            } else {
                throw new IllegalStateException(("State is " + e10).toString());
            }
            Throwable f10 = f();
            if (f10 != null) {
                arrayList.add(0, f10);
            }
            if (th2 != null && !C17542s.e(th2, f10)) {
                arrayList.add(th2);
            }
            o(M0.f137590e);
            return arrayList;
        }

        public final void n(boolean z10) {
            f137576b.set(this, z10 ? 1 : 0);
        }

        public final void p(Throwable th2) {
            f137577c.set(this, th2);
        }

        public String toString() {
            return "Finishing[cancelling=" + j() + ", completing=" + k() + ", rootCause=" + f() + ", exceptions=" + e() + ", list=" + a() + ']';
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LGJ/j;", "LQJ/F0;", "LXH/N;", "<anonymous>", "(LGJ/j;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "kotlinx.coroutines.JobSupport$children$1", f = "JobSupport.kt", l = {1003, 1005}, m = "invokeSuspend")
    static final class d extends k implements p<C15767j<? super F0>, C17164e<? super C16807N>, Object> {

        /* renamed from: d  reason: collision with root package name */
        Object f137580d;

        /* renamed from: e  reason: collision with root package name */
        Object f137581e;

        /* renamed from: f  reason: collision with root package name */
        int f137582f;

        /* renamed from: g  reason: collision with root package name */
        private /* synthetic */ Object f137583g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ L0 f137584h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(L0 l02, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f137584h = l02;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            d dVar = new d(this.f137584h, eVar);
            dVar.f137583g = obj;
            return dVar;
        }

        /* renamed from: i */
        public final Object invoke(C15767j<? super F0> jVar, C17164e<? super C16807N> eVar) {
            return ((d) create(jVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0069  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r6.f137582f
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x002a
                if (r1 == r3) goto L_0x0026
                if (r1 != r2) goto L_0x001e
                java.lang.Object r1 = r6.f137581e
                WJ.o r1 = (WJ.C16754o) r1
                java.lang.Object r3 = r6.f137580d
                WJ.n r3 = (WJ.C16753n) r3
                java.lang.Object r4 = r6.f137583g
                GJ.j r4 = (GJ.C15767j) r4
                XH.y.b(r7)
                goto L_0x0081
            L_0x001e:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L_0x0026:
                XH.y.b(r7)
                goto L_0x0086
            L_0x002a:
                XH.y.b(r7)
                java.lang.Object r7 = r6.f137583g
                GJ.j r7 = (GJ.C15767j) r7
                QJ.L0 r1 = r6.f137584h
                java.lang.Object r1 = r1.r0()
                boolean r4 = r1 instanceof QJ.C16335v
                if (r4 == 0) goto L_0x0048
                QJ.v r1 = (QJ.C16335v) r1
                QJ.w r1 = r1.f137684e
                r6.f137582f = r3
                java.lang.Object r7 = r7.d(r1, r6)
                if (r7 != r0) goto L_0x0086
                return r0
            L_0x0048:
                boolean r3 = r1 instanceof QJ.A0
                if (r3 == 0) goto L_0x0086
                QJ.A0 r1 = (QJ.A0) r1
                QJ.Q0 r1 = r1.a()
                if (r1 == 0) goto L_0x0086
                java.lang.Object r3 = r1.l()
                java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
                kotlin.jvm.internal.C17542s.h(r3, r4)
                WJ.o r3 = (WJ.C16754o) r3
                r4 = r7
                r5 = r3
                r3 = r1
                r1 = r5
            L_0x0063:
                boolean r7 = kotlin.jvm.internal.C17542s.e(r1, r3)
                if (r7 != 0) goto L_0x0086
                boolean r7 = r1 instanceof QJ.C16335v
                if (r7 == 0) goto L_0x0081
                r7 = r1
                QJ.v r7 = (QJ.C16335v) r7
                QJ.w r7 = r7.f137684e
                r6.f137583g = r4
                r6.f137580d = r3
                r6.f137581e = r1
                r6.f137582f = r2
                java.lang.Object r7 = r4.d(r7, r6)
                if (r7 != r0) goto L_0x0081
                return r0
            L_0x0081:
                WJ.o r1 = r1.m()
                goto L_0x0063
            L_0x0086:
                XH.N r7 = XH.C16807N.f139792a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: QJ.L0.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        Class<L0> cls = L0.class;
        Class<Object> cls2 = Object.class;
        f137569a = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_state$volatile");
        f137570b = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_parentHandle$volatile");
    }

    public L0(boolean z10) {
        this._state$volatile = z10 ? M0.f137592g : M0.f137591f;
    }

    private final boolean B0() {
        Object r02;
        do {
            r02 = r0();
            if (!(r02 instanceof A0)) {
                return false;
            }
        } while (R0(r02) < 0);
        return true;
    }

    private final Object C0(C17164e<? super C16807N> eVar) {
        C16324p pVar = new C16324p(C17187b.c(eVar), 1);
        pVar.C();
        r.a(pVar, J0.o(this, false, new W0(pVar), 1, (Object) null));
        Object w10 = pVar.w();
        if (w10 == C17187b.f()) {
            h.c(eVar);
        }
        return w10 == C17187b.f() ? w10 : C16807N.f139792a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003e, code lost:
        if (r0 == null) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0040, code lost:
        I0(((QJ.L0.c) r2).a(), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004d, code lost:
        return QJ.M0.f137586a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object D0(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            java.lang.Object r2 = r6.r0()
            boolean r3 = r2 instanceof QJ.L0.c
            if (r3 == 0) goto L_0x0050
            monitor-enter(r2)
            r3 = r2
            QJ.L0$c r3 = (QJ.L0.c) r3     // Catch:{ all -> 0x001a }
            boolean r3 = r3.l()     // Catch:{ all -> 0x001a }
            if (r3 == 0) goto L_0x001c
            WJ.D r7 = QJ.M0.f137589d     // Catch:{ all -> 0x001a }
            monitor-exit(r2)
            return r7
        L_0x001a:
            r7 = move-exception
            goto L_0x004e
        L_0x001c:
            r3 = r2
            QJ.L0$c r3 = (QJ.L0.c) r3     // Catch:{ all -> 0x001a }
            boolean r3 = r3.j()     // Catch:{ all -> 0x001a }
            if (r7 != 0) goto L_0x0027
            if (r3 != 0) goto L_0x0033
        L_0x0027:
            if (r1 != 0) goto L_0x002d
            java.lang.Throwable r1 = r6.b0(r7)     // Catch:{ all -> 0x001a }
        L_0x002d:
            r7 = r2
            QJ.L0$c r7 = (QJ.L0.c) r7     // Catch:{ all -> 0x001a }
            r7.b(r1)     // Catch:{ all -> 0x001a }
        L_0x0033:
            r7 = r2
            QJ.L0$c r7 = (QJ.L0.c) r7     // Catch:{ all -> 0x001a }
            java.lang.Throwable r7 = r7.f()     // Catch:{ all -> 0x001a }
            if (r3 != 0) goto L_0x003d
            r0 = r7
        L_0x003d:
            monitor-exit(r2)
            if (r0 == 0) goto L_0x0049
            QJ.L0$c r2 = (QJ.L0.c) r2
            QJ.Q0 r7 = r2.a()
            r6.I0(r7, r0)
        L_0x0049:
            WJ.D r7 = QJ.M0.f137586a
            return r7
        L_0x004e:
            monitor-exit(r2)
            throw r7
        L_0x0050:
            boolean r3 = r2 instanceof QJ.A0
            if (r3 == 0) goto L_0x00a1
            if (r1 != 0) goto L_0x005a
            java.lang.Throwable r1 = r6.b0(r7)
        L_0x005a:
            r3 = r2
            QJ.A0 r3 = (QJ.A0) r3
            boolean r4 = r3.c()
            if (r4 == 0) goto L_0x006e
            boolean r2 = r6.X0(r3, r1)
            if (r2 == 0) goto L_0x0002
            WJ.D r7 = QJ.M0.f137586a
            return r7
        L_0x006e:
            QJ.C r3 = new QJ.C
            r4 = 0
            r5 = 2
            r3.<init>(r1, r4, r5, r0)
            java.lang.Object r3 = r6.Y0(r2, r3)
            WJ.D r4 = QJ.M0.f137586a
            if (r3 == r4) goto L_0x0086
            WJ.D r2 = QJ.M0.f137588c
            if (r3 == r2) goto L_0x0002
            return r3
        L_0x0086:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot happen in "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L_0x00a1:
            WJ.D r7 = QJ.M0.f137589d
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: QJ.L0.D0(java.lang.Object):java.lang.Object");
    }

    private final void H(Throwable th2, List<? extends Throwable> list) {
        if (list.size() > 1) {
            Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
            for (Throwable th3 : list) {
                if (th3 != th2 && th3 != th2 && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                    C16816g.a(th2, th3);
                }
            }
        }
    }

    private final C16335v H0(C16754o oVar) {
        while (oVar.r()) {
            oVar = oVar.n();
        }
        while (true) {
            oVar = oVar.m();
            if (!oVar.r()) {
                if (oVar instanceof C16335v) {
                    return (C16335v) oVar;
                }
                if (oVar instanceof Q0) {
                    return null;
                }
            }
        }
    }

    private final void I0(Q0 q02, Throwable th2) {
        K0(th2);
        q02.g(4);
        Object l10 = q02.l();
        C17542s.h(l10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        C16286D d10 = null;
        for (C16754o oVar = (C16754o) l10; !C17542s.e(oVar, q02); oVar = oVar.m()) {
            if ((oVar instanceof K0) && ((K0) oVar).w()) {
                try {
                    ((K0) oVar).x(th2);
                } catch (Throwable th3) {
                    if (d10 != null) {
                        C16816g.a(d10, th3);
                    } else {
                        d10 = new C16286D("Exception in completion handler " + oVar + " for " + this, th3);
                        C16807N n10 = C16807N.f139792a;
                    }
                }
            }
        }
        if (d10 != null) {
            w0(d10);
        }
        W(th2);
    }

    private final void J0(Q0 q02, Throwable th2) {
        q02.g(1);
        Object l10 = q02.l();
        C17542s.h(l10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        C16286D d10 = null;
        for (C16754o oVar = (C16754o) l10; !C17542s.e(oVar, q02); oVar = oVar.m()) {
            if (oVar instanceof K0) {
                try {
                    ((K0) oVar).x(th2);
                } catch (Throwable th3) {
                    if (d10 != null) {
                        C16816g.a(d10, th3);
                    } else {
                        d10 = new C16286D("Exception in completion handler " + oVar + " for " + this, th3);
                        C16807N n10 = C16807N.f139792a;
                    }
                }
            }
        }
        if (d10 != null) {
            w0(d10);
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [QJ.z0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void N0(QJ.C16321n0 r3) {
        /*
            r2 = this;
            QJ.Q0 r0 = new QJ.Q0
            r0.<init>()
            boolean r1 = r3.c()
            if (r1 == 0) goto L_0x000c
            goto L_0x0012
        L_0x000c:
            QJ.z0 r1 = new QJ.z0
            r1.<init>(r0)
            r0 = r1
        L_0x0012:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f137569a
            androidx.concurrent.futures.b.a(r1, r2, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: QJ.L0.N0(QJ.n0):void");
    }

    private final Object O(C17164e<Object> eVar) {
        a aVar = new a(C17187b.c(eVar), this);
        aVar.C();
        r.a(aVar, J0.o(this, false, new V0(aVar), 1, (Object) null));
        Object w10 = aVar.w();
        if (w10 == C17187b.f()) {
            h.c(eVar);
        }
        return w10;
    }

    private final void O0(K0 k02) {
        k02.f(new Q0());
        androidx.concurrent.futures.b.a(f137569a, this, k02, k02.m());
    }

    private final int R0(Object obj) {
        if (obj instanceof C16321n0) {
            if (((C16321n0) obj).c()) {
                return 0;
            }
            if (!androidx.concurrent.futures.b.a(f137569a, this, obj, M0.f137592g)) {
                return -1;
            }
            M0();
            return 1;
        } else if (!(obj instanceof C16344z0)) {
            return 0;
        } else {
            if (!androidx.concurrent.futures.b.a(f137569a, this, obj, ((C16344z0) obj).a())) {
                return -1;
            }
            M0();
            return 1;
        }
    }

    private final String S0(Object obj) {
        if (!(obj instanceof c)) {
            return obj instanceof A0 ? ((A0) obj).c() ? "Active" : "New" : obj instanceof C16285C ? "Cancelled" : "Completed";
        }
        c cVar = (c) obj;
        return cVar.j() ? "Cancelling" : cVar.k() ? "Completing" : "Active";
    }

    public static /* synthetic */ CancellationException U0(L0 l02, Throwable th2, String str, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                str = null;
            }
            return l02.T0(th2, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
    }

    private final Object V(Object obj) {
        Object Y02;
        do {
            Object r02 = r0();
            if (!(r02 instanceof A0) || ((r02 instanceof c) && ((c) r02).k())) {
                return M0.f137586a;
            }
            Y02 = Y0(r02, new C16285C(b0(obj), false, 2, (DefaultConstructorMarker) null));
        } while (Y02 == M0.f137588c);
        return Y02;
    }

    private final boolean W(Throwable th2) {
        if (z0()) {
            return true;
        }
        boolean z10 = th2 instanceof CancellationException;
        C16333u q02 = q0();
        return (q02 == null || q02 == S0.f137600a) ? z10 : q02.j(th2) || z10;
    }

    private final boolean W0(A0 a02, Object obj) {
        if (!androidx.concurrent.futures.b.a(f137569a, this, a02, M0.g(obj))) {
            return false;
        }
        K0((Throwable) null);
        L0(obj);
        Z(a02, obj);
        return true;
    }

    private final boolean X0(A0 a02, Throwable th2) {
        Q0 n02 = n0(a02);
        if (n02 == null) {
            return false;
        }
        if (!androidx.concurrent.futures.b.a(f137569a, this, a02, new c(n02, false, th2))) {
            return false;
        }
        I0(n02, th2);
        return true;
    }

    private final Object Y0(Object obj, Object obj2) {
        return !(obj instanceof A0) ? M0.f137586a : (((obj instanceof C16321n0) || (obj instanceof K0)) && !(obj instanceof C16335v) && !(obj2 instanceof C16285C)) ? W0((A0) obj, obj2) ? obj2 : M0.f137588c : Z0((A0) obj, obj2);
    }

    private final void Z(A0 a02, Object obj) {
        C16333u q02 = q0();
        if (q02 != null) {
            q02.b();
            Q0(S0.f137600a);
        }
        Throwable th2 = null;
        C16285C c10 = obj instanceof C16285C ? (C16285C) obj : null;
        if (c10 != null) {
            th2 = c10.f137555a;
        }
        if (a02 instanceof K0) {
            try {
                ((K0) a02).x(th2);
            } catch (Throwable th3) {
                w0(new C16286D("Exception in completion handler " + a02 + " for " + this, th3));
            }
        } else {
            Q0 a10 = a02.a();
            if (a10 != null) {
                J0(a10, th2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0067, code lost:
        if (r2 == null) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0069, code lost:
        I0(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x006c, code lost:
        r6 = H0(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0070, code lost:
        if (r6 == null) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0076, code lost:
        if (a1(r1, r6, r7) == false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x007a, code lost:
        return QJ.M0.f137587b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x007b, code lost:
        r0.g(2);
        r6 = H0(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0083, code lost:
        if (r6 == null) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0089, code lost:
        if (a1(r1, r6, r7) == false) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x008d, code lost:
        return QJ.M0.f137587b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0092, code lost:
        return c0(r1, r7);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object Z0(QJ.A0 r6, java.lang.Object r7) {
        /*
            r5 = this;
            QJ.Q0 r0 = r5.n0(r6)
            if (r0 != 0) goto L_0x000b
            WJ.D r6 = QJ.M0.f137588c
            return r6
        L_0x000b:
            boolean r1 = r6 instanceof QJ.L0.c
            r2 = 0
            if (r1 == 0) goto L_0x0014
            r1 = r6
            QJ.L0$c r1 = (QJ.L0.c) r1
            goto L_0x0015
        L_0x0014:
            r1 = r2
        L_0x0015:
            r3 = 0
            if (r1 != 0) goto L_0x001d
            QJ.L0$c r1 = new QJ.L0$c
            r1.<init>(r0, r3, r2)
        L_0x001d:
            kotlin.jvm.internal.O r3 = new kotlin.jvm.internal.O
            r3.<init>()
            monitor-enter(r1)
            boolean r4 = r1.k()     // Catch:{ all -> 0x002f }
            if (r4 == 0) goto L_0x0031
            WJ.D r6 = QJ.M0.f137586a     // Catch:{ all -> 0x002f }
            monitor-exit(r1)
            return r6
        L_0x002f:
            r6 = move-exception
            goto L_0x0093
        L_0x0031:
            r4 = 1
            r1.n(r4)     // Catch:{ all -> 0x002f }
            if (r1 == r6) goto L_0x0047
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f137569a     // Catch:{ all -> 0x002f }
            boolean r6 = androidx.concurrent.futures.b.a(r4, r5, r6, r1)     // Catch:{ all -> 0x002f }
            if (r6 != 0) goto L_0x0047
            WJ.D r6 = QJ.M0.f137588c     // Catch:{ all -> 0x002f }
            monitor-exit(r1)
            return r6
        L_0x0047:
            boolean r6 = r1.j()     // Catch:{ all -> 0x002f }
            boolean r4 = r7 instanceof QJ.C16285C     // Catch:{ all -> 0x002f }
            if (r4 == 0) goto L_0x0053
            r4 = r7
            QJ.C r4 = (QJ.C16285C) r4     // Catch:{ all -> 0x002f }
            goto L_0x0054
        L_0x0053:
            r4 = r2
        L_0x0054:
            if (r4 == 0) goto L_0x005b
            java.lang.Throwable r4 = r4.f137555a     // Catch:{ all -> 0x002f }
            r1.b(r4)     // Catch:{ all -> 0x002f }
        L_0x005b:
            java.lang.Throwable r4 = r1.f()     // Catch:{ all -> 0x002f }
            if (r6 != 0) goto L_0x0062
            r2 = r4
        L_0x0062:
            r3.f144348a = r2     // Catch:{ all -> 0x002f }
            XH.N r6 = XH.C16807N.f139792a     // Catch:{ all -> 0x002f }
            monitor-exit(r1)
            if (r2 == 0) goto L_0x006c
            r5.I0(r0, r2)
        L_0x006c:
            QJ.v r6 = r5.H0(r0)
            if (r6 == 0) goto L_0x007b
            boolean r6 = r5.a1(r1, r6, r7)
            if (r6 == 0) goto L_0x007b
            WJ.D r6 = QJ.M0.f137587b
            return r6
        L_0x007b:
            r6 = 2
            r0.g(r6)
            QJ.v r6 = r5.H0(r0)
            if (r6 == 0) goto L_0x008e
            boolean r6 = r5.a1(r1, r6, r7)
            if (r6 == 0) goto L_0x008e
            WJ.D r6 = QJ.M0.f137587b
            return r6
        L_0x008e:
            java.lang.Object r6 = r5.c0(r1, r7)
            return r6
        L_0x0093:
            monitor-exit(r1)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: QJ.L0.Z0(QJ.A0, java.lang.Object):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final void a0(c cVar, C16335v vVar, Object obj) {
        C16335v H02 = H0(vVar);
        if (H02 == null || !a1(cVar, H02, obj)) {
            cVar.a().g(2);
            C16335v H03 = H0(vVar);
            if (H03 == null || !a1(cVar, H03, obj)) {
                L(c0(cVar, obj));
            }
        }
    }

    private final boolean a1(c cVar, C16335v vVar, Object obj) {
        while (I0.n(vVar.f137684e, false, new b(this, cVar, vVar, obj)) == S0.f137600a) {
            vVar = H0(vVar);
            if (vVar == null) {
                return false;
            }
        }
        return true;
    }

    private final Throwable b0(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th2 = (Throwable) obj;
            return th2 == null ? new G0(X(), (Throwable) null, this) : th2;
        }
        C17542s.h(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((U0) obj).e0();
    }

    private final Object c0(c cVar, Object obj) {
        boolean j10;
        Throwable k02;
        C16285C c10 = obj instanceof C16285C ? (C16285C) obj : null;
        Throwable th2 = c10 != null ? c10.f137555a : null;
        synchronized (cVar) {
            j10 = cVar.j();
            List<Throwable> m10 = cVar.m(th2);
            k02 = k0(cVar, m10);
            if (k02 != null) {
                H(k02, m10);
            }
        }
        if (!(k02 == null || k02 == th2)) {
            obj = new C16285C(k02, false, 2, (DefaultConstructorMarker) null);
        }
        if (k02 != null && (W(k02) || v0(k02))) {
            C17542s.h(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            ((C16285C) obj).c();
        }
        if (!j10) {
            K0(k02);
        }
        L0(obj);
        androidx.concurrent.futures.b.a(f137569a, this, cVar, M0.g(obj));
        Z(cVar, obj);
        return obj;
    }

    private final Throwable g0(Object obj) {
        C16285C c10 = obj instanceof C16285C ? (C16285C) obj : null;
        if (c10 != null) {
            return c10.f137555a;
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Throwable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Throwable k0(QJ.L0.c r5, java.util.List<? extends java.lang.Throwable> r6) {
        /*
            r4 = this;
            boolean r0 = r6.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x0018
            boolean r5 = r5.j()
            if (r5 == 0) goto L_0x0017
            QJ.G0 r5 = new QJ.G0
            java.lang.String r6 = r4.X()
            r5.<init>(r6, r1, r4)
            return r5
        L_0x0017:
            return r1
        L_0x0018:
            r5 = r6
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r0 = r5.iterator()
        L_0x001f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0031
            java.lang.Object r2 = r0.next()
            r3 = r2
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            boolean r3 = r3 instanceof java.util.concurrent.CancellationException
            if (r3 != 0) goto L_0x001f
            goto L_0x0032
        L_0x0031:
            r2 = r1
        L_0x0032:
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            if (r2 == 0) goto L_0x0037
            return r2
        L_0x0037:
            r0 = 0
            java.lang.Object r6 = r6.get(r0)
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            boolean r0 = r6 instanceof QJ.k1
            if (r0 == 0) goto L_0x005f
            java.util.Iterator r5 = r5.iterator()
        L_0x0046:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x005a
            java.lang.Object r0 = r5.next()
            r2 = r0
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            if (r2 == r6) goto L_0x0046
            boolean r2 = r2 instanceof QJ.k1
            if (r2 == 0) goto L_0x0046
            r1 = r0
        L_0x005a:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            if (r1 == 0) goto L_0x005f
            return r1
        L_0x005f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: QJ.L0.k0(QJ.L0$c, java.util.List):java.lang.Throwable");
    }

    private final Q0 n0(A0 a02) {
        Q0 a10 = a02.a();
        if (a10 != null) {
            return a10;
        }
        if (a02 instanceof C16321n0) {
            return new Q0();
        }
        if (a02 instanceof K0) {
            O0((K0) a02);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + a02).toString());
    }

    public final C16315k0 A0(boolean z10, boolean z11, C17642l<? super Throwable, C16807N> lVar) {
        return y0(z11, z10 ? new D0(lVar) : new E0(lVar));
    }

    public final boolean E0(Object obj) {
        Object Y02;
        do {
            Y02 = Y0(r0(), obj);
            if (Y02 == M0.f137586a) {
                return false;
            }
            if (Y02 == M0.f137587b) {
                return true;
            }
        } while (Y02 == M0.f137588c);
        L(Y02);
        return true;
    }

    public final Object F0(Object obj) {
        Object Y02;
        do {
            Y02 = Y0(r0(), obj);
            if (Y02 == M0.f137586a) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, g0(obj));
            }
        } while (Y02 == M0.f137588c);
        return Y02;
    }

    public String G0() {
        return V.a(this);
    }

    /* access modifiers changed from: protected */
    public void K0(Throwable th2) {
    }

    /* access modifiers changed from: protected */
    public void L(Object obj) {
    }

    /* access modifiers changed from: protected */
    public void L0(Object obj) {
    }

    /* access modifiers changed from: protected */
    public final Object M(C17164e<Object> eVar) {
        Object r02;
        do {
            r02 = r0();
            if (!(r02 instanceof A0)) {
                if (!(r02 instanceof C16285C)) {
                    return M0.h(r02);
                }
                throw ((C16285C) r02).f137555a;
            }
        } while (R0(r02) < 0);
        return O(eVar);
    }

    /* access modifiers changed from: protected */
    public void M0() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void P0(QJ.K0 r4) {
        /*
            r3 = this;
        L_0x0000:
            java.lang.Object r0 = r3.r0()
            boolean r1 = r0 instanceof QJ.K0
            if (r1 == 0) goto L_0x001a
            if (r0 == r4) goto L_0x000b
            return
        L_0x000b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f137569a
            QJ.n0 r2 = QJ.M0.f137592g
            boolean r0 = androidx.concurrent.futures.b.a(r1, r3, r0, r2)
            if (r0 == 0) goto L_0x0000
            return
        L_0x001a:
            boolean r1 = r0 instanceof QJ.A0
            if (r1 == 0) goto L_0x0029
            QJ.A0 r0 = (QJ.A0) r0
            QJ.Q0 r0 = r0.a()
            if (r0 == 0) goto L_0x0029
            r4.s()
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: QJ.L0.P0(QJ.K0):void");
    }

    public final boolean Q(Throwable th2) {
        return R(th2);
    }

    public final void Q0(C16333u uVar) {
        f137570b.set(this, uVar);
    }

    public final boolean R(Object obj) {
        Object a10 = M0.f137586a;
        if (m0() && (a10 = V(obj)) == M0.f137587b) {
            return true;
        }
        if (a10 == M0.f137586a) {
            a10 = D0(obj);
        }
        if (a10 == M0.f137586a || a10 == M0.f137587b) {
            return true;
        }
        if (a10 == M0.f137589d) {
            return false;
        }
        L(a10);
        return true;
    }

    public void S(Throwable th2) {
        R(th2);
    }

    /* access modifiers changed from: protected */
    public final CancellationException T0(Throwable th2, String str) {
        CancellationException cancellationException = th2 instanceof CancellationException ? (CancellationException) th2 : null;
        if (cancellationException == null) {
            if (str == null) {
                str = X();
            }
            cancellationException = new G0(str, th2, this);
        }
        return cancellationException;
    }

    public final String V0() {
        return G0() + '{' + S0(r0()) + '}';
    }

    /* access modifiers changed from: protected */
    public String X() {
        return "Job was cancelled";
    }

    public boolean Y(Throwable th2) {
        if (th2 instanceof CancellationException) {
            return true;
        }
        return R(th2) && l0();
    }

    public boolean c() {
        Object r02 = r0();
        return (r02 instanceof A0) && ((A0) r02).c();
    }

    public final Object d0() {
        Object r02 = r0();
        if (r02 instanceof A0) {
            throw new IllegalStateException("This job has not completed yet");
        } else if (!(r02 instanceof C16285C)) {
            return M0.h(r02);
        } else {
            throw ((C16285C) r02).f137555a;
        }
    }

    public final C15765h<F0> e() {
        return C15768k.b(new d(this, (C17164e<? super d>) null));
    }

    public CancellationException e0() {
        Throwable th2;
        Object r02 = r0();
        CancellationException cancellationException = null;
        if (r02 instanceof c) {
            th2 = ((c) r02).f();
        } else if (r02 instanceof C16285C) {
            th2 = ((C16285C) r02).f137555a;
        } else if (!(r02 instanceof A0)) {
            th2 = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + r02).toString());
        }
        if (th2 instanceof CancellationException) {
            cancellationException = (CancellationException) th2;
        }
        if (cancellationException != null) {
            return cancellationException;
        }
        return new G0("Parent job is " + S0(r02), th2, this);
    }

    public <R> R fold(R r10, p<? super R, ? super C17168i.b, ? extends R> pVar) {
        return F0.a.b(this, r10, pVar);
    }

    public <E extends C17168i.b> E get(C17168i.c<E> cVar) {
        return F0.a.c(this, cVar);
    }

    public final C17168i.c<?> getKey() {
        return F0.f137562d0;
    }

    public final boolean h() {
        return !(r0() instanceof A0);
    }

    public void i(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new G0(X(), (Throwable) null, this);
        }
        S(cancellationException);
    }

    public final boolean isCancelled() {
        Object r02 = r0();
        return (r02 instanceof C16285C) || ((r02 instanceof c) && ((c) r02).j());
    }

    public final Object j0(C17164e<? super C16807N> eVar) {
        if (!B0()) {
            I0.l(eVar.getContext());
            return C16807N.f139792a;
        }
        Object C02 = C0(eVar);
        return C02 == C17187b.f() ? C02 : C16807N.f139792a;
    }

    public boolean l0() {
        return true;
    }

    public boolean m0() {
        return false;
    }

    public C17168i minusKey(C17168i.c<?> cVar) {
        return F0.a.e(this, cVar);
    }

    public F0 o0() {
        C16333u q02 = q0();
        if (q02 != null) {
            return q02.getParent();
        }
        return null;
    }

    public final void p0(U0 u02) {
        R(u02);
    }

    public C17168i plus(C17168i iVar) {
        return F0.a.f(this, iVar);
    }

    public final C16333u q(C16337w wVar) {
        C16335v vVar = new C16335v(wVar);
        vVar.y(this);
        while (true) {
            Object r02 = r0();
            if (r02 instanceof C16321n0) {
                C16321n0 n0Var = (C16321n0) r02;
                if (!n0Var.c()) {
                    N0(n0Var);
                } else if (androidx.concurrent.futures.b.a(f137569a, this, r02, vVar)) {
                    break;
                }
            } else {
                Throwable th2 = null;
                if (r02 instanceof A0) {
                    Q0 a10 = ((A0) r02).a();
                    if (a10 == null) {
                        C17542s.h(r02, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                        O0((K0) r02);
                    } else if (!a10.d(vVar, 7)) {
                        boolean d10 = a10.d(vVar, 3);
                        Object r03 = r0();
                        if (r03 instanceof c) {
                            th2 = ((c) r03).f();
                        } else {
                            C16285C c10 = r03 instanceof C16285C ? (C16285C) r03 : null;
                            if (c10 != null) {
                                th2 = c10.f137555a;
                            }
                        }
                        vVar.x(th2);
                        if (!d10) {
                            return S0.f137600a;
                        }
                    }
                } else {
                    Object r04 = r0();
                    C16285C c11 = r04 instanceof C16285C ? (C16285C) r04 : null;
                    if (c11 != null) {
                        th2 = c11.f137555a;
                    }
                    vVar.x(th2);
                    return S0.f137600a;
                }
            }
        }
        return vVar;
    }

    public final C16333u q0() {
        return (C16333u) f137570b.get(this);
    }

    public final Object r0() {
        return f137569a.get(this);
    }

    public final C16315k0 s(C17642l<? super Throwable, C16807N> lVar) {
        return y0(true, new E0(lVar));
    }

    public final boolean start() {
        int R02;
        do {
            R02 = R0(r0());
            if (R02 == 0) {
                return false;
            }
        } while (R02 != 1);
        return true;
    }

    public String toString() {
        return V0() + '@' + V.b(this);
    }

    /* access modifiers changed from: protected */
    public boolean v0(Throwable th2) {
        return false;
    }

    public void w0(Throwable th2) {
        throw th2;
    }

    public final CancellationException x() {
        Object r02 = r0();
        if (r02 instanceof c) {
            Throwable f10 = ((c) r02).f();
            if (f10 != null) {
                CancellationException T02 = T0(f10, V.a(this) + " is cancelling");
                if (T02 != null) {
                    return T02;
                }
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (r02 instanceof A0) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (r02 instanceof C16285C) {
            return U0(this, ((C16285C) r02).f137555a, (String) null, 1, (Object) null);
        } else {
            return new G0(V.a(this) + " has completed normally", (Throwable) null, this);
        }
    }

    /* access modifiers changed from: protected */
    public final void x0(F0 f02) {
        if (f02 == null) {
            Q0(S0.f137600a);
            return;
        }
        f02.start();
        C16333u q10 = f02.q(this);
        Q0(q10);
        if (h()) {
            q10.b();
            Q0(S0.f137600a);
        }
    }

    public final C16315k0 y0(boolean z10, K0 k02) {
        boolean z11;
        Throwable th2;
        boolean z12;
        k02.y(this);
        while (true) {
            Object r02 = r0();
            z11 = true;
            th2 = null;
            if (!(r02 instanceof C16321n0)) {
                if (!(r02 instanceof A0)) {
                    z11 = false;
                    break;
                }
                A0 a02 = (A0) r02;
                Q0 a10 = a02.a();
                if (a10 == null) {
                    C17542s.h(r02, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    O0((K0) r02);
                } else {
                    if (k02.w()) {
                        c cVar = a02 instanceof c ? (c) a02 : null;
                        Throwable f10 = cVar != null ? cVar.f() : null;
                        if (f10 == null) {
                            z12 = a10.d(k02, 5);
                        } else {
                            if (z10) {
                                k02.x(f10);
                            }
                            return S0.f137600a;
                        }
                    } else {
                        z12 = a10.d(k02, 1);
                    }
                    if (z12) {
                        break;
                    }
                }
            } else {
                C16321n0 n0Var = (C16321n0) r02;
                if (!n0Var.c()) {
                    N0(n0Var);
                } else if (androidx.concurrent.futures.b.a(f137569a, this, r02, k02)) {
                    break;
                }
            }
        }
        if (z11) {
            return k02;
        }
        if (z10) {
            Object r03 = r0();
            C16285C c10 = r03 instanceof C16285C ? (C16285C) r03 : null;
            if (c10 != null) {
                th2 = c10.f137555a;
            }
            k02.x(th2);
        }
        return S0.f137600a;
    }

    /* access modifiers changed from: protected */
    public boolean z0() {
        return false;
    }
}
