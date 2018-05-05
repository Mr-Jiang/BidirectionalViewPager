package engineer.jsp.bidirectional.viewpager;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import engineer.jsp.bidirectional.viewpager.BidirectionalViewPager.OnPageChangeListener;

public class BidirectionalViewPagerActivity extends Activity {

	private BidirectionalViewPager mBidirectionalViewPager;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mBidirectionalViewPager = (BidirectionalViewPager) findViewById(R.id.bidirectional_viewpager);

		// mBidirectionalViewPager = new BidirectionalViewPager(this);

		mBidirectionalViewPager.setOnPageChangeListener(new OnPageChangeListener() {

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

		// setContentView(mBidirectionalViewPager);
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