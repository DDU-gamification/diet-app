package sukkertoppen.ddu.dietapp;

import androidx.viewpager.widget.PagerAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MpagerAdapter extends PagerAdapter {

    private int[] layouts;
    private LayoutInflater layoutinflater;
    private Context context;
    public MpagerAdapter(int [] layouts, Context context){
        this.layouts = layouts;
        this.context = context;
        layoutinflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }
    @Override
    public int getCount() {
        return layouts.length;
    }
    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View view = layoutinflater.inflate(layouts[position], container, false);
        container.addView(view);
        return view;
    }
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        View view =(View)object;
        container.removeView(view);
    }

}
