### Loadinglib succeeded, failed, no network state value switched

+ example

xml布局文件中
```
<android.support.constraint.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <com.whz.loading.lib.LoadingLayout
        android:id="@+id/act_loading_loadinglayout"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        app:isFirstVisible='false'>

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:orientation="vertical">

            <TextView
                android:id="@+id/textview1"
                android:layout_width="match_parent"
                android:layout_height="40dp"
                android:gravity="center"
                android:text="LoadingActivity"
                app:layout_constraintLeft_toLeftOf="parent"
                app:layout_constraintRight_toRightOf="parent" />
        </LinearLayout>
    </com.whz.loading.lib.LoadingLayout>

</android.support.constraint.ConstraintLayout>
```
activity页面中

```
  loadingLayout.setStatus(LoadingLayout.Loading);
        loadingLayout.setOnReloadListener(new LoadingLayout.OnReloadListener() {
            @Override
            public void onReload(View v) {
                loadingLayout.setStatus(LoadingLayout.Success);
            }
        });
```
