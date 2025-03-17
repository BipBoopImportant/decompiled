package Ar;

import HJ.C15854t;
import XH.C16807N;
import android.content.Context;
import android.view.View;
import com.google.android.material.snackbar.Snackbar;
import com.sugarcube.core.logger.DslKt;
import fI.C17221b;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.C17642l;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001:\u0001\rJU\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&¢\u0006\u0004\b\r\u0010\u000eJi\u0010\u0014\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u000f2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\n0\u0011H&¢\u0006\u0004\b\u0014\u0010\u0015J\u0010!\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\b\u0001\u0010\u0018\u001a\u00020\u00042\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00042\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00102\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\tH&¢\u0006\u0004\b!\u0010\"J}\u0010#\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0018\u001a\u00020\u00102\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00042\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00102\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\tH&¢\u0006\u0004\b#\u0010$¨\u0006%"}, d2 = {"LAr/j;", "", "Landroid/view/View;", "rootView", "", "message", "actionText", "length", "anchorView", "Lkotlin/Function0;", "LXH/N;", "onAction", "Lcom/google/android/material/snackbar/Snackbar;", "b", "(Landroid/view/View;IIILandroid/view/View;LnI/a;)Lcom/google/android/material/snackbar/Snackbar;", "", "", "Lkotlin/Function1;", "LAr/j$b;", "onDismissed", "c", "(Landroid/view/View;Ljava/lang/CharSequence;Ljava/lang/String;ILandroid/view/View;LnI/a;LnI/l;)Lcom/google/android/material/snackbar/Snackbar;", "Landroid/content/Context;", "context", "title", "description", "", "cancelable", "positiveButtonText", "positiveAction", "negativeButtonText", "negativeAction", "dismissedAction", "a", "(Landroid/content/Context;ILjava/lang/Integer;ZILnI/a;Ljava/lang/String;LnI/a;LnI/a;)V", "d", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZILnI/a;Ljava/lang/String;LnI/a;LnI/a;)V", "feedback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface j {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ void j(j jVar, Context context, int i10, Integer num, boolean z10, int i11, C17631a aVar, String str, C17631a aVar2, C17631a aVar3, int i12, Object obj) {
            int i13 = i12;
            if (obj == null) {
                jVar.a(context, i10, (i13 & 4) != 0 ? null : num, (i13 & 8) != 0 ? true : z10, (i13 & 16) != 0 ? Oo.b.f84616d5 : i11, (i13 & 32) != 0 ? new a() : aVar, (i13 & 64) != 0 ? null : str, (i13 & 128) != 0 ? new b() : aVar2, (i13 & 256) != 0 ? new c() : aVar3);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showDialog");
        }

        public static /* synthetic */ void k(j jVar, Context context, String str, String str2, boolean z10, int i10, C17631a aVar, String str3, C17631a aVar2, C17631a aVar3, int i11, Object obj) {
            int i12 = i11;
            if (obj == null) {
                jVar.d(context, str, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? true : z10, (i12 & 16) != 0 ? Oo.b.f84616d5 : i10, (i12 & 32) != 0 ? new g() : aVar, (i12 & 64) != 0 ? null : str3, (i12 & 128) != 0 ? new h() : aVar2, (i12 & 256) != 0 ? new i() : aVar3);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showDialog");
        }

        /* access modifiers changed from: private */
        public static C16807N l() {
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static C16807N m() {
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static C16807N n() {
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static C16807N o() {
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static C16807N p() {
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static C16807N q() {
            return C16807N.f139792a;
        }

        public static /* synthetic */ Snackbar r(j jVar, View view, int i10, int i11, int i12, View view2, C17631a aVar, int i13, Object obj) {
            if (obj == null) {
                if ((i13 & 4) != 0) {
                    i11 = Oo.b.f84330B2;
                }
                int i14 = i11;
                if ((i13 & 8) != 0) {
                    i12 = 0;
                }
                int i15 = i12;
                if ((i13 & 16) != 0) {
                    view2 = null;
                }
                View view3 = view2;
                if ((i13 & 32) != 0) {
                    new d
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001b: CONSTRUCTOR  (r13v2 ? I:Ar.d) =  call: Ar.d.<init>():void type: CONSTRUCTOR in method: Ar.j.a.r(Ar.j, android.view.View, int, int, int, android.view.View, nI.a, int, java.lang.Object):com.google.android.material.snackbar.Snackbar, dex: classes4.dex
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
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r13v2 ?
                        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                        	... 56 more
                        */
                    /*
                        if (r15 != 0) goto L_0x0027
                        r15 = r14 & 4
                        if (r15 == 0) goto L_0x0008
                        int r10 = Oo.b.f84330B2
                    L_0x0008:
                        r3 = r10
                        r10 = r14 & 8
                        if (r10 == 0) goto L_0x000e
                        r11 = 0
                    L_0x000e:
                        r4 = r11
                        r10 = r14 & 16
                        if (r10 == 0) goto L_0x0014
                        r12 = 0
                    L_0x0014:
                        r5 = r12
                        r10 = r14 & 32
                        if (r10 == 0) goto L_0x001e
                        Ar.d r13 = new Ar.d
                        r13.<init>()
                    L_0x001e:
                        r6 = r13
                        r0 = r7
                        r1 = r8
                        r2 = r9
                        com.google.android.material.snackbar.Snackbar r7 = r0.b(r1, r2, r3, r4, r5, r6)
                        return r7
                    L_0x0027:
                        java.lang.UnsupportedOperationException r7 = new java.lang.UnsupportedOperationException
                        java.lang.String r8 = "Super calls with default arguments not supported in this target, function: showSnackBar"
                        r7.<init>(r8)
                        throw r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: Ar.j.a.r(Ar.j, android.view.View, int, int, int, android.view.View, nI.a, int, java.lang.Object):com.google.android.material.snackbar.Snackbar");
                }

                public static /* synthetic */ Snackbar s(j jVar, View view, CharSequence charSequence, String str, int i10, View view2, C17631a aVar, C17642l lVar, int i11, Object obj) {
                    if (obj == null) {
                        return jVar.c(view, charSequence, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? 0 : i10, (i11 & 16) != 0 ? null : view2, (i11 & 32) != 0 ? new e() : aVar, (i11 & 64) != 0 ? new f() : lVar);
                    }
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showSnackBar");
                }

                /* access modifiers changed from: private */
                public static C16807N t() {
                    return C16807N.f139792a;
                }

                /* access modifiers changed from: private */
                public static C16807N u() {
                    return C16807N.f139792a;
                }

                /* access modifiers changed from: private */
                public static C16807N v(b bVar) {
                    C17542s.j(bVar, "it");
                    return C16807N.f139792a;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"LAr/j$b;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "Swipe", "Action", "Timeout", "Manual", "Consecutive", "Unknown", "feedback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public enum b {
                Swipe,
                Action,
                Timeout,
                Manual,
                Consecutive,
                Unknown;
                
                public static final a Companion = null;

                @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LAr/j$b$a;", "", "<init>", "()V", "", "event", "LAr/j$b;", "a", "(I)LAr/j$b;", "feedback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                public static final class a {
                    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final b a(int i10) {
                        int i11 = i10;
                        if (i11 == 0) {
                            return b.Swipe;
                        }
                        if (i11 == 1) {
                            return b.Action;
                        }
                        if (i11 == 2) {
                            return b.Timeout;
                        }
                        if (i11 == 3) {
                            return b.Manual;
                        }
                        if (i11 == 4) {
                            return b.Consecutive;
                        }
                        b bVar = b.Unknown;
                        a aVar = b.Companion;
                        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unknown event: " + i11);
                        e eVar = e.ERROR;
                        ArrayList<C11819b> arrayList = new ArrayList<>();
                        for (Object next : d.f102012a.a()) {
                            if (((C11819b) next).b(eVar, false)) {
                                arrayList.add(next);
                            }
                        }
                        String str = null;
                        String str2 = null;
                        for (C11819b bVar2 : arrayList) {
                            if (str == null) {
                                String a10 = C11818a.a((String) null, illegalArgumentException);
                                if (a10 == null) {
                                    return bVar;
                                }
                                str = C11820c.a(a10);
                            }
                            String str3 = str;
                            if (str2 == null) {
                                String name = aVar.getClass().getName();
                                C17542s.g(name);
                                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                                if (o12.length() != 0) {
                                    name = C15854t.P0(o12, "Kt");
                                }
                                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                            }
                            String str4 = str2;
                            bVar2.a(eVar, str4, false, illegalArgumentException, str3);
                            str = str3;
                            str2 = str4;
                        }
                        return bVar;
                    }

                    private a() {
                    }
                }

                static {
                    b[] a10;
                    $ENTRIES = C17221b.a(a10);
                    Companion = new a((DefaultConstructorMarker) null);
                }
            }

            void a(Context context, int i10, Integer num, boolean z10, int i11, C17631a<C16807N> aVar, String str, C17631a<C16807N> aVar2, C17631a<C16807N> aVar3);

            Snackbar b(View view, int i10, int i11, int i12, View view2, C17631a<C16807N> aVar);

            Snackbar c(View view, CharSequence charSequence, String str, int i10, View view2, C17631a<C16807N> aVar, C17642l<? super b, C16807N> lVar);

            void d(Context context, String str, String str2, boolean z10, int i10, C17631a<C16807N> aVar, String str3, C17631a<C16807N> aVar2, C17631a<C16807N> aVar3);
        }
