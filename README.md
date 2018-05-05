# BidirectionalViewPager
BidirectionalViewPager is a viewpager that can slide in both directions.

# CSDN Blog URL
https://blog.csdn.net/jspping/article/details/80208394

# XML Usage
    <engineer.jsp.bidirectional.viewpager.BidirectionalViewPager
        android:id="@+id/bidirectional_viewpager"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        app:orientation="horizontal" >
    </engineer.jsp.bidirectional.viewpager.BidirectionalViewPager>
	
# Java Code Usage	
	BidirectionalViewPager mBidirectionalViewPager = new BidirectionalViewPager(this);
	
# The Listener Usage
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
		
# Horizontal slide effect
![image](https://github.com/Mr-Jiang/BidirectionalViewPager/blob/master/PreviewImg/BidirectionalViewPager-Horizontal.gif)

# Vertical slide effect
![image](https://github.com/Mr-Jiang/BidirectionalViewPager/blob/master/PreviewImg/BidirectionalViewPager-Vertical.gif)		

# Feedback URL
https://blog.csdn.net/jspping/article/details/80208394
		
