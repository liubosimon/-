package cn.edu.pku.ss.zhangqx.a2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

/**
 * Created by kk on 2017/10/18.
 */

public class SelectCity extends Activity implements View.OnClickListener {
    private ImageView mBackBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.select_city);
        initViews();
        listView = (ListView) findViewById(R.id.listView);

        mBackBtn=(ImageView) findViewById(R.id.title_back);
        mBackBtn.setOnClickListener(this);
    }
    private void initViews(){
        mBackBtn =(ImageView) findViewById(R.id.title_back);
        mBackBtn.setOnClickListener(this);
        mList();
    }
    private String[] data={"第1组","第2组","第3组","第4组","第5组","第6组",
            "第7组","第8组","第9组","第10组","第11组","第12组","第13组",
            "第14组","第15组","第16组","第17组","第18组","第19组","第20组",
            "第21组","第22组"};
    
    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.title_back:
                Intent i = new Intent();
                i.putExtra("cityCode", "101160101");
                setResult(RESULT_OK, i);
                finish();
                break;
            default:
                break;
        }
    }
}


