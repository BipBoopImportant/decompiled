package androidx.compose.ui.platform;

import A1.C4342i;
import A1.C4355w;
import A1.D;
import A1.E;
import A1.F;
import A1.O;
import A1.Q;
import E1.a0;
import E1.b0;
import E1.e0;
import G1.C4502e0;
import G1.C4508k;
import G1.C4510m;
import G1.G;
import G1.I;
import G1.Z;
import G1.l0;
import G1.m0;
import G1.o0;
import G1.s0;
import G1.v0;
import I2.C4597a;
import I2.C4600b0;
import I2.C4606e0;
import S1.C4819l;
import S1.C4820m;
import S1.C4824q;
import T1.S;
import T1.U;
import U0.A1;
import U0.C4899r0;
import U0.o1;
import U0.p1;
import XH.C16801H;
import XH.C16807N;
import XH.C16814e;
import XH.C16820k;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.compose.ui.d;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.focus.d;
import androidx.compose.ui.platform.ViewLayer;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.lifecycle.C5205h;
import androidx.lifecycle.C5221y;
import c2.C5266a;
import c2.C5267b;
import com.sugarcube.app.base.data.source.CatalogRepository;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import g1.C5342k;
import j1.C5470a;
import j1.C5472c;
import j1.C5473d;
import j1.C5476g;
import j1.C5478i;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import k1.C5492b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.C17548y;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.W;
import l1.C5508a;
import l1.C5510c;
import l1.C5515h;
import n1.C5629i;
import nI.C17631a;
import nI.C17642l;
import o1.C5667g;
import o1.C5668h;
import o1.C5669i;
import o1.C5673m;
import p1.C5732n0;
import p1.C5734o0;
import p1.H0;
import p1.M;
import p1.O0;
import p1.b1;
import r1.C5815a;
import s1.C5905c;
import w1.C6203a;
import w1.C6205c;
import x1.C6240a;
import x1.C6241b;
import y1.C6253a;
import y1.C6254b;
import y1.C6255c;
import y1.C6256d;

