package com.suns.mobile.toolslibrary;

import android.content.Context;
import android.widget.Toast;

public class LibraryTest {
    Context context;
    public LibraryTest(Context context){
        this.context=context;
    }

    public void show(){
        Toast.makeText(context, "成都欢迎您！", Toast.LENGTH_SHORT).show();
    }
}
