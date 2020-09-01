package com.example.serviceproject;

import android.app.Service;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;

class BasicServiceClass extends Service {

    private static final String TAG = "ServiceClass";


    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        String currentThread = Thread.currentThread().getName();
        Log.d(TAG, "onCreate: " + currentThread);
        super.onCreate();
    }

    @Override
    public void onDestroy() {
        String currentThread = Thread.currentThread().getName();

        Log.d(TAG, "onDestroy: " + currentThread);
        super.onDestroy();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        String currentThread = Thread.currentThread().getName();


        AsyncTaskingClass asyncTaskingClass = new AsyncTaskingClass();


        asyncTaskingClass.execute(10000);

            /*
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } */

        Log.d(TAG, "onStartCommand: " + currentThread);
        return super.onStartCommand(intent, flags, startId);
    }

    class AsyncTaskingClass extends AsyncTask<Integer, Void, Void> {

        private static final String TAG = "AsyncTaskingClass";

        @Override
        protected void onPreExecute() {
            String currentThread = Thread.currentThread().getName();

            Log.d(TAG, "onPreExecute: " + currentThread);

            super.onPreExecute();
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            String currentThread = Thread.currentThread().getName();

            Log.d(TAG, "onPostExecute: " + currentThread);

            super.onPostExecute(aVoid);
        }

        @Override
        protected void onProgressUpdate(Void... values) {
            String currentThread = Thread.currentThread().getName();
            Log.d(TAG, "onProgressUpdate: " + currentThread);

            super.onProgressUpdate(values);
        }

        @Override
        protected Void doInBackground(Integer... integers) {
            String currentThread = Thread.currentThread().getName();

            Log.d(TAG, "doInBackground: " + currentThread);


            int sleepTime = integers[0];

                  /*
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } */

            return null;
        }
    }


}
