package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private boolean f20286a;

    /* renamed from: b  reason: collision with root package name */
    String f20287b;

    /* renamed from: c  reason: collision with root package name */
    private C0321a f20288c;

    /* renamed from: d  reason: collision with root package name */
    private int f20289d;

    /* renamed from: e  reason: collision with root package name */
    private float f20290e;

    /* renamed from: f  reason: collision with root package name */
    private String f20291f;

    /* renamed from: g  reason: collision with root package name */
    boolean f20292g;

    /* renamed from: h  reason: collision with root package name */
    private int f20293h;

    /* renamed from: androidx.constraintlayout.widget.a$a  reason: collision with other inner class name */
    public enum C0321a {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    public a(String str, C0321a aVar, Object obj, boolean z10) {
        this.f20287b = str;
        this.f20288c = aVar;
        this.f20286a = z10;
        f(obj);
    }

    public static HashMap<String, a> a(HashMap<String, a> hashMap, View view) {
        HashMap<String, a> hashMap2 = new HashMap<>();
        Class<?> cls = view.getClass();
        for (String next : hashMap.keySet()) {
            a aVar = hashMap.get(next);
            try {
                if (next.equals("BackgroundColor")) {
                    hashMap2.put(next, new a(aVar, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())));
                } else {
                    hashMap2.put(next, new a(aVar, cls.getMethod("getMap" + next, (Class[]) null).invoke(view, (Object[]) null)));
                }
            } catch (NoSuchMethodException e10) {
                Log.e("TransitionLayout", cls.getName() + " must have a method " + next, e10);
            } catch (IllegalAccessException e11) {
                Log.e("TransitionLayout", " Custom Attribute \"" + next + "\" not found on " + cls.getName(), e11);
            } catch (InvocationTargetException e12) {
                Log.e("TransitionLayout", " Custom Attribute \"" + next + "\" not found on " + cls.getName(), e12);
            }
        }
        return hashMap2;
    }

    public static void d(Context context, XmlPullParser xmlPullParser, HashMap<String, a> hashMap) {
        C0321a aVar;
        Object valueOf;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), f.f20492F4);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        C0321a aVar2 = null;
        boolean z10 = false;
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            if (index == f.f20500G4) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == f.f20580Q4) {
                str = obtainStyledAttributes.getString(index);
                z10 = true;
            } else if (index == f.f20508H4) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                aVar2 = C0321a.BOOLEAN_TYPE;
            } else {
                if (index == f.f20524J4) {
                    aVar = C0321a.COLOR_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == f.f20516I4) {
                    aVar = C0321a.COLOR_DRAWABLE_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == f.f20556N4) {
                    aVar = C0321a.DIMENSION_TYPE;
                    valueOf = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == f.f20532K4) {
                    aVar = C0321a.DIMENSION_TYPE;
                    valueOf = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == f.f20540L4) {
                    aVar = C0321a.FLOAT_TYPE;
                    valueOf = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == f.f20548M4) {
                    aVar = C0321a.INT_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                } else if (index == f.f20572P4) {
                    aVar = C0321a.STRING_TYPE;
                    valueOf = obtainStyledAttributes.getString(index);
                } else if (index == f.f20564O4) {
                    aVar = C0321a.REFERENCE_TYPE;
                    int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = obtainStyledAttributes.getInt(index, -1);
                    }
                    valueOf = Integer.valueOf(resourceId);
                }
                Object obj2 = valueOf;
                aVar2 = aVar;
                obj = obj2;
            }
        }
        if (!(str == null || obj == null)) {
            hashMap.put(str, new a(str, aVar2, obj, z10));
        }
        obtainStyledAttributes.recycle();
    }

    public static void e(View view, HashMap<String, a> hashMap) {
        String str;
        Class<?> cls = view.getClass();
        for (String next : hashMap.keySet()) {
            a aVar = hashMap.get(next);
            if (!aVar.f20286a) {
                str = "set" + next;
            } else {
                str = next;
            }
            try {
                switch (aVar.f20288c.ordinal()) {
                    case 0:
                        cls.getMethod(str, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(aVar.f20289d)});
                        break;
                    case 1:
                        cls.getMethod(str, new Class[]{Float.TYPE}).invoke(view, new Object[]{Float.valueOf(aVar.f20290e)});
                        break;
                    case 2:
                        cls.getMethod(str, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(aVar.f20293h)});
                        break;
                    case 3:
                        Method method = cls.getMethod(str, new Class[]{Drawable.class});
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(aVar.f20293h);
                        method.invoke(view, new Object[]{colorDrawable});
                        break;
                    case 4:
                        cls.getMethod(str, new Class[]{CharSequence.class}).invoke(view, new Object[]{aVar.f20291f});
                        break;
                    case 5:
                        cls.getMethod(str, new Class[]{Boolean.TYPE}).invoke(view, new Object[]{Boolean.valueOf(aVar.f20292g)});
                        break;
                    case 6:
                        cls.getMethod(str, new Class[]{Float.TYPE}).invoke(view, new Object[]{Float.valueOf(aVar.f20290e)});
                        break;
                    case 7:
                        cls.getMethod(str, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(aVar.f20289d)});
                        break;
                }
            } catch (NoSuchMethodException e10) {
                Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e10);
            } catch (IllegalAccessException e11) {
                Log.e("TransitionLayout", " Custom Attribute \"" + next + "\" not found on " + cls.getName(), e11);
            } catch (InvocationTargetException e12) {
                Log.e("TransitionLayout", " Custom Attribute \"" + next + "\" not found on " + cls.getName(), e12);
            }
        }
    }

    public String b() {
        return this.f20287b;
    }

    public C0321a c() {
        return this.f20288c;
    }

    public void f(Object obj) {
        switch (this.f20288c.ordinal()) {
            case 0:
            case 7:
                this.f20289d = ((Integer) obj).intValue();
                return;
            case 1:
                this.f20290e = ((Float) obj).floatValue();
                return;
            case 2:
            case 3:
                this.f20293h = ((Integer) obj).intValue();
                return;
            case 4:
                this.f20291f = (String) obj;
                return;
            case 5:
                this.f20292g = ((Boolean) obj).booleanValue();
                return;
            case 6:
                this.f20290e = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }

    public a(a aVar, Object obj) {
        this.f20286a = false;
        this.f20287b = aVar.f20287b;
        this.f20288c = aVar.f20288c;
        f(obj);
    }
}
