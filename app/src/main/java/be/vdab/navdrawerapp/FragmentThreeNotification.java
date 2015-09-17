package be.vdab.navdrawerapp;

import android.app.Fragment;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.NotificationCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class FragmentThreeNotification extends Fragment{


    public FragmentThreeNotification() {
    }

    public static FragmentThreeNotification createNewFragmentThreeNotification(){
        return new FragmentThreeNotification();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_three_notific, container, false);

        Button btn = (Button) view.findViewById(R.id.notification);

        final NotificationCompat.Builder mBuilder =
                new NotificationCompat.Builder(getActivity().getApplicationContext())
                        .setSmallIcon(R.drawable.camera)
                        .setContentTitle("My notification")
                        .setContentText("Hello World!");

        Uri url = Uri.parse(getResources().getString(R.string.wiki_url));
        Intent resultIntent = new Intent(Intent.ACTION_VIEW, url);
        PendingIntent resultPendingIntent =
                PendingIntent.getActivity(
                        getActivity().getApplicationContext(),
                        0,
                        resultIntent,
                        PendingIntent.FLAG_UPDATE_CURRENT
                );
        mBuilder.setAutoCancel(true); // Zorgt dat het verdwijnt na clicken
        mBuilder.setContentIntent(resultPendingIntent);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Sets an ID for the notification
                int mNotificationId = 001;
                // Gets an instance of the NotificationManager service
                NotificationManager mNotifyMgr =
                        (NotificationManager) getActivity().getSystemService(Context.NOTIFICATION_SERVICE);
                // Builds the notification and issues it.
                mNotifyMgr.notify(mNotificationId, mBuilder.build());
            }
        });

        return view;
    }
}
