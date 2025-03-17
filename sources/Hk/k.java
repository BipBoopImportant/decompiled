package hK;

import HJ.C15854t;
import XH.C16807N;
import YH.C16870n;
import hK.m;
import jK.Q0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.descriptors.SerialDescriptor;
import nI.C17642l;

@Metadata(d1 = {"\u00000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a?\u0010\t\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u00032\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\n\u001a\u001d\u0010\r\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e\u001a\u001d\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001aI\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00122\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u00032\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0007¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"", "serialName", "", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "typeParameters", "Lkotlin/Function1;", "LhK/a;", "LXH/N;", "builderAction", "d", "(Ljava/lang/String;[Lkotlinx/serialization/descriptors/SerialDescriptor;LnI/l;)Lkotlinx/serialization/descriptors/SerialDescriptor;", "LhK/e;", "kind", "b", "(Ljava/lang/String;LhK/e;)Lkotlinx/serialization/descriptors/SerialDescriptor;", "original", "c", "(Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/descriptors/SerialDescriptor;", "LhK/l;", "builder", "e", "(Ljava/lang/String;LhK/l;[Lkotlinx/serialization/descriptors/SerialDescriptor;LnI/l;)Lkotlinx/serialization/descriptors/SerialDescriptor;", "kotlinx-serialization-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class k {
    public static final SerialDescriptor b(String str, C17339e eVar) {
        C17542s.j(str, "serialName");
        C17542s.j(eVar, "kind");
        if (!C15854t.v0(str)) {
            return Q0.a(str, eVar);
        }
        throw new IllegalArgumentException("Blank serial names are prohibited");
    }

    public static final SerialDescriptor c(String str, SerialDescriptor serialDescriptor) {
        C17542s.j(str, "serialName");
        C17542s.j(serialDescriptor, "original");
        if (C15854t.v0(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        } else if (!C17542s.e(str, serialDescriptor.i())) {
            if (serialDescriptor.h() instanceof C17339e) {
                Q0.c(str);
            }
            return new n(str, serialDescriptor);
        } else {
            throw new IllegalArgumentException(("The name of the wrapped descriptor (" + str + ") cannot be the same as the name of the original descriptor (" + serialDescriptor.i() + ')').toString());
        }
    }

    public static final SerialDescriptor d(String str, SerialDescriptor[] serialDescriptorArr, C17642l<? super C17335a, C16807N> lVar) {
        C17542s.j(str, "serialName");
        C17542s.j(serialDescriptorArr, "typeParameters");
        C17542s.j(lVar, "builderAction");
        if (!C15854t.v0(str)) {
            C17335a aVar = new C17335a(str);
            lVar.invoke(aVar);
            return new h(str, m.a.f143470a, aVar.f().size(), C16870n.c1(serialDescriptorArr), aVar);
        }
        throw new IllegalArgumentException("Blank serial names are prohibited");
    }

    public static final SerialDescriptor e(String str, l lVar, SerialDescriptor[] serialDescriptorArr, C17642l<? super C17335a, C16807N> lVar2) {
        C17542s.j(str, "serialName");
        C17542s.j(lVar, "kind");
        C17542s.j(serialDescriptorArr, "typeParameters");
        C17542s.j(lVar2, "builder");
        if (C15854t.v0(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        } else if (!C17542s.e(lVar, m.a.f143470a)) {
            C17335a aVar = new C17335a(str);
            lVar2.invoke(aVar);
            return new h(str, lVar, aVar.f().size(), C16870n.c1(serialDescriptorArr), aVar);
        } else {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
    }

    public static /* synthetic */ SerialDescriptor f(String str, l lVar, SerialDescriptor[] serialDescriptorArr, C17642l lVar2, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            new j
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0006: CONSTRUCTOR  (r3v2 ? I:hK.j) =  call: hK.j.<init>():void type: CONSTRUCTOR in method: hK.k.f(java.lang.String, hK.l, kotlinx.serialization.descriptors.SerialDescriptor[], nI.l, int, java.lang.Object):kotlinx.serialization.descriptors.SerialDescriptor, dex: classes6.dex
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
                r4 = r4 & 8
                if (r4 == 0) goto L_0x0009
                hK.j r3 = new hK.j
                r3.<init>()
            L_0x0009:
                kotlinx.serialization.descriptors.SerialDescriptor r0 = e(r0, r1, r2, r3)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: hK.k.f(java.lang.String, hK.l, kotlinx.serialization.descriptors.SerialDescriptor[], nI.l, int, java.lang.Object):kotlinx.serialization.descriptors.SerialDescriptor");
        }

        /* access modifiers changed from: private */
        public static final C16807N g(C17335a aVar) {
            C17542s.j(aVar, "<this>");
            return C16807N.f139792a;
        }
    }
