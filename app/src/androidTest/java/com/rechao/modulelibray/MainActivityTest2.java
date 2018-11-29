package com.rechao.modulelibray;

import android.content.Context;
import android.content.Intent;
import android.test.ActivityInstrumentationTestCase2;
import android.test.ActivityUnitTestCase;
import android.widget.TextView;

/**
 * Created by 王鹏程 on 2018/11/29.
 * 类(MainActivityTest2)解释:
 */

public class MainActivityTest2 extends ActivityInstrumentationTestCase2<MainActivity> {
    private Context ctr;

    public MainActivityTest2() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        ctr=getActivity().getApplicationContext();
    }
//    public void testStart(){
//        Intent intent=new Intent(ctr,LoadingActivity.class);
//        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//        ctr.startActivity(intent);
//    }
    public void testText(){
        TextView textView=getActivity().findViewById(R.id.textView2);
        assertEquals("测试测试测",textView.getText());
    }
}
