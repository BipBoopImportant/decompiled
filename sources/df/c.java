package Df;

import XH.C16807N;
import androidx.navigation.fragment.FragmentNavigator;
import com.ingka.ikea.app.browseandsearch.browseV2.BrowseFragmentV2;
import com.ingka.ikea.app.browseandsearch.searchv2.SearchFragmentV2;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import nI.C17642l;
import x4.y;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a'\u0010\u0004\u001a\u00020\u0002*\u00020\u00002\u0014\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\u0006\u001a\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\b\u001a\u00020\u0002*\u00020\u0000H\u0002¢\u0006\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lx4/y;", "Lkotlin/Function1;", "LXH/N;", "addDestinations", "b", "(Lx4/y;LnI/l;)V", "f", "(Lx4/y;)V", "e", "browse-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c {
    public static final void b(y yVar, C17642l<? super y, C16807N> lVar) {
        C17542s.j(yVar, "<this>");
        C17542s.j(lVar, "addDestinations");
        y yVar2 = new y(yVar.l(), "browse/browse_page", "browse");
        e(yVar2);
        f(yVar2);
        lVar.invoke(yVar2);
        yVar.k(yVar2);
    }

    public static /* synthetic */ void c(y yVar, C17642l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            new b
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0006: CONSTRUCTOR  (r1v2 ? I:Df.b) =  call: Df.b.<init>():void type: CONSTRUCTOR in method: Df.c.c(x4.y, nI.l, int, java.lang.Object):void, dex: classes3.dex
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
                Df.b r1 = new Df.b
                r1.<init>()
            L_0x0009:
                b(r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Df.c.c(x4.y, nI.l, int, java.lang.Object):void");
        }

        /* access modifiers changed from: private */
        public static final C16807N d(y yVar) {
            C17542s.j(yVar, "<this>");
            return C16807N.f139792a;
        }

        private static final void e(y yVar) {
            androidx.navigation.fragment.c cVar = new androidx.navigation.fragment.c((FragmentNavigator) yVar.l().d(FragmentNavigator.class), "browse/browse_page", P.b(BrowseFragmentV2.class));
            cVar.d("ikea://navigation/browse/browse_page");
            yVar.k(cVar);
        }

        public static final void f(y yVar) {
            C17542s.j(yVar, "<this>");
            androidx.navigation.fragment.c cVar = new androidx.navigation.fragment.c((FragmentNavigator) yVar.l().d(FragmentNavigator.class), "browse/search_page", P.b(SearchFragmentV2.class));
            cVar.d("ikea://navigation/browse/search_page?inboxUnreadCount={inboxUnreadCount}");
            yVar.k(cVar);
        }
    }
