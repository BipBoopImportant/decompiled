package PB;

import EB.C12829a;
import FB.C12862c;
import HJ.C15850p;
import HJ.C15854t;
import IC.C13023e;
import IC.C13026h;
import KJ.C15985a;
import KJ.C15987c;
import KJ.C15990f;
import NB.C13268a;
import PB.C13332a;
import PB.C13333b;
import PB.C13334c;
import PB.h;
import QJ.C16297b0;
import QJ.F0;
import QJ.N;
import QJ.Q;
import QJ.T;
import RB.C13504a;
import RB.C13507d;
import RB.C13510g;
import RB.C13512i;
import SJ.C16428d;
import TJ.C16504A;
import TJ.C16505B;
import TJ.C16511H;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import Ww.w;
import XH.C16796C;
import XH.C16807N;
import XH.t;
import XH.v;
import XH.x;
import XH.y;
import YH.C16877v;
import android.location.LocationManager;
import androidx.lifecycle.U;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.ingka.ikea.store.datalayer.StorageType;
import com.sugarcube.core.logger.DslKt;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import ft.C11285c;
import iC.C14551a;
import java.io.Serializable;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17525a;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;

@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00012\u00020\u00012\u00020\u0002:\u0002\u0001BY\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010$\u001a\u0004\u0018\u00010#2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 H\u0001¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u001bH\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+J\u001f\u0010.\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020(2\u0006\u0010-\u001a\u00020(H\u0002¢\u0006\u0004\b.\u0010/J$\u00103\u001a\u00020\u001b2\u0012\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0100H@¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u001bH\u0002¢\u0006\u0004\b5\u0010'J\u000f\u00106\u001a\u00020\u001bH\u0002¢\u0006\u0004\b6\u0010'J\u0017\u00108\u001a\u00020\u001b2\u0006\u00107\u001a\u00020\u001eH\u0002¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020:H\u0002¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u001bH\u0002¢\u0006\u0004\b=\u0010'J\u0019\u0010?\u001a\u00020\u001b2\b\u0010>\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b?\u0010@J\u0019\u0010A\u001a\u00020\u001b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\bA\u00109J\u001e\u0010C\u001a\u00020\u001b2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020!01H@¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\u001bH\u0002¢\u0006\u0004\bE\u0010'J\u000f\u0010F\u001a\u00020\u001bH\u0002¢\u0006\u0004\bF\u0010'J\u0017\u0010H\u001a\u00020\u001b2\u0006\u0010G\u001a\u00020!H\u0002¢\u0006\u0004\bH\u0010@J\u000f\u0010I\u001a\u00020(H\u0002¢\u0006\u0004\bI\u0010JJ\u0017\u0010L\u001a\u00020\u001e2\u0006\u0010K\u001a\u00020\u001eH\u0002¢\u0006\u0004\bL\u0010MJ\u000f\u0010N\u001a\u00020(H\u0002¢\u0006\u0004\bN\u0010JR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010d\u001a\u00020a8\u0002X\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010f\u001a\u00020(8\u0002X\u0004¢\u0006\u0006\n\u0004\be\u0010?R\u0016\u0010i\u001a\u0004\u0018\u00010\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0014\u0010k\u001a\u00020\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\bj\u0010hR&\u0010p\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020(0m0l8\u0002X\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u001a\u0010r\u001a\b\u0012\u0004\u0012\u00020(0l8\u0002X\u0004¢\u0006\u0006\n\u0004\bq\u0010oR&\u0010y\u001a\b\u0012\u0004\u0012\u00020(0s8\u0000X\u0004¢\u0006\u0012\n\u0004\bt\u0010u\u0012\u0004\bx\u0010'\u001a\u0004\bv\u0010wR\u001a\u0010|\u001a\b\u0012\u0004\u0012\u00020z0l8\u0002X\u0004¢\u0006\u0006\n\u0004\b{\u0010oR \u0010\u001a\b\u0012\u0004\u0012\u00020z0s8\u0016X\u0004¢\u0006\f\n\u0004\b}\u0010u\u001a\u0004\b~\u0010wR\u001e\u0010\u0001\u001a\t\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001¨\u0006\u0001"}, d2 = {"LPB/j;", "Landroidx/lifecycle/f0;", "LPB/i;", "Landroidx/lifecycle/U;", "savedStateHandle", "LRB/a;", "getSelectedStoreIdUseCase", "LRB/d;", "getStoreDataUseCase", "LRB/i;", "saveStoreSelectionUseCase", "LRB/g;", "isScanAndGoActiveUseCase", "LNB/a;", "analytics", "LWw/w;", "verifyPermissionUseCase", "LFB/c;", "storeLocalDataSource", "Landroid/location/LocationManager;", "locationManager", "Lft/c;", "storePageRepository", "<init>", "(Landroidx/lifecycle/U;LRB/a;LRB/d;LRB/i;LRB/g;LNB/a;LWw/w;LFB/c;Landroid/location/LocationManager;Lft/c;)V", "LPB/a;", "action", "LXH/N;", "f0", "(LPB/a;)V", "", "queryString", "LKJ/c;", "LPB/g;", "stores", "LPB/e;", "k0", "(Ljava/lang/String;LKJ/c;)LPB/e;", "P", "()V", "", "requestedOnce", "g0", "(Z)V", "isGranted", "isLocationEnabled", "h0", "(ZZ)V", "LXH/x;", "", "storeItemsResult", "i0", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "U", "T", "storeId", "a0", "(Ljava/lang/String;)V", "LPB/a$e;", "V", "(LPB/a$e;)V", "S", "clickedStore", "Z", "(LPB/g;)V", "X", "storeItems", "b0", "(Ljava/util/List;LdI/e;)Ljava/lang/Object;", "c0", "Y", "storeItem", "W", "d0", "()Z", "string", "j0", "(Ljava/lang/String;)Ljava/lang/String;", "e0", "m", "LRB/a;", "n", "LRB/d;", "o", "LRB/i;", "p", "LRB/g;", "q", "LNB/a;", "r", "LWw/w;", "s", "LFB/c;", "t", "Landroid/location/LocationManager;", "u", "Lft/c;", "Lcom/ingka/ikea/store/datalayer/StorageType;", "v", "Lcom/ingka/ikea/store/datalayer/StorageType;", "storageType", "w", "onlyScanAndGoCompatible", "x", "Ljava/lang/String;", "itemNo", "y", "navArgRequestKey", "LTJ/B;", "LXH/v;", "z", "LTJ/B;", "permissionGrantedAndLocationEnabledFlow", "A", "inResumedStateFlow", "LTJ/P;", "B", "LTJ/P;", "R", "()LTJ/P;", "getIncludeUserLocation$storepicker_implementation_release$annotations", "includeUserLocation", "LPB/f;", "C", "_state", "D", "getState", "state", "LTJ/A;", "E", "LTJ/A;", "retryFlow", "F", "a", "storepicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j extends f0 implements i {

    /* renamed from: F  reason: collision with root package name */
    private static final a f113891F = new a((DefaultConstructorMarker) null);

    /* renamed from: G  reason: collision with root package name */
    public static final int f113892G = 8;

    /* renamed from: A  reason: collision with root package name */
    private final C16505B<Boolean> f113893A;

    /* renamed from: B  reason: collision with root package name */
    private final C16519P<Boolean> f113894B;
    /* access modifiers changed from: private */

    /* renamed from: C  reason: collision with root package name */
    public final C16505B<f> f113895C;

    /* renamed from: D  reason: collision with root package name */
    private final C16519P<f> f113896D;
    /* access modifiers changed from: private */

    /* renamed from: E  reason: collision with root package name */
    public final C16504A<C16807N> f113897E;

    /* renamed from: m  reason: collision with root package name */
    private final C13504a f113898m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final C13507d f113899n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final C13512i f113900o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final C13510g f113901p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public final C13268a f113902q;

    /* renamed from: r  reason: collision with root package name */
    private final w f113903r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public final C12862c f113904s;

    /* renamed from: t  reason: collision with root package name */
    private final LocationManager f113905t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public final C11285c f113906u;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public final StorageType f113907v;
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public final boolean f113908w;
    /* access modifiers changed from: private */

    /* renamed from: x  reason: collision with root package name */
    public final String f113909x;
    /* access modifiers changed from: private */

    /* renamed from: y  reason: collision with root package name */
    public final String f113910y;
    /* access modifiers changed from: private */

    /* renamed from: z  reason: collision with root package name */
    public final C16505B<v<Boolean, Boolean>> f113911z;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"LPB/j$a;", "", "<init>", "()V", "", "DELAY_BACK", "J", "DELAY_BOUNCING_BALL", "storepicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f113912a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                com.ingka.ikea.store.datalayer.StorageType[] r0 = com.ingka.ikea.store.datalayer.StorageType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ingka.ikea.store.datalayer.StorageType r1 = com.ingka.ikea.store.datalayer.StorageType.LOCAL     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.ingka.ikea.store.datalayer.StorageType r1 = com.ingka.ikea.store.datalayer.StorageType.PROFILE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.ingka.ikea.store.datalayer.StorageType r1 = com.ingka.ikea.store.datalayer.StorageType.NO_STORAGE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f113912a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: PB.j.b.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "LTJ/h;", "it", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.store.storepicker.impl.presentation.StorePickerViewModelImpl$collectStates$$inlined$flatMapLatest$1", f = "StorePickerViewModel.kt", l = {189}, m = "invokeSuspend")
    public static final class c extends kotlin.coroutines.jvm.internal.l implements nI.q<C16533h<? super Serializable>, C16807N, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f113913c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f113914d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f113915e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ j f113916f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C17164e eVar, j jVar) {
            super(3, eVar);
            this.f113916f = jVar;
        }

        /* renamed from: i */
        public final Object invoke(C16533h<? super Serializable> hVar, C16807N n10, C17164e<? super C16807N> eVar) {
            c cVar = new c(eVar, this.f113916f);
            cVar.f113914d = hVar;
            cVar.f113915e = n10;
            return cVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object value;
            Object f10 = C17187b.f();
            int i10 = this.f113913c;
            if (i10 == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f113914d;
                C16807N n10 = (C16807N) this.f113915e;
                C16505B K10 = this.f113916f.f113895C;
                do {
                    value = K10.getValue();
                } while (!K10.e(value, f.b((f) value, (C13023e) null, (h) null, (C13334c) null, false, false, false, false, false, false, false, C13333b.C2799b.f113833a, (d) null, (e) null, 7167, (Object) null)));
                C16532g P10 = C16534i.P(C16534i.R(this.f113916f.f113899n.a(this.f113916f.f113908w, this.f113916f.f113909x, this.f113916f.R()), new e(this.f113916f)), C16534i.R(this.f113916f.f113901p.c(), new f(this.f113916f, (C17164e<? super f>) null)), C16534i.s(C16534i.R(this.f113916f.f113911z, new g(this.f113916f, (C17164e<? super g>) null))), C16534i.R(this.f113916f.f113904s.b(), new h(this.f113916f)));
                this.f113913c = 1;
                if (C16534i.x(hVar, P10, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LTJ/h;", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.store.storepicker.impl.presentation.StorePickerViewModelImpl$collectStates$1", f = "StorePickerViewModel.kt", l = {199}, m = "invokeSuspend")
    static final class d extends kotlin.coroutines.jvm.internal.l implements nI.p<C16533h<? super C16807N>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f113917c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f113918d;

        d(C17164e<? super d> eVar) {
            super(2, eVar);
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            d dVar = new d(eVar);
            dVar.f113918d = obj;
            return dVar;
        }

        public final Object invoke(C16533h<? super C16807N> hVar, C17164e<? super C16807N> eVar) {
            return ((d) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f113917c;
            if (i10 == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f113918d;
                C16807N n10 = C16807N.f139792a;
                this.f113918d = hVar;
                this.f113917c = 1;
                if (hVar.emit(n10, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                C16533h hVar2 = (C16533h) this.f113918d;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class e extends C17540p implements nI.p<x<? extends List<? extends g>>, C17164e<? super C16807N>, Object> {
        e(Object obj) {
            super(2, obj, j.class, "onStoreData", "onStoreData(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return t(((x) obj).j(), (C17164e) obj2);
        }

        public final Object t(Object obj, C17164e<? super C16807N> eVar) {
            return ((j) this.receiver).i0(obj, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isActive", "LXH/N;", "<anonymous>", "(Z)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.store.storepicker.impl.presentation.StorePickerViewModelImpl$collectStates$2$3", f = "StorePickerViewModel.kt", l = {}, m = "invokeSuspend")
    static final class f extends kotlin.coroutines.jvm.internal.l implements nI.p<Boolean, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f113919c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ boolean f113920d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ j f113921e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(j jVar, C17164e<? super f> eVar) {
            super(2, eVar);
            this.f113921e = jVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            f fVar = new f(this.f113921e, eVar);
            fVar.f113920d = ((Boolean) obj).booleanValue();
            return fVar;
        }

        public final Object i(boolean z10, C17164e<? super C16807N> eVar) {
            return ((f) create(Boolean.valueOf(z10), eVar)).invokeSuspend(C16807N.f139792a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return i(((Boolean) obj).booleanValue(), (C17164e) obj2);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f113919c == 0) {
                y.b(obj);
                boolean z10 = this.f113920d;
                C16505B K10 = this.f113921e.f113895C;
                while (true) {
                    Object value = K10.getValue();
                    C16505B b10 = K10;
                    if (b10.e(value, f.b((f) value, (C13023e) null, (h) null, (C13334c) null, false, false, false, z10, false, false, false, (C13333b) null, (d) null, (e) null, 8127, (Object) null))) {
                        return C16807N.f139792a;
                    }
                    K10 = b10;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LXH/v;", "", "<destruct>", "LXH/N;", "<anonymous>", "(LXH/v;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.store.storepicker.impl.presentation.StorePickerViewModelImpl$collectStates$2$4", f = "StorePickerViewModel.kt", l = {}, m = "invokeSuspend")
    static final class g extends kotlin.coroutines.jvm.internal.l implements nI.p<v<? extends Boolean, ? extends Boolean>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f113922c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f113923d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ j f113924e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(j jVar, C17164e<? super g> eVar) {
            super(2, eVar);
            this.f113924e = jVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            g gVar = new g(this.f113924e, eVar);
            gVar.f113923d = obj;
            return gVar;
        }

        /* renamed from: i */
        public final Object invoke(v<Boolean, Boolean> vVar, C17164e<? super C16807N> eVar) {
            return ((g) create(vVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f113922c == 0) {
                y.b(obj);
                v vVar = (v) this.f113923d;
                this.f113924e.h0(((Boolean) vVar.a()).booleanValue(), ((Boolean) vVar.b()).booleanValue());
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class h extends C17525a implements nI.p<Boolean, C17164e<? super C16807N>, Object> {
        h(Object obj) {
            super(2, obj, j.class, "onLocationRequested", "onLocationRequested(Z)V", 4);
        }

        public final Object a(boolean z10, C17164e<? super C16807N> eVar) {
            return ((j) this.f144363a).g0(z10);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Boolean) obj).booleanValue(), (C17164e) obj2);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.store.storepicker.impl.presentation.StorePickerViewModelImpl$handleBackClick$2", f = "StorePickerViewModel.kt", l = {354}, m = "invokeSuspend")
    static final class i extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f113925c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ j f113926d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(j jVar, C17164e<? super i> eVar) {
            super(2, eVar);
            this.f113926d = jVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new i(this.f113926d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((i) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object value;
            Object f10 = C17187b.f();
            int i10 = this.f113925c;
            if (i10 == 0) {
                y.b(obj);
                this.f113925c = 1;
                if (C16297b0.b(50, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C16505B K10 = this.f113926d.f113895C;
            j jVar = this.f113926d;
            do {
                value = K10.getValue();
            } while (!K10.e(value, f.b((f) value, (C13023e) null, (h) null, new C13334c.a(jVar.f113910y, (C13334c.d) null, 2, (DefaultConstructorMarker) null), false, false, false, false, false, false, false, (C13333b) null, (d) null, (e) null, 8187, (Object) null)));
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"PB/j$j", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: PB.j$j  reason: collision with other inner class name */
    public static final class C2803j extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f113927a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2803j(N.a aVar, j jVar) {
            super(aVar);
            this.f113927a = jVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            j jVar = this.f113927a;
            qv.e eVar = qv.e.WARN;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a("Failed to setCoarseLocationRequested", th2);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str3 = str;
                if (str2 == null) {
                    String name = jVar.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, th2, str3);
                str = str3;
                str2 = str4;
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.store.storepicker.impl.presentation.StorePickerViewModelImpl$handlePermissionResult$5", f = "StorePickerViewModel.kt", l = {342}, m = "invokeSuspend")
    static final class k extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f113928c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ j f113929d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(j jVar, C17164e<? super k> eVar) {
            super(2, eVar);
            this.f113929d = jVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new k(this.f113929d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((k) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f113928c;
            if (i10 == 0) {
                y.b(obj);
                C12862c I10 = this.f113929d.f113904s;
                this.f113928c = 1;
                if (I10.a(this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.store.storepicker.impl.presentation.StorePickerViewModelImpl$handleSaveStore$2", f = "StorePickerViewModel.kt", l = {491, 496, 499, 507}, m = "invokeSuspend")
    static final class l extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f113930c;

        /* renamed from: d  reason: collision with root package name */
        Object f113931d;

        /* renamed from: e  reason: collision with root package name */
        Object f113932e;

        /* renamed from: f  reason: collision with root package name */
        Object f113933f;

        /* renamed from: g  reason: collision with root package name */
        Object f113934g;

        /* renamed from: h  reason: collision with root package name */
        Object f113935h;

        /* renamed from: i  reason: collision with root package name */
        Object f113936i;

        /* renamed from: j  reason: collision with root package name */
        int f113937j;

        /* renamed from: k  reason: collision with root package name */
        int f113938k;

        /* renamed from: l  reason: collision with root package name */
        int f113939l;

        /* renamed from: m  reason: collision with root package name */
        int f113940m;

        /* renamed from: n  reason: collision with root package name */
        private /* synthetic */ Object f113941n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ j f113942o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ g f113943p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(j jVar, g gVar, C17164e<? super l> eVar) {
            super(2, eVar);
            this.f113942o = jVar;
            this.f113943p = gVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            l lVar = new l(this.f113942o, this.f113943p, eVar);
            lVar.f113941n = obj;
            return lVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((l) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0094, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x00d1, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x00d2, code lost:
            r5 = r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x0218, code lost:
            throw r0;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [B:12:0x008e, B:17:0x00a3] */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0094 A[ExcHandler: CancellationException (r0v21 'e' java.util.concurrent.CancellationException A[CUSTOM_DECLARE]), Splitter:B:12:0x008e] */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x00e8  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x0128 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x0129  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x0182 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x0183  */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x01d1  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x0215  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r34) {
            /*
                r33 = this;
                r1 = r33
                java.lang.Object r2 = eI.C17187b.f()
                int r0 = r1.f113940m
                r3 = 4
                r4 = 3
                r5 = 1
                r6 = 2
                r7 = 0
                if (r0 == 0) goto L_0x0097
                if (r0 == r5) goto L_0x0079
                if (r0 == r6) goto L_0x005e
                if (r0 == r4) goto L_0x0041
                if (r0 != r3) goto L_0x0039
                java.lang.Object r0 = r1.f113936i
                PB.f r0 = (PB.f) r0
                java.lang.Object r0 = r1.f113934g
                TJ.B r0 = (TJ.C16505B) r0
                java.lang.Object r0 = r1.f113933f
                XH.N r0 = (XH.C16807N) r0
                java.lang.Object r0 = r1.f113932e
                PB.g r0 = (PB.g) r0
                java.lang.Object r2 = r1.f113931d
                PB.j r2 = (PB.j) r2
                java.lang.Object r3 = r1.f113930c
                java.lang.Object r4 = r1.f113941n
                QJ.Q r4 = (QJ.Q) r4
                XH.y.b(r34)
                r5 = r0
                r13 = r2
                r14 = r3
                goto L_0x0186
            L_0x0039:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L_0x0041:
                int r0 = r1.f113937j
                java.lang.Object r4 = r1.f113933f
                XH.N r4 = (XH.C16807N) r4
                java.lang.Object r5 = r1.f113932e
                PB.g r5 = (PB.g) r5
                java.lang.Object r8 = r1.f113931d
                PB.j r8 = (PB.j) r8
                java.lang.Object r9 = r1.f113930c
                java.lang.Object r10 = r1.f113941n
                QJ.Q r10 = (QJ.Q) r10
                XH.y.b(r34)
                r12 = r10
                r10 = r4
                r4 = r0
                r0 = r5
                goto L_0x0131
            L_0x005e:
                int r0 = r1.f113937j
                java.lang.Object r5 = r1.f113934g
                java.lang.Object r8 = r1.f113933f
                XH.N r8 = (XH.C16807N) r8
                java.lang.Object r9 = r1.f113932e
                PB.g r9 = (PB.g) r9
                java.lang.Object r10 = r1.f113931d
                PB.j r10 = (PB.j) r10
                java.lang.Object r11 = r1.f113930c
                java.lang.Object r12 = r1.f113941n
                QJ.Q r12 = (QJ.Q) r12
                XH.y.b(r34)
                goto L_0x0109
            L_0x0079:
                java.lang.Object r0 = r1.f113933f
                QJ.Q r0 = (QJ.Q) r0
                java.lang.Object r0 = r1.f113932e
                PB.g r0 = (PB.g) r0
                java.lang.Object r0 = r1.f113931d
                PB.j r0 = (PB.j) r0
                java.lang.Object r0 = r1.f113930c
                QJ.Q r0 = (QJ.Q) r0
                java.lang.Object r0 = r1.f113941n
                r5 = r0
                QJ.Q r5 = (QJ.Q) r5
                XH.y.b(r34)     // Catch:{ CancellationException -> 0x0094, all -> 0x0092 }
                goto L_0x00c5
            L_0x0092:
                r0 = move-exception
                goto L_0x00d3
            L_0x0094:
                r0 = move-exception
                goto L_0x0218
            L_0x0097:
                XH.y.b(r34)
                java.lang.Object r0 = r1.f113941n
                r8 = r0
                QJ.Q r8 = (QJ.Q) r8
                PB.j r0 = r1.f113942o
                PB.g r9 = r1.f113943p
                XH.x$a r10 = XH.x.f139812b     // Catch:{ CancellationException -> 0x0094, all -> 0x00d1 }
                RB.i r10 = r0.f113900o     // Catch:{ CancellationException -> 0x0094, all -> 0x00d1 }
                com.ingka.ikea.store.datalayer.StorageType r11 = r0.f113907v     // Catch:{ CancellationException -> 0x0094, all -> 0x00d1 }
                r1.f113941n = r8     // Catch:{ CancellationException -> 0x0094, all -> 0x00d1 }
                r1.f113930c = r8     // Catch:{ CancellationException -> 0x0094, all -> 0x00d1 }
                r1.f113931d = r0     // Catch:{ CancellationException -> 0x0094, all -> 0x00d1 }
                r1.f113932e = r9     // Catch:{ CancellationException -> 0x0094, all -> 0x00d1 }
                r1.f113933f = r8     // Catch:{ CancellationException -> 0x0094, all -> 0x00d1 }
                r1.f113937j = r7     // Catch:{ CancellationException -> 0x0094, all -> 0x00d1 }
                r1.f113938k = r7     // Catch:{ CancellationException -> 0x0094, all -> 0x00d1 }
                r1.f113940m = r5     // Catch:{ CancellationException -> 0x0094, all -> 0x00d1 }
                java.lang.Object r0 = r10.a(r11, r9, r1)     // Catch:{ CancellationException -> 0x0094, all -> 0x00d1 }
                if (r0 != r2) goto L_0x00c4
                return r2
            L_0x00c4:
                r5 = r8
            L_0x00c5:
                XH.N r0 = XH.C16807N.f139792a     // Catch:{ CancellationException -> 0x0094, all -> 0x0092 }
                java.lang.Object r0 = XH.x.b(r0)     // Catch:{ CancellationException -> 0x0094, all -> 0x0092 }
            L_0x00cb:
                r32 = r5
                r5 = r0
                r0 = r32
                goto L_0x00de
            L_0x00d1:
                r0 = move-exception
                r5 = r8
            L_0x00d3:
                XH.x$a r8 = XH.x.f139812b
                java.lang.Object r0 = XH.y.a(r0)
                java.lang.Object r0 = XH.x.b(r0)
                goto L_0x00cb
            L_0x00de:
                PB.j r10 = r1.f113942o
                PB.g r9 = r1.f113943p
                boolean r8 = XH.x.h(r5)
                if (r8 == 0) goto L_0x01c9
                r8 = r5
                XH.N r8 = (XH.C16807N) r8
                ft.c r11 = r10.f113906u
                r1.f113941n = r0
                r1.f113930c = r5
                r1.f113931d = r10
                r1.f113932e = r9
                r1.f113933f = r8
                r1.f113934g = r5
                r1.f113937j = r7
                r1.f113940m = r6
                java.lang.Object r11 = r11.a(r7, r1)
                if (r11 != r2) goto L_0x0106
                return r2
            L_0x0106:
                r12 = r0
                r11 = r5
                r0 = r7
            L_0x0109:
                NB.a r13 = r10.f113902q
                r13.g()
                r1.f113941n = r12
                r1.f113930c = r11
                r1.f113931d = r10
                r1.f113932e = r9
                r1.f113933f = r8
                r1.f113934g = r5
                r1.f113937j = r0
                r1.f113940m = r4
                r4 = 100
                java.lang.Object r4 = QJ.C16297b0.b(r4, r1)
                if (r4 != r2) goto L_0x0129
                return r2
            L_0x0129:
                r4 = r0
                r0 = r9
                r9 = r11
                r32 = r10
                r10 = r8
                r8 = r32
            L_0x0131:
                TJ.B r11 = r8.f113895C
            L_0x0135:
                java.lang.Object r5 = r11.getValue()
                r13 = r5
                PB.f r13 = (PB.f) r13
                r27 = 6143(0x17ff, float:8.608E-42)
                r28 = 0
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = 0
                r18 = 0
                r19 = 0
                r20 = 0
                r21 = 0
                r22 = 0
                r23 = 0
                r24 = 0
                r25 = 0
                r26 = 0
                PB.f r13 = PB.f.b(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
                boolean r14 = r11.e(r5, r13)
                if (r14 == 0) goto L_0x0135
                r1.f113941n = r12
                r1.f113930c = r9
                r1.f113931d = r8
                r1.f113932e = r0
                r1.f113933f = r10
                r1.f113934g = r11
                r1.f113935h = r5
                r1.f113936i = r13
                r1.f113937j = r4
                r1.f113938k = r7
                r1.f113939l = r7
                r1.f113940m = r3
                r3 = 50
                java.lang.Object r3 = QJ.C16297b0.b(r3, r1)
                if (r3 != r2) goto L_0x0183
                return r2
            L_0x0183:
                r5 = r0
                r13 = r8
                r14 = r9
            L_0x0186:
                TJ.B r15 = r13.f113895C
            L_0x018a:
                java.lang.Object r0 = r15.getValue()
                r16 = r0
                PB.f r16 = (PB.f) r16
                PB.c$a r2 = new PB.c$a
                java.lang.String r3 = r13.f113910y
                PB.c$d r4 = new PB.c$d
                r4.<init>(r5)
                r2.<init>(r3, r4)
                r30 = 8187(0x1ffb, float:1.1472E-41)
                r31 = 0
                r17 = 0
                r18 = 0
                r20 = 0
                r21 = 0
                r22 = 0
                r23 = 0
                r24 = 0
                r25 = 0
                r26 = 0
                r27 = 0
                r28 = 0
                r29 = 0
                r19 = r2
                PB.f r2 = PB.f.b(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
                boolean r0 = r15.e(r0, r2)
                if (r0 == 0) goto L_0x018a
                r5 = r14
            L_0x01c9:
                PB.j r0 = r1.f113942o
                java.lang.Throwable r2 = XH.x.e(r5)
                if (r2 == 0) goto L_0x0215
                TJ.B r0 = r0.f113895C
            L_0x01d5:
                java.lang.Object r2 = r0.getValue()
                r8 = r2
                PB.f r8 = (PB.f) r8
                PB.d r3 = r8.f()
                r4 = 0
                if (r3 == 0) goto L_0x01ea
                PB.d r3 = PB.d.b(r3, r7, r4, r6, r4)
                r20 = r3
                goto L_0x01ec
            L_0x01ea:
                r20 = r4
            L_0x01ec:
                PB.h$b r10 = new PB.h$b
                int r3 = iC.C14551a.f127542o
                IC.e r3 = IC.C13026h.a(r3)
                r10.<init>(r3, r4)
                r22 = 6133(0x17f5, float:8.594E-42)
                r23 = 0
                r9 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = 0
                r18 = 0
                r19 = 0
                r21 = 0
                PB.f r3 = PB.f.b(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
                boolean r2 = r0.e(r2, r3)
                if (r2 == 0) goto L_0x01d5
            L_0x0215:
                XH.N r0 = XH.C16807N.f139792a
                return r0
            L_0x0218:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: PB.j.l.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.store.storepicker.impl.presentation.StorePickerViewModelImpl", f = "StorePickerViewModel.kt", l = {434}, m = "handleStoreDataSuccess")
    static final class m extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f113944c;

        /* renamed from: d  reason: collision with root package name */
        Object f113945d;

        /* renamed from: e  reason: collision with root package name */
        Object f113946e;

        /* renamed from: f  reason: collision with root package name */
        Object f113947f;

        /* renamed from: g  reason: collision with root package name */
        Object f113948g;

        /* renamed from: h  reason: collision with root package name */
        Object f113949h;

        /* renamed from: i  reason: collision with root package name */
        Object f113950i;

        /* renamed from: j  reason: collision with root package name */
        Object f113951j;

        /* renamed from: k  reason: collision with root package name */
        Object f113952k;

        /* renamed from: l  reason: collision with root package name */
        Object f113953l;

        /* renamed from: m  reason: collision with root package name */
        Object f113954m;

        /* renamed from: n  reason: collision with root package name */
        Object f113955n;

        /* renamed from: o  reason: collision with root package name */
        int f113956o;

        /* renamed from: p  reason: collision with root package name */
        int f113957p;

        /* renamed from: q  reason: collision with root package name */
        int f113958q;

        /* renamed from: r  reason: collision with root package name */
        int f113959r;

        /* renamed from: s  reason: collision with root package name */
        /* synthetic */ Object f113960s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ j f113961t;

        /* renamed from: u  reason: collision with root package name */
        int f113962u;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(j jVar, C17164e<? super m> eVar) {
            super(eVar);
            this.f113961t = jVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f113960s = obj;
            this.f113962u |= Integer.MIN_VALUE;
            return this.f113961t.b0((List<g>) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LXH/v;", "", "<destruct>", "isInResumedState", "<anonymous>", "(LXH/v;Z)Z"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.store.storepicker.impl.presentation.StorePickerViewModelImpl$includeUserLocation$1", f = "StorePickerViewModel.kt", l = {}, m = "invokeSuspend")
    static final class n extends kotlin.coroutines.jvm.internal.l implements nI.q<v<? extends Boolean, ? extends Boolean>, Boolean, C17164e<? super Boolean>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f113963c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f113964d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ boolean f113965e;

        n(C17164e<? super n> eVar) {
            super(3, eVar);
        }

        public final Object i(v<Boolean, Boolean> vVar, boolean z10, C17164e<? super Boolean> eVar) {
            n nVar = new n(eVar);
            nVar.f113964d = vVar;
            nVar.f113965e = z10;
            return nVar.invokeSuspend(C16807N.f139792a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return i((v) obj, ((Boolean) obj2).booleanValue(), (C17164e) obj3);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f113963c == 0) {
                y.b(obj);
                v vVar = (v) this.f113964d;
                return kotlin.coroutines.jvm.internal.b.a(((Boolean) vVar.a()).booleanValue() && ((Boolean) vVar.b()).booleanValue() && this.f113965e);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.store.storepicker.impl.presentation.StorePickerViewModelImpl$onAction$1", f = "StorePickerViewModel.kt", l = {136}, m = "invokeSuspend")
    static final class o extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f113966c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ j f113967d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(j jVar, C17164e<? super o> eVar) {
            super(2, eVar);
            this.f113967d = jVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new o(this.f113967d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((o) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f113966c;
            if (i10 == 0) {
                y.b(obj);
                C16504A F10 = this.f113967d.f113897E;
                C16807N n10 = C16807N.f139792a;
                this.f113966c = 1;
                if (F10.emit(n10, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.store.storepicker.impl.presentation.StorePickerViewModelImpl$onAction$2", f = "StorePickerViewModel.kt", l = {140}, m = "invokeSuspend")
    static final class p extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f113968c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ j f113969d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(j jVar, C17164e<? super p> eVar) {
            super(2, eVar);
            this.f113969d = jVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new p(this.f113969d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((p) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f113968c;
            if (i10 == 0) {
                y.b(obj);
                C16504A F10 = this.f113969d.f113897E;
                C16807N n10 = C16807N.f139792a;
                this.f113968c = 1;
                if (F10.emit(n10, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.store.storepicker.impl.presentation.StorePickerViewModelImpl", f = "StorePickerViewModel.kt", l = {264}, m = "onStoreData")
    static final class q extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f113970c;

        /* renamed from: d  reason: collision with root package name */
        Object f113971d;

        /* renamed from: e  reason: collision with root package name */
        Object f113972e;

        /* renamed from: f  reason: collision with root package name */
        Object f113973f;

        /* renamed from: g  reason: collision with root package name */
        Object f113974g;

        /* renamed from: h  reason: collision with root package name */
        int f113975h;

        /* renamed from: i  reason: collision with root package name */
        /* synthetic */ Object f113976i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ j f113977j;

        /* renamed from: k  reason: collision with root package name */
        int f113978k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(j jVar, C17164e<? super q> eVar) {
            super(eVar);
            this.f113977j = jVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f113976i = obj;
            this.f113978k |= Integer.MIN_VALUE;
            return this.f113977j.i0((Object) null, this);
        }
    }

    public j(U u10, C13504a aVar, C13507d dVar, C13512i iVar, C13510g gVar, C13268a aVar2, w wVar, C12862c cVar, LocationManager locationManager, C11285c cVar2) {
        boolean z10;
        U u11 = u10;
        C13504a aVar3 = aVar;
        C13507d dVar2 = dVar;
        C13512i iVar2 = iVar;
        C13510g gVar2 = gVar;
        C13268a aVar4 = aVar2;
        w wVar2 = wVar;
        C12862c cVar3 = cVar;
        LocationManager locationManager2 = locationManager;
        C11285c cVar4 = cVar2;
        C17542s.j(u11, "savedStateHandle");
        C17542s.j(aVar3, "getSelectedStoreIdUseCase");
        C17542s.j(dVar2, "getStoreDataUseCase");
        C17542s.j(iVar2, "saveStoreSelectionUseCase");
        C17542s.j(gVar2, "isScanAndGoActiveUseCase");
        C17542s.j(aVar4, "analytics");
        C17542s.j(wVar2, "verifyPermissionUseCase");
        C17542s.j(cVar3, "storeLocalDataSource");
        C17542s.j(locationManager2, "locationManager");
        C17542s.j(cVar4, "storePageRepository");
        this.f113898m = aVar3;
        this.f113899n = dVar2;
        this.f113900o = iVar2;
        this.f113901p = gVar2;
        this.f113902q = aVar4;
        this.f113903r = wVar2;
        this.f113904s = cVar3;
        this.f113905t = locationManager2;
        this.f113906u = cVar4;
        Object f10 = u11.f(PlaceTypes.STORAGE);
        if (f10 != null) {
            StorageType valueOf = StorageType.valueOf((String) f10);
            this.f113907v = valueOf;
            Object f11 = u11.f("scanAndGo");
            if (f11 != null) {
                boolean booleanValue = ((Boolean) f11).booleanValue();
                this.f113908w = booleanValue;
                this.f113909x = (String) u11.f("itemNo");
                Object f12 = u11.f("requestKey");
                if (f12 != null) {
                    this.f113910y = (String) f12;
                    C16505B<v<Boolean, Boolean>> a10 = C16521S.a(C16796C.a(Boolean.valueOf(e0()), Boolean.valueOf(d0())));
                    this.f113911z = a10;
                    Boolean bool = Boolean.FALSE;
                    C16505B<Boolean> a11 = C16521S.a(bool);
                    this.f113893A = a11;
                    this.f113894B = C16534i.c0(C16534i.n(a10, a11, new n((C17164e<? super n>) null)), g0.a(this), ip.f.a(), bool);
                    int i10 = b.f113912a[valueOf.ordinal()];
                    if (i10 == 1 || i10 == 2) {
                        z10 = false;
                    } else if (i10 == 3) {
                        z10 = true;
                    } else {
                        throw new t();
                    }
                    v value = a10.getValue();
                    C16505B<f> a12 = C16521S.a(new f((C13023e) null, (h) null, (C13334c) null, false, booleanValue, false, false, !((Boolean) value.a()).booleanValue() || !((Boolean) value.b()).booleanValue(), false, z10, (C13333b) null, (d) null, (e) null, 7535, (DefaultConstructorMarker) null));
                    this.f113895C = a12;
                    this.f113896D = C16534i.c(a12);
                    this.f113897E = C16511H.b(0, 0, (C16428d) null, 7, (Object) null);
                    P();
                    return;
                }
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final void P() {
        C16534i.M(C16534i.g0(C16534i.T(this.f113897E, new d((C17164e<? super d>) null)), new c((C17164e) null, this)), g0.a(this));
    }

    private final void S() {
        f value;
        C16505B<f> b10 = this.f113895C;
        do {
            value = b10.getValue();
        } while (!b10.e(value, f.b(value, (C13023e) null, (h) null, (C13334c) null, false, false, false, false, false, false, false, (C13333b) null, (d) null, (e) null, 6143, (Object) null)));
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new i(this, (C17164e<? super i>) null), 3, (Object) null);
    }

    private final void T() {
        f value;
        f value2;
        this.f113902q.c();
        v value3 = this.f113911z.getValue();
        boolean booleanValue = ((Boolean) value3.a()).booleanValue();
        boolean booleanValue2 = ((Boolean) value3.b()).booleanValue();
        if (!booleanValue) {
            C16505B<f> b10 = this.f113895C;
            do {
                value2 = b10.getValue();
            } while (!b10.e(value2, f.b(value2, (C13023e) null, (h) null, (C13334c) null, false, false, false, false, false, true, false, (C13333b) null, (d) null, (e) null, 7935, (Object) null)));
        } else if (!booleanValue2) {
            C16505B<f> b11 = this.f113895C;
            do {
                value = b11.getValue();
            } while (!b11.e(value, f.b(value, (C13023e) null, (h) null, C13334c.C2800c.f113841a, false, false, false, false, false, false, false, (C13333b) null, (d) null, (e) null, 8187, (Object) null)));
        }
    }

    private final void U() {
        this.f113911z.setValue(C16796C.a(Boolean.valueOf(e0()), Boolean.valueOf(d0())));
        this.f113893A.setValue(Boolean.TRUE);
    }

    private final void V(C13332a.e eVar) {
        f value;
        f value2;
        f value3;
        C13332a.e eVar2 = eVar;
        if (eVar2 instanceof C13332a.e.d) {
            this.f113902q.b(((C13332a.e.d) eVar2).a());
            if (!d0()) {
                C16505B<f> b10 = this.f113895C;
                do {
                    value3 = b10.getValue();
                } while (!b10.e(value3, f.b(value3, (C13023e) null, (h) null, C13334c.C2800c.f113841a, false, false, false, false, false, false, false, (C13333b) null, (d) null, (e) null, 8187, (Object) null)));
            }
        } else if (C17542s.e(eVar2, C13332a.e.C2798a.f113816a) || C17542s.e(eVar2, C13332a.e.c.f113818a)) {
            this.f113902q.f();
        } else if (C17542s.e(eVar2, C13332a.e.b.f113817a)) {
            C16505B<f> b11 = this.f113895C;
            do {
                value2 = b11.getValue();
            } while (!b11.e(value2, f.b(value2, (C13023e) null, h.a.f113884a, (C13334c) null, false, false, false, false, false, false, false, (C13333b) null, (d) null, (e) null, 8189, (Object) null)));
        } else {
            throw new t();
        }
        C16505B<f> b12 = this.f113895C;
        do {
            value = b12.getValue();
        } while (!b12.e(value, f.b(value, (C13023e) null, (h) null, (C13334c) null, false, false, false, false, false, false, false, (C13333b) null, (d) null, (e) null, 7935, (Object) null)));
        F0 unused = C16314k.d(g0.a(this), new C2803j(N.f137593c0, this), (T) null, new k(this, (C17164e<? super k>) null), 2, (Object) null);
    }

    private final void W(g gVar) {
        C16505B<f> b10 = this.f113895C;
        while (true) {
            f value = b10.getValue();
            f fVar = value;
            d f10 = fVar.f();
            if (b10.e(value, f.b(fVar, (C13023e) null, (h) null, (C13334c) null, true, false, false, false, false, false, false, (C13333b) null, f10 != null ? d.b(f10, true, (g) null, 2, (Object) null) : null, (e) null, 6135, (Object) null))) {
                this.f113902q.d(gVar.j());
                F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new l(this, gVar, (C17164e<? super l>) null), 3, (Object) null);
                return;
            }
            g gVar2 = gVar;
        }
    }

    private final void X(String str) {
        f value;
        f fVar;
        C13333b c10;
        if (this.f113895C.getValue().c() instanceof C13333b.c) {
            C16505B<f> b10 = this.f113895C;
            do {
                value = b10.getValue();
                fVar = value;
                c10 = fVar.c();
                C17542s.h(c10, "null cannot be cast to non-null type com.ingka.ikea.store.storepicker.impl.presentation.StorePickerContract.Content.StoreData");
            } while (!b10.e(value, f.b(fVar, (C13023e) null, (h) null, (C13334c) null, false, false, false, false, false, false, false, (C13333b) null, (d) null, k0(str, ((C13333b.c) c10).c()), 4095, (Object) null)));
        }
    }

    private final void Y() {
        f value;
        f fVar;
        h.b bVar;
        C13333b.c cVar;
        g b10;
        ArrayList arrayList;
        if (this.f113895C.getValue().c() instanceof C13333b.c) {
            C16505B<f> b11 = this.f113895C;
            do {
                value = b11.getValue();
                fVar = value;
                bVar = new h.b(C13026h.a(C14551a.f127538k), new h.b.a(C13026h.a(C14551a.f127537j), C13332a.i.f113823a));
                C13333b c10 = fVar.c();
                C17542s.h(c10, "null cannot be cast to non-null type com.ingka.ikea.store.storepicker.impl.presentation.StorePickerContract.Content.StoreData");
                cVar = (C13333b.c) c10;
                g b12 = ((C13333b.c) fVar.c()).b();
                b10 = b12 != null ? g.b(b12, (String) null, (String) null, (String) null, (C13023e) null, false, false, (C15987c) null, C15985a.a(), (C12829a) null, 383, (Object) null) : null;
                C15987c<g> c11 = ((C13333b.c) fVar.c()).c();
                arrayList = new ArrayList(C16877v.y(c11, 10));
                for (g b13 : c11) {
                    arrayList.add(g.b(b13, (String) null, (String) null, (String) null, (C13023e) null, false, false, (C15987c) null, C15985a.a(), (C12829a) null, 383, (Object) null));
                }
            } while (!b11.e(value, f.b(fVar, (C13023e) null, bVar, (C13334c) null, false, false, false, false, false, false, false, cVar.a(b10, C15985a.l(arrayList)), (d) null, (e) null, 7165, (Object) null)));
        }
    }

    private final void Z(g gVar) {
        f value;
        C13333b c10 = getState().getValue().c();
        d dVar = null;
        C13333b.c cVar = c10 instanceof C13333b.c ? (C13333b.c) c10 : null;
        g b10 = cVar != null ? cVar.b() : null;
        if (gVar != null) {
            g gVar2 = !C17542s.e(gVar.j(), b10 != null ? b10.j() : null) ? gVar : null;
            if (gVar2 != null) {
                dVar = new d(false, gVar2);
            }
        }
        C16505B<f> b11 = this.f113895C;
        do {
            value = b11.getValue();
        } while (!b11.e(value, f.b(value, (C13023e) null, (h) null, (C13334c) null, false, false, false, false, false, false, false, (C13333b) null, dVar, (e) null, 6143, (Object) null)));
    }

    private final void a0(String str) {
        f value;
        this.f113902q.a();
        C16505B<f> b10 = this.f113895C;
        do {
            value = b10.getValue();
        } while (!b10.e(value, f.b(value, (C13023e) null, (h) null, new C13334c.e(str), false, false, false, false, false, false, false, (C13333b) null, (d) null, (e) null, 8187, (Object) null)));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b0(java.util.List<PB.g> r35, dI.C17164e<? super XH.C16807N> r36) {
        /*
            r34 = this;
            r0 = r34
            r1 = r36
            boolean r2 = r1 instanceof PB.j.m
            if (r2 == 0) goto L_0x0017
            r2 = r1
            PB.j$m r2 = (PB.j.m) r2
            int r3 = r2.f113962u
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f113962u = r3
            goto L_0x001c
        L_0x0017:
            PB.j$m r2 = new PB.j$m
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r3 = r2.f113960s
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r2.f113962u
            r7 = 1
            if (r5 == 0) goto L_0x007f
            if (r5 != r7) goto L_0x0077
            int r1 = r2.f113958q
            int r5 = r2.f113957p
            int r8 = r2.f113956o
            java.lang.Object r9 = r2.f113955n
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r2.f113954m
            PB.g r10 = (PB.g) r10
            java.lang.Object r10 = r2.f113953l
            java.lang.Object r11 = r2.f113952k
            java.util.Iterator r11 = (java.util.Iterator) r11
            java.lang.Object r12 = r2.f113951j
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            java.lang.Object r13 = r2.f113950i
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            java.lang.Object r14 = r2.f113949h
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.lang.Object r15 = r2.f113948g
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            java.lang.Object r7 = r2.f113947f
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r6 = r2.f113946e
            dI.e r6 = (dI.C17164e) r6
            r35 = r1
            java.lang.Object r1 = r2.f113945d
            java.util.List r1 = (java.util.List) r1
            r36 = r1
            java.lang.Object r1 = r2.f113944c
            PB.j r1 = (PB.j) r1
            XH.y.b(r3)
            r17 = r35
            r0 = r1
            r1 = r36
            r32 = r6
            r6 = r2
            r2 = r32
            r33 = r5
            r5 = r4
            r4 = r8
            r8 = r7
            r7 = r33
            goto L_0x0198
        L_0x0077:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x007f:
            XH.y.b(r3)
            r3 = r35
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            boolean r5 = r3 instanceof java.util.Collection
            if (r5 == 0) goto L_0x0095
            r5 = r3
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x0095
        L_0x0093:
            r5 = 1
            goto L_0x00b0
        L_0x0095:
            java.util.Iterator r5 = r3.iterator()
        L_0x0099:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0093
            java.lang.Object r6 = r5.next()
            PB.g r6 = (PB.g) r6
            KJ.c r6 = r6.g()
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L_0x0099
            r5 = 0
        L_0x00b0:
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 10
            int r7 = YH.C16877v.y(r3, r7)
            r6.<init>(r7)
            java.util.Iterator r3 = r3.iterator()
        L_0x00bf:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x0107
            java.lang.Object r7 = r3.next()
            r16 = r7
            PB.g r16 = (PB.g) r16
            if (r5 == 0) goto L_0x00e6
            PB.g$b$b r7 = new PB.g$b$b
            java.lang.String r8 = r0.f113909x
            if (r8 == 0) goto L_0x00d7
            r8 = 2
            goto L_0x00d8
        L_0x00d7:
            r8 = 1
        L_0x00d8:
            r7.<init>(r8)
            PB.g$b$b[] r7 = new PB.g.b.C2802b[]{r7}
            KJ.f r7 = KJ.C15985a.b(r7)
        L_0x00e3:
            r24 = r7
            goto L_0x00eb
        L_0x00e6:
            KJ.c r7 = r16.g()
            goto L_0x00e3
        L_0x00eb:
            r26 = 383(0x17f, float:5.37E-43)
            r27 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = 0
            PB.g r7 = PB.g.b(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r6.add(r7)
            goto L_0x00bf
        L_0x0107:
            boolean r3 = r6.isEmpty()
            if (r3 == 0) goto L_0x010f
        L_0x010d:
            r3 = 0
            goto L_0x0126
        L_0x010f:
            java.util.Iterator r3 = r6.iterator()
        L_0x0113:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x010d
            java.lang.Object r7 = r3.next()
            PB.g r7 = (PB.g) r7
            boolean r7 = r7.i()
            if (r7 == 0) goto L_0x0113
            r3 = 1
        L_0x0126:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r9 = r6.iterator()
            r14 = r6
            r15 = r14
            r13 = r7
            r12 = r8
            r11 = r9
            r6 = r2
            r7 = r3
            r9 = r5
            r8 = r15
            r5 = 0
            r3 = r0
            r2 = r1
            r1 = r35
        L_0x0142:
            boolean r10 = r11.hasNext()
            if (r10 == 0) goto L_0x01ad
            java.lang.Object r10 = r11.next()
            r0 = r10
            PB.g r0 = (PB.g) r0
            r16 = r4
            java.lang.String r4 = r0.j()
            r17 = r5
            RB.a r5 = r3.f113898m
            r18 = r5
            com.ingka.ikea.store.datalayer.StorageType r5 = r3.f113907v
            r6.f113944c = r3
            r6.f113945d = r1
            r6.f113946e = r2
            r6.f113947f = r8
            r6.f113948g = r15
            r6.f113949h = r14
            r6.f113950i = r13
            r6.f113951j = r12
            r6.f113952k = r11
            r6.f113953l = r10
            r6.f113954m = r0
            r6.f113955n = r4
            r6.f113956o = r9
            r6.f113957p = r7
            r0 = r17
            r6.f113958q = r0
            r0 = 0
            r6.f113959r = r0
            r0 = 1
            r6.f113962u = r0
            r0 = r18
            java.lang.Object r0 = r0.a(r5, r6)
            r5 = r16
            if (r0 != r5) goto L_0x018e
            return r5
        L_0x018e:
            r32 = r3
            r3 = r0
            r0 = r32
            r33 = r9
            r9 = r4
            r4 = r33
        L_0x0198:
            boolean r3 = kotlin.jvm.internal.C17542s.e(r9, r3)
            if (r3 == 0) goto L_0x01a2
            r13.add(r10)
            goto L_0x01a5
        L_0x01a2:
            r12.add(r10)
        L_0x01a5:
            r3 = r0
            r9 = r4
            r4 = r5
            r5 = r17
            r0 = r34
            goto L_0x0142
        L_0x01ad:
            XH.v r0 = new XH.v
            r0.<init>(r13, r12)
            java.lang.Object r1 = r0.c()
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = YH.C16877v.y0(r1)
            PB.g r1 = (PB.g) r1
            java.lang.Object r0 = r0.d()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            KJ.f r0 = KJ.C15985a.l(r0)
            TJ.B<PB.f> r2 = r3.f113895C
        L_0x01ca:
            java.lang.Object r3 = r2.getValue()
            r16 = r3
            PB.f r16 = (PB.f) r16
            if (r7 == 0) goto L_0x01d7
            r22 = 1
            goto L_0x01d9
        L_0x01d7:
            r22 = 0
        L_0x01d9:
            PB.b$c r4 = new PB.b$c
            r4.<init>(r1, r0)
            r30 = 7135(0x1bdf, float:9.998E-42)
            r31 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r28 = 0
            r29 = 0
            r27 = r4
            PB.f r4 = PB.f.b(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            boolean r3 = r2.e(r3, r4)
            if (r3 == 0) goto L_0x01ca
            XH.N r0 = XH.C16807N.f139792a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: PB.j.b0(java.util.List, dI.e):java.lang.Object");
    }

    private final void c0() {
        f value;
        C16505B<f> b10 = this.f113895C;
        do {
            value = b10.getValue();
        } while (!b10.e(value, f.b(value, (C13023e) null, (h) null, (C13334c) null, false, false, false, false, false, false, false, C13333b.a.f113832a, (d) null, (e) null, 7167, (Object) null)));
    }

    private final boolean d0() {
        return A2.b.a(this.f113905t);
    }

    private final boolean e0() {
        Iterable<Boolean> values = this.f113903r.a(C16877v.q("android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION")).values();
        if ((values instanceof Collection) && ((Collection) values).isEmpty()) {
            return false;
        }
        for (Boolean booleanValue : values) {
            if (booleanValue.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public final void g0(boolean z10) {
        boolean z11 = false;
        if (!z10) {
            if (((Boolean) this.f113911z.getValue().c()).booleanValue()) {
                Iterable values = this.f113903r.a(C16877v.e("android.permission.ACCESS_FINE_LOCATION")).values();
                if (!(values instanceof Collection) || !((Collection) values).isEmpty()) {
                    Iterator it = values.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!((Boolean) it.next()).booleanValue()) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    z11 = !z11;
                }
                z11 = true;
                z11 = !z11;
            } else {
                z11 = true;
            }
        }
        C16505B<f> b10 = this.f113895C;
        while (true) {
            f value = b10.getValue();
            C16505B<f> b11 = b10;
            if (!b11.e(value, f.b(value, (C13023e) null, (h) null, (C13334c) null, false, false, false, false, false, z11, false, (C13333b) null, (d) null, (e) null, 7935, (Object) null))) {
                b10 = b11;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    public final void h0(boolean z10, boolean z11) {
        boolean z12;
        f value;
        boolean z13 = z10;
        boolean z14 = z11;
        qv.e eVar = qv.e.DEBUG;
        ArrayList arrayList = new ArrayList();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        Iterator it = arrayList.iterator();
        String str = null;
        String str2 = null;
        while (true) {
            z12 = true;
            if (!it.hasNext()) {
                break;
            }
            C11819b bVar = (C11819b) it.next();
            if (str == null) {
                String a10 = C11818a.a("onPermissionAndLocation granted: " + z13 + ", locationEnabled: " + z14, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = j.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, false, (Throwable) null, str3);
            str = str3;
            str2 = str4;
        }
        if (!z13 || !z14) {
            z12 = false;
        }
        C16505B<f> b10 = this.f113895C;
        do {
            value = b10.getValue();
        } while (!b10.e(value, f.b(value, z12 ? C13026h.a(C14551a.f127546s) : C13026h.a(C14551a.f127545r), (h) null, (C13334c) null, false, false, false, false, !z12, false, false, (C13333b) null, (d) null, (e) null, 8062, (Object) null)));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object i0(java.lang.Object r6, dI.C17164e<? super XH.C16807N> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof PB.j.q
            if (r0 == 0) goto L_0x0013
            r0 = r7
            PB.j$q r0 = (PB.j.q) r0
            int r1 = r0.f113978k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f113978k = r1
            goto L_0x0018
        L_0x0013:
            PB.j$q r0 = new PB.j$q
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f113976i
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f113978k
            r4 = 1
            if (r3 == 0) goto L_0x003f
            if (r3 != r4) goto L_0x0037
            java.lang.Object r6 = r0.f113974g
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r6 = r0.f113973f
            java.lang.Object r7 = r0.f113972e
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r7 = r0.f113970c
            PB.j r7 = (PB.j) r7
            XH.y.b(r1)
            goto L_0x0062
        L_0x0037:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003f:
            XH.y.b(r1)
            boolean r1 = XH.x.h(r6)
            if (r1 == 0) goto L_0x0061
            r1 = r6
            java.util.List r1 = (java.util.List) r1
            r0.f113970c = r5
            r0.f113971d = r6
            r0.f113972e = r7
            r0.f113973f = r6
            r0.f113974g = r1
            r7 = 0
            r0.f113975h = r7
            r0.f113978k = r4
            java.lang.Object r7 = r5.b0(r1, r0)
            if (r7 != r2) goto L_0x0061
            return r2
        L_0x0061:
            r7 = r5
        L_0x0062:
            java.lang.Throwable r6 = XH.x.e(r6)
            if (r6 == 0) goto L_0x0085
            java.lang.String r0 = "null cannot be cast to non-null type com.ingka.ikea.store.storepicker.impl.usecase.GetStoreDataUseCase.GetStoreDataException"
            kotlin.jvm.internal.C17542s.h(r6, r0)
            RB.d$a r6 = (RB.C13507d.a) r6
            boolean r0 = r6 instanceof RB.C13507d.a.b
            if (r0 == 0) goto L_0x0077
            r7.c0()
            goto L_0x0085
        L_0x0077:
            boolean r6 = r6 instanceof RB.C13507d.a.C2830a
            if (r6 == 0) goto L_0x007f
            r7.Y()
            goto L_0x0085
        L_0x007f:
            XH.t r6 = new XH.t
            r6.<init>()
            throw r6
        L_0x0085:
            XH.N r6 = XH.C16807N.f139792a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: PB.j.i0(java.lang.Object, dI.e):java.lang.Object");
    }

    private final String j0(String str) {
        String normalize = Normalizer.normalize(str, Normalizer.Form.NFD);
        C17542s.g(normalize);
        return new C15850p("\\p{InCombiningDiacriticalMarks}+").j(normalize, "");
    }

    public final C16519P<Boolean> R() {
        return this.f113894B;
    }

    /* renamed from: f0 */
    public void b(C13332a aVar) {
        f value;
        f value2;
        f value3;
        C13332a aVar2 = aVar;
        C17542s.j(aVar2, "action");
        if (C17542s.e(aVar2, C13332a.j.f113824a)) {
            F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new o(this, (C17164e<? super o>) null), 3, (Object) null);
        } else if (C17542s.e(aVar2, C13332a.i.f113823a)) {
            F0 unused2 = C16314k.d(g0.a(this), (C17168i) null, (T) null, new p(this, (C17164e<? super p>) null), 3, (Object) null);
        } else if (aVar2 instanceof C13332a.l) {
            W(((C13332a.l) aVar2).a());
        } else if (C17542s.e(aVar2, C13332a.o.f113831a)) {
            C16505B<f> b10 = this.f113895C;
            do {
                value3 = b10.getValue();
            } while (!b10.e(value3, f.b(value3, (C13023e) null, (h) null, (C13334c) null, false, false, false, false, false, false, false, (C13333b) null, (d) null, (e) null, 8189, (Object) null)));
        } else if (C17542s.e(aVar2, C13332a.f.f113820a)) {
            C16505B<f> b11 = this.f113895C;
            do {
                value2 = b11.getValue();
            } while (!b11.e(value2, f.b(value2, (C13023e) null, (h) null, (C13334c) null, false, false, false, false, false, false, false, (C13333b) null, (d) null, (e) null, 8187, (Object) null)));
        } else if (C17542s.e(aVar2, C13332a.C2797a.f113812a)) {
            S();
        } else if (aVar2 instanceof C13332a.n) {
            a0(((C13332a.n) aVar2).a());
        } else if (aVar2 instanceof C13332a.k) {
            X(((C13332a.k) aVar2).a());
        } else if (aVar2 instanceof C13332a.m) {
            Z(((C13332a.m) aVar2).a());
        } else if (C17542s.e(aVar2, C13332a.c.f113814a)) {
            C16505B<f> b12 = this.f113895C;
            do {
                value = b12.getValue();
            } while (!b12.e(value, f.b(value, (C13023e) null, (h) null, C13334c.b.f113840a, false, false, false, false, false, false, false, (C13333b) null, (d) null, (e) null, 8187, (Object) null)));
        } else if (aVar2 instanceof C13332a.e) {
            V((C13332a.e) aVar2);
        } else if (C17542s.e(aVar2, C13332a.b.f113813a)) {
            T();
        } else if (C17542s.e(aVar2, C13332a.h.f113822a)) {
            U();
        } else if (C17542s.e(aVar2, C13332a.g.f113821a)) {
            this.f113893A.setValue(Boolean.FALSE);
        } else if (C17542s.e(aVar2, C13332a.d.f113815a)) {
            this.f113902q.e();
        } else {
            throw new t();
        }
    }

    public C16519P<f> getState() {
        return this.f113896D;
    }

    public final e k0(String str, C15987c<g> cVar) {
        v vVar;
        C17542s.j(cVar, "stores");
        if (str == null) {
            return null;
        }
        String j02 = j0(C15854t.z1(str).toString());
        if (C17542s.e(j02, "")) {
            vVar = C16796C.a(C15985a.a(), Boolean.FALSE);
        } else {
            ArrayList arrayList = new ArrayList();
            for (T next : cVar) {
                g gVar = (g) next;
                if (C15854t.b0(j0(gVar.h()), j02, true) || C15854t.b0(j0(gVar.c()), j02, true)) {
                    arrayList.add(next);
                }
            }
            C15990f l10 = C15985a.l(arrayList);
            vVar = C16796C.a(l10, Boolean.valueOf(l10.isEmpty()));
        }
        return new e(((Boolean) vVar.b()).booleanValue(), (C15990f) vVar.a());
    }
}
