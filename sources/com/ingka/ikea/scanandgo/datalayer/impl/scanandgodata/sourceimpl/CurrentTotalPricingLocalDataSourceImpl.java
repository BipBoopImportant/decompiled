package com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.sourceimpl;

import R2.h;
import TJ.C16532g;
import TJ.C16533h;
import W2.f;
import W2.i;
import XH.C16807N;
import XH.y;
import com.optimizely.ab.config.FeatureVariable;
import dI.C17164e;
import eI.C17187b;
import fK.p;
import iK.C17395d;
import jK.C17438C;
import jK.E0;
import jK.T0;
import kK.C17514c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kz.C14741d;
import rz.E;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0002\u000f\u0014B!\b\u0007\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH@¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/sourceimpl/CurrentTotalPricingLocalDataSourceImpl;", "Lkz/d;", "LR2/h;", "LW2/f;", "dataStore", "LkK/c;", "json", "<init>", "(LR2/h;LkK/c;)V", "Lrz/E;", "currentTotalPricing", "LXH/N;", "b", "(Lrz/E;LdI/e;)Ljava/lang/Object;", "LTJ/g;", "a", "()LTJ/g;", "LR2/h;", "LkK/c;", "c", "TotalPricingModel", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CurrentTotalPricingLocalDataSourceImpl implements C14741d {

    /* renamed from: c  reason: collision with root package name */
    public static final a f120126c = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final h<f> f120127a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C17514c f120128b;

    @p
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u0000 %2\u00020\u0001:\u0002&\u001eB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B5\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b\"\u0010!R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010#\u001a\u0004\b\u001e\u0010$¨\u0006'"}, d2 = {"Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/sourceimpl/CurrentTotalPricingLocalDataSourceImpl$TotalPricingModel;", "", "", "totalPriceInclVat", "totalPriceExclVat", "familyUpsellDiscount", "<init>", "(DDLjava/lang/Double;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(IDDLjava/lang/Double;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "d", "(Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/sourceimpl/CurrentTotalPricingLocalDataSourceImpl$TotalPricingModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "c", "()D", "b", "Ljava/lang/Double;", "()Ljava/lang/Double;", "Companion", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TotalPricingModel {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final double f120129a;

        /* renamed from: b  reason: collision with root package name */
        private final double f120130b;

        /* renamed from: c  reason: collision with root package name */
        private final Double f120131c;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/sourceimpl/CurrentTotalPricingLocalDataSourceImpl$TotalPricingModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/sourceimpl/CurrentTotalPricingLocalDataSourceImpl$TotalPricingModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<TotalPricingModel> serializer() {
                return CurrentTotalPricingLocalDataSourceImpl$TotalPricingModel$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ TotalPricingModel(int i10, double d10, double d11, Double d12, T0 t02) {
            if (7 != (i10 & 7)) {
                E0.b(i10, 7, CurrentTotalPricingLocalDataSourceImpl$TotalPricingModel$$serializer.INSTANCE.getDescriptor());
            }
            this.f120129a = d10;
            this.f120130b = d11;
            this.f120131c = d12;
        }

        public static final /* synthetic */ void d(TotalPricingModel totalPricingModel, C17395d dVar, SerialDescriptor serialDescriptor) {
            dVar.E(serialDescriptor, 0, totalPricingModel.f120129a);
            dVar.E(serialDescriptor, 1, totalPricingModel.f120130b);
            dVar.B(serialDescriptor, 2, C17438C.f144010a, totalPricingModel.f120131c);
        }

        public final Double a() {
            return this.f120131c;
        }

        public final double b() {
            return this.f120130b;
        }

        public final double c() {
            return this.f120129a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TotalPricingModel)) {
                return false;
            }
            TotalPricingModel totalPricingModel = (TotalPricingModel) obj;
            return Double.compare(this.f120129a, totalPricingModel.f120129a) == 0 && Double.compare(this.f120130b, totalPricingModel.f120130b) == 0 && C17542s.e(this.f120131c, totalPricingModel.f120131c);
        }

        public int hashCode() {
            int hashCode = ((Double.hashCode(this.f120129a) * 31) + Double.hashCode(this.f120130b)) * 31;
            Double d10 = this.f120131c;
            return hashCode + (d10 == null ? 0 : d10.hashCode());
        }

        public String toString() {
            double d10 = this.f120129a;
            double d11 = this.f120130b;
            Double d12 = this.f120131c;
            return "TotalPricingModel(totalPriceInclVat=" + d10 + ", totalPriceExclVat=" + d11 + ", familyUpsellDiscount=" + d12 + ")";
        }

        public TotalPricingModel(double d10, double d11, Double d12) {
            this.f120129a = d10;
            this.f120130b = d11;
            this.f120131c = d12;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/sourceimpl/CurrentTotalPricingLocalDataSourceImpl$a;", "", "<init>", "()V", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements C16532g<E> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f120132a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CurrentTotalPricingLocalDataSourceImpl f120133b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f120134a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ CurrentTotalPricingLocalDataSourceImpl f120135b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.sourceimpl.CurrentTotalPricingLocalDataSourceImpl$getCurrentTotalPricing$$inlined$map$1$2", f = "CurrentTotalPricingLocalDataSourceImpl.kt", l = {50}, m = "emit")
            /* renamed from: com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.sourceimpl.CurrentTotalPricingLocalDataSourceImpl$b$a$a  reason: collision with other inner class name */
            public static final class C2998a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f120136c;

                /* renamed from: d  reason: collision with root package name */
                int f120137d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f120138e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2998a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f120138e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f120136c = obj;
                    this.f120137d |= Integer.MIN_VALUE;
                    return this.f120138e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar, CurrentTotalPricingLocalDataSourceImpl currentTotalPricingLocalDataSourceImpl) {
                this.f120134a = hVar;
                this.f120135b = currentTotalPricingLocalDataSourceImpl;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r11, dI.C17164e r12) {
                /*
                    r10 = this;
                    boolean r0 = r12 instanceof com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.sourceimpl.CurrentTotalPricingLocalDataSourceImpl.b.a.C2998a
                    if (r0 == 0) goto L_0x0013
                    r0 = r12
                    com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.sourceimpl.CurrentTotalPricingLocalDataSourceImpl$b$a$a r0 = (com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.sourceimpl.CurrentTotalPricingLocalDataSourceImpl.b.a.C2998a) r0
                    int r1 = r0.f120137d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f120137d = r1
                    goto L_0x0018
                L_0x0013:
                    com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.sourceimpl.CurrentTotalPricingLocalDataSourceImpl$b$a$a r0 = new com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.sourceimpl.CurrentTotalPricingLocalDataSourceImpl$b$a$a
                    r0.<init>(r10, r12)
                L_0x0018:
                    java.lang.Object r12 = r0.f120136c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f120137d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r12)
                    goto L_0x0075
                L_0x0029:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r12)
                    throw r11
                L_0x0031:
                    XH.y.b(r12)
                    TJ.h r12 = r10.f120134a
                    W2.f r11 = (W2.f) r11
                    java.lang.String r2 = "total_pricing_model"
                    W2.f$a r2 = W2.h.g(r2)
                    java.lang.Object r11 = r11.b(r2)
                    java.lang.String r11 = (java.lang.String) r11
                    if (r11 == 0) goto L_0x006b
                    com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.sourceimpl.CurrentTotalPricingLocalDataSourceImpl r2 = r10.f120135b
                    kK.c r2 = r2.f120128b
                    com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.sourceimpl.CurrentTotalPricingLocalDataSourceImpl$TotalPricingModel$a r4 = com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.sourceimpl.CurrentTotalPricingLocalDataSourceImpl.TotalPricingModel.Companion
                    kotlinx.serialization.KSerializer r4 = r4.serializer()
                    java.lang.Object r11 = r2.c(r4, r11)
                    com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.sourceimpl.CurrentTotalPricingLocalDataSourceImpl$TotalPricingModel r11 = (com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.sourceimpl.CurrentTotalPricingLocalDataSourceImpl.TotalPricingModel) r11
                    rz.E r2 = new rz.E
                    double r5 = r11.c()
                    double r7 = r11.b()
                    java.lang.Double r9 = r11.a()
                    r4 = r2
                    r4.<init>(r5, r7, r9)
                    goto L_0x006c
                L_0x006b:
                    r2 = 0
                L_0x006c:
                    r0.f120137d = r3
                    java.lang.Object r11 = r12.emit(r2, r0)
                    if (r11 != r1) goto L_0x0075
                    return r1
                L_0x0075:
                    XH.N r11 = XH.C16807N.f139792a
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.sourceimpl.CurrentTotalPricingLocalDataSourceImpl.b.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public b(C16532g gVar, CurrentTotalPricingLocalDataSourceImpl currentTotalPricingLocalDataSourceImpl) {
            this.f120132a = gVar;
            this.f120133b = currentTotalPricingLocalDataSourceImpl;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f120132a.collect(new a(hVar, this.f120133b), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LW2/c;", "preferences", "LXH/N;", "<anonymous>", "(LW2/c;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.sourceimpl.CurrentTotalPricingLocalDataSourceImpl$saveCurrentTotalPricingAndFamilyUpsell$2", f = "CurrentTotalPricingLocalDataSourceImpl.kt", l = {}, m = "invokeSuspend")
    static final class c extends l implements nI.p<W2.c, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f120139c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f120140d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CurrentTotalPricingLocalDataSourceImpl f120141e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ E f120142f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(CurrentTotalPricingLocalDataSourceImpl currentTotalPricingLocalDataSourceImpl, E e10, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f120141e = currentTotalPricingLocalDataSourceImpl;
            this.f120142f = e10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            c cVar = new c(this.f120141e, this.f120142f, eVar);
            cVar.f120140d = obj;
            return cVar;
        }

        public final Object invoke(W2.c cVar, C17164e<? super C16807N> eVar) {
            return ((c) create(cVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f120139c == 0) {
                y.b(obj);
                ((W2.c) this.f120140d).j(W2.h.g("total_pricing_model"), this.f120141e.f120128b.b(TotalPricingModel.Companion.serializer(), new TotalPricingModel(this.f120142f.c(), this.f120142f.b(), this.f120142f.a())));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public CurrentTotalPricingLocalDataSourceImpl(h<f> hVar, C17514c cVar) {
        C17542s.j(hVar, "dataStore");
        C17542s.j(cVar, FeatureVariable.JSON_TYPE);
        this.f120127a = hVar;
        this.f120128b = cVar;
    }

    public C16532g<E> a() {
        return new b(this.f120127a.getData(), this);
    }

    public Object b(E e10, C17164e<? super C16807N> eVar) {
        Object a10 = i.a(this.f120127a, new c(this, e10, (C17164e<? super c>) null), eVar);
        return a10 == C17187b.f() ? a10 : C16807N.f139792a;
    }
}
