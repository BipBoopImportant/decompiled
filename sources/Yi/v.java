package yi;

import A4.b;
import XH.C16807N;
import androidx.navigation.fragment.FragmentNavigator;
import androidx.navigation.fragment.c;
import com.ingka.ikea.app.purchasehistory.impl.presentation.ui.CancelOrderReasonDialog;
import com.ingka.ikea.app.purchasehistory.impl.presentation.ui.ExpressReturnsFragment;
import com.ingka.ikea.app.purchasehistory.impl.presentation.ui.OrderLookupFragment;
import com.ingka.ikea.app.purchasehistory.impl.presentation.ui.ProductListBottomSheet;
import com.ingka.ikea.app.purchasehistory.impl.presentation.ui.PurchaseDetailsFragment;
import com.ingka.ikea.app.purchasehistory.impl.presentation.ui.PurchaseHistoryFragment;
import com.ingka.ikea.app.purchasehistory.impl.presentation.ui.RequestAssemblyFragment;
import com.ingka.ikea.app.purchasehistory.impl.presentation.ui.RescheduleOrderDialog;
import com.ingka.ikea.app.purchasehistory.impl.presentation.ui.ShowInvoicesFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import nI.C17642l;
import x4.C8946j;
import x4.F;
import x4.y;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a'\u0010\u0004\u001a\u00020\u0002*\u00020\u00002\u0014\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\u0006\u001a\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\b\u001a\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\b\u0010\u0007\u001a\u0011\u0010\t\u001a\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\t\u0010\u0007\u001a\u0011\u0010\n\u001a\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\n\u0010\u0007\u001a\u0011\u0010\u000b\u001a\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\u000b\u0010\u0007\u001a\u0011\u0010\f\u001a\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\f\u0010\u0007\u001a\u0011\u0010\r\u001a\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\r\u0010\u0007\u001a\u0011\u0010\u000e\u001a\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u0007\u001a\u0011\u0010\u000f\u001a\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u0007¨\u0006\u0010"}, d2 = {"Lx4/y;", "Lkotlin/Function1;", "LXH/N;", "addDestinations", "N", "(Lx4/y;LnI/l;)V", "M", "(Lx4/y;)V", "F", "A", "y", "J", "t", "U", "v", "Q", "purchasehistory-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class v {
    public static final void A(y yVar) {
        C17542s.j(yVar, "<this>");
        c cVar = new c((FragmentNavigator) yVar.l().d(FragmentNavigator.class), "purchaseHistory/order/details?orderId={orderId}&fromConfirmation={fromConfirmation}&type={type}&liteId={liteId}", P.b(PurchaseDetailsFragment.class));
        cVar.a("orderId", new p());
        cVar.a("type", new q());
        cVar.a("liteId", new r());
        cVar.a("fromConfirmation", new s());
        cVar.d("ikea://navigation/purchaseHistory/order/details?orderId={orderId}&fromConfirmation={fromConfirmation}&type={type}&liteId={liteId}");
        yVar.k(cVar);
    }

    /* access modifiers changed from: private */
    public static final C16807N B(C8946j jVar) {
        C17542s.j(jVar, "$this$argument");
        jVar.d(F.f57439n);
        jVar.b(Boolean.FALSE);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N C(C8946j jVar) {
        C17542s.j(jVar, "$this$argument");
        jVar.d(F.f57442q);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N D(C8946j jVar) {
        C17542s.j(jVar, "$this$argument");
        jVar.d(F.f57442q);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N E(C8946j jVar) {
        C17542s.j(jVar, "$this$argument");
        jVar.d(F.f57442q);
        jVar.c(true);
        jVar.b((Object) null);
        return C16807N.f139792a;
    }

    public static final void F(y yVar) {
        C17542s.j(yVar, "<this>");
        c cVar = new c((FragmentNavigator) yVar.l().d(FragmentNavigator.class), "purchaseHistory/order?orderId={orderId}&liteId={liteId}&cc={cc}", P.b(OrderLookupFragment.class));
        cVar.a("orderId", new m());
        cVar.a("liteId", new n());
        cVar.a("cc", new o());
        cVar.d("ikea://navigation/purchaseHistory/order?orderId={orderId}&liteId={liteId}&cc={cc}");
        yVar.k(cVar);
    }

    /* access modifiers changed from: private */
    public static final C16807N G(C8946j jVar) {
        C17542s.j(jVar, "$this$argument");
        jVar.d(F.f57442q);
        jVar.c(true);
        jVar.b((Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N H(C8946j jVar) {
        C17542s.j(jVar, "$this$argument");
        jVar.d(F.f57442q);
        jVar.c(true);
        jVar.b((Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N I(C8946j jVar) {
        C17542s.j(jVar, "$this$argument");
        jVar.d(F.f57442q);
        jVar.c(true);
        return C16807N.f139792a;
    }

    public static final void J(y yVar) {
        C17542s.j(yVar, "<this>");
        A4.c cVar = new A4.c((b) yVar.l().d(b.class), "purchaseHistory/order/list?orderId={orderId}&deliveryMethodId={deliveryMethodId}", P.b(ProductListBottomSheet.class));
        cVar.a("orderId", new j());
        cVar.a("deliveryMethodId", new k());
        cVar.d("ikea://navigation/purchaseHistory/order/list?orderId={orderId}&deliveryMethodId={deliveryMethodId}");
        yVar.k(cVar);
    }

    /* access modifiers changed from: private */
    public static final C16807N K(C8946j jVar) {
        C17542s.j(jVar, "$this$argument");
        jVar.d(F.f57442q);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N L(C8946j jVar) {
        C17542s.j(jVar, "$this$argument");
        jVar.d(F.f57442q);
        jVar.c(true);
        jVar.b((Object) null);
        return C16807N.f139792a;
    }

    public static final void M(y yVar) {
        C17542s.j(yVar, "<this>");
        c cVar = new c((FragmentNavigator) yVar.l().d(FragmentNavigator.class), "purchaseHistory/purchases", P.b(PurchaseHistoryFragment.class));
        cVar.d("ikea://navigation/purchaseHistory/purchases");
        yVar.k(cVar);
    }

    public static final void N(y yVar, C17642l<? super y, C16807N> lVar) {
        C17542s.j(yVar, "<this>");
        C17542s.j(lVar, "addDestinations");
        y yVar2 = new y(yVar.l(), "purchaseHistory/purchases", "purchaseHistory");
        M(yVar2);
        F(yVar2);
        A(yVar2);
        y(yVar2);
        J(yVar2);
        t(yVar2);
        U(yVar2);
        v(yVar2);
        Q(yVar2);
        lVar.invoke(yVar2);
        yVar.k(yVar2);
    }

    public static /* synthetic */ void O(y yVar, C17642l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            new l
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0006: CONSTRUCTOR  (r1v2 ? I:yi.l) =  call: yi.l.<init>():void type: CONSTRUCTOR in method: yi.v.O(x4.y, nI.l, int, java.lang.Object):void, dex: classes4.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r1v2 ?
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	... 34 more
                */
            /*
                r2 = r2 & 1
                if (r2 == 0) goto L_0x0009
                yi.l r1 = new yi.l
                r1.<init>()
            L_0x0009:
                N(r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: yi.v.O(x4.y, nI.l, int, java.lang.Object):void");
        }

        /* access modifiers changed from: private */
        public static final C16807N P(y yVar) {
            C17542s.j(yVar, "<this>");
            return C16807N.f139792a;
        }

        public static final void Q(y yVar) {
            C17542s.j(yVar, "<this>");
            c cVar = new c((FragmentNavigator) yVar.l().d(FragmentNavigator.class), "purchaseHistory/requestAssembly?type={type}&orderId={orderId}&liteId={liteId}", P.b(RequestAssemblyFragment.class));
            cVar.a("type", new u());
            cVar.a("orderId", new d());
            cVar.a("liteId", new e());
            cVar.d("ikea://navigation/purchaseHistory/requestAssembly?type={type}&orderId={orderId}&liteId={liteId}");
            yVar.k(cVar);
        }

        /* access modifiers changed from: private */
        public static final C16807N R(C8946j jVar) {
            C17542s.j(jVar, "$this$argument");
            jVar.d(F.f57442q);
            jVar.c(true);
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N S(C8946j jVar) {
            C17542s.j(jVar, "$this$argument");
            jVar.d(F.f57442q);
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N T(C8946j jVar) {
            C17542s.j(jVar, "$this$argument");
            jVar.d(F.f57442q);
            jVar.c(true);
            return C16807N.f139792a;
        }

        public static final void U(y yVar) {
            C17542s.j(yVar, "<this>");
            A4.c cVar = new A4.c((b) yVar.l().d(b.class), "purchaseHistory/order/reschedule?orderId={orderId}&deliveryNumber={deliveryNumber}", P.b(RescheduleOrderDialog.class));
            cVar.a("orderId", new f());
            cVar.a("deliveryNumber", new g());
            cVar.d("ikea://navigation/purchaseHistory/order/reschedule?orderId={orderId}&deliveryNumber={deliveryNumber}");
            yVar.k(cVar);
        }

        /* access modifiers changed from: private */
        public static final C16807N V(C8946j jVar) {
            C17542s.j(jVar, "$this$argument");
            jVar.d(F.f57442q);
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N W(C8946j jVar) {
            C17542s.j(jVar, "$this$argument");
            jVar.d(F.f57442q);
            jVar.c(true);
            jVar.b((Object) null);
            return C16807N.f139792a;
        }

        public static final void t(y yVar) {
            C17542s.j(yVar, "<this>");
            A4.c cVar = new A4.c((b) yVar.l().d(b.class), "purchaseHistory/order/cancel?cancelOrderId={cancelOrderId}", P.b(CancelOrderReasonDialog.class));
            cVar.a("cancelOrderId", new t());
            cVar.d("ikea://navigation/purchaseHistory/order/cancel?cancelOrderId={cancelOrderId}");
            yVar.k(cVar);
        }

        /* access modifiers changed from: private */
        public static final C16807N u(C8946j jVar) {
            C17542s.j(jVar, "$this$argument");
            jVar.d(F.f57442q);
            return C16807N.f139792a;
        }

        public static final void v(y yVar) {
            C17542s.j(yVar, "<this>");
            c cVar = new c((FragmentNavigator) yVar.l().d(FragmentNavigator.class), "purchaseHistory/returns?orderId={orderId}&liteId={liteId}", P.b(ExpressReturnsFragment.class));
            cVar.a("orderId", new h());
            cVar.a("liteId", new i());
            cVar.d("ikea://navigation/purchaseHistory/returns?orderId={orderId}&liteId={liteId}");
            yVar.k(cVar);
        }

        /* access modifiers changed from: private */
        public static final C16807N w(C8946j jVar) {
            C17542s.j(jVar, "$this$argument");
            jVar.d(F.f57442q);
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N x(C8946j jVar) {
            C17542s.j(jVar, "$this$argument");
            jVar.d(F.f57442q);
            jVar.c(true);
            return C16807N.f139792a;
        }

        public static final void y(y yVar) {
            C17542s.j(yVar, "<this>");
            c cVar = new c((FragmentNavigator) yVar.l().d(FragmentNavigator.class), "purchaseHistory/order/details/invoices?orderId={orderId}", P.b(ShowInvoicesFragment.class));
            cVar.a("orderId", new c());
            cVar.d("ikea://navigation/purchaseHistory/order/details/invoices?orderId={orderId}");
            yVar.k(cVar);
        }

        /* access modifiers changed from: private */
        public static final C16807N z(C8946j jVar) {
            C17542s.j(jVar, "$this$argument");
            jVar.d(F.f57442q);
            return C16807N.f139792a;
        }
    }
