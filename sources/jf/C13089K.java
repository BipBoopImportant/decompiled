package JF;

import OE.n;
import XH.C16796C;
import XH.C16807N;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import androidx.core.app.C5147b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\u0007\u001a\u00020\u0006*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a!\u0010\u000b\u001a\u00020\u0006*\u00020\u00002\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\u000b\u0010\f\u001a/\u0010\u0010\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroid/app/Activity;", "", "permission", "LJF/L;", "d", "(Landroid/app/Activity;Ljava/lang/String;)LJF/L;", "LXH/N;", "e", "(Landroid/app/Activity;)V", "Lkotlin/Function0;", "cancel", "i", "(Landroid/app/Activity;LnI/a;)V", "", "title", "message", "f", "(Landroid/app/Activity;IILnI/a;)V", "base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: JF.K  reason: case insensitive filesystem */
public final class C13089K {
    public static final C13090L d(Activity activity, String str) {
        C17542s.j(activity, "<this>");
        C17542s.j(str, "permission");
        return activity.checkSelfPermission(str) == 0 ? C13090L.PERMISSION_GRANTED : C5147b.A(activity, str) ? C13090L.CAN_ASK_PERMISSION : C13090L.PERMISSION_DENIED;
    }

    public static final void e(Activity activity) {
        C17542s.j(activity, "<this>");
        f(activity, n.f113450s0, n.f113246N0, new C13086H(activity));
    }

    public static final void f(Activity activity, int i10, int i11, C17631a<C16807N> aVar) {
        C17542s.j(activity, "<this>");
        C17542s.j(aVar, "cancel");
        String string = activity.getString(i10);
        C17542s.i(string, "getString(...)");
        String string2 = activity.getString(i11);
        C17542s.i(string2, "getString(...)");
        String string3 = activity.getString(n.f113227K);
        C17542s.i(string3, "getString(...)");
        C13084F.p(activity, string, string2, C16796C.a(string3, new C13087I(activity)), C16796C.a(activity.getString(n.f113351e), aVar), false, 16, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final C16807N g(Activity activity) {
        activity.onBackPressed();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N h(Activity activity) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        String packageName = activity.getPackageName();
        Uri parse = Uri.parse("package:" + packageName);
        C17542s.i(parse, "parse(...)");
        intent.setData(parse);
        activity.startActivity(intent);
        return C16807N.f139792a;
    }

    public static final void i(Activity activity, C17631a<C16807N> aVar) {
        C17542s.j(activity, "<this>");
        C17542s.j(aVar, "cancel");
        f(activity, n.f113264Q0, n.f113252O0, aVar);
    }

    public static /* synthetic */ void j(Activity activity, C17631a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            new C13088J
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0006: CONSTRUCTOR  (r1v2 ? I:JF.J) =  call: JF.J.<init>():void type: CONSTRUCTOR in method: JF.K.j(android.app.Activity, nI.a, int, java.lang.Object):void, dex: classes5.dex
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
                JF.J r1 = new JF.J
                r1.<init>()
            L_0x0009:
                i(r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: JF.C13089K.j(android.app.Activity, nI.a, int, java.lang.Object):void");
        }

        /* access modifiers changed from: private */
        public static final C16807N k() {
            return C16807N.f139792a;
        }
    }
