package ds;

import XH.C16807N;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import vg.g;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J?\u0010\f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH&¢\u0006\u0004\b\f\u0010\rJ7\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lds/c;", "", "Landroid/widget/ImageView;", "imageView", "", "imageUrl", "Lvg/g$b;", "imageSize", "Lkotlin/Function1;", "Lvg/g$a;", "LXH/N;", "editBlock", "a", "(Landroid/widget/ImageView;Ljava/lang/String;Lvg/g$b;LnI/l;)V", "", "imageResource", "c", "(Landroid/widget/ImageView;ILnI/l;)V", "b", "(Landroid/widget/ImageView;)V", "imageloader_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ds.c  reason: case insensitive filesystem */
public interface C11239c {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ds.c$a */
    public static final class a {
        public static /* synthetic */ void c(C11239c cVar, ImageView imageView, int i10, C17642l lVar, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 4) != 0) {
                    new C11238b
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0008: CONSTRUCTOR  (r3v2 ? I:ds.b) =  call: ds.b.<init>():void type: CONSTRUCTOR in method: ds.c.a.c(ds.c, android.widget.ImageView, int, nI.l, int, java.lang.Object):void, dex: classes4.dex
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
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
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
                        	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
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
                        	... 56 more
                        */
                    /*
                        if (r5 != 0) goto L_0x000f
                        r4 = r4 & 4
                        if (r4 == 0) goto L_0x000b
                        ds.b r3 = new ds.b
                        r3.<init>()
                    L_0x000b:
                        r0.c(r1, r2, r3)
                        return
                    L_0x000f:
                        java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                        java.lang.String r1 = "Super calls with default arguments not supported in this target, function: load"
                        r0.<init>(r1)
                        throw r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: ds.C11239c.a.c(ds.c, android.widget.ImageView, int, nI.l, int, java.lang.Object):void");
                }

                public static /* synthetic */ void d(C11239c cVar, ImageView imageView, String str, g.b bVar, C17642l lVar, int i10, Object obj) {
                    if (obj == null) {
                        if ((i10 & 4) != 0) {
                            bVar = g.b.XXXL;
                        }
                        if ((i10 & 8) != 0) {
                            new C11237a
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000e: CONSTRUCTOR  (r4v2 ? I:ds.a) =  call: ds.a.<init>():void type: CONSTRUCTOR in method: ds.c.a.d(ds.c, android.widget.ImageView, java.lang.String, vg.g$b, nI.l, int, java.lang.Object):void, dex: classes4.dex
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
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
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
                                	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
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
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r4v2 ?
                                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                	... 56 more
                                */
                            /*
                                if (r6 != 0) goto L_0x0015
                                r6 = r5 & 4
                                if (r6 == 0) goto L_0x0008
                                vg.g$b r3 = vg.g.b.XXXL
                            L_0x0008:
                                r5 = r5 & 8
                                if (r5 == 0) goto L_0x0011
                                ds.a r4 = new ds.a
                                r4.<init>()
                            L_0x0011:
                                r0.a(r1, r2, r3, r4)
                                return
                            L_0x0015:
                                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                                java.lang.String r1 = "Super calls with default arguments not supported in this target, function: load"
                                r0.<init>(r1)
                                throw r0
                            */
                            throw new UnsupportedOperationException("Method not decompiled: ds.C11239c.a.d(ds.c, android.widget.ImageView, java.lang.String, vg.g$b, nI.l, int, java.lang.Object):void");
                        }

                        /* access modifiers changed from: private */
                        public static C16807N e(g.a aVar) {
                            C17542s.j(aVar, "<this>");
                            return C16807N.f139792a;
                        }

                        /* access modifiers changed from: private */
                        public static C16807N f(g.a aVar) {
                            C17542s.j(aVar, "<this>");
                            return C16807N.f139792a;
                        }
                    }

                    void a(ImageView imageView, String str, g.b bVar, C17642l<? super g.a, C16807N> lVar);

                    void b(ImageView imageView);

                    void c(ImageView imageView, int i10, C17642l<? super g.a, C16807N> lVar);
                }
