package Ds;

import HJ.C15854t;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import kotlin.Metadata;
import nI.C17631a;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lqv/e;", "priority", "", "cause", "", "sensitive", "Lkotlin/Function0;", "", "message", "LXH/N;", "b", "(Lqv/e;Ljava/lang/Throwable;ZLnI/a;)V", "inbox-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class n {
    private static final void b(e eVar, Throwable th2, boolean z10, C17631a<String> aVar) {
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : d.f102012a.a()) {
            if (((C11819b) next).b(eVar, z10)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a(aVar.invoke(), th2);
                if (a10 != null) {
                    str = C11820c.a(a10);
                } else {
                    return;
                }
            }
            if (str2 == null) {
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "InboxViewModel";
            }
            bVar.a(eVar, str2, z10, th2, str);
        }
    }

    static /* synthetic */ void c(e eVar, Throwable th2, boolean z10, C17631a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            eVar = e.DEBUG;
        }
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        if ((i10 & 8) != 0) {
            new m
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0016: CONSTRUCTOR  (r3v2 ? I:Ds.m) =  call: Ds.m.<init>():void type: CONSTRUCTOR in method: Ds.n.c(qv.e, java.lang.Throwable, boolean, nI.a, int, java.lang.Object):void, dex: classes4.dex
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
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r3v2 ?
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	... 34 more
                */
            /*
                r5 = r4 & 1
                if (r5 == 0) goto L_0x0006
                qv.e r0 = qv.e.DEBUG
            L_0x0006:
                r5 = r4 & 2
                if (r5 == 0) goto L_0x000b
                r1 = 0
            L_0x000b:
                r5 = r4 & 4
                if (r5 == 0) goto L_0x0010
                r2 = 0
            L_0x0010:
                r4 = r4 & 8
                if (r4 == 0) goto L_0x0019
                Ds.m r3 = new Ds.m
                r3.<init>()
            L_0x0019:
                b(r0, r1, r2, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Ds.n.c(qv.e, java.lang.Throwable, boolean, nI.a, int, java.lang.Object):void");
        }

        /* access modifiers changed from: private */
        public static final String d() {
            return "";
        }
    }
