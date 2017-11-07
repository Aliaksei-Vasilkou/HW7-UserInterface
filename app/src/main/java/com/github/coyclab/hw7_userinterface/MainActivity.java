package com.github.coyclab.hw7_userinterface;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView listView = (ListView) findViewById(R.id.list_view_posts);
        final PostAdapter postAdapter = new PostAdapter();
        listView.setAdapter(postAdapter);

    }

    class PostAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return 1;
        }

        @Override
        public Object getItem(int pI) {
            return null;
        }

        @Override
        public long getItemId(int pI) {
            return 0;
        }

        @Override
        public View getView(final int pI, View pView, final ViewGroup pViewGroup) {
            pView = getLayoutInflater().inflate(R.layout.post_content, null);

            return pView;
        }
    }
}
