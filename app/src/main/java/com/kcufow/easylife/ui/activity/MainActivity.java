package com.kcufow.easylife.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.kcufow.easylife.R;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initData();

    }

    private void initData() {


        /*okhttp3.OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.connectTimeout(5, TimeUnit.SECONDS);*/


/*        Retrofit retrofit = new Retrofit.Builder()
                            .addConverterFactory(GsonConverterFactory.create())
                            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                            .baseUrl(Historyservice.API_HISTORY_V2)
                            .build();*/
/*        Historyservice apiservice = retrofit.create(Historyservice.class);
        Observable<HistoryV2> historyV2Observer = apiservice.fetchHistoryV2(AppConstant.KEY, "12/2");
        historyV2Observer.subscribeOn(Schedulers.io())
                         .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(new Subscriber<HistoryV2>() {
                            @Override
                            public void onCompleted() {
                                Log.i(TAG, "onCompleted: ");
                            }

                            @Override
                            public void onError(Throwable e) {
                                Log.e(TAG, "onError: "+e);
                            }

                            @Override
                            public void onNext(HistoryV2 historyV2) {
                                Log.i(TAG, "onNext: "+historyV2.getReason());
                                Log.i(TAG, "onNext: historyV2.getResult().size()"+historyV2.getResult().size());
                            }
                        });*/



    }
}
