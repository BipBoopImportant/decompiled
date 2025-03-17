package sj;

import Ar.j;
import Ez.f;
import HJ.C15854t;
import Oo.b;
import XH.C16807N;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.C5197z;
import com.google.android.material.snackbar.Snackbar;
import com.ingka.ikea.app.scanandgoonlineredesign.dialog.ArticleNumberBottomSheetDialog;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\f\u001a\u00020\u0003*\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\nH\u0000¢\u0006\u0004\b\f\u0010\r\u001aC\u0010\u0014\u001a\u0004\u0018\u00010\u0013*\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u0001H\u0000¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/fragment/app/o;", "Lkotlin/Function1;", "", "LXH/N;", "onResult", "h", "(Landroidx/fragment/app/o;LnI/l;)V", "LAr/j;", "Landroid/content/Context;", "context", "Lkotlin/Function0;", "onDismiss", "j", "(LAr/j;Landroid/content/Context;LnI/a;)V", "Landroid/view/View;", "root", "onAction", "LAr/j$b;", "onDismissed", "Lcom/google/android/material/snackbar/Snackbar;", "d", "(LAr/j;Landroid/view/View;LnI/a;LnI/l;)Lcom/google/android/material/snackbar/Snackbar;", "scanandgo-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: sj.d  reason: case insensitive filesystem */
public final class C11853d {
    public static final Snackbar d(j jVar, View view, C17631a<C16807N> aVar, C17642l<? super j.b, C16807N> lVar) {
        C17542s.j(jVar, "<this>");
        C17542s.j(view, "root");
        C17542s.j(aVar, "onAction");
        C17542s.j(lVar, "onDismissed");
        String string = view.getContext().getString(f.f109676P);
        C17542s.i(string, "getString(...)");
        return j.a.s(jVar, view, string, view.getContext().getString(b.f84616d5), 0, (View) null, aVar, lVar, 16, (Object) null);
    }

    public static /* synthetic */ Snackbar e(j jVar, View view, C17631a aVar, C17642l lVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            new C11850a
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0006: CONSTRUCTOR  (r2v2 ? I:sj.a) =  call: sj.a.<init>():void type: CONSTRUCTOR in method: sj.d.e(Ar.j, android.view.View, nI.a, nI.l, int, java.lang.Object):com.google.android.material.snackbar.Snackbar, dex: classes4.dex
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
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r2v2 ?
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	... 34 more
                */
            /*
                r5 = r4 & 2
                if (r5 == 0) goto L_0x0009
                sj.a r2 = new sj.a
                r2.<init>()
            L_0x0009:
                r4 = r4 & 4
                if (r4 == 0) goto L_0x0012
                sj.b r3 = new sj.b
                r3.<init>()
            L_0x0012:
                com.google.android.material.snackbar.Snackbar r0 = d(r0, r1, r2, r3)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: sj.C11853d.e(Ar.j, android.view.View, nI.a, nI.l, int, java.lang.Object):com.google.android.material.snackbar.Snackbar");
        }

        /* access modifiers changed from: private */
        public static final C16807N f() {
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N g(j.b bVar) {
            C17542s.j(bVar, "it");
            return C16807N.f139792a;
        }

        public static final void h(C5187o oVar, C17642l<? super String, C16807N> lVar) {
            C17542s.j(oVar, "<this>");
            C17542s.j(lVar, "onResult");
            C5197z.d(oVar, "ANBS_fragment_result_key", new C11852c(lVar, oVar, "ANBS_fragment_result_key"));
            new ArticleNumberBottomSheetDialog().show(oVar.getParentFragmentManager(), (String) null);
        }

        /* access modifiers changed from: private */
        public static final C16807N i(C17642l lVar, C5187o oVar, String str, String str2, Bundle bundle) {
            C17542s.j(str2, "<unused var>");
            C17542s.j(bundle, "bundle");
            if (bundle.isEmpty()) {
                lVar.invoke(null);
                return C16807N.f139792a;
            }
            String string = bundle.getString("ANBS_result_an_key");
            if (string == null || C15854t.v0(string)) {
                IllegalStateException illegalStateException = new IllegalStateException("Null or blank article number in result is not allowed");
                e eVar = e.ERROR;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                String str3 = null;
                String str4 = null;
                for (C11819b bVar : arrayList) {
                    if (str3 == null) {
                        String a10 = C11818a.a((String) null, illegalStateException);
                        if (a10 == null) {
                            break;
                        }
                        str3 = C11820c.a(a10);
                    }
                    if (str4 == null) {
                        String name = oVar.getClass().getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str5 = str4;
                    bVar.a(eVar, str5, false, illegalStateException, str3);
                    str4 = str5;
                }
                return C16807N.f139792a;
            }
            lVar.invoke(string);
            C5197z.b(oVar, str);
            return C16807N.f139792a;
        }

        public static final void j(j jVar, Context context, C17631a<C16807N> aVar) {
            C17542s.j(jVar, "<this>");
            C17542s.j(context, "context");
            C17542s.j(aVar, "onDismiss");
            String string = context.getString(f.f109668H);
            C17542s.i(string, "getString(...)");
            j.a.k(jVar, context, string, context.getString(f.f109667G), false, 0, aVar, (String) null, (C17631a) null, (C17631a) null, 464, (Object) null);
        }
    }