@Metadata(d1 = {"\u0000À\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0002°\u0004\b\u0000\u0018\u0000 ê\u00042\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u00029:B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\u001a\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0011H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ6\u0010&\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u001c0#H\u0002ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020\u0001H\u0002¢\u0006\u0004\b)\u0010*J'\u00100\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020\u00142\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b0\u00101J\u001b\u00104\u001a\u00020\u001c2\n\b\u0002\u00103\u001a\u0004\u0018\u000102H\u0002¢\u0006\u0004\b4\u00105J\u0013\u00106\u001a\u00020\u000e*\u000202H\u0002¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u001cH\u0002¢\u0006\u0004\b8\u0010\u001eJ%\u0010<\u001a\u00020;2\u0006\u00109\u001a\u00020\u00142\u0006\u0010:\u001a\u00020\u0014H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b<\u0010=J\u001d\u0010?\u001a\u00020;2\u0006\u0010>\u001a\u00020\u0014H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\u001cH\u0002¢\u0006\u0004\bA\u0010\u001eJ\u0017\u0010C\u001a\u00020\u001c2\u0006\u0010B\u001a\u000202H\u0002¢\u0006\u0004\bC\u00105J\u0017\u0010D\u001a\u00020\u001c2\u0006\u0010B\u001a\u000202H\u0002¢\u0006\u0004\bD\u00105J\u0017\u0010G\u001a\u00020\u000e2\u0006\u0010F\u001a\u00020EH\u0002¢\u0006\u0004\bG\u0010HJ\u001d\u0010K\u001a\u00020J2\u0006\u0010I\u001a\u00020EH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bK\u0010LJ\u001f\u0010N\u001a\u00020\u000e2\u0006\u0010F\u001a\u00020E2\u0006\u0010M\u001a\u00020EH\u0002¢\u0006\u0004\bN\u0010OJ\u0017\u0010P\u001a\u00020\u000e2\u0006\u0010F\u001a\u00020EH\u0002¢\u0006\u0004\bP\u0010HJ\u001d\u0010Q\u001a\u00020J2\u0006\u0010I\u001a\u00020EH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bQ\u0010LJ1\u0010V\u001a\u00020\u001c2\u0006\u0010I\u001a\u00020E2\u0006\u0010R\u001a\u00020\u00142\u0006\u0010T\u001a\u00020S2\b\b\u0002\u0010U\u001a\u00020\u000eH\u0002¢\u0006\u0004\bV\u0010WJ\u0017\u0010X\u001a\u00020\u000e2\u0006\u0010I\u001a\u00020EH\u0002¢\u0006\u0004\bX\u0010HJ\u000f\u0010Y\u001a\u00020\u001cH\u0002¢\u0006\u0004\bY\u0010\u001eJ\u0017\u0010Z\u001a\u00020\u001c2\u0006\u0010I\u001a\u00020EH\u0002¢\u0006\u0004\bZ\u0010[J\u000f\u0010\\\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\\\u0010\u001eJ\u000f\u0010]\u001a\u00020\u000eH\u0002¢\u0006\u0004\b]\u0010^J\u0017\u0010_\u001a\u00020\u000e2\u0006\u0010F\u001a\u00020EH\u0002¢\u0006\u0004\b_\u0010HJ\u0017\u0010`\u001a\u00020\u000e2\u0006\u0010F\u001a\u00020EH\u0002¢\u0006\u0004\b`\u0010HJ!\u0010c\u001a\u0004\u0018\u00010\u00162\u0006\u0010a\u001a\u00020\u00142\u0006\u0010b\u001a\u00020\u0016H\u0002¢\u0006\u0004\bc\u0010dJ4\u0010k\u001a\u00020h2\"\u0010j\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020f\u0012\n\u0012\b\u0012\u0004\u0012\u00020h0g\u0012\u0006\u0012\u0004\u0018\u00010i0eH@¢\u0006\u0004\bk\u0010lJ\u0017\u0010o\u001a\u00020\u001c2\u0006\u0010n\u001a\u00020mH\u0016¢\u0006\u0004\bo\u0010pJ\u0017\u0010s\u001a\u00020\u001c2\u0006\u0010r\u001a\u00020qH\u0016¢\u0006\u0004\bs\u0010tJ-\u0010{\u001a\u00020\u001c2\u0006\u0010u\u001a\u00020m2\u0006\u0010w\u001a\u00020v2\f\u0010z\u001a\b\u0012\u0004\u0012\u00020y0xH\u0016¢\u0006\u0004\b{\u0010|J\u0018\u0010\u001a\u00020\u001c2\u0006\u0010~\u001a\u00020}H\u0016¢\u0006\u0005\b\u0010\u0001J'\u0010\u0001\u001a\u0004\u0018\u00010\u00162\t\u0010\u0001\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0006\b\u0001\u0010\u0001J$\u0010\u0001\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010mH\u0016¢\u0006\u0006\b\u0001\u0010\u0001J-\u0010\u0001\u001a\u00020\u001c2\u0007\u0010\u0001\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010mH\u0014¢\u0006\u0006\b\u0001\u0010\u0001J\u001b\u0010\u0001\u001a\u00020\u001c2\u0007\u0010\u0001\u001a\u00020\u000eH\u0016¢\u0006\u0006\b\u0001\u0010\u0001J\u001b\u0010\u0001\u001a\u00020\u000e2\u0007\u0010F\u001a\u00030\u0001H\u0016¢\u0006\u0006\b\u0001\u0010\u0001J\u001b\u0010\u0001\u001a\u00020\u000e2\u0007\u0010F\u001a\u00030\u0001H\u0016¢\u0006\u0006\b\u0001\u0010\u0001J\u001b\u0010\u0001\u001a\u00020\u001c2\u0007\u0010\u0001\u001a\u00020SH\u0016¢\u0006\u0006\b\u0001\u0010\u0001J\u0019\u0010\u0001\u001a\u00020\u001c2\u0006\u0010B\u001a\u000202H\u0016¢\u0006\u0005\b\u0001\u00105J\u0019\u0010\u0001\u001a\u00020\u001c2\u0006\u0010B\u001a\u000202H\u0016¢\u0006\u0005\b\u0001\u00105J\u000f\u0010\u0001\u001a\u00020\u001c¢\u0006\u0005\b\u0001\u0010\u001eJ\u0011\u0010\u0001\u001a\u00020\u001cH\u0016¢\u0006\u0005\b\u0001\u0010\u001eJ\"\u0010\u0001\u001a\u00020\u001c2\u000e\u0010\u0001\u001a\t\u0012\u0004\u0012\u00020\u001c0\u0001H\u0016¢\u0006\u0006\b\u0001\u0010\u0001J\u001d\u0010\u0001\u001a\u00020\u001c2\t\u0010\u0001\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0006\b\u0001\u0010\u0001J&\u0010\u0001\u001a\u00020\u001c2\t\u0010\u0001\u001a\u0004\u0018\u00010\u00162\u0007\u0010\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0006\b\u0001\u0010\u0001J/\u0010\u0001\u001a\u00020\u001c2\t\u0010\u0001\u001a\u0004\u0018\u00010\u00162\u0007\u0010 \u0001\u001a\u00020\u00142\u0007\u0010¡\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0006\b\u0001\u0010¢\u0001J)\u0010\u0001\u001a\u00020\u001c2\t\u0010\u0001\u001a\u0004\u0018\u00010\u00162\n\u0010¤\u0001\u001a\u0005\u0018\u00010£\u0001H\u0016¢\u0006\u0006\b\u0001\u0010¥\u0001J2\u0010\u0001\u001a\u00020\u001c2\t\u0010\u0001\u001a\u0004\u0018\u00010\u00162\u0007\u0010\u0001\u001a\u00020\u00142\n\u0010¤\u0001\u001a\u0005\u0018\u00010£\u0001H\u0016¢\u0006\u0006\b\u0001\u0010¦\u0001J#\u0010ª\u0001\u001a\u00020\u001c2\b\u0010¨\u0001\u001a\u00030§\u00012\u0007\u0010©\u0001\u001a\u000202¢\u0006\u0006\bª\u0001\u0010«\u0001J\u001a\u0010¬\u0001\u001a\u00020\u001c2\b\u0010¨\u0001\u001a\u00030§\u0001¢\u0006\u0006\b¬\u0001\u0010­\u0001J$\u0010°\u0001\u001a\u00020\u001c2\b\u0010¨\u0001\u001a\u00030§\u00012\b\u0010¯\u0001\u001a\u00030®\u0001¢\u0006\u0006\b°\u0001\u0010±\u0001J\u0019\u00109\u001a\u00020\u001c2\u0007\u0010²\u0001\u001a\u00020\u000eH\u0016¢\u0006\u0005\b9\u0010\u0001J(\u0010µ\u0001\u001a\u00020\u001c2\u0007\u0010©\u0001\u001a\u0002022\b\u0010´\u0001\u001a\u00030³\u0001H\u0016ø\u0001\u0000¢\u0006\u0006\bµ\u0001\u0010¶\u0001J$\u0010¸\u0001\u001a\u00020\u001c2\u0007\u0010©\u0001\u001a\u0002022\u0007\u0010·\u0001\u001a\u00020\u000eH\u0016¢\u0006\u0006\b¸\u0001\u0010¹\u0001J6\u0010¼\u0001\u001a\u00020\u001c2\u0007\u0010©\u0001\u001a\u0002022\u0007\u0010·\u0001\u001a\u00020\u000e2\u0007\u0010º\u0001\u001a\u00020\u000e2\u0007\u0010»\u0001\u001a\u00020\u000eH\u0016¢\u0006\u0006\b¼\u0001\u0010½\u0001J-\u0010¾\u0001\u001a\u00020\u001c2\u0007\u0010©\u0001\u001a\u0002022\u0007\u0010·\u0001\u001a\u00020\u000e2\u0007\u0010º\u0001\u001a\u00020\u000eH\u0016¢\u0006\u0006\b¾\u0001\u0010¿\u0001J\u001a\u0010À\u0001\u001a\u00020\u001c2\u0007\u0010©\u0001\u001a\u000202H\u0016¢\u0006\u0005\bÀ\u0001\u00105J$\u0010Ã\u0001\u001a\u00020\u001c2\u0007\u0010Á\u0001\u001a\u00020\u00142\u0007\u0010Â\u0001\u001a\u00020\u0014H\u0014¢\u0006\u0006\bÃ\u0001\u0010Ä\u0001J>\u0010È\u0001\u001a\u00020\u001c2\u0007\u0010Å\u0001\u001a\u00020\u000e2\u0007\u0010Æ\u0001\u001a\u00020\u00142\u0007\u0010¾\u0001\u001a\u00020\u00142\u0007\u0010Ç\u0001\u001a\u00020\u00142\u0006\u0010:\u001a\u00020\u0014H\u0014¢\u0006\u0006\bÈ\u0001\u0010É\u0001J\u001c\u0010Ê\u0001\u001a\u00020\u001c2\b\u0010¯\u0001\u001a\u00030®\u0001H\u0014¢\u0006\u0006\bÊ\u0001\u0010Ë\u0001JN\u0010Ò\u0001\u001a\u00030Ñ\u00012\u001d\u0010Î\u0001\u001a\u0018\u0012\u0005\u0012\u00030Ì\u0001\u0012\u0007\u0012\u0005\u0018\u00010Í\u0001\u0012\u0004\u0012\u00020\u001c0e2\u000e\u0010Ï\u0001\u001a\t\u0012\u0004\u0012\u00020\u001c0\u00012\n\u0010Ð\u0001\u001a\u0005\u0018\u00010Í\u0001H\u0016¢\u0006\u0006\bÒ\u0001\u0010Ó\u0001J\u001c\u0010Õ\u0001\u001a\u00020\u000e2\b\u0010Ô\u0001\u001a\u00030Ñ\u0001H\u0000¢\u0006\u0006\bÕ\u0001\u0010Ö\u0001J\u0011\u0010×\u0001\u001a\u00020\u001cH\u0016¢\u0006\u0005\b×\u0001\u0010\u001eJ\u001a\u0010Ø\u0001\u001a\u00020\u001c2\u0007\u0010©\u0001\u001a\u000202H\u0016¢\u0006\u0005\bØ\u0001\u00105J \u0010Ú\u0001\u001a\u00020\u001c2\f\u0010¨\u0001\u001a\u00070\u0016j\u0003`Ù\u0001H\u0016¢\u0006\u0006\bÚ\u0001\u0010\u0001J\u001c\u0010Ç\u0001\u001a\u00020\u001c2\b\u0010\u0001\u001a\u00030Û\u0001H\u0016¢\u0006\u0006\bÇ\u0001\u0010Ü\u0001J!\u0010ß\u0001\u001a\u0004\u0018\u00010\f2\b\u0010Þ\u0001\u001a\u00030Ý\u0001H\u0016ø\u0001\u0000¢\u0006\u0006\bß\u0001\u0010à\u0001J\u001c\u0010á\u0001\u001a\u00020\u001c2\b\u0010¯\u0001\u001a\u00030®\u0001H\u0014¢\u0006\u0006\bá\u0001\u0010Ë\u0001J%\u0010ã\u0001\u001a\u00020\u001c2\b\u0010Ô\u0001\u001a\u00030Ñ\u00012\u0007\u0010â\u0001\u001a\u00020\u000eH\u0000¢\u0006\u0006\bã\u0001\u0010ä\u0001J&\u0010ç\u0001\u001a\u00020\u001c2\u0014\u0010æ\u0001\u001a\u000f\u0012\u0005\u0012\u00030å\u0001\u0012\u0004\u0012\u00020\u001c0#¢\u0006\u0006\bç\u0001\u0010è\u0001J\u0013\u0010é\u0001\u001a\u00020\u001cH@¢\u0006\u0006\bé\u0001\u0010ê\u0001J\u0013\u0010ë\u0001\u001a\u00020\u001cH@¢\u0006\u0006\bë\u0001\u0010ê\u0001J\u0011\u0010ì\u0001\u001a\u00020\u001cH\u0016¢\u0006\u0005\bì\u0001\u0010\u001eJ\u0011\u0010í\u0001\u001a\u00020\u001cH\u0014¢\u0006\u0005\bí\u0001\u0010\u001eJ\u0011\u0010î\u0001\u001a\u00020\u001cH\u0014¢\u0006\u0005\bî\u0001\u0010\u001eJ%\u0010ð\u0001\u001a\u00020\u001c2\b\u0010r\u001a\u0004\u0018\u00010q2\u0007\u0010ï\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0006\bð\u0001\u0010ñ\u0001J#\u0010õ\u0001\u001a\u00020\u001c2\u000f\u0010ô\u0001\u001a\n\u0012\u0005\u0012\u00030ó\u00010ò\u0001H\u0016¢\u0006\u0006\bõ\u0001\u0010ö\u0001J8\u0010ý\u0001\u001a\u00020\u001c2\b\u0010ø\u0001\u001a\u00030÷\u00012\b\u0010ú\u0001\u001a\u00030ù\u00012\u0010\u0010ü\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010û\u00010xH\u0017¢\u0006\u0006\bý\u0001\u0010þ\u0001J%\u0010\u0002\u001a\u00020\u001c2\u0011\u0010\u0002\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010\u00020ÿ\u0001H\u0017¢\u0006\u0006\b\u0002\u0010\u0002J\u0019\u0010\u0002\u001a\u00020\u000e2\u0006\u0010I\u001a\u00020EH\u0016¢\u0006\u0005\b\u0002\u0010HJ\u0019\u0010\u0002\u001a\u00020\u000e2\u0006\u0010I\u001a\u00020EH\u0016¢\u0006\u0005\b\u0002\u0010HJ\u0019\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0005\b\u0002\u0010\u0010J\u0019\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0005\b\u0002\u0010\u0010J \u0010\u0002\u001a\u00030\u00022\b\u0010\u0002\u001a\u00030\u0002H\u0016ø\u0001\u0000¢\u0006\u0006\b\u0002\u0010\u0002J\u001f\u0010\u0002\u001a\u00020\u001c2\b\u0010\u0002\u001a\u00030\u0002H\u0016ø\u0001\u0000¢\u0006\u0006\b\u0002\u0010\u0002J \u0010\u0002\u001a\u00030\u00022\b\u0010\u0002\u001a\u00030\u0002H\u0016ø\u0001\u0000¢\u0006\u0006\b\u0002\u0010\u0002J\u0011\u0010\u0002\u001a\u00020\u000eH\u0016¢\u0006\u0005\b\u0002\u0010^J\u001f\u0010\u0002\u001a\u0005\u0018\u00010\u00022\b\u0010\u0002\u001a\u00030\u0002H\u0016¢\u0006\u0006\b\u0002\u0010\u0002J \u0010\u0002\u001a\u00030\u00022\b\u0010\u0002\u001a\u00030\u0002H\u0016ø\u0001\u0000¢\u0006\u0006\b\u0002\u0010\u0002J\u001e\u0010:\u001a\u00030\u00022\b\u0010\u0002\u001a\u00030\u0002H\u0016ø\u0001\u0000¢\u0006\u0005\b:\u0010\u0002J\u001c\u0010\u0002\u001a\u00020\u001c2\b\u0010\u0002\u001a\u00030\u0002H\u0014¢\u0006\u0006\b\u0002\u0010\u0002J\u001b\u0010\u0002\u001a\u00020\u001c2\u0007\u0010\u0002\u001a\u00020\u0014H\u0016¢\u0006\u0006\b\u0002\u0010 \u0002J\u0019\u0010¡\u0002\u001a\u00020\u000e2\u0006\u0010F\u001a\u00020EH\u0016¢\u0006\u0005\b¡\u0002\u0010HJ\u0019\u0010¢\u0002\u001a\u0004\u0018\u00010\u00162\u0006\u0010a\u001a\u00020\u0014¢\u0006\u0005\b¢\u0002\u0010\u0018J\u0011\u0010£\u0002\u001a\u00020\u000eH\u0016¢\u0006\u0005\b£\u0002\u0010^R\u001f\u0010¥\u0002\u001a\u00030\u00028\u0002@\u0002X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0007\n\u0005\b9\u0010¤\u0002R\u0018\u0010§\u0002\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b:\u0010¦\u0002R \u0010­\u0002\u001a\u00030¨\u00028\u0016X\u0004¢\u0006\u0010\n\u0006\b©\u0002\u0010ª\u0002\u001a\u0006\b«\u0002\u0010¬\u0002R5\u0010µ\u0002\u001a\u00030®\u00022\b\u0010¯\u0002\u001a\u00030®\u00028V@RX\u0002¢\u0006\u0018\n\u0006\bÒ\u0001\u0010°\u0002\u001a\u0006\b±\u0002\u0010²\u0002\"\u0006\b³\u0002\u0010´\u0002R\u0018\u0010¹\u0002\u001a\u00030¶\u00028\u0002X\u0004¢\u0006\b\n\u0006\b·\u0002\u0010¸\u0002R\u0018\u0010½\u0002\u001a\u00030º\u00028\u0002X\u0004¢\u0006\b\n\u0006\b»\u0002\u0010¼\u0002R \u0010Â\u0002\u001a\u00030¾\u00028\u0016X\u0004¢\u0006\u0010\n\u0006\b\u0001\u0010¿\u0002\u001a\u0006\bÀ\u0002\u0010Á\u0002R\u0018\u0010Å\u0002\u001a\u00030Ã\u00028\u0002X\u0004¢\u0006\b\n\u0006\bÚ\u0001\u0010Ä\u0002R1\u0010\t\u001a\u00020\b2\u0007\u0010Æ\u0002\u001a\u00020\b8\u0016@VX\u000e¢\u0006\u0018\n\u0006\bÇ\u0002\u0010È\u0002\u001a\u0006\bÉ\u0002\u0010Ê\u0002\"\u0006\bË\u0002\u0010Ì\u0002R \u0010Ñ\u0002\u001a\u00030Í\u00028\u0016X\u0004¢\u0006\u0010\n\u0006\b¼\u0001\u0010Î\u0002\u001a\u0006\bÏ\u0002\u0010Ð\u0002R\u0018\u0010Õ\u0002\u001a\u00030Ò\u00028\u0002X\u0004¢\u0006\b\n\u0006\bÓ\u0002\u0010Ô\u0002R\u0018\u0010Ø\u0002\u001a\u00030Ö\u00028\u0002X\u0004¢\u0006\b\n\u0006\bÆ\u0001\u0010×\u0002R\u0018\u0010Ù\u0002\u001a\u00030Ö\u00028\u0002X\u0004¢\u0006\b\n\u0006\bØ\u0001\u0010×\u0002R\u0018\u0010Ý\u0002\u001a\u00030Ú\u00028\u0002X\u0004¢\u0006\b\n\u0006\bÛ\u0002\u0010Ü\u0002R\u001f\u0010â\u0002\u001a\u0002028\u0016X\u0004¢\u0006\u0010\n\u0006\bÞ\u0002\u0010ß\u0002\u001a\u0006\bà\u0002\u0010á\u0002R \u0010ç\u0002\u001a\u00030ã\u00028\u0016X\u0004¢\u0006\u0010\n\u0006\bÀ\u0001\u0010ä\u0002\u001a\u0006\bå\u0002\u0010æ\u0002R\u001f\u0010ì\u0002\u001a\u00030è\u00028\u0016X\u0004¢\u0006\u000f\n\u0005\bk\u0010é\u0002\u001a\u0006\bê\u0002\u0010ë\u0002R\u0018\u0010ï\u0002\u001a\u00030í\u00028\u0002X\u0004¢\u0006\b\n\u0006\bÇ\u0001\u0010î\u0002R*\u0010÷\u0002\u001a\u00030ð\u00028\u0000@\u0000X\u000e¢\u0006\u0018\n\u0006\bñ\u0002\u0010ò\u0002\u001a\u0006\bó\u0002\u0010ô\u0002\"\u0006\bõ\u0002\u0010ö\u0002R \u0010ü\u0002\u001a\u00030ø\u00028\u0016X\u0004¢\u0006\u0010\n\u0006\b¾\u0001\u0010ù\u0002\u001a\u0006\bú\u0002\u0010û\u0002R \u0010\u0003\u001a\u00030ý\u00028\u0016X\u0004¢\u0006\u0010\n\u0006\b\u0002\u0010þ\u0002\u001a\u0006\bÿ\u0002\u0010\u0003R \u0010\u0003\u001a\u00030\u00038\u0016X\u0004¢\u0006\u0010\n\u0006\b\u0002\u0010\u0003\u001a\u0006\b\u0003\u0010\u0003R\u001f\u0010\u0003\u001a\n\u0012\u0005\u0012\u00030Ñ\u00010\u00038\u0002X\u0004¢\u0006\b\n\u0006\b\u0002\u0010\u0003R#\u0010\u0003\u001a\f\u0012\u0005\u0012\u00030Ñ\u0001\u0018\u00010\u00038\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0003R\u0019\u0010\u0003\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b¸\u0001\u0010¦\u0002R\u0019\u0010\u0003\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0002\u0010¦\u0002R\u0018\u0010\u0003\u001a\u00030\u00038\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0003R\u0018\u0010\u0003\u001a\u00030\u00038\u0002X\u0004¢\u0006\b\n\u0006\b×\u0001\u0010\u0003R6\u0010\u0003\u001a\u000f\u0012\u0005\u0012\u00030\u0002\u0012\u0004\u0012\u00020\u001c0#8\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\b\u0001\u0010\u0003\u001a\u0006\b\u0003\u0010\u0003\"\u0006\b\u0003\u0010è\u0001R\u001a\u0010\u0003\u001a\u0005\u0018\u00010\u00038\u0002X\u0004¢\u0006\b\n\u0006\bµ\u0001\u0010\u0003R\u0019\u0010\u0003\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0003\u0010¦\u0002R \u0010¢\u0003\u001a\u00030\u00038\u0016X\u0004¢\u0006\u0010\n\u0006\b\u0003\u0010\u0003\u001a\u0006\b \u0003\u0010¡\u0003R \u0010¨\u0003\u001a\u00030£\u00038\u0016X\u0004¢\u0006\u0010\n\u0006\b¤\u0003\u0010¥\u0003\u001a\u0006\b¦\u0003\u0010§\u0003R/\u0010­\u0003\u001a\u00020\u000e8\u0016@\u0016X\u000e¢\u0006\u001e\n\u0006\b©\u0003\u0010¦\u0002\u0012\u0005\b¬\u0003\u0010\u001e\u001a\u0005\bª\u0003\u0010^\"\u0006\b«\u0003\u0010\u0001R\u001c\u0010±\u0003\u001a\u0005\u0018\u00010®\u00038\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b¯\u0003\u0010°\u0003R\u001c\u0010´\u0003\u001a\u0005\u0018\u00010²\u00038\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b¤\u0002\u0010³\u0003R\"\u0010·\u0003\u001a\u0005\u0018\u00010³\u00018\u0002@\u0002X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\b\n\u0006\bµ\u0003\u0010¶\u0003R\u0019\u0010¹\u0003\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b¸\u0003\u0010¦\u0002R\u0018\u0010½\u0003\u001a\u00030º\u00038\u0002X\u0004¢\u0006\b\n\u0006\b»\u0003\u0010¼\u0003R \u0010Ã\u0003\u001a\u00030¾\u00038\u0016X\u0004¢\u0006\u0010\n\u0006\b¿\u0003\u0010À\u0003\u001a\u0006\bÁ\u0003\u0010Â\u0003R \u0010Æ\u0003\u001a\u00030Ä\u00038\u0002@\u0002X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\b\n\u0006\bÅ\u0003\u0010¤\u0002R\u0018\u0010É\u0003\u001a\u00030ù\u00018\u0002X\u0004¢\u0006\b\n\u0006\bÇ\u0003\u0010È\u0003R\u001e\u0010Ì\u0003\u001a\u00030\u00028\u0002X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\b\n\u0006\bÊ\u0003\u0010Ë\u0003R\u001e\u0010Î\u0003\u001a\u00030\u00028\u0002X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\b\n\u0006\bÍ\u0003\u0010Ë\u0003R\u001e\u0010Ð\u0003\u001a\u00030\u00028\u0002X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\b\n\u0006\bÏ\u0003\u0010Ë\u0003R0\u0010Ö\u0003\u001a\u00020S8\u0000@\u0000X\u000e¢\u0006\u001f\n\u0006\bÑ\u0003\u0010¤\u0002\u0012\u0005\bÕ\u0003\u0010\u001e\u001a\u0006\bÒ\u0003\u0010Ó\u0003\"\u0006\bÔ\u0003\u0010\u0001R\u0019\u0010Ø\u0003\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b×\u0003\u0010¦\u0002R\u001f\u0010Ù\u0003\u001a\u00030\u00028\u0002@\u0002X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0007\n\u0005\bX\u0010¤\u0002R\u0018\u0010Ú\u0003\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b`\u0010¦\u0002R9\u0010ß\u0003\u001a\u0005\u0018\u00010å\u00012\n\u0010¯\u0002\u001a\u0005\u0018\u00010å\u00018B@BX\u0002¢\u0006\u0018\n\u0006\bã\u0001\u0010°\u0002\u001a\u0006\bÛ\u0003\u0010Ü\u0003\"\u0006\bÝ\u0003\u0010Þ\u0003R\"\u0010â\u0003\u001a\u0005\u0018\u00010å\u00018FX\u0002¢\u0006\u000f\n\u0005\b\u001d\u0010à\u0003\u001a\u0006\bá\u0003\u0010Ü\u0003R'\u0010ã\u0003\u001a\u0011\u0012\u0005\u0012\u00030å\u0001\u0012\u0004\u0012\u00020\u001c\u0018\u00010#8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0012\u0010\u0003R\u0017\u0010æ\u0003\u001a\u00030ä\u00038\u0002X\u0004¢\u0006\u0007\n\u0005\b\u000f\u0010å\u0003R\u0017\u0010é\u0003\u001a\u00030ç\u00038\u0002X\u0004¢\u0006\u0007\n\u0005\b\u001a\u0010è\u0003R\u0017\u0010ì\u0003\u001a\u00030ê\u00038\u0002X\u0004¢\u0006\u0007\n\u0005\b<\u0010ë\u0003R\u0017\u0010ï\u0003\u001a\u00030í\u00038\u0002X\u0004¢\u0006\u0007\n\u0005\bY\u0010î\u0003R\u001f\u0010ô\u0003\u001a\u00030ð\u00038\u0016X\u0004¢\u0006\u000f\n\u0005\bZ\u0010ñ\u0003\u001a\u0006\bò\u0003\u0010ó\u0003R$\u0010ø\u0003\u001a\n\u0012\u0005\u0012\u00030ö\u00030õ\u00038\u0002X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0007\n\u0005\b\\\u0010÷\u0003R \u0010ý\u0003\u001a\u00030ù\u00038\u0016X\u0004¢\u0006\u0010\n\u0006\bÕ\u0001\u0010ú\u0003\u001a\u0006\bû\u0003\u0010ü\u0003R'\u0010\u0004\u001a\u00030þ\u00038\u0016X\u0004¢\u0006\u0017\n\u0006\b¬\u0001\u0010ÿ\u0003\u0012\u0005\b\u0004\u0010\u001e\u001a\u0006\b\u0004\u0010\u0004R5\u0010\u0004\u001a\u00030\u00042\b\u0010¯\u0002\u001a\u00030\u00048V@RX\u0002¢\u0006\u0018\n\u0006\b\u0001\u0010°\u0002\u001a\u0006\b\u0004\u0010\u0004\"\u0006\b\u0004\u0010\u0004R\u0018\u0010\u0004\u001a\u00020\u00148\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b4\u0010¯\u0003R5\u0010\u0002\u001a\u00030\u00042\b\u0010¯\u0002\u001a\u00030\u00048V@RX\u0002¢\u0006\u0018\n\u0006\b\u0004\u0010°\u0002\u001a\u0006\b\u0004\u0010\u0004\"\u0006\b\u0004\u0010\u0004R \u0010\u0004\u001a\u00030\u00048\u0016X\u0004¢\u0006\u0010\n\u0006\b\u0004\u0010\u0004\u001a\u0006\b\u0004\u0010\u0004R\u0018\u0010\u0004\u001a\u00030\u00048\u0002X\u0004¢\u0006\b\n\u0006\b\u0004\u0010\u0004R\u001f\u0010\u0004\u001a\u00030\u00048\u0016X\u0004¢\u0006\u000f\n\u0005\bQ\u0010\u0004\u001a\u0006\b\u0004\u0010\u0004R\u001f\u0010¤\u0004\u001a\u00030 \u00048\u0016X\u0004¢\u0006\u000f\n\u0005\bV\u0010¡\u0004\u001a\u0006\b¢\u0004\u0010£\u0004R\u001b\u0010§\u0004\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b¥\u0004\u0010¦\u0004R\u0018\u0010¨\u0004\u001a\u00020S8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b&\u0010¤\u0002R\u001f\u0010¬\u0004\u001a\n\u0012\u0005\u0012\u00030Ñ\u00010©\u00048\u0002X\u0004¢\u0006\b\n\u0006\bª\u0004\u0010«\u0004R&\u0010¯\u0004\u001a\u0012\u0012\r\u0012\u000b\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00010­\u00048\u0002X\u0004¢\u0006\u0007\n\u0005\bA\u0010®\u0004R\u0018\u0010³\u0004\u001a\u00030°\u00048\u0002X\u0004¢\u0006\b\n\u0006\b±\u0004\u0010²\u0004R\u0018\u0010·\u0004\u001a\u00030´\u00048\u0002X\u0004¢\u0006\b\n\u0006\bµ\u0004\u0010¶\u0004R\u0019\u0010¹\u0004\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b¸\u0004\u0010¦\u0002R\u001e\u0010¼\u0004\u001a\t\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0004¢\u0006\b\n\u0006\bº\u0004\u0010»\u0004R\u0018\u0010À\u0004\u001a\u00030½\u00048\u0002X\u0004¢\u0006\b\n\u0006\b¾\u0004\u0010¿\u0004R\u0019\u0010Â\u0004\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÁ\u0004\u0010¦\u0002R\u001a\u0010Æ\u0004\u001a\u0005\u0018\u00010Ã\u00048\u0002X\u0004¢\u0006\b\n\u0006\bÄ\u0004\u0010Å\u0004R \u0010Ì\u0004\u001a\u00030Ç\u00048\u0016X\u0004¢\u0006\u0010\n\u0006\bÈ\u0004\u0010É\u0004\u001a\u0006\bÊ\u0004\u0010Ë\u0004R\u001c\u0010Ï\u0004\u001a\u00020\u0014*\u00030\u00028BX\u0004¢\u0006\b\u001a\u0006\bÍ\u0004\u0010Î\u0004R\u0017\u0010¨\u0001\u001a\u00020\u00168VX\u0004¢\u0006\b\u001a\u0006\bÐ\u0004\u0010Ñ\u0004R\u0018\u0010Õ\u0004\u001a\u00030Ò\u00048VX\u0004¢\u0006\b\u001a\u0006\bÓ\u0004\u0010Ô\u0004R\u001a\u0010õ\u0001\u001a\u0005\u0018\u00010Ö\u00048VX\u0004¢\u0006\b\u001a\u0006\b×\u0004\u0010Ø\u0004R\u0018\u0010Û\u0004\u001a\u00030®\u00038@X\u0004¢\u0006\b\u001a\u0006\bÙ\u0004\u0010Ú\u0004R\u0017\u0010Ý\u0004\u001a\u00020S8VX\u0004¢\u0006\b\u001a\u0006\bÜ\u0004\u0010Ó\u0003R\u0016\u0010ß\u0004\u001a\u00020\u000e8VX\u0004¢\u0006\u0007\u001a\u0005\bÞ\u0004\u0010^R\u0018\u0010ã\u0004\u001a\u00030à\u00048VX\u0004¢\u0006\b\u001a\u0006\bá\u0004\u0010â\u0004R\u0018\u0010ç\u0004\u001a\u00030ä\u00048VX\u0004¢\u0006\b\u001a\u0006\bå\u0004\u0010æ\u0004R\u0016\u0010é\u0004\u001a\u00020\u000e8@X\u0004¢\u0006\u0007\u001a\u0005\bè\u0004\u0010^\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006ë\u0004"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView;", "Landroid/view/ViewGroup;", "LG1/m0;", "Landroidx/compose/ui/platform/A1;", "LA1/Q;", "Landroidx/lifecycle/h;", "Landroid/content/Context;", "context", "LdI/i;", "coroutineContext", "<init>", "(Landroid/content/Context;LdI/i;)V", "Landroidx/compose/ui/focus/d;", "focusDirection", "", "D0", "(I)Z", "Lo1/i;", "C0", "()Lo1/i;", "", "direction", "Landroid/view/View;", "l0", "(I)Landroid/view/View;", "previouslyFocusedRect", "E0", "(Landroidx/compose/ui/focus/d;Lo1/i;)Z", "LXH/N;", "B0", "()V", "Ll1/h;", "transferData", "Lo1/m;", "decorationSize", "Lkotlin/Function1;", "Lr1/f;", "drawDragDecoration", "T0", "(Ll1/h;JLnI/l;)Z", "viewGroup", "h0", "(Landroid/view/ViewGroup;)V", "virtualViewId", "Landroid/view/accessibility/AccessibilityNodeInfo;", "info", "", "extraDataKey", "c0", "(ILandroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)V", "LG1/G;", "nodeToRemeasure", "M0", "(LG1/G;)V", "g0", "(LG1/G;)Z", "j0", "a", "b", "LXH/H;", "F0", "(II)J", "measureSpec", "i0", "(I)J", "V0", "node", "v0", "u0", "Landroid/view/MotionEvent;", "event", "r0", "(Landroid/view/MotionEvent;)Z", "motionEvent", "LA1/S;", "q0", "(Landroid/view/MotionEvent;)I", "lastEvent", "s0", "(Landroid/view/MotionEvent;Landroid/view/MotionEvent;)Z", "x0", "Q0", "action", "", "eventTime", "forceHover", "R0", "(Landroid/view/MotionEvent;IJZ)V", "y0", "G0", "H0", "(Landroid/view/MotionEvent;)V", "I0", "d0", "()Z", "w0", "z0", "accessibilityId", "currentView", "m0", "(ILandroid/view/View;)Landroid/view/View;", "Lkotlin/Function2;", "Landroidx/compose/ui/platform/L0;", "LdI/e;", "", "", "session", "q", "(LnI/p;LdI/e;)Ljava/lang/Object;", "Landroid/graphics/Rect;", "rect", "getFocusedRect", "(Landroid/graphics/Rect;)V", "Landroid/view/ViewStructure;", "structure", "dispatchProvideStructure", "(Landroid/view/ViewStructure;)V", "localVisibleRect", "Landroid/graphics/Point;", "windowOffset", "Ljava/util/function/Consumer;", "Landroid/view/ScrollCaptureTarget;", "targets", "onScrollCaptureSearch", "(Landroid/graphics/Rect;Landroid/graphics/Point;Ljava/util/function/Consumer;)V", "Landroidx/lifecycle/y;", "owner", "onResume", "(Landroidx/lifecycle/y;)V", "focused", "focusSearch", "(Landroid/view/View;I)Landroid/view/View;", "requestFocus", "(ILandroid/graphics/Rect;)Z", "gainFocus", "onFocusChanged", "(ZILandroid/graphics/Rect;)V", "hasWindowFocus", "onWindowFocusChanged", "(Z)V", "Landroid/view/KeyEvent;", "dispatchKeyEvent", "(Landroid/view/KeyEvent;)Z", "dispatchKeyEventPreIme", "intervalMillis", "setAccessibilityEventBatchIntervalMillis", "(J)V", "C", "x", "L0", "A", "Lkotlin/Function0;", "listener", "g", "(LnI/a;)V", "child", "addView", "(Landroid/view/View;)V", "index", "(Landroid/view/View;I)V", "width", "height", "(Landroid/view/View;II)V", "Landroid/view/ViewGroup$LayoutParams;", "params", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "view", "layoutNode", "b0", "(Landroidx/compose/ui/viewinterop/AndroidViewHolder;LG1/G;)V", "K0", "(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)V", "Landroid/graphics/Canvas;", "canvas", "k0", "(Landroidx/compose/ui/viewinterop/AndroidViewHolder;Landroid/graphics/Canvas;)V", "sendPointerUpdate", "Lc2/b;", "constraints", "D", "(LG1/G;J)V", "affectsLookahead", "y", "(LG1/G;Z)V", "forceRequest", "scheduleMeasureAndLayout", "j", "(LG1/G;ZZZ)V", "t", "(LG1/G;ZZ)V", "p", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "changed", "l", "r", "onLayout", "(ZIIII)V", "onDraw", "(Landroid/graphics/Canvas;)V", "Lp1/n0;", "Ls1/c;", "drawBlock", "invalidateParentLayer", "explicitLayer", "LG1/l0;", "d", "(LnI/p;LnI/a;Ls1/c;)LG1/l0;", "layer", "J0", "(LG1/l0;)Z", "B", "m", "Landroidx/compose/ui/viewinterop/InteropView;", "h", "LG1/m0$b;", "(LG1/m0$b;)V", "Ly1/b;", "keyEvent", "n0", "(Landroid/view/KeyEvent;)Landroidx/compose/ui/focus/d;", "dispatchDraw", "isDirty", "A0", "(LG1/l0;Z)V", "Landroidx/compose/ui/platform/AndroidComposeView$b;", "callback", "setOnViewTreeOwnersAvailable", "(LnI/l;)V", "f0", "(LdI/e;)Ljava/lang/Object;", "e0", "t0", "onAttachedToWindow", "onDetachedFromWindow", "flags", "onProvideAutofillVirtualStructure", "(Landroid/view/ViewStructure;I)V", "Landroid/util/SparseArray;", "Landroid/view/autofill/AutofillValue;", "values", "autofill", "(Landroid/util/SparseArray;)V", "", "virtualIds", "", "supportedFormats", "Landroid/view/translation/ViewTranslationRequest;", "requestsCollector", "onCreateVirtualViewTranslationRequests", "([J[ILjava/util/function/Consumer;)V", "Landroid/util/LongSparseArray;", "Landroid/view/translation/ViewTranslationResponse;", "response", "onVirtualViewTranslationResponses", "(Landroid/util/LongSparseArray;)V", "dispatchGenericMotionEvent", "dispatchTouchEvent", "canScrollHorizontally", "canScrollVertically", "Lo1/g;", "localPosition", "z", "(J)J", "Lp1/O0;", "localTransform", "v", "([F)V", "positionOnScreen", "u", "onCheckIsTextEditor", "Landroid/view/inputmethod/EditorInfo;", "outAttrs", "Landroid/view/inputmethod/InputConnection;", "onCreateInputConnection", "(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;", "positionInWindow", "w", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "layoutDirection", "onRtlPropertiesChanged", "(I)V", "dispatchHoverEvent", "findViewByAccessibilityIdTraversal", "shouldDelayChildPressedState", "J", "lastDownPointerPosition", "Z", "superclassInitComplete", "LG1/I;", "c", "LG1/I;", "getSharedDrawScope", "()LG1/I;", "sharedDrawScope", "Lc2/d;", "<set-?>", "LU0/r0;", "getDensity", "()Lc2/d;", "setDensity", "(Lc2/d;)V", "density", "LL1/f;", "e", "LL1/f;", "rootSemanticsNode", "Landroidx/compose/ui/semantics/EmptySemanticsElement;", "f", "Landroidx/compose/ui/semantics/EmptySemanticsElement;", "semanticsModifier", "Ln1/i;", "Ln1/i;", "getFocusOwner", "()Ln1/i;", "focusOwner", "Landroidx/compose/ui/platform/DragAndDropModifierOnDragListener;", "Landroidx/compose/ui/platform/DragAndDropModifierOnDragListener;", "dragAndDropModifierOnDragListener", "value", "i", "LdI/i;", "getCoroutineContext", "()LdI/i;", "setCoroutineContext", "(LdI/i;)V", "Ll1/c;", "Ll1/c;", "getDragAndDropManager", "()Ll1/c;", "dragAndDropManager", "Landroidx/compose/ui/platform/D1;", "k", "Landroidx/compose/ui/platform/D1;", "_windowInfo", "Landroidx/compose/ui/d;", "Landroidx/compose/ui/d;", "keyInputModifier", "rotaryInputModifier", "Lp1/o0;", "n", "Lp1/o0;", "canvasHolder", "o", "LG1/G;", "getRoot", "()LG1/G;", "root", "LG1/v0;", "LG1/v0;", "getRootForTest", "()LG1/v0;", "rootForTest", "LL1/r;", "LL1/r;", "getSemanticsOwner", "()LL1/r;", "semanticsOwner", "Landroidx/compose/ui/platform/v;", "Landroidx/compose/ui/platform/v;", "composeAccessibilityDelegate", "Lk1/b;", "s", "Lk1/b;", "getContentCaptureManager$ui_release", "()Lk1/b;", "setContentCaptureManager$ui_release", "(Lk1/b;)V", "contentCaptureManager", "Landroidx/compose/ui/platform/i;", "Landroidx/compose/ui/platform/i;", "getAccessibilityManager", "()Landroidx/compose/ui/platform/i;", "accessibilityManager", "Lp1/H0;", "Lp1/H0;", "getGraphicsContext", "()Lp1/H0;", "graphicsContext", "Lj1/i;", "Lj1/i;", "getAutofillTree", "()Lj1/i;", "autofillTree", "", "Ljava/util/List;", "dirtyLayers", "postponedDirtyLayers", "isDrawingContent", "isPendingInteropViewLayoutChangeDispatch", "LA1/i;", "LA1/i;", "motionEventAdapter", "LA1/F;", "LA1/F;", "pointerInputEventProcessor", "LnI/l;", "getConfigurationChangeObserver", "()LnI/l;", "setConfigurationChangeObserver", "configurationChangeObserver", "Lj1/a;", "Lj1/a;", "_autofill", "E", "observationClearRequested", "Landroidx/compose/ui/platform/j;", "F", "Landroidx/compose/ui/platform/j;", "getClipboardManager", "()Landroidx/compose/ui/platform/j;", "clipboardManager", "LG1/o0;", "G", "LG1/o0;", "getSnapshotObserver", "()LG1/o0;", "snapshotObserver", "H", "getShowLayoutBounds", "setShowLayoutBounds", "getShowLayoutBounds$annotations", "showLayoutBounds", "Landroidx/compose/ui/platform/AndroidViewsHandler;", "I", "Landroidx/compose/ui/platform/AndroidViewsHandler;", "_androidViewsHandler", "Landroidx/compose/ui/platform/DrawChildContainer;", "Landroidx/compose/ui/platform/DrawChildContainer;", "viewLayersContainer", "K", "Lc2/b;", "onMeasureConstraints", "L", "wasMeasuredWithMultipleConstraints", "LG1/S;", "M", "LG1/S;", "measureAndLayoutDelegate", "Landroidx/compose/ui/platform/w1;", "N", "Landroidx/compose/ui/platform/w1;", "getViewConfiguration", "()Landroidx/compose/ui/platform/w1;", "viewConfiguration", "Lc2/n;", "O", "globalPosition", "P", "[I", "tmpPositionArray", "Q", "[F", "tmpMatrix", "R", "viewToWindowMatrix", "S", "windowToViewMatrix", "T", "getLastMatrixRecalculationAnimationTime$ui_release", "()J", "setLastMatrixRecalculationAnimationTime$ui_release", "getLastMatrixRecalculationAnimationTime$ui_release$annotations", "lastMatrixRecalculationAnimationTime", "U", "forceUseMatrixCache", "windowPosition", "isRenderNodeCompatible", "get_viewTreeOwners", "()Landroidx/compose/ui/platform/AndroidComposeView$b;", "set_viewTreeOwners", "(Landroidx/compose/ui/platform/AndroidComposeView$b;)V", "_viewTreeOwners", "LU0/A1;", "getViewTreeOwners", "viewTreeOwners", "onViewTreeOwnersAvailable", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "globalLayoutListener", "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", "scrollChangedListener", "Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;", "Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;", "touchModeChangeListener", "LT1/U;", "LT1/U;", "legacyTextInputServiceAndroid", "LT1/S;", "LT1/S;", "getTextInputService", "()LT1/S;", "textInputService", "Li1/l;", "Landroidx/compose/ui/platform/M;", "Ljava/util/concurrent/atomic/AtomicReference;", "textInputSessionMutex", "Landroidx/compose/ui/platform/j1;", "Landroidx/compose/ui/platform/j1;", "getSoftwareKeyboardController", "()Landroidx/compose/ui/platform/j1;", "softwareKeyboardController", "LS1/l$b;", "LS1/l$b;", "getFontLoader", "()LS1/l$b;", "getFontLoader$annotations", "fontLoader", "LS1/m$b;", "getFontFamilyResolver", "()LS1/m$b;", "setFontFamilyResolver", "(LS1/m$b;)V", "fontFamilyResolver", "currentFontWeightAdjustment", "Lc2/t;", "N0", "getLayoutDirection", "()Lc2/t;", "setLayoutDirection", "(Lc2/t;)V", "Lw1/a;", "O0", "Lw1/a;", "getHapticFeedBack", "()Lw1/a;", "hapticFeedBack", "Lx1/c;", "P0", "Lx1/c;", "_inputModeManager", "LF1/f;", "LF1/f;", "getModifierLocalManager", "()LF1/f;", "modifierLocalManager", "Landroidx/compose/ui/platform/m1;", "Landroidx/compose/ui/platform/m1;", "getTextToolbar", "()Landroidx/compose/ui/platform/m1;", "textToolbar", "S0", "Landroid/view/MotionEvent;", "previousMotionEvent", "relayoutTime", "Landroidx/compose/ui/platform/B1;", "U0", "Landroidx/compose/ui/platform/B1;", "layerCache", "LW0/b;", "LW0/b;", "endApplyChangesListeners", "androidx/compose/ui/platform/AndroidComposeView$u", "W0", "Landroidx/compose/ui/platform/AndroidComposeView$u;", "resendMotionEventRunnable", "Ljava/lang/Runnable;", "X0", "Ljava/lang/Runnable;", "sendHoverExitEvent", "Y0", "hoverExitReceived", "Z0", "LnI/a;", "resendMotionEventOnLayout", "Landroidx/compose/ui/platform/Y;", "a1", "Landroidx/compose/ui/platform/Y;", "matrixToWindow", "b1", "keyboardModifiersRequireUpdate", "LK1/l;", "c1", "LK1/l;", "scrollCapture", "LA1/y;", "d1", "LA1/y;", "getPointerIconService", "()LA1/y;", "pointerIconService", "o0", "(Landroid/content/res/Configuration;)I", "fontWeightAdjustmentCompat", "getView", "()Landroid/view/View;", "Landroidx/compose/ui/platform/C1;", "getWindowInfo", "()Landroidx/compose/ui/platform/C1;", "windowInfo", "Lj1/d;", "getAutofill", "()Lj1/d;", "getAndroidViewsHandler$ui_release", "()Landroidx/compose/ui/platform/AndroidViewsHandler;", "androidViewsHandler", "getMeasureIteration", "measureIteration", "getHasPendingMeasureOrLayout", "hasPendingMeasureOrLayout", "LE1/a0$a;", "getPlacementScope", "()LE1/a0$a;", "placementScope", "Lx1/b;", "getInputModeManager", "()Lx1/b;", "inputModeManager", "getScrollCaptureInProgress$ui_release", "scrollCaptureInProgress", "e1", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidComposeView extends ViewGroup implements m0, A1, Q, C5205h {

    /* renamed from: e1  reason: collision with root package name */
    public static final a f19007e1 = new a((DefaultConstructorMarker) null);

    /* renamed from: f1  reason: collision with root package name */
    public static final int f19008f1 = 8;
    /* access modifiers changed from: private */

    /* renamed from: g1  reason: collision with root package name */
    public static Class<?> f19009g1;
    /* access modifiers changed from: private */

    /* renamed from: h1  reason: collision with root package name */
    public static Method f19010h1;

    /* renamed from: A  reason: collision with root package name */
    private final C4342i f19011A;

    /* renamed from: A0  reason: collision with root package name */
    private final C4899r0 f19012A0;

    /* renamed from: B  reason: collision with root package name */
    private final F f19013B;

    /* renamed from: B0  reason: collision with root package name */
    private final A1 f19014B0;

    /* renamed from: C  reason: collision with root package name */
    private C17642l<? super Configuration, C16807N> f19015C;

    /* renamed from: C0  reason: collision with root package name */
    private C17642l<? super b, C16807N> f19016C0;

    /* renamed from: D  reason: collision with root package name */
    private final C5470a f19017D;

    /* renamed from: D0  reason: collision with root package name */
    private final ViewTreeObserver.OnGlobalLayoutListener f19018D0;

    /* renamed from: E  reason: collision with root package name */
    private boolean f19019E;

    /* renamed from: E0  reason: collision with root package name */
    private final ViewTreeObserver.OnScrollChangedListener f19020E0;

    /* renamed from: F  reason: collision with root package name */
    private final C5111j f19021F;

    /* renamed from: F0  reason: collision with root package name */
    private final ViewTreeObserver.OnTouchModeChangeListener f19022F0;

    /* renamed from: G  reason: collision with root package name */
    private final o0 f19023G;

    /* renamed from: G0  reason: collision with root package name */
    private final U f19024G0;

    /* renamed from: H  reason: collision with root package name */
    private boolean f19025H;

    /* renamed from: H0  reason: collision with root package name */
    private final S f19026H0;

    /* renamed from: I  reason: collision with root package name */
    private AndroidViewsHandler f19027I;

    /* renamed from: I0  reason: collision with root package name */
    private final AtomicReference f19028I0;

    /* renamed from: J  reason: collision with root package name */
    private DrawChildContainer f19029J;

    /* renamed from: J0  reason: collision with root package name */
    private final C5113j1 f19030J0;

    /* renamed from: K  reason: collision with root package name */
    private C5267b f19031K;

    /* renamed from: K0  reason: collision with root package name */
    private final C4819l.b f19032K0;

    /* renamed from: L  reason: collision with root package name */
    private boolean f19033L;

    /* renamed from: L0  reason: collision with root package name */
    private final C4899r0 f19034L0;

    /* renamed from: M  reason: collision with root package name */
    private final G1.S f19035M;

    /* renamed from: M0  reason: collision with root package name */
    private int f19036M0;

    /* renamed from: N  reason: collision with root package name */
    private final w1 f19037N;

    /* renamed from: N0  reason: collision with root package name */
    private final C4899r0 f19038N0;

    /* renamed from: O  reason: collision with root package name */
    private long f19039O;

    /* renamed from: O0  reason: collision with root package name */
    private final C6203a f19040O0;

    /* renamed from: P  reason: collision with root package name */
    private final int[] f19041P;

    /* renamed from: P0  reason: collision with root package name */
    private final x1.c f19042P0;

    /* renamed from: Q  reason: collision with root package name */
    private final float[] f19043Q;

    /* renamed from: Q0  reason: collision with root package name */
    private final F1.f f19044Q0;

    /* renamed from: R  reason: collision with root package name */
    private final float[] f19045R;

    /* renamed from: R0  reason: collision with root package name */
    private final m1 f19046R0;

    /* renamed from: S  reason: collision with root package name */
    private final float[] f19047S;
    /* access modifiers changed from: private */

    /* renamed from: S0  reason: collision with root package name */
    public MotionEvent f19048S0;

    /* renamed from: T  reason: collision with root package name */
    private long f19049T;
    /* access modifiers changed from: private */

    /* renamed from: T0  reason: collision with root package name */
    public long f19050T0;

    /* renamed from: U  reason: collision with root package name */
    private boolean f19051U;

    /* renamed from: U0  reason: collision with root package name */
    private final B1<l0> f19052U0;

    /* renamed from: V0  reason: collision with root package name */
    private final W0.b<C17631a<C16807N>> f19053V0;
    /* access modifiers changed from: private */

    /* renamed from: W0  reason: collision with root package name */
    public final u f19054W0;

    /* renamed from: X0  reason: collision with root package name */
    private final Runnable f19055X0;

    /* renamed from: Y0  reason: collision with root package name */
    private boolean f19056Y0;

    /* renamed from: Z0  reason: collision with root package name */
    private final C17631a<C16807N> f19057Z0;

    /* renamed from: a  reason: collision with root package name */
    private long f19058a;

    /* renamed from: a1  reason: collision with root package name */
    private final Y f19059a1;

    /* renamed from: b  reason: collision with root package name */
    private boolean f19060b = true;

    /* renamed from: b1  reason: collision with root package name */
    private boolean f19061b1;

    /* renamed from: c  reason: collision with root package name */
    private final I f19062c;

    /* renamed from: c1  reason: collision with root package name */
    private final K1.l f19063c1;

    /* renamed from: d  reason: collision with root package name */
    private final C4899r0 f19064d;

    /* renamed from: d1  reason: collision with root package name */
    private final A1.y f19065d1;

    /* renamed from: e  reason: collision with root package name */
    private final L1.f f19066e;

    /* renamed from: f  reason: collision with root package name */
    private final EmptySemanticsElement f19067f;

    /* renamed from: g  reason: collision with root package name */
    private final C5629i f19068g;

    /* renamed from: h  reason: collision with root package name */
    private final DragAndDropModifierOnDragListener f19069h;

    /* renamed from: i  reason: collision with root package name */
    private C17168i f19070i;

    /* renamed from: j  reason: collision with root package name */
    private final C5510c f19071j;

    /* renamed from: k  reason: collision with root package name */
    private final D1 f19072k;

    /* renamed from: l  reason: collision with root package name */
    private final androidx.compose.ui.d f19073l;

    /* renamed from: m  reason: collision with root package name */
    private final androidx.compose.ui.d f19074m;

    /* renamed from: n  reason: collision with root package name */
    private final C5734o0 f19075n;

    /* renamed from: o  reason: collision with root package name */
    private final G f19076o;

    /* renamed from: p  reason: collision with root package name */
    private final v0 f19077p;

    /* renamed from: q  reason: collision with root package name */
    private final L1.r f19078q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final C5136v f19079r;

    /* renamed from: s  reason: collision with root package name */
    private C5492b f19080s;

    /* renamed from: t  reason: collision with root package name */
    private final C5108i f19081t;

    /* renamed from: u  reason: collision with root package name */
    private final H0 f19082u;

    /* renamed from: v  reason: collision with root package name */
    private final C5478i f19083v;

    /* renamed from: w  reason: collision with root package name */
    private final List<l0> f19084w;

    /* renamed from: x  reason: collision with root package name */
    private List<l0> f19085x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f19086y;

    /* renamed from: y0  reason: collision with root package name */
    private long f19087y0;

    /* renamed from: z  reason: collision with root package name */
    private boolean f19088z;

    /* renamed from: z0  reason: collision with root package name */
    private boolean f19089z0;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView$a;", "", "<init>", "()V", "", "b", "()Z", "Ljava/lang/reflect/Method;", "getBooleanMethod", "Ljava/lang/reflect/Method;", "Ljava/lang/Class;", "systemPropertiesClass", "Ljava/lang/Class;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final boolean b() {
            try {
                Boolean bool = null;
                if (AndroidComposeView.f19009g1 == null) {
                    AndroidComposeView.f19009g1 = Class.forName("android.os.SystemProperties");
                    Class Q10 = AndroidComposeView.f19009g1;
                    AndroidComposeView.f19010h1 = Q10 != null ? Q10.getDeclaredMethod("getBoolean", new Class[]{String.class, Boolean.TYPE}) : null;
                }
                Method M10 = AndroidComposeView.f19010h1;
                Object invoke = M10 != null ? M10.invoke((Object) null, new Object[]{"debug.layout", Boolean.FALSE}) : null;
                if (invoke instanceof Boolean) {
                    bool = (Boolean) invoke;
                }
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            } catch (Exception unused) {
                return false;
            }
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView$b;", "", "Landroidx/lifecycle/y;", "lifecycleOwner", "LP4/f;", "savedStateRegistryOwner", "<init>", "(Landroidx/lifecycle/y;LP4/f;)V", "a", "Landroidx/lifecycle/y;", "()Landroidx/lifecycle/y;", "b", "LP4/f;", "()LP4/f;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final C5221y f19090a;

        /* renamed from: b  reason: collision with root package name */
        private final P4.f f19091b;

        public b(C5221y yVar, P4.f fVar) {
            this.f19090a = yVar;
            this.f19091b = fVar;
        }

        public final C5221y a() {
            return this.f19090a;
        }

        public final P4.f b() {
            return this.f19091b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lx1/a;", "it", "", "a", "(I)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class c extends C17544u implements C17642l<C6240a, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AndroidComposeView f19092c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(AndroidComposeView androidComposeView) {
            super(1);
            this.f19092c = androidComposeView;
        }

        public final Boolean a(int i10) {
            C6240a.C0491a aVar = C6240a.f31827b;
            return Boolean.valueOf(C6240a.f(i10, aVar.b()) ? this.f19092c.isInTouchMode() : C6240a.f(i10, aVar.a()) ? this.f19092c.isInTouchMode() ? this.f19092c.requestFocusFromTouch() : true : false);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((C6240a) obj).i());
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/compose/ui/platform/AndroidComposeView$d", "LI2/a;", "Landroid/view/View;", "host", "LJ2/t;", "info", "LXH/N;", "g", "(Landroid/view/View;LJ2/t;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d extends C4597a {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ AndroidComposeView f19093d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ G f19094e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ AndroidComposeView f19095f;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LG1/G;", "it", "", "a", "(LG1/G;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        static final class a extends C17544u implements C17642l<G, Boolean> {

            /* renamed from: c  reason: collision with root package name */
            public static final a f19096c = new a();

            a() {
                super(1);
            }

            /* renamed from: a */
            public final Boolean invoke(G g10) {
                return Boolean.valueOf(g10.m0().r(C4502e0.a(8)));
            }
        }

        d(AndroidComposeView androidComposeView, G g10, AndroidComposeView androidComposeView2) {
            this.f19093d = androidComposeView;
            this.f19094e = g10;
            this.f19095f = androidComposeView2;
        }

        public void g(View view, J2.t tVar) {
            super.g(view, tVar);
            if (this.f19093d.f19079r.p0()) {
                tVar.Y0(false);
            }
            G f10 = L1.q.f(this.f19094e, a.f19096c);
            Integer valueOf = f10 != null ? Integer.valueOf(f10.q()) : null;
            if (valueOf == null || valueOf.intValue() == this.f19093d.getSemanticsOwner().a().o()) {
                valueOf = -1;
            }
            tVar.G0(this.f19095f, valueOf.intValue());
            int q10 = this.f19094e.q();
            int e10 = this.f19093d.f19079r.e0().e(q10, -1);
            if (e10 != -1) {
                View h10 = C5107h1.h(this.f19093d.getAndroidViewsHandler$ui_release(), e10);
                if (h10 != null) {
                    tVar.V0(h10);
                } else {
                    tVar.W0(this.f19095f, e10);
                }
                this.f19093d.c0(q10, tVar.Z0(), this.f19093d.f19079r.c0());
            }
            int e11 = this.f19093d.f19079r.d0().e(q10, -1);
            if (e11 != -1) {
                View h11 = C5107h1.h(this.f19093d.getAndroidViewsHandler$ui_release(), e11);
                if (h11 != null) {
                    tVar.T0(h11);
                } else {
                    tVar.U0(this.f19095f, e11);
                }
                this.f19093d.c0(q10, tVar.Z0(), this.f19093d.f19079r.b0());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/res/Configuration;", "it", "LXH/N;", "a", "(Landroid/content/res/Configuration;)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends C17544u implements C17642l<Configuration, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final e f19097c = new e();

        e() {
            super(1);
        }

        public final void a(Configuration configuration) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Configuration) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class f extends C17540p implements C17631a<androidx.compose.ui.platform.coreshims.c> {
        f(Object obj) {
            super(0, obj, K.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", 1);
        }

        /* renamed from: t */
        public final androidx.compose.ui.platform.coreshims.c invoke() {
            return K.g((View) this.receiver);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class g extends C17544u implements C17631a<Boolean> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AndroidComposeView f19098c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ KeyEvent f19099d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(AndroidComposeView androidComposeView, KeyEvent keyEvent) {
            super(0);
            this.f19098c = androidComposeView;
            this.f19099d = keyEvent;
        }

        public final Boolean invoke() {
            return Boolean.valueOf(AndroidComposeView.super.dispatchKeyEvent(this.f19099d));
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class h extends C17540p implements nI.q<C5515h, C5673m, C17642l<? super r1.f, ? extends C16807N>, Boolean> {
        h(Object obj) {
            super(3, obj, AndroidComposeView.class, "startDrag", "startDrag-12SF9DM(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLkotlin/jvm/functions/Function1;)Z", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return t((C5515h) obj, ((C5673m) obj2).q(), (C17642l) obj3);
        }

        public final Boolean t(C5515h hVar, long j10, C17642l<? super r1.f, C16807N> lVar) {
            return Boolean.valueOf(((AndroidComposeView) this.receiver).T0(hVar, j10, lVar));
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class i extends C17540p implements C17642l<C17631a<? extends C16807N>, C16807N> {
        i(Object obj) {
            super(1, obj, AndroidComposeView.class, "registerOnEndApplyChangesListener", "registerOnEndApplyChangesListener(Lkotlin/jvm/functions/Function0;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            t((C17631a) obj);
            return C16807N.f139792a;
        }

        public final void t(C17631a<C16807N> aVar) {
            ((AndroidComposeView) this.receiver).g(aVar);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class j extends C17540p implements nI.p<androidx.compose.ui.focus.d, C5669i, Boolean> {
        j(Object obj) {
            super(2, obj, AndroidComposeView.class, "onRequestFocusForOwner", "onRequestFocusForOwner-7o62pno(Landroidx/compose/ui/focus/FocusDirection;Landroidx/compose/ui/geometry/Rect;)Z", 0);
        }

        /* renamed from: t */
        public final Boolean invoke(androidx.compose.ui.focus.d dVar, C5669i iVar) {
            return Boolean.valueOf(((AndroidComposeView) this.receiver).E0(dVar, iVar));
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class k extends C17540p implements C17642l<androidx.compose.ui.focus.d, Boolean> {
        k(Object obj) {
            super(1, obj, AndroidComposeView.class, "onMoveFocusInChildren", "onMoveFocusInChildren-3ESFkO8(I)Z", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return t(((androidx.compose.ui.focus.d) obj).o());
        }

        public final Boolean t(int i10) {
            return Boolean.valueOf(((AndroidComposeView) this.receiver).D0(i10));
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class l extends C17540p implements C17631a<C16807N> {
        l(Object obj) {
            super(0, obj, AndroidComposeView.class, "onClearFocusForOwner", "onClearFocusForOwner()V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            t();
            return C16807N.f139792a;
        }

        public final void t() {
            ((AndroidComposeView) this.receiver).B0();
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class m extends C17540p implements C17631a<C5669i> {
        m(Object obj) {
            super(0, obj, AndroidComposeView.class, "onFetchFocusRect", "onFetchFocusRect()Landroidx/compose/ui/geometry/Rect;", 0);
        }

        /* renamed from: t */
        public final C5669i invoke() {
            return ((AndroidComposeView) this.receiver).C0();
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class n extends C17548y {
        n(Object obj) {
            super(obj, AndroidComposeView.class, "layoutDirection", "getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;", 0);
        }

        public Object get() {
            return ((AndroidComposeView) this.receiver).getLayoutDirection();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "it", "", "a", "(Landroidx/compose/ui/focus/FocusTargetNode;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class o extends C17544u implements C17642l<FocusTargetNode, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        public static final o f19100c = new o();

        o() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly1/b;", "keyEvent", "", "a", "(Landroid/view/KeyEvent;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class p extends C17544u implements C17642l<C6254b, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AndroidComposeView f19101c;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "it", "", "a", "(Landroidx/compose/ui/focus/FocusTargetNode;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        static final class a extends C17544u implements C17642l<FocusTargetNode, Boolean> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.focus.d f19102c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(androidx.compose.ui.focus.d dVar) {
                super(1);
                this.f19102c = dVar;
            }

            /* renamed from: a */
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                Boolean k10 = androidx.compose.ui.focus.q.k(focusTargetNode, this.f19102c.o());
                return Boolean.valueOf(k10 != null ? k10.booleanValue() : true);
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "it", "", "a", "(Landroidx/compose/ui/focus/FocusTargetNode;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        static final class b extends C17544u implements C17642l<FocusTargetNode, Boolean> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.focus.d f19103c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(androidx.compose.ui.focus.d dVar) {
                super(1);
                this.f19103c = dVar;
            }

            /* renamed from: a */
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                Boolean k10 = androidx.compose.ui.focus.q.k(focusTargetNode, this.f19103c.o());
                return Boolean.valueOf(k10 != null ? k10.booleanValue() : true);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(AndroidComposeView androidComposeView) {
            super(1);
            this.f19101c = androidComposeView;
        }

        public final Boolean a(KeyEvent keyEvent) {
            androidx.compose.ui.focus.d n02 = this.f19101c.n0(keyEvent);
            if (n02 == null || !C6255c.e(C6256d.b(keyEvent), C6255c.f32260a.a())) {
                return Boolean.FALSE;
            }
            C5669i T10 = this.f19101c.C0();
            Boolean k10 = this.f19101c.getFocusOwner().k(n02.o(), T10, new b(n02));
            boolean z10 = true;
            if (k10 != null ? k10.booleanValue() : true) {
                return Boolean.TRUE;
            }
            if (!androidx.compose.ui.focus.h.a(n02.o())) {
                return Boolean.FALSE;
            }
            Integer c10 = androidx.compose.ui.focus.f.c(n02.o());
            if (c10 != null) {
                int intValue = c10.intValue();
                Rect b10 = T10 != null ? b1.b(T10) : null;
                if (b10 != null) {
                    View K10 = this.f19101c.l0(intValue);
                    if (C17542s.e(K10, this.f19101c)) {
                        K10 = null;
                    }
                    if (K10 != null && androidx.compose.ui.focus.f.b(K10, Integer.valueOf(intValue), b10)) {
                        return Boolean.TRUE;
                    }
                    if (!this.f19101c.getFocusOwner().j(false, true, false, n02.o())) {
                        return Boolean.TRUE;
                    }
                    Boolean k11 = this.f19101c.getFocusOwner().k(n02.o(), (C5669i) null, new a(n02));
                    if (k11 != null) {
                        z10 = k11.booleanValue();
                    }
                    return Boolean.valueOf(z10);
                }
                throw new IllegalStateException("Invalid rect");
            }
            throw new IllegalStateException("Invalid focus direction");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((C6254b) obj).f());
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\t"}, d2 = {"androidx/compose/ui/platform/AndroidComposeView$q", "LA1/y;", "LA1/w;", "value", "LXH/N;", "a", "(LA1/w;)V", "LA1/w;", "currentIcon", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class q implements A1.y {

        /* renamed from: a  reason: collision with root package name */
        private C4355w f19104a = C4355w.f4447a.a();

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AndroidComposeView f19105b;

        q(AndroidComposeView androidComposeView) {
            this.f19105b = androidComposeView;
        }

        public void a(C4355w wVar) {
            if (wVar == null) {
                wVar = C4355w.f4447a.a();
            }
            this.f19104a = wVar;
            I.f19245a.a(this.f19105b, wVar);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class r extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AndroidComposeView f19106c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ AndroidViewHolder f19107d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(AndroidComposeView androidComposeView, AndroidViewHolder androidViewHolder) {
            super(0);
            this.f19106c = androidComposeView;
            this.f19107d = androidViewHolder;
        }

        public final void invoke() {
            this.f19106c.getAndroidViewsHandler$ui_release().removeViewInLayout(this.f19107d);
            HashMap<G, AndroidViewHolder> layoutNodeToHolder = this.f19106c.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder();
            W.d(layoutNodeToHolder).remove(this.f19106c.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().remove(this.f19107d));
            this.f19107d.setImportantForAccessibility(0);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "it", "", "a", "(Landroidx/compose/ui/focus/FocusTargetNode;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class s extends C17544u implements C17642l<FocusTargetNode, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f19108c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(int i10) {
            super(1);
            this.f19108c = i10;
        }

        /* renamed from: a */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            Boolean k10 = androidx.compose.ui.focus.q.k(focusTargetNode, this.f19108c);
            return Boolean.valueOf(k10 != null ? k10.booleanValue() : false);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class t extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AndroidComposeView f19109c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        t(AndroidComposeView androidComposeView) {
            super(0);
            this.f19109c = androidComposeView;
        }

        public final void invoke() {
            MotionEvent N10 = this.f19109c.f19048S0;
            if (N10 != null) {
                int actionMasked = N10.getActionMasked();
                if (actionMasked == 7 || actionMasked == 9) {
                    this.f19109c.f19050T0 = SystemClock.uptimeMillis();
                    AndroidComposeView androidComposeView = this.f19109c;
                    androidComposeView.post(androidComposeView.f19054W0);
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/platform/AndroidComposeView$u", "Ljava/lang/Runnable;", "LXH/N;", "run", "()V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class u implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AndroidComposeView f19110a;

        u(AndroidComposeView androidComposeView) {
            this.f19110a = androidComposeView;
        }

        public void run() {
            this.f19110a.removeCallbacks(this);
            MotionEvent N10 = this.f19110a.f19048S0;
            if (N10 != null) {
                boolean z10 = false;
                if (N10.getToolType(0) == 3) {
                    z10 = true;
                }
                int actionMasked = N10.getActionMasked();
                if (z10) {
                    if (actionMasked == 10 || actionMasked == 1) {
                        return;
                    }
                } else if (actionMasked == 1) {
                    return;
                }
                int i10 = 7;
                if (!(actionMasked == 7 || actionMasked == 9)) {
                    i10 = 2;
                }
                AndroidComposeView androidComposeView = this.f19110a;
                androidComposeView.R0(N10, i10, androidComposeView.f19050T0, false);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LC1/b;", "it", "", "a", "(LC1/b;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class v extends C17544u implements C17642l<C1.b, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        public static final v f19111c = new v();

        v() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(C1.b bVar) {
            return Boolean.FALSE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function0;", "LXH/N;", "command", "b", "(LnI/a;)V"}, k = 3, mv = {1, 8, 0})
    static final class w extends C17544u implements C17642l<C17631a<? extends C16807N>, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AndroidComposeView f19112c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        w(AndroidComposeView androidComposeView) {
            super(1);
            this.f19112c = androidComposeView;
        }

        /* access modifiers changed from: private */
        public static final void c(C17631a aVar) {
            aVar.invoke();
        }

        public final void b(C17631a<C16807N> aVar) {
            Handler handler = this.f19112c.getHandler();
            if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                aVar.invoke();
                return;
            }
            Handler handler2 = this.f19112c.getHandler();
            if (handler2 != null) {
                handler2.post(new C5127q(aVar));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((C17631a) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.AndroidComposeView", f = "AndroidComposeView.android.kt", l = {592}, m = "textInputSession")
    static final class x extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f19113c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ AndroidComposeView f19114d;

        /* renamed from: e  reason: collision with root package name */
        int f19115e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        x(AndroidComposeView androidComposeView, C17164e<? super x> eVar) {
            super(eVar);
            this.f19114d = androidComposeView;
        }

        public final Object invokeSuspend(Object obj) {
            this.f19113c = obj;
            this.f19115e |= Integer.MIN_VALUE;
            return this.f19114d.q((nI.p<? super L0, ? super C17164e<?>, ? extends Object>) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQJ/Q;", "it", "Landroidx/compose/ui/platform/M;", "a", "(LQJ/Q;)Landroidx/compose/ui/platform/M;"}, k = 3, mv = {1, 8, 0})
    static final class y extends C17544u implements C17642l<QJ.Q, M> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AndroidComposeView f19116c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        y(AndroidComposeView androidComposeView) {
            super(1);
            this.f19116c = androidComposeView;
        }

        /* renamed from: a */
        public final M invoke(QJ.Q q10) {
            AndroidComposeView androidComposeView = this.f19116c;
            return new M(androidComposeView, androidComposeView.getTextInputService(), q10);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView$b;", "b", "()Landroidx/compose/ui/platform/AndroidComposeView$b;"}, k = 3, mv = {1, 8, 0})
    static final class z extends C17544u implements C17631a<b> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AndroidComposeView f19117c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        z(AndroidComposeView androidComposeView) {
            super(0);
            this.f19117c = androidComposeView;
        }

        /* renamed from: b */
        public final b invoke() {
            return this.f19117c.get_viewTreeOwners();
        }
    }

    public AndroidComposeView(Context context, C17168i iVar) {
        super(context);
        C5667g.a aVar = C5667g.f26701b;
        this.f19058a = aVar.b();
        K1.l lVar = null;
        this.f19062c = new I((C5815a) null, 1, (DefaultConstructorMarker) null);
        this.f19064d = p1.i(C5266a.a(context), p1.p());
        L1.f fVar = new L1.f();
        this.f19066e = fVar;
        EmptySemanticsElement emptySemanticsElement = new EmptySemanticsElement(fVar);
        this.f19067f = emptySemanticsElement;
        this.f19068g = new FocusOwnerImpl(new i(this), new j(this), new k(this), new l(this), new m(this), new n(this));
        DragAndDropModifierOnDragListener dragAndDropModifierOnDragListener = new DragAndDropModifierOnDragListener(new h(this));
        this.f19069h = dragAndDropModifierOnDragListener;
        this.f19070i = iVar;
        this.f19071j = dragAndDropModifierOnDragListener;
        this.f19072k = new D1();
        d.a aVar2 = androidx.compose.ui.d.f18749a;
        androidx.compose.ui.d a10 = androidx.compose.ui.input.key.a.a(aVar2, new p(this));
        this.f19073l = a10;
        androidx.compose.ui.d a11 = androidx.compose.ui.input.rotary.a.a(aVar2, v.f19111c);
        this.f19074m = a11;
        this.f19075n = new C5734o0();
        G g10 = new G(false, 0, 3, (DefaultConstructorMarker) null);
        g10.m(e0.f5886b);
        g10.a(getDensity());
        g10.j(aVar2.s(emptySemanticsElement).s(a11).s(a10).s(getFocusOwner().i()).s(dragAndDropModifierOnDragListener.d()));
        this.f19076o = g10;
        this.f19077p = this;
        this.f19078q = new L1.r(getRoot(), fVar);
        C5136v vVar = new C5136v(this);
        this.f19079r = vVar;
        this.f19080s = new C5492b(this, new f(this));
        this.f19081t = new C5108i(context);
        this.f19082u = M.a(this);
        this.f19083v = new C5478i();
        this.f19084w = new ArrayList();
        this.f19011A = new C4342i();
        this.f19013B = new F(getRoot());
        this.f19015C = e.f19097c;
        this.f19017D = d0() ? new C5470a(this, getAutofillTree()) : null;
        this.f19021F = new C5111j(context);
        this.f19023G = new o0(new w(this));
        this.f19035M = new G1.S(getRoot());
        this.f19037N = new T(ViewConfiguration.get(context));
        this.f19039O = c2.o.a(Integer.MAX_VALUE, Integer.MAX_VALUE);
        this.f19041P = new int[]{0, 0};
        float[] c10 = O0.c((float[]) null, 1, (DefaultConstructorMarker) null);
        this.f19043Q = c10;
        this.f19045R = O0.c((float[]) null, 1, (DefaultConstructorMarker) null);
        this.f19047S = O0.c((float[]) null, 1, (DefaultConstructorMarker) null);
        this.f19049T = -1;
        this.f19087y0 = aVar.a();
        this.f19089z0 = true;
        this.f19012A0 = u1.e((Object) null, (o1) null, 2, (Object) null);
        this.f19014B0 = p1.e(new z(this));
        this.f19018D0 = new C5119m(this);
        this.f19020E0 = new C5121n(this);
        this.f19022F0 = new C5123o(this);
        U u10 = new U(getView(), this);
        this.f19024G0 = u10;
        this.f19026H0 = new S(K.h().invoke(u10));
        this.f19028I0 = i1.l.a();
        this.f19030J0 = new C5106h0(getTextInputService());
        this.f19032K0 = new L(context);
        this.f19034L0 = p1.i(C4824q.a(context), p1.p());
        this.f19036M0 = o0(context.getResources().getConfiguration());
        c2.t e10 = androidx.compose.ui.focus.f.e(context.getResources().getConfiguration().getLayoutDirection());
        this.f19038N0 = u1.e(e10 == null ? c2.t.Ltr : e10, (o1) null, 2, (Object) null);
        this.f19040O0 = new C6205c(this);
        this.f19042P0 = new x1.c(isInTouchMode() ? C6240a.f31827b.b() : C6240a.f31827b.a(), new c(this), (DefaultConstructorMarker) null);
        this.f19044Q0 = new F1.f(this);
        this.f19046R0 = new N(this);
        this.f19052U0 = new B1<>();
        this.f19053V0 = new W0.b<>(new C17631a[16], 0);
        this.f19054W0 = new u(this);
        this.f19055X0 = new C5125p(this);
        this.f19057Z0 = new t(this);
        int i10 = Build.VERSION.SDK_INT;
        this.f19059a1 = i10 < 29 ? new Z(c10, (DefaultConstructorMarker) null) : new C5088b0();
        addOnAttachStateChangeListener(this.f19080s);
        setWillNotDraw(false);
        setFocusable(true);
        J.f19261a.a(this, 1, false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        C4600b0.p0(this, vVar);
        C17642l<A1, C16807N> a12 = A1.f18995i0.a();
        if (a12 != null) {
            a12.invoke(this);
        }
        setOnDragListener(dragAndDropModifierOnDragListener);
        getRoot().x(this);
        if (i10 >= 29) {
            B.f19152a.a(this);
        }
        this.f19063c1 = i10 >= 31 ? new K1.l() : lVar;
        this.f19065d1 = new q(this);
    }

    /* access modifiers changed from: private */
    public final void B0() {
        if (isFocused() || hasFocus()) {
            super.clearFocus();
        }
    }

    /* access modifiers changed from: private */
    public final C5669i C0() {
        if (isFocused()) {
            return getFocusOwner().o();
        }
        View findFocus = findFocus();
        if (findFocus != null) {
            return androidx.compose.ui.focus.f.a(findFocus);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public final boolean D0(int i10) {
        d.a aVar = androidx.compose.ui.focus.d.f18832b;
        if (androidx.compose.ui.focus.d.l(i10, aVar.b()) || androidx.compose.ui.focus.d.l(i10, aVar.c())) {
            return false;
        }
        Integer c10 = androidx.compose.ui.focus.f.c(i10);
        if (c10 != null) {
            int intValue = c10.intValue();
            C5669i C02 = C0();
            Rect b10 = C02 != null ? b1.b(C02) : null;
            FocusFinder instance = FocusFinder.getInstance();
            View findNextFocus = b10 == null ? instance.findNextFocus(this, findFocus(), intValue) : instance.findNextFocusFromRect(this, b10, intValue);
            if (findNextFocus != null) {
                return androidx.compose.ui.focus.f.b(findNextFocus, Integer.valueOf(intValue), b10);
            }
            return false;
        }
        throw new IllegalStateException("Invalid focus direction");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        r2 = androidx.compose.ui.focus.f.c(r2.o());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean E0(androidx.compose.ui.focus.d r2, o1.C5669i r3) {
        /*
            r1 = this;
            boolean r0 = r1.isFocused()
            if (r0 != 0) goto L_0x002d
            boolean r0 = r1.hasFocus()
            if (r0 == 0) goto L_0x000d
            goto L_0x002d
        L_0x000d:
            if (r2 == 0) goto L_0x001e
            int r2 = r2.o()
            java.lang.Integer r2 = androidx.compose.ui.focus.f.c(r2)
            if (r2 == 0) goto L_0x001e
            int r2 = r2.intValue()
            goto L_0x0020
        L_0x001e:
            r2 = 130(0x82, float:1.82E-43)
        L_0x0020:
            if (r3 == 0) goto L_0x0027
            android.graphics.Rect r3 = p1.b1.b(r3)
            goto L_0x0028
        L_0x0027:
            r3 = 0
        L_0x0028:
            boolean r2 = super.requestFocus(r2, r3)
            return r2
        L_0x002d:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.E0(androidx.compose.ui.focus.d, o1.i):boolean");
    }

    private final long F0(int i10, int i11) {
        return C16801H.b(C16801H.b((long) i11) | C16801H.b(C16801H.b((long) i10) << 32));
    }

    private final void G0() {
        if (!this.f19051U) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            if (currentAnimationTimeMillis != this.f19049T) {
                this.f19049T = currentAnimationTimeMillis;
                I0();
                ViewParent parent = getParent();
                View view = this;
                while (parent instanceof ViewGroup) {
                    view = (View) parent;
                    parent = ((ViewGroup) view).getParent();
                }
                view.getLocationOnScreen(this.f19041P);
                int[] iArr = this.f19041P;
                view.getLocationInWindow(iArr);
                int[] iArr2 = this.f19041P;
                this.f19087y0 = C5668h.a(((float) iArr[0]) - ((float) iArr2[0]), ((float) iArr[1]) - ((float) iArr2[1]));
            }
        }
    }

    private final void H0(MotionEvent motionEvent) {
        this.f19049T = AnimationUtils.currentAnimationTimeMillis();
        I0();
        long f10 = O0.f(this.f19045R, C5668h.a(motionEvent.getX(), motionEvent.getY()));
        this.f19087y0 = C5668h.a(motionEvent.getRawX() - C5667g.m(f10), motionEvent.getRawY() - C5667g.n(f10));
    }

    private final void I0() {
        this.f19059a1.a(this, this.f19045R);
        C5141x0.a(this.f19045R, this.f19047S);
    }

    private final void M0(G g10) {
        if (!isLayoutRequested() && isAttachedToWindow()) {
            if (g10 != null) {
                while (g10 != null && g10.i0() == G.g.InMeasureBlock && g0(g10)) {
                    g10 = g10.q0();
                }
                if (g10 == getRoot()) {
                    requestLayout();
                    return;
                }
            }
            if (getWidth() == 0 || getHeight() == 0) {
                requestLayout();
            } else {
                invalidate();
            }
        }
    }

    static /* synthetic */ void N0(AndroidComposeView androidComposeView, G g10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            g10 = null;
        }
        androidComposeView.M0(g10);
    }

    /* access modifiers changed from: private */
    public static final void O0(AndroidComposeView androidComposeView) {
        androidComposeView.V0();
    }

    /* access modifiers changed from: private */
    public static final void P0(AndroidComposeView androidComposeView) {
        androidComposeView.f19056Y0 = false;
        MotionEvent motionEvent = androidComposeView.f19048S0;
        C17542s.g(motionEvent);
        if (motionEvent.getActionMasked() == 10) {
            androidComposeView.Q0(motionEvent);
            return;
        }
        throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.");
    }

    private final int Q0(MotionEvent motionEvent) {
        E e10;
        if (this.f19061b1) {
            this.f19061b1 = false;
            this.f19072k.b(O.b(motionEvent.getMetaState()));
        }
        D c10 = this.f19011A.c(motionEvent, this);
        if (c10 != null) {
            List<E> b10 = c10.b();
            int size = b10.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i10 = size - 1;
                    e10 = b10.get(size);
                    if (e10.b()) {
                        break;
                    } else if (i10 < 0) {
                        break;
                    } else {
                        size = i10;
                    }
                }
            }
            e10 = null;
            E e11 = e10;
            if (e11 != null) {
                this.f19058a = e11.f();
            }
            int b11 = this.f19013B.b(c10, this, y0(motionEvent));
            int actionMasked = motionEvent.getActionMasked();
            if ((actionMasked != 0 && actionMasked != 5) || A1.S.c(b11)) {
                return b11;
            }
            this.f19011A.e(motionEvent.getPointerId(motionEvent.getActionIndex()));
            return b11;
        }
        this.f19013B.c();
        return A1.G.a(false, false);
    }

    /* access modifiers changed from: private */
    public final void R0(MotionEvent motionEvent, int i10, long j10, boolean z10) {
        MotionEvent motionEvent2 = motionEvent;
        int i11 = i10;
        int actionMasked = motionEvent.getActionMasked();
        int i12 = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i12 = motionEvent.getActionIndex();
            }
        } else if (!(i11 == 9 || i11 == 10)) {
            i12 = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (i12 >= 0 ? 1 : 0);
        if (pointerCount != 0) {
            MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
            for (int i13 = 0; i13 < pointerCount; i13++) {
                pointerPropertiesArr[i13] = new MotionEvent.PointerProperties();
            }
            MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
            for (int i14 = 0; i14 < pointerCount; i14++) {
                pointerCoordsArr[i14] = new MotionEvent.PointerCoords();
            }
            int i15 = 0;
            while (i15 < pointerCount) {
                int i16 = ((i12 < 0 || i15 < i12) ? 0 : 1) + i15;
                motionEvent2.getPointerProperties(i16, pointerPropertiesArr[i15]);
                MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i15];
                motionEvent2.getPointerCoords(i16, pointerCoords);
                long z11 = z(C5668h.a(pointerCoords.x, pointerCoords.y));
                pointerCoords.x = C5667g.m(z11);
                pointerCoords.y = C5667g.n(z11);
                i15++;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j10 : motionEvent.getDownTime(), j10, i10, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z10 ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
            D c10 = this.f19011A.c(obtain, this);
            C17542s.g(c10);
            this.f19013B.b(c10, this, true);
            obtain.recycle();
        }
    }

    static /* synthetic */ void S0(AndroidComposeView androidComposeView, MotionEvent motionEvent, int i10, long j10, boolean z10, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            z10 = true;
        }
        androidComposeView.R0(motionEvent, i10, j10, z10);
    }

    /* access modifiers changed from: private */
    public final boolean T0(C5515h hVar, long j10, C17642l<? super r1.f, C16807N> lVar) {
        Resources resources = getContext().getResources();
        return C.f19156a.a(this, hVar, new C5508a(c2.f.a(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), j10, lVar, (DefaultConstructorMarker) null));
    }

    /* access modifiers changed from: private */
    public static final void U0(AndroidComposeView androidComposeView, boolean z10) {
        androidComposeView.f19042P0.b(z10 ? C6240a.f31827b.b() : C6240a.f31827b.a());
    }

    private final void V0() {
        getLocationOnScreen(this.f19041P);
        long j10 = this.f19039O;
        int h10 = c2.n.h(j10);
        int i10 = c2.n.i(j10);
        int[] iArr = this.f19041P;
        boolean z10 = false;
        int i11 = iArr[0];
        if (!(h10 == i11 && i10 == iArr[1])) {
            this.f19039O = c2.o.a(i11, iArr[1]);
            if (!(h10 == Integer.MAX_VALUE || i10 == Integer.MAX_VALUE)) {
                getRoot().X().I().X1();
                z10 = true;
            }
        }
        this.f19035M.c(z10);
    }

    /* access modifiers changed from: private */
    public final void c0(int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int e10;
        if (C17542s.e(str, this.f19079r.c0())) {
            int e11 = this.f19079r.e0().e(i10, -1);
            if (e11 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, e11);
            }
        } else if (C17542s.e(str, this.f19079r.b0()) && (e10 = this.f19079r.d0().e(i10, -1)) != -1) {
            accessibilityNodeInfo.getExtras().putInt(str, e10);
        }
    }

    private final boolean d0() {
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r2 = r2.q0();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean g0(G1.G r2) {
        /*
            r1 = this;
            boolean r0 = r1.f19033L
            if (r0 != 0) goto L_0x0013
            G1.G r2 = r2.q0()
            if (r2 == 0) goto L_0x0011
            boolean r2 = r2.Q()
            if (r2 != 0) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r2 = 0
            goto L_0x0014
        L_0x0013:
            r2 = 1
        L_0x0014:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.g0(G1.G):boolean");
    }

    @C16814e
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    /* access modifiers changed from: private */
    public final b get_viewTreeOwners() {
        return (b) this.f19012A0.getValue();
    }

    private final void h0(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).A();
            } else if (childAt instanceof ViewGroup) {
                h0((ViewGroup) childAt);
            }
        }
    }

    private final long i0(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == Integer.MIN_VALUE) {
            return F0(0, size);
        }
        if (mode == 0) {
            return F0(0, Integer.MAX_VALUE);
        }
        if (mode == 1073741824) {
            return F0(size, size);
        }
        throw new IllegalStateException();
    }

    private final void j0() {
        if (this.f19088z) {
            getViewTreeObserver().dispatchOnGlobalLayout();
            this.f19088z = false;
        }
    }

    /* access modifiers changed from: private */
    public final View l0(int i10) {
        View view = this;
        while (view != null) {
            FocusFinder instance = FocusFinder.getInstance();
            View rootView = getRootView();
            C17542s.h(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
            view = instance.findNextFocus((ViewGroup) rootView, view, i10);
            if (view != null && !K.e(this, view)) {
                return view;
            }
        }
        return null;
    }

    private final View m0(int i10, View view) {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", (Class[]) null);
            declaredMethod.setAccessible(true);
            if (C17542s.e(declaredMethod.invoke(view, (Object[]) null), Integer.valueOf(i10))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View m02 = m0(i10, viewGroup.getChildAt(i11));
                    if (m02 != null) {
                        return m02;
                    }
                }
            }
        }
        return null;
    }

    private final int o0(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            return configuration.fontWeightAdjustment;
        }
        return 0;
    }

    /* access modifiers changed from: private */
    public static final void p0(AndroidComposeView androidComposeView) {
        androidComposeView.V0();
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0067 A[Catch:{ all -> 0x002b, all -> 0x0125 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0069 A[Catch:{ all -> 0x002b, all -> 0x0125 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0091 A[Catch:{ all -> 0x002b, all -> 0x0125 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a2 A[Catch:{ all -> 0x002b, all -> 0x0125 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a7 A[Catch:{ all -> 0x002b, all -> 0x0125 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00b4 A[Catch:{ all -> 0x002b, all -> 0x0125 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00bc A[Catch:{ all -> 0x002b, all -> 0x0125 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int q0(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r9 = r17
            r0 = r18
            androidx.compose.ui.platform.AndroidComposeView$u r1 = r9.f19054W0
            r9.removeCallbacks(r1)
            r10 = 0
            r17.H0(r18)     // Catch:{ all -> 0x0125 }
            r11 = 1
            r9.f19051U = r11     // Catch:{ all -> 0x0125 }
            r9.a(r10)     // Catch:{ all -> 0x0125 }
            java.lang.String r1 = "AndroidOwner:onTouch"
            android.os.Trace.beginSection(r1)     // Catch:{ all -> 0x0125 }
            int r12 = r18.getActionMasked()     // Catch:{ all -> 0x002b }
            android.view.MotionEvent r13 = r9.f19048S0     // Catch:{ all -> 0x002b }
            r14 = 3
            if (r13 == 0) goto L_0x0029
            int r1 = r13.getToolType(r10)     // Catch:{ all -> 0x002b }
            if (r1 != r14) goto L_0x0029
            r15 = r11
            goto L_0x002e
        L_0x0029:
            r15 = r10
            goto L_0x002e
        L_0x002b:
            r0 = move-exception
            goto L_0x0127
        L_0x002e:
            r8 = 10
            if (r13 == 0) goto L_0x0043
            boolean r1 = r9.s0(r0, r13)     // Catch:{ all -> 0x002b }
            if (r1 == 0) goto L_0x0043
            boolean r1 = r9.x0(r13)     // Catch:{ all -> 0x002b }
            if (r1 == 0) goto L_0x0045
            A1.F r1 = r9.f19013B     // Catch:{ all -> 0x002b }
            r1.c()     // Catch:{ all -> 0x002b }
        L_0x0043:
            r11 = r8
            goto L_0x0061
        L_0x0045:
            int r1 = r13.getActionMasked()     // Catch:{ all -> 0x002b }
            if (r1 == r8) goto L_0x0043
            if (r15 == 0) goto L_0x0043
            long r4 = r13.getEventTime()     // Catch:{ all -> 0x002b }
            r7 = 8
            r16 = 0
            r3 = 10
            r6 = 0
            r1 = r17
            r2 = r13
            r11 = r8
            r8 = r16
            S0(r1, r2, r3, r4, r6, r7, r8)     // Catch:{ all -> 0x002b }
        L_0x0061:
            int r1 = r0.getToolType(r10)     // Catch:{ all -> 0x002b }
            if (r1 != r14) goto L_0x0069
            r1 = 1
            goto L_0x006a
        L_0x0069:
            r1 = r10
        L_0x006a:
            r8 = 9
            if (r15 != 0) goto L_0x008e
            if (r1 == 0) goto L_0x008e
            if (r12 == r14) goto L_0x008e
            if (r12 == r8) goto L_0x008e
            boolean r1 = r17.y0(r18)     // Catch:{ all -> 0x002b }
            if (r1 == 0) goto L_0x008e
            long r4 = r18.getEventTime()     // Catch:{ all -> 0x002b }
            r7 = 8
            r12 = 0
            r3 = 9
            r6 = 0
            r1 = r17
            r2 = r18
            r14 = r8
            r8 = r12
            S0(r1, r2, r3, r4, r6, r7, r8)     // Catch:{ all -> 0x002b }
            goto L_0x008f
        L_0x008e:
            r14 = r8
        L_0x008f:
            if (r13 == 0) goto L_0x0094
            r13.recycle()     // Catch:{ all -> 0x002b }
        L_0x0094:
            android.view.MotionEvent r1 = r9.f19048S0     // Catch:{ all -> 0x002b }
            if (r1 == 0) goto L_0x0115
            int r1 = r1.getAction()     // Catch:{ all -> 0x002b }
            if (r1 != r11) goto L_0x0115
            android.view.MotionEvent r1 = r9.f19048S0     // Catch:{ all -> 0x002b }
            if (r1 == 0) goto L_0x00a7
            int r1 = r1.getPointerId(r10)     // Catch:{ all -> 0x002b }
            goto L_0x00a8
        L_0x00a7:
            r1 = -1
        L_0x00a8:
            int r2 = r18.getAction()     // Catch:{ all -> 0x002b }
            if (r2 != r14) goto L_0x00bc
            int r2 = r18.getHistorySize()     // Catch:{ all -> 0x002b }
            if (r2 != 0) goto L_0x00bc
            if (r1 < 0) goto L_0x0115
            A1.i r2 = r9.f19011A     // Catch:{ all -> 0x002b }
            r2.e(r1)     // Catch:{ all -> 0x002b }
            goto L_0x0115
        L_0x00bc:
            int r2 = r18.getAction()     // Catch:{ all -> 0x002b }
            if (r2 != 0) goto L_0x0115
            int r2 = r18.getHistorySize()     // Catch:{ all -> 0x002b }
            if (r2 != 0) goto L_0x0115
            android.view.MotionEvent r2 = r9.f19048S0     // Catch:{ all -> 0x002b }
            r3 = 2143289344(0x7fc00000, float:NaN)
            if (r2 == 0) goto L_0x00d3
            float r2 = r2.getX()     // Catch:{ all -> 0x002b }
            goto L_0x00d4
        L_0x00d3:
            r2 = r3
        L_0x00d4:
            android.view.MotionEvent r4 = r9.f19048S0     // Catch:{ all -> 0x002b }
            if (r4 == 0) goto L_0x00dc
            float r3 = r4.getY()     // Catch:{ all -> 0x002b }
        L_0x00dc:
            float r4 = r18.getX()     // Catch:{ all -> 0x002b }
            float r5 = r18.getY()     // Catch:{ all -> 0x002b }
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x00ee
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x00ee
            r2 = r10
            goto L_0x00ef
        L_0x00ee:
            r2 = 1
        L_0x00ef:
            android.view.MotionEvent r3 = r9.f19048S0     // Catch:{ all -> 0x002b }
            if (r3 == 0) goto L_0x00f8
            long r3 = r3.getEventTime()     // Catch:{ all -> 0x002b }
            goto L_0x00fa
        L_0x00f8:
            r3 = -1
        L_0x00fa:
            long r5 = r18.getEventTime()     // Catch:{ all -> 0x002b }
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x0104
            r11 = 1
            goto L_0x0105
        L_0x0104:
            r11 = r10
        L_0x0105:
            if (r2 != 0) goto L_0x0109
            if (r11 == 0) goto L_0x0115
        L_0x0109:
            if (r1 < 0) goto L_0x0110
            A1.i r2 = r9.f19011A     // Catch:{ all -> 0x002b }
            r2.e(r1)     // Catch:{ all -> 0x002b }
        L_0x0110:
            A1.F r1 = r9.f19013B     // Catch:{ all -> 0x002b }
            r1.a()     // Catch:{ all -> 0x002b }
        L_0x0115:
            android.view.MotionEvent r1 = android.view.MotionEvent.obtainNoHistory(r18)     // Catch:{ all -> 0x002b }
            r9.f19048S0 = r1     // Catch:{ all -> 0x002b }
            int r0 = r17.Q0(r18)     // Catch:{ all -> 0x002b }
            android.os.Trace.endSection()     // Catch:{ all -> 0x0125 }
            r9.f19051U = r10
            return r0
        L_0x0125:
            r0 = move-exception
            goto L_0x012b
        L_0x0127:
            android.os.Trace.endSection()     // Catch:{ all -> 0x0125 }
            throw r0     // Catch:{ all -> 0x0125 }
        L_0x012b:
            r9.f19051U = r10
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.q0(android.view.MotionEvent):int");
    }

    private final boolean r0(MotionEvent motionEvent) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        float f10 = -motionEvent.getAxisValue(26);
        return getFocusOwner().b(new C1.b(f10 * C4606e0.h(viewConfiguration, getContext()), f10 * C4606e0.e(viewConfiguration, getContext()), motionEvent.getEventTime(), motionEvent.getDeviceId()));
    }

    private final boolean s0(MotionEvent motionEvent, MotionEvent motionEvent2) {
        return (motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) ? false : true;
    }

    private void setDensity(c2.d dVar) {
        this.f19064d.setValue(dVar);
    }

    private void setFontFamilyResolver(C4820m.b bVar) {
        this.f19034L0.setValue(bVar);
    }

    private void setLayoutDirection(c2.t tVar) {
        this.f19038N0.setValue(tVar);
    }

    private final void set_viewTreeOwners(b bVar) {
        this.f19012A0.setValue(bVar);
    }

    private final void u0(G g10) {
        g10.F0();
        W0.b<G> x02 = g10.x0();
        int r10 = x02.r();
        if (r10 > 0) {
            Object[] q10 = x02.q();
            int i10 = 0;
            do {
                u0((G) q10[i10]);
                i10++;
            } while (i10 < r10);
        }
    }

    private final void v0(G g10) {
        int i10 = 0;
        G1.S.H(this.f19035M, g10, false, 2, (Object) null);
        W0.b<G> x02 = g10.x0();
        int r10 = x02.r();
        if (r10 > 0) {
            Object[] q10 = x02.q();
            do {
                v0((G) q10[i10]);
                i10++;
            } while (i10 < r10);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0082 A[LOOP:0: B:20:0x004c->B:36:0x0082, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0085 A[EDGE_INSN: B:38:0x0085->B:37:0x0085 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean w0(android.view.MotionEvent r7) {
        /*
            r6 = this;
            float r0 = r7.getX()
            boolean r1 = java.lang.Float.isInfinite(r0)
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x0044
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L_0x0044
            float r0 = r7.getY()
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 != 0) goto L_0x0044
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L_0x0044
            float r0 = r7.getRawX()
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 != 0) goto L_0x0044
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L_0x0044
            float r0 = r7.getRawY()
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 != 0) goto L_0x0044
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L_0x0044
            r0 = r2
            goto L_0x0045
        L_0x0044:
            r0 = r3
        L_0x0045:
            if (r0 != 0) goto L_0x0085
            int r1 = r7.getPointerCount()
            r4 = r3
        L_0x004c:
            if (r4 >= r1) goto L_0x0085
            float r0 = r7.getX(r4)
            boolean r5 = java.lang.Float.isInfinite(r0)
            if (r5 != 0) goto L_0x007f
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L_0x007f
            float r0 = r7.getY(r4)
            boolean r5 = java.lang.Float.isInfinite(r0)
            if (r5 != 0) goto L_0x007f
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L_0x007f
            int r0 = android.os.Build.VERSION.SDK_INT
            r5 = 29
            if (r0 < r5) goto L_0x007d
            androidx.compose.ui.platform.B0 r0 = androidx.compose.ui.platform.B0.f19153a
            boolean r0 = r0.a(r7, r4)
            if (r0 != 0) goto L_0x007d
            goto L_0x007f
        L_0x007d:
            r0 = r2
            goto L_0x0080
        L_0x007f:
            r0 = r3
        L_0x0080:
            if (r0 != 0) goto L_0x0085
            int r4 = r4 + 1
            goto L_0x004c
        L_0x0085:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.w0(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r3 = r3.getActionMasked();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean x0(android.view.MotionEvent r3) {
        /*
            r2 = this;
            int r0 = r3.getButtonState()
            r1 = 1
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            int r3 = r3.getActionMasked()
            if (r3 == 0) goto L_0x0015
            r0 = 2
            if (r3 == r0) goto L_0x0015
            r0 = 6
            if (r3 == r0) goto L_0x0015
            r1 = 0
        L_0x0015:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.x0(android.view.MotionEvent):boolean");
    }

    private final boolean y0(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        return 0.0f <= x10 && x10 <= ((float) getWidth()) && 0.0f <= y10 && y10 <= ((float) getHeight());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r0 = r4.f19048S0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean z0(android.view.MotionEvent r5) {
        /*
            r4 = this;
            int r0 = r5.getPointerCount()
            r1 = 1
            if (r0 == r1) goto L_0x0008
            return r1
        L_0x0008:
            android.view.MotionEvent r0 = r4.f19048S0
            if (r0 == 0) goto L_0x002f
            int r2 = r0.getPointerCount()
            int r3 = r5.getPointerCount()
            if (r2 != r3) goto L_0x002f
            float r2 = r5.getRawX()
            float r3 = r0.getRawX()
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x002f
            float r5 = r5.getRawY()
            float r0 = r0.getRawY()
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 != 0) goto L_0x002f
            r1 = 0
        L_0x002f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.z0(android.view.MotionEvent):boolean");
    }

    public void A() {
        if (this.f19019E) {
            getSnapshotObserver().b();
            this.f19019E = false;
        }
        AndroidViewsHandler androidViewsHandler = this.f19027I;
        if (androidViewsHandler != null) {
            h0(androidViewsHandler);
        }
        while (this.f19053V0.v()) {
            int r10 = this.f19053V0.r();
            for (int i10 = 0; i10 < r10; i10++) {
                C17631a aVar = (C17631a) this.f19053V0.q()[i10];
                this.f19053V0.E(i10, null);
                if (aVar != null) {
                    aVar.invoke();
                }
            }
            this.f19053V0.C(0, r10);
        }
    }

    public final void A0(l0 l0Var, boolean z10) {
        if (!z10) {
            if (!this.f19086y) {
                this.f19084w.remove(l0Var);
                List<l0> list = this.f19085x;
                if (list != null) {
                    list.remove(l0Var);
                }
            }
        } else if (!this.f19086y) {
            this.f19084w.add(l0Var);
        } else {
            List list2 = this.f19085x;
            if (list2 == null) {
                list2 = new ArrayList();
                this.f19085x = list2;
            }
            list2.add(l0Var);
        }
    }

    public void B() {
        this.f19079r.u0();
        this.f19080s.v();
    }

    public void C(G g10) {
    }

    public void D(G g10, long j10) {
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            this.f19035M.s(g10, j10);
            if (!this.f19035M.m()) {
                G1.S.d(this.f19035M, false, 1, (Object) null);
                j0();
            }
            C16807N n10 = C16807N.f139792a;
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final boolean J0(l0 l0Var) {
        if (this.f19029J != null) {
            ViewLayer.f19335p.b();
        }
        this.f19052U0.c(l0Var);
        return true;
    }

    public final void K0(AndroidViewHolder androidViewHolder) {
        g(new r(this, androidViewHolder));
    }

    public final void L0() {
        this.f19019E = true;
    }

    public void a(boolean z10) {
        C17631a<C16807N> aVar;
        if (this.f19035M.m() || this.f19035M.n()) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z10) {
                try {
                    aVar = this.f19057Z0;
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            } else {
                aVar = null;
            }
            if (this.f19035M.r(aVar)) {
                requestLayout();
            }
            G1.S.d(this.f19035M, false, 1, (Object) null);
            j0();
            C16807N n10 = C16807N.f139792a;
            Trace.endSection();
        }
    }

    public void addView(View view) {
        addView(view, -1);
    }

    public void autofill(SparseArray<AutofillValue> sparseArray) {
        C5470a aVar;
        if (d0() && (aVar = this.f19017D) != null) {
            C5472c.a(aVar, sparseArray);
        }
    }

    public long b(long j10) {
        G0();
        return O0.f(this.f19045R, j10);
    }

    public final void b0(AndroidViewHolder androidViewHolder, G g10) {
        getAndroidViewsHandler$ui_release().getHolderToLayoutNode().put(androidViewHolder, g10);
        getAndroidViewsHandler$ui_release().addView(androidViewHolder);
        getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(g10, androidViewHolder);
        androidViewHolder.setImportantForAccessibility(1);
        C4600b0.p0(androidViewHolder, new d(this, g10, this));
    }

    public boolean canScrollHorizontally(int i10) {
        return this.f19079r.N(false, i10, this.f19058a);
    }

    public boolean canScrollVertically(int i10) {
        return this.f19079r.N(true, i10, this.f19058a);
    }

    public l0 d(nI.p<? super C5732n0, ? super C5905c, C16807N> pVar, C17631a<C16807N> aVar, C5905c cVar) {
        if (cVar != null) {
            return new C5124o0(cVar, (H0) null, this, pVar, aVar);
        }
        l0 b10 = this.f19052U0.b();
        if (b10 != null) {
            b10.g(pVar, aVar);
            return b10;
        } else if (isHardwareAccelerated() && Build.VERSION.SDK_INT != 28) {
            return new C5124o0(getGraphicsContext().a(), getGraphicsContext(), this, pVar, aVar);
        } else {
            if (isHardwareAccelerated() && this.f19089z0) {
                try {
                    return new C5089b1(this, pVar, aVar);
                } catch (Throwable unused) {
                    this.f19089z0 = false;
                }
            }
            if (this.f19029J == null) {
                ViewLayer.c cVar2 = ViewLayer.f19335p;
                if (!cVar2.a()) {
                    cVar2.d(new View(getContext()));
                }
                DrawChildContainer drawChildContainer = cVar2.b() ? new DrawChildContainer(getContext()) : new ViewLayerContainer(getContext());
                this.f19029J = drawChildContainer;
                addView(drawChildContainer);
            }
            DrawChildContainer drawChildContainer2 = this.f19029J;
            C17542s.g(drawChildContainer2);
            return new ViewLayer(this, drawChildContainer2, pVar, aVar);
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        if (!isAttachedToWindow()) {
            u0(getRoot());
        }
        m0.k(this, false, 1, (Object) null);
        C5342k.f23395e.o();
        this.f19086y = true;
        C5734o0 o0Var = this.f19075n;
        Canvas a10 = o0Var.a().a();
        o0Var.a().b(canvas);
        getRoot().E(o0Var.a(), (C5905c) null);
        o0Var.a().b(a10);
        if (!this.f19084w.isEmpty()) {
            int size = this.f19084w.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f19084w.get(i10).j();
            }
        }
        if (ViewLayer.f19335p.b()) {
            int save = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(save);
        }
        this.f19084w.clear();
        this.f19086y = false;
        List<l0> list = this.f19085x;
        if (list != null) {
            C17542s.g(list);
            this.f19084w.addAll(list);
            list.clear();
        }
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if (this.f19056Y0) {
            removeCallbacks(this.f19055X0);
            if (motionEvent.getActionMasked() == 8) {
                this.f19056Y0 = false;
            } else {
                this.f19055X0.run();
            }
        }
        return motionEvent.getActionMasked() == 8 ? (w0(motionEvent) || !isAttachedToWindow()) ? super.dispatchGenericMotionEvent(motionEvent) : motionEvent.isFromSource(4194304) ? r0(motionEvent) : A1.S.c(q0(motionEvent)) : super.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.f19056Y0) {
            removeCallbacks(this.f19055X0);
            this.f19055X0.run();
        }
        if (w0(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        this.f19079r.V(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10 && y0(motionEvent)) {
                if (motionEvent.getToolType(0) == 3 && motionEvent.getButtonState() != 0) {
                    return false;
                }
                MotionEvent motionEvent2 = this.f19048S0;
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                this.f19048S0 = MotionEvent.obtainNoHistory(motionEvent);
                this.f19056Y0 = true;
                postDelayed(this.f19055X0, 8);
                return false;
            }
        } else if (!z0(motionEvent)) {
            return false;
        }
        return A1.S.c(q0(motionEvent));
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isFocused()) {
            return getFocusOwner().n(C6254b.b(keyEvent), new g(this, keyEvent));
        }
        this.f19072k.b(O.b(keyEvent.getMetaState()));
        return C5629i.a(getFocusOwner(), C6254b.b(keyEvent), (C17631a) null, 2, (Object) null) || super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        return (isFocused() && getFocusOwner().e(C6254b.b(keyEvent))) || super.dispatchKeyEventPreIme(keyEvent);
    }

    public void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            C5144z.f19678a.a(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f19056Y0) {
            removeCallbacks(this.f19055X0);
            MotionEvent motionEvent2 = this.f19048S0;
            C17542s.g(motionEvent2);
            if (motionEvent.getActionMasked() != 0 || s0(motionEvent, motionEvent2)) {
                this.f19055X0.run();
            } else {
                this.f19056Y0 = false;
            }
        }
        if (w0(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        if (motionEvent.getActionMasked() == 2 && !z0(motionEvent)) {
            return false;
        }
        int q02 = q0(motionEvent);
        if (A1.S.b(q02)) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return A1.S.c(q02);
    }

    public final Object e0(C17164e<? super C16807N> eVar) {
        Object M10 = this.f19079r.M(eVar);
        return M10 == C17187b.f() ? M10 : C16807N.f139792a;
    }

    public final Object f0(C17164e<? super C16807N> eVar) {
        Object b10 = this.f19080s.b(eVar);
        return b10 == C17187b.f() ? b10 : C16807N.f139792a;
    }

    public final View findViewByAccessibilityIdTraversal(int i10) {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return m0(i10, this);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", new Class[]{Integer.TYPE});
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(this, new Object[]{Integer.valueOf(i10)});
            if (invoke instanceof View) {
                return (View) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public View focusSearch(View view, int i10) {
        if (view != null) {
            C5669i a10 = androidx.compose.ui.focus.f.a(view);
            androidx.compose.ui.focus.d d10 = androidx.compose.ui.focus.f.d(i10);
            if (C17542s.e(getFocusOwner().k(d10 != null ? d10.o() : androidx.compose.ui.focus.d.f18832b.a(), a10, o.f19100c), Boolean.TRUE)) {
                return this;
            }
        }
        return super.focusSearch(view, i10);
    }

    public void g(C17631a<C16807N> aVar) {
        if (!this.f19053V0.l(aVar)) {
            this.f19053V0.b(aVar);
        }
    }

    public final AndroidViewsHandler getAndroidViewsHandler$ui_release() {
        if (this.f19027I == null) {
            AndroidViewsHandler androidViewsHandler = new AndroidViewsHandler(getContext());
            this.f19027I = androidViewsHandler;
            addView(androidViewsHandler);
            requestLayout();
        }
        AndroidViewsHandler androidViewsHandler2 = this.f19027I;
        C17542s.g(androidViewsHandler2);
        return androidViewsHandler2;
    }

    public C5473d getAutofill() {
        return this.f19017D;
    }

    public C5478i getAutofillTree() {
        return this.f19083v;
    }

    public final C17642l<Configuration, C16807N> getConfigurationChangeObserver() {
        return this.f19015C;
    }

    public final C5492b getContentCaptureManager$ui_release() {
        return this.f19080s;
    }

    public C17168i getCoroutineContext() {
        return this.f19070i;
    }

    public c2.d getDensity() {
        return (c2.d) this.f19064d.getValue();
    }

    public C5510c getDragAndDropManager() {
        return this.f19071j;
    }

    public C5629i getFocusOwner() {
        return this.f19068g;
    }

    public void getFocusedRect(Rect rect) {
        C16807N n10;
        C5669i C02 = C0();
        if (C02 != null) {
            rect.left = Math.round(C02.o());
            rect.top = Math.round(C02.r());
            rect.right = Math.round(C02.p());
            rect.bottom = Math.round(C02.j());
            n10 = C16807N.f139792a;
        } else {
            n10 = null;
        }
        if (n10 == null) {
            super.getFocusedRect(rect);
        }
    }

    public C4820m.b getFontFamilyResolver() {
        return (C4820m.b) this.f19034L0.getValue();
    }

    public C4819l.b getFontLoader() {
        return this.f19032K0;
    }

    public H0 getGraphicsContext() {
        return this.f19082u;
    }

    public C6203a getHapticFeedBack() {
        return this.f19040O0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.f19035M.m();
    }

    public C6241b getInputModeManager() {
        return this.f19042P0;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.f19049T;
    }

    public c2.t getLayoutDirection() {
        return (c2.t) this.f19038N0.getValue();
    }

    public long getMeasureIteration() {
        return this.f19035M.q();
    }

    public F1.f getModifierLocalManager() {
        return this.f19044Q0;
    }

    public a0.a getPlacementScope() {
        return b0.b(this);
    }

    public A1.y getPointerIconService() {
        return this.f19065d1;
    }

    public G getRoot() {
        return this.f19076o;
    }

    public v0 getRootForTest() {
        return this.f19077p;
    }

    public final boolean getScrollCaptureInProgress$ui_release() {
        K1.l lVar;
        if (Build.VERSION.SDK_INT < 31 || (lVar = this.f19063c1) == null) {
            return false;
        }
        return lVar.c();
    }

    public L1.r getSemanticsOwner() {
        return this.f19078q;
    }

    public I getSharedDrawScope() {
        return this.f19062c;
    }

    public boolean getShowLayoutBounds() {
        return this.f19025H;
    }

    public o0 getSnapshotObserver() {
        return this.f19023G;
    }

    public C5113j1 getSoftwareKeyboardController() {
        return this.f19030J0;
    }

    public S getTextInputService() {
        return this.f19026H0;
    }

    public m1 getTextToolbar() {
        return this.f19046R0;
    }

    public View getView() {
        return this;
    }

    public w1 getViewConfiguration() {
        return this.f19037N;
    }

    public final b getViewTreeOwners() {
        return (b) this.f19014B0.getValue();
    }

    public C1 getWindowInfo() {
        return this.f19072k;
    }

    public void h(View view) {
        this.f19088z = true;
    }

    public void j(G g10, boolean z10, boolean z11, boolean z12) {
        if (z10) {
            if (this.f19035M.D(g10, z11) && z12) {
                M0(g10);
            }
        } else if (this.f19035M.G(g10, z11) && z12) {
            M0(g10);
        }
    }

    public final void k0(AndroidViewHolder androidViewHolder, Canvas canvas) {
        getAndroidViewsHandler$ui_release().a(androidViewHolder, canvas);
    }

    public void m(G g10) {
        this.f19079r.t0(g10);
        this.f19080s.u(g10);
    }

    public androidx.compose.ui.focus.d n0(KeyEvent keyEvent) {
        long a10 = C6256d.a(keyEvent);
        C6253a.C0496a aVar = C6253a.f32108b;
        if (C6253a.t(a10, aVar.n())) {
            return androidx.compose.ui.focus.d.i(C6256d.g(keyEvent) ? androidx.compose.ui.focus.d.f18832b.f() : androidx.compose.ui.focus.d.f18832b.e());
        } else if (C6253a.t(a10, aVar.e())) {
            return androidx.compose.ui.focus.d.i(androidx.compose.ui.focus.d.f18832b.g());
        } else {
            if (C6253a.t(a10, aVar.d())) {
                return androidx.compose.ui.focus.d.i(androidx.compose.ui.focus.d.f18832b.d());
            }
            boolean z10 = true;
            if (C6253a.t(a10, aVar.f()) ? true : C6253a.t(a10, aVar.m())) {
                return androidx.compose.ui.focus.d.i(androidx.compose.ui.focus.d.f18832b.h());
            }
            if (C6253a.t(a10, aVar.c()) ? true : C6253a.t(a10, aVar.l())) {
                return androidx.compose.ui.focus.d.i(androidx.compose.ui.focus.d.f18832b.a());
            }
            if (C6253a.t(a10, aVar.b()) ? true : C6253a.t(a10, aVar.g()) ? true : C6253a.t(a10, aVar.k())) {
                return androidx.compose.ui.focus.d.i(androidx.compose.ui.focus.d.f18832b.b());
            }
            if (!C6253a.t(a10, aVar.a())) {
                z10 = C6253a.t(a10, aVar.i());
            }
            if (z10) {
                return androidx.compose.ui.focus.d.i(androidx.compose.ui.focus.d.f18832b.c());
            }
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        C5221y a10;
        C5221y a11;
        androidx.lifecycle.r lifecycle;
        C5470a aVar;
        super.onAttachedToWindow();
        this.f19072k.c(hasWindowFocus());
        v0(getRoot());
        u0(getRoot());
        getSnapshotObserver().k();
        if (d0() && (aVar = this.f19017D) != null) {
            C5476g.f24674a.a(aVar);
        }
        C5221y a12 = androidx.lifecycle.l0.a(this);
        P4.f a13 = P4.g.a(this);
        b viewTreeOwners = getViewTreeOwners();
        androidx.lifecycle.r rVar = null;
        if (viewTreeOwners == null || !(a12 == null || a13 == null || (a12 == viewTreeOwners.a() && a13 == viewTreeOwners.a()))) {
            if (a12 == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            } else if (a13 != null) {
                if (!(viewTreeOwners == null || (a11 = viewTreeOwners.a()) == null || (lifecycle = a11.getLifecycle()) == null)) {
                    lifecycle.g(this);
                }
                a12.getLifecycle().c(this);
                b bVar = new b(a12, a13);
                set_viewTreeOwners(bVar);
                C17642l<? super b, C16807N> lVar = this.f19016C0;
                if (lVar != null) {
                    lVar.invoke(bVar);
                }
                this.f19016C0 = null;
            } else {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
        }
        this.f19042P0.b(isInTouchMode() ? C6240a.f31827b.b() : C6240a.f31827b.a());
        b viewTreeOwners2 = getViewTreeOwners();
        if (!(viewTreeOwners2 == null || (a10 = viewTreeOwners2.a()) == null)) {
            rVar = a10.getLifecycle();
        }
        if (rVar != null) {
            rVar.c(this);
            rVar.c(this.f19080s);
            getViewTreeObserver().addOnGlobalLayoutListener(this.f19018D0);
            getViewTreeObserver().addOnScrollChangedListener(this.f19020E0);
            getViewTreeObserver().addOnTouchModeChangeListener(this.f19022F0);
            if (Build.VERSION.SDK_INT >= 31) {
                H.f19215a.b(this);
                return;
            }
            return;
        }
        D1.a.c("No lifecycle owner exists");
        throw new C16820k();
    }

    public boolean onCheckIsTextEditor() {
        M m10 = (M) i1.l.c(this.f19028I0);
        return m10 == null ? this.f19024G0.r() : m10.g();
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setDensity(C5266a.a(getContext()));
        if (o0(configuration) != this.f19036M0) {
            this.f19036M0 = o0(configuration);
            setFontFamilyResolver(C4824q.a(getContext()));
        }
        this.f19015C.invoke(configuration);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        M m10 = (M) i1.l.c(this.f19028I0);
        return m10 == null ? this.f19024G0.o(editorInfo) : m10.f(editorInfo);
    }

    public void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer<ViewTranslationRequest> consumer) {
        this.f19080s.s(jArr, iArr, consumer);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0010, code lost:
        r0 = r0.a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDetachedFromWindow() {
        /*
            r2 = this;
            super.onDetachedFromWindow()
            G1.o0 r0 = r2.getSnapshotObserver()
            r0.l()
            androidx.compose.ui.platform.AndroidComposeView$b r0 = r2.getViewTreeOwners()
            if (r0 == 0) goto L_0x001b
            androidx.lifecycle.y r0 = r0.a()
            if (r0 == 0) goto L_0x001b
            androidx.lifecycle.r r0 = r0.getLifecycle()
            goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            if (r0 == 0) goto L_0x005c
            k1.b r1 = r2.f19080s
            r0.g(r1)
            r0.g(r2)
            boolean r0 = r2.d0()
            if (r0 == 0) goto L_0x0035
            j1.a r0 = r2.f19017D
            if (r0 == 0) goto L_0x0035
            j1.g r1 = j1.C5476g.f24674a
            r1.b(r0)
        L_0x0035:
            android.view.ViewTreeObserver r0 = r2.getViewTreeObserver()
            android.view.ViewTreeObserver$OnGlobalLayoutListener r1 = r2.f19018D0
            r0.removeOnGlobalLayoutListener(r1)
            android.view.ViewTreeObserver r0 = r2.getViewTreeObserver()
            android.view.ViewTreeObserver$OnScrollChangedListener r1 = r2.f19020E0
            r0.removeOnScrollChangedListener(r1)
            android.view.ViewTreeObserver r0 = r2.getViewTreeObserver()
            android.view.ViewTreeObserver$OnTouchModeChangeListener r1 = r2.f19022F0
            r0.removeOnTouchModeChangeListener(r1)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L_0x005b
            androidx.compose.ui.platform.H r0 = androidx.compose.ui.platform.H.f19215a
            r0.a(r2)
        L_0x005b:
            return
        L_0x005c:
            java.lang.String r0 = "No lifecycle owner exists"
            D1.a.c(r0)
            XH.k r0 = new XH.k
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.onDetachedFromWindow():void");
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (!z10 && !hasFocus()) {
            getFocusOwner().p();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f19035M.r(this.f19057Z0);
        this.f19031K = null;
        V0();
        if (this.f19027I != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i12 - i10, i13 - i11);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                v0(getRoot());
            }
            long i02 = i0(i10);
            long i03 = i0(i11);
            long a10 = C5267b.f23024b.a((int) C16801H.b(i02 >>> 32), (int) C16801H.b(i02 & 4294967295L), (int) C16801H.b(i03 >>> 32), (int) C16801H.b(4294967295L & i03));
            C5267b bVar = this.f19031K;
            boolean z10 = false;
            if (bVar == null) {
                this.f19031K = C5267b.a(a10);
                this.f19033L = false;
            } else {
                if (bVar != null) {
                    z10 = C5267b.f(bVar.r(), a10);
                }
                if (!z10) {
                    this.f19033L = true;
                }
            }
            this.f19035M.I(a10);
            this.f19035M.t();
            setMeasuredDimension(getRoot().u0(), getRoot().R());
            if (this.f19027I != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().u0(), CatalogRepository.FETCH_FLAG_SDB), View.MeasureSpec.makeMeasureSpec(getRoot().R(), CatalogRepository.FETCH_FLAG_SDB));
            }
            C16807N n10 = C16807N.f139792a;
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i10) {
        C5470a aVar;
        if (d0() && viewStructure != null && (aVar = this.f19017D) != null) {
            C5472c.b(aVar, viewStructure);
        }
    }

    public void onResume(C5221y yVar) {
        setShowLayoutBounds(f19007e1.b());
    }

    public void onRtlPropertiesChanged(int i10) {
        if (this.f19060b) {
            c2.t e10 = androidx.compose.ui.focus.f.e(i10);
            if (e10 == null) {
                e10 = c2.t.Ltr;
            }
            setLayoutDirection(e10);
        }
    }

    public void onScrollCaptureSearch(Rect rect, Point point, Consumer<ScrollCaptureTarget> consumer) {
        K1.l lVar;
        if (Build.VERSION.SDK_INT >= 31 && (lVar = this.f19063c1) != null) {
            lVar.d(this, getSemanticsOwner(), getCoroutineContext(), consumer);
        }
    }

    public void onVirtualViewTranslationResponses(LongSparseArray<ViewTranslationResponse> longSparseArray) {
        C5492b bVar = this.f19080s;
        bVar.x(bVar, longSparseArray);
    }

    public void onWindowFocusChanged(boolean z10) {
        boolean a10;
        this.f19072k.c(z10);
        this.f19061b1 = true;
        super.onWindowFocusChanged(z10);
        if (z10 && getShowLayoutBounds() != (a10 = f19007e1.b())) {
            setShowLayoutBounds(a10);
            t0();
        }
    }

    public void p(G g10) {
        this.f19035M.E(g10);
        N0(this, (G) null, 1, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object q(nI.p<? super androidx.compose.ui.platform.L0, ? super dI.C17164e<?>, ? extends java.lang.Object> r5, dI.C17164e<?> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.compose.ui.platform.AndroidComposeView.x
            if (r0 == 0) goto L_0x0013
            r0 = r6
            androidx.compose.ui.platform.AndroidComposeView$x r0 = (androidx.compose.ui.platform.AndroidComposeView.x) r0
            int r1 = r0.f19115e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f19115e = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.ui.platform.AndroidComposeView$x r0 = new androidx.compose.ui.platform.AndroidComposeView$x
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f19113c
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f19115e
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 == r3) goto L_0x002d
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x002d:
            XH.y.b(r6)
            goto L_0x0044
        L_0x0031:
            XH.y.b(r6)
            java.util.concurrent.atomic.AtomicReference r6 = r4.f19028I0
            androidx.compose.ui.platform.AndroidComposeView$y r2 = new androidx.compose.ui.platform.AndroidComposeView$y
            r2.<init>(r4)
            r0.f19115e = r3
            java.lang.Object r5 = i1.l.d(r6, r2, r5, r0)
            if (r5 != r1) goto L_0x0044
            return r1
        L_0x0044:
            XH.k r5 = new XH.k
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.q(nI.p, dI.e):java.lang.Object");
    }

    public void r(m0.b bVar) {
        this.f19035M.x(bVar);
        N0(this, (G) null, 1, (Object) null);
    }

    public boolean requestFocus(int i10, Rect rect) {
        if (isFocused()) {
            return true;
        }
        if (getFocusOwner().l().b()) {
            return super.requestFocus(i10, rect);
        }
        androidx.compose.ui.focus.d d10 = androidx.compose.ui.focus.f.d(i10);
        int o10 = d10 != null ? d10.o() : androidx.compose.ui.focus.d.f18832b.b();
        Boolean k10 = getFocusOwner().k(o10, rect != null ? b1.e(rect) : null, new s(o10));
        if (k10 != null) {
            return k10.booleanValue();
        }
        return false;
    }

    public void setAccessibilityEventBatchIntervalMillis(long j10) {
        this.f19079r.S0(j10);
    }

    public final void setConfigurationChangeObserver(C17642l<? super Configuration, C16807N> lVar) {
        this.f19015C = lVar;
    }

    public final void setContentCaptureManager$ui_release(C5492b bVar) {
        this.f19080s = bVar;
    }

    public void setCoroutineContext(C17168i iVar) {
        this.f19070i = iVar;
        d.c k10 = getRoot().m0().k();
        if (k10 instanceof A1.W) {
            ((A1.W) k10).W0();
        }
        int a10 = C4502e0.a(16);
        if (!k10.E0().j2()) {
            D1.a.b("visitSubtree called on an unattached node");
        }
        d.c a22 = k10.E0().a2();
        G m10 = C4508k.m(k10);
        Z z10 = new Z();
        while (m10 != null) {
            if (a22 == null) {
                a22 = m10.m0().k();
            }
            if ((a22.Z1() & a10) != 0) {
                while (a22 != null) {
                    if ((a22.e2() & a10) != 0) {
                        d.c cVar = a22;
                        W0.b bVar = null;
                        while (cVar != null) {
                            if (cVar instanceof s0) {
                                s0 s0Var = (s0) cVar;
                                if (s0Var instanceof A1.W) {
                                    ((A1.W) s0Var).W0();
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
                    a22 = a22.a2();
                }
            }
            z10.c(m10.x0());
            m10 = z10.a() ? (G) z10.b() : null;
            a22 = null;
        }
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j10) {
        this.f19049T = j10;
    }

    public final void setOnViewTreeOwnersAvailable(C17642l<? super b, C16807N> lVar) {
        b viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            lVar.invoke(viewTreeOwners);
        }
        if (!isAttachedToWindow()) {
            this.f19016C0 = lVar;
        }
    }

    public void setShowLayoutBounds(boolean z10) {
        this.f19025H = z10;
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public void t(G g10, boolean z10, boolean z11) {
        if (z10) {
            if (this.f19035M.C(g10, z11)) {
                N0(this, (G) null, 1, (Object) null);
            }
        } else if (this.f19035M.F(g10, z11)) {
            N0(this, (G) null, 1, (Object) null);
        }
    }

    public void t0() {
        u0(getRoot());
    }

    public long u(long j10) {
        G0();
        return O0.f(this.f19047S, C5668h.a(C5667g.m(j10) - C5667g.m(this.f19087y0), C5667g.n(j10) - C5667g.n(this.f19087y0)));
    }

    public void v(float[] fArr) {
        G0();
        O0.n(fArr, this.f19045R);
        K.j(fArr, C5667g.m(this.f19087y0), C5667g.n(this.f19087y0), this.f19043Q);
    }

    public long w(long j10) {
        G0();
        return O0.f(this.f19047S, j10);
    }

    public void x(G g10) {
        this.f19035M.v(g10);
        L0();
    }

    public void y(G g10, boolean z10) {
        this.f19035M.i(g10, z10);
    }

    public long z(long j10) {
        G0();
        long f10 = O0.f(this.f19045R, j10);
        return C5668h.a(C5667g.m(f10) + C5667g.m(this.f19087y0), C5667g.n(f10) + C5667g.n(this.f19087y0));
    }

    public void addView(View view, int i10) {
        C17542s.g(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addView(view, i10, layoutParams);
    }

    public C5108i getAccessibilityManager() {
        return this.f19081t;
    }

    public C5111j getClipboardManager() {
        return this.f19021F;
    }

    public void addView(View view, int i10, int i11) {
        ViewGroup.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.width = i10;
        generateDefaultLayoutParams.height = i11;
        C16807N n10 = C16807N.f139792a;
        addView(view, -1, generateDefaultLayoutParams);
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addView(view, -1, layoutParams);
    }

    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i10, layoutParams, true);
    }
}
