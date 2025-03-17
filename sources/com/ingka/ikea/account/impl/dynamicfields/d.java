package com.ingka.ikea.account.impl.dynamicfields;

import Wd.A;
import Wd.B;
import Wd.C;
import Wd.C9347b;
import Wd.D;
import Wd.E;
import Wd.G;
import Wd.H;
import Wd.M;
import Wd.t;
import Wd.x;
import Wd.y;
import Wd.z;
import XH.C16796C;
import XH.C16807N;
import YH.C16877v;
import YH.X;
import am.h;
import androidx.lifecycle.F;
import androidx.lifecycle.K;
import androidx.lifecycle.e0;
import androidx.lifecycle.f0;
import androidx.lifecycle.i0;
import com.ingka.ikea.dynamicfields.datalayer.DynamicFields$Configuration;
import com.ingka.ikea.dynamicfields.datalayer.FieldAttributes;
import il.C11404d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kD.C14674a;
import kD.C14675b;
import kD.e;
import kD.g;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qg.C10192b;
import qg.C10193c;
import qg.C10195e;
import qg.i;
import qg.k;
import qg.l;
import qg.m;
import qg.o;
import qg.q;
import qg.u;
import qg.v;
import qg.w;
import sg.f;
import tI.C17978n;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010$\n\u0002\b\t\b\u0007\u0018\u0000 \u00012\u00020\u00012\u00020\u0002:\u0002\u0001B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u0017J\r\u0010\u001a\u001a\u00020\u0011¢\u0006\u0004\b\u001a\u0010\u0013J=\u0010 \u001a\u00020\u00112\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u0015\u001a\u00020\t2\u0010\u0010\u001f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\u001eH\u0002¢\u0006\u0004\b \u0010!J!\u0010\"\u001a\u00020\u00112\u0010\u0010\u001f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\u001eH\u0002¢\u0006\u0004\b\"\u0010#J!\u0010$\u001a\u00020\t2\u0010\u0010\u001f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\u001eH\u0002¢\u0006\u0004\b$\u0010%J\u0015\u0010(\u001a\u00020'*\u0004\u0018\u00010&H\u0002¢\u0006\u0004\b(\u0010)J/\u0010.\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010-0\r2\u0006\u0010+\u001a\u00020*2\f\u0010,\u001a\b\u0012\u0002\b\u0003\u0018\u00010\rH\u0002¢\u0006\u0004\b.\u0010/J\u001f\u00100\u001a\n\u0012\u0006\b\u0001\u0012\u00020-0\r2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0011H\u0002¢\u0006\u0004\b2\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b9\u00102R \u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0;0:8\u0002X\u0004¢\u0006\u0006\n\u0004\b<\u0010=R#\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0;0?8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\"\u0010F\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0;0:8\u0002X\u0004¢\u0006\u0006\n\u0004\bE\u0010=R%\u0010I\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0;0?8\u0006¢\u0006\f\n\u0004\bG\u0010A\u001a\u0004\bH\u0010CR\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020\t0:8\u0002X\u0004¢\u0006\u0006\n\u0004\bJ\u0010=R\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020\t0:8\u0002X\u0004¢\u0006\u0006\n\u0004\bL\u0010=R\u001d\u0010P\u001a\b\u0012\u0004\u0012\u00020\t0?8\u0006¢\u0006\f\n\u0004\bN\u0010A\u001a\u0004\bO\u0010CR\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020\t0:8\u0002X\u0004¢\u0006\u0006\n\u0004\bQ\u0010=R\u001d\u0010U\u001a\b\u0012\u0004\u0012\u00020\t0?8\u0006¢\u0006\f\n\u0004\bS\u0010A\u001a\u0004\bT\u0010CR\u001a\u0010W\u001a\b\u0012\u0004\u0012\u00020\t0:8\u0002X\u0004¢\u0006\u0006\n\u0004\bV\u0010=R\u001d\u0010Z\u001a\b\u0012\u0004\u0012\u00020\t0?8\u0006¢\u0006\f\n\u0004\bX\u0010A\u001a\u0004\bY\u0010CR \u0010]\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020[0\u001e0:8\u0002X\u0004¢\u0006\u0006\n\u0004\b\\\u0010=R#\u0010`\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020[0\u001e0?8\u0006¢\u0006\f\n\u0004\b^\u0010A\u001a\u0004\b_\u0010CR\u001a\u0010b\u001a\b\u0012\u0004\u0012\u00020\t0:8\u0002X\u0004¢\u0006\u0006\n\u0004\ba\u0010=R\u001d\u0010e\u001a\b\u0012\u0004\u0012\u00020\t0?8\u0006¢\u0006\f\n\u0004\bc\u0010A\u001a\u0004\bd\u0010CR\"\u0010g\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0;0:8\u0002X\u0004¢\u0006\u0006\n\u0004\bf\u0010=R%\u0010j\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0;0?8\u0006¢\u0006\f\n\u0004\bh\u0010A\u001a\u0004\bi\u0010CR\"\u0010m\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010k0;0:8\u0002X\u0004¢\u0006\u0006\n\u0004\bl\u0010=R%\u0010p\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010k0;0?8\u0006¢\u0006\f\n\u0004\bn\u0010A\u001a\u0004\bo\u0010CR\"\u0010r\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0;0:8\u0002X\u0004¢\u0006\u0006\n\u0004\bq\u0010=R%\u0010u\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0;0?8\u0006¢\u0006\f\n\u0004\bs\u0010A\u001a\u0004\bt\u0010CR \u0010x\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020*0\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\bv\u0010wR(\u0010~\u001a\u0004\u0018\u00010'2\b\u0010y\u001a\u0004\u0018\u00010'8\u0006@BX\u000e¢\u0006\f\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}R&\u0010\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c\u0018\u000108\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0001\u0010wR\u001c\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020'0?8\u0002X\u0004¢\u0006\u0007\n\u0005\b\u0001\u0010AR\u001f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020'0?8\u0006¢\u0006\r\n\u0004\b0\u0010A\u001a\u0005\b\u0001\u0010C¨\u0006\u0001"}, d2 = {"Lcom/ingka/ikea/account/impl/dynamicfields/d;", "Lsg/f;", "Landroidx/lifecycle/f0;", "LIl/a;", "appConfigApi", "LWd/M;", "repository", "LWd/b;", "analytics", "", "validateFieldsOnCreation", "<init>", "(LIl/a;LWd/M;LWd/b;Z)V", "Lqg/i;", "field", "g", "(Lqg/i;)Z", "LXH/N;", "o0", "()V", "v0", "enableInteractionOnResult", "x0", "(Z)V", "loading", "z0", "r0", "", "", "data", "", "activeFields", "t0", "(Ljava/util/Map;ZLjava/util/List;)V", "a0", "(Ljava/util/List;)V", "s0", "(Ljava/util/List;)Z", "Lcom/ingka/ikea/dynamicfields/datalayer/DynamicFields$Configuration;", "LWd/t;", "q0", "(Lcom/ingka/ikea/dynamicfields/datalayer/DynamicFields$Configuration;)LWd/t;", "Lcom/ingka/ikea/dynamicfields/datalayer/FieldAttributes;", "attrs", "cachedField", "", "d0", "(Lcom/ingka/ikea/dynamicfields/datalayer/FieldAttributes;Lqg/i;)Lqg/i;", "P", "(Lcom/ingka/ikea/dynamicfields/datalayer/FieldAttributes;)Lqg/i;", "Z", "m", "LIl/a;", "n", "LWd/M;", "o", "LWd/b;", "p", "Landroidx/lifecycle/K;", "Lip/d;", "q", "Landroidx/lifecycle/K;", "_wasSubmitSuccessful", "Landroidx/lifecycle/F;", "r", "Landroidx/lifecycle/F;", "j0", "()Landroidx/lifecycle/F;", "wasSubmitSuccessful", "s", "_isEmailVerificationNeeded", "t", "k0", "isEmailVerificationNeeded", "u", "refreshSections", "v", "_isLoading", "w", "n0", "isLoading", "x", "_submitButtonEnabled", "y", "f0", "submitButtonEnabled", "z", "_isFetchingConfiguration", "A", "l0", "isFetchingConfiguration", "Lil/d;", "B", "_validation", "C", "i0", "validation", "D", "_isInteractionEnabled", "E", "m0", "isInteractionEnabled", "F", "_submitError", "G", "g0", "submitError", "", "H", "_submitLoginError", "I", "h0", "submitLoginError", "J", "_configurationError", "K", "c0", "configurationError", "L", "Ljava/util/Map;", "attributesCache", "value", "M", "LWd/t;", "b0", "()LWd/t;", "cache", "", "N", "additionalValuesCache", "O", "_sections", "e0", "sections", "Q", "a", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d extends f0 implements f {

    /* renamed from: Q  reason: collision with root package name */
    public static final a f69514Q = new a((DefaultConstructorMarker) null);

    /* renamed from: R  reason: collision with root package name */
    public static final int f69515R = 8;
    /* access modifiers changed from: private */

    /* renamed from: S  reason: collision with root package name */
    public static final t f69516S = new t(C16877v.n(), C16877v.n());

    /* renamed from: A  reason: collision with root package name */
    private final F<Boolean> f69517A;

    /* renamed from: B  reason: collision with root package name */
    private final K<List<C11404d>> f69518B;

    /* renamed from: C  reason: collision with root package name */
    private final F<List<C11404d>> f69519C;

    /* renamed from: D  reason: collision with root package name */
    private final K<Boolean> f69520D;

    /* renamed from: E  reason: collision with root package name */
    private final F<Boolean> f69521E;

    /* renamed from: F  reason: collision with root package name */
    private final K<ip.d<String>> f69522F;

    /* renamed from: G  reason: collision with root package name */
    private final F<ip.d<String>> f69523G;

    /* renamed from: H  reason: collision with root package name */
    private final K<ip.d<Integer>> f69524H;

    /* renamed from: I  reason: collision with root package name */
    private final F<ip.d<Integer>> f69525I;

    /* renamed from: J  reason: collision with root package name */
    private final K<ip.d<String>> f69526J;

    /* renamed from: K  reason: collision with root package name */
    private final F<ip.d<String>> f69527K;

    /* renamed from: L  reason: collision with root package name */
    private final Map<String, FieldAttributes> f69528L = new LinkedHashMap();

    /* renamed from: M  reason: collision with root package name */
    private t f69529M;

    /* renamed from: N  reason: collision with root package name */
    private Map<String, String> f69530N;

    /* renamed from: O  reason: collision with root package name */
    private final F<t> f69531O;

    /* renamed from: P  reason: collision with root package name */
    private final F<t> f69532P;

    /* renamed from: m  reason: collision with root package name */
    private final Il.a f69533m;

    /* renamed from: n  reason: collision with root package name */
    private final M f69534n;

    /* renamed from: o  reason: collision with root package name */
    private final C9347b f69535o;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f69536p;

    /* renamed from: q  reason: collision with root package name */
    private final K<ip.d<Boolean>> f69537q;

    /* renamed from: r  reason: collision with root package name */
    private final F<ip.d<Boolean>> f69538r;

    /* renamed from: s  reason: collision with root package name */
    private final K<ip.d<String>> f69539s;

    /* renamed from: t  reason: collision with root package name */
    private final F<ip.d<String>> f69540t;

    /* renamed from: u  reason: collision with root package name */
    private final K<Boolean> f69541u;

    /* renamed from: v  reason: collision with root package name */
    private final K<Boolean> f69542v;

    /* renamed from: w  reason: collision with root package name */
    private final F<Boolean> f69543w;

    /* renamed from: x  reason: collision with root package name */
    private final K<Boolean> f69544x;

    /* renamed from: y  reason: collision with root package name */
    private final F<Boolean> f69545y;

    /* renamed from: z  reason: collision with root package name */
    private final K<Boolean> f69546z;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/ingka/ikea/account/impl/dynamicfields/d$a;", "", "<init>", "()V", "LIl/a;", "appConfigApi", "LWd/M;", "repository", "LWd/b;", "analytics", "", "validateFieldsOnCreation", "Landroidx/lifecycle/i0$d;", "a", "(LIl/a;LWd/M;LWd/b;Z)Landroidx/lifecycle/i0$d;", "LWd/t;", "EMPTY_FIELDS", "LWd/t;", "c", "()LWd/t;", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"com/ingka/ikea/account/impl/dynamicfields/d$a$a", "Landroidx/lifecycle/i0$d;", "Landroidx/lifecycle/f0;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/f0;", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.ingka.ikea.account.impl.dynamicfields.d$a$a  reason: collision with other inner class name */
        public static final class C1196a extends i0.d {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ Il.a f69547e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ M f69548f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ C9347b f69549g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ boolean f69550h;

            C1196a(Il.a aVar, M m10, C9347b bVar, boolean z10) {
                this.f69547e = aVar;
                this.f69548f = m10;
                this.f69549g = bVar;
                this.f69550h = z10;
            }

            public <T extends f0> T create(Class<T> cls) {
                C17542s.j(cls, "modelClass");
                return new d(this.f69547e, this.f69548f, this.f69549g, this.f69550h);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ i0.d b(a aVar, Il.a aVar2, M m10, C9347b bVar, boolean z10, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                bVar = null;
            }
            if ((i10 & 8) != 0) {
                z10 = false;
            }
            return aVar.a(aVar2, m10, bVar, z10);
        }

        public final i0.d a(Il.a aVar, M m10, C9347b bVar, boolean z10) {
            C17542s.j(aVar, "appConfigApi");
            C17542s.j(m10, "repository");
            return new C1196a(aVar, m10, bVar, z10);
        }

        public final t c() {
            return d.f69516S;
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f69551a;

        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|(2:25|26)|27|29) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|29) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0050 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0064 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                com.ingka.ikea.dynamicfields.datalayer.c[] r0 = com.ingka.ikea.dynamicfields.datalayer.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ingka.ikea.dynamicfields.datalayer.c r1 = com.ingka.ikea.dynamicfields.datalayer.c.TEXT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.ingka.ikea.dynamicfields.datalayer.c r1 = com.ingka.ikea.dynamicfields.datalayer.c.PASSWORD     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.ingka.ikea.dynamicfields.datalayer.c r1 = com.ingka.ikea.dynamicfields.datalayer.c.CHECKBOX     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.ingka.ikea.dynamicfields.datalayer.c r1 = com.ingka.ikea.dynamicfields.datalayer.c.PICKER     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                com.ingka.ikea.dynamicfields.datalayer.c r1 = com.ingka.ikea.dynamicfields.datalayer.c.DATE_PICKER     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                com.ingka.ikea.dynamicfields.datalayer.c r1 = com.ingka.ikea.dynamicfields.datalayer.c.STORE_PICKER     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                com.ingka.ikea.dynamicfields.datalayer.c r1 = com.ingka.ikea.dynamicfields.datalayer.c.ADDRESS_PICKER     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                com.ingka.ikea.dynamicfields.datalayer.c r1 = com.ingka.ikea.dynamicfields.datalayer.c.HIDDEN     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                com.ingka.ikea.dynamicfields.datalayer.c r1 = com.ingka.ikea.dynamicfields.datalayer.c.LABEL     // Catch:{ NoSuchFieldError -> 0x005a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                com.ingka.ikea.dynamicfields.datalayer.c r1 = com.ingka.ikea.dynamicfields.datalayer.c.TEXT_BOX     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                com.ingka.ikea.dynamicfields.datalayer.c r1 = com.ingka.ikea.dynamicfields.datalayer.c.BODY_2     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                com.ingka.ikea.dynamicfields.datalayer.c r1 = com.ingka.ikea.dynamicfields.datalayer.c.DISCLAIMER     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                com.ingka.ikea.dynamicfields.datalayer.c r1 = com.ingka.ikea.dynamicfields.datalayer.c.TOGGLE     // Catch:{ NoSuchFieldError -> 0x0082 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0082 }
            L_0x0082:
                f69551a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.account.impl.dynamicfields.d.b.<clinit>():void");
        }
    }

    public d(Il.a aVar, M m10, C9347b bVar, boolean z10) {
        C17542s.j(aVar, "appConfigApi");
        C17542s.j(m10, "repository");
        this.f69533m = aVar;
        this.f69534n = m10;
        this.f69535o = bVar;
        this.f69536p = z10;
        K<ip.d<Boolean>> k10 = new K<>();
        this.f69537q = k10;
        this.f69538r = k10;
        K<ip.d<String>> k11 = new K<>();
        this.f69539s = k11;
        this.f69540t = k11;
        K<Boolean> k12 = new K<>();
        Boolean bool = Boolean.FALSE;
        k12.setValue(bool);
        this.f69541u = k12;
        K<Boolean> k13 = new K<>();
        k13.setValue(bool);
        this.f69542v = k13;
        this.f69543w = k13;
        K<Boolean> k14 = new K<>();
        k14.setValue(bool);
        this.f69544x = k14;
        this.f69545y = k14;
        K<Boolean> k15 = new K<>();
        k15.setValue(bool);
        this.f69546z = k15;
        this.f69517A = k15;
        K<List<C11404d>> k16 = new K<>();
        this.f69518B = k16;
        this.f69519C = k16;
        K<Boolean> k17 = new K<>();
        k17.setValue(Boolean.TRUE);
        this.f69520D = k17;
        this.f69521E = k17;
        K<ip.d<String>> k18 = new K<>();
        this.f69522F = k18;
        this.f69523G = k18;
        K<ip.d<Integer>> k19 = new K<>();
        this.f69524H = k19;
        this.f69525I = k19;
        K<ip.d<String>> k20 = new K<>();
        this.f69526J = k20;
        this.f69527K = k20;
        F<t> c10 = e0.c(k12, new y(this));
        this.f69531O = c10;
        this.f69532P = c10;
        o0();
    }

    /* access modifiers changed from: private */
    public static final F M(d dVar, Boolean bool) {
        return e0.b(dVar.f69534n.a(), new z(dVar));
    }

    /* access modifiers changed from: private */
    public static final t N(d dVar, DynamicFields$Configuration dynamicFields$Configuration) {
        return dVar.q0(dynamicFields$Configuration);
    }

    private final i<? extends Object> P(FieldAttributes fieldAttributes) {
        switch (b.f69551a[fieldAttributes.m().ordinal()]) {
            case 1:
                return l.f76136r.a(fieldAttributes, new B(this));
            case 2:
                return q.f76166s.a(fieldAttributes, new C(this));
            case 3:
                return v.f76206v.a(fieldAttributes, new D(this));
            case 4:
                return k.f76125s.a(fieldAttributes, new E(this));
            case 5:
                return C10195e.a.b(C10195e.f76095u, fieldAttributes, (h) null, new Wd.F(this), 2, (Object) null);
            case 6:
                return u.f76195s.a(fieldAttributes, new G(this));
            case 7:
                C10192b.c cVar = C10192b.f76065w;
                String country = this.f69533m.A().getCountry();
                C17542s.i(country, "getCountry(...)");
                return cVar.a(country, fieldAttributes, new H(this));
            case 8:
                return m.f76146p.a(fieldAttributes);
            case 9:
                return qg.t.f76183t.a(fieldAttributes);
            case 10:
                return w.f76220t.a(fieldAttributes, new Wd.v(this));
            case 11:
                return C10193c.f76085r.a(fieldAttributes);
            case 12:
                return o.f76155s.a(fieldAttributes);
            case 13:
                return v.f76206v.a(fieldAttributes, new Wd.w(this));
            default:
                throw new XH.t();
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N Q(d dVar, String str) {
        C17542s.j(str, "it");
        dVar.Z();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N R(d dVar, String str) {
        C17542s.j(str, "it");
        dVar.Z();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N S(d dVar, boolean z10) {
        dVar.Z();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N T(d dVar, String str) {
        C17542s.j(str, "it");
        dVar.Z();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N U(d dVar, String str) {
        C17542s.j(str, "it");
        dVar.Z();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N V(d dVar, String str) {
        C17542s.j(str, "it");
        dVar.Z();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N W(d dVar, String str) {
        C17542s.j(str, "it");
        dVar.Z();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N X(d dVar, String str) {
        C17542s.j(str, "it");
        dVar.Z();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N Y(d dVar, boolean z10) {
        dVar.Z();
        return C16807N.f139792a;
    }

    private final void Z() {
        boolean z10;
        t tVar = this.f69529M;
        if (tVar != null) {
            Iterable a10 = tVar.a();
            ArrayList arrayList = new ArrayList(C16877v.y(a10, 10));
            Iterator it = a10.iterator();
            while (true) {
                z10 = false;
                if (!it.hasNext()) {
                    break;
                }
                arrayList.add(Boolean.valueOf(i.u((i) it.next(), true ^ this.f69536p, false, 2, (Object) null)));
            }
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!((Boolean) it2.next()).booleanValue()) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z10 = true;
            if (!C17542s.e(Boolean.valueOf(z10), this.f69544x.getValue())) {
                this.f69544x.setValue(Boolean.valueOf(z10));
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a0(java.util.List<? extends qg.i<?>> r5) {
        /*
            r4 = this;
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x000b:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x001d
            java.lang.Object r1 = r5.next()
            boolean r2 = r1 instanceof qg.l
            if (r2 == 0) goto L_0x000b
            r0.add(r1)
            goto L_0x000b
        L_0x001d:
            java.util.Iterator r5 = r0.iterator()
        L_0x0021:
            boolean r0 = r5.hasNext()
            r1 = 0
            if (r0 == 0) goto L_0x0038
            java.lang.Object r0 = r5.next()
            r2 = r0
            qg.l r2 = (qg.l) r2
            com.ingka.ikea.dynamicfields.datalayer.b r2 = r2.w()
            com.ingka.ikea.dynamicfields.datalayer.b r3 = com.ingka.ikea.dynamicfields.datalayer.b.EMAIL
            if (r2 != r3) goto L_0x0021
            goto L_0x0039
        L_0x0038:
            r0 = r1
        L_0x0039:
            qg.l r0 = (qg.l) r0
            if (r0 == 0) goto L_0x0044
            java.lang.Object r5 = r0.j()
            r1 = r5
            java.lang.String r1 = (java.lang.String) r1
        L_0x0044:
            if (r1 == 0) goto L_0x005f
            boolean r5 = HJ.C15854t.v0(r1)
            if (r5 == 0) goto L_0x004d
            goto L_0x005f
        L_0x004d:
            androidx.lifecycle.K<java.lang.Boolean> r5 = r4.f69542v
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r5.setValue(r0)
            androidx.lifecycle.K<ip.d<java.lang.String>> r5 = r4.f69539s
            ip.d r0 = new ip.d
            r0.<init>(r1)
            r5.setValue(r0)
            goto L_0x006f
        L_0x005f:
            androidx.lifecycle.K<ip.d<java.lang.Integer>> r5 = r4.f69524H
            ip.d r0 = new ip.d
            int r1 = Oo.b.f84380G2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.<init>(r1)
            r5.setValue(r0)
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.account.impl.dynamicfields.d.a0(java.util.List):void");
    }

    private final i<? extends Object> d0(FieldAttributes fieldAttributes, i<?> iVar) {
        return (iVar == null || !C17542s.e(this.f69528L.get(iVar.e()), fieldAttributes)) ? P(fieldAttributes) : iVar;
    }

    /* access modifiers changed from: private */
    public static final C16807N p0(d dVar, kD.l lVar) {
        C17542s.j(lVar, "state");
        boolean z10 = lVar instanceof e;
        dVar.f69546z.setValue(Boolean.valueOf(z10));
        if (!(lVar instanceof kD.m) && !(lVar instanceof C14674a) && !z10) {
            if (lVar instanceof g) {
                dVar.f69526J.setValue(new ip.d(((g) lVar).a()));
            } else if (lVar instanceof C14675b) {
                dVar.f69526J.setValue(new ip.d(null));
            } else {
                throw new XH.t();
            }
        }
        return C16807N.f139792a;
    }

    private final t q0(DynamicFields$Configuration dynamicFields$Configuration) {
        List<i<?>> list;
        List<i<?>> list2;
        if (dynamicFields$Configuration == null || dynamicFields$Configuration.c().isEmpty()) {
            return f69516S;
        }
        t tVar = this.f69529M;
        if (tVar == null || (list = tVar.c()) == null) {
            list = C16877v.n();
        }
        t tVar2 = this.f69529M;
        if (tVar2 == null || (list2 = tVar2.b()) == null) {
            list2 = C16877v.n();
        }
        Iterable A10 = C16877v.A(C16877v.q(list, list2));
        LinkedHashMap linkedHashMap = new LinkedHashMap(C17978n.e(X.e(C16877v.y(A10, 10)), 16));
        for (Object next : A10) {
            linkedHashMap.put(((i) next).e(), next);
        }
        Iterable<FieldAttributes> c10 = dynamicFields$Configuration.c();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C17978n.e(X.e(C16877v.y(c10, 10)), 16));
        for (FieldAttributes fieldAttributes : c10) {
            XH.v<A, B> a10 = C16796C.a(fieldAttributes, d0(fieldAttributes, (i) linkedHashMap.get(fieldAttributes.h())));
            linkedHashMap2.put(a10.c(), a10.d());
        }
        this.f69528L.clear();
        Map<String, FieldAttributes> map = this.f69528L;
        Iterable<FieldAttributes> c11 = dynamicFields$Configuration.c();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(C17978n.e(X.e(C16877v.y(c11, 10)), 16));
        for (FieldAttributes fieldAttributes2 : c11) {
            XH.v a11 = C16796C.a(fieldAttributes2.h(), fieldAttributes2);
            linkedHashMap3.put(a11.c(), a11.d());
        }
        map.putAll(linkedHashMap3);
        this.f69530N = dynamicFields$Configuration.b();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            if (((FieldAttributes) entry.getKey()).b() != com.ingka.ikea.dynamicfields.datalayer.a.FAMILY) {
                linkedHashMap4.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap4.size());
        for (Map.Entry value : linkedHashMap4.entrySet()) {
            arrayList.add((i) value.getValue());
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            if (((FieldAttributes) entry2.getKey()).b() == com.ingka.ikea.dynamicfields.datalayer.a.FAMILY) {
                linkedHashMap5.put(entry2.getKey(), entry2.getValue());
            }
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap5.size());
        for (Map.Entry value2 : linkedHashMap5.entrySet()) {
            arrayList2.add((i) value2.getValue());
        }
        t tVar3 = new t(arrayList, arrayList2);
        this.f69529M = tVar3;
        Z();
        return tVar3;
    }

    private final boolean s0(List<? extends i<?>> list) {
        boolean z10;
        Iterable<i> iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (i c10 : iterable) {
            arrayList.add(Boolean.valueOf(c10.c()));
        }
        boolean z11 = true;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((Boolean) it.next()).booleanValue()) {
                        z10 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z10 = false;
        ArrayList arrayList2 = new ArrayList(C16877v.y(iterable, 10));
        for (i u10 : iterable) {
            arrayList2.add(Boolean.valueOf(i.u(u10, false, false, 3, (Object) null)));
        }
        if (!arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (!((Boolean) it2.next()).booleanValue()) {
                        z11 = false;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        K<List<C11404d>> k10 = this.f69518B;
        ArrayList arrayList3 = new ArrayList();
        if (z10) {
            arrayList3.add(C11404d.VALUE_CHANGED);
        }
        if (!z11) {
            arrayList3.add(C11404d.VALIDATION_FAILED);
        }
        k10.setValue(arrayList3);
        return z11;
    }

    private final void t0(Map<String, String> map, boolean z10, List<? extends i<?>> list) {
        this.f69534n.c(map, new x(this, z10, list));
    }

    /* access modifiers changed from: private */
    public static final C16807N u0(d dVar, boolean z10, List list, kD.l lVar) {
        C17542s.j(lVar, "state");
        if (lVar instanceof e) {
            dVar.f69542v.setValue(Boolean.TRUE);
        } else if (lVar instanceof kD.m) {
            C9347b bVar = dVar.f69535o;
            if (bVar != null) {
                bVar.b();
            }
            dVar.f69542v.setValue(Boolean.FALSE);
            dVar.f69537q.setValue(new ip.d(Boolean.TRUE));
            if (z10) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((i) it.next()).q(true);
                }
                dVar.f69520D.setValue(Boolean.TRUE);
            }
        } else if (lVar instanceof C14674a) {
            dVar.a0(list);
        } else if (lVar instanceof kD.d) {
            C9347b bVar2 = dVar.f69535o;
            if (bVar2 != null) {
                bVar2.c(((kD.d) lVar).b());
            }
            dVar.f69522F.setValue(new ip.d(((kD.d) lVar).a()));
            dVar.f69542v.setValue(Boolean.FALSE);
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((i) it2.next()).q(true);
            }
            K<Boolean> k10 = dVar.f69520D;
            Boolean bool = Boolean.TRUE;
            k10.setValue(bool);
            dVar.f69544x.setValue(bool);
            dVar.f69537q.setValue(new ip.d(Boolean.FALSE));
        } else if (lVar instanceof C14675b) {
            dVar.f69522F.setValue(new ip.d(null));
            dVar.f69542v.setValue(Boolean.FALSE);
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                ((i) it3.next()).q(true);
            }
            K<Boolean> k11 = dVar.f69520D;
            Boolean bool2 = Boolean.TRUE;
            k11.setValue(bool2);
            dVar.f69544x.setValue(bool2);
            dVar.f69537q.setValue(new ip.d(Boolean.FALSE));
        } else {
            throw new XH.t();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N w0(d dVar, List list, kD.l lVar) {
        C17542s.j(lVar, "state");
        if (lVar instanceof e) {
            dVar.f69542v.setValue(Boolean.TRUE);
        } else if (lVar instanceof kD.m) {
            C9347b bVar = dVar.f69535o;
            if (bVar != null) {
                bVar.d();
            }
            dVar.f69542v.setValue(Boolean.FALSE);
            dVar.f69537q.setValue(new ip.d(Boolean.TRUE));
        } else if (lVar instanceof kD.d) {
            C9347b bVar2 = dVar.f69535o;
            if (bVar2 != null) {
                bVar2.a(((kD.d) lVar).b());
            }
            dVar.f69522F.setValue(new ip.d(((kD.d) lVar).a()));
            dVar.f69542v.setValue(Boolean.FALSE);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((i) it.next()).q(true);
            }
            K<Boolean> k10 = dVar.f69520D;
            Boolean bool = Boolean.TRUE;
            k10.setValue(bool);
            dVar.f69544x.setValue(bool);
            dVar.f69537q.setValue(new ip.d(Boolean.FALSE));
        } else if (lVar instanceof C14675b) {
            dVar.f69522F.setValue(new ip.d(null));
            dVar.f69542v.setValue(Boolean.FALSE);
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((i) it2.next()).q(true);
            }
            K<Boolean> k11 = dVar.f69520D;
            Boolean bool2 = Boolean.TRUE;
            k11.setValue(bool2);
            dVar.f69544x.setValue(bool2);
            dVar.f69537q.setValue(new ip.d(Boolean.FALSE));
        }
        return C16807N.f139792a;
    }

    public static /* synthetic */ void y0(d dVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        dVar.x0(z10);
    }

    public final t b0() {
        return this.f69529M;
    }

    public final F<ip.d<String>> c0() {
        return this.f69527K;
    }

    public final F<t> e0() {
        return this.f69532P;
    }

    public final F<Boolean> f0() {
        return this.f69545y;
    }

    public boolean g(i<?> iVar) {
        if (iVar != null) {
            return i.u(iVar, false, false, 3, (Object) null);
        }
        return true;
    }

    public final F<ip.d<String>> g0() {
        return this.f69523G;
    }

    public final F<ip.d<Integer>> h0() {
        return this.f69525I;
    }

    public final F<List<C11404d>> i0() {
        return this.f69519C;
    }

    public final F<ip.d<Boolean>> j0() {
        return this.f69538r;
    }

    public final F<ip.d<String>> k0() {
        return this.f69540t;
    }

    public final F<Boolean> l0() {
        return this.f69517A;
    }

    public final F<Boolean> m0() {
        return this.f69521E;
    }

    public final F<Boolean> n0() {
        return this.f69543w;
    }

    public final void o0() {
        this.f69534n.b(new Wd.u(this));
    }

    public final void r0() {
        Boolean value = this.f69541u.getValue();
        if (value != null) {
            this.f69541u.postValue(value);
        }
    }

    public final void v0() {
        t tVar = this.f69529M;
        if (tVar != null) {
            List<i<?>> a10 = tVar.a();
            if (!a10.isEmpty()) {
                for (i q10 : a10) {
                    q10.q(false);
                }
                K<Boolean> k10 = this.f69520D;
                Boolean bool = Boolean.FALSE;
                k10.setValue(bool);
                this.f69544x.setValue(bool);
                this.f69534n.d(new A(this, a10));
            }
        }
    }

    public final void x0(boolean z10) {
        t tVar = this.f69529M;
        if (tVar != null) {
            List<i<?>> a10 = tVar.a();
            if (!a10.isEmpty()) {
                if (!s0(a10)) {
                    this.f69537q.setValue(new ip.d(Boolean.FALSE));
                    return;
                }
                Iterable<i> iterable = a10;
                for (i q10 : iterable) {
                    q10.q(false);
                }
                K<Boolean> k10 = this.f69520D;
                Boolean bool = Boolean.FALSE;
                k10.setValue(bool);
                this.f69544x.setValue(bool);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(C17978n.e(X.e(C16877v.y(iterable, 10)), 16));
                for (i iVar : iterable) {
                    XH.v a11 = C16796C.a(iVar.g(), String.valueOf(iVar.j()));
                    linkedHashMap2.put(a11.c(), a11.d());
                }
                linkedHashMap.putAll(X.z(linkedHashMap2));
                Map<String, String> map = this.f69530N;
                if (map == null) {
                    map = X.j();
                }
                linkedHashMap.putAll(map);
                t0(linkedHashMap, z10, a10);
            }
        }
    }

    public final void z0(boolean z10) {
        this.f69542v.postValue(Boolean.valueOf(z10));
    }
}
