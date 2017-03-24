package com.dynamicvision.victorcortez.barkdetector.push;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MessagingService extends FirebaseMessagingService {
    private static final String TAG = MessagingService.class.getSimpleName();

    public MessagingService() {
    }

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        if(remoteMessage.getData() == null || remoteMessage.getData().isEmpty()) {
            Log.wtf(TAG,"Received Push without data!");
            return;
        }

        Log.i(TAG, "Received command: " + remoteMessage.getData().toString());

    }
}
