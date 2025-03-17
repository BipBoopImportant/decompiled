package zs;

import A4.b;
import XH.C16807N;
import androidx.navigation.fragment.FragmentNavigator;
import androidx.navigation.fragment.c;
import com.ingka.ikea.inbox.impl.fragment.InboxFragment;
import com.ingka.ikea.inbox.impl.fragment.NotificationDetailsFragment;
import com.ingka.ikea.inbox.impl.fragment.NotificationPermissionDialog;
import com.ingka.ikea.inbox.impl.fragment.NotificationSettingsFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import nI.C17642l;
import x4.C8946j;
import x4.F;
import x4.y;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a'\u0010\u0004\u001a\u00020\u0002*\u00020\u00002\u0014\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\u0006\u001a\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\b\u001a\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\b\u0010\u0007\u001a\u0011\u0010\t\u001a\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\t\u0010\u0007\u001a\u0011\u0010\n\u001a\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\n\u0010\u0007¨\u0006\u000b"}, d2 = {"Lx4/y;", "Lkotlin/Function1;", "LXH/N;", "addDestinations", "g", "(Lx4/y;LnI/l;)V", "n", "(Lx4/y;)V", "j", "e", "m", "inbox-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class f {
    public static final void e(y yVar) {
        C17542s.j(yVar, "<this>");
        c cVar = new c((FragmentNavigator) yVar.l().d(FragmentNavigator.class), "inbox_page", P.b(InboxFragment.class));
        cVar.d("ikea://navigation/inbox_page");
        cVar.a("click_analytics_key", new d());
        yVar.k(cVar);
    }

    /* access modifiers changed from: private */
    public static final C16807N f(C8946j jVar) {
        C17542s.j(jVar, "$this$argument");
        jVar.d(F.f57442q);
        jVar.b((Object) null);
        jVar.c(true);
        return C16807N.f139792a;
    }

    public static final void g(y yVar, C17642l<? super y, C16807N> lVar) {
        C17542s.j(yVar, "<this>");
        C17542s.j(lVar, "addDestinations");
        y yVar2 = new y(yVar.l(), "inbox_page", "inbox");
        e(yVar2);
        n(yVar2);
        j(yVar2);
        m(yVar2);
        lVar.invoke(yVar2);
        yVar.k(yVar2);
    }

    public static /* synthetic */ void h(y yVar, C17642l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            new e
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0006: CONSTRUCTOR  (r1v2 ? I:zs.e) =  call: zs.e.<init>():void type: CONSTRUCTOR in method: zs.f.h(x4.y, nI.l, int, java.lang.Object):void, dex: classes4.dex
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
                zs.e r1 = new zs.e
                r1.<init>()
            L_0x0009:
                g(r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: zs.f.h(x4.y, nI.l, int, java.lang.Object):void");
        }

        /* access modifiers changed from: private */
        public static final C16807N i(y yVar) {
            C17542s.j(yVar, "<this>");
            return C16807N.f139792a;
        }

        public static final void j(y yVar) {
            C17542s.j(yVar, "<this>");
            c cVar = new c((FragmentNavigator) yVar.l().d(FragmentNavigator.class), "notification_details?id_key={id_key}&feature_key={feature_key}", P.b(NotificationDetailsFragment.class));
            cVar.d("ikea://navigation/inbox_page/notification_details?id_key={id_key}&feature_key={feature_key}");
            cVar.a("id_key", new C12552b());
            cVar.a("feature_key", new C12553c());
            yVar.k(cVar);
        }

        /* access modifiers changed from: private */
        public static final C16807N k(C8946j jVar) {
            C17542s.j(jVar, "$this$argument");
            jVar.d(F.f57442q);
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N l(C8946j jVar) {
            C17542s.j(jVar, "$this$argument");
            jVar.d(F.f57442q);
            return C16807N.f139792a;
        }

        public static final void m(y yVar) {
            C17542s.j(yVar, "<this>");
            yVar.k(new A4.c((b) yVar.l().d(b.class), "notification_permission", P.b(NotificationPermissionDialog.class)));
        }

        public static final void n(y yVar) {
            C17542s.j(yVar, "<this>");
            yVar.k(new c((FragmentNavigator) yVar.l().d(FragmentNavigator.class), "notification_settings", P.b(NotificationSettingsFragment.class)));
        }
    }
