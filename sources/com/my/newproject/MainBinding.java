package com.my.newproject;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public final class MainBinding {
    public final EditText edittext1;
    public final ImageView imageview1;
    public final LinearLayout rootView;
    public final TextView textview2;
    public final TextView textview3;
    public final TextView textview4;

    private MainBinding(LinearLayout linearLayout, TextView textView, TextView textView2, EditText editText, TextView textView3, ImageView imageView) {
        this.rootView = linearLayout;
        this.textview3 = textView;
        this.textview4 = textView2;
        this.edittext1 = editText;
        this.textview2 = textView3;
        this.imageview1 = imageView;
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static MainBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static MainBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.main, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static MainBinding bind(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        TextView textView = (TextView) findChildViewById(view, R.id.textview3);
        TextView textView2 = (TextView) findChildViewById(view, R.id.textview4);
        EditText editText = (EditText) findChildViewById(view, R.id.edittext1);
        TextView textView3 = (TextView) findChildViewById(view, R.id.textview2);
        ImageView imageView = (ImageView) findChildViewById(view, R.id.imageview1);
        if (textView == null || textView2 == null || editText == null || textView3 == null || imageView == null) {
            throw new IllegalStateException("Required views are missing");
        }
        return new MainBinding(linearLayout, textView, textView2, editText, textView3, imageView);
    }

    private static <T extends View> T findChildViewById(View view, int i) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                T t = (T) viewGroup.getChildAt(i2).findViewById(i);
                if (t != null) {
                    return t;
                }
            }
        }
        return null;
    }
}
