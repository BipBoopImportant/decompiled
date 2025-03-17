package com.oppwa.mobile.connect.checkout.dialog;

import X4.a;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

public abstract class BaseRecyclerViewAdapter<T, S extends a> extends RecyclerView.h<ViewHolder<S>> {

    /* renamed from: a  reason: collision with root package name */
    protected final T[] f120831a;

    /* renamed from: b  reason: collision with root package name */
    private final OnItemSelectedListener<T> f120832b;

    @FunctionalInterface
    public interface OnItemSelectedListener<T> {
        void onItemSelected(T t10);
    }

    public static class ViewHolder<T extends X4.a> extends RecyclerView.G {

        /* renamed from: a  reason: collision with root package name */
        private final T f120833a;

        @FunctionalInterface
        interface a {
            void a(int i10);
        }

        public ViewHolder(T t10, a aVar) {
            super(t10.getRoot());
            this.f120833a = t10;
            t10.getRoot().setOnClickListener(new C14102r0(this, aVar));
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(a aVar, View view) {
            int absoluteAdapterPosition = getAbsoluteAdapterPosition();
            if (absoluteAdapterPosition != -1) {
                aVar.a(absoluteAdapterPosition);
            }
        }

        public T getBinding() {
            return this.f120833a;
        }
    }

    public BaseRecyclerViewAdapter(T[] tArr, OnItemSelectedListener<T> onItemSelectedListener) {
        this.f120831a = tArr;
        this.f120832b = onItemSelectedListener;
    }

    /* access modifiers changed from: private */
    public void a(int i10) {
        if (i10 >= 0 && i10 < getItemCount()) {
            this.f120832b.onItemSelected(this.f120831a[i10]);
        }
    }

    /* access modifiers changed from: protected */
    public abstract S a(ViewGroup viewGroup);

    public int getItemCount() {
        return this.f120831a.length;
    }

    public ViewHolder<S> onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new ViewHolder<>(a(viewGroup), new C14100q0(this));
    }
}
