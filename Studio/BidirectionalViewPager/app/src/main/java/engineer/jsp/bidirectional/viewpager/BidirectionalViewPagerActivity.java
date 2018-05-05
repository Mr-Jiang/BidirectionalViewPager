package engineer.jsp.bidirectional.viewpager;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class BidirectionalViewPagerActivity extends AppCompatActivity {

	private BidirectionalViewPager mBidirectionalViewPager;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		mBidirectionalViewPager = (BidirectionalViewPager) findViewById(R.id.bidirectional_viewpager);
		mBidirectionalViewPager.setOnPageChangeListener(new BidirectionalViewPager.OnPageChangeListener() {

			@Override
			public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

			}

			@Override
			public void onPageSelected(int position) {

			}

			@Override
			public void onPageScrollStateChanged(int state) {

			}

		});

		List<RelativeLayout> Iist = new ArrayList<RelativeLayout>();
		int count = 0;
		while (true) {
			if (count >= 4) {
				break;
			}
			RelativeLayout layout = new RelativeLayout(this);
			TextView text = new TextView(this);
			text.setTextColor(0xff000000 | new Random().nextInt(0x00ffffff));
			ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
					ViewGroup.LayoutParams.MATCH_PARENT);
			text.setGravity(Gravity.CENTER);
			text.setText("This BidirectionalViewPager " + count);
			layout.setBackgroundColor(0xff000000 | new Random().nextInt(0x00ffffff));
			layout.addView(text, params);
			Iist.add(layout);
			count++;
		}
		ViewPagerAdapter adapter = new ViewPagerAdapter(Iist);
		mBidirectionalViewPager.setAdapter(adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();

		//noinspection SimplifiableIfStatement
		if (id == R.id.action_settings) {
			return true;
		}

		return super.onOptionsItemSelected(item);
	}

	public class ViewPagerAdapter extends PagerAdapter {

		List<RelativeLayout> Iist = new ArrayList<RelativeLayout>();

		public ViewPagerAdapter(List<RelativeLayout> Iist) {
			this.Iist = Iist;
		}

		@Override
		public int getCount() {
			return Iist.size();
		}

		@Override
		public boolean isViewFromObject(View paramView, Object paramObject) {
			return paramView == paramObject;
		}

		@Override
		public void destroyItem(ViewGroup paramViewGroup, int paramInt, Object paramObject) {
			paramViewGroup.removeView((View) Iist.get(paramInt));
		}

		@Override
		public int getItemPosition(Object paramObject) {
			return super.getItemPosition(paramObject);
		}

		@Override
		public Object instantiateItem(ViewGroup paramViewGroup, int paramInt) {
			paramViewGroup.addView((View) Iist.get(paramInt));
			return Iist.get(paramInt);
		}
	}
}