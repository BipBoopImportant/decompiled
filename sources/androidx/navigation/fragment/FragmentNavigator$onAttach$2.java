package androidx.navigation.fragment;

import android.util.Log;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.FragmentManager;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import x4.C8948l;
import x4.K;

@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"androidx/navigation/fragment/FragmentNavigator$onAttach$2", "Landroidx/fragment/app/FragmentManager$p;", "LXH/N;", "n0", "()V", "Landroidx/fragment/app/o;", "fragment", "", "pop", "i", "(Landroidx/fragment/app/o;Z)V", "g", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FragmentNavigator$onAttach$2 implements FragmentManager.p {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ K f43462a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ FragmentNavigator f43463b;

    FragmentNavigator$onAttach$2(K k10, FragmentNavigator fragmentNavigator) {
        this.f43462a = k10;
        this.f43463b = fragmentNavigator;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: XH.v} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: XH.v} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: XH.v} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: XH.v} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void g(androidx.fragment.app.C5187o r11, boolean r12) {
        /*
            r10 = this;
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.C17542s.j(r11, r0)
            x4.K r0 = r10.f43462a
            TJ.P r0 = r0.b()
            java.lang.Object r0 = r0.getValue()
            java.util.Collection r0 = (java.util.Collection) r0
            x4.K r1 = r10.f43462a
            TJ.P r1 = r1.c()
            java.lang.Object r1 = r1.getValue()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.List r0 = YH.C16877v.V0(r0, r1)
            int r1 = r0.size()
            java.util.ListIterator r0 = r0.listIterator(r1)
        L_0x0029:
            boolean r1 = r0.hasPrevious()
            r2 = 0
            if (r1 == 0) goto L_0x0046
            java.lang.Object r1 = r0.previous()
            r3 = r1
            x4.l r3 = (x4.C8948l) r3
            java.lang.String r3 = r3.f()
            java.lang.String r4 = r11.getTag()
            boolean r3 = kotlin.jvm.internal.C17542s.e(r3, r4)
            if (r3 == 0) goto L_0x0029
            goto L_0x0047
        L_0x0046:
            r1 = r2
        L_0x0047:
            x4.l r1 = (x4.C8948l) r1
            r0 = 1
            r3 = 0
            if (r12 == 0) goto L_0x0061
            androidx.navigation.fragment.FragmentNavigator r4 = r10.f43463b
            java.util.List r4 = r4.x()
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x0061
            boolean r4 = r11.isRemoving()
            if (r4 == 0) goto L_0x0061
            r4 = r0
            goto L_0x0062
        L_0x0061:
            r4 = r3
        L_0x0062:
            androidx.navigation.fragment.FragmentNavigator r5 = r10.f43463b
            java.util.List r5 = r5.x()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L_0x006e:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x008a
            java.lang.Object r6 = r5.next()
            r7 = r6
            XH.v r7 = (XH.v) r7
            java.lang.Object r7 = r7.c()
            java.lang.String r8 = r11.getTag()
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r8)
            if (r7 == 0) goto L_0x006e
            r2 = r6
        L_0x008a:
            XH.v r2 = (XH.v) r2
            if (r2 == 0) goto L_0x0097
            androidx.navigation.fragment.FragmentNavigator r5 = r10.f43463b
            java.util.List r5 = r5.x()
            r5.remove(r2)
        L_0x0097:
            java.lang.String r5 = "OnBackStackChangedCommitted for fragment "
            java.lang.String r6 = "FragmentNavigator"
            r7 = 2
            if (r4 != 0) goto L_0x00c0
            androidx.navigation.fragment.FragmentNavigator r8 = r10.f43463b
            boolean r8 = r8.y(r7)
            if (r8 == 0) goto L_0x00c0
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r5)
            r8.append(r11)
            java.lang.String r9 = " associated with entry "
            r8.append(r9)
            r8.append(r1)
            java.lang.String r8 = r8.toString()
            android.util.Log.v(r6, r8)
        L_0x00c0:
            if (r2 == 0) goto L_0x00cf
            java.lang.Object r2 = r2.d()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != r0) goto L_0x00cf
            goto L_0x00d0
        L_0x00cf:
            r0 = r3
        L_0x00d0:
            if (r12 != 0) goto L_0x00f7
            if (r0 != 0) goto L_0x00f7
            if (r1 == 0) goto L_0x00d7
            goto L_0x00f7
        L_0x00d7:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "The fragment "
            r12.append(r0)
            r12.append(r11)
            java.lang.String r11 = " is unknown to the FragmentNavigator. Please use the navigate() function to add fragments to the FragmentNavigator managed FragmentManager."
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r11 = r11.toString()
            r12.<init>(r11)
            throw r12
        L_0x00f7:
            if (r1 == 0) goto L_0x012e
            androidx.navigation.fragment.FragmentNavigator r12 = r10.f43463b
            x4.K r0 = r10.f43462a
            r12.s(r11, r1, r0)
            if (r4 == 0) goto L_0x012e
            androidx.navigation.fragment.FragmentNavigator r12 = r10.f43463b
            boolean r12 = r12.y(r7)
            if (r12 == 0) goto L_0x0129
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r5)
            r12.append(r11)
            java.lang.String r11 = " popping associated entry "
            r12.append(r11)
            r12.append(r1)
            java.lang.String r11 = " via system back"
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            android.util.Log.v(r6, r11)
        L_0x0129:
            x4.K r11 = r10.f43462a
            r11.i(r1, r3)
        L_0x012e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.fragment.FragmentNavigator$onAttach$2.g(androidx.fragment.app.o, boolean):void");
    }

    public void i(C5187o oVar, boolean z10) {
        Object obj;
        C17542s.j(oVar, "fragment");
        if (z10) {
            List value = this.f43462a.b().getValue();
            ListIterator listIterator = value.listIterator(value.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                }
                obj = listIterator.previous();
                if (C17542s.e(((C8948l) obj).f(), oVar.getTag())) {
                    break;
                }
            }
            C8948l lVar = (C8948l) obj;
            if (this.f43463b.y(2)) {
                Log.v("FragmentNavigator", "OnBackStackChangedStarted for fragment " + oVar + " associated with entry " + lVar);
            }
            if (lVar != null) {
                this.f43462a.j(lVar);
            }
        }
    }

    public void n0() {
    }
}
