package org.kgmeng.sample;


import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.View;

import org.kgmeng.widget.SuperViewPager;

public class MainActivity extends FragmentActivity {

	SuperViewPager pager;
	int currentItem;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		pager = (SuperViewPager) findViewById(R.id.myViewPager1);
		//pager.setAdapter(new TestPagerAdapter(this));
		pager.setAdapter(new TestFragPagerAdapter(getSupportFragmentManager()));
		pager.setOnPageChangeListener(new OnPageChangeListener() {
			@Override
			public void onPageScrollStateChanged(int state) {
				switch(state){
				case 1: //正在滑动
					break;
				case 2: //滑动结束
					break;
				}
			}
			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {
			}

			@Override
			public void onPageSelected(int arg0) {
			}
			
		});
	}
	
	public void onClick(View view) {
		switch(view.getId()){
			case R.id.preBtnUp:
				pager.showPreUp();
				break;
			case R.id.preBtnLeft:
				pager.showPreLeft();
				break;
			case R.id.nextBtnDown:
				pager.showNextDown();
				break;
			case R.id.nextBtnRight:
				pager.showNextRight();
				break;
		}
	}
	
	
}
