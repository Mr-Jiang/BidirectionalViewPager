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

# Tips

If you think this project is helpful to you, please give me GitHub Start or Fork to support me to continue to provide better projects!

# LICENSE

   Copyright (c) 2018 Engineer-Jsp

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
