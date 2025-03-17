package rw;

import HJ.C15854t;
import XH.C16807N;
import android.content.Context;
import android.content.res.Resources;
import androidx.fragment.app.C5187o;
import androidx.lifecycle.r;
import androidx.navigation.fragment.a;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;
import uI.C18055d;
import x4.C8951o;
import x4.v;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a1\u0010\u0007\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a9\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\u00042\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001d\u0010\f\u001a\u00020\u0005*\u00020\u00042\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/fragment/app/o;", "", "destination", "Lkotlin/Function1;", "Lx4/o;", "LXH/N;", "block", "d", "(Landroidx/fragment/app/o;Ljava/lang/Object;LnI/l;)Lx4/o;", "navController", "e", "(Lx4/o;Ljava/lang/Object;LnI/l;)Lx4/o;", "b", "(Lx4/o;Ljava/lang/Object;)V", "navigation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class f {
    public static final void b(C8951o oVar, Object obj) {
        C17542s.j(oVar, "<this>");
        v J10 = oVar.J();
        String C10 = J10 != null ? J10.C() : null;
        if (obj instanceof Integer) {
            obj = c(oVar.F(), (Integer) obj);
            Context F10 = oVar.F();
            v J11 = oVar.J();
            C10 = c(F10, J11 != null ? Integer.valueOf(J11.x()) : null);
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Mismatched, wanted: " + obj + " but was: " + C10);
        e eVar = e.ERROR;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a((String) null, illegalArgumentException);
                if (a10 != null) {
                    str = C11820c.a(a10);
                } else {
                    return;
                }
            }
            String str3 = str;
            if (str2 == null) {
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "NavigationExtensions";
            }
            String str4 = str2;
            bVar.a(eVar, str4, false, illegalArgumentException, str3);
            str = str3;
            str2 = str4;
        }
    }

    private static final String c(Context context, Integer num) {
        String str = null;
        if (num == null) {
            return null;
        }
        if (context != null) {
            try {
                Resources resources = context.getResources();
                if (resources != null) {
                    str = resources.getResourceEntryName(num.intValue());
                }
            } catch (Throwable unused) {
                return num.toString();
            }
        }
        return str;
    }

    public static final C8951o d(C5187o oVar, Object obj, C17642l<? super C8951o, C16807N> lVar) {
        Object obj2 = obj;
        C17642l<? super C8951o, C16807N> lVar2 = lVar;
        C17542s.j(oVar, "<this>");
        C17542s.j(obj2, "destination");
        C17542s.j(lVar2, "block");
        int i10 = 2;
        try {
            r.b d10 = oVar.getViewLifecycleOwner().getLifecycle().d();
            if (d10.b(r.b.RESUMED)) {
                return e(a.a(oVar), obj2, lVar2);
            }
            e eVar = e.WARN;
            ArrayList arrayList = new ArrayList();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            Iterator it = arrayList.iterator();
            String str = null;
            String str2 = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C11819b bVar = (C11819b) it.next();
                if (str == null) {
                    String a10 = C11818a.a("Unable to get nav controller, invalid state: " + d10, (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                if (str2 == null) {
                    String name = oVar.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str3 = str2;
                bVar.a(eVar, str3, false, (Throwable) null, str);
                str2 = str3;
            }
            return null;
        } catch (IllegalStateException e10) {
            e eVar2 = e.WARN;
            ArrayList<C11819b> arrayList2 = new ArrayList<>();
            for (Object next2 : d.f102012a.a()) {
                if (((C11819b) next2).b(eVar2, false)) {
                    arrayList2.add(next2);
                }
            }
            String str4 = null;
            String str5 = null;
            for (C11819b bVar2 : arrayList2) {
                if (str4 == null) {
                    String a11 = C11818a.a((String) null, e10);
                    if (a11 == null) {
                        break;
                    }
                    str4 = C11820c.a(a11);
                }
                if (str5 == null) {
                    String name2 = oVar.getClass().getName();
                    C17542s.g(name2);
                    String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, i10, (Object) null), '.', (String) null, i10, (Object) null);
                    if (o13.length() != 0) {
                        name2 = C15854t.P0(o13, "Kt");
                    }
                    str5 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name2;
                }
                bVar2.a(eVar2, str5, false, e10, str4);
                i10 = 2;
            }
        }
    }

    public static final C8951o e(C8951o oVar, Object obj, C17642l<? super C8951o, C16807N> lVar) {
        C17542s.j(oVar, "navController");
        C17542s.j(lVar, "block");
        if (true == (obj instanceof String)) {
            lVar.invoke(oVar);
            return oVar;
        } else if (true == g(oVar, obj)) {
            lVar.invoke(oVar);
            return oVar;
        } else if (true == (obj instanceof C18055d)) {
            lVar.invoke(oVar);
            return oVar;
        } else {
            b(oVar, obj);
            return null;
        }
    }

    public static /* synthetic */ C8951o f(C5187o oVar, Object obj, C17642l lVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            new e
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0006: CONSTRUCTOR  (r2v2 ? I:rw.e) =  call: rw.e.<init>():void type: CONSTRUCTOR in method: rw.f.f(androidx.fragment.app.o, java.lang.Object, nI.l, int, java.lang.Object):x4.o, dex: classes.dex
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
                r3 = r3 & 2
                if (r3 == 0) goto L_0x0009
                rw.e r2 = new rw.e
                r2.<init>()
            L_0x0009:
                x4.o r0 = d(r0, r1, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: rw.f.f(androidx.fragment.app.o, java.lang.Object, nI.l, int, java.lang.Object):x4.o");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
            r1 = r1.J();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static final boolean g(x4.C8951o r1, java.lang.Object r2) {
            /*
                boolean r0 = r2 instanceof java.lang.Integer
                if (r0 == 0) goto L_0x0018
                x4.v r1 = r1.J()
                if (r1 == 0) goto L_0x0018
                int r1 = r1.x()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                if (r1 != r2) goto L_0x0018
                r1 = 1
                goto L_0x0019
            L_0x0018:
                r1 = 0
            L_0x0019:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: rw.f.g(x4.o, java.lang.Object):boolean");
        }

        /* access modifiers changed from: private */
        public static final C16807N h(C8951o oVar) {
            C17542s.j(oVar, "<this>");
            return C16807N.f139792a;
        }
    }
