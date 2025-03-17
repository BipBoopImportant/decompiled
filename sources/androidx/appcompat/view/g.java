package androidx.appcompat.view;

import I2.A;
import I2.C4599b;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.MenuItemWrapperICS;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.widget.M;
import androidx.appcompat.widget.y;
import androidx.recyclerview.widget.RecyclerView;
import i.C5430j;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import z2.C6275a;

public class g extends MenuInflater {

    /* renamed from: e  reason: collision with root package name */
    static final Class<?>[] f15662e;

    /* renamed from: f  reason: collision with root package name */
    static final Class<?>[] f15663f;

    /* renamed from: a  reason: collision with root package name */
    final Object[] f15664a;

    /* renamed from: b  reason: collision with root package name */
    final Object[] f15665b;

    /* renamed from: c  reason: collision with root package name */
    Context f15666c;

    /* renamed from: d  reason: collision with root package name */
    private Object f15667d;

    private static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c  reason: collision with root package name */
        private static final Class<?>[] f15668c = {MenuItem.class};

        /* renamed from: a  reason: collision with root package name */
        private Object f15669a;

        /* renamed from: b  reason: collision with root package name */
        private Method f15670b;

        public a(Object obj, String str) {
            this.f15669a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f15670b = cls.getMethod(str, f15668c);
            } catch (Exception e10) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e10);
                throw inflateException;
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f15670b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f15670b.invoke(this.f15669a, new Object[]{menuItem})).booleanValue();
                }
                this.f15670b.invoke(this.f15669a, new Object[]{menuItem});
                return true;
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    private class b {

        /* renamed from: A  reason: collision with root package name */
        C4599b f15671A;

        /* renamed from: B  reason: collision with root package name */
        private CharSequence f15672B;

        /* renamed from: C  reason: collision with root package name */
        private CharSequence f15673C;

        /* renamed from: D  reason: collision with root package name */
        private ColorStateList f15674D = null;

        /* renamed from: E  reason: collision with root package name */
        private PorterDuff.Mode f15675E = null;

        /* renamed from: a  reason: collision with root package name */
        private Menu f15677a;

        /* renamed from: b  reason: collision with root package name */
        private int f15678b;

        /* renamed from: c  reason: collision with root package name */
        private int f15679c;

        /* renamed from: d  reason: collision with root package name */
        private int f15680d;

        /* renamed from: e  reason: collision with root package name */
        private int f15681e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f15682f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f15683g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f15684h;

        /* renamed from: i  reason: collision with root package name */
        private int f15685i;

        /* renamed from: j  reason: collision with root package name */
        private int f15686j;

        /* renamed from: k  reason: collision with root package name */
        private CharSequence f15687k;

        /* renamed from: l  reason: collision with root package name */
        private CharSequence f15688l;

        /* renamed from: m  reason: collision with root package name */
        private int f15689m;

        /* renamed from: n  reason: collision with root package name */
        private char f15690n;

        /* renamed from: o  reason: collision with root package name */
        private int f15691o;

        /* renamed from: p  reason: collision with root package name */
        private char f15692p;

        /* renamed from: q  reason: collision with root package name */
        private int f15693q;

        /* renamed from: r  reason: collision with root package name */
        private int f15694r;

        /* renamed from: s  reason: collision with root package name */
        private boolean f15695s;

        /* renamed from: t  reason: collision with root package name */
        private boolean f15696t;

        /* renamed from: u  reason: collision with root package name */
        private boolean f15697u;

        /* renamed from: v  reason: collision with root package name */
        private int f15698v;

        /* renamed from: w  reason: collision with root package name */
        private int f15699w;

        /* renamed from: x  reason: collision with root package name */
        private String f15700x;

        /* renamed from: y  reason: collision with root package name */
        private String f15701y;

        /* renamed from: z  reason: collision with root package name */
        private String f15702z;

        public b(Menu menu) {
            this.f15677a = menu;
            h();
        }

        private char c(String str) {
            if (str == null) {
                return 0;
            }
            return str.charAt(0);
        }

        private <T> T e(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.f15666c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e10) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e10);
                return null;
            }
        }

        private void i(MenuItem menuItem) {
            boolean z10 = false;
            menuItem.setChecked(this.f15695s).setVisible(this.f15696t).setEnabled(this.f15697u).setCheckable(this.f15694r >= 1).setTitleCondensed(this.f15688l).setIcon(this.f15689m);
            int i10 = this.f15698v;
            if (i10 >= 0) {
                menuItem.setShowAsAction(i10);
            }
            if (this.f15702z != null) {
                if (!g.this.f15666c.isRestricted()) {
                    menuItem.setOnMenuItemClickListener(new a(g.this.b(), this.f15702z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.f15694r >= 2) {
                if (menuItem instanceof h) {
                    ((h) menuItem).t(true);
                } else if (menuItem instanceof MenuItemWrapperICS) {
                    ((MenuItemWrapperICS) menuItem).h(true);
                }
            }
            String str = this.f15700x;
            if (str != null) {
                menuItem.setActionView((View) e(str, g.f15662e, g.this.f15664a));
                z10 = true;
            }
            int i11 = this.f15699w;
            if (i11 > 0) {
                if (!z10) {
                    menuItem.setActionView(i11);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            C4599b bVar = this.f15671A;
            if (bVar != null) {
                A.a(menuItem, bVar);
            }
            A.c(menuItem, this.f15672B);
            A.g(menuItem, this.f15673C);
            A.b(menuItem, this.f15690n, this.f15691o);
            A.f(menuItem, this.f15692p, this.f15693q);
            PorterDuff.Mode mode = this.f15675E;
            if (mode != null) {
                A.e(menuItem, mode);
            }
            ColorStateList colorStateList = this.f15674D;
            if (colorStateList != null) {
                A.d(menuItem, colorStateList);
            }
        }

        public void a() {
            this.f15684h = true;
            i(this.f15677a.add(this.f15678b, this.f15685i, this.f15686j, this.f15687k));
        }

        public SubMenu b() {
            this.f15684h = true;
            SubMenu addSubMenu = this.f15677a.addSubMenu(this.f15678b, this.f15685i, this.f15686j, this.f15687k);
            i(addSubMenu.getItem());
            return addSubMenu;
        }

        public boolean d() {
            return this.f15684h;
        }

        public void f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = g.this.f15666c.obtainStyledAttributes(attributeSet, C5430j.f24217o1);
            this.f15678b = obtainStyledAttributes.getResourceId(C5430j.f24227q1, 0);
            this.f15679c = obtainStyledAttributes.getInt(C5430j.f24237s1, 0);
            this.f15680d = obtainStyledAttributes.getInt(C5430j.f24242t1, 0);
            this.f15681e = obtainStyledAttributes.getInt(C5430j.f24247u1, 0);
            this.f15682f = obtainStyledAttributes.getBoolean(C5430j.f24232r1, true);
            this.f15683g = obtainStyledAttributes.getBoolean(C5430j.f24222p1, true);
            obtainStyledAttributes.recycle();
        }

        public void g(AttributeSet attributeSet) {
            M u10 = M.u(g.this.f15666c, attributeSet, C5430j.f24252v1);
            this.f15685i = u10.n(C5430j.f24267y1, 0);
            this.f15686j = (u10.k(C5430j.f24047B1, this.f15679c) & -65536) | (u10.k(C5430j.f24051C1, this.f15680d) & 65535);
            this.f15687k = u10.p(C5430j.f24055D1);
            this.f15688l = u10.p(C5430j.f24059E1);
            this.f15689m = u10.n(C5430j.f24257w1, 0);
            this.f15690n = c(u10.o(C5430j.f24063F1));
            this.f15691o = u10.k(C5430j.f24091M1, RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT);
            this.f15692p = c(u10.o(C5430j.f24067G1));
            this.f15693q = u10.k(C5430j.f24107Q1, RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT);
            if (u10.s(C5430j.f24071H1)) {
                this.f15694r = u10.a(C5430j.f24071H1, false) ? 1 : 0;
            } else {
                this.f15694r = this.f15681e;
            }
            this.f15695s = u10.a(C5430j.f24272z1, false);
            this.f15696t = u10.a(C5430j.f24042A1, this.f15682f);
            this.f15697u = u10.a(C5430j.f24262x1, this.f15683g);
            this.f15698v = u10.k(C5430j.f24111R1, -1);
            this.f15702z = u10.o(C5430j.f24075I1);
            this.f15699w = u10.n(C5430j.f24079J1, 0);
            this.f15700x = u10.o(C5430j.f24087L1);
            String o10 = u10.o(C5430j.f24083K1);
            this.f15701y = o10;
            boolean z10 = o10 != null;
            if (z10 && this.f15699w == 0 && this.f15700x == null) {
                this.f15671A = (C4599b) e(o10, g.f15663f, g.this.f15665b);
            } else {
                if (z10) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f15671A = null;
            }
            this.f15672B = u10.p(C5430j.f24095N1);
            this.f15673C = u10.p(C5430j.f24115S1);
            if (u10.s(C5430j.f24103P1)) {
                this.f15675E = y.e(u10.k(C5430j.f24103P1, -1), this.f15675E);
            } else {
                this.f15675E = null;
            }
            if (u10.s(C5430j.f24099O1)) {
                this.f15674D = u10.c(C5430j.f24099O1);
            } else {
                this.f15674D = null;
            }
            u10.x();
            this.f15684h = false;
        }

        public void h() {
            this.f15678b = 0;
            this.f15679c = 0;
            this.f15680d = 0;
            this.f15681e = 0;
            this.f15682f = true;
            this.f15683g = true;
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f15662e = clsArr;
        f15663f = clsArr;
    }

    public g(Context context) {
        super(context);
        this.f15666c = context;
        Object[] objArr = {context};
        this.f15664a = objArr;
        this.f15665b = objArr;
    }

    private Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    private void c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType != 2) {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            } else {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
            }
        }
        boolean z10 = false;
        boolean z11 = false;
        String str = null;
        while (!z10) {
            if (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z11 && name2.equals(str)) {
                            z11 = false;
                            str = null;
                        } else if (name2.equals("group")) {
                            bVar.h();
                        } else if (name2.equals("item")) {
                            if (!bVar.d()) {
                                C4599b bVar2 = bVar.f15671A;
                                if (bVar2 == null || !bVar2.a()) {
                                    bVar.a();
                                } else {
                                    bVar.b();
                                }
                            }
                        } else if (name2.equals("menu")) {
                            z10 = true;
                        }
                    }
                } else if (!z11) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals("group")) {
                        bVar.f(attributeSet);
                    } else if (name3.equals("item")) {
                        bVar.g(attributeSet);
                    } else if (name3.equals("menu")) {
                        c(xmlPullParser, attributeSet, bVar.b());
                    } else {
                        str = name3;
                        z11 = true;
                    }
                }
                eventType = xmlPullParser.next();
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Object b() {
        if (this.f15667d == null) {
            this.f15667d = a(this.f15666c);
        }
        return this.f15667d;
    }

    public void inflate(int i10, Menu menu) {
        if (!(menu instanceof C6275a)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        boolean z10 = false;
        try {
            XmlResourceParser layout = this.f15666c.getResources().getLayout(i10);
            AttributeSet asAttributeSet = Xml.asAttributeSet(layout);
            if (menu instanceof f) {
                f fVar = (f) menu;
                if (fVar.H()) {
                    fVar.i0();
                    z10 = true;
                }
            }
            c(layout, asAttributeSet, menu);
            if (z10) {
                ((f) menu).h0();
            }
            if (layout != null) {
                layout.close();
            }
        } catch (XmlPullParserException e10) {
            throw new InflateException("Error inflating menu XML", e10);
        } catch (IOException e11) {
            throw new InflateException("Error inflating menu XML", e11);
        } catch (Throwable th2) {
            if (0 != 0) {
                ((f) menu).h0();
            }
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th2;
        }
    }
}
