package sl;

import U0.C4889m;
import U0.C4894o0;
import U0.M0;
import XH.C16807N;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.NumberPicker;
import androidx.compose.ui.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import rl.C11831a;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aW\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e²\u0006\u000e\u0010\r\u001a\u00020\u00008\n@\nX\u0002"}, d2 = {"", "initialValue", "Lkotlin/Function1;", "LXH/N;", "onNewValueSelected", "Lkotlin/Function0;", "onDismissRequest", "Landroidx/compose/ui/d;", "modifier", "maxPickerValue", "minPickerValue", "c", "(ILnI/l;LnI/a;Landroidx/compose/ui/d;IILU0/m;II)V", "selectedValue", "uicomposables_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class s {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f102516a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f102517b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f102518c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C4894o0 f102519d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: sl.s$a$a  reason: collision with other inner class name */
        /* synthetic */ class C2445a extends C17540p implements q<LayoutInflater, ViewGroup, Boolean, C11831a> {

            /* renamed from: a  reason: collision with root package name */
            public static final C2445a f102520a = new C2445a();

            C2445a() {
                super(3, C11831a.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/ingka/ikea/app/uicomposables/databinding/NumberPickerDialogBinding;", 0);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return t((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
            }

            public final C11831a t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
                C17542s.j(layoutInflater, "p0");
                return C11831a.c(layoutInflater, viewGroup, z10);
            }
        }

        a(int i10, int i11, int i12, C4894o0 o0Var) {
            this.f102516a = i10;
            this.f102517b = i11;
            this.f102518c = i12;
            this.f102519d = o0Var;
        }

        /* access modifiers changed from: private */
        public static final C16807N e(int i10, int i11, int i12, C4894o0 o0Var, C11831a aVar) {
            C17542s.j(aVar, "$this$AndroidViewBinding");
            NumberPicker numberPicker = aVar.f102031b;
            numberPicker.setMaxValue(i10);
            numberPicker.setMinValue(i11);
            numberPicker.setValue(i12);
            numberPicker.setWrapSelectorWheel(false);
            numberPicker.setOnValueChangedListener(new r(o0Var));
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final void f(C4894o0 o0Var, NumberPicker numberPicker, int i10, int i11) {
            s.e(o0Var, i11);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: nI.l} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void c(U0.C4889m r9, int r10) {
            /*
                r8 = this;
                r0 = r10 & 3
                r1 = 2
                if (r0 != r1) goto L_0x0011
                boolean r0 = r9.l()
                if (r0 != 0) goto L_0x000c
                goto L_0x0011
            L_0x000c:
                r9.L()
                goto L_0x0098
            L_0x0011:
                boolean r0 = U0.C4895p.J()
                if (r0 == 0) goto L_0x0020
                r0 = -1
                java.lang.String r1 = "com.ingka.ikea.app.uicomposables.dialog.NumberPickerDialog.<anonymous> (NumberPickerDialog.kt:67)"
                r2 = 1220909283(0x48c598e3, float:404679.1)
                U0.C4895p.S(r2, r10, r0, r1)
            L_0x0020:
                r10 = -1734144784(0xffffffff98a30cf0, float:-4.2147576E-24)
                r9.W(r10)
                java.lang.Object r10 = r9.D()
                U0.m$a r0 = U0.C4889m.f14007a
                java.lang.Object r1 = r0.a()
                if (r10 != r1) goto L_0x0037
                sl.s$a$a r10 = sl.s.a.C2445a.f102520a
                r9.u(r10)
            L_0x0037:
                uI.h r10 = (uI.C18059h) r10
                r9.P()
                r1 = r10
                nI.q r1 = (nI.q) r1
                androidx.compose.ui.d$a r10 = androidx.compose.ui.d.f18749a
                r2 = 160(0xa0, float:2.24E-43)
                float r2 = (float) r2
                float r2 = c2.h.B(r2)
                androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.i(r10, r2)
                r10 = -1734141458(0xffffffff98a319ee, float:-4.2160695E-24)
                r9.W(r10)
                int r10 = r8.f102516a
                boolean r10 = r9.d(r10)
                int r3 = r8.f102517b
                boolean r3 = r9.d(r3)
                r10 = r10 | r3
                int r3 = r8.f102518c
                boolean r3 = r9.d(r3)
                r10 = r10 | r3
                int r3 = r8.f102516a
                int r4 = r8.f102517b
                int r5 = r8.f102518c
                U0.o0 r6 = r8.f102519d
                java.lang.Object r7 = r9.D()
                if (r10 != 0) goto L_0x007a
                java.lang.Object r10 = r0.a()
                if (r7 != r10) goto L_0x0082
            L_0x007a:
                sl.q r7 = new sl.q
                r7.<init>(r3, r4, r5, r6)
                r9.u(r7)
            L_0x0082:
                r3 = r7
                nI.l r3 = (nI.C17642l) r3
                r9.P()
                r5 = 54
                r6 = 0
                r4 = r9
                androidx.compose.ui.viewinterop.a.a(r1, r2, r3, r4, r5, r6)
                boolean r9 = U0.C4895p.J()
                if (r9 == 0) goto L_0x0098
                U0.C4895p.R()
            L_0x0098:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: sl.s.a.c(U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            c((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(int r20, nI.C17642l<? super java.lang.Integer, XH.C16807N> r21, nI.C17631a<XH.C16807N> r22, androidx.compose.ui.d r23, int r24, int r25, U0.C4889m r26, int r27, int r28) {
        /*
            r1 = r20
            r2 = r21
            r14 = r22
            r15 = r27
            java.lang.String r0 = "onNewValueSelected"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            java.lang.String r0 = "onDismissRequest"
            kotlin.jvm.internal.C17542s.j(r14, r0)
            r0 = -1103224201(0xffffffffbe3e2277, float:-0.18567835)
            r3 = r26
            U0.m r13 = r3.k(r0)
            r3 = r28 & 1
            r4 = 4
            if (r3 == 0) goto L_0x0023
            r3 = r15 | 6
            goto L_0x0033
        L_0x0023:
            r3 = r15 & 6
            if (r3 != 0) goto L_0x0032
            boolean r3 = r13.d(r1)
            if (r3 == 0) goto L_0x002f
            r3 = r4
            goto L_0x0030
        L_0x002f:
            r3 = 2
        L_0x0030:
            r3 = r3 | r15
            goto L_0x0033
        L_0x0032:
            r3 = r15
        L_0x0033:
            r5 = r28 & 2
            if (r5 == 0) goto L_0x003a
            r3 = r3 | 48
            goto L_0x004a
        L_0x003a:
            r5 = r15 & 48
            if (r5 != 0) goto L_0x004a
            boolean r5 = r13.F(r2)
            if (r5 == 0) goto L_0x0047
            r5 = 32
            goto L_0x0049
        L_0x0047:
            r5 = 16
        L_0x0049:
            r3 = r3 | r5
        L_0x004a:
            r5 = r28 & 4
            if (r5 == 0) goto L_0x0051
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x0061
        L_0x0051:
            r5 = r15 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x0061
            boolean r5 = r13.F(r14)
            if (r5 == 0) goto L_0x005e
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r3 = r3 | r5
        L_0x0061:
            r5 = r28 & 8
            if (r5 == 0) goto L_0x006a
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0067:
            r8 = r23
            goto L_0x007c
        L_0x006a:
            r8 = r15 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x0067
            r8 = r23
            boolean r9 = r13.V(r8)
            if (r9 == 0) goto L_0x0079
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r3 = r3 | r9
        L_0x007c:
            r9 = r28 & 16
            if (r9 == 0) goto L_0x0085
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0082:
            r10 = r24
            goto L_0x0097
        L_0x0085:
            r10 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r10 != 0) goto L_0x0082
            r10 = r24
            boolean r11 = r13.d(r10)
            if (r11 == 0) goto L_0x0094
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0096
        L_0x0094:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x0096:
            r3 = r3 | r11
        L_0x0097:
            r11 = r28 & 32
            r12 = 196608(0x30000, float:2.75506E-40)
            if (r11 == 0) goto L_0x00a1
            r3 = r3 | r12
        L_0x009e:
            r12 = r25
            goto L_0x00b3
        L_0x00a1:
            r12 = r12 & r15
            if (r12 != 0) goto L_0x009e
            r12 = r25
            boolean r16 = r13.d(r12)
            if (r16 == 0) goto L_0x00af
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b1
        L_0x00af:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00b1:
            r3 = r3 | r16
        L_0x00b3:
            r16 = 74899(0x12493, float:1.04956E-40)
            r7 = r3 & r16
            r6 = 74898(0x12492, float:1.04954E-40)
            if (r7 != r6) goto L_0x00ce
            boolean r6 = r13.l()
            if (r6 != 0) goto L_0x00c4
            goto L_0x00ce
        L_0x00c4:
            r13.L()
            r4 = r8
            r5 = r10
            r6 = r12
            r16 = r13
            goto L_0x01a9
        L_0x00ce:
            if (r5 == 0) goto L_0x00d5
            androidx.compose.ui.d$a r5 = androidx.compose.ui.d.f18749a
            r17 = r5
            goto L_0x00d7
        L_0x00d5:
            r17 = r8
        L_0x00d7:
            if (r9 == 0) goto L_0x00dc
            r5 = 999(0x3e7, float:1.4E-42)
            r10 = r5
        L_0x00dc:
            if (r11 == 0) goto L_0x00df
            r12 = 1
        L_0x00df:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x00eb
            r6 = -1
            java.lang.String r7 = "com.ingka.ikea.app.uicomposables.dialog.NumberPickerDialog (NumberPickerDialog.kt:46)"
            U0.C4895p.S(r0, r3, r6, r7)
        L_0x00eb:
            r0 = -522405093(0xffffffffe0dcbb1b, float:-1.2724269E20)
            r13.W(r0)
            java.lang.Object r0 = r13.D()
            U0.m$a r6 = U0.C4889m.f14007a
            java.lang.Object r7 = r6.a()
            if (r0 != r7) goto L_0x0104
            U0.o0 r0 = U0.C4877g1.a(r20)
            r13.u(r0)
        L_0x0104:
            U0.o0 r0 = (U0.C4894o0) r0
            r13.P()
            int r7 = Oo.b.f84596b7
            r8 = 0
            java.lang.String r7 = J1.j.b(r7, r13, r8)
            int r9 = Oo.b.f84616d5
            java.lang.String r9 = J1.j.b(r9, r13, r8)
            r11 = -522395877(0xffffffffe0dcdf1b, float:-1.2732375E20)
            r13.W(r11)
            r11 = r3 & 14
            if (r11 != r4) goto L_0x0122
            r4 = 1
            goto L_0x0123
        L_0x0122:
            r4 = r8
        L_0x0123:
            r11 = r3 & 112(0x70, float:1.57E-43)
            r5 = 32
            if (r11 != r5) goto L_0x012b
            r5 = 1
            goto L_0x012c
        L_0x012b:
            r5 = r8
        L_0x012c:
            r4 = r4 | r5
            r5 = r3 & 896(0x380, float:1.256E-42)
            r11 = 256(0x100, float:3.59E-43)
            if (r5 != r11) goto L_0x0135
            r5 = 1
            goto L_0x0136
        L_0x0135:
            r5 = r8
        L_0x0136:
            r4 = r4 | r5
            java.lang.Object r5 = r13.D()
            if (r4 != 0) goto L_0x0143
            java.lang.Object r4 = r6.a()
            if (r5 != r4) goto L_0x014b
        L_0x0143:
            sl.o r5 = new sl.o
            r5.<init>(r1, r2, r14, r0)
            r13.u(r5)
        L_0x014b:
            nI.a r5 = (nI.C17631a) r5
            r13.P()
            SC.W1 r4 = new SC.W1
            r4.<init>(r9, r5)
            SC.W1 r5 = new SC.W1
            int r6 = Oo.b.f84518U0
            java.lang.String r6 = J1.j.b(r6, r13, r8)
            r5.<init>(r6, r14)
            sl.s$a r6 = new sl.s$a
            r6.<init>(r10, r12, r1, r0)
            r0 = 54
            r8 = 1220909283(0x48c598e3, float:404679.1)
            r9 = 1
            c1.a r0 = c1.c.e(r8, r9, r6, r13, r0)
            int r6 = SC.W1.f116045c
            int r8 = r6 << 3
            r9 = 12582912(0xc00000, float:1.7632415E-38)
            r8 = r8 | r9
            int r6 = r6 << 6
            r6 = r6 | r8
            int r3 = r3 << 3
            r8 = r3 & 7168(0x1c00, float:1.0045E-41)
            r6 = r6 | r8
            r8 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r8
            r16 = r6 | r3
            r18 = 96
            r8 = 0
            r9 = 0
            r3 = r7
            r6 = r22
            r7 = r17
            r19 = r10
            r10 = r0
            r11 = r13
            r0 = r12
            r12 = r16
            r16 = r13
            r13 = r18
            SC.Z1.c(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x01a4
            U0.C4895p.R()
        L_0x01a4:
            r6 = r0
            r4 = r17
            r5 = r19
        L_0x01a9:
            U0.Y0 r9 = r16.n()
            if (r9 == 0) goto L_0x01c2
            sl.p r10 = new sl.p
            r0 = r10
            r1 = r20
            r2 = r21
            r3 = r22
            r7 = r27
            r8 = r28
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.a(r10)
        L_0x01c2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sl.s.c(int, nI.l, nI.a, androidx.compose.ui.d, int, int, U0.m, int, int):void");
    }

    private static final int d(C4894o0 o0Var) {
        return o0Var.e();
    }

    /* access modifiers changed from: private */
    public static final void e(C4894o0 o0Var, int i10) {
        o0Var.g(i10);
    }

    /* access modifiers changed from: private */
    public static final C16807N f(int i10, C17642l lVar, C17631a aVar, C4894o0 o0Var) {
        if (d(o0Var) != i10) {
            lVar.invoke(Integer.valueOf(d(o0Var)));
        } else {
            aVar.invoke();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N g(int i10, C17642l lVar, C17631a aVar, d dVar, int i11, int i12, int i13, int i14, C4889m mVar, int i15) {
        c(i10, lVar, aVar, dVar, i11, i12, mVar, M0.a(i13 | 1), i14);
        return C16807N.f139792a;
    }
}
