package com.ingka.ikea.browseandsearch.plp.impl.ui;

import EB.C12832d;
import FB.C12860a;
import QJ.F0;
import QJ.Q;
import QJ.T;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import androidx.lifecycle.F;
import androidx.lifecycle.K;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.ingka.ikea.app.base.UserPostalCodeAddress;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import fI.C17221b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import nI.q;
import on.C11686a;
import pn.C11764d;
import sf.C10242c;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001:\u000289B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020!0 8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020!0%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u0018\u0010(R\u0014\u0010,\u001a\u00020!8\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020.0-8\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001d\u00107\u001a\b\u0012\u0004\u0012\u00020.028\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106¨\u0006:"}, d2 = {"Lcom/ingka/ikea/browseandsearch/plp/impl/ui/a;", "Landroidx/lifecycle/f0;", "LFB/a;", "localStoreSelectionRepository", "Lsf/c;", "appUserDataRepository", "Lpn/d;", "plpSettingsRepository", "Lon/a;", "analytics", "<init>", "(LFB/a;Lsf/c;Lpn/d;Lon/a;)V", "Lcom/ingka/ikea/app/base/UserPostalCodeAddress;", "postalCodeAddress", "LXH/N;", "E", "(Lcom/ingka/ikea/app/base/UserPostalCodeAddress;)V", "F", "()V", "", "enabled", "k", "(Z)V", "C", "m", "LFB/a;", "n", "Lsf/c;", "o", "Lpn/d;", "p", "Lon/a;", "LTJ/B;", "Lcom/ingka/ikea/browseandsearch/plp/impl/ui/a$b;", "q", "LTJ/B;", "_uiState", "LTJ/P;", "r", "LTJ/P;", "()LTJ/P;", "uiState", "s", "Lcom/ingka/ikea/browseandsearch/plp/impl/ui/a$b;", "initialState", "Landroidx/lifecycle/K;", "Lcom/ingka/ikea/browseandsearch/plp/impl/ui/a$c;", "t", "Landroidx/lifecycle/K;", "_viewModelEvents", "Landroidx/lifecycle/F;", "u", "Landroidx/lifecycle/F;", "D", "()Landroidx/lifecycle/F;", "viewModelEvents", "b", "c", "plp-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a extends f0 {

    /* renamed from: m  reason: collision with root package name */
    private final C12860a f93513m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final C10242c f93514n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final C11764d f93515o;

    /* renamed from: p  reason: collision with root package name */
    private final C11686a f93516p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public final C16505B<b> f93517q;

    /* renamed from: r  reason: collision with root package name */
    private final C16519P<b> f93518r;

    /* renamed from: s  reason: collision with root package name */
    private final b f93519s;

    /* renamed from: t  reason: collision with root package name */
    private final K<c> f93520t;

    /* renamed from: u  reason: collision with root package name */
    private final F<c> f93521u;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "homeDeliveryEnabled", "inStoreAvailability", "LXH/N;", "<anonymous>", "(ZZ)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.browseandsearch.plp.impl.ui.AvailabilityViewModel$1", f = "AvailabilityViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.ingka.ikea.browseandsearch.plp.impl.ui.a$a  reason: collision with other inner class name */
    static final class C2082a extends l implements q<Boolean, Boolean, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f93522c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ boolean f93523d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ boolean f93524e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ a f93525f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2082a(a aVar, C17164e<? super C2082a> eVar) {
            super(3, eVar);
            this.f93525f = aVar;
        }

        public final Object i(boolean z10, boolean z11, C17164e<? super C16807N> eVar) {
            C2082a aVar = new C2082a(this.f93525f, eVar);
            aVar.f93523d = z10;
            aVar.f93524e = z11;
            return aVar.invokeSuspend(C16807N.f139792a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return i(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), (C17164e) obj3);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f93522c == 0) {
                y.b(obj);
                this.f93525f.f93517q.setValue(b.b((b) this.f93525f.f93517q.getValue(), this.f93523d, this.f93524e, (String) null, (String) null, 12, (Object) null));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ<\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001b\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/ingka/ikea/browseandsearch/plp/impl/ui/a$b;", "", "", "isHomeDeliveryAvailabilityEnabled", "isInStoreAvailabilityEnabled", "", "postalCode", "storeName", "<init>", "(ZZLjava/lang/String;Ljava/lang/String;)V", "a", "(ZZLjava/lang/String;Ljava/lang/String;)Lcom/ingka/ikea/browseandsearch/plp/impl/ui/a$b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "e", "()Z", "b", "f", "c", "Ljava/lang/String;", "d", "plp-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f93526a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f93527b;

        /* renamed from: c  reason: collision with root package name */
        private final String f93528c;

        /* renamed from: d  reason: collision with root package name */
        private final String f93529d;

        public b() {
            this(false, false, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ b b(b bVar, boolean z10, boolean z11, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = bVar.f93526a;
            }
            if ((i10 & 2) != 0) {
                z11 = bVar.f93527b;
            }
            if ((i10 & 4) != 0) {
                str = bVar.f93528c;
            }
            if ((i10 & 8) != 0) {
                str2 = bVar.f93529d;
            }
            return bVar.a(z10, z11, str, str2);
        }

        public final b a(boolean z10, boolean z11, String str, String str2) {
            return new b(z10, z11, str, str2);
        }

        public final String c() {
            return this.f93528c;
        }

        public final String d() {
            return this.f93529d;
        }

        public final boolean e() {
            return this.f93526a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f93526a == bVar.f93526a && this.f93527b == bVar.f93527b && C17542s.e(this.f93528c, bVar.f93528c) && C17542s.e(this.f93529d, bVar.f93529d);
        }

        public final boolean f() {
            return this.f93527b;
        }

        public int hashCode() {
            int hashCode = ((Boolean.hashCode(this.f93526a) * 31) + Boolean.hashCode(this.f93527b)) * 31;
            String str = this.f93528c;
            int i10 = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f93529d;
            if (str2 != null) {
                i10 = str2.hashCode();
            }
            return hashCode2 + i10;
        }

        public String toString() {
            boolean z10 = this.f93526a;
            boolean z11 = this.f93527b;
            String str = this.f93528c;
            String str2 = this.f93529d;
            return "AvailabilitySelection(isHomeDeliveryAvailabilityEnabled=" + z10 + ", isInStoreAvailabilityEnabled=" + z11 + ", postalCode=" + str + ", storeName=" + str2 + ")";
        }

        public b(boolean z10, boolean z11, String str, String str2) {
            this.f93526a = z10;
            this.f93527b = z11;
            this.f93528c = str;
            this.f93529d = str2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ b(boolean z10, boolean z11, String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : str2);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ingka/ikea/browseandsearch/plp/impl/ui/a$c;", "", "<init>", "(Ljava/lang/String;I)V", "OPEN_ZIP_SELECTOR", "OPEN_STORE_PICKER", "plp-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum c {
        OPEN_ZIP_SELECTOR,
        OPEN_STORE_PICKER;

        static {
            c[] a10;
            $ENTRIES = C17221b.a(a10);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.browseandsearch.plp.impl.ui.AvailabilityViewModel$enableHomeDeliveryAvailability$1", f = "AvailabilityViewModel.kt", l = {98}, m = "invokeSuspend")
    static final class d extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f93530c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a f93531d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f93532e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar, boolean z10, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f93531d = aVar;
            this.f93532e = z10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f93531d, this.f93532e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f93530c;
            if (i10 == 0) {
                y.b(obj);
                C11764d i11 = this.f93531d.f93515o;
                boolean z10 = this.f93532e;
                this.f93530c = 1;
                if (i11.d(z10, this) == f10) {
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
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.browseandsearch.plp.impl.ui.AvailabilityViewModel$enableInStoreAvailability$1", f = "AvailabilityViewModel.kt", l = {109}, m = "invokeSuspend")
    static final class e extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f93533c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a f93534d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f93535e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(a aVar, boolean z10, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f93534d = aVar;
            this.f93535e = z10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new e(this.f93534d, this.f93535e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((e) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f93533c;
            if (i10 == 0) {
                y.b(obj);
                C11764d i11 = this.f93534d.f93515o;
                boolean z10 = this.f93535e;
                this.f93533c = 1;
                if (i11.c(z10, this) == f10) {
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
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.browseandsearch.plp.impl.ui.AvailabilityViewModel$onPostalCodeUpdated$1", f = "AvailabilityViewModel.kt", l = {67, 74}, m = "invokeSuspend")
    static final class f extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f93536c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ UserPostalCodeAddress f93537d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ a f93538e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(UserPostalCodeAddress userPostalCodeAddress, a aVar, C17164e<? super f> eVar) {
            super(2, eVar);
            this.f93537d = userPostalCodeAddress;
            this.f93538e = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new f(this.f93537d, this.f93538e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((f) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0057  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x007b  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0081  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r10.f93536c
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L_0x001f
                if (r1 == r4) goto L_0x001b
                if (r1 != r3) goto L_0x0013
                XH.y.b(r11)
                goto L_0x0053
            L_0x0013:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L_0x001b:
                XH.y.b(r11)
                goto L_0x0040
            L_0x001f:
                XH.y.b(r11)
                com.ingka.ikea.app.base.UserPostalCodeAddress r11 = r10.f93537d
                if (r11 != 0) goto L_0x0035
                com.ingka.ikea.browseandsearch.plp.impl.ui.a r11 = r10.f93538e
                pn.d r11 = r11.f93515o
                r10.f93536c = r4
                java.lang.Object r11 = r11.d(r2, r10)
                if (r11 != r0) goto L_0x0040
                return r0
            L_0x0035:
                com.ingka.ikea.browseandsearch.plp.impl.ui.a r11 = r10.f93538e
                sf.c r11 = r11.f93514n
                com.ingka.ikea.app.base.UserPostalCodeAddress r1 = r10.f93537d
                r11.j(r1)
            L_0x0040:
                com.ingka.ikea.browseandsearch.plp.impl.ui.a r11 = r10.f93538e
                pn.d r11 = r11.f93515o
                TJ.g r11 = r11.g()
                r10.f93536c = r3
                java.lang.Object r11 = TJ.C16534i.D(r11, r10)
                if (r11 != r0) goto L_0x0053
                return r0
            L_0x0053:
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                if (r11 == 0) goto L_0x005b
                boolean r2 = r11.booleanValue()
            L_0x005b:
                r4 = r2
                com.ingka.ikea.browseandsearch.plp.impl.ui.a r11 = r10.f93538e
                TJ.B r11 = r11.f93517q
                com.ingka.ikea.browseandsearch.plp.impl.ui.a r0 = r10.f93538e
                TJ.B r0 = r0.f93517q
                java.lang.Object r0 = r0.getValue()
                r3 = r0
                com.ingka.ikea.browseandsearch.plp.impl.ui.a$b r3 = (com.ingka.ikea.browseandsearch.plp.impl.ui.a.b) r3
                com.ingka.ikea.browseandsearch.plp.impl.ui.a r0 = r10.f93538e
                sf.c r0 = r0.f93514n
                com.ingka.ikea.app.base.UserPostalCodeAddress r0 = r0.l()
                if (r0 == 0) goto L_0x0081
                java.lang.String r0 = r0.d()
            L_0x007f:
                r6 = r0
                goto L_0x0083
            L_0x0081:
                r0 = 0
                goto L_0x007f
            L_0x0083:
                r8 = 10
                r9 = 0
                r5 = 0
                r7 = 0
                com.ingka.ikea.browseandsearch.plp.impl.ui.a$b r0 = com.ingka.ikea.browseandsearch.plp.impl.ui.a.b.b(r3, r4, r5, r6, r7, r8, r9)
                r11.setValue(r0)
                XH.N r11 = XH.C16807N.f139792a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.browseandsearch.plp.impl.ui.a.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.browseandsearch.plp.impl.ui.AvailabilityViewModel$onStoreSelected$1", f = "AvailabilityViewModel.kt", l = {87}, m = "invokeSuspend")
    static final class g extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f93539c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a f93540d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f93541e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(a aVar, boolean z10, C17164e<? super g> eVar) {
            super(2, eVar);
            this.f93540d = aVar;
            this.f93541e = z10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new g(this.f93540d, this.f93541e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((g) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f93539c;
            if (i10 == 0) {
                y.b(obj);
                C11764d i11 = this.f93540d.f93515o;
                boolean z10 = this.f93541e;
                this.f93539c = 1;
                if (i11.c(z10, this) == f10) {
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

    public a(C12860a aVar, C10242c cVar, C11764d dVar, C11686a aVar2) {
        C17542s.j(aVar, "localStoreSelectionRepository");
        C17542s.j(cVar, "appUserDataRepository");
        C17542s.j(dVar, "plpSettingsRepository");
        C17542s.j(aVar2, "analytics");
        this.f93513m = aVar;
        this.f93514n = cVar;
        this.f93515o = dVar;
        this.f93516p = aVar2;
        UserPostalCodeAddress l10 = cVar.l();
        String d10 = l10 != null ? l10.d() : null;
        C12832d c10 = aVar.c();
        C16505B<b> a10 = C16521S.a(new b(false, false, d10, c10 != null ? c10.getName() : null));
        this.f93517q = a10;
        this.f93518r = C16534i.c(a10);
        C16534i.M(C16534i.n(dVar.g(), dVar.f(), new C2082a(this, (C17164e<? super C2082a>) null)), g0.a(this));
        this.f93519s = a10.getValue();
        K<c> k10 = new K<>();
        this.f93520t = k10;
        this.f93521u = k10;
    }

    public final void C(boolean z10) {
        this.f93516p.j(z10);
        String str = null;
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new e(this, z10, (C17164e<? super e>) null), 3, (Object) null);
        C12832d c10 = this.f93513m.c();
        if (c10 != null) {
            str = c10.getName();
        }
        C16505B<b> b10 = this.f93517q;
        b10.setValue(b.b(b10.getValue(), false, z10, (String) null, str, 5, (Object) null));
        if (z10 && str == null) {
            this.f93520t.setValue(c.OPEN_STORE_PICKER);
        }
    }

    public final F<c> D() {
        return this.f93521u;
    }

    public final void E(UserPostalCodeAddress userPostalCodeAddress) {
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new f(userPostalCodeAddress, this, (C17164e<? super f>) null), 3, (Object) null);
    }

    public final void F() {
        C12832d c10 = this.f93513m.c();
        String name = c10 != null ? c10.getName() : null;
        boolean z10 = name != null;
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new g(this, z10, (C17164e<? super g>) null), 3, (Object) null);
        C16505B<b> b10 = this.f93517q;
        b10.setValue(b.b(b10.getValue(), false, z10, (String) null, name, 5, (Object) null));
    }

    public final void k(boolean z10) {
        this.f93516p.h(z10);
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new d(this, z10, (C17164e<? super d>) null), 3, (Object) null);
        C16505B<b> b10 = this.f93517q;
        b10.setValue(b.b(b10.getValue(), z10, false, (String) null, (String) null, 14, (Object) null));
        if (z10 && this.f93514n.l() == null) {
            this.f93520t.setValue(c.OPEN_ZIP_SELECTOR);
        }
    }

    public final C16519P<b> m() {
        return this.f93518r;
    }
}
